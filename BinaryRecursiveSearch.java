public class BinaryRecursiveSearch implements Practice03Search{

    @Override
    public String searchName() {
        return "Binary Recursive Search";
    }

    public int search (int[]a, int target){
        int low = 0;
        int high = a.length -1;
        while (low <= high){
            int mid = (low+high)/2;
            if (a[mid] == target){
                return mid;
            }
            else if (target>a[mid]){
                low = mid+1;
            }else{
                high = mid-1;
            }

        }
        return -1;

    }
}
