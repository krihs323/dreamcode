package com.example.demo.service;

import com.example.demo.category.Category1;
import com.example.demo.category.Category2;
import com.example.demo.category.Category3;
import java.util.List;
import java.util.Optional;


public class ServiceDemo {

    public String getKeyWordsCategory1(List<Category1> categories, String category){
        Optional<String> category1Return = null;
        category1Return =  categories.stream()
                .filter(category1 ->  category1.getName().contains(category))
                .map(category1 -> category1.getKeyWord())
                .findFirst();
        if (category1Return.isPresent()){
            return category1Return.get();
        } else {
            return "no data found";
        }
    }

    public String getKeyWordsCategory2(List<Category2> categories, String category){
        Optional<String> category2Return = null;
        category2Return = categories.stream()
                .filter(category2 ->  category2.getName().contains(category))
                .map(category2 -> category2.getKeyWord())
                .findFirst();

        if (category2Return.isPresent()){
            return category2Return.get();
        } else {
            return "no data found";
        }
    }

    public String getKeyWordsCategory3(List<Category3> categories, String category){
        Optional<String> category3Return = null;
        category3Return = categories.stream()
                .filter(category3 ->  category3.getName().contains(category))
                .map(category3 -> category3.getKeyWord())
                .findFirst();

        if (category3Return.isPresent()){
            return category3Return.get();
        } else {
            return "no data found";
        }
    }

}
