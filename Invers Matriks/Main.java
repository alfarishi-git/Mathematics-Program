import java.io.*;

public class Main{
	public static void main(String[] args) throws Exception{

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		float [][] MatA		= new float [3][3];

		float [][] Kof 		= new float [3][3];
		float [][] Adj 		= new float [3][3];
		float [][] hasil 	= new float [3][3];

		System.out.println("Ordo Matriks 3x3");
		System.out.println("Masukkan Elemen Matriks");
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				System.out.print("Elemen ["+(i+1)+", "+(j+1)+"] = ");
				MatA [i][j] = Float.parseFloat(input.readLine());
			}
		}

		for (int i=0; i < 3; i++){
			System.out.print("|");

			for (int j = 0; j < 3; j++){
				System.out.print(MatA[i][j]+" ");
			}

			System.out.println("|");
		}

		// Mencari Determinan
		float determ = ((MatA[0][0] * MatA[1][1] * MatA[2][2]) + (MatA[0][1] * MatA[1][2] * MatA[2][0]) + 
					   (MatA[0][2] * MatA[1][0] * MatA[2][1]) - (MatA[0][2] * MatA[1][1] * MatA[2][0]) + 
					   (MatA[0][0] * MatA[1][2] * MatA[2][1]) + (MatA[0][1] * MatA[1][0] * MatA[2][2]));

		System.out.println("Determinan = "+determ);
		System.out.println("");

		// Mencari Kofaktor
		Kof [0][0] = (MatA[1][1] * MatA[2][2] - MatA[1][2] * MatA[2][1]);
		Kof [0][1] = -1 * (MatA[1][0] * MatA[2][2] - MatA[1][2] * MatA[2][0]);
		Kof [0][2] = (MatA[1][0] * MatA[2][1] - MatA[1][1] * MatA[2][0]);

		Kof [1][0] = -1 * (MatA[0][1] * MatA[2][2] - MatA[0][2] * MatA[2][1]);		
		Kof [1][1] = (MatA[0][0] * MatA[2][2] - MatA[0][1] * MatA[2][0]);
		Kof [1][2] = -1 * (MatA[0][0] * MatA[2][1] - MatA[0][1] * MatA[2][0]);
		
		Kof [2][0] = (MatA[0][1] * MatA[1][2] - MatA[0][2] * MatA[1][1]);
		Kof [2][1] = -1 * (MatA[0][0] * MatA[1][2] - MatA[0][2] * MatA[1][0]);
		Kof [2][2] = (MatA[0][0] * MatA[1][1] - MatA[0][1] * MatA[1][0]);

		// Mencari Adjoin Matriks Dengan Cara Transpose Dari Kofaktor MatA
		Adj[0][0] = Kof[0][0];
		Adj[0][1] = Kof[1][0];
		Adj[0][2] = Kof[2][0];

		Adj[1][0] = Kof[0][1];
		Adj[1][1] = Kof[1][1];
		Adj[1][2] = Kof[2][1];

		Adj[2][0] = Kof[0][2];
		Adj[2][1] = Kof[1][2];
		Adj[2][2] = Kof[2][2];

		// Mencari Nilai MatA Dengan Membagi Antara Adjoin dan Determinan
		hasil[0][0] = Adj[0][0]/determ;
		hasil[0][1] = Adj[1][0]/determ;
		hasil[0][2] = Adj[2][0]/determ;

		hasil[1][0] = Adj[0][1]/determ;
		hasil[1][1] = Adj[1][1]/determ;
		hasil[1][2] = Adj[2][1]/determ;

		hasil[2][0] = Adj[0][2]/determ;
		hasil[2][1] = Adj[1][2]/determ;
		hasil[2][2] = Adj[2][2]/determ;

		// Output Kofaktor 
		System.out.println("Kofaktor Matriks");
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				System.out.println("Elemen ["+(i+1)+", "+(j+1)+"] = "+ Kof[i][j]);				
			}
		}

		for (int i=0; i < 3; i++){
			System.out.print("|");

			for (int j = 0; j < 3; j++){
				System.out.print(Kof[i][j]+" ");
			}

			System.out.println("|");
		}

		// Output Adjoint
		System.out.println("\nAdjoint Matriks");
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				System.out.println("Elemen ["+(i+1)+", "+(j+1)+"] = "+ Adj[i][j]);
			}
		}

		for (int i=0; i < 3; i++){
			System.out.print("|");

			for (int j = 0; j < 3; j++){
				System.out.print(Adj[i][j]+" ");
			}

			System.out.println("|");
		}

		System.out.println("\nMatriks Invers");
		for (int i = 0; i < 3; i++){
			System.out.print("|");

			for (int j = 0; j < 3; j++){
				System.out.print(hasil[i][j]+" ");
			}

			System.out.println("|");
		}
	}
}
