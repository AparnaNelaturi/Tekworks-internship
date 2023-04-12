import java.util.*;
public class FinanceManagementMain
  {
    public static void main(String args[])
    {
      char ch;
      int option1;
      Scanner sc=new Scanner(System.in);
      AarogyaImp obj=new AarogyaImp();
      System.out.println("5.LOANS APPROVED BY ELIGIBILITY");
      System.out.println("1.LOANS APPROVED BY PROPERTY ");
      System.out.println("2.LOANS APPROVED BY EMPLOYABILITY");
      System.out.println("3.LOANS APPROVED BY CIVIL SCORE");
      System.out.println("4.LOANS APPROVED BY GOLD");
  
      do{
        System.out.println("enter your choice");
        option1=sc.nextInt();
        switch(option1)
          {
            case 1:obj.LoanApprove_Eligibility();
              break;
            case 2: obj.LoanApprove_ByProperty();
              break;
            case 3: obj.LoanApprove_ByEmployability();
              break;
            case 4: obj.LoanApprove_ByCivilScore();
              break;
            case 5: obj.LoanApprove_ByGold();
            default: 
              System.out.println("invalid option");
          }
        System.out.println("do you want to continue one more operation");
        ch=s.next().charAt(0);
      }
        while(ch!='n');
        }
      }