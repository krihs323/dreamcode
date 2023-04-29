package com.example.demo;

import com.example.demo.Category.Category1;
import com.example.demo.Category.Category2;
import com.example.demo.Category.Category3;
import com.example.demo.service.ServiceDemo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class DemoApplicationTest {

    private List<Category1> categories;
    private  List<Category2> subcategories;
    private  List<Category3> subcategories3;

    @InjectMocks
    ServiceDemo demo;

    @BeforeEach
    void setUp() {

        //Data structure for category 1
        List<Category1> categories = new ArrayList<>();
        //Category1 category = new Category1("Furniture", "furnyture", 1);
        categories.add(new Category1("Furniture", "furnyture", 1));
        categories.add(new Category1("Electronics", "electronics", 2));
        categories.add(new Category1("Home Appliances", "home appliances", 3));

        //Data structure for category 1
        List<Category2> subcategories = new ArrayList<>();
        subcategories.add(new Category2("Major Appliances", "major appliances", 3, 1));
        subcategories.add(new Category2("Minor Appliances", "minor appliances", 3, 2));
        subcategories.add(new Category2("Lawn & Garden", "Lawn Garden GardeningTools", 3, 3));

        //Data structure for category 2
        List<Category3> subcategories3 = new ArrayList<>();
        subcategories3.add(new Category3("Kitchen Appliances", "major appliances", 1, 1));
        subcategories3.add(new Category3("General Appliances", "minor appliances", 1, 2));

    }

    @Test
    void testGetKeyWordsCategory1() {
        //assertEquals("electronics", demo.getKeyWordsCategory1(categories, "123"));

    }

    @Test
    void testGetKeyWordsCategory2() {
    }

    @Test
    void testGetKeyWordsCategory3() {
    }
}