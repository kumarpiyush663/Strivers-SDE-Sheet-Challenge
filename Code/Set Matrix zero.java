import java.io.*;
import java.util.* ;

public class Solution {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(row.contains(i) || col.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }

    }

}