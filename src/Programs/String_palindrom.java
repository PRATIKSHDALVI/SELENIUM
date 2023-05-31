package Programs;                         
                                                               
public class String_palindrom {           
public static void main(String[] args) {
String s1="maam";
String rstr="";
for(int i=s1.length()-1;i>=0;i--)       //i=3  3>=0  
{                                        //i=m                            
       rstr=rstr+s1.charAt(i);         //i=2  2>=0        
}                                         //i=a     
	System.out.println(rstr);          //i=1  1>=0                       
				                          //i=a    
if(s1.equals(rstr))                      //i=0  0>=0
{                                          //i=m        rstr=maam     s1=maam
	System.out.println(rstr+"=is palindrome");           //s1.equals rstr  yes              
			                                                     // thats way string is palindrom   
}
else
{                                           
System.out.println(rstr+"=is not palindrome");//string palindrom=string is said to be palindrom,
}                                             //if we start reding string from left to right or
}                                              //right to left it is same as original string                     
}                                             




