package cn.csq.homework.map;

import java.util.*;

/**
 * @author csq
 * @date 2020/7/31 20:16
 */
public class Ex03 {
    public static void main(String[] args) {
        /**
         * 请使用Map集合存储自定义数据类型Car做键，对应的价格做值。
         * 并使用keySet和entrySet两种方式遍历Map集合。
         */
        HashMap<Car, Double> map = new HashMap<>();
        Car car1 = new Car("宝马", 12345);
        Car car2 = new Car("奥迪", 54321);
        map.put(car1, car1.getPrice());
        map.put(car2, car2.getPrice());
        //1
        Set<Car> keySet = map.keySet();
        for (Car car : keySet) {
            System.out.println(car+" "+ map.get(car));
        }
        System.out.println("===");
        //2
        Set<Map.Entry<Car, Double>> entrySet = map.entrySet();
        for (Map.Entry<Car, Double> carDoubleEntry : entrySet) {
            System.out.println(carDoubleEntry.getKey()+" "+carDoubleEntry.getValue());
        }
        //entrySet.forEach((Car c,Double price) -> System.out.println(c+""+price));

        HashSet<Object> objects = new HashSet<>();
        objects.add("22");
        objects.add("33");
        objects.add("44");
        objects.forEach(s-> System.out.println(s));


        ArrayList<String> strings = new ArrayList<>();
        strings.add("aaa");
        strings.add("aaa");
        strings.add("aaa");
        strings.add("aaa");
        strings.forEach(a -> System.out.println(a));

    }
}

class Car{
    private String name;
    private double price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (Double.compare(car.getPrice(), getPrice()) != 0) return false;
        return getName() != null ? getName().equals(car.getName()) : car.getName() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getName() != null ? getName().hashCode() : 0;
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }
}