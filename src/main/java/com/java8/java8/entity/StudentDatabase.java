package com.java8.java8.entity;

import java.util.Arrays;
import java.util.List;

public class StudentDatabase {

    private static List<Student> getStudentDatabase(){
        Student student1 = new Student("Naresh",25,"Hyderabad","A",950.55,"India");
        Student student2 = new Student("Naresh",25,"Veerannapet","b",250.55,"India");
        Student student3 = new Student("sai",26,"Hyderabad","A",750.55,"India");
        Student student4 = new Student("Srikanth",25,"Karminagar","B",850.55,"Us");
        Student student5 = new Student("Ganesh",28,"siddipet","B",950.55,"India");
        Student student6 = new Student("Suresh",25,"jangoan","C",550.55,"India");
        Student student7 = new Student("Avinash",22,"siddipet","C",650.55,"India");
        Student student8 = new Student("Rajesh",21,"veerannapet","D",750.55,"Uk");
        Student student9 = new Student("Mahesh",30,"Hyderabad","D",850.55,"India");

        List<Student> students = Arrays.asList(student1,student2,student3,student4,student5,student6,student7,student8,student9);
        return students;

    }
}
