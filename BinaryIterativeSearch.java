public class BinaryIterativeSearch implements Practice03Search {

    int search1 (int[]a, int target, int low, int high){

        if(low>high){
            return -1;
        }
        int mid = (high + low)/2;
        if (a[mid] == target){
            return mid;
        }
        if (target > a[mid]){
            return search1(a, target, mid+1, high);
        }else{
            return search1(a, target, low, mid-1);
        }


    }


    @Override
    public String searchName() {
        return "Binary Iterative Search";
    }

    @Override
    public int search(int[] arr, int target) {
        return search1(arr, target, arr[0], arr.length-1);



    }

}
