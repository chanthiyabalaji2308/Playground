#include <stdio.h>
int main() 
{
int n;
  scanf("%d",&n);
  for(int st=1;st<=n;st++)
  {
    printf("%d",st);
  if((st%3==0)&&(st!=n))
  {
    printf(",");
  }
  }
    return 0;
}