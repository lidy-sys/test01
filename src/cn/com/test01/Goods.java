package cn.com.test01;

import java.util.Objects;

public class  Goods {

    private Integer num;
    private double  price;
    private  String name;

    public Goods() {
    }

    public Goods(Integer num, double price, String name) {
        this.num = num;
        this.price = price;
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goods goods = (Goods) o;
        return Double.compare(goods.price, price) == 0 &&
                num.equals(goods.num) &&
                Objects.equals(name, goods.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, price, name);
    }

    @Override
    public String toString() {
        return "Goods{" +
                "num=" + num +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
