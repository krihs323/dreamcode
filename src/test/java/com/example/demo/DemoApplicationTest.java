package com.example.demo;

import com.example.demo.category.Category1;
import com.example.demo.category.Category2;
import com.example.demo.category.Category3;
import com.example.demo.service.ServiceDemo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

class DemoApplicationTest {

     List<Category1> categories = new ArrayList<>();
      List<Category2> subcategories= new ArrayList<>();
      List<Category3> subcategories3 = new ArrayList<>();


    @InjectMocks
    private ServiceDemo demo;

    @BeforeEach
    void setUp() {

        MockitoAnnotations.initMocks(this);

        //Data structure for category 1
        categories.add(new Category1("Furniture", "furnyture", 1));
        categories.add(new Category1("Electronics", "electronics", 2));
        categories.add(new Category1("Home Appliances", "home appliances", 3));

        //Data structure for category 2
        subcategories.add(new Category2("Major Appliances", "major appliances", 3, 1));
        subcategories.add(new Category2("Minor Appliances", "minor appliances", 3, 2));
        subcategories.add(new Category2("Lawn & Garden", "Lawn Garden GardeningTools", 3, 3));

        //Data structure for category 3
        subcategories3.add(new Category3("Kitchen Appliances", "kiche appliances food", 1, 1));
        subcategories3.add(new Category3("General Appliances", "genearal appliances ring", 1, 2));
    }

    @Test
    void testGetKeyWordsCategory1() {
        assertEquals("home appliances", demo.getKeyWordsCategory1(categories, "Home Appliances"));
    }

    @Test
    void testGetKeyWordsCategory1NoData() {
        assertEquals("no data found", demo.getKeyWordsCategory1(categories, "Home 123"));
    }

    @Test
    void testGetKeyWordsCategory2() {
        assertEquals("Lawn Garden GardeningTools", demo.getKeyWordsCategory2(subcategories, "Lawn & Garden"));
    }

    @Test
    void testGetKeyWordsCategory2NoData() {
        assertEquals("no data found", demo.getKeyWordsCategory2(subcategories, "Lawn & GardenXS"));
    }

    @Test
    void testGetKeyWordsCategory3() {
        assertEquals("genearal appliances ring", demo.getKeyWordsCategory3(subcategories3, "General Appliances"));
    }

    @Test
    void testGetKeyWordsCategory3NoData() {
        assertEquals("no data found", demo.getKeyWordsCategory3(subcategories3, "Major AppliancesXX"));
    }

}