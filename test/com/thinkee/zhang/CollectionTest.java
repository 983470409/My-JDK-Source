package com.thinkee.zhang;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther: zhang_yx
 * @Date: 2021/4/6 21:45
 */
public class CollectionTest {

    @org.junit.Test
    public void forEach() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
    }
}