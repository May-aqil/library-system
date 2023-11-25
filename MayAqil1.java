/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mayaqil1;
import java.time.LocalDate;
/**
 *
 * @author User
 */
public class MayAqil1 {

    public static void main(String[] args) {
        
 
    Auther author = new Auther(1, "John Doe", "123 Main St", "1990-01-01");

        Book book1 = new Book("Sample Book 1", author, 123, "Fiction", 1, "2023-01-01");
        Book book2 = new Book("Sample Book 2", author, 124, "Non-Fiction", 2, "2023-02-01");
        Book book3 = new Book("Sample Book 3", author, 125, "Mystery", 1, "2023-03-01");
        Book book4 = new Book("Sample Book 4", author, 126, "Science Fiction", 3, "2023-04-01");

        Student student1 = new Student(101, "Alice", "456 Oak St", "1995-05-15", "Computer Science");
        Student student2 = new Student(101, "Ali", "456 Oak St", "1995-05-15", "Computer Science");

        Library library = new Library(new Book[]{book1, book2, book3, book4}, new Student[]{student1});

       
        
        
        
        
        
        
          // Borrow and return books
        library.borrowBook(student1, book1);
        library.borrowBook(student2, book2);
        library.borrowBook(student1, book3);

        // Try to borrow more books than allowed
        library.borrowBook(student2, book1);
        library.borrowBook(student1, book2);

        // Return books on time
        library.returnBook(student1, book1);
        library.returnBook(student2, book2);

        // Overdue scenario: Return a book after 6 days
        LocalDate currentDate = LocalDate.now();
        book3.setDate(currentDate.minusDays(6).toString()); // Set the due date 6 days ago
        library.returnBook(student1, book3);
        
        
        
        
        
    }
}
      
      
      
    
