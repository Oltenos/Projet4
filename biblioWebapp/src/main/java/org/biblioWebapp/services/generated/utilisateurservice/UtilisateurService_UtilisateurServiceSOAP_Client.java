package org.biblioWebapp.services.generated.utilisateurservice;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import org.biblioWebapp.services.generated.types.Utilisateur;

/**
 * This class was generated by Apache CXF 3.2.4 2018-06-28T13:13:05.624+02:00
 * Generated source version: 3.2.4
 *
 */
public final class UtilisateurService_UtilisateurServiceSOAP_Client {

	private static final QName SERVICE_NAME = new QName("http://www.example.org/UtilisateurService/",
			"UtilisateurService");

	private UtilisateurService_UtilisateurServiceSOAP_Client() {
	}

	public static void main(String args[]) throws java.lang.Exception {
		URL wsdlURL = UtilisateurService_Service.WSDL_LOCATION;
		if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
			File wsdlFile = new File(args[0]);
			try {
				if (wsdlFile.exists()) {
					wsdlURL = wsdlFile.toURI().toURL();
				} else {
					wsdlURL = new URL(args[0]);
				}
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}

		UtilisateurService_Service ss = new UtilisateurService_Service(wsdlURL, SERVICE_NAME);
		UtilisateurService port = ss.getUtilisateurServiceSOAP();

		{
			System.out.println("Invoking creerUtilisateur...");
			java.lang.String _creerUtilisateur_nom = "";
			java.lang.String _creerUtilisateur_prenom = "";
			java.lang.String _creerUtilisateur_email = "";
			java.lang.String _creerUtilisateur_mdp = "";
			try {
				port.creerUtilisateur(_creerUtilisateur_nom, _creerUtilisateur_prenom, _creerUtilisateur_email,
						_creerUtilisateur_mdp);

			} catch (CreerUtilisateurFault1 e) {
				System.out.println("Expected exception: creerUtilisateurFault1 has occurred.");
				System.out.println(e.toString());
			} catch (CreerUtilisateurFault_Exception e) {
				System.out.println("Expected exception: creerUtilisateurFault has occurred.");
				System.out.println(e.toString());
			}
		}
		{
			System.out.println("Invoking authentifierUtilisateur...");
			java.lang.String _authentifierUtilisateur_email = "";
			java.lang.String _authentifierUtilisateur_mdp = "";
			try {
				Utilisateur _authentifierUtilisateur__return = port
						.authentifierUtilisateur(_authentifierUtilisateur_email, _authentifierUtilisateur_mdp);
				System.out.println("authentifierUtilisateur.result=" + _authentifierUtilisateur__return);

			} catch (AuthentifierUtilisateurFault_Exception e) {
				System.out.println("Expected exception: authentifierUtilisateurFault has occurred.");
				System.out.println(e.toString());
			}
		}
		{
			System.out.println("Invoking modifierUtilisateur...");
			int _modifierUtilisateur_id = 0;
			java.lang.String _modifierUtilisateur_ancienMdp = "";
			java.lang.String _modifierUtilisateur_nouveauNom = "";
			java.lang.String _modifierUtilisateur_nnouveauPrenom = "";
			java.lang.String _modifierUtilisateur_nouveauEmail = "";
			java.lang.String _modifierUtilisateur_nouveauMdp = "";
			try {
				port.modifierUtilisateur(_modifierUtilisateur_id, _modifierUtilisateur_ancienMdp,
						_modifierUtilisateur_nouveauNom, _modifierUtilisateur_nnouveauPrenom,
						_modifierUtilisateur_nouveauEmail, _modifierUtilisateur_nouveauMdp);

			} catch (ModifierUtilisateurFault1 e) {
				System.out.println("Expected exception: modifierUtilisateurFault1 has occurred.");
				System.out.println(e.toString());
			} catch (ModifierUtilisateurFault_Exception e) {
				System.out.println("Expected exception: modifierUtilisateurFault has occurred.");
				System.out.println(e.toString());
			}
		}
		{
			System.out.println("Invoking supprimerUtilisateur...");
			int _supprimerUtilisateur_id = 0;
			java.lang.String _supprimerUtilisateur_mdp = "";
			try {
				port.supprimerUtilisateur(_supprimerUtilisateur_id, _supprimerUtilisateur_mdp);

			} catch (SupprimerUtilisateurFault_Exception e) {
				System.out.println("Expected exception: supprimerUtilisateurFault has occurred.");
				System.out.println(e.toString());
			}
		}

		System.exit(0);
	}

}
