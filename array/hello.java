public class hello {
public static void liner(int a,int key){
    for(int i = 0; i<a.lengthl;i++){
        if(a[i] == key){
            return a[i];
        }
    }
    return -1;
}
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int key = 5;
        System.out.println(liner(a, key));
    }
}
