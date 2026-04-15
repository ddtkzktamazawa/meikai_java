package Question4_26;
import java.util.Scanner;
public class Question4_26 {

	public static void main(String[] args) {
		//キーボードから読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//"整数を加算します。"と表示して改行する
		System.out.println("整数を加算します。");
		//"何個加算しますか："と表示する
		System.out.print("何個加算しますか：");
		//inputNumberに数を読み込む
		int inputNumber = standardInput.nextInt();
		//変数sumValueの初期化
		int sumValue = 0;
		//変数averageValueの初期化
		int averageValue = 0;
		//変数negativeNumberの初期化
		int negativeNumber = 0;
		//変数iを1から始めて1つずつ増やしながら入力した数の回数ループ本体を繰り返す
		for(int i = 1; i <= inputNumber; i++) {
			//"整数："と表示する
			System.out.print("整数：");
			//plusNumberに数を読み込む
			int plusNumber = standardInput.nextInt();
			//もしplusNumberが0以下の場合
			if(plusNumber < 0) {
				//"負の値は加算しません。"と表示して改行する
				System.out.println("負の値は加算しません。");
				//negativeNumberをインクリメントする
				negativeNumber++;
				//スキップする
				continue;
			}
			//sumValueにplusNumberの値を加算する
			sumValue += plusNumber;
			//averageValueにsumValueをinputNumber-negativeNumberの値で割った値を代入
			averageValue = sumValue / (inputNumber - negativeNumber) ;
		}
		//"合計はsumValueです。"と表示して改行する
		System.out.println("合計は"+sumValue+"です。");
		//"平均はaverageValueです。"と表示して改行する
		System.out.println("平均値は"+averageValue+"です。");
	}
}
