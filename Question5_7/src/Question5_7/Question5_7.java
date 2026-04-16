package Question5_7;

public class Question5_7 {

	public static void main(String[] args) {
		//()内の文字を表示して改行する
		System.out.println("    x          x²   ");
		//()内の文字を表示して改行する
		System.out.println("--------------------");
		//変数iを0.0から1.0まで0.001ずつ増やす
		for(float i = 0.0F; i <= 1.0F; i += 0.001F) {
			//小数点以下7桁の変数iと変数iの二乗の値を表示する
			System.out.printf("%8.7f  %8.7f\n",i, i * i);
		}
	}
}