package two_D_Arrays;

/**
 * Linearsearch
 */
public class Linearsearch {

    public static void main(String[] args) {
        
        int arr[][] = {{2,45,23,78},{11,12,21,32},{56,55,35,42}};
        int target = 57;
        int row = arr.length;
        int col = arr[0].length;
        boolean flag = false;
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(arr[i][j]==target)
                {
                    flag = true;
                    break;
                }
            }
        }
        if(flag)
         System.out.println("YES");
         else
          System.out.println("NO");

    }
}