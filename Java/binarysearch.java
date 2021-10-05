import java.util.Scanner;

public class binarySearch {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        int t=s.nextInt();
        int r=n-1;
        int l=0;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(arr[mid]==t) {
                System.out.println(mid);
                return;
            }
            else if(arr[mid]>t)
                r=mid-1;
            else
                l=mid+1;

        }
        System.out.println(-1);
    }
}
