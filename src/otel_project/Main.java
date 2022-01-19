package otel_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Main {
	public Main() {
	}

	public static void main(String[] args) {
		try {
			File f = new File("backup");
			if (f.exists()) {
				FileInputStream fin = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fin);
				Otel.otel_ob = (Admin) ois.readObject();
			}

			Scanner sc = new Scanner(System.in);

			char istek;
			do {
				System.out.println(
						"\nSeciminizi giriniz :\n1.Oda ozelliklerini goster\n2.Odanin musaitligini goster \n3.Rezerve et \n4.Yemek Siparisi\n5.Odeme\n6.Cikis\n");
				int secim = sc.nextInt();
				int secim2;
				switch (secim) {
				case 1:
					System.out.println(
							"\nOda tipini seciniz  :\n1.Luxury Iki Kisilik  Oda \n2.Deluxe Iki Kisilik  Oda \n3.Luxury Tek Kisilik Oda \n4.Deluxe Tek Kisilik Oda\n");
					secim2 = sc.nextInt();
					Otel.ozellikler(secim2);
					break;
				case 2:
					System.out.println(
							"\nOda tipini seciniz  :\n1.Luxury Iki Kisilik  Oda \n2.Deluxe Iki Kisilik  Oda \n3.Luxury Tek Kisilik Oda \n4.Deluxe Tek Kisilik Oda\n");
					secim2 = sc.nextInt();
					Otel.availability(secim2);
					break;
				case 3:
					System.out.println(
							"\nOda tipini seciniz  :\n1.Luxury Iki Kisilik  Oda \n2.Deluxe Iki Kisilik  Oda \n3.Luxury Tek Kisilik Oda \n4.Deluxe Tek Kisilik Oda\n");
					secim2 = sc.nextInt();
					Otel.odaRezerve(secim2);
					break;
				case 4:
					System.out.print("Oda numarasi -");
					secim2 = sc.nextInt();
					if (secim2 > 60) {
						System.out.println("Oda yok");
					} else if (secim2 > 40) {
						Otel.siparis(secim2 - 41, 4);
					} else if (secim2 > 30) {
						Otel.siparis(secim2 - 31, 3);
					} else if (secim2 > 10) {
						Otel.siparis(secim2 - 11, 2);
					} else if (secim2 > 0) {
						Otel.siparis(secim2 - 1, 1);
					} else {
						System.out.println("Bos odamiz yok ");
					}
					break;
				case 5:
					System.out.print("Oda numarasi -");
					secim2 = sc.nextInt();
					if (secim2 > 60) {
						System.out.println("Bu oda mevcut degil");
					} else if (secim2 > 40) {
						Otel.deallocate(secim2 - 41, 4);
					} else if (secim2 > 30) {
						Otel.deallocate(secim2 - 31, 3);
					} else if (secim2 > 10) {
						Otel.deallocate(secim2 - 11, 2);
					} else if (secim2 > 0) {
						Otel.deallocate(secim2 - 1, 1);
					} else {
						System.out.println("Bu oda mevcut degil");
					}
					break;
				case 6:
					break;
				}

				System.out.println("\nDevam : (y/n)");
				istek = sc.next().charAt(0);
				if (istek != 'y' && istek != 'Y' && istek != 'n' && istek != 'N') {
					System.out.println("Geçersiz Seçenek");
					System.out.println("\nDevam : (y/n)");
					istek = sc.next().charAt(0);
				}
			} while (istek == 'y' || istek == 'Y');

			Thread t = new Thread(new yaz(Otel.otel_ob));
			t.start();
		} catch (Exception e) {
			System.out.println("Geçerli bir giriþ deðil");
		}

	}
}
