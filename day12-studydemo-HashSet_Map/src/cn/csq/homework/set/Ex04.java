package cn.csq.homework.set;

import java.util.HashSet;

/**
 * @author csq
 * @date 2020/7/31 21:34
 */
public class Ex04 {
    public static void main(String[] args) {
/**
 *         五、双色球规则：
 *         双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
 *         红色球号码从1—33中选择；蓝色球号码从1—16中选择；
 *         请随机生成一注双色球号码。（要求同色号码不重复）
 */
        HashSet<Integer> set=new HashSet<Integer>();
        //创建HashSet对象，定义成Integer类型
        for (int i = 0; i < 6; i++) {
            //for循环产生6个数
            int a= (int)(Math.random()*33+1);
            //产生随机数，赋值到a变量中，这里Math.random()产生的是double类型，要用int强转一下
            set.add(a);
            //把每次产生是的随机数放到集合中
        }
        for(Integer ch:set) {
            //定义一个int类型的变量ch，把集合中的元素遍历放到ch中，在循环打印出来
            System.out.println(ch+"号红色球");
        }
        int b= (int)(Math.random()*16+1);
        //随机产生一个蓝色球号码
        System.out.println(b+"号蓝色球");
    }
}
