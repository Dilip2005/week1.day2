package week1.day2.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 8 ,firstnum=0, secnum=1;
		System.out.println(firstnum);
		for(int i=1;i<=range;i++)
		{
		int sum;
		sum=firstnum+secnum;
		firstnum=secnum;
		secnum=sum;
	System.out.println(sum);
		}
	}

}
