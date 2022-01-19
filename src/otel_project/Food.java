package otel_project;

import java.io.Serializable;

class Yemek implements Serializable {
    int urunno;
    int adet;
    float fiyat;

    Yemek (int urunno, int adet) {
        this.urunno = urunno;
        this.adet = adet;
        switch(urunno) {
        case 1:
            this.fiyat = (float)(adet * 50);
            break;
        case 2:
            this.fiyat = (float)(adet * 60);
            break;
        case 3:
            this.fiyat = (float)(adet * 70);
            break;
        case 4:
            this.fiyat = (float)(adet * 30);
        }

    }
}