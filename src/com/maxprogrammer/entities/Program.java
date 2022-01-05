package com.maxprogrammer.entities;

import java.sql.SQLOutput;
import java.util.Map;
import java.util.TreeMap;

public class Program {

    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("userName", "Maria");
        cookies.put("email","maria@gmail.com");
        cookies.put("phone","991402356");

        System.out.println("ALL COOKIES: ");
        for(String key: cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }

        System.out.println("----------------");
        cookies.remove("email");
        System.out.println("REMOVED EMAIL FROM COOKIES: ");
        for(String key: cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }

        System.out.println("----------------");
        cookies.put("phone","991609223");
        System.out.println("UPDATED PHONE FROM  COOKIES: ");
        for(String key: cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }

        System.out.println("----------------");
        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));

        System.out.println("----------------");
        System.out.println("Phone number: " + cookies.get("phone"));

        System.out.println("----------------");
        System.out.println("Email: " + cookies.containsKey("email"));

        System.out.println("----------------");
        System.out.println("Size: " + cookies.size());



    }
}
