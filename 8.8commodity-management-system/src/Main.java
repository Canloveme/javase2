import cn.csq.domain.Commodity;
import cn.csq.service.impl.CommodityServiceImpl;
import cn.csq.service.impl.UserServiceImpl;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 * @author csq
 * @date 2020/8/8 14:10
 */
public class Main {

    private  static Scanner scanner = new Scanner(System.in);
    private static CommodityServiceImpl commodityService;

    static {
        try {
            commodityService = new CommodityServiceImpl();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private  static UserServiceImpl userService = new UserServiceImpl();

    public static void main(String[] args) {

        while (true) {
            System.out.println("----------------欢迎访问购物ITHEIMA购物商城");
            System.out.println("1. 登录");
            System.out.println("2. 注册");
            System.out.println("3. 退出");
            System.out.println();
            System.out.println(" 请输入你的选择：");
            String inputString = scanner.nextLine();
            switch (inputString) {
                case "1":
                    try {
                        boolean login = login();
                        if (login) {
                            commodityMethod();
                        }else {
                            System.out.println("用户名密码不正确");
                            break;
                        }
                    }
                    catch (Exception e) {
                            System.out.println("用户不存在");
                            break;
                    }
                case "2":
                    register();
                    break;
                case "3":
                    System.exit(0);

            }
        }
    }

    private static void commodityMethod() throws IOException, ClassNotFoundException {
        while (true) {
            System.out.println("----------------商品管理模块-------------");
            System.out.println("1. 添加商品");
            System.out.println("2. 查询商品");
            System.out.println("3. 退出");
            System.out.println();
            System.out.println(" 请输入你的选择：");
            Scanner scanner1 = new Scanner(System.in);
            String string = scanner1.nextLine();
            switch (string) {
                case "1":
                    boolean result = addCommodity();
                    if (result) {
                        System.out.println("添加成功");
                    } else {
                        System.out.println("出现未知错误");
                    }
                    break;
                case "2":
                    List<Commodity> all = findALL();
                    if (all.size() == 0) {
                        System.out.println("没有商品");
                    }else {
                        System.out.println("商品名称      商品价格");
                        for (Commodity commodity : all) {
                            System.out.println(commodity.getName() + "      " + commodity.getPrice());
                        }
                    }
                    break;
                case "3":
                    System.out.println("谢谢使用，欢迎下次光临");
                    System.exit(0);
            }
        }
    }

    private static List<Commodity> findALL() throws IOException, ClassNotFoundException {
        return commodityService.findAll();
    }

    private static boolean addCommodity() throws IOException {
        System.out.println("请输入商品名称：");
        String name = scanner.nextLine();
        System.out.println("请输入商品价格：");
        String price = scanner.nextLine();
        return commodityService.add(new Commodity(name, Integer.parseInt(price)));
    }

    private static void register() {
        System.out.println("请输入用户名：");
        String username = scanner.nextLine();
        System.out.println("请输入密码：");
        String password = scanner.nextLine();
        boolean result = userService.register(username, password);
        if (result) {
            System.out.println("用户注册成功");
        }else {
            System.out.println("用户名已经存在了，请重新输入");
        }
    }

    private static boolean login() throws NullPointerException{
        System.out.println("请输入用户名：");
        String username = scanner.nextLine();
        System.out.println("请输入密码：");
        String password = scanner.nextLine();
        return userService.login(username, password);
    }

}
