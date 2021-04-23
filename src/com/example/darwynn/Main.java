package com.example.darwynn;

import com.example.darwynn.DarwynnBox;
import com.example.darwynn.DarwynnItem;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        DarwynnItem item1 = new DarwynnItem(4,5,6);
        DarwynnItem item2 = new DarwynnItem(2, 2,2);

        DeliveryAPI deliveryAPI = new DeliveryAPI();
        DarwynnBox box = deliveryAPI.chooseBox(Arrays.asList(item1, item2));
        System.out.println(box);
    }
}
