package day13;

public class test {
    public static void main(String[] args){
        MergeArray ma=new MergeArray();
        int[] arr1={1,2,3,0,0,0};
        int m= 3;
        int[] arr2={2,5,6};
        int n=3;
        ma.merge(arr1,3,arr2,3);
    }
}
