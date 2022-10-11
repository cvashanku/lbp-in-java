class sumby3
{
 public static void main(String aargs[])
 {
  int n=2345678,s=0,d;
  while(n!=0)
  {
    d=n%10;
    if(d==3||d==6||d==9)
     s=s+d;
     n=n/10;
  }
  System.out.println(s);
 }
}