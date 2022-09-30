#include<stdio.h>
void main()
{
int n,i,num,l,r,m,c=0,count=0;
count++;
printf("Enter the limit of the array \n");
count++;
scanf("%d",&n);
count++;
int a[n];
count++;
printf("Enter the elements in ascending order\n");

count++;
for(i=0;i<n;i++)
{
count++;
scanf("%d",&a[i]);
count++;
}
count++;
printf("Enter the element to be searched\n");
count++;
scanf("%d",&num);
count++;
l=0;
count++;
r=n-1;
count++;
while(l<=r)
{
count++;
m=(l+r)/2;
count++;
if(a[m]==num)
{
count++;
c=1;
count++;
printf("Element found at index %d\n",m);
count++;
break;
}
else if(a[m]>num)
{
count++;
r=m-1;
count++;
}
else
{
count++;
l=m+1;
count++;
}
count++;
}
count++;
if(c==0)
{
count++;
printf("Element not found\n");
count++;
}
count++;
printf("The time complexity of binary search =%d\n",++count);
printf("The space complexity of binary search = 4n+32");

}
