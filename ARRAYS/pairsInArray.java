public class pairsInArray {
    public static void pairs_in_array(int array[]){
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                System.out.print("("+array[i]+", " + array[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int[] array = { 2, 4, 6, 8, 10 };
        System.out.println("Pairs in the given array are:");

        pairs_in_array(array);
    }
}
