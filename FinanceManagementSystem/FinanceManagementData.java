import java.util.*;
public class FinanceManagementData
  {
    Scanner sc=new Scanner(System.in);
    String Candidate_Name;
    String acc_Num;
    String Ifsc_code;
    long Candidate_Adhar;
    String Pan_Num;
    long Contact_Details;
    String Candidate_Address;
    String Type_of_Property;
    int previous_loans;
    int cleared_Loans;
    int cibil_Score;
    String Surity_Name;
    long Surity_Contact;
    String Surity_Address;
    long Surity_Adhar;
    String Designation;
    long Salary;
    int Loan_Amount;
    int InterestRate;
    FinanceManagementData(String acc_Holder_Name,String acc_Num,String Ifsc_code,long Candidate_Adhar,String Pan_Num,long Contact_Details,String Candidate_Address,String Type_of_Property,int previous_loans,int cleared_Loans,int cibil_Score,String Surity_Name,long Surity_Contact,String Surity_Address,String Designation,long Salary,int Loan_Amount,int InterestRate)
    {
      this.Candidate_Name=Candidate_Name;
      this.acc_Num=acc_Num;
      this.Ifsc_code=Ifsc_code;
      this.Candidate_Adhar=Candidate_Adhar;
      this.Pan_Num=Pan_Num;
      this.Contact_Details=Contact_Details;
      this.Candidate_Address=Candidate_Address;
      this.Type_of_Property=Type_of_Property;
      this.previous_loans=previous_loans;
      this.cleared_Loans=cleared_Loans;
      this.cibil_Score=cibil_Score;
      this.Surity_Name=Surity_Name;
      this.Surity_Contact=Surity_Contact;
      this.Surity_Address=Surity_Address;
      this.Surity_Adhar=Surity_Adhar;
      this.Designation=Designation;
      this.Salary=Salary;
      this.Loan_Amount=Loan_Amount;
      this.InterestRate=InterestRate;
    }
    public String getCandidate_Name() 
    {
      return Candidate_Name;
    }
    public String getAcc_Num() {
      return acc_Num;
    }
    public String getIfsc_code() {
      return Ifsc_code;
}
    public long getCandidate_Adhar() {
      return Candidate_Adhar;
}
    public String getPan_Num() {
      return Pan_Num;
}
     public long getContact_Details() {
      return Contact_Details;
}
    public String getCandidate_Address() {
      return Candidate_Address;
}
     public String getType_of_Property() {
      return Type_of_Property;
}
    public int getPrevious_loans() {
      return previous_loans;
}
    public int getCleared_Loans() {
      return cleared_Loans;
}
    public int getCibil_Score() {
      return cibil_Score;
}
    public String getSurity_Name() {
      return Surity_Name;
}
    public long getSurity_Contact() {
      return Surity_Contact;
}
    public String getSurity_Address() {
      return Surity_Address;
}
    public long getSurity_Adhar() {
      return Surity_Adhar;
}
    public String getDesignation() {
      return Designation;
}
    public long getSalary() {
      return Salary;
}
    public int getLoan_Amount() {
      return Loan_Amount;
}
    public int getInterestRate() {
      return InterestRate;
}
  }
  