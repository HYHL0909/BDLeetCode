package day12;

import java.util.Scanner;

/*
* 输入：
- 第一行输入，表示一共有 N 组数据.
- 第二个是 N 个空格分隔的整数，H1, H2, H3, ..., Hn 代表建筑物的高度
输出：
- 输出一个单独的数表示完成游戏所需的最少单位的初始能量
*/
public class Test {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int res=0;
        for(int i=n-1;i>=0;i--){
            res=(res+arr[i]+1)/2;
        }
        System.out.println(res);
    }
}
