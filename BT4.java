package DangHH6_Assignment_301;

public class BT4 {

	public static void main(String[] args) {
		int [] myIntArray = {43, 32, 53, 23, 12, 34, 3, 12, 43, 32};
		int [] a=new int[myIntArray.length];
		System.out.print("mang goc : ");
		for(int i=0;i<myIntArray.length;i++) {
			a[a.length-i-1]=myIntArray[i];
			System.out.print(myIntArray[i]+ " ");
		}
		System.out.print("\nmang nguoc : ");
		for(int i=0;i<myIntArray.length;i++) {
			System.out.print(a[i]+ " ");
		}
		
	}

}
