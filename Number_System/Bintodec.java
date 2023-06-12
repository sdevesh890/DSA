package Number_System;

import java.util.Scanner;

public class Bintodec {
    public static int bintodec(int n)
    {
        int res = 0;
        int i = 0;
        while(n>0)
        {
            int bit = n%10;
            res = (int) (res + bit * Math.pow(2, i++));
            n = n/10;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(bintodec(n));

    }
}
