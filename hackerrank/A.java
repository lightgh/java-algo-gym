public class A{

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);

		int a = in.nextInt();

		in.nextLine();

		int nums[] = new int[a];

		for(int i = 0; i< a; i++){
			nums[i] = in.nextInt();

			p(nums[i]);
		}

		



	}

	public static void p(Object a){
		System.out.println(a);
	}

}