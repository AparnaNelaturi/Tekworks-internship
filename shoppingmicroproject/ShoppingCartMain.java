import java.util.Scanner;
class ShoppingCartMain
    {
    public static void main(String[] args)
     {
        char ch;
        int choice;
        Scanner sc = new Scanner(System.in);
        ShoppingCartImp obj = new ShoppingCartImp();
        System.out.println("1.add item details");
        System.out.println("2.delete item details");
        System.out.println("3.display item details");
        System.out.println("4.display Total cost of items");
         do{
        System.out.println("enter your choice");
        choice = sc.nextInt();
        switch(choice)
            {
            case 1 : obj.add();
                break;
            case 2 : obj.remove();
                break;
            case 3 : obj.displayItems();
                break;
            case 4 : obj.totalCost();
                break;
        default : System.out.println("invalid choice");
            }
            System.out.println("do you want to continue one more option(y/n)");
            ch = sc.next().charAt(0);
            }while(ch != 'n');
     }
}
