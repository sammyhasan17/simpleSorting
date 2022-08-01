


class insertionSort {

public static void insertionSortAlgorithm(int[] list) {
    for (int i = 1; i < list.length; i++) {
        /* Insert list[i] into a sorted sublist list[0...i-1] so that
         list[0...i] is sorted. **/
        int currentElement = list[i];
        int k;
        //goes backwards and compares of previous is greater than current element
        for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
            //keeps moving up previous values until k is not greater than current element
            list[k + 1] = list[k];
        }

        // Insert the current element into list[k + 1]
        list[k + 1] = currentElement;
    }
}
public static void insertionSortAlgorithm2(int[] list){

    int i, key,temp;

    for (i = 1; i < list.length; i++){
        key = list[i];
        //j is the element before i
        int j = i - 1;
        while (j>=0 && key<list[j]){
            //swap
            //put i in temp
            temp = list[j];
            //move j into i position,move over 1 to the right
            list[j] = list[j+1];
            //put in the temp as j
            list[j+1] = temp;
            j--;

        }
    }
}

    public static void main(String[] args) {
        //original array is initialized
        int[] ray = {1,6,4,6,7,2,2,5};
        //sorts array
        insertionSortAlgorithm(ray);
        insertionSortAlgorithm2(ray);

        //prints sorted array
        System.out.println("Sorted array:");
        for (int i : ray) {
            System.out.print(i + " ");
        }
        insertionSortAlgorithm2(ray);
        System.out.println("\nSorted array another way (should be same):");
        for (int i : ray) {
            System.out.print(i + " ");
        }


    }
}