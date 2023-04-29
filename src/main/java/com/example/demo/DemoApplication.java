package com.example.demo;

import com.example.demo.Category.Category1;
import com.example.demo.Category.Category2;
import com.example.demo.Category.Category3;
import com.example.demo.service.ServiceDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//import static java.util.stream.Nodes.collect;

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);

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




		for (int i = 0; i < categories.size(); i++) {
			//System.out.println(categories.get(i).toString());
			//Category1 category = categories.get(i);
		}







		ServiceDemo service = new ServiceDemo();

		//service.getKeyWordsCategory1();

		//Metod witch returns keyWords for a given category
		System.out.println("Key Words for Category");
		getKeyWordsCategory1(categories, "Home Appliances");
		System.out.println();
		System.out.println("Key Words for Category");
		getKeyWordsCategory2(subcategories, "Lawn & Garden");
		System.out.println();
		System.out.println("Key Words for Category");
		getKeyWordsCategory3(subcategories3, "Kitchen Appliances");

		System.out.println();
		System.out.println("Write code that gets the \"level\" of the category starting from the Root");
		wirteLevel(categories, subcategories, subcategories3);
		System.out.println();




	}

	public static void getKeyWordsCategory1(List<Category1> categories, String category){
		categories.stream()
				.filter(category1 ->  category1.getName().contains(category))
				.map(category1 -> category1.getKeyWord())
				.findFirst()
				.ifPresentOrElse(s -> System.out.println(s), ()->System.out.println("no data"));
	}

	public static void getKeyWordsCategory2(List<Category2> categories, String category){
		categories.stream()
				.filter(category2 ->  category2.getName().contains(category))
				.map(category2 -> category2.getKeyWord())
				.findFirst()
				.ifPresentOrElse(s -> System.out.println(s), ()->System.out.println("no data for subcategories 2"));
	}

	public static void getKeyWordsCategory3(List<Category3> categories, String category){
		categories.stream()
				.filter(category3 ->  category3.getName().contains(category))
				.map(category3 -> category3.getKeyWord())
				.findFirst()
				.ifPresentOrElse(s -> System.out.println(s), ()->System.out.println("no data for subcategories 3"));
		//.forEach(System.out::println);
		;
	}


	public static void wirteLevel(List<Category1> categories, List<Category2> subcategorie1, List<Category3> subcategorie2){

		System.out.println("Category 1");
		for (int i = 0; i < categories.size(); i++) {
			//System.out.println(categories.get(i).toString());

			Category1 category1 = categories.get(i);
			System.out.println(category1.toString());

			for (int j = 0; j < subcategorie1.size(); j++) {

				Category2 category2 = subcategorie1.get(j);


				if(category2.getIdCategory1() == category1.getId()){
					System.out.println("    "+category2.toString());

					for (int k = 0; k < subcategorie2.size(); k++) {

						Category3 category3 = subcategorie2.get(k);

						if (category3.getIdCategory2() == category2.getId()){

							System.out.println("        "+category3.toString());
						}

					}


				}


			}


		}

	}






}
