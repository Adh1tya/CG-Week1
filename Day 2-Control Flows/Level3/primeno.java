import java.util.Scanner;
class prime {
    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isPrime(n))
            System.out.println("true");
        else
            System.out.println("false");
        
    }
}