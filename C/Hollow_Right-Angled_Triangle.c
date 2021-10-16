#include<stdio.h> // include stdio.h

int main() 
{
    int n;

    printf("Enter number of lines: ");
    scanf("%d", &n);

    printf("\n");

    // loop for number of lines
    for(int i = 1; i <= n; i++)
    {
        for(int j = 1; j <= i; j++)
        {
            //  print * only on the first line, last column of every line and on the last line
            if(j == 1 || j == i || i == n)
            {
              printf("* ");
            }

            else
            {
                printf("  ");    
            }            
        }
        printf("\n");
    }

    return 0;
}
