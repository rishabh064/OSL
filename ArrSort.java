import java.util.*;

public class ArrSort {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<n;i++)
        {   
            for (int j=0;j<n;j++)
            {
                if (Math.abs(arr[j])>Math.abs(arr[i]))
                {
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for (int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
