abstract class Bank
  {
    abstract double interestRate();
    abstract void AnnualProift();
  }
class SBI extends Bank
  {
   double interestRate()
    {
      return 9.5;
    }
    void AnnualProift()
    {
      System.out.println("this year we get 30% profit");
    }
  }
class ICICI extends Bank
  {
   double interestRate()
    {
      return 7.5;
    }
    void AnnualProift()
    {
      System.out.println("this year we get 40% profit");
    }
  }
abstract class Example
  {
    public static void main(String args[])
    {
      SBI sbi=new SBI();
      sbi.interestRate();
      sbi.AnnualProfit();
      ICICI icici=new SBI();
      icici.interestRate();
      icici.AnnualProfit();
      
    }
  }