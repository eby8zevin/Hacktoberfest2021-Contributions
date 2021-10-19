#include<stdio.h> // include stdio.h

int main() 
{
    int n;

    printf("Enter number of lines: ");
    scanf("%d", &n);

    printf("\n");

    // loop for line number of lines
    for(int i = 1; i <= n; i++)
    {   
        // loop to print leading spaces in each line
        for(int space = 0; space <= n - i; space++)
        {
            printf("   ");
        }

        // loop to print *
        for(int j = 1; j <= i * 2 - 1; j++)
        {
            printf(" * ");
        }               

        printf("\n");
    }

    return 0;
}
