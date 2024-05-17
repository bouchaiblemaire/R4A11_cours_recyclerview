package fr.r4a11.r4a11_cours_recyclerview.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import fr.r4a11.r4a11_cours_recyclerview.R;

/**
 * @author B. LEMAIRE
 * @version 2024
 * Permet d'initialiser et remplir une cellule du RecyclerView
 */

public class ContactViewHolder extends RecyclerView.ViewHolder {
    /**
     * C'est la TextView qui sera rempli par les données
     * issues de l'Adapter (informations que doit afficher
     * le RecyclerView)
     */
    private final TextView _tv_nom;

    /**
     * Instancie un ViewHolder et le rattache à une cellule (View)
     * @param cell (View) : cellule à laquelle il faut rattacher
     *                      le ViewHolder
     */
    public ContactViewHolder(View cell) {
        super(cell);
        this._tv_nom = (TextView) cell.findViewById(R.id.tv_nom);
    }

    public TextView get_tv_nom() {
        return _tv_nom;
    }
}