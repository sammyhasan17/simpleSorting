

public class bubbleSort {

    public static void bubbleSortAlgorithm(int[] list) {


        for (int k = 1; k < list.length; k++) { // Array may be sorted and next pass not needed needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {

                if (list[i] > list[i + 1]) {
                    // Swap list[i] with list[i + 1] int temp = list[i];
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                }
            }
        }
    }
    static void bubbleSortAlgorithm2(int[] ray){
        for (int i = 0; i< ray.length; i++){
            for(int j = 1; j< ray.length; j++){
                if (ray[j]<ray[j-1]){
                    //swap
                    int temp = ray[j];
                    ray[j] = ray[j - 1];
                    ray[j -1] = temp;
                }
            }
        }
    }


    public static void main (String[]args){
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        System.out.print("before:\t");
        for (int j : list) {
            System.out.print(j + " ");
        }
        bubbleSortAlgorithm2(list);
        System.out.print("\nafter:\t");
        for (int j : list) {
            System.out.print(j + " ");
        }
    }

}
