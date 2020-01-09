package com.web.spring.entity;

public class Book 
{
	int bookid;
    String booktitle;
    int price;
    String author;
    public Book(){}
	
	public Book(int bookid, String booktitle, int price, String author) {
		super();
		this.bookid = bookid;
		this.booktitle = booktitle;
		this.price = price;
		this.author = author;
	}
	
	public int getBookid() {
		return bookid;
	}
	
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	
	public String getBooktitle() {
		return booktitle;
	}
	/**
	 * @param booktitle the booktitle to set
	 */
	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
    
}
