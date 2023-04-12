import java.util.*;
interface BookShopInterface
  {
    void Add_Book();
    void TotalPrice_AllBooks();
    void Book_Details();
  }
class BookShopData
  {
    Scanner sc=new Scanner(System.in);
    String book_Name;
    String Author_Name;
    int Book_Price;
    int Book_Id;
    int Total_Price;
    int no_of_Books;
    BookShopData(String book_Name,String Author_Name,int Book_Price,int Book_Id,int Total_Price,int no_of_Books)
    {
      super();
      this.book_Name=book_Name;
      this.Author_Name=Author_Name;
      this.Book_Price=Book_Price;
      this.Book_Id=Book_Id;
      this.Total_Price=Total_Price;
      this.no_of_Books=no_of_Books;
    }
    public String getBook_Name() {
      return book_Name;
}
    public String getAuthor_Name() {
      return Author_Name;
}
    public int getBook_Price() {
      return Book_Price;
}
    public int getBook_Id() {
      return Book_Id;
}
    public int getTotal_Price() {
      return Total_Price;
}
    public int getNo_of_Books() {
      return no_of_Books;
}
     public String toString() {
		 System.out.prinltn("Book [name :" + book_Name + ", Author Name :" + Author_Name + "Book Price :"+Book_Price+"Book ID :"+Book_Id+"Total_Price :"+Total_Price,"books count :"+no_of_Books);
  }
  }
class BookShopImp implements BookShopInterface
{
  Scanner sc = new Scanner(System.in);
  ArrayList<BookShopData> arr = new ArrayList<>();
  public void Add_Book()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no of books you want ton add :");
    int num=sc.nextInt();
    System.out.println("Enter the book name :");
    String book_Name=sc.nextLine();
    System.out.println("Enter the author name :");
    String Author_Name=sc.nextLine();
    System.out.println("Enter the book price :");
    int Book_Price=sc.nextInt();
    System.out.println("Enter the book id :");
    int Book_Id=sc.nextInt();
    arr.add(new BookShopData(book_Name,Author_Name,Book_Price,Book_Id,Total_Price,no_of_Books));
    System.out.println(arr.toString());
  }
  public void TotalPrice_AllBooks()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the book name which you want to buy :");
    String book_Name=sc.nextLine();
    System.out.println("Enter the book price :");
    int Book_Price=sc.nextInt();
    System.out.println("Enter the no of books you buy :");
    int no_of_Books=sc.nextInt();
    int Total_Price=no_of_Books*Book_Price;
    System.out.println("Total price is :"+Total_Price);
  }
   public void Book_Details() {
    int choice;
    System.out.println("1.View full list of books");
    System.out.println("2.Search a book by book_id");
    System.out.println("3.Remove the book by using book_id");
    System.out.println("4.update book price using book id");
    System.out.println("5.search the book by using author name");
    System.out.println("6.Quit the program");
    System.out.println("enter the choice:");
    choice = sc.nextInt();
    switch (choice) {
      case 1:
        System.out.println("list of Books:");
        System.out.println(arr);
        break;
      case 2:
        System.out.println("enter the book id to search:");
        int search_id = sc.nextInt();
        String check = null;
        for (BookShopData ad : arr) {
          if (ad.getBook_Id() == search_id) {
            System.out.println("book is available.");
            check = "found";
          }
        }
        if (check == null) {
          System.out.println("book is not found.");
        }
        break;
      case 3:
        System.out.println("enter the book id to delete:");
        int id_delete = sc.nextInt();
        String check1 = null;
        for (BookShopData ad : arr) {
          if (ad.getBook_Id() == id_delete) {
            arr.remove(ad);
            check1 = "found";
            break;
          }
        }
        if (check1 == null) {
          System.out.println("book is removed ");
        }
        break;
      case 4:
        System.out.println("enter the book id:");
        int search_Id = sc.nextInt();
        System.out.println("enter the previous price :");
        int Book_Price = sc.nextInt();
        System.out.println("enter the new price :");
        int new_Price = sc.nextInt();
        String check2 = null;
        for (BookShopData ad : arr) {
          if (ad.getBook_Id() == search_Id) {
            Book_Price=new_Price;
            check1 = "book price is updated";
            break;
          }
        }
      case 5:
        System.out.println("Enter the author name to search for a book :");
        String author_Name=sc.nextLine();
        String check3=null;
        for(BookShopData ad: arr)
          {
            if(ad.getAuthor_Name()==author_Name)
            {
              System.out.println(ad);
              check3="book is found";
              break;
            }
          }
      case 6:
        System.out.println("Thank you and visit again.");
      default:
        System.out.println("enter valid option");
        break;
    }

  }
}
class BookShopMain
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      char ch;
      int option1;
      BookShopImp obj=new BookShopImp();
      System.out.println("1.ADD  BOOKS ");
      System.out.println("2.CALCULATE THE TOTAL PRICE");
      System.out.println("3.BOOK DETAILS");
      do{
        System.out.println("enter your choice");
        option1=sc.nextInt();
        switch(option1)
          {
            case 1:obj.Add_Book();
              break;
            case 2: obj.TotalPrice_AllBooks();
              break;
            case 3: obj.Book_Details();
              break;
            default: 
              System.out.println("invalid option");
          }
        System.out.println("do you want to continue one more operation");
        ch=sc.next().charAt(0);
      }
        while(ch!='n');
        }
      }