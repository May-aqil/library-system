/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mayaqil1;

/**
 *
 * @author User
 */
public class Student implements Display {
    private int id;
    protected String name;
    private String address;
    private String birthDate;
    private String major;
    int borrowedBooksCount;
    public Student() {
    }

    public Student(int id, String name, String address, String birthDate, String major) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
        this.major = major;
        this.borrowedBooksCount=0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    

    
    
    
    
    @Override
     public boolean inLoan() {
       
        return borrowedBooksCount != 0;
    }


   
    @Override
    public String getInfo() {
        return "Student{" + "id=" + id + ", name=" + name + ", address=" + address + ", birthDate=" + birthDate + ", major=" + major + '}';
    }
    
}


    
   
    
    
    
    
    
    

