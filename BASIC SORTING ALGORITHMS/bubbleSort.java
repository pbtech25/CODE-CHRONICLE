public class bubbleSort{
    public static void bubble_sort(int arr[]){
        for(int turn = 0; turn < arr.length -1; turn++){
            for(int j=0; j<arr.length-turn-1; j++){
                if (arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for(int k : arr){
            System.out.print(k + " ");
        }
    }

    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};

        bubble_sort(arr);
    }
}