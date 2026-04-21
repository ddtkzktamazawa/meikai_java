package Question6_19;
import java.util.Scanner;
/*
 * クラス名:Question6_19
 * 概要    :クラス数と各クラスの人数・点数を読み込んで合計点・平均点を表示する
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.21
 */
public class Question6_19 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :クラス数と各クラスの人数・点数を読み込んで合計点・平均点を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.21
	 */
	public static void main(String[] args) {
		Scanner standardInput = new Scanner(System.in);
		System.out.print("クラス数：");
		int classValue = standardInput.nextInt();
		int[][] arrayNumber = new int[classValue][];
		int classPeople = 0;
		for(int i = 0; i < classValue; i++) {
			System.out.print((i + 1) + "組の人数：");
			classPeople = standardInput.nextInt();
			arrayNumber[i] = new int[classPeople];
			for(int j = 0; j < classPeople; j++) {
				System.out.print((i + 1) + "組" + (j + 1) + "番の点数：");
				arrayNumber[i][j] = standardInput.nextInt();
			}
			System.out.println();
		}
		System.out.println("  組 |		合計	平均");
		System.out.println("-----+-------------------");
		int allPeople = 0;
		int sumNumber1 = 0;
		int sumNumber2 = 0;
		for(int i = 0; i < arrayNumber.length; i++) {
			sumNumber1 = 0;
			for(int j = 0; j < arrayNumber[i].length; j++) {
				allPeople++;
				sumNumber1 += arrayNumber[i][j];
				sumNumber2 += arrayNumber[i][j];
			}
			System.out.printf("%d 組 |		%d		%.1f\n",(i + 1), sumNumber1, (double)sumNumber1 / arrayNumber[i].length);
		}
		System.out.println("-----+-------------------");
		System.out.printf("  計 |		%d		%.1f\n",sumNumber2, (double)sumNumber2 / allPeople);

	}

}
