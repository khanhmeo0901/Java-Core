package com.example.learnjavacore.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
/*
    - Set là 1 Collection không chứa những giá trị trùng nhau.
    + HashSet và LinkedHashSet được sử dụng để triển khai Set
 */
public class SetCollection {
    public static void main(String[] args) {
        /*
            -HashSet không đảm bảo thứ tự các phần tử đầu vào
         */
        Set<Integer> list = new HashSet<>();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(3);
        System.out.println(list);
        // KQ : 1 2 3
        /*
            -LinkedHashSet đảm bảo thứ tự đầu vào các phần từ
         */
        Set<Integer> list2 = new LinkedHashSet<>();
        list2.add(2);
        list2.add(2);
        list2.add(2);
        list2.add(1);
        list2.add(3);
        System.out.println(list2);
        //KQ : 2 1 3
    }
}
