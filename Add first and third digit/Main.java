#include<stdio.h>
int main()
{
  int n,first_digit,third_digit,sum;
  scanf("%d",&n);
  first_digit=n/100;
  third_digit=n%10;
  sum=first_digit+third_digit;
  printf("%d",sum);
  return 0;
}