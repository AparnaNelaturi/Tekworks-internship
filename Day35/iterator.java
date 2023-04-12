import java.util.Scanner;
class Example
  {
    public static void main(String args[])
    {
      LinkedList y=new LinkedList<>;
      Scanner sc=new Scanner(System.in);
      Enumeration r=y.element();  // objects
      while(r.hasMoreElements())
      {
        System.out.println(r.nextElement());
      }
      Iterator r=y.interator();  // objects
      while(r.hasNext())
      {
        System.out.println(r.next());
      }
      ListIterator r=y.listIterator();
        while(r.hasNext())
      {
        System.out.println(r.next());
      }
       LinkedList l=new LinkedList(l);
      l.add(1);
      l.add(2);
      l.add(3);
      l.add("abc");
      l.add("def");
      l.add("ghi");
      System.out.println("i");
      l.addFirst('a');
      l.addLast('z');
      System.out.println(l.getFirst());
      System.out.println(l.getLast());
      System.out.println(l);
      l.removeFirst();
      System.out.println(l);
      l.removeLast();
      System.out.println(l);
    }
  }
