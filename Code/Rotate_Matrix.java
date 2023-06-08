import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = m-1;
        while(left<right && top<bottom){
            int prev = mat.get(top+1).get(left);
            for(int i = left;i<right+1;i++){
                int curr = mat.get(top).get(i);
                mat.get(top).set(i,prev);
                prev = curr;
            }
            top+=1;
            for(int i = top;i<bottom+1;i++){
                int curr = mat.get(i).get(right);
                mat.get(i).set(right,prev);
                prev = curr;
            }
            right-=1;
            for(int i=right;i>left-1;i--){
                int curr = mat.get(bottom).get(i);
                mat.get(bottom).set(i,prev);
                prev = curr;
            }
            bottom-=1;
            for(int i=bottom;i>top-1;i--){
                int curr = mat.get(i).get(left);
                mat.get(i).set(left,prev);
                prev = curr;
            }
            left+=1;
        }
    }
}
