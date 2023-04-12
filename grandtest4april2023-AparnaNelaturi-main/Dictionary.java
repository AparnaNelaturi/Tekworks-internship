import java.util.Scanner;
class Dictionary
  {
static HashMap<String,String> dictionary=new HashMap<>();
      Scanner sc=new Scanner(System.in);
    static void add()
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the word and its definition :");
      String word=sc.nextLine();
      String definition=sc.nextLine();
      dictionary.put(word.definition);
      for(String key:dictionary.keyset())
    {
      if(word==key)
      {
        System.out.println("the definition is :"+dictionary.get(word));
      }
    }
  }
static void no_of_words()
  {
    System.out.println(dictionary.size());
  }
    static void search_word()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the word which you wantnto search :");
      String search_word=sc.nextLine();
      boolean b=false;
      for(String key:dictionary.keyset())
        {
          if(key==search_word)
          {
            b=true;
            System.out.println("word is found and its definition is :"+dictionary.get(key));
          }
        }
      if(b==false)
      {
        System.out.println("not found");
      }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      
    }
  }