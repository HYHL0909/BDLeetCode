package day06;

import java.util.LinkedList;
import java.util.List;

public class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        List<Integer> res=new LinkedList<>();
        int top=0,down=row-1,left=0,right=col-1;
        while(true){
            for(int i=left;i<=right;i++){
                res.add(matrix[top][i]);
            }
            top++;
            if(down<top)
                break;
            for(int i=top;i<=down;i++)
            {
                res.add(matrix[i][right]);
            }
            right--;
            if(right<left)
                break;
            for (int i = right; i >=left ; i--) {
                res.add(matrix[down][i]);
            }
            down--;
            if(down<top)
                break;
            for (int i = down; i >=top; i--) {
                res.add(matrix[i][left]);
            }
            left++;
            if(right<left)
                break;
        }

        return res;
    }
}
