package changeMakingProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangeMakingProblemAnswer {

	private BufferedReader br;
	private int[] change; //お釣りの枚数を保存する配列
	private final int[] COINS = { 1, 5, 10, 50, 100, 500, 1000, 5000, 10000 }; //コインの種類

	public static void main(String[] args) {
		try {
			ChangeMakingProblemAnswer q = new ChangeMakingProblemAnswer();
			q.calculate();
		} catch (IOException e) {
			System.out.println("入力エラーが発生しました\n終了します");
		}
	}

	/**
	 * コンストラクタ
	 * フィールドの値を初期化
	 */
	private ChangeMakingProblemAnswer() {
		this.br = new BufferedReader(new InputStreamReader(System.in));
		this.change = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0};
	}

	/**
	 * 金額を入力してお釣りの枚数を求めるメソッド
	 * @return void
	 * @throws IOException
	 */
	private void calculate() throws IOException {
		System.out.println("お釣りの硬貨の枚数をそれぞれ求めます。金額を入力してください");
		//ここから
		int price = this.getInt("金額=");
		for(int i = this.COINS.length - 1; i >= 0; i--) {
			int coin = this.COINS[i];
			int num = price/coin;
			this.change[i] = num;
			price -= coin*num;
		}
		this.printResult();
		//ここまで
	}

	/**
	 *硬貨の枚数を出力するメソッド
	 * @return void
	 */
	private void printResult() {
		System.out.println("お釣り");
		for (int i = 0; i < this.change.length; i++) {
			System.out.println(this.COINS[i] + (i < 6 ? "円玉 : " : "円札 : ") + this.change[i] + "枚");

		}
	}

	/**
	 * 0以上の整数を取得するメソッド
	 * @param String
	 * @return int
	 * @throws IOException
	 */
	private int getInt(String prefix) throws IOException {
		while (true) {
			try {
				System.out.print(prefix);
				int value = Integer.parseInt(this.br.readLine());

				if (value < 0) {
					System.out.println("0以上の数字を入力してください");
					continue;
				}

				return value;
			} catch (NumberFormatException e) {
				System.out.println("整数を入力してください。");
			}
		}
	}

}
