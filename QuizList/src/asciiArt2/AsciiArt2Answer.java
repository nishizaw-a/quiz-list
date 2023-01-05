package asciiArt2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AsciiArt2Answer {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			int number;
			while(true) {
				try {
					number = Integer.parseInt(br.readLine());
					if(number < 1) {
						throw new NumberFormatException();
					}
					break;
				}catch(NumberFormatException e) {
					System.out.println("正数を入力してください");
				}
			}

			for(int row = 1; row <= number; row++) {
				for(int column = 1; column <= number; column++) {
					if((column == (number/2+number%2)) || (column == ((number + 1 + (number + 1) % 2)/2+number%2))) {
						System.out.print("X");
					}else {
						System.out.print("　");
					}
				}
				System.out.println();
			}
		}catch(IOException e) {
			System.out.println("入力エラーが発生しました");
		}
	}

}
