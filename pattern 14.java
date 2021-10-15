/*
PEPCODING LEVEL-1 PATTERNS

QUESTION-4

PATTERN 14


*/

import java.util.*;

public class Main {
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    int x = scn.nextInt();
    for (int i = 1; i <= 10; i++)
    {
      int val = x * i;
      System.out.println(x + " * " + i + " = " + val );
    }
  }
}