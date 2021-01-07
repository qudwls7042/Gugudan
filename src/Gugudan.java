import java.util.Scanner;

	public class Gugudan  {
		public static void main(String[] args) {
			
			// 8,9단
			
			System.out.printf("여기에 구구단 하고 싶은 숫자를 입력해주세요 : ");
			
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			
			if(number < 2) {
				System.out.println("1보다 큰 수를 입력해주세요");
			} else if(number > 9) {
				System.out.println("10보다 작은 수를 입력해주세요");
			} else {
				
				for(int i = 1; i < 10; i++) {
					System.out.println(number * i);
				}	
			}
			
			/*System.out.println("구구단 6단");
			int i = 1;
			while(i < 10) {
				System.out.println(6 * i);
				i = i + 1;
		}
			System.out.println("구구단 7단");
			for(int j = 1; j < 10; j++) {
				System.out.println(7 * j);
			}
			*/
			
//			System.out.printf("원하는 구구단 수를 입력하세요 : ");
//			
//			Scanner scanner = new Scanner(System.in);
//			int number = scanner.nextInt();
//			
//			System.out.println(number * 1);
//			System.out.println(number * 2);
//			System.out.println(number * 3);
//			System.out.println(number * 4);
//			System.out.println(number * 5);
//			System.out.println(number * 6);
//			System.out.println(number * 7);
//			System.out.println(number * 8);
//			System.out.println(number * 9);
			
			
		}
}