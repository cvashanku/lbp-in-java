class divisible3
{
 public static void main(String args[])
 {
  int n=234567,s=0,d;
  while(n!=0)
  {
   d=n%10;
   if(d%3==0)
    s=s+d;
    n=n/10;
  }
   System.out.println(s);
 }
}