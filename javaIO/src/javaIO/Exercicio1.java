package javaIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Exercicio1 {
			public static void main(final String[] args) throws IOException {
//				InputStream is = System.in;
//				InputStreamReader isr = new InputStreamReader(is);
//				BufferedReader br = new BufferedReader(isr);
//				String line = br.readLine();
			
			System.out.println("Recomende 3 filmes: ");
			
			BufferedReader br2 = new BufferedReader (new InputStreamReader(System.in));
			String line2 = br2.readLine();
			
//				OutputStream os = System.out;
//				OutputStreamWriter osw = new OutputStreamWriter(os);
//				BufferedWriter bw = new BufferedWriter(osw);
			
			BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(System.out));
			
			
			do {
				bw2.write(line2);
				bw2.newLine();
				line2 = br2.readLine();
			} while (!line2.isEmpty());
			bw2.flush();
			
			br2.close();
			bw2.close();
			
		}
	}

