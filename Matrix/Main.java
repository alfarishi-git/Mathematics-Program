import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int jumlahBaris, jumlahKolom;
        Scanner input = new Scanner(System.in);
		
		System.out.println("--------------------------------------");
		System.out.println("-----------  M A T R I K S   ---------");
		System.out.println("--------------------------------------");
        System.out.print("Masukan Jumlah Indeks Baris Matriks : ");
        jumlahBaris = input.nextInt();
        System.out.print("Masukan Jumlah Indeks Kolom Matriks : ");
        jumlahKolom = input.nextInt();
		System.out.println("--------------------------------------------");
        Integer[][] array = new Integer[jumlahBaris][jumlahKolom];

        for (int i = 0; i < jumlahBaris; i++) {
            for (int j = 0; j < jumlahKolom; j++) {
                System.out.print("Masukan Isi Indeks Baris Ke " + i + " Kolom Ke "+j+": ");
                array[i][j] = input.nextInt();
            }
        }
		System.out.println("--------------------------------------------");
        System.out.println("Berikut Adalah Isi Array yang Telah Dimasukan:");
        for (int i = 0; i < jumlahBaris; i++) {
            for (int j = 0; j < jumlahKolom; j++) {
                System.out.println("Isi Indeks Baris Ke " + i + " Kolom Ke "+j+" Adalah: " + array[i][j]);
            }

        }
        System.out.println("----------------");
        System.out.println("Bentuk Matriks:");
        for (int i = 0; i < jumlahBaris; i++) {
            for (int j = 0; j < jumlahKolom; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}