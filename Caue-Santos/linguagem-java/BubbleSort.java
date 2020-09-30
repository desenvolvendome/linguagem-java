class BubbleSort{
  public void calcula(){  
    System.out.println("========== Bubble Sort ==========");
    int aux, vetor[] = {28, 34, 11, 5, 9, 0, 2};
    boolean controle;    
        
    for(int i = 0; i < vetor.length; i++){ //1
      controle = true;
      for(int j = 0; j < (vetor.length - 1); j++){
        if(vetor[j] > vetor[j+1]){
          aux = vetor[j];
          vetor[j] = vetor[j+1];
          vetor[j+1] = aux;
          controle = false;
        }
      }
            
      if(controle){
        break;
      }
    }   

    for (int i = 0; i < vetor.length; i++) {
      System.out.print(vetor[i] + " ");
    }
    System.out.println();       
  } 
}
