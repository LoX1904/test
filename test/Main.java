package test;

import test.fu.Func;
import test.fu.ck.Bla;
import java.util.Scanner;

public class Main{  
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int value = s.nextInt();
    Func f = new Func();
    System.out.println("Hello");
    System.out.println(f.add(value, 2));
    f.sayHI();
    Bla.ausgeben("FIC");
  }
}
