import java.util.* ;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation)
    {
        // Write your code here.
        boolean found = false;
        for(int i = permutation.size()-1;i>0;i--){
            if(permutation.get(i)>permutation.get(i-1)){
                int j = i+1;
                int k = permutation.get(i);
                int kIdx = i;
                while(j<permutation.size()){
                    if(permutation.get(j)<k && permutation.get(j)>permutation.get(i-1)){
                        k = permutation.get(j);
                        kIdx = j;
                    }
                    j++;
                }
                permutation.set(kIdx,permutation.get(i-1));
                permutation.set(i-1,k);
                Collections.sort(permutation.subList(i, permutation.size()));
                found = true;
                break;
            }
        }
        if(!found) Collections.sort(permutation);
        return permutation;
    }
}
