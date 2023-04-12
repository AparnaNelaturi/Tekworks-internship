//using by thread class
class Threadclass extends Thread
  {
   public  void run()
    {
      System.out.println("i am runnin gthred");
    }
  }
public class ThreadExample{
  public static void main(String h[])
  {
    Threadclass tc=new Threadclass();
    tc.start();
  }
}