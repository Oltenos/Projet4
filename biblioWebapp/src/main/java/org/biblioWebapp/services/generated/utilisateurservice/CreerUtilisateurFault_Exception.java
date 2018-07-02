package org.biblioWebapp.services.generated.utilisateurservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-06-28T13:13:05.856+02:00
 * Generated source version: 3.2.4
 */

@WebFault(name = "creerUtilisateurParamsFault", targetNamespace = "http://www.example.org/UtilisateurService/")
public class CreerUtilisateurFault_Exception extends Exception {
	private static final long serialVersionUID = 1L;
	
	private CreerUtilisateurParamsFault creerUtilisateurParamsFault;

    public CreerUtilisateurFault_Exception() {
        super();
    }

    public CreerUtilisateurFault_Exception(String message) {
        super(message);
    }

    public CreerUtilisateurFault_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public CreerUtilisateurFault_Exception(String message, CreerUtilisateurParamsFault creerUtilisateurParamsFault) {
        super(message);
        this.creerUtilisateurParamsFault = creerUtilisateurParamsFault;
    }

    public CreerUtilisateurFault_Exception(String message, CreerUtilisateurParamsFault creerUtilisateurParamsFault, java.lang.Throwable cause) {
        super(message, cause);
        this.creerUtilisateurParamsFault = creerUtilisateurParamsFault;
    }

    public CreerUtilisateurParamsFault getFaultInfo() {
        return this.creerUtilisateurParamsFault;
    }
}
