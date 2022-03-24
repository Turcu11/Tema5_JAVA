import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// exercitiu 3

public class FileHelper {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter the name of the file: ");
		String fileName = s.next();
		int howManyTimesItApeared = 0;
		System.out.print("Please enter the line you want to count: ");
		String toBeChecked = s.next();

		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));

			String line = br.readLine();
			while (line != null) {
				if (line.equals(toBeChecked)) {
					howManyTimesItApeared++;
				}
				line = br.readLine();
			}
			System.out.println(
					"The sequence \"" + toBeChecked + "\" aperead " + howManyTimesItApeared + " in the file.input.txt");
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Eroare la deschiderea fisierului !");
		}
	}

}
