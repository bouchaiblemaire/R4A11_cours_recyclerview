package fr.r4a11.r4a11_cours_recyclerview.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import fr.r4a11.r4a11_cours_recyclerview.R;

/**
 * B. LEMAIRE
 * @version 2024
 */

public class ContactsAdapter extends RecyclerView.Adapter<ContactViewHolder> {
    /**
     * Contexte de l'Activity auquel est rattaché le RecyclerView
     */
    private Context _context;

    /**
     * Liste des noms des contacts
     */
    private ArrayList<String> _contactsList;

    /**
     * Constructeur de l'Adapter
     *
     * @param context (Context) : Contexte de l'Activity auquel est rattaché
     *                            le RecyclerView
     * @param contactsList  (ArrayList<String>) : Liste des noms des contacts qui
     *                                       "alimenteront" le RecyclerView
     */
    public ContactsAdapter(Context context, ArrayList<String> contactsList) {
        this._context = context;
        this._contactsList = contactsList;

        /**
         * Notifie au RecyclerView qu'il doit se rafraichir
         */
        notifyDataSetChanged();
    }

    /**
     * Permet de créer les cellules visibles
     * Est appelé une seule fois
     * @param parent (ViewGroup) : Parent auquel sera ajouté la cellule qui
     *                             va être crée
     * @param viewType
     * @return (ContactViewHolder) : Cellule qui est crée et initialisée
     */
    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        /**
         * Déserialisation de la cellule
         * La valeur false permet de ne pas rattacher la cellule directement
         * au parent, mais de laisser cette responsabilité au RecyclerView
         */
        View cell =
                LayoutInflater.from(this._context).inflate(R.layout.content_cell,
                        parent,
                        false);

        /**
         * Remplissage de la cellule
         */
        ContactViewHolder contactViewHolder = new ContactViewHolder(cell);
        return contactViewHolder;
    }

    /**
     * Permet de remplir les cellules visibles
     * @param holder (ContactViewHolder) : cellule à remplir
     * @param position (int) : position de la cellule dans la liste
     */
    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        holder.get_tv_nom().setText(this._contactsList.get(position));
    }

    /**
     * Nombre total de cellules (visibles et non visibles) du RecyclerView
     * @return (int) : Nombre total de cellules présentes dans le RecyclerView
     */
    @Override
    public int getItemCount() {
        int itemCount = 0;

        if (this._contactsList !=null){
            itemCount = this._contactsList.size();
        }
        return itemCount;
    }
} // Fin de la classe ContactsAdapter