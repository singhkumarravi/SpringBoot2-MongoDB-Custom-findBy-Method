package com.olive.runner;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.olive.model.Book;
import com.olive.repo.ProductRepo;
@Component
public class MethodTestRunner implements CommandLineRunner{
	@Autowired
	private ProductRepo repo;

	public void run(String... args) throws Exception {
		System.out.println("Runner Class Started............");
		/*
		    Optional<Book> opt = repo.findBybookName("Spring");
		    if(opt.isPresent()){
		    	Book book = opt.get();
		    	System.out.println("book :: " + book);}
		     else
		    	System.out.println("Book not found ");
		  */
		
		/*
         repo.findBybookCostLessThan(500)
		.forEach(System.out::println);
		*/
		
		/*
		  Optional<Book> opt = repo.findBybookNameIs("Spring Boot");
		       if(opt.isPresent())
		       {
		    	   Book book = opt.get();
		    	   System.out.println(book);
		       }
		       */
		
		/*
		  repo.findBybookCostGreaterThanEqual(400.0)
		  .forEach(System.out::println);
		  */
		
		/*
		repo.findByauthorIsNull()
		.forEach(System.out::println);
		*/
		
		/*
		repo.findBybookIdIn(Arrays.asList(101,102,103,100))
		.forEach(System.out::println);
		*/
		
		/*
		repo.findByauthorStartingWith("r")
		.forEach(System.out::println);
		*/
		
		/*
		repo.findByauthorEndingWith("Kumar")
		.forEach(System.out::println);
		*/
		
        System.out.println("Product Data Save into MongoDB");
      
	}

}
