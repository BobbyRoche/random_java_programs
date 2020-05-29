import java.util.*;
public class x 
{
    public static int x(int n)
    {
        if(n<=1)
            return 1;
        if(n == 2)
            return 3;
        else
            return x(n-1) - 2*x(n-2);
    }
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number 'n': ");
        int n = scanner.nextInt();
        System.out.println(x(n));
    
}
}