
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) //throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    int arr[]=new int[62];
	    Arrays.fill(arr,0);
	    for (int i=0;i<s.length();i++){
	        if(Character.isLowerCase(s.charAt(i))){
	            int j=(int)s.charAt(i)- 97;
	            arr[j + 26]++;
	        }
	        if(Character.isUpperCase(s.charAt(i))){
	            int j=(int)s.charAt(i)- 65;
	            arr[j]++;
	        }
	        if(Character.isDigit(s.charAt(i))){
	            int j=(int)s.charAt(i)- 48;
	            arr[j + 52]++;
	        }
	    }
	    for(int i=0;i<62;i++){
	        if(arr[i]>0){
	            if(i>=0 && i<=25){
	                System.out.println((char)(i + 65) +"-"+arr[i]);
	            }
	            else if(i>=26 && i<=51){
	                System.out.println((char)((i - 26)+ 97) +"-"+arr[i]);
	            }
	            else{
	                System.out.println((char)((i- 52)+ 48) +"-"+arr[i]);
	            }
	        }
	    }
	    
	}
}
