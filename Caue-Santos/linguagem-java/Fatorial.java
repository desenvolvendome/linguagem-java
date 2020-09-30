class Fatorial{
  public void calcula(){
    System.out.println("========== Fatorial ==========");
    int numero = 9;
    int fatorial = 1;

    for(int i = 1; i <= numero; i++){
      fatorial *= i;
    }

    System.out.println(fatorial);
  }
}