package Question7_8;
import java.util.Random;
/*
 * クラス名            :Question7_8
 * 概要                :乱数を生成し表示する
 * 作成者              :玉澤一輝
 * 作成日              :2026.4.22
 */
public class Question7_8 {
	/*
	 * 関数名           :random
	 * メソッドの説明   :ランダム数1以上ランダム数2未満の乱数を生成して返却
	 * パラメータの説明 :ランダム数1とランダム数2
	 * 返り値           :ランダム数1かランダム数1以上ランダム数2の値
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.22
	 */
	static int random(int firstRamdom, int secondRamdom) {
		Random randomNumber = new Random();
		int thirdRamdom = 0;
		if(firstRamdom < secondRamdom) {	
			return thirdRamdom = randomNumber.nextInt(secondRamdom - firstRamdom) + firstRamdom;		
		}
		else {
			return thirdRamdom = firstRamdom;
		}
	}
	/*
	 * 関数名           :main
	 * メソッドの説明   :0-99のランダムな数を出力しrandomのメソッドの結果を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.22
	 */
	public static void main(String[] args) {
		Random randomNumber = new Random();
		int firstRamdom = randomNumber.nextInt(100);
		int secondRamdom = randomNumber.nextInt(100);
		System.out.println("ランダムな数：" + random(firstRamdom, secondRamdom));
	}
}
