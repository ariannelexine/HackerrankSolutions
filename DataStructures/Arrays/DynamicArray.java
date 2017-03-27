import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int Q = in.nextInt();
        
        ArrayList<ArrayList<Integer>> seqList = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < N; i++)
        {
            seqList.add(new ArrayList<Integer>());
        }
        
        int lastAns = 0;
        
        for(int i = 0; i < Q; i++)
        {
            //read each line
            int query = in.nextInt();
            int x = in.nextInt(), y = in.nextInt();
            int seq = (x ^ lastAns) % N;
            
            if(query == 1)
            {
                seqList.get(seq).add(y);
            }
            
            else if(query == 2)
            {
                int size = seqList.get(seq).size();
                int index = y % size;
                lastAns = seqList.get(seq).get(index);
                System.out.printf("%d\n", lastAns);
            }
        }
    }
}
