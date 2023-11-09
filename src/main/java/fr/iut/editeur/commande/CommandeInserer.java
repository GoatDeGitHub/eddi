package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeInserer extends CommandeDocument {

    public CommandeInserer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if (parameters.length != 3) {
            System.err.println("Format attendu : inserer;index;chaine");
            return;
        }

        int index = Integer.parseInt(parameters[1]);
        String chaine = parameters[2];

        if (index < 0 || index > document.getTexte().length()) {
            System.err.println("Index invalide. Veuillez vérifier la valeur de l'index.");
            return;
        }

        this.document.inserer(index, chaine);
        super.executer();
    }
}
