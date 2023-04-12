import java.util.Scanner;
class Example
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
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
  