#include<stdio.h>
void main()
{
int n,i,j,temp,count=0;
count++;
printf("Enter the limit of the array\n");
count++;
scanf("%d",&n);
count++;
int a[n];
count++;
printf("Enter the elements\n");
count++;
for(i=0;i<n;i++)
{
count++;
scanf("%d",&a[i]);
count++;
}
for(i=0;i<n;i++)
{
count++;
for(j=i+1;j<n;j++)
{
count++;
if(a[i]>a[j])
{
count++;
temp=a[i];
count++;
a[i]=a[j];
count++;
a[j]=temp;
count++;
}
count++;
}
count++;
}
count++;
printf("Sorted array is \n");
count++;
for(i=0;i<n;i++)
{
count++;
printf("%d\t",a[i]);
count++;
}
count++;
printf(“Time complexity of selection sort=%d",++count);
printf("Space complexity of selection sort = 4n+20");
}
