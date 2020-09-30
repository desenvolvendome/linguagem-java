import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Seja bem vindo! \nEscolha o numero do algoritmo que deseja esperimentar: \n");

        int option = -1;

        while (option < 0 || option > 1){

            System.out.println("1) - Factorial");
            System.out.println("2) - Linear Search");
            System.out.println("1) - Bubble Sort");
            System.out.println("0) - Sair");

            System.out.print(">>> ");
            option = input.nextInt();

            if(option < 0 || option > 1)
                System.out.println("Opss, opção invalida!");
        }


    }
}
