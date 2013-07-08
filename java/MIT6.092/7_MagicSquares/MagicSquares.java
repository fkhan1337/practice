import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MagicSquares {
    public static boolean testMagic(String pathName) throws IOException {
        // Open the file
        BufferedReader reader = new BufferedReader(new FileReader(pathName));

        boolean isMagic = true;
        int lastSum = -1;
	int row = 0;
	int size = 0;
	int[][] matrix;
        
        // For each line in the file ...
        String line;
	line = reader.readLine();
	size = line.split("\t").length;
	matrix = new int[size][size];
        while ((line = reader.readLine()) != null) {
            // ... sum each row of numbers
            String[] parts = line.split("\t");
	    int col = 0;
            for (String part : parts) {
		if (!part.equals("")) {
		    matrix[row][col] = Integer.parseInt(part);
		    col++;
		}
            }
	    row++;
        }
	reader.close();
	
	int rowsum[] = new int[size];
	int colsum[] = new int[size];
        for (int i=0; i<size; i++) {
	    for (int j=0; j<size; j++) {
		rowsum[i] += matrix[i][j];
		colsum[j] += matrix[j][i];
	    }
	}

	int val = rowsum[0];
	for (int i=0; i<size-1; i++) {
	    System.out.println(rowsum[i] + " " + colsum[i]);
	    if (rowsum[i] != val || colsum[i] != val) return false;
	}
	
        return true;
    }

    public static void main(String[] args) throws IOException {
        String[] fileNames = { "Mercury.txt", "Luna.txt" };
        for (String fileName : fileNames) {
            System.out.println(fileName + " is magic? " + testMagic(fileName));
        }
    }
}
