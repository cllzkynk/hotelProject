package otel_project;

import java.io.Serializable;
import java.util.ArrayList;

public class TekKisilikOda   implements Serializable {
	    String isim;
	    String iletisim;
	    String cinsiyet;
	    ArrayList<Yemek> yemek = new ArrayList();

	    TekKisilikOda() {
	        this.isim = "";
	    }

	    TekKisilikOda(String isim, String letisim, String cinsiyet) {
	        this.isim = isim;
	        this. iletisim = iletisim;
	        this.cinsiyet =cinsiyet;
	    }
	}
