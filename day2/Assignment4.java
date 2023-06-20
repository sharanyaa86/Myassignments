package week1.day2;

public class Assignment4 {
public static void main(String[] args) {
	int range = 8;
	int firstNum = 0;
	int secondNum = 1;
	System.out.println("Fibonacci Series" + range);
	for (int i = 0; i <=range; i++) {
		System.out.println(firstNum);
		
		int sum =firstNum + secondNum;
		firstNum = secondNum;
		secondNum = sum;
		
	}			
}
}
