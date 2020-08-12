package cn.csq.domain;

import java.io.Serializable;

/**
 * @author csq
 * @date 2020/8/8 14:13
 */
public class Commodity implements Serializable {
    private static final long SERIALIZABLEID =1234132L;
    private String name;
    private int price;

    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Commodity() {
    }

    public Commodity(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
