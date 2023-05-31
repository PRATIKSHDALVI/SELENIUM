package Programs;

public class Reverse_string {

	public static void main(String[] args) {
		String str="mau";
		/*String rstr="";
		for(int i=str.length()-1;i>=0;i--)         //i=2  2>=0
		{                                           // rstr=u   
		rstr=rstr+str.charAt(i);                     //i=1  1>=0
				}                                     //rstr=ua
			System.out.println(rstr);                 //i=0  0>=0 
		}}                                               //rstr=uam
		*/

//using buildfunction
		 StringBuilder sb=new StringBuilder(str);
		  sb.reverse();
		  System.out.println("reverse string:"+sb);
			}
		

	}


