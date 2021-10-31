import java.util.*;
 
class MyClass
{
    
    public static int findMajorityElement(int[] arr)
    {
        int maj = -1,i=0;

        for (int j = 0; j < arr.length; j++)
        {
 
            if (i == 0)
            {
                maj = arr[j];
                i = 1;
            } else if (maj == arr[j]) {
                i++;
            } else {
                i--;
            }
        }
 
        return maj;
    }
 
    public static void main (String[] args)
    {
        
        int[] arr = { 2,2,2,2,3,4,5,3,2 };
 
        int ans = findMajorityElementFromArray(arr);
        if (ans != -1) {
            System.out.println("The majority element is " + ans);
        }
        else {
            System.out.println("The majority element doesn't exist");
        }
    }
}
