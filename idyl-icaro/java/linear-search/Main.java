class Main {
    public static void main(String[] args) {
        int [] array = {20,1,23,40,243,5};
        Collection collection = new Collection(array);
        System.out.println(collection.find(1));
        System.out.println(collection.find(2));
        System.out.println(collection.find(5));
        System.out.println(collection.find(6));
        
    }
    
}