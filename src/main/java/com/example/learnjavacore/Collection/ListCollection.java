package com.example.learnjavacore.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListCollection {
    /*
        - List là 1 collection có thứ tự (đôi khi còn là 1 chuỗi).
        + List có thể chứa các phần tử trùng lặp

     */
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(1);
        list1.add(2);
        list1.add(3);

        System.out.println(list1);

        List<Integer> list2 = new Vector<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        System.out.println(list2);

        List<Integer> list3 = new LinkedList<>();
        list3.addAll(list2);
        System.out.println(list3);
    }
}
