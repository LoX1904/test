package test;

import test.fu.Func;
import test.fu.ck.Bla;

public class Main{  
  public static void main(String[] args){
    Func f = new Func();
    System.out.println("Hello");
    System.out.println(f.add(3, 2));
    f.sayHI();
    Bla.ausgeben("FIC");
  }
}
