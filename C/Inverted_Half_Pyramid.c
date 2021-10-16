#include <stdio.h>

int main()
{
    int rows;

    printf("Enter number of rows:");       
    scanf("%d",rows);                                    // No. of rows the user wants in the pyramid

    for(int i = rows; i >= 1; --i)                  // The condition differs from the usual case since we are descending
    {
        for(int j = 1; j <= i; ++j)
        {
            printf("*");                          // If no. of columns are less than equal to the no. of rows we go on printing stars
        }
        printf("\n");                             // To skip to a new line
    }
    
    return 0;
}
