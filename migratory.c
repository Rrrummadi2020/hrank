#include<stdio.h>
void main()
{
	int t=0,b[10],l=0,c[10],z=0,count=0,i=0,max=0,j=0,temp=0,a[13]={1,2,3,4,5,4,3,2,1,3,4},n=11;
	//finding thre maximum element in the array
	for(i=0;i<n;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	printf("%d\n",max);
	//sorting of an array
	for(i=0;i<n;i++)
	{
		for(j=1;j<n;j++)
		{
			if(a[j]<a[j-1])
			{
				temp=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
			}
		}
	}
	printf("\n sorted array: a[] \n");
	for(i=0;i<n;i++)
	{
		printf("%d\t",a[i]);
	}
	printf("\n");
	//counting of each element
	for(i=0;i<=max;i++)
	{
		for(j=0;j<n;j++)
		{
			if(i==a[j])
			{
				count++;
			}
		}
		if(count!=0)
		{
		b[l]=count;
		l++;
		}
		count=0;
	}

	printf("\n count array: b[l] \n");
	for(i=0;i<l;i++)
	{
		printf("%d\t",b[i]);
	}
	printf("\n");
    for(i=0;i<n;i++)
	{
        while(a[i]==a[i+1])
        {
            i++;
        }
        if(a[i]!=a[i+1])
        {
            c[z]=a[i];
            z++;

        }
	}
    printf("unique aray c[z] \n");
    for(i=0;i<z;i++)
	{
		printf("%d\t",c[i]);
	}
    printf("\n sorted count aray b[l] \n");
    for(i=0;i<l;i++)
	{
		for(j=1;j<l;j++)
		{
			if(b[j]<b[j-1])
			{
				temp=b[j];
				b[j]=b[j-1];
				b[j-1]=temp;

				temp=c[j];
				c[j]=c[j-1];
				c[j-1]=temp;
			}
		}
	}
    for(i=0;i<l;i++)
	{
		printf("%d\t",b[i]);
	}
    printf("\n maximum ans \n");
    for(i=0;i<l;i++)
	{
		while(b[l-1]==b[l-2])
        {
            l--;
        }
        if(b[l-1]!=b[l-2])
        {
            printf("%d",c[l-1]);
            i=l+1;
        }
	}
    

	
}
