package Programs;

public class Armstrong_for_loop {
public static void main(String[] args) {
int n = 153,temp,i,sum = 0;
temp=n;
while(n>0)
{
  i=n%10;
  sum+=i*i*i;
  n=n/10;
}
if(sum==temp)
{
  System.out.println(temp+":number is armstrong");         //Armstrong number= 
}
else
{
   System.out.println(temp+":number is not armstrong");
}
}
}


