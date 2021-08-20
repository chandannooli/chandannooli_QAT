package AssignmentQs;

import java.util.*;

public class String_Order_Reverse {
	
	public static void main(String[] args) {
		
		String str[];
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter the number of Strings: ");
		int n = sc.nextInt();
		str= new String[n+1];
		
		for(int i=0; i<n+1; i++) {
		str[i] = sc.nextLine();
		}
		System.out.println();
		
		for(int i=str.length-1;i>=0;i--)
			System.out.println(str[i]);
		
		sc.close();

}
}
