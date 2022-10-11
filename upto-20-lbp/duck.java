class duck
{
 public static void main(String args[])
 {
  int n=123,d,flag=0;
  while(n!=0)
  {
    d=n%10;
    if(d==0)
    {
     flag=1;
     break;
    }
     n=n/10;
  }
  System.out.println((flag==1)?"yes":"no");
 }
}