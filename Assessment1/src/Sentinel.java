import java.util.*;
public class Sentinel {

	public static void main(String[] args) {
		int ar[]=new int[2];
		FindMinMax ob=new FindMinMax(ar);
		ar=ob.checkMinMax(); //received the returned array
		}
}

class FindMinMax{
	int ar[]=new int[2];
	Scanner sc=new Scanner(System.in);
	FindMinMax(int ar[])
	{
		this.ar[0]=ar[0];
		this.ar[1]=ar[1];
	}
	public int[] checkMinMax()
	{
	
		int num=0,ip=1,i=0,cnt=0;
		int size=2,ip1=0,ip2=0;
		ar[0]=100000000;
		ar[1]=0;
		System.out.println("Enter a number : ");
		while(ip!=0)
		{
			ip1=ip;
			ip2=ar[0];
			ip=sc.nextInt();
			cnt++;
			if(ip<ar[0])
			{
				ar[0]=ip; // smallest avlue goes in first pos
			}
			if(ip>ar[1])
			{
				ar[1]=ip; // biggest value goes in 2nd pos
			}

		}
		
		if(cnt==1)
		{
			System.out.println("There are no values hence, NULL");
		}
		else
			if(cnt==2)
			{
				System.out.println("The maximum is: " + ip1);
				System.out.println("The minimum is: " + ip1);
			}
			else
			{
				ar[0]=ip2;
				System.out.println("The maximum is: " + ar[1]);
				System.out.println("The minimum is: " +	ar[0]);
			}
		return ar; // returning the array
		
	}
}