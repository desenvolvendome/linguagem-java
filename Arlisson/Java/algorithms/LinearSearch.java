package algorithms;

public class LinearSearch {

    public static int search(int list[],  int wanted){

        int lengthList = list.length;

        for(int index = 0; index < lengthList; index++) {if(list[index] == wanted){return index;}}

        return -1;
    }
}
