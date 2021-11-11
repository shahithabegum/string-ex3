import java.util.*;
import java.lang.*;
class se2
{
  public static void main(String arg[])
   {
     try
         {
            String s="This Excerise 1";
            String s1="This Excerise 1";
	int r=s.compareTo(s1);
	if(r==1)
	  {
	    System.out.println(s+" is less "+s1);
	   }
	   else{
	         System.out.println(s+" equal to "+s1);
	 }
	}
	catch(Exception e)
	{
	  System.out.println(e);
	}
       }
}