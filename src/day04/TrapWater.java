package day04;

public class TrapWater {
    public int trap_double_pointer(int[] height){
        int res=0;
        int n=height.length;
        if(n<=1)
            return res;
        int l_max=height[0];
        int r_max=height[n-1];
        int left=0,right=n-1;
        while (left<right){
            l_max=Math.max(height[left],l_max);
            r_max=Math.max(height[right],r_max);
            if(l_max>r_max){
                res+=(r_max-height[right]);
                right--;
            }
            else{
                res+=(l_max-height[left]);
                left++;
            }
        }
        return res;
    }
    public int trap_table(int[] height){
        int res=0;
        int n=height.length;
        if(n<=1)
            return res;
        int[] l_max=new int[n];
        int[] r_max=new int[n];
        l_max[0]=height[0];
        r_max[n-1]=height[n-1];
        for (int i = 1; i < n; i++) {
            l_max[i]=Math.max(l_max[i-1],height[i]);
        }
        for (int i = n-2; i>=0 ; i--) {
            r_max[i]=Math.max(r_max[i+1],height[i]);
        }
        for (int i = 0; i < n; i++) {
            res+=Math.min(l_max[i],r_max[i])-height[i];
        }
        return  res;

    }

    public int trap_brute(int[] height) {
        int res=0;
        int n=height.length;
        if(n<=1)
            return res;
        for (int i = 1; i < n; i++) {
            int l_max=0,r_max=0;
            for (int j = i; j < n; j++) {
                r_max=Math.max(r_max,height[j]);
            }
            for (int j = i; j >=0; j--) {
                l_max=Math.max(l_max,height[j]);
            }
            res+=(Math.min(r_max,l_max)-height[i]);
        }
        return res;
    }
}
