import java.util.*;

public class TestSet{

	public static void main(String [] args){
		String a = "aaaaa", b="aa";

		// String aA[] = a.split("");

		// TestSet.printArray(aA);

		// System.exit(0);

		// String [] first = strToArray(a);
		// String [] second = strToArray(b);
		boolean ana = true;

		if(a.length() != b.length()){
			ana = false;
		}else{

		String [] first = a.split("");
		String [] second = b.split("");

 
//		Integer[] ar = new Integer[]{4, 5, 8, 5, 12};

		Set<String> firstCs = new HashSet<String>();

		firstCs.addAll(Arrays.asList(first));
//		System.out.println(firstCs);
		int size = firstCs.size();
		int countE[] = new int[size];
		int countE1[] = new int[size];

		List<String> firstCsList = new ArrayList<>(firstCs);
		String cE = "", cE1 = "";

		for(int ik = 0; ik < size; ik++){
			cE = firstCsList.get(ik);
			//cE1 = secondCsList.get(ik);

			for(int jk = 0; jk < first.length; jk++){
				if(cE.equals(first[jk])){
					countE[ik]++;
				}
				
				if(cE.equals(second[jk])){
					countE1[ik]++;
				}
			}
		}

		

		for(int kl = 0; kl < size; kl++)
		{
			if( countE[kl] != countE1[kl])
				ana = false;
		}

	}

		if(ana == false)
			System.out.println("Not Anagram");
		else
			System.out.println("Anagram");

//		printArray(countE);
//		printArray(countE1);


	}

	public static String[] strToArray(String a){
		String [] strAr = new String[a.length()];
		for(int i = 0; i < a.length(); i++){
			strAr[i] = String.valueOf(a.charAt(i));
		}
		return strAr;
	}

	public static void printArray(int [] a){
		for(int i=0; i < a.length; i++){
			System.out.print(a[i]);
		}
		System.out.println();
	}
	
	public static void printArray(String [] a){
		for(int i=0; i < a.length; i++){
			System.out.print(a[i]);
		}
		System.out.println();
	}

}
