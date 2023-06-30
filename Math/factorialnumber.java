package Math;

public class factorialnumber {
    public static int factorial(int n)
    {
        if(n==0)
        return 1;

        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        int n = 13;
        // int res = 1;

        // for(int i=2; i<=n; i++)
        // {
        //     res = res * i;
        // }
        // System.out.println(res);

        System.out.println(factorial(n));
    }
}
