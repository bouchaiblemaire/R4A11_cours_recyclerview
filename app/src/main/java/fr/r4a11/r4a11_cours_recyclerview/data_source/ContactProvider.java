package fr.r4a11.r4a11_cours_recyclerview.data_source;

import java.util.ArrayList;

/**
 * @author  B. LEMAIRE
 * @version 2024
 *
 * Source de données pour l'application
 */
public class ContactProvider {

    /**
     * Retourne une liste de contacts
     * @return (ArrayList<String>)
     */
    public static final ArrayList<String> getContacts() {
        ArrayList<String> contacts = new ArrayList<String>();

        for (String nom : new String[]{
                "Farida",
                "Ginette",
                "Founette",
                "Marguerite",
                "Titinette",
                "Bibounette",
                "Vachounette",
                "Babinette"
        }) {
            contacts.add(nom);
        }

        return contacts;
    }
}