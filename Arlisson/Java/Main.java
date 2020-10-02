import java.util.Scanner;
import algorithms.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Seja bem vindo! \nEscolha o numero do algoritmo que deseja esperimentar: \n");
        int option = -1;

        while (option < 0 || option > 3){

            System.out.println("1) - Factorial");
            System.out.println("2) - Linear Search");
            System.out.println("3) - Bubble Sort");
            System.out.println("0) - Sair");

            System.out.print(">>> ");
            option = input.nextInt();

            if(option < 0 || option > 3)
                System.out.println("Opss, opção invalida!");
            else if(option == 1)
                factorial();
            else if(option == 2)
                search();
            else
                bubbleSort();
        }
    }

    protected static void factorial(){
        Scanner input = new Scanner(System.in);

        System.out.print("\nDigite o número que deseja fatorar: ");
        int number = input.nextInt();

        System.out.printf("O fatorial de %d é: %d\n", number, Factorial.factorial(number));
    }

    protected static void search(){
        Scanner input = new Scanner(System.in);

        int[] list = { 2, 3, 4, 9, 10, 20, 49, 70, 1000, 120, 6, 24, 666, 67 };
        System.out.println("Esses são os intens na lista: \n{ 2, 3, 4, 9, 10, 20, 49, 70, 1000, 120, 6, 24, 666, 67 }\n");

        System.out.print("Digite o numero que deseja buscar: ");
        int wanted = input.nextInt();

        int result = LinearSearch.search(list, wanted);

        if (result == -1)
            System.out.println("Opa, esse não tá na lista! =(");
        else
            System.out.printf("Ele está na posição: %d\n", result);
    }

    protected static void bubbleSort(){

        int arr[] = {2,7,4, 1, 45, 67, 100, 5};
        int n = arr.length;
        BubbleSort.bubbleSort(arr, n);
        System.out.println("Numero ordenados: ");

        BubbleSort.printArray(arr, n);
    }
}
