#include <stdio.h>

int main()
{
    int rows, number = 1;

    printf("Enter number of rows of Floyd's Triangle to print:");
    scanf("%d",&rows);

    for(int i = 1; i <= rows; i++)
    {
        for(int j = 1; j <= i; ++j)                    /* If the no. of columns are less than or equal to the no. of rows we go on
        {
            printf("%d",number);                                 printing the number and incrementing it each time*/
            printf(" ");
            ++number;
        }
        printf("\n");
   }
     return 0;
}
