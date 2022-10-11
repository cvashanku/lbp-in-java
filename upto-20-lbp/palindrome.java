class palindrome
{
 public static void main(String args[])
 {
  int n=121,r=0,d,temp=n;
  while(n!=0)
  {
   d=n%10;
   r=r*10+d;
   n=n/10;
  }
  System.out.println((temp==r)?"yes":"no");
 }
}