package Math;
// TC --> O(d) --> d--> count of digits
public class Countdigits {
    public static int count(int n)
    {
        int c = 0;
        while(n!=0)
        {
            c++;
            n = n /10;
        }
        return c;
    }
    public static void main(String[] args) {
        int n = 456;
        int res = count(n);
        System.out.println(res);
    }
}
