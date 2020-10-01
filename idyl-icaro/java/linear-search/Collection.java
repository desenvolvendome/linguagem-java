public class Collection {
    private int[] collection; 
    
    public Collection(int[] collection){
        this.collection = collection;
    } 
    
    public int find(int value) {
        for(int interator =0; interator< this.collection.length ; interator++){
            if(this.collection[interator] == value)
                return interator; 
        }
        return -1;
    }
}