package day09;

import java.util.Arrays;
import java.util.Scanner;

//给定一组非负整数，重新排列它们的顺序使之组成一个最大的整数。
//输入：[10,1,2]
//        输出：2110
public class MaxInteger {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String in = sc.nextLine();
        String[] sNums = in.substring(1, in.length()-1).split(",");
        System.out.println(Arrays.toString(sNums));
        Arrays.sort(sNums,(o2,o1) -> (o1 + o2).compareTo((o2 + o1)));
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < sNums.length; i++) {
            sb.append(sNums[i]);
        }
        System.out.println(sb.toString());
    }
}
