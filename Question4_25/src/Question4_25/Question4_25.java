package Question4_25;

public class Question4_25 {

	public static void main(String[] args) {
		/*List4-17の書き換え
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
		//変数iを1から始めて1つずつ増やしながら入力した数の回数ループ本体を繰り返す
		for(int i = 1; i <= inputNumber; i++) {
		//"整数（0で終了）："と表示する
			System.out.print("整数（0で終了）：");
			//plusNumberに数を読み込む
			int plusNumber = standardInput.nextInt();
			//もしplusNumberが0の場合、for文から抜ける
			if(plusNumber == 0) break;
			//sumValueにplusNumberの値を加算する
			sumValue += plusNumber;
			//averageValueにsumValueをiで割った値を代入
			averageValue = sumValue / i;
		}
		//"合計はsumValueです。"と表示して改行する
		System.out.println("合計は"+sumValue+"です。");
		//"平均はaverageValueです。"と表示して改行する
		System.out.println("平均値は"+averageValue+"です。");
		 */
		/*
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
		//変数iを1から始めて1つずつ増やしながら入力した数の回数ループ本体を繰り返す
		for(int i = 1; i <= inputNumber; i++) {
			//"整数："と表示する
			System.out.print("整数：");
			//plusNumberに数を読み込む
			int plusNumber = standardInput.nextInt();
			//もしsumValueにplusNumberを加えた値が1000以上の場合
			if(sumValue + plusNumber > 1000) {
			//"合計が1,000を超えました。"と表示して改行する
				System.out.println("合計が1,000を超えました。");
				//"最後の数値は無視します。"と表示して改行する
				System.out.println("最後の数値は無視します。");
				//for文から抜ける
				break;
		}
		//sumValueにplusNumberの値を加算する
		sumValue += plusNumber;
		//averageValueにsumValueをiで割った値を代入
		averageValue = sumValue / i;
	}
		//"合計はsumValueです。"と表示して改行する
		System.out.println("合計は"+sumValue+"です。");
		//"平均はaverageValueです。"と表示して改行する
		System.out.println("平均値は"+averageValue+"です。");
		 */
	}
}
