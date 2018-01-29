package WRHtmlFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteUserMessage {
	public static int i = 1;
	private static String line = null;
	private static int n;
	private static String fileName = "UserMessages.html";
	private static String tag = "</body></head></html>";
    private static String name;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

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
			 
			while (i == 1) {
				System.out.println("Enter your name:");
				name = sc.next();
				bufferedWriter.write("<br>");
				bufferedWriter.write("<br>");

				fileWriter.write("Message of " + name);

				System.out
						.println("Enter the number of lines of message you wish to print");
				n = sc.nextInt();
				String str[] = new String[n + 1];

				System.out.println("Enter " + n + " lines of message");

				for (i = 0; i < n; i++) {
					str[i] = sc.next();
					fileWriter.write("<br>");
					fileWriter.write(str[i]);
					fileWriter.write("<br>");

				}

				bufferedWriter.newLine();
				System.out.println("Enter 0 to exit     Enter 1 to play");
				i = sc.nextInt();
			}
			bufferedWriter.close();
		} catch (IOException ex) {
			System.out.println("Error writing to file '" + fileName + "'");
		}

	}

}
