package two_D_Arrays;

public class max_min {
    public static void main(String[] args) {
        int arr[][] = {{12,45,78,11},{10,5,89,44}};
        int row = arr.length;
        int col = arr[0].length;
   
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(arr[i][j]>max)
                {
                    max = arr[i][j];
                }
                if(arr[i][j]<min)
                {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("MAX : "+max+" "+"MIN :"+min);

    }
}
