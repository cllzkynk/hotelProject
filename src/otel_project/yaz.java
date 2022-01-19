package otel_project;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class yaz  implements Runnable {
	    Admin  otel_ob;

	    yaz(Admin  otel_ob) {
	        this. otel_ob =  otel_ob;
	    }

	    public void run() {
	        try {
	            FileOutputStream fout = new FileOutputStream("backup");
	            ObjectOutputStream oos = new ObjectOutputStream(fout);
	            oos.writeObject(this.otel_ob);
	            oos.close();
	        } catch (Exception var3) {
	            System.out.println("Yazma Hatasi " + var3);
	        }

	    }
	}
