#include<stdio.h>
void main()
{
	int big=0,k=0,n=13,temp=0,count=0,c=0,a[]={1,1,2,2,3,3,3,3,3,4,4,4,5},b[10];
	for(int i=0;i<n;i++)
	{
		for(int j=1;j<n-i;j++)
		{
			if(a[j-1]>a[j])
			{
				temp=a[j-1];
				a[j-1]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int i=0;i<n;i++)
	{
		c=i;
		count = 0;
		while((a[i+1]-a[c])<=1)
		{
			count++;
			i++;
		}
		count++;
		if(big<count)
		{
			big=count;
		}
		printf("%d\t",count);	
	}
	printf("%d",big);
}