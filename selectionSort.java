public class selectionSort {

    static void selectionSortAlgorithm(int[] ray){
        //variables we will use
        int i,j,cMin;

        //for each number in the array..
        for(j = 0; j < ray.length-1;j++){
            //we set our current minimum to j
            cMin = j;
            //i will be the number after j, so we can compare
            i = j + 1;
            //go though rest of the numbers in the array
            while (i<ray.length) {
                //set new lowest number to cMin
                if (ray[i]< ray[cMin]){
                    cMin = i;
                }
                //if we did find a number that is less than j
                if (cMin != j){
                    //we then swap lower number and current minimum
                    int temp = ray[cMin];
                    ray[cMin] = ray[j];
                    ray[j] = temp;
                }
                i++;
            }
        }
    }

    public static void main(String[] args) {

        int[] ray = { 2,8,6,3,9,4,1 };
        selectionSortAlgorithm(ray);



      System.out.println("Sorted array:");
      for (int i : ray) {
            System.out.print(i + " ");
        }
    }
}
