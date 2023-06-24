package two_D_Arrays;

public class row_sum {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{7,8,9},{4,12,45}}; 
        int row = arr.length;
        int col = arr[0].length;
        
        for(int i=0; i<row; i++)
        {
            int sum = 0;
            for(int j=0; j<col; j++)
            {
              sum+=arr[i][j];
            }
            System.out.println(sum);
        }

    }
}
