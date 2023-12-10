package testCodePackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * Purpose of this program is to read substring from a file and write the substring on another.
 * Author : Udhaya Eugine Loganathan
 * Date Created : 10th December 2023
 * 
*/

public class FileScrapperUtility {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		BufferedReader br = new BufferedReader(new FileReader("..//Test//LoanNumber.txt"));
		FileWriter br1 = new FileWriter("..//Test//LoanNumber1.txt");
		PrintWriter pw = new PrintWriter(br1);

		String line = null;
		try (Scanner sc = new Scanner(br)) {
			try {
				while (sc.hasNextLine()) {
					line = sc.nextLine();
					pw.write(line.substring(28, 39) + "\n");
				}
				br.close();
				pw.close();
				br1.close();

			} catch (IOException io) {
				System.out.println(io.getMessage());
			}
		}

	}

}
