package Question7_16;
import java.util.Scanner;
/*
 * クラス名          : Question7_16
 * 概要              : 配列の全要素の最小値を求める
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.4.24
 */
public class Question7_16 {
	/**
	 * 関数名           : minOf
	 * メソッドの説明   : 配列の最小値を求めて返却する
	 * パラメータの説明 : 最小値を求める配列
	 * 返り値           : 最小値
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.24
	 */
	static int minOf(int[] arrayName) {
		//変数minimumNunberの初期化
		int minimumNunber = arrayName[0];
		//変数iが0から始めて1ずつ増やしていき配列の回数繰り返す
		for (int i = 1; i < arrayName.length; i++) {
			//要素がこれまでの最小値より小さい場合
			if (arrayName[i] < minimumNunber) {
				//minimumNunberにarrayName[i]を代入する
				minimumNunber = arrayName[i];
			}
		}
		// 最小値を返却する
		return minimumNunber;
	}
	/**
	 * 関数名           : main
	 * メソッドの説明   : 配列の要素数と値を入力し最小値を表示する
	 * パラメータの説明 : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.24
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//"要素数："を表示する
		System.out.print("要素数：");
		//変数elementNumberに入力した値を代入する
		int elementNumber = standardInput.nextInt();
		//指定された要素数で配列を作成する
		int[] arrayNumber = new int[elementNumber];
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < elementNumber; i++) {
			//"arrayNumber[i]：""を表示する
			System.out.print("arrayNumber[" + i + "]：");
			//arrayNumber[i]に入力した値を代入する
			arrayNumber[i] = standardInput.nextInt();
		}
		//"全要素の合計はminOf(arrayNumber)です。"を表示して改行する
		System.out.println("最小値は" + minOf(arrayNumber) + "です。");
	}
}