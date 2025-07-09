package com.codeit.practice1.run;

import com.codeit.practice1.model.Product;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setpName("아이폰 12pro");
        product1.setBrand("애플");
        product1.setPrice(250000);

        System.out.println(product1);
    }
}
