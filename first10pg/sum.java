class sum
{
 public static void main(String args[])
 {
  int s=0,n=143,d;
  while(n!=0)
  {
   d=n%10;
   s=s+d;
   n=n/10;
  }
    System.out.println(s);
 }
}