#include<stdio.h>
 int sum(int x,int y)
 {
 int sum=x+y;
 return sum;
 }
      int mult(int x,int y)
      {
       int mult=x*y;
       return mult;
      }

  int main()
{
 int a,b,choice,result;
  printf("enter two no");
  scanf("%d%d",&a,&b);
  printf("enter your choice:1 for add,2 for multiply");
  scanf("%d",&choice);
  if(choice==1){
     result=sum(a,b);
     printf("%d\n",result);
     }
  if(choice==2){
     result=mult(a,b);
     printf("%d\n",result);
     } 
     return 0;
  } 
  







