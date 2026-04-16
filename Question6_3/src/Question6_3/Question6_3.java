package Question6_3;

public class Question6_3 {

	public static void main(String[] args) {
		//int型を構成要素とする配列要素数の作成
		double [] someElement = new double[5];
		//変数jの初期化
		int j = 0;
		//変数iを1.1から始めて1ずつ増やして値が5.5以上になるまで繰り返し、変数jを1ずつ増やす
		for(double i = 1.1; i <= 5.5; i += 1.1, j++){
			//変数someElement[j]にiの値を代入する
			someElement[j] = i ;
			//全要素の値を表示する
			System.out.println("someElement[" + j + "] = " + someElement[j]);
		}
	}
}
