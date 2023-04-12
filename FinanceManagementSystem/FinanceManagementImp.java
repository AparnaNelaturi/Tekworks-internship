import java.util.Scanner;
class FinanceManagementImp implements FinanceManagementInterface
  {
    Scanner s = new Scanner(System.in);
    ArrayList<FinanceManagementData> arr = new ArrayList<>();
    void Candidate_Details()
    {
      System.out.println("Enter the Candidate name :");
      String Candidate_Name=sc.nextLine();
      System.out.println("Enter the acc number :");
      String acc_Num=sc.nextLine();
      System.out.println("Enter the ifsc code :");
      String Ifsc_code=sc.nextLine();
      System.out.println("Enter the adhar number :");
      long Candidate_Adhar=sc.nextLong();
      System.out.println("Enter the PAN number :");
      String Pan_Num=sc.nextLine();
      System.out.println("Enter the contact number :");
      long Contact_Details=sc.nextLong();
      System.out.println("Enter the address :");
      String Candidate_Address=sc.nextLong();
      arr.add(new FinanceManagementData(Candidate_Name,acc_Num,Ifsc_code,Candidate_Adhar,Pan_Num,Contact_Details,Candidate_Address));
    }
    void LoanApprove_Eligibility()
    {
      System.out.println("Enter the previous loans :");
      int Previous_Loans=sc.nextInt();
      System.out.println("Enter the no of previous loans cleared :");
      cleared_Loans=sc.nextInt();
      if(previous_Loans==cleared_Loans)
      {
        System.out.println("To get the Loan STEP-1 is cleared");
      }
      else{
        System.out.println("Not cleared");
        System.out.println("you are not eligible to get the Loan");
      }
    }
    void LoanApprove_ByProperty()
    {
      
    }
    void LoanApprove_ByEmployability()
    {
      System.out.println("Enter your Employable Details ");
      System.out.println("Enter your Designation :");
      String Designation=sc.nextLine();
      System.out.println("Enter your Salary :");
      long Salary=sc.nextLong();
      System.out.println("You have to submit the documents as follows.");
      System.out.println("1.UPTO YOUR HIGHER EDUCATION DOCUMENTS XEROX \n 2.SUBMIT YOUR SALARY SLIPS \n 3.YOUR JOB GAURANTEE LIFE SLIP EITHER PERMINANT OR TEMPORARY");
      System.out.println("Enter the loan amount :");
      int Loan_Amount=sc.nextInt();
      if(Salary>2000 && Salary<5000)
      {
        Loan_Amount=200000;
        int InterestRate=(3/100)*Loan_Amount;
        System.out.println(" You can borrow upto"+Loan_Amount+"/- Only.");
        System.out.println("your Interest rate is :"+InterestRate);
      }
      else if(Salary>5000 && Salary<20000)
      {
        Loan_Amount=500000;
        int InterestRate=(5/100)*Loan_Amount;
        System.out.println(" You can borrow upto"+Loan_Amount+"/- Only.");
        System.out.println("your Interest rate is :"+InterestRate);
      }
      else if(Salary>20000 && Salary<50000)
      {
        Loan_Amount=700000;
        int InterestRate=(7/100)*Loan_Amount;
        System.out.println(" You can borrow upto"+Loan_Amount+"/- Only.");
        System.out.println("your Interest rate is :"+InterestRate);
      }
      else if(Salary>50000)
      {
        Loan_Amount=1000000;
        int InterestRate=(10/100)*Loan_Amount;
        System.out.println(" You can borrow upto"+Loan_Amount+"/- Only.");
        System.out.println("your Interest rate is :"+InterestRate);
      }
      else{
        System.out.println("You are not eligible for get the loan.");
      }
    }
    void LoanApprove_ByCibilScore()
    {
      System.out.println("Enter the civil Score :");
      int cibil_Score=sc.nextInt();
      System.out.println("Enter the Loan amount :");
      int Loan_Amount=sc.nextInt();
      if(cibil_Score<724)
      {
        int InterestRate=(9/100)*Loan_Amount;
      }
      else if(cibil_Score>724 && cibil_Score<759)
      {
        int InterestRate=(8/100)*Loan_Amount;
      }
      else if(cibil_Score>759)
      {
        int InterestRate=(7/100)*Loan_Amount;
      }
    }
    void LoanApprove_ByGold()
    {
      
    }
    void Surity_Details()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the surity name :");
      String Surity_Name=sc.nextLine();
      System.out.println("Enter the surity  contact number :");
      long Surity_Contact=sc.nextLong();
      System.out.println("Enter the surity address :");
      String Surity_Address=sc.nextLine();
      System.out.println("Enter the surity adhar number :");
      long Surity_Adhar=sc.nextLong();
      arr.add(new FinanceManagementData(Surity_Name,Surity_Contact,Surity_Address,Surity_Adhar));
    }
  }