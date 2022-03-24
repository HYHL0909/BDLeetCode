package day05;

public class Reverse {
    public int reverse(int x){
       if(x==Integer.MIN_VALUE)
           return 0;
        int res=0;
        int sign=1;
        if(x>0)
            sign=0;
        x=Math.abs(x);
        while(x!=0){
            int temp=x%10;
            if(res>Integer.MAX_VALUE/10){
                res=0;
                break;
            }
            res=res*10+temp;
            x=x/10;
        }
        if(sign==1)
            res=-res;

        return res;


//        if(temp<Integer.MIN_VALUE/10)
//            res=0;


    }
    public static void main(String[] args){
        System.out.println(Math.abs(Integer.MIN_VALUE));
    }


}
