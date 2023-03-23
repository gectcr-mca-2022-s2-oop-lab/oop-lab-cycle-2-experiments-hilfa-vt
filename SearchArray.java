package cycle2;
import java.util.Arrays;
import java.util.Scanner;

public class SearchArray {
	
	public static void main(String[] args) {
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int[] arr = new int[sc.nextInt()];


		System.out.println("Enter array elements:");
		for(int i = 0 ; i < arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter item to be searched:");
		int item = sc.nextInt();
		
		for(int i = 0 ; i < arr.length;i++) {
			if(arr[i] == item) {
				flag = 1;
				System.out.println("item found at index "+i);
				break;
			}
		}
		if(flag==0) {
			System.out.println("item not found");
		}
	}
}
