package com.java8.java8.entity;

public class Student {

    private String name;
    private int age;
    private String city;
    private String grade;
    private double totalMarks;
    private String country;

    public Student(String name, int age, String city, String grade, double totalMarks,String country) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.grade = grade;
        this.totalMarks = totalMarks;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(double totalMarks) {
        this.totalMarks = totalMarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", grade='" + grade + '\'' +
                ", country='" + country + '\'' +
                ", totalMarks=" + totalMarks +
                '}';
    }
}
