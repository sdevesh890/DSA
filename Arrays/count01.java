package Arrays;

import java.util.Scanner;

public class count01 {
    public static void main(String[] args) {
        int arr[] = {0,1,0,0,0,0,1,1,0};
        int zero = 0;
        int ones = 0;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==0)
            zero++;
            else
            ones++;
        }
        System.out.print("Zero "+zero+" "+"Ones "+ones);
    }
}
