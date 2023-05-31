package Programs;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 125,temp,i,sum = 0;
		temp=n;
		while(n>0)                  //n=125   temp=125    125>0     i=125%10=5   sum=5*5*5+0=125   n=125/10=12
	{                               //n=12   12>0        i=12%10=2    sum=2*2*2+125=133   n=12/10=1
		i=n%10;                     //n=1    1>0         i=1%10=1     sum=1*1*1+133=134   n=1/10=0
		sum=sum+i*i*i;
		n=n/10;
	}
	if(sum==temp)                  //sum=134   false    not armstrong number
	{
		System.out.println(temp+":number is armstrong");
	}
	else
	{
	    System.out.println(temp+":number is not armstrong");
	}
	}
}
