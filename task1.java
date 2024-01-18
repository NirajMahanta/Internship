

import java.lang.Math;

public class task1 {
  public int number(int a) {

    int b=(int)(Math.random()*a);
    System.out.println(b);
    return 0;
  }

  public static void main(String[] args) {
    task1 x = new task1();
    x.number(100);

  }

}