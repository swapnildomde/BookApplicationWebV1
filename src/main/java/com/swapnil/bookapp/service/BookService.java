package com.swapnil.bookapp.service;

import java.util.List;
import java.util.UUID;

import com.swapnil.bookapp.vo.Book;

public interface BookService {
	public void addBook(Book book);
	public void addBookS(List<Book> books);
	public Book getBook(UUID bookId);
	public List<Book> getBooks();

}
