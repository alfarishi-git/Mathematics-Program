package com.java;

import java.util.Scanner;

public class Main{

	Scanner input		= new Scanner(System.in);
	int [][] Matriks	= new int [2][2];
	int [][] MatA		= new int [3][3];

	public void input(){
		System.out.println("============================");
		System.out.println("\tOrdo Matriks 2x2");
		System.out.println("============================");
		System.out.println("Masukkan Elemen Matriks ");
		for (int i=0; i<2; i++){
			for (int j=0; j<2; j++){
				System.out.print("Elemen ["+(i+1)+","+(j+1)+"]= ");
				Matriks[i][j] = input.nextInt();
			}
		}

		System.out.println("============================");
		System.out.println("\tOrdo Matriks 3x3");
		System.out.println("============================");
		System.out.println("Masukkan Elemen Matriks ");
		for (int i=0; i<3; i++){
			for (int j=0; j<3; j++){
				System.out.print("Elemen ["+(i+1)+","+(j+1)+"]= ");
				MatA[i][j] = input.nextInt();
			}
		}
	}

	public void ordoX(){
		for (int i=0; i<2; i++){
			System.out.print("|");
			for (int j=0; j<2; j++){
				System.out.print(Matriks[i][j]+" ");
			}
		System.out.println("|");
		}
		int deter = (Matriks[1][1] * Matriks[0][0]) - (Matriks[0][1] * Matriks[1][0]);
		System.out.println("Determinannya = "+deter);
		System.out.println("");
	}

	public void ordoXX(){
		for (int i=0; i<3; i++){
			System.out.print("|");
			for (int j=0; j<3; j++){
				System.out.print(MatA[i][j]+" ");
			}
		System.out.println("|");	
		}
		int det = ((MatA[0][0] * MatA[1][1] * MatA[2][2]) + (MatA[0][1] * MatA[1][2] * MatA[2][0]) + 
			(MatA[0][2] * MatA[1][0] * MatA[2][1]) - (MatA[0][2] * MatA[1][1] * MatA[2][0]) + (MatA[0][0] * MatA[1][2] * MatA[2][1]) + (MatA[0][1] * MatA[1][0] * MatA[2][2]));
		System.out.println("Determinannya = "+det);
		System.out.println("");
	}

	public void menu(){
		System.out.println("============================");
		System.out.println("\tMENU DETERMINAN");
		System.out.println("============================");
		System.out.println("1. Input Elemen");
		System.out.println("2. Determinan Ordo 2x2");
		System.out.println("3. Determinan Ordo 3x3");
		System.out.println("4. Exit");
		System.out.println("============================");
		System.out.print("Masukkan Pilihan: ");
		int pil = input.nextInt();
		if (pil == 1){
			input();
			menu();
		}
			else if (pil == 2){
				ordoX();
				menu();
			}
				else if (pil == 3){
					ordoXX();
					menu();
				}
					else if (pil == 4){
						System.out.println("Terima Kasih");
					}
				else{
					System.out.println("Masukkan Pilihan Dengan Benar!");
					menu();
				}
	}

	public static void main(String[] args){
		Main x = new Main();
		x.menu();
	}
}
