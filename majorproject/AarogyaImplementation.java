import java.util.*;

class AarogyaImplementation implements HospitalInterface {
  Scanner s = new Scanner(System.in);
  ArrayList<AarogyaData> arr = new ArrayList<>();

  public void Medicine_Record() {
    Scanner s = new Scanner(System.in);
    /*
     * 1.Supplier ID 2.Supplier Name 3.Date and time of Supply
     */

    /*
     * 1.Medicine ID 2.Medicine Name 3.Unit price 4.Quantity 5.Manufacture date
     * 6.Expiry Date
     */
    System.out.println("Select the options:");
    System.out.println("1.Supplier details:");
    System.out.println("2.Medicine details:");
    System.out.println("enter the options:");
    int option = s.nextInt();
    switch (option) {
      case 1:
        System.out.println("enter the supplier id:");
        int supplier_id = s.nextInt();
        System.out.println("enter the supplier name:");
        String supplier_name = s.next();
        System.out.println("enter the date and time:");
        String date=s.next();
        break;
      case 2:
        System.out.println("Select the number of medicines:");
        int number_medicines = s.nextInt();
        for (int i = 0; i < number_medicines; i++) {
          System.out.println("enter medicine id:");
          int med_id = s.nextInt();
          System.out.println("enter medicine name:");
          String med_name = s.next();
          System.out.println("enter medicine price:");
          double med_price = s.nextDouble();
          System.out.println("enter medicine quantity:");
          int med_quantity = s.nextInt();
          System.out.println("enter medicine manufacture date:");
          String date_manf = s.next();
          System.out.println("enter medicine expiry date:");
          String date_exp = s.next();
        }
        break;
      default:
        System.out.println("please enter valid option");
    }
  }

  public void Patient_Registration() {

    arr.add(new ArogyaData(101, "abc", 23, "male", 15765127812L, 879879790, 6879789098, "vijayawada"));
    arr.add(new ArogyaData(102, "abb", 29, "male", 15765127812L, 879797909, 6870789090, "guntur"));
    System.out.println(arr.toString());

  }

  public void Patient_Profile() {
    int choice;
    System.out.println("1.View full list of patients");
    System.out.println("2.Search an entry of patient");
    System.out.println("3.Recovery and Delete");
    System.out.println("4:enter guardian's information");
    System.out.println("enter the choice:");
    choice = s.nextInt();
    switch (choice) {
      case 1:
        System.out.println("list of patients:");
        System.out.println(arr);
        break;
      case 2:
        System.out.println("enter the patient id to search:");
        int search_id = s.nextInt();
        String check = null;
        for (ArogyaData ad : arr) {
          if (ad.getPatient_id() == search_id) {
            System.out.println("patient is already admitted");
            check = "found";
          }
        }
        if (check == null) {
          System.out.println("Patient is not found or admitted");
        }
        break;
      case 3:
        System.out.println("enter the patient id to delete:");
        int id_delete = s.nextInt();
        String check1 = null;
        for (ArogyaData ad : arr) {
          if (ad.getPatient_id() == id_delete) {
            arr.remove(ad);
            check1 = "found";
            break;
          }
        }
        if (check1 == null) {
          System.out.println("Patient is not available");
        }
        break;
      case 4:
        System.out.println("enter the guardian name:");
        String g_name = s.next();
        System.out.println("enter the guardian age:");
        int g_age = s.nextInt();
        System.out.println("enter the guardian Adhar number:");
        long g_adhar = s.nextLong();
        System.out.println("enter the guardian mobile number:");
        long g_num = s.nextLong();
        break;
      default:
        System.out.println("enter valid option");
        break;
    }

  }

  public void Contact_us() {

    System.out.println("enter the contact details:");
    System.out.println("enter the address:");
    String add = s.next();
    System.out.println("enter the contact number:");
    long ph = s.nextLong();
    System.out.println("enter the email address:");
    String email = s.next();
    System.out.println("enter the  customer support:");
    long customer = s.nextLong();
    System.out.println("enter the Ambulance number:");
    int amb_num = s.nextInt();

  }
}