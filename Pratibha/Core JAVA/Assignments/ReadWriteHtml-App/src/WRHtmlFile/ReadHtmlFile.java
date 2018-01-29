package WRHtmlFile;

import java.io.*;

public class ReadHtmlFile {

	private static String fileName = "UserMessages.html";
	private static char s;
	private static int flag = 0;
	private static String line = null;

	public static void main(String[] args) {

		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				for (int i = 0; i < line.length(); i++) {
					s = line.charAt(i);

					if (s == '<')
						flag = 1;
					if (s == '>') {
						flag = 0;
						continue;
					}
					if (line.charAt(i) == '<' && line.charAt(i + 1) == 'b'
							&& line.charAt(i + 2) == 'r'
							&& line.charAt(i + 3) == '>') {
						System.out.println();
					}
					if (flag == 0)
						System.out.print(s);
				}
			}

			bufferedReader.close();
		}

		catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
		}
	}

}
