package caesarChiper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class CaeserChiperAnswer {
	public final Map<String, String> table = new HashMap();

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String str = br.readLine();
			String encodeStr = encode(str);
			String decodeStr = decode(str);
			System.out.println("入力した文字列は" + str);
			System.out.println("エンコードした文字列は" + encodeStr);
			System.out.println("デコードした文字列は" + decodeStr);

		} catch (IOException e) {
			System.out.println("入力エラーが発生しました");
		}
	}

	public static String encode(String str) {
		String[] list = str.split("");
		for (String s : list) {

		}
	}

	public static String decode(String str) {

	}

}
