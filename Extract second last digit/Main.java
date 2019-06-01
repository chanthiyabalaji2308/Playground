#include<stdio.h>
int main()
{
  int n,first,last;
  scanf("%d",&n);
  first=n%100;
  last=first/10;
  printf("%d",last);
  return 0;
}