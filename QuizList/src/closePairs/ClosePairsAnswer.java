package closePairs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClosePairsAnswer {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			String[] line;
			int N;
			int K;
			int[] A;
			int count;
			int answer;

			line = br.readLine().split(" ");
			N = Integer.parseInt(line[0]);
			K = Integer.parseInt(line[1]);
			A = new int[N];
			line = br.readLine().split(" ");
			for(int i = 0; i < N; i++) {
				A[i] = Integer.parseInt(line[i]);
			}


			answer = 0;
			for(int i = 0; i < A.length - 1; i++) {
				count = 0;
				for(int j = i + 1; j < A.length; j++) {
					if((A[j]-A[i]) <= K) {
						count++;
					}else {

						break;
					}
				}
				answer += count;
			}

			System.out.println(answer);


		}catch(IOException e) {
			System.out.println("入力エラーが発生しました");
		}
	}
}
