package com.codeit.practice3.run;

import com.codeit.practice3.model.Employee;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setEmpNo(101);
        e1.setEmpName("이소연");
        e1.setDept("개발팀");
        e1.setJob("백엔드 개발자");
        e1.setAge(29);
        e1.setGender('F');
        e1.setSalary(5000000);
        e1.setBonusPoint(0.1);
        e1.setPhone("010-1234-5678");
        e1.setAddress("서울시 강남구");

        // toString 출력
        System.out.println(e1);

        System.out.println("\n=================================\n");


        Employee e2 = new Employee(102, "이준서", "기획팀", "기획자", 31, 'M', 4800000, 0.05, "010-9876-5432", "서울시 마포구");
        System.out.println(e2);

    }
}
