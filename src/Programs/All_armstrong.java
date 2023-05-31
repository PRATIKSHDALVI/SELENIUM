package Programs;

public class All_armstrong {
public static void main(String[] args) {
int n ,i,sum =0,b;

for(i=100;i<=999;i++)
{
n=i;
while(n>1)
{
		  b=n%10;
		  sum=sum+(b*b*b);
		  n=n/10;
}
if(sum==i)
{
	 System.out.println(i+"");         //Armstrong number= 
}
}}}



