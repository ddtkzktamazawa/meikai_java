package Question4_5;
import java.util.Scanner;
/*
 * クラス名:Question4_5
 * 概要    :正の整数値を-1までカウントダウン
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.7
 */
public class Question4_5 {
	 /**
     * 関数名           :main
     * メソッドの説明   :正の整数値を-1までカウントダウン
     * パラメータの説明 :なし
     * 返り値           :なし
     * 作成者           :玉澤一輝
     * 作成日           :2026.4.7
     */
	public static void main(String[] args) {
		//キーボードから読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//"カウントダウンします。と表示して改行する
		System.out.println("カウントダウンします。");
		//入力した数
		int timeLeft;
		//実行する
		do {
			//"正の整数値"と表示する
			System.out.print("正の整数値：");
			//rimeLeftに数w読み込む
			timeLeft = standardInput.nextInt();
			//timeLeftが0以下ならばdo文を再実行する
		}while(timeLeft <= 0);
		//timeleftが0以上であれば
		while(timeLeft >= 0)
			//timeLeftの値を表示してデクリメント
			System.out.println(--timeLeft);

	}

}
