import java.util.*;

public class MulArr
{    
    public static void main(String[] args) {
        System.out.println("Enter number of test cases");
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); //number of test cases
        int j = 1;
        while(j<=T)
        {   System.out.println("Test case :"+j);
            System.out.println("Enter number of elements");
            int N =scanner.nextInt(); //number of elements in an array
            System.out.println("Enter elements");
            int a[] = new int[N];
            long mul = 1;
            for(int i=0; i < N; i++)
            {
                a[i] = scanner.nextInt();
                mul*=a[i];
            }
            System.out.println(mul);
            j++;
        }
        scanner.close();
    }
}

