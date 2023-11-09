package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    @Override
    public String toString() {
        return this.texte;
    }

    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }

    public void majuscules(int start, int end) {
        String Gpart = texte.substring(0, start);
        String Dpart = texte.substring(end);
        String modif = texte.substring(start,end).toUpperCase();
        texte = Gpart + modif + Dpart;
    }

    public void effacer(int start, int end) {
        String Gpart = texte.substring(0, start);
        String Dpart = texte.substring(end);
        texte = Gpart + "" + Dpart;
    }

    public void inserer(int index, String insertion) {
        if (index >= 0 && index <= texte.length()) {
            String leftPart = texte.substring(0, index);
            String rightPart = texte.substring(index);
            texte = leftPart + insertion + rightPart;
        } else {
            // Handle the case where the index is out of bounds, or handle it as per your application requirements.
            System.out.println("Invalid index for insertion.");
        }
    }

    public void clear(){
        texte= "";
    }
}
