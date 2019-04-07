public class MergeSortedArrays{


	public static int[] mergeArrays(int[] myArray, int[] alicesArray){

		int[] mergedArray = new int[ myArray.length + alicesArray.length ];
		
		//Test: If both are empty
		if( myArray.length == 0 && alicesArray.length == 0 ) return mergedArray;

		//Test: If any one of them is empty return the others
		if( myArray.length == 0 ) return alicesArray;
		if( alicesArray.length == 0 ) return myArray;

		int myArrayCount = 0;
		int alicesArrayCount = 0;

		//for all the arrays lets combine within
		for(int i = 0; i < mergedArray.length; i++){
			if(myArrayCount < myArray.length && alicesArrayCount < alicesArray.length){
				if(myArray[myArrayCount] < alicesArray[alicesArrayCount]){
					mergedArray[i] = myArray[myArrayCount++];
				}else{
					mergedArray[i] = alicesArray[alicesArrayCount++];
				}
			}else{
				if(myArrayCount < myArray.length)
					mergedArray[i] = myArray[myArrayCount++];
				
				if(alicesArrayCount < alicesArray.length)
					mergedArray[i] = alicesArray[alicesArrayCount++];
			}
		}

		return mergedArray;
	}










}

