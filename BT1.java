package DangHH6_Assignment_301;

public class BT1 {

	public static void main(String[] args) {
		int[] a=new int [100];
		int tong=0,i=0;
		while(i<100) {
			a[i]=i+1;
			tong+=a[i];
			i++;
		}
		System.out.print("tb 100 so dau : "+tong/100);

	}

}
