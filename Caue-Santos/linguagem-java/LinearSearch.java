class LinearSearch{
  public void calcula(){
  System.out.println("========== LinearSearch ==========");

  int elemento = 29;
  int[] array = {17, 36, 29, 12, 31, 85};
  int indice = -1;

  for(int i=0;i<array.length;i++){    
    if(array[i] == elemento){    
      indice = i;
    }    
  }   

  System.out.print("Indíce do elemento desejado: " + indice);

  }       
}