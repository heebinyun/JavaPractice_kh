package array;

public class ArraySort {

	// 5 4 1 2 3
	// 오름차순 : 1 2 3 4 5
	// 내림차순 : 5 4 3 2 1
	
	public void method1() {
		// 배열 요소 위치 바꾸기
		int[] arr = {2, 1, 3};
		
		// 1 2 3 오름차순
		/*
		 *  int temp = arr[0]; 
		 * 		arr[0]=arr[1];
		 * 		arr[1]=temp;
		 * 
		 * */
		
		// 3 2 1 내림차순
		int temp = arr[2];
			arr[2] = arr[1];
			arr[1] = arr[0];
			arr[0] = temp;
			
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
