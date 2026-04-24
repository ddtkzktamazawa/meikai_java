package Question7_19;
import java.util.Scanner;
/*
 * クラス名          : Question7_19
 * 概要              : 配列から指定したインデックスを先頭に指定個数要素を削除する
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.4.24
 */
public class Question7_19 {
	/**
	 * 関数名           : aryRmvN
	 * メソッドの説明   : 配列の要素[idx]から指定個数を削除しそれ以降の要素を前にずらす
	 * パラメータの説明 : 対象の配列、削除開始位置、削除する個数
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.24
	 */
	static void aryRmvN(int[] arrayNumber, int indexNumber, int deleteNumber) {
		//削除する個数が0以下、または開始位置が範囲外の場合
		if (deleteNumber <= 0 || indexNumber < 0 || indexNumber >= arrayNumber.length) {
			//そのまま返却する
			return;
		}
		//削除する範囲が配列の末尾を超える場合
		if (indexNumber + deleteNumber > arrayNumber.length) {
			//末尾までに制限する
			deleteNumber = arrayNumber.length - indexNumber;
		}
		//変数iがindexNumberから始めて1ずつ増やしていき要素数-deleteNumber回繰り返す
		for (int i = indexNumber; i < arrayNumber.length - deleteNumber; i++) {
			//arrayNumber[i+1]をarrayNumber[i]に代入してdeleteNumber個前にずれる
			arrayNumber[i] = arrayNumber[i + deleteNumber];
		}
	}
	/**
	 * 関数名           : main
	 * メソッドの説明   : 配列の入力を受け取り指定された削除処理の結果を表示する
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
		System.out.print("削除を開始するインデックス：");
		//変数indexNumberに入力した値を代入する
		int indexNumber = standardInput.nextInt();
		//"削除する個数："を表示する
		System.out.print("削除する個数：");
		//変数deleteNumber]に入力した値を代入する
		int deleteNumber = standardInput.nextInt();
		//メソッドaryRmvを呼び出し配列のindexNumber番目からdeleteNumber個分の要素を取り除く
		aryRmvN(arrayNumber, indexNumber, deleteNumber);
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < elementNumber; i++) {
			/*"indexNumber番目からdeleteNumber個分の要素を取り除いた後
			 * それ以降の要素を前にずらした配列"を表示する
			 */
			System.out.println("arrayNumber[" + i + "] = " + arrayNumber[i]);
		}
	}
}