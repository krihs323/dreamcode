package com.example.demo.Category;

import lombok.Data;

@Data
public class Category3 {

    String name;
    String keyWord;
    int idCategory2;
    int id;

    public Category3(String name, String keyWord, int idCategory2, int id) {
        this.name = name;
        this.keyWord = keyWord;
        this.idCategory2 = idCategory2;
        this.id = id;
    }
}
