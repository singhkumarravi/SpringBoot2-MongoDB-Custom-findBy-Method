package com.olive.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.olive.model.Book;


public interface ProductRepo extends MongoRepository<Book, Integer> {
	//sql
	//select * from book where bookName=?
	//db.book.find("bookName" : "Spring")
    Optional<Book> findBybookName(String name);
    
  //select * from book where bookName="Hibenate";
    Optional<Book> findBybookNameIs(String name);
    
	//select * from book where bookCost<?
    List<Book> findBybookCostLessThan(double cost);
    
   //select * from book where bookCost<?
    List<Book> findBybookCostGreaterThanEqual(double cost);
    
  //select * from book where author=null;
    List<Book> findByauthorIsNull();
    
    //select * from book where bookId In (value);
    List<Book> findBybookIdIn(List<Integer> ids);
    
    //select * from book where author Like <input> %;
    List<Book> findByauthorStartingWith(String name);
    
  //select * from book where author Like <input> %;
    List<Book> findByauthorEndingWith(String name);
    
}
