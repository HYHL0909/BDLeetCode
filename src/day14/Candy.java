package day14;

public class Candy {
    public int candy(int[] ratings) {
        int res=0;
        int len=ratings.length;
        int[] left=new int [len];
        left[0]=1;
        for (int i = 1; i < len; i++) {
            if(ratings[i]>ratings[i-1]){
                left[i]=left[i-1]+1;
            }
            else{
                left[i]=1;
            }
            res+=left[i];
        }

        for (int i = len-1; i>=0;i--) {
            if(ratings[i-1]>ratings[i]){
                left[i-1]++;
                res++;
            }
        }
        return res;
    }
}
