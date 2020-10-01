package algorithms;

public class Factorial {

    public static int factorial(int number){

        int factorial = 1;
        int contador;

        for (contador = 2; contador <= number; contador++)
            factorial *= contador;

        return factorial;
    }
}
