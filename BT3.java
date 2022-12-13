package DangHH6_Assignment_301;

import java.util.Scanner;

public class BT3 {

	public static void main(String[] args) {
		int[] Array,cs;
		int svalue;
		int n,j = 0,tt=0;
		Scanner ip=new Scanner(System.in);
		System.out.print("n = ");n=ip.nextInt();
		Array=new int[n];
		cs=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("nhap phan tu "+(i+1)+" ");Array[i]=ip.nextInt();
		}
		System.out.print("nhap phan muon tim ");svalue=ip.nextInt();
		ip.close();
		for(int i=0;i<n;i++) {
			if(Array[i]==svalue) {
				tt=tt+1;
				cs[j]=i;j++;
			}
		}
		System.out.println("so lan lap "+tt);
		System.out.println("chi so ");
		for(int i=0;i<j;i++) {
			System.out.print(cs[i]+" ");
		}
	}

}
