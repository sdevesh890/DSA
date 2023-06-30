package Math;

public class GCD {
    public static int findgcd(int a,int b)
    {
        if(b==0)
        return a;

        return findgcd(b, a%b);
    }
    public static void main(String[] args) {
        int a = 15;
        int b = 30;

        System.out.println(findgcd(a, b));
    }
}
