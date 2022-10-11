class sumprime
{
 public static void main(String args[])
 {
  int n=238,s=0,d;
  while(n!=0)
  {
    d=n%10;
    if(d==2||d==3||d==5||d==7)
     {
       s=s+d;
     }
     n=n/10;
  }
   System.out.println(s);
 }
}