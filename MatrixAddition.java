//Caroline Player
import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.println("Welcome to the matrix adder program!");
		
		
		System.out.println("Please enter the length and width of the first matrix: ");
		//Take user input and assign to width and length of matrix
		int length1 = k.nextInt();
		int width1 = k.nextInt();
		int[][] matrix1 = new int [length1][width1];
		
		//Takes in each number of matrix from user and assigns it to the correct position
		for(int i = 0; i < length1; i++ ) 
		{
			for(int j = 0; j < width1; j++) 
			{
				System.out.println("Enter value at index " + i + " " + j + ": ");
				matrix1[i][j] = k.nextInt();
			}
		}
		
		
		//Repeat process used on the first matrix
		System.out.println("Please enter the length and width of the second matrix: ");
		
		int length2 = k.nextInt();
		int width2 = k.nextInt();
		
		//Checks to make sure both matrices entered have the same length and width
		if(length1 != length2 || width1 != width2)
		{
			System.out.println("Error: The lengths and Widths of both Matrices must match!");
			return;
		}
		
		int[][] matrix2 = new int [length2][width2];
		
		for(int i = 0; i < length2; i++ ) 
		{
			for(int j = 0; j < width2; j++) 
			{
				System.out.println("Enter value at index " + i + " " + j + ": ");
				matrix2[i][j] = k.nextInt();
			}
		}
		
		
		int[][] sum = new int[length1][width1];
		
		
		//Prints out the first matrix
		for (int i = 0; i < length1; i++) {
            for (int j = 0; j < width1; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
		
		System.out.println("+");
		
		
		//prints out the second matrix
		for (int i = 0; i < length2; i++) {
            for (int j = 0; j < width2; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
		
		System.out.println("=");
		
		
		//adds the two matrices and prints out the sum
		for(int i = 0; i < length1; i++)
		{
			for(int j = 0; j < width1; j++)
			{
				sum[i][j] = matrix1[i][j] + matrix2[i][j];
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
		
		k.close();

	}

}
