package test3;

import java.util.List;

public class test3 {
    public static void main(String[] args) {
        List<String> list = List.of("1", "2", "3");
        for (String str : list) {
            if (str.equals(2)) {
                str = "22";
            }
        }
        System.out.println(list);
        Omno o1 = new Omno("2");

        List<Omno> list1 = List.of(new Omno("1"), o1, new Omno("3"));
        for (Omno str : list1) {
            if (str.equals(o1)) {
                str.setName("22");
            }
        }
        System.out.println(list1.get(1).getName());
    }
}

class Omno {
    public Omno(String name) {
        this.name = name;
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

