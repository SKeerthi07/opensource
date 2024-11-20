import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) //throws java.lang.Exception
	{
		HashMap<Integer,Integer> h= new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            h.put(arr[i],h.getOrDefault(arr[i],0)+ 1);
        }
        for(Integer i: h.keySet()){
            if(h.get(i)>1){
                System.out.println(i);//Prints duplicates
            }
        }
        System.out.print(h.keySet());//print arr without duplicates
	}
}
