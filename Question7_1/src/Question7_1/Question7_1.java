package Question7_1;
import java.util.Scanner;
public class Question7_1 {

	static int signOf(int inputNumber) {
		//変数signOfの初期化
		int signOf = 0;
		//入力値が正の場合
		if(inputNumber > 0) {
			//1を代入する
			signOf = 1;
		}
		//入力値が0の場合
		else if(inputNumber == 0) {
			//0を代入する
			signOf = 0;
		}
		//その他の場合
		else {
			//-1を代入する
			signOf = -1;
		}
		//返却する
		return signOf;
	}
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in); 
		//"整数 :"を表示する
		System.out.print("整数：");
		//変数inputNumberに入力した値を代入する
		int inputNumber = standardInput.nextInt();
		//"返却値はsignOf(inputNumber)です。"と表示して改行する
		System.out.println("返却値は" + signOf(inputNumber) + "です。");
	}
}
