import java.util.Scanner;

	public class Gugudan {
		public static void main(String[] args) {
			System.out.printf("원하는 구구단 수를 입력하세요 : ");
			
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			
			System.out.println(number * 1);
			System.out.println(number * 2);
			System.out.println(number * 3);
			System.out.println(number * 4);
			System.out.println(number * 5);
			System.out.println(number * 6);
			System.out.println(number * 7);
			System.out.println(number * 8);
			System.out.println(number * 9);
		}
}