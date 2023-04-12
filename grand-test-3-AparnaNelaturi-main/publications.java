import java.util.Scanner;
abstract class Publication
  {
    String title; 
    double price ;
    int copies;
    Publication(String title,double price,int copies)
    {
      this.title=title;
      this.price=price;
      this.copies=copies;
    }
    abstract int calculateCopiesSold();
    abstract int copiesOrdered();
  }
class Book extends Publication
{
  String author;
  Book(String author)
  {
    super(author);
  }
}
class Magazine extends Publication
  {
    int orderQty;
    String currentIssue;
    Magazine(int orderQty,String currentIssue)
    {
      super(orderQty,currentIssue);
    }
  }
class Main
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
    }
  }