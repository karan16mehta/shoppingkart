package com.niit.ShoppingCart;

import java.lang.annotation.Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ShoppingCart.model.Category;

public class CategoryTest {

	public static void main(String []args){
		
		// we have get context 
		// ask context to get the bean i.e category 
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		// specify in which package the classes are there
		
		context.scan("com.niit");    // it will scan the all the classes present in the niit
		
		context.refresh();   // all the instance of the classes will be created
		
		
		// whatever the beans/instance u required u ask context
		
		
	    Category c =  (Category) context.getBean("category");
	    
	    System.out.println("category instancce created");
		
		
		//ClassPathXmlApplicationContext if u are using xml based
		
		
	}
}
