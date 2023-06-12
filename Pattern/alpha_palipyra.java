package Pattern;

import java.util.Scanner;

public class alpha_palipyra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            int j =0;
            for( j=0; j<i+1; j++)
            {
                char ch = (char) (65+j);
                System.out.print(ch);
            }
             for(int k=j-1; k>=1; k--)
            {
                char ch = (char) (65+k-1);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
