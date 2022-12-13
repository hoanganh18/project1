package DangHH6_Assignment_301;

import java.util.Scanner;

public class BT2 {
	public static void main(String[] args) {
		String[] stringArray;
		String svalue;
		int n;
		Scanner ip=new Scanner(System.in);
		System.out.print("n = ");n=ip.nextInt();
		stringArray=new String[n];
		for(int i=0;i<n;i++) {
			System.out.print("nhap phan tu "+(i+1)+" ");stringArray[i]=ip.next();
		}
		System.out.print("nhap phan muon tim ");svalue=ip.next();
		ip.close();
		for(int i=0;i<n;i++) {
			if(svalue.equals(stringArray[i])) {
				System.out.print("\nco trong mang ");
				break;
			}
		}
	}
}
