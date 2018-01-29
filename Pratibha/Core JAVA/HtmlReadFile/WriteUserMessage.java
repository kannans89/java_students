package HtmlReadFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

@SuppressWarnings("unused")
public class WriteUserMessage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tag = "</pre></body></head></html>";
		int i = 0;
		String line = null;

		String fileName = "UserMessages.html";

		try {
			FileReader fileReader = new FileReader(fileName);
			@SuppressWarnings("resource")
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			FileWriter fileWriter = new FileWriter(fileName, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			while ((line = bufferedReader.readLine()) != null) {
				if (line.equals(tag)) {
					bufferedWriter.write(line
							+ System.getProperty("line.seperator"));
				}
			}
			System.out.println("Enter your name:");
			String name = sc.nextLine();
			bufferedWriter.write("<br>");
			bufferedWriter.write("<br>");

			fileWriter.write("Message of " + name);

			System.out
					.println("Enter the number of lines of message you wish to print");
			int n = sc.nextInt();
			String str[] = new String[n + 1];

			System.out.println("Enter " + n + " lines of message");
			
			for (i = 0; i <= n; i++) {
				str[i] = sc.nextLine();
				fileWriter.write(str[i]);
				fileWriter.write("<br>");

			}

			bufferedWriter.newLine();

			bufferedWriter.close();
		} catch (IOException ex) {
			System.out.println("Error writing to file '" + fileName + "'");
		}

	}

}
