package fr.r4a11.r4a11_cours_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import fr.r4a11.r4a11_cours_recyclerview.data_source.ContactProvider;
import fr.r4a11.r4a11_cours_recyclerview.recyclerview.ContactsAdapter;

public class MainActivity extends AppCompatActivity {
    private RecyclerView _rvContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Désérialisation du RecyclerView et mise en place de son
         * gestionnaire de placement
         */
        this._rvContacts = (RecyclerView) this.findViewById(R.id.rv_contacts);
        this._rvContacts.setLayoutManager(new LinearLayoutManager(this));

        /**
         * Initialisation du RecyclerView avec les noms de contacts
         */
        ArrayList<String> contactsList = ContactProvider.getContacts();

        /**
         * Instanciation de l'Adapter qui alimentera le RecyclerView
         */
        ContactsAdapter adapter = new ContactsAdapter(this, contactsList);

        /**
         * Association du RecyclerView avec son Adaptateur qui l'alimentera avec
         * les noms de contacts
         */
        this._rvContacts.setAdapter(adapter);
    }
}