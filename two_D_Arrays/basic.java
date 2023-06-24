package two_D_Arrays;
public class basic {
    public static void main(String[] args) {
        //declared the 2-d array
        int arr[][]=new int[2][3];
        int brr[][] = {{1,2,3},{4,5,6}};

        //access the array
        int row = brr.length;
        int col = brr[0].length;
        
        // row wise
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }
        // column wises
        for(int i=0; i<col; i++)
        {
            for(int j=0; j<row; j++)
            {
                System.out.print(brr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
