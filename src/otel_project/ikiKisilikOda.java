package otel_project;

import java.io.Serializable;

public class ikiKisilikOda  extends  TekKisilikOda  implements Serializable {
	    String isim2;
	    String iletisim2;
	    String cinsiyet2;

	    ikiKisilikOda() {
	        this.isim = "";
	        this.isim2 = "";
	    }

	    ikiKisilikOda(String isim, String iletisim, String cinsiyet, String isim2, String iletisim2, String cinsiyet2) {
	        this.isim = isim;
	        this.iletisim = iletisim;
	        this.cinsiyet = cinsiyet;
	        this.isim2 = isim2;
	        this.iletisim2 = iletisim2;
	        this.cinsiyet2 = cinsiyet2;
	    }
	}


