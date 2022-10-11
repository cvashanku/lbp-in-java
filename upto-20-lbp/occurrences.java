class occurrences
{
 public static void main(String args[])
 {
  int n=234556,key=5,d,count=0;
  while(n!=0)
  {
   d=n%10;
   if(d==key)
   count++;
   n=n/10;
  }
  System.out.println(count);
 }
}