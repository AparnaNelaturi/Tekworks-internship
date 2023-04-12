import java.util.*;
class InvalidnumberException extends Exception
  {
   InvalidnumberException(String message)
    {
      super(message);
    }
  }
class Books
{
  Scanner s=new Scanner(System.in);
String title;
String author;
int isbn;
String publisher;
 void getDetails()
  {
  System.out.println("Book title is"+title);
  System.out.println("Book authoris"+author);
  System.out.println("Book isbn is"+isbn);
  System.out.println("Book publisher is"+publisher);
  }
 void titleAuthorDetails()
{
  System.out.println("enter the title and Author name:");
  try
    {
    title=s.nextLine();
    author=s.nextLine();
    }
  catch(InputMismatchException im)
    {
      System.out.println("title and author must be in alphabets");
    }
}
  void isbn() throws InvalidnumberException
  {
 System.out.println("enter book isbn");
    try
      {
      isbn=s.nextInt();
      }
    catch(InvalidnumberException ine)
      {
        System.out.println(ine);
      }
  }
  void publisher()
  {
    System.out.println("enter the publisher name:");
    try
      {
        publisher=s.nextLine();
      }
    catch(InputMismatchException ie)
      {
        System.out.println("publisher name must be alphabets");
      }
  }
 }
class Author extends Books
{
  Scanner s=new Scanner(System.in);
String name;
String email;
String listofBook[]=new String[10];
void getDetails()
{
System.out.println("author name is"+name);
System.out.println("author eamil is"+email);
System.out.println("Books written by this autor is");
for(int i=0;i<listofBook.length;i++)
System.out.println(listofBook[i]);
}
void setname()
{
System.out.println("eneter deatils of an author");
System.out.println("eneter author name");
  try
  {
    name=s.nextLine();
  }
  catch(InputMismatchException is)
    {
      System.out.println("name must be in alphabets");
    }
}
  void emails()
  {
System.out.println("enter author email");
    try
    {
email=s.nextLine();
    }
    catch(InputMismatchException ex)
      {
        System.out.println(ex);
      }
  }
    void booklist()
      {
System.out.println("eneter no of books written by this author");
int n=s.nextInt();
System.out.println("give names of books");
for(int i=0;i<n;i++)
  {
listofBook[i]=s.nextLine();
  }
}
}
 class LibrarayManagement
{
public static void main(String a[])
{
  Scanner s=new Scanner(System.in);
  int num_books=s.nextInt();
Author[] obj=new Author[num_books];
  for(int i=0;i<num_books;i++)
    {
      obj[i]=new Author();
      obj[i].getDetails();
      obj[i].titleAuthorDetails();
      obj[i].isbn();
      obj[i].publisher();
      obj[i].booklist();
      obj[i].setname();
      obj[i].emails();
      obj[i].booklist();
      obj[i].getDetails();
    }
}
}
