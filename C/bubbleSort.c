#include<stdio.h>
#include<stdlib.h>

void bubble(int *a,int n)
{
	int i,j,t;
	for(i=0;i<n-1;i++)
	{
		int count=0;
		for(j=0;j<n-i-1;j++)
		if(a[j]>a[j+1])
		{
			count++;
			t=a[j];
			a[j]=a[j+1];
			a[j+1]=t;
		}
		
		if(count==0)
		break;
	}
}

void main()
{
	int *a,i,n;
	printf("Enter n : ");
	scanf("%d",&n);
	a=(int *)malloc(n*sizeof(int));
	for(i=0;i<n;i++)
	scanf("%d",&a[i]);
	bubble(a,n);
	
	printf("Sorted Array : ");
	for(i=0;i<n;i++)
	printf("%d ",a[i]);
}
