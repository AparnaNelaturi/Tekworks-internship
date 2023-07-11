import java.util.Scanner;
class Main {
   Object message() {
        return "Hello!";
    }
     public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
         System.out.print(new Main().message());
        System.out.print(new Main2().message());
     }
}
class Main2 extends Main {
     String message() {
         return "World!";
    }
}
 