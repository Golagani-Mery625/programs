package com.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.web.spring.entity.Book;
import com.web.spring.entity.BookDAO;
	@Controller
	public class BookController 
	{
	   BookDAO bdao;
	   @Autowired
	   BookController(BookDAO bdao)
	   {
		   this.bdao=bdao;
	   }
	   @GetMapping("/bookPage")
	   public String getbookPage(Model model)
	   { 
		  model.addAttribute("book",new Book(0," ",0," "));
		 return "DisplayBook";  
	   }
	   @GetMapping("/bookCRUD")
	   public String bookCrud(@RequestParam("sub")String sub,@RequestParam("bookid")int bookid,@RequestParam("booktitle")String booktitle,@RequestParam("price")int price,@RequestParam("author")String author,RedirectAttributes ra)
	   {
		   ra.addFlashAttribute("book",new Book(bookid,booktitle,price,author));
		   String val="";
		   if(sub.equals("Add_Book"))  val="addBook";
		   else if(sub.equals("Del_Book")) val="deleteBook";
		   else if(sub.equals("Mod_Book")) val="modifyBook";
		   else val="getBook";
		   return "redirect:"+val;
		   
	   }
	   @GetMapping("/addBook")
	   public String addEmployee(@ModelAttribute("book")Book b)
	   {
		   bdao.insertBook(new Book(b.getBookid(),b.getBooktitle(),b.getPrice(),b.getAuthor()));
		  return "DisplayBook";
	   }
	   @GetMapping("/modifyBook")
	   public String modifyBook(@ModelAttribute("book")Book b)
	   {
		   bdao.modifyEmployee(new Book(b.getBookid(),b.getBooktitle(),b.getPrice(),b.getAuthor()));
		  return "DisplayBook";
	   }
	   @GetMapping("/deleteBook")
	   public String deleteEmployee(@ModelAttribute("book")Book b)
	   {
		   bdao.deleteBook(b.getBookid());
		   return "DisplayBook";
	   }
	   @GetMapping("/getBook")
	   public String getBook(@ModelAttribute("book")Book e,Model model)
	   {
		   Book b1=bdao.getBook(e.getBookid());
		   model.addAttribute("book",b1);
		   return "DisplayBook";
		   
	   }
	}

