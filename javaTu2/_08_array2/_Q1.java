package _08_array2;

public class _Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 2차원 배열 a의 2번째 행의 모든 값을 출력하시오
		
		
		int[][] a = {{1,2,3,4,5},				
					 {6,7,8,9,10},
			 	 	 {11,12,13,14,15},
					 {16,17,18,19,20},
					 {21,22,23,24,25}};
		for (int i=0; i < 5; i++) {
			System.out.print(a[1][i]+" ");
		}
	}

}