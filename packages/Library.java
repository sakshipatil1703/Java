import LibraryManagement.*;

public class Library{
  public static void main(String[] args){
    Book b1 = new Book("The London Times","Jamea Gosling",12345);
    Book b2 = new Book("Harry met Harrika","Harry Potter",7854);

    Member m1= new Member(12,"Sakshi Patil",741524789,12345);
    Member m2 = new Member(10,"Sam Patil",457891549,7854);

    b1.display();
    b2.display();
    m1.display();
    m2.display();
  } 
 
}