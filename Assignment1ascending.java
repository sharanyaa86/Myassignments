package week1.day3;

import java.util.Arrays;

public class Assignment1ascending {
public static void main(String[] args) {
	int[] data = {3,2,11,4,6,7};
	
	int length = data.length;
	
	System.out.println("array length:"+length);
	
	Arrays.sort(data);
	for (int i = 0; i < data.length; i++) {
		System.out.println(data[i]);
	}
	System.out.println("after sorting: " +data[length-1]);
	
}
}
