package com.codeit.practice2.run;

import com.codeit.practice2.model.Book;

public class Main {
    public static void main(String[] args) {

        // 기본 생성자 + setter 방식 (예: 실습 시 유용)
        Book book1 = new Book("자바의 정석", "도우출판", "남궁성", 32000, 0.15);

        // 생성자 사용
        Book book2 = new Book("이펙티브 자바", "인사이트", "조슈아 블로크", 45000, 0.2);
        Book book3 = new Book("클린 코드", "한빛미디어", "로버트 C. 마틴", 40000, 0.1);

        // 출력
        System.out.println(book1);
        System.out.println("\n=================================\n");
        System.out.println(book2);
        System.out.println("\n=================================\n");
        System.out.println(book3);
    }
}
