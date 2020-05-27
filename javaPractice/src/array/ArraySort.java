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
	
	// 삽입 정렬(Insertion Sort)
	// 정렬 알고리즘에서 가장 간단하고 기본이 되는 알고리즘
	
	// ex) 카드게임 패 순서대로 정리
	// 3 4 2 1 5
	// 배열의 n번째 인덱스 값을 0 ~ n-1번 인덱스까지 비교하여 정렬 (n은 1부터 시작)
	
	public void method2() {
		int[] arr = {2, 5, 4, 1, 3};
		
		// 삽입 정렬 (오름차순)
		// 중첩 for문
		// 1. 비교 주체를 정하는 for문
		int count = 0;
		for(int i=1; i<arr.length; i++) {
			
			// 2. 비교 대상을 정하는 for문
			for(int j=0; j<i; j++) {
				
				// 비교를 통해서 오름차순 정렬
				// 비교 주체가 비교 대상보다 작을 경우 값 교환
				if(arr[i] < arr[j]) {
					int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
						count++;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("count : " + count);
	}
	
	public void method3() {
		
		int[] arr = {7, 1, 5, 3, 4, 2, 6};
		
		// 삽입 정렬 (오름차순)
		for(int i=1; i<arr.length; i++) {
			
			for(int j=0; j<i; j++) {
				
				if(arr[i] < arr[j]) {
					int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
