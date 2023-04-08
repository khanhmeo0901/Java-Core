package com.example.learnjavacore.Wrapper;

import java.util.ArrayList;
import java.util.List;

public class Wrapper {

    /*
        - Wrapper trong java cung cấp cơ chế chuyển đổi kiểu dữ liệu nguyên thủy thành kiểu Object (đối tượng)
        và từ đối tượng thành kiểu nguyên thủy
     */
    public static void main(String[] args) {
        getList();
        System.out.println("-----------------");
        intToInteger();
        System.out.println("-----------------");
        IntegerToInt();
    }
    public static void getList()
    {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
    }
    /*
        Đổi kiểu int -> Integer
        Kiểu dữ liệu nguyên thủy -> Wrapper
     */
    public static void intToInteger()
    {
        int a = 20;
        Integer i = Integer.valueOf(a);
        Integer j = a; // autoboxing, tự động đổi int thành Integer trong nội bộ trình biên dịch
        System.out.println(i+"--------"+j);
    }
    /*
           Đổi kiểu Integer -> int
           Wrapper -> Kiểu dữ liệu nguyên thủy
     */
    public static void IntegerToInt()
    {
        Integer a =10;
        int i = a.intValue();
        int j = a; // unboxing, tự động đổi Integer thành int trong nội bộ trình biên dịch
        System.out.println(i + "----------" + j);
    }
}
