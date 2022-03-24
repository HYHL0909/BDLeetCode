package day06;
import java.util.Scanner;

/*
* 输入：
- 第一行包含两个数 n 和 X 。
- 接下来 n 行包含每个游戏的信息，原价 ai,现价 bi，能获得的快乐值为 wi 。
输出：
- 输出一个数字，表示你能获得的最大快乐值。
*
* 思路：如果已经超出预算并且所获得的优惠没有超过预算，那么这就不买，
* 否则就买
*/

public class BD_greedy {
    static int maxw=0;
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int x=scn.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        int[] w=new int[n];
        int[] profit=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scn.nextInt();
            b[i]=scn.nextInt();
            w[i]=scn.nextInt();
            profit[i]=a[i]-b[i];
        }
        maxHappy(b,w,profit,x);
        System.out.println(maxw);
    }

    private static void maxHappy(int[] b, int[] w, int[] profit,int x) {
        int cur_profit=0;
        int cur_pay=0;
        for (int i = 0; i < b.length; i++) {

            if((cur_pay+b[i])>x&&(cur_profit+profit[i])<Math.abs(x-cur_pay-b[i])){

                //如果这个东西花的钱超过预算，而且优惠没有超过预算
//                不买这个，直接跳过
            }
            else{
                cur_pay+=b[i];
                cur_profit+=profit[i];
                maxw+=w[i];
            }
        }
    }
}
