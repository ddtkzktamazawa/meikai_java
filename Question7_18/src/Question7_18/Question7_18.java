package Question7_18;
import java.util.Scanner;
/*
 * クラス名          : Question7_18
 * 概要              : 配列から指定したインデックスの要素を削除する
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.4.24
 */
public class Question7_18 {
	/**
	 * 関数名           : aryRmv
	 * メソッドの説明   : 配列の要素[idx]を削除しそれ以降の要素を前にずらす
	 * パラメータの説明 : 対象の配列、削除する要素のインデックス
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.24
	 */
	static void aryRmv(int[] arrayNumber, int indexNumber) {
		//もしインデックス0以上、要素数より少ない場合
		if (indexNumber >= 0 && indexNumber < arrayNumber.length) {
			//変数iがindexNumberから始めて1ずつ増やしていき要素数-1回繰り返す
			for (int i = indexNumber; i < arrayNumber.length - 1; i++) {
				//arrayNumber[i+1]をarrayNumber[i]に代入して1つずつ前にずれる	
				arrayNumber[i] = arrayNumber[i + 1];
			}
		}
	}
	/**
	 * 関数名           : main
	 * メソッドの説明   : 配列の入力を受け取り指定位置の要素を削除した結果を表示する
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
		//"削除するインデックス："を表示する
		System.out.print("削除するインデックス：");
		//変数indexNumberに入力した値を代入する
		int indexNumber = standardInput.nextInt();
		//メソッドaryRmvを呼び出し配列からindexNumber番目の要素を取り除く
		aryRmv(arrayNumber, indexNumber);
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < elementNumber; i++) {
			//"indexNumber番目の要素を取り除いた後それ以降の要素を前にずらした配列"を表示する
			System.out.println("arrayNumber[" + i + "] = " + arrayNumber[i]);
		}
	}
}