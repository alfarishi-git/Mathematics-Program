package com.java;

import java.io.*;

public class Main{
	public static void main(String []args) throws Exception{
		
		// Deklarasi objek input dari kelas BufferedReader
		BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
		
		System.out.print("Masukkan Jumlah Ordo Matriks n*n: ");
		int n = Integer.parseInt(input.readLine());
		// Deklarasi variabel yang akan digunakan
		int [][] MatA = new int [n][n];
		int [][] MatB = new int [n][n];
		int [][] MatC = new int [n][n];
		System.out.println("Matriks A: ");
		for (int i=0; i<n; i++){
			for (int j=0; j<n; j++){
				// Menginput nilai matriks A
				System.out.print("Elemen ["+(i+1)+", "+(j+1)+"]= ");
				MatA[i][j] = Integer.parseInt(input.readLine());
			}
		}
		System.out.println("Matriks B: ");
		for (int i=0; i<n; i++){
			for (int j=0; j<n; j++){
				// Menginput nilai Matriks B
				System.out.print("Elemen ["+(i+1)+", "+(j+1)+"]= ");
				MatB[i][j] = Integer.parseInt(input.readLine());
			}
		}
		
		// Hasil Matriks A
		System.out.println("Matriks A");
		System.out.print("");
		for (int i=0; i<n; i++){
			System.out.print(" | ");
			for (int j=0; j<n; j++){
				System.out.print(MatA[i][j]+" ");
			}
			System.out.println(" | ");
		}
		
		// Hasil Matriks B
		System.out.println("Matriks B");
		System.out.print("");
		for (int i=0; i<n; i++){
			System.out.print(" | ");
			for (int j=0; j<n; j++){
				System.out.print(MatB[i][j]+" ");
			}
			System.out.println(" | ");
		}
		
		// Hasil Penjumlahan Matriks A dan Matriks B
		System.out.println("Hasil Penjumlahan Matriks A dan Matriks B");
		System.out.print("");
		for (int i=0; i<n; i++){
			System.out.print(" | ");
			for (int j=0; j<n; j++){
				// Rumus penjumlahan Matriks
				MatC[i][j] = MatA[i][j] + MatB[i][j];
				System.out.print(MatC[i][j]+" ");
			}
			System.out.println(" | ");
		}
	}
}