package cn.csq.repository.impl;

import cn.csq.domain.Commodity;
import cn.csq.repository.CommodityRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author csq
 * @date 2020/8/8 14:31
 * 商品实现类
 */
public class CommodityRepositoryImpl implements CommodityRepository {

    private List<Commodity> commodityList = new ArrayList<Commodity>();

    private static  File file = new File("8.8commodity-management-system\\Commoditys.txt");


    private ObjectInputStream objectInputStream = null;
    private ObjectOutputStream objectOutputStream =null;

    public CommodityRepositoryImpl() throws IOException {
    }


    @Override
    public boolean add(Commodity commodity) throws IOException {
        boolean result = commodityList.add(commodity);
        outPutMethod(commodityList);
        return result;
    }

    @Override
    public List<Commodity> findAll() throws IOException, ClassNotFoundException {
        List<Commodity> commodities = inPutMethod();
        return commodities;
    }
    /**
     * 输入方法
     */
    public List<Commodity> inPutMethod() throws IOException, ClassNotFoundException {
        try {
            objectInputStream = new  ObjectInputStream(new FileInputStream(file));
        } catch (IOException e) {
            System.out.println("系统找不到指定的文件。");
        }
        return (ArrayList<Commodity>) objectInputStream.readObject();
    }


    /**
     * 输出方法
     */
    public void outPutMethod(List<Commodity> commodities) throws IOException {
           objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        try {
            objectOutputStream.writeObject(commodities);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            objectOutputStream.close();
        }
    }

    public void after() throws IOException {
        objectInputStream.close();
        objectOutputStream.close();
    }
}
