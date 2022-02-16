package collaborateur.web.service.client.main;

import java.net.MalformedURLException;
import java.net.URL;

import collaborateur.web.service.client.Collaborateur;
import collaborateur.web.service.client.CollaborateurService;
import collaborateur.web.service.client.CollaborateurServiceImplService;

/**
 * 
 * @author mrshakibaei
 *
 */
public class main {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("http://localhost:8478/collaborateurService?wsdl");
			CollaborateurServiceImplService serviceImpl = new CollaborateurServiceImplService();
			CollaborateurService proxy = serviceImpl.getCollaborateurServiceImplPort();
			
			System.out.println("le nombre total des emplyé = " +proxy.count() );
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

}
