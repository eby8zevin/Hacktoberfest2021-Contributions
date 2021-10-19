#include<stdio.h>

int main()
{
    int i, j, rowNum, space;
    printf("Enter the Number of Rows:");                          //Size of Diamond
    scanf("%d",&rowNum);
    space = rowNum-1;
    for(i=1; i<=rowNum; i++)
    {
        for(j=1; j<=space; j++)                                    //For Upper Half Of The Diamomd
            printf(" ");
            space--;
        for(j=1; j<=(2*i-1); j++)
            printf("*");
            printf("\n");
    }
    space = 1;
    for(i=1; i<=(rowNum-1); i++)
    {
        for(j=1; j<=space; j++)                                      //For Lower Half Of The Diamomd
            printf(" ");
            space++;
        for(j=1; j<=(2*(rowNum-i)-1); j++)
            printf("*");
            printf("\n");
    }
    printf("\n");
    return 0;
}
