package com.example.demo.category;

import lombok.Data;

@Data
public class Category2 {

    String name;
    String keyWord;
    int idCategory1;
    int id;

    public Category2(String name, String keyWord, int idCategory1, int id) {
        this.name = name;
        this.keyWord = keyWord;
        this.idCategory1 = idCategory1;
        this.id = id;



    }
}
