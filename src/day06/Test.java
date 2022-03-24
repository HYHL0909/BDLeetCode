package day06;

public class Test {
    public static void main(String[] args){
        SpiralOrder so=new SpiralOrder();
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(so.spiralOrder(arr));
    }
}
