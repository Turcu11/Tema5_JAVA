import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);

		System.out.print("M: ");
		int M = s.nextInt();
		System.out.print("N: ");
		int N = s.nextInt();

		double[][] matrix1 = new double[M][N];
		double[][] matrix2 = new double[N][M];
		double[][] matrixResult = new double[M][N];
		// filling in the first matrix
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1.length; j++) {
				System.out.print("Element of: [" + i + " " + j + "] : ");
				matrix1[i][j] = s.nextDouble();
			}
		}
		System.out.println("-------Matrix2-------");
		// filling in the second matrix
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2.length; j++) {
				System.out.print("Element of: [" + i + " " + j + "] : ");
				matrix2[i][j] = s.nextDouble();
			}
		}

		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1.length; j++) {
				for (int k = 0; k < matrix1.length; k++) {
					matrixResult[i][j] = matrix1[i][k] * matrix2[k][j];
				}
			}
		}

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt")); // daca pui ,true atunci faci
																					// append sa adaugi in fisier,
																					// daca nu atunci suprascrii
																					// fisierul de fiecare data

			for (int i = 0; i < matrix1.length; i++) {
				for (int j = 0; j < matrix1.length; j++) {
					bw.write(matrixResult[i][j] + " ");
				}
				bw.write("\n");
			}
			bw.close();

		} catch (FileNotFoundException e) {
			System.out.println("Eroare la deschiderea fisierului !");
		}
	}

}
