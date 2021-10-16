#include<stdio.h> // include stdio.h
unsigned long int factorial(unsigned long int);

int main() 
{
    int n;

    printf("Enter number of rows: ");
    scanf("%d", &n);

    printf("\n");

    // loop for number of rows
    for(int i = 0; i <= n; i++)
    {
        // loop to print leading spaces at each line
        for(int space = 0; space < n - i; space++)
        {
            printf("   ");
        }

        // loop to print numbers in each row
        for(int j = 0; j <= i; j++)
        {
            printf("%-5d ", factorial(i) / (factorial(j) * factorial(i-j) ) );
        }
// print newline character
        printf("\n");
    }    

    return 0;
}

unsigned long int factorial(unsigned long int n)
{
    unsigned long int f = 1;

    while(n > 0)
    {
        f = f * n;
        n--;
    }

    return f;   
}
