class Main {
    public static void main(String[] args) {
        float[] array = {10,20,20.3f,50,2,1};
        display(BubbleSort.sort(array));
        
    }
    public static void display(float[] array){
        for(float item : array){
            System.out.print(item + " ");
        }
        System.out.println();
    }
}