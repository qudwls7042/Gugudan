
public class GugudanArrays {
	public static void main(String[] args) {
		int[] result = new int[9]; // 0~8 수납
		for(int n = 2; n < 10; n++) { // n이 10보다 작으면 밑의 for1 구문 실행
			
			for(int i = 0; i < result.length; i++) {
				result[i] = n * (i + 1); // n = 2이기 때문에 
										 // i = 8이 될 때까지 for2문 실행 - 배열에 입력하기
				System.out.println(result[i]); 
			} // 배열 입력 값 출력 후 for2 종료 i = 1
		} // n = 3 다시 처음으로 돌아가서 10 보다 n이 작으면 다시 실행
		  // n이 9가 될 때까지 무한 반복
	}
}
