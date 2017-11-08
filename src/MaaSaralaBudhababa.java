import java.io.File;
import java.io.IOException;
import java.security.Security;

import org.hibernate.cfg.Configuration;  
public class MaaSaralaBudhababa {
	public static void main(String []args) throws IOException{
		System.out.println("MaaSaralaBudhababa");
//		Configuration cfg=new Configuration();
		File f = new File("C:/Users/595954/Desktop/com.ge.predix.workshop.nodeconfig1.json");
		if (!f.exists()) {
			f.createNewFile();
		}
		System.setSecurityManager(new SecurityManager());
		//Security.setProperty("C:/Users/595954/com.ge.predix.workshop.nodeconfig.json", "read");
		//System.getSecurityManager().checkRead("C:/predix-machine-template-adapter-simulator/predix-scripts/bash/PredixMachine/configuration/machine/com.ge.predix.workshop.nodeconfig.json");
		System.getSecurityManager().checkRead("C:/Users/595954/Desktop/com.ge.predix.workshop.nodeconfig1.json");
		//System.setProperty("C:/com.ge.predix.workshop.nodeconfig.json", "write");	
		//System.getSecurityManager().checkSecurityAccess("C:/com.ge.predix.workshop.nodeconfig.json");
		//Security.setProperty("C:/com.ge.predix.workshop.nodeconfig.json", "write");
	    
	}

}
