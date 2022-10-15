#include<stdio.h>
int add(int x,int y)
{
int addition=x+y;
return addition;
}
int main()
{
  int a,b,sum;
  printf("enter two number");
  scanf("%d%d",&a,&b);
  sum= add(a,b);
  printf("%d\n",sum);
  return 0;
  }
  
