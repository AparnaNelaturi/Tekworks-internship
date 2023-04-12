class Threadclass implements Runnable
  {
   public  void run()
    {
      System.out.println("i am runnin gthred");
    }
  }
public class ThreadExample1{
  public static void main(String h[])
  {
    Threadclass tc=new Threadclass();
    //tc.run();
    Thread t=new Thread(tc);
    t.start();
  }
}


class Threadclass implements Runnable
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
   // tc.run();
    Thread t=new Thread(tc);
    t.start();
    
    // start()---> run
  }
}