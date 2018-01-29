package HtmlReadFile;

import java.io.*;

public class ReadHtmlFile {
	public static void main(String[] args) {

		// The name of the file to open.
		String fileName = "UserMessages.html";
		char s;
		int flag = 0;
		// This will reference one line at a time
		String line = null;

		try {
			// FileReader reads text files in the default encoding.
			FileReader fileReader = new FileReader(fileName);

			// Always wrap FileReader in BufferedReader.
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

			// Always close files.
			bufferedReader.close();
		}

		catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
			// Or we could just do this:
			// ex.printStackTrace();
		}
	}
}
