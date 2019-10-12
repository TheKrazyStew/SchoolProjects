public class Example1{
  public static void main(String[] args) throws InterruptedException{
    System.out.print("\033\143"); // clear screen in console
    
    for (int i=10; i>=0; i--){
      System.out.println(i);
      Thread.sleep(1000); // pause 'this' thread for 1000 miliseconds (1 second)
      System.out.print("\033\143");
    }

  }
}
