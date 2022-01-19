package otel_project;

import java.util.Iterator;
import java.util.Scanner;

public class Otel {

	    static Admin otel_ob = new Admin ();
	    static Scanner sc;

	    Otel() {
	    }

	    static void MusteriDetaylari(int i, int rn) {
	        String isim2 = null;
	        String irtibat2 = null;
	        String cinsiyet2 = "";
	        System.out.print("\nIsminizi giriniz: ");
	        String isim = sc.next();
	        System.out.print("Telefon numaranizi giriniz: ");
	        String irtibat = sc.next();
	        System.out.print("Cinsiyet: ");
	        String cinsiyet = sc.next();
	        if (i < 3) {
	            System.out.print("Ikinci musterinin isimi: ");
	            isim2 = sc.next();
	            System.out.print("Telefon numarasi: ");
	            irtibat2 = sc.next();
	            System.out.print("Cinsiyeti: ");
	            cinsiyet2 = sc.next();
	        }

	        switch(i) {
	        case 1:
	            otel_ob.luxury_ikikisilik[rn] = new ikiKisilikOda(isim, irtibat, cinsiyet, isim2, irtibat2, cinsiyet2);
	            break;
	        case 2:
	            otel_ob.deluxe_ikikisilik[rn] = new ikiKisilikOda(isim, irtibat, cinsiyet, isim2, irtibat2, cinsiyet2);
	            break;
	        case 3:
	            otel_ob.luxury_tekkisilik[rn] = new TekKisilikOda(isim, irtibat, cinsiyet);
	            break;
	        case 4:
	            otel_ob.deluxe_tekkisilik[rn] = new TekKisilikOda(isim, irtibat, cinsiyet);
	            break;
	        default:
	            System.out.println("Yanlis secim");
	        }

	    }

	    static void odaRezerve(int i) {
	        System.out.println("\nOda numarasýný seçin : ");
	        int j;
	        int rn;
	        switch(i) {
	        case 1:
	            for(j = 0; j < otel_ob.luxury_ikikisilik.length; ++j) {
	                if (otel_ob.luxury_ikikisilik[j] == null) {
	                    System.out.print(j + 1 + ",");
	                }
	            }

	            System.out.print("\nOda numarasýný giriniz: ");

	            try {
	                rn = sc.nextInt();
	                --rn;
	                if (otel_ob.luxury_ikikisilik[rn] != null) {
	                    throw new MusaitDegil();
	                }

	                MusteriDetaylari(i, rn);
	                break;
	            } catch (Exception var7) {
	                System.out.println("Gecersiz Secim");
	                return;
	            }
	        case 2:
	            for(j = 0; j < otel_ob.deluxe_ikikisilik.length; ++j) {
	                if (otel_ob.deluxe_ikikisilik[j] == null) {
	                    System.out.print(j + 11 + ",");
	                }
	            }

	            System.out.print("\nOda numarasýný giriniz: ");

	            try {
	                rn = sc.nextInt();
	                rn -= 11;
	                if (otel_ob.deluxe_ikikisilik[rn] != null) {
	                    throw new MusaitDegil();
	                }

	                MusteriDetaylari(i, rn);
	                break;
	            } catch (Exception var6) {
	                System.out.println("Gecersiz Secim");
	                return;
	            }
	        case 3:
	            for(j = 0; j < otel_ob.luxury_tekkisilik.length; ++j) {
	                if (otel_ob.luxury_tekkisilik[j] == null) {
	                    System.out.print(j + 31 + ",");
	                }
	            }

	            System.out.print("\nOda numarasýný giriniz: ");

	            try {
	                rn = sc.nextInt();
	                rn -= 31;
	                if (otel_ob.luxury_tekkisilik[rn] != null) {
	                    throw new MusaitDegil();
	                }

	                MusteriDetaylari(i, rn);
	                break;
	            } catch (Exception var5) {
	                System.out.println("Gecersiz Secim");
	                return;
	            }
	        case 4:
	            for(j = 0; j < otel_ob.deluxe_tekkisilik.length; ++j) {
	                if (otel_ob.deluxe_tekkisilik[j] == null) {
	                    System.out.print(j + 41 + ",");
	                }
	            }

	            System.out.print("\nOda numarasýný giriniz: ");

	            try {
	                rn = sc.nextInt();
	                rn -= 41;
	                if (otel_ob.deluxe_tekkisilik[rn] != null) {
	                    throw new MusaitDegil();
	                }

	                MusteriDetaylari(i, rn);
	                break;
	            } catch (Exception var4) {
	                System.out.println("Gecersiz Secim");
	                return;
	            }
	        default:
	            System.out.println("Geçerli seçeneði girin");
	        }

	        System.out.println("Oda Rezerve Edildi");
	    }

	    static void ozellikler(int i) {
	        switch(i) {
	        case 1:
	            System.out.println("Çift kiþilik yatak sayýsý : 1\nKlima : Evet\nUcretsiz Kahvalti : Yes\nGünlük ücret:4000 ");
	            break;
	        case 2:
	            System.out.println("Çift kiþilik yatak sayýsý : 1\nKlima : Hayir\nUcretsiz Kahvalti : Yes\nGünlük ücret:3000  ");
	            break;
	        case 3:
	            System.out.println("Tek kiþilik yatak sayýsý : 1\nKlima : Evet\nUcretsiz Kahvalti : Yes\nGünlük ücret:2200  ");
	            break;
	        case 4:
	            System.out.println("Tek kiþilik yatak sayýsý : 1\nKlima : Hayir\nUcretsiz Kahvalti : Yes\nGünlük ücret:1200 ");
	            break;
	        default:
	            System.out.println("Geçerli seçeneði girin");
	        }

	    }

	    static void availability(int i) {
	        int count;
	        count = 0;
	        int j;

	        switch(i) {
	        case 1:
	            j = 0;

	            while(true) {
	                if (j >= 10) {
	                    break ;
	                }

	                if (otel_ob.luxury_ikikisilik[j] == null) {
	                    ++count;
	                }

	                ++j;
	            }
	        case 2:
	            j = 0;

	            while(true) {
	                if (j >= otel_ob.deluxe_ikikisilik.length) {
	                    break ;
	                }

	                if (otel_ob.deluxe_ikikisilik[j] == null) {
	                    ++count;
	                }

	                ++j;
	            }
	        case 3:
	            j = 0;

	            while(true) {
	                if (j >= otel_ob.luxury_tekkisilik.length) {
	                    break ;
	                }

	                if (otel_ob.luxury_tekkisilik[j] == null) {
	                    ++count;
	                }

	                ++j;
	            }
	        case 4:
	            j = 0;

	            while(true) {
	                if (j >= otel_ob.deluxe_tekkisilik.length) {
	                    break ;
	                }

	                if (otel_ob.deluxe_tekkisilik[j] == null) {
	                    ++count;
	                }

	                ++j;
	            }
	        default:
	            System.out.println("Geçerli seçeneði girin");
	        }

	        System.out.println("Mevcut oda sayýsý : " + count);
	    }

	    static void fatura(int rn, int rtype) {
	        double amount;
	        amount = 0.0D;
	        String[] list = new String[]{"Sandwich", "Pasta", "Noodles", "Kek"};
	        System.out.println("\n*******");
	        System.out.println(" Fatura:-");
	        System.out.println("*******");
	        Iterator var5;
	        Yemek obj;
	        String format;
	    
	        switch(rtype) {
	        case 1:
	            amount += 4000.0D;
	            System.out.println("\nOda ücreti - 4000");
	            System.out.println("\n===============");
	            System.out.println("Yemek ücreti:- ");
	            System.out.println("===============");
	            System.out.println("Ürün Adet Fiyat");
	            System.out.println("-------------------------");
	            var5 = otel_ob.luxury_ikikisilik[rn].yemek.iterator();

	            while(true) {
	                if (!var5.hasNext()) {
	                    break;
	                }

	                obj = (Yemek)var5.next();
	                amount += (double)obj.fiyat;
	                format = "%-10s%-10s%-10s%n";
	                System.out.printf(format, list[obj.urunno - 1], obj.adet, obj.fiyat);
	            }
	        case 2:
	            amount += 3000.0D;
	            System.out.println("Oda ücreti - 3000");
	            System.out.println("\nYemek ücreti:- ");
	            System.out.println("===============");
	            System.out.println("Ürün Adet Fiyat");
	            System.out.println("-------------------------");
	            var5 = otel_ob.deluxe_ikikisilik[rn].yemek.iterator();

	            while(true) {
	                if (!var5.hasNext()) {
	                    break ;
	                }

	                obj = (Yemek)var5.next();
	                amount += (double)obj.fiyat;
	                format = "%-10s%-10s%-10s%n";
	                System.out.printf(format, list[obj.urunno - 1], obj.adet, obj.fiyat);
	            }
	        case 3:
	            amount += 2200.0D;
	            System.out.println("Oda ücreti - 2200");
	            System.out.println("\nYemek ücreti:- ");
	            System.out.println("===============");
	            System.out.println("Ürün Adet Fiyat");
	            System.out.println("-------------------------");
	            var5 = otel_ob.luxury_tekkisilik[rn].yemek.iterator();

	            while(true) {
	                if (!var5.hasNext()) {
	                    break ;
	                }

	                obj = (Yemek)var5.next();
	                amount += (double)obj.fiyat;
	                format = "%-10s%-10s%-10s%n";
	                System.out.printf(format, list[obj.urunno - 1], obj.adet, obj.fiyat);
	            }
	        case 4:
	            amount += 1200.0D;
	            System.out.println("Oda ücreti - 1200");
	            System.out.println("\nYemek ücreti:- ");
	            System.out.println("===============");
	            System.out.println("Ürün Adet Fiyat");
	            System.out.println("-------------------------");
	            var5 = otel_ob.deluxe_tekkisilik[rn].yemek.iterator();

	            while(true) {
	                if (!var5.hasNext()) {
	                    break ;
	                }

	                obj = (Yemek)var5.next();
	                amount += (double)obj.fiyat;
	                format = "%-10s%-10s%-10s%n";
	                System.out.printf(format, list[obj.urunno - 1], obj.adet, obj.fiyat);
	            }
	        default:
	            System.out.println("Not valid");
	        }

	        System.out.println("\nTotal Amount- " + amount);
	    }

	    static void deallocate(int rn, int rtype) {
	    	TekKisilikOda var10001;
	        char w;
	        ikiKisilikOda var4;
	        switch(rtype) {
	        case 1:
	            if (otel_ob.luxury_ikikisilik[rn] == null) {
	                System.out.println("Musait Durumda");
	                return;
	            }

	            var4 = otel_ob.luxury_ikikisilik[rn];
	            System.out.println("Room used by " + var4.isim);
	            System.out.println("Do you want to checkout ?(y/n)");
	            w = sc.next().charAt(0);
	            if (w == 'y' || w == 'Y') {
	            	fatura(rn, rtype);
	                otel_ob.luxury_ikikisilik[rn] = null;
	                System.out.println("Deallocated succesfully");
	            }
	            break;
	        case 2:
	            if (otel_ob.deluxe_ikikisilik[rn] == null) {
	                System.out.println("Musait Durumda");
	                return;
	            }

	            var4 = otel_ob.deluxe_ikikisilik[rn];
	            System.out.println("Room used by " + var4.isim);
	            System.out.println(" Do you want to checkout ?(y/n)");
	            w = sc.next().charAt(0);
	            if (w == 'y' || w == 'Y') {
	            	fatura(rn, rtype);
	                otel_ob.deluxe_ikikisilik[rn] = null;
	                System.out.println("Deallocated succesfully");
	            }
	            break;
	        case 3:
	            if (otel_ob.luxury_tekkisilik[rn] == null) {
	                System.out.println("Musait Durumda");
	                return;
	            }

	            var10001 = otel_ob.luxury_tekkisilik[rn];
	            System.out.println("Room used by " + var10001.isim);
	            System.out.println(" Do you want to checkout ? (y/n)");
	            w = sc.next().charAt(0);
	            if (w == 'y' || w == 'Y') {
	            	fatura(rn, rtype);
	                otel_ob.luxury_tekkisilik[rn] = null;
	                System.out.println("Deallocated succesfully");
	            }
	            break;
	        case 4:
	            if (otel_ob.deluxe_tekkisilik[rn] == null) {
	                System.out.println("Musait Durumda");
	                return;
	            }

	            var10001 = otel_ob.deluxe_tekkisilik[rn];
	            System.out.println("Room used by " + var10001.isim);
	            System.out.println(" Do you want to checkout ? (y/n)");
	            w = sc.next().charAt(0);
	            if (w == 'y' || w == 'Y') {
	            	fatura(rn, rtype);
	                otel_ob.deluxe_tekkisilik[rn] = null;
	                System.out.println("Deallocated succesfully");
	            }
	            break;
	        default:
	            System.out.println("\nGeçerli seçeneði girin : ");
	        }

	    }

	    static void siparis(int rn, int rtype) {
	        try {
	            System.out.println("\n==========\n   Menu:  \n==========\n\n1.Sandwich\tTL 50\n2.Pasta\t\tTL 60\n3.Noodles\tTL 70\n4.Kek\t\tTL 30\n");

	            char wish;
	            do {
	                do {
	                    int i = sc.nextInt();
	                    System.out.print("Adet- ");
	                    int q = sc.nextInt();
	                    switch(rtype) {
	                    case 1:
	                        otel_ob.luxury_ikikisilik[rn].yemek.add(new Yemek(i, q));
	                        break;
	                    case 2:
	                        otel_ob.deluxe_ikikisilik[rn].yemek.add(new Yemek(i, q));
	                        break;
	                    case 3:
	                        otel_ob.luxury_tekkisilik[rn].yemek.add(new Yemek(i, q));
	                        break;
	                    case 4:
	                        otel_ob.deluxe_tekkisilik[rn].yemek.add(new Yemek(i, q));
	                    }

	                    System.out.println("Baþka bir þey sipariþ etmek ister misin ? (y/n)");
	                    wish = sc.next().charAt(0);
	                } while(wish == 'y');
	            } while(wish == 'Y');
	        } catch (NullPointerException var6) {
	            System.out.println("\nOda rezerve edilmedi");
	        } catch (Exception var7) {
	            System.out.println("Cannot be done");
	        }

	    }

	    static {
	        sc = new Scanner(System.in);
	    }
	}
