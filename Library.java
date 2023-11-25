/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mayaqil1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author User
 */
public class Library {
  protected Book[] books;
    protected Student[] students;

    public Library(Book[] books, Student[] students) {
        this.books = books;
        this.students = students;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    // Method to borrow a book
    public void borrowBook(Student student, Book book) {
        if (student.borrowedBooksCount < 3 && !book.inLoan()) {
            student.borrowedBooksCount++;
            LocalDate currentDate = LocalDate.now();
            LocalDate dueDate = currentDate.plusDays(5);
            book.setDate(dueDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            book.setOnLoan(true);
            System.out.println(student.getName() + " borrowed " + book.getTitle() + " due on " + book.getDate());
        } else {
            System.out.println(student.getName() + " has reached the maximum limit of borrowed books (3 books) or the book is already on loan.");
        }
    }

    // Method to return a book
    public void returnBook(Student student, Book book) {
        if (book.inLoan()) {
            LocalDate currentDate = LocalDate.now();
            LocalDate dueDate = LocalDate.parse(book.getDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            student.borrowedBooksCount--;
            book.setOnLoan(false);
            System.out.println(student.getName() + " returned " + book.getTitle());
            if (currentDate.isAfter(dueDate)) {
                System.out.println("Warning: " + student.getName() + "'s return of " + book.getTitle() + " is overdue.");
            }
        } else {
            System.out.println(student.getName() + " did not borrow " + book.getTitle());
        }
    }
}