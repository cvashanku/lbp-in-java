class year
{
   public static void main(String[] args) 
  {
        int year = 2024;
        if((year%100!=0)&&(year%4==0)||(year%400==0))
            System.out.println("leaf year");
        else
            System.out.println("not leaf year");
    }
}