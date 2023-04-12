class StackOperations
  {
    public static void main(String args[])
    {
      Stack<integer>s = new Stack<>();
      s.push(20);
      s.push(21);
      s.push(22);
      s.push(23);
      s.push(24);
      s.push(25);
      System.out.println("Elements in stack is:"+s);
      System.out.println(s[0]);
      s.pop(21);
      s.pop(22);
      s.pop(23);
      System.out.println(s);
      int c = s.empty();
      System.out.println("Stack is empty"+c)
    }
  }