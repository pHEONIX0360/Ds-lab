#include<stdio.h>
void main()
{
int n,i,j,temp,count=0;
count++;
printf("enter the limit\n");
count++;
scanf("%d",&n);
count++;
int a[n];

count++;
printf("enter the elements\n");
count++;
for(i=0;i<n;i++)
{
count++;
scanf("%d",&a[i]);
count++;
}
count++;
for(i=0;i<n;i++)
{
count++;
for(j=0;j<n-i-1;j++)
{
count++;
if(a[j]>a[j+1])
{
count++;
temp=a[j];
count++;
a[j]=a[j+1];
count++;
a[j+1]=temp;
count++;
}
count++;
}
count++;
}
count++;
printf("sorted array\n");
count++;
for(i=0;i<n;i++)
{
count++;
printf("%d\t",a[i]);
count++;
}
count++;
printf("time complexity of bubble sort =%d \n",++count);
printf("space complexity of bubble sort = 4n+20 ");
}
