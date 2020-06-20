package test.fu.ck;

public class Bla{
  
  private Bla(){
    throw new IllegalStateException("Utility Class");
  }
  
  public static void ausgeben(String x){
    System.out.println(x);
  }
  
}
