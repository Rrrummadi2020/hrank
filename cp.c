// complexity of the progeramme depends upon the no of comparisons that we were made to get the result 
//linear search is used for unordered lists 
// binary search  for ordered list  
/*
// lINEAR SEARCH
#include<stdio.h>
void main()
{
	printf("hello world");
}

#include<stdio.h>
void main()
{
	int n,a[10],k,pos=-1;
	printf("enter the elements of size");
	scanf("%d",&n);
	printf("hello world");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("enter the elements need to be searched ");
	scanf("%d",&k);
	for(int i=0;i<n;i++)
	{
		if(k==a[i])
		{
			pos=i;
			i=n+1;
		}
	}
	if(pos!=-1)
	{	
		printf("required position of the element is %d \n",pos);
	}
}

//BINARY SEARCH

#include<stdio.h>
void main()
{
	int n,a[10],k,pos=-1,beg,end,mid;
	printf("enter the   size of an array");
	scanf("%d",&n)
	;
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	beg=0,end=n-1,mid=(beg+end)/2;
	printf("enter the elements need to be searched ");
	scanf("%d",&k);
	while(beg<=end)
	{
		if(a[mid]<k)
		{
			beg=mid+1;
		}else if(a[mid]>k){
			end=mid-1;
		}else{
			pos=mid;
			beg=1;
			end=0;
		}
		mid=(beg+end)/2;
	}
	printf(" required posi %d",pos);

}
#include<stdio.h>
void main()
{
	int n,a[10],k,pos=-1,t=0,c=0;
	printf("enter the   size of an array");
	scanf("%d",&n);
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(int i=0;i<n;i++)
	{
		if(c==0 && i!=0)
		{
			i=100;
		}
		for(int j=1;j<n-i;j++)
		{
			if(a[j-1]<a[j])
			{
				c++;
				t=a[j];
				a[j]=a[j-1];
				a[j-1]=t;
			}
		}
	}
	for(int i=0;i<n;i++)
	{
		printf("%d",a[i]);
	}
	

}

#include<stdio.h>
void main()
{
	int n,a[10],k,pos=-1,t=0,c=0;
	printf("enter the   size of an array");
	scanf("%d",&n);
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(int i=1;i<n;i++)
	{
		t=a[i];
		int j=i-1;
		while(t<a[j]&&j>=0)
		{
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=t;
	}
	for(int i=0;i<n;i++)
	{
		printf("%d",a[i]);
	}
}


#include<stdio.h>
void main()
{
	int n,a[10],k,pos=-1,t=0,c=0,small=100;
	printf("enter the   size of an array");
	scanf("%d",&n);
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	small=a[0];
	for(int i=0;i<n;i++)
	{
		if(a[i]>small)
		{
			small=a[i];
		}
	}
	printf("%d",small);

}
#include<stdio.h>
void main()
{
	int i=0,a[10],temp=0,k=0,n,small=a[0];
	printf("enter the size of an array : ");
	scanf("%d",&n);
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(int i=0;i<n;i++)
	{
		small=a[i];
		for(int j=i+1;j<n;j++)
		{
			if(a[j]<small)
			{
				small = a[j];
				k=j;
			}
		}
	temp=a[k];
	a[k]=a[i];
	a[i]=temp;
	printf("%d",small);
		
	}
	
}
#include<stdio.h>
void main()
{
	int i=0,res[20],a1[10],a2[10],temp=0,k=0,j,n;
	printf("enter the size of an array : ");
	scanf("%d",&n);
	printf("enter the elements of the first~ array");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a1[i]);
	}
	printf("enter the elements of the second array");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a2[i]);
	}
	int size=2*n;
	i=0,j=0;
	for(int index=0;index<size;index++)
	{
		if(a1[i]<a2[j])
		{
			res[index]=a1[i];
			i++;
		}else{
			res[index]=a2[j];
			j++;
		}
		index++;
	}
	for(int k=0;k<size;k++)
	{
		printf("%d\t",res[k]);
	}
}
#include<stdio.h>
void main()
{
	int a[10],n=5,t=0;
	printf("enter no of values you need to enrter\n");
	scanf("%d\n",&n);
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(int i=0;i<n;i++)
	{
		for(int j=1;j<n-i;j++)
		{
			if(a[j-1]>a[j])
			{
				t=a[j-1];
				a[j-1]=a[j];
				a[j]=t;
			}
		}
	for(int i=0;i<n;i++)
	{
		printf("%d\t",a[i]);
	}
	printf("\n");
	}
}

//bubble sort 
#include<stdio.h>
void main()
{
	int a[12],n=5,t=0,val,beg=0,end=10,mid;
	printf("enter no of values you need to enrter\n");
	scanf("%d\n",&n);
	printf(" please enter values");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("enter the need to be searched for ");
	scanf("%d",&val);
	while(beg<end && a[mid]!=val)
	{
		mid=(beg+end)/2;
		if(a[mid]<val)
		{
			beg=mid+1;
			mid=(beg+end)/2;
		}
		else if(a[mid]>val)
		{
			end = mid-1;
		mid=(beg+end)/2;
		}
		else{
			
		}
	}
	printf("position is %d",mid);
}
#include<stdio.h>
void main()
{
	int a[12],pos=0,small=0,temp=0,key=0,n=5,t=0,val,beg=0,end=10,mid;
	printf("enter no of values you need to enrter\n");
	scanf("%d",&n);
	printf(" please enter values");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	//bubble sort
	// for(int i=0;i<n;i++)
	// {
	// 	for(int j=1;j<n-i;j++)
	// 	{
	// 		if(a[j]<a[j-1])
	// 		{
	// 			temp = a[j];
	// 			a[j]=a[j-1];
	// 			a[j-1]=temp;
	// 		}
	// 	}
	// }
	// insertion sort 
	// for(int i=1;i<n;i++)
	// {
	// 	int j=i-1;
	// 	key = a[i];
	// 	while(key<a[j] && j>=0)
	// 	{
	// 		a[j+1]=a[j];
	// 		j--;
	// 	}
	// 	a[j+1]=key;
	// }
	//selection sort 
	for(int i=0;i<n-1;i++)
	{
		small=i;
		for(int j=i+1;j<n;j++)
		{
			if(a[j]<a[small])
			{
				small=j;
			}
		}
		temp=a[i];
		a[i]=a[small];
		a[small]=temp;
		printf("%d\n",small);
	}
	for(int i=0;i<n;i++)
	{
		printf("%d",a[i]);
	}
	printf("\n");
}
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
*/
//migratory birds

#include<stdio.h>
int main()
{
	int t=0,b[10],l=0,k=0,c[10],z=0,count=0,i=0,max=0,j=0,temp=0,a[10]={1,4,4,4,5,3},n=6;
	//finding thre maximum element in the array
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=0;i<n;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	printf(" max ele of array A: %d\n",max);
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
	printf("\n sorted array A (n)");
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

	printf("\n count array B(l): \n");
	for(i=0;i<l;i++)
	{
		printf("%d\t",b[i]);
	}
	printf("unique ele array C(k) : \n");
	for(i=0;i<n;i++)
	{
		if(a[i]!=a[i+1])
		{
			c[k]=a[i];
			k+=1;
		}	
	}
	if(n==k)
	{
		printf("%d ram",a[0]);
		return 0;
	}
	for(i=0;i<k;i++)
	{
		printf("%d\t",c[i]);

	}
	printf("sorting of count array B(l) \n");
	for(i=0;i<l;i++)
	{
		for(j=1;j<l-i;j++)
		{
			if(b[j-1]<b[j])
			{
				temp = b[j];
				b[j]=b[j-1];
				b[j-1]=temp;
				temp = c[j];
				c[j]=c[j-1];
				c[j-1]=temp;
		
			}
		}
	}
	for(i=0;i<l;i++)
	{
		printf("%d\t",b[i]);

	}
	printf("sorting of unique ele a/c to their count \n ");
	for(i=0;i<k;i++)
	{
		printf("%d\t",c[i]);

	}
	printf("the result is :%d",c[0]);
	
}
