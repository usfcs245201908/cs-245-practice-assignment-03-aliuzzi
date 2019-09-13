public class LinearSearch implements Practice03Search{
        //best run time is O(1)
        //worst case is O(n)
        //average case is O(n/2)

    @Override
    public String searchName() {
        return "Linear Search";
    }

    public int search(int [] arr, int target){
        for(int i=0; i<arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }

        }return -1;
        }


}
