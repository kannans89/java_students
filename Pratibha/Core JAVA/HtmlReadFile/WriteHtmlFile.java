package HtmlReadFile;

import java.util.*;
import java.io.*;

public class WriteHtmlFile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i = 0;
		String fileName = "Write.html";

		try {
			FileWriter fileWriter = new FileWriter(fileName);

			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			bufferedWriter.write("<html><head><body><pre>");
			System.out.println("Enter the number of lines to be print");

			int n = sc.nextInt();
			String str[] = new String[n+1];

			System.out.println("Enter " + n + " lines of message");

			for (i = 0; i <= n; i++) {
				str[i] = sc.nextLine();
				bufferedWriter.write(str[i]);
				bufferedWriter.newLine();
			}

			bufferedWriter.newLine();
			bufferedWriter.write("</pre></body></head><html>");
			bufferedWriter.close();
		} catch (IOException ex) {
			System.out.println("Error writing to file '" + fileName + "'");
		}
	}
}
