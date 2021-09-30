package logicalprogramday5;

public class FibonacciSeries {
	static void findSeries(int num, int first, int sec)
	{
		System.out.println(first + " " + sec + " ");
		int counter = 0, sum;
		
		while (counter < num - 2)
		{
			sum = first + sec;
			System.out.println(sum +" ");
			sec = sum;
			counter++;
		}
	}
	public static void main(String[] args) {
		int n = 5;
		int first = 8;
		int sec = 6;
		
		findSeries(n, first, sec);
		
	}

}
