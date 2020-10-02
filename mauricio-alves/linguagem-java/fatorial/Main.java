import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

	    int num;

	    do{
	      System.out.println("Entre com um número positivo");
	      num = scan.nextInt();

	      if (num < 0){
	        System.out.println("Número inválido, entre novamente");
	      }
	    }while (num < 0);
	    
	    System.out.println(Fatorial.calculaFactorial(num));
	  }
}