package com.cdac.app;


import java.util.ArrayList;
import java.util.List;

import com.cdac.dao.GenericDao;
import com.cdac.entity.Author;
import com.cdac.entity.Book;

public class BookAuthorexample {
	
	public static void main(String[] args) {
		
		GenericDao dao=new GenericDao();
		
		/*1.//Author author=new Author();
		 author.setName("David Flanagan");
		 author.setEmail("davidflanagan@gmail.com");
		dao.save(author);*/
		
		/*2.//Book book=new Book();
		book.setName("Learn JavaScript");
	    book.setCost(1500);
	    
	    List<Author> authors= new ArrayList<Author>();
		authors.add((Author) dao.fetchById(Author.class, 1));
		authors.add((Author) dao.fetchById(Author.class, 2));
		
		book.setAuthors(authors);
		dao.save(book);*/
		
		//first book is added
		/*3.//Book book=new Book();
		 book.setName("Advance java");
		 book.setCost(1000);
		 dao.save(book);*/
		
		//a particular book which is already in table fetch that and  has two author is added
		 //book id 2 has two authors
	   /*4.//	Book book=(Book) dao.fetchById(Book.class,2); 
		  List<Author> authors=new ArrayList<Author>();
		  authors.add((Author) dao.fetchById(Author.class, 1));
		  authors.add((Author) dao.fetchById(Author.class, 2));
		  book.setAuthors(authors);
		  
		 dao.save(book);*/
		  
		//now add book along with author;
		
		Book book=new Book();
		book.setName("Core & Advance java");
		book.setCost(2000);
		
		Author author1=new Author();
		author1.setName("Anirudh");
		author1.setEmail("anirudhbardhan@gmail.com");
		
		Author author2=new Author();
		author2.setName("AnkitG");
		author2.setEmail("ankitg@gmail.com");
		
		List<Author> list= new ArrayList<Author>();
		list.add(author2);
		list.add(author1);
		
		book.setAuthors(list);
		
		dao.save(book);
		
	}

}
