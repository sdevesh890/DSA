package Pattern;

import java.util.Scanner;

public class full_pyramid1 {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            for(int i=0; i<n; i++)
            {
                for(int j=0; j<n-i-1; j++)
                {
                    System.out.print(" ");
                }
                for(int j=0; j<i+1; j++)
                System.out.print("* ");

                System.out.println();
            }
            

    }
}
