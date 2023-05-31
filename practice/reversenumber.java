package practice;

public class reversenumber {

	public static void main(String[] args) {
		int orgno=512;
        int revno=0;

for(int i=orgno;i>0;i=i/10)               //             i=1234  i>0    rem=1234%10=4  revno=0*10+4=4   
{                                         //i=1234/10=123   i=123    i>0   rem=123%10=3   revno=4*10+3=43
	int	rem=i%10;                         //i=123/10=12    i=12     i>0   rem=12%10=2    revno=43*10+3=432
	revno=revno*10+rem;                   //i=12/10=1     i=1      i>0   rem=1%10=1     revno=432*10+1=4321
}                                         //i=1/10=0      i=0      0>0  false
System.out.println("original no="+orgno);
System.out.println("reverse no="+revno);
}
}
