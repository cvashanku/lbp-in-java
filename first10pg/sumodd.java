class sumodd
{
 public static void main(String args[])
 {
  int n=2367,s=0,d;
  while(n!=0)
  {
    d=n%10;
    if(d%2!=0)
     {
       s=s+d;
     }
     n=n/10;
  }
  System.out.println(s);
 }
}