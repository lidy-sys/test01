package cn.com.test01;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ShoppingCart {
    private Map<Goods, Integer> map;

    public ShoppingCart() {
    }

    public ShoppingCart(Map<Goods, Integer> map) {
        this.map = map;
    }


    public void add(Goods e) {
        add(e, 1);
    }

    public void add(Goods e, Integer num) {
        map.put(e, num);
    }


    public void remove(Goods e) {
        remove(e, 1);
    }

    public void remove(Goods e, Integer num) {
        Integer num2=map.get(e);
        map.put(e,num2-num);
       /* Set<Goods> set = map.keySet();
        Iterator<Goods> ite =set.iterator();
        while (ite.hasNext()) {
            Goods t = ite.next();
            if (t.equals(e)) {
                ite.remove();
            }
        }*/
    }

    public void clear(Goods e, Integer num) {
       map.clear();
        Set<Goods> set = map.keySet();
       /* Iterator<Goods> ite =set.iterator();
        while (ite.hasNext()) {
            Goods t = ite.next();
            if (t.equals(e)) {
                ite.remove();
            }
        }*/
    }


    public Map<Goods, Integer> getMap() {
        return map;
    }

    public void setMap(Map<Goods, Integer> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "map=" + map +
                '}';
    }
}
