class numofdigits
{
 public static void main(String args[])
 {
  int n=12345,d,count=0;
  while(n!=0)
  {
    count++;
    n=n/10;
  }
  System.out.println(count);
 }
}