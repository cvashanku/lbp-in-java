class reverse1
{
 public static void main(String args[])
 {
  int n=123,d;
  while(n!=0)
  {
   d=n%10;
   System.out.print(d);
   n=n/10;
  }
 }
}