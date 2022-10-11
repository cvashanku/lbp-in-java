class extract
{
 public static void main(String args[])
 {
  int d,n=578;
  while(n!=0)
  {
    d=n%10;
    System.out.print(d+"");
    n=n/10;
  }
 }
}