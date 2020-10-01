public class BubbleSort {
    static public float[] sort(float[] array) {
        float[] newArray = array;
        float temp = 0;
        for(int i =0; i< newArray.length - 1; i++){
            for(int j =0; j < newArray.length - i - 1; j++){
                if(newArray[j] > newArray[j+1]){
                temp = newArray[j];
                newArray[j] = newArray[j+1];
                newArray[j+1] = temp;
                }
            }   
        }
        return newArray;
    }
}