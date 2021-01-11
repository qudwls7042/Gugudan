import java.util.Scanner;
public class GugudaSH2 {

	public static void main(String[] args) {
		System.out.printf("숫자를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		if(number < 2) {
			System.out.println("1보다 큰 숫자를 입력하세요");
		} else {
			int[] result = calculate(number);
			print(result);
		}
	}
	
	// 여기부터 메소드
	public static int[] calculate(int n) {
		int[] result = new int[n];
		for(int i = 0; i < result.length; i++) {
			result[i] = n * (i + 1);
		}
		return result;
	}
	public static void print(int[] result) {
		for(int i = 0; i < result.length; i++) {
			if(i % 2 == 1)
				continue;
			System.out.println(result[i]);
		}
	}
}
