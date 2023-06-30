package Math;

public class palindromenumber {
    static int rev(int x)
    {
        int n = x;
        int res = 0;
        while(n!=0)
        {
            int rem = n%10;
            res = res * 10 + rem;
            n = n/10;
        }
        return res;
    }
    public static void main(String[] args) {
        int x = 101;

         if(x<0)
        System.out.println("False");
        if(x<9)
         System.out.println("False");

        if(x==rev(x))
          System.out.println("True");
        else 
         System.out.println("False");
    }
}
