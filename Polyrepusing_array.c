#include<stdio.h>
struct polynomial
{
    int coeff;
    int expo;
};
void main()
{
    int n,i;
    printf("Enter the highest degree of the polynimial");
    scanf("%d",&n);
   // printf("Enter the largest coefficient and exponent degree of 
    struct polynomial a[n];
    for(i=0;i<n;i++){
        printf("Enter coefficient%d\t",i+1);
        scanf("%d",&a[i].coeff);
        printf("Enter exponent %d\t",i+1);
        scanf("%d",&a[i].expo);
    }
    printf("The required polynimial is");
    for(i=0;i<n-1;i++)
    {
    
        printf("%dx^%d+",a[i].coeff,a[i].expo);
        
    }     
    printf("%dx^%d",a[n-1].coeff,a[n-1].expo);

}
