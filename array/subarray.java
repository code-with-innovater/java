// a continous part of array
// solved in 3 nested loop
public class subarray{
    public static void subarray(int number[]){
        int ts=0;
        for(int i=0;i<number.length;i++){
            int start =i;
            int claculate =ts+i;
            for(int j=i;j<number.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(number[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarray = "+ts);
    }
    public static void main(String args[]){
        int number[] = {2,4,6,8,10,12};
        subarray(number);
    }
}