package com.codeit.controller;


import com.codeit.model.Book;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookController {
	private List<Book> bookList = new ArrayList<>();

	public BookController() {
		bookList.add(new Book("데일 카네기 인간관계론", "데일 카네기", "인문", 12500));
		bookList.add(new Book("백년운동", "정성근", "의료", 16500));
		bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "코딩", 15000));
		bookList.add(new Book("스즈메의 문단속", "신카이 마코토", "기타", 11700));
		bookList.add(new Book("오은영의 화해", "오은영", "인문", 15000));
		bookList.add(new Book("자바의 정석", "남궁 성", "코딩", 27000));
	}

	public void insertBook(Book book) {
		bookList.add(book);
	}

	public List<Book> selectList() {
		return bookList;
	}

	public List<Book> searchBook(String keyword) {
		List<Book> searchList = new ArrayList<>();
		for (Book book : bookList) {
			if (book.getTitle().contains(keyword)) {
				searchList.add(book);
			}
		}
		return searchList;
	}

	public Book deleteBook(String title, String author) {
		Book removeBook = null;
		for (int i = 0; i < bookList.size(); i++) {
			Book book = bookList.get(i);
			if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
				removeBook = bookList.remove(i); // 삭제 후 해당 책 반환
				break;
			}
		}
		return removeBook;
	}

	public int ascBook() {
		try {
			bookList.sort(Comparator.comparing(Book::getTitle));
			return 1; // 성공
		} catch (Exception e) {
			return 0; // 실패
		}
	}
}





