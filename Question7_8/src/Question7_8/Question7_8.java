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
		//ランダムな数を入れる変数を作成
		Random randomNumber = new Random();
		//変数thirdRamdomの初期化
		int thirdRamdom = 0;
		//もしランダム数1よりランダム数2の値が大きい場合
		if(firstRamdom < secondRamdom) {	
			//ランダム数1以上ランダム数2未満の乱数をthirdRamdomに代入して返却
			return thirdRamdom = randomNumber.nextInt(secondRamdom - firstRamdom) + firstRamdom;		
		}
		//その他の場合
		else {
			//firstRamdomの値をthirdRamdomに代入して返却
			return thirdRamdom = firstRamdom;
		}
	}
	/*
	 * 関数名           :main
	 * メソッドの説明   :readPlusIntメソッドの返却値を受け取る
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.22
	 */
	public static void main(String[] args) {
		//ランダムな数を入れる変数を作る
		Random randomNumber = new Random();
		//firstRamdomに0-99のランダムな値を代入する
		int firstRamdom = randomNumber.nextInt(100);
		//secondRamdomに0-99のランダムな値を代入する
		int secondRamdom = randomNumber.nextInt(100);
		//"ランダムな数：random(firstRamdom, secondRamdom)"表示して改行する
		System.out.println("ランダムな数：" + random(firstRamdom, secondRamdom));
	}
}
