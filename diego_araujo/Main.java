package diego_araujo;

import static factorial.Factorial.factorial;
import java.util.Scanner;

class Main { 
  public static void main(String[] args){ 
    Scanner t = new Scanner(System.in);
    System.out.println("Insira um número");
    int number = t.nextInt();
    System.out.println("Resultado: " + factorial(number)); 
  } 
} 
