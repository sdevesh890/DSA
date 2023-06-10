package Pattern;

import java.util.Scanner;

import javax.xml.transform.Source;

public class hollow_rect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        for(int i=0; i<row; i++)
        {
            if(i==0 || i==row-1)
            {
                for(int j=0; j<col; j++)
                {
                    System.out.print("* ");
                }
            }else 
            {
                System.out.print("* ");
               for(int j=0; j<col-2; j++)
               {
                 System.out.print("  ");
               }
               System.out.print("* ");
            }
            System.out.println();
        }
    }
}
