package Question7_10;
import java.util.Random;
import java.util.Scanner;

public class Question7_10 {
	static Scanner standardInput = new Scanner(System.in);

	static boolean confirmRetry() {
		int continueNumber;
		do {
			System.out.print("もう一度？＜Yes…1/No…0＞：");
			continueNumber = standardInput.nextInt();
		}while(continueNumber != 0 && continueNumber != 1);
		return continueNumber == 1;
	}
	public static void main(String[] args) {
		Random randomNumber = new Random();

		System.out.print("暗算力トレーニング!!");
		do {
			int firstNumber = randomNumber.nextInt(900) + 100;
			int secondNumber = randomNumber.nextInt(900) + 100;
			int thirdNumber = randomNumber.nextInt(900) + 100;
			int questionStatement = randomNumber.nextInt(4);
			
			while(true) {
				if(questionStatement == 0) {
					System.out.print(firstNumber + "+" + secondNumber + "+" + thirdNumber + "=");
					int sumNumber = standardInput.nextInt();
					if(sumNumber == firstNumber + secondNumber + thirdNumber) {
						break;
					}
				}
				else if(questionStatement == 1) {
					System.out.print(firstNumber + "+" + secondNumber + "-" + thirdNumber + "=");
					int sumNumber = standardInput.nextInt();
					if(sumNumber == firstNumber + secondNumber - thirdNumber) {
						break;
					}
				}
				else if(questionStatement == 2) {
					System.out.print(firstNumber + "-" + secondNumber + "+" + thirdNumber + "=");
					int sumNumber = standardInput.nextInt();
					if(sumNumber == firstNumber - secondNumber + thirdNumber) {
						break;
					}
				}
				else{
					System.out.print(firstNumber + "-" + secondNumber + "-" + thirdNumber + "=");
					int sumNumber = standardInput.nextInt();
					if(sumNumber == firstNumber - secondNumber - thirdNumber) {
						break;
					}
				}
				System.out.println("違いますよ!!");
			}
		}while(confirmRetry());
	}
}
