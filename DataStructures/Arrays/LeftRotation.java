import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        
        int[] array = new int[n];
        
        for(int a_i = 0; a_i < n; a_i++)
        {
            array[a_i] = in.nextInt();
        }
        
        reverse(array, 0, k-1);
        reverse(array, k, n - 1);
        reverse(array, 0, n-1);
        
        for(int a_i = 0; a_i < n; a_i++)
        {
            System.out.printf("%d ", array[a_i]);
        }
    }
    
    public static void reverse(int[] array, int start, int end)
    {
        while(start < end)
        {
            swap(array, start, end);
            start++;
            end--;
        }
    }
    
    public static void swap(int[] array, int a, int b)
    {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
