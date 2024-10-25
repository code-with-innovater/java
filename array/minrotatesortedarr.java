public class minrotatesortedarr {
    public  static int minNumber(int arr[],int low,int high)
    {
        // Your code here
        while(low<high){
            int mid = (low+high)/2;
            if(arr[mid]>arr[high]){
                low = mid +1;
            }else{
                high = mid;
            }
        }
        return arr[low];
    }
    public static void main (String args[]){
        int arr[] = {2,3,4,5,6,7,8,9,10,1};
        System.out.println("your answer is:"+minNumber(arr,0,arr.length-1));
    }
}
