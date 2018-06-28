import java.util.Scanner;
public class HailstoneSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		num=sc.nextInt();

		ComputeTask cp=new ComputeTask(num);
		int cnt=cp.checkEvenOdd();
		cp.display(cnt);
	}

}

class ComputeTask{
	int num,o_num,cnt=0;
	public ComputeTask(int num) {
		this.num=num;
	}
	//o_num num;
	int checkEvenOdd(){
		while(num!=1){
			if(num%2==0){
				System.out.print(num);
				num=num/2;
				System.out.println(" is even so half of it is " + num);
			}
			else
			{
				System.out.println(num);
				num=(num*3)+1;
				System.out.println("is odd so i make (3n+1)" + num);
			}
			cnt++;
		}
		return cnt;
	}
	public void display(int cnt)
	{
		System.out.println("There are total of " + cnt + "Steps to reach 1.");
	}
}