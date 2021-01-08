public class GugudanArrays {
	
	public static void main(String[] args) {
		for(int n = 2; n < 10; n++) {
			// n = 2고 1씩 값이 증가하며 9가 될 때까지 코드 진행
			int[] result = calculate(n);
			// 배열인 result는 calculate 메소드에서 값을 가져온다
			// public static int[] calculate(int times) 이것과 데이터 타입이 일치해야한다
			print(result);
			// 위에서 나온 결과물 int[] result = calculate(n);를 화면에 출력
		}
	}
	
	public static int[] calculate(int times) {
		// 메소드 calculate는 정수 times를 입력 받고
		// 그에 따른 결과물을 정수 타입 배열로 반환한다
		// int[] result = calculate(n); 이것과 데이터 타입이 일치해야한다
		int[] result = new int[9];			   
		// 정수 타입 result 안에 인스턴스를 통해 9개의 메모리를 분양 받는다
		for(int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);
		// i 값이 배열의 길이인 9보다 작을 때까지 반복문이 실행이 된다
		// times는 입력 값에 따라 달라진다
		}
		return result;
		// int[] 정수 타입 배열로 코딩의 결과를 result로 반환한다
	}
	
	public static void print(int[] result) {
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	} // 출력 메소드
}
