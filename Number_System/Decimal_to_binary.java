package Number_System;

import java.util.Scanner;

public class Decimal_to_binary {
    public static int dectobin1(int n)
    {
         int bin = 0;
        int i=0;
        while(n>0)
        {
            int bit = n%2;
            bin = (int) (bit * Math.pow(10, i++) + bin);
            n = n/2;
        }
       return bin;
    }
    public static int dectobin2(int n)
    {
         int bin = 0;
        int i=0;
        while(n>0)
        {
            int bit = n&1;
            bin = (int) (bit * Math.pow(10, i++) + bin);
            n = n>>1;
        }
       return bin;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         
        System.out.println(dectobin2(n));
    }
}
