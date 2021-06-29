package DesignOrderedStream;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class OrderedStream {

    public static String arr[];
    public int pointer = 0;

    public OrderedStream(int n) {
        arr = new String[n];
        pointer = 0;
    }

    public List<String> insert(int idKey, String value) {
        List<String> res = new ArrayList<String>();

        arr[idKey - 1] = value;

        while (pointer < arr.length && arr[pointer] != null) {
            res.add(arr[pointer]);
            pointer++;
        }

        System.out.println(res.toString());

        return res;
    }

    public static void main(String[] args) {
        OrderedStream obj = new OrderedStream(5);
        obj.insert(3, "ccccc");
        obj.insert(1, "aaaaa");
        obj.insert(2, "bbbbb");
        obj.insert(5, "eeeee");
        obj.insert(4, "ddddd");

        System.out.println("-----------------");
        System.out.println(Arrays.asList(arr));
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n); List<String> param_1 =
 * obj.insert(idKey,value);
 */