package com.example.demo.service;

import com.example.demo.Category.Category1;
import com.example.demo.Category.Category2;
import com.example.demo.Category.Category3;
import org.springframework.stereotype.Service;

import java.util.List;



public class ServiceDemo {

    public  void getKeyWordsCategory1(List<Category1> categories, String category){
        categories.stream()
                .filter(category1 ->  category1.getName().contains(category))
                .map(category1 -> category1.getKeyWord())
                .findFirst()
                .ifPresentOrElse(s -> System.out.println(s), ()->System.out.println("no data"));
    }

    public  void getKeyWordsCategory2(List<Category2> categories, String category){
        categories.stream()
                .filter(category2 ->  category2.getName().contains(category))
                .map(category2 -> category2.getKeyWord())
                .findFirst()
                .ifPresentOrElse(s -> System.out.println(s), ()->System.out.println("no data for subcategories 2"));
    }

    public  void getKeyWordsCategory3(List<Category3> categories, String category){
        categories.stream()
                .filter(category3 ->  category3.getName().contains(category))
                .map(category3 -> category3.getKeyWord())
                .findFirst()
                .ifPresentOrElse(s -> System.out.println(s), ()->System.out.println("no data for subcategories 3"));
    }

}
