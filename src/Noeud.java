import java.util.ArrayList;


public class Noeud {

	private int ordre; // ordre de l'arbre
	private int tauxRemplissage; // taux de remplissage minimum du noeud
	private ArrayList<Integer> valeurs; // liste desv aleurs
	private ArrayList<Integer> pointeurs; // liste des pointeurs
	private boolean feuille; // est-ce que le noeud est une feuille ?
	private boolean racine; // est-ce que le noeud est une racine ?
	private Noeud noeudPere; // Le noeud pere du noeud
	
	public Noeud(int OrdreNoeud, int TauxDeRemplissage, Noeud Parent)
	{
		ordre = OrdreNoeud;
		tauxRemplissage = TauxDeRemplissage;
		valeurs = new ArrayList<Integer>();
		pointeurs = new ArrayList<Integer>();
		noeudPere = Parent;		
	}

	public int getOrdre() {
		return ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}

	public int getTauxRemplissage() {
		return tauxRemplissage;
	}

	public void setTauxRemplissage(int tauxRemplissage) {
		this.tauxRemplissage = tauxRemplissage;
	}

	public ArrayList<Integer> getValeurs() {
		return valeurs;
	}

	public void setValeurs(ArrayList<Integer> valeurs) {
		this.valeurs = valeurs;
	}

	public ArrayList<Integer> getPointeurs() {
		return pointeurs;
	}

	public void setPointeurs(ArrayList<Integer> pointeurs) {
		this.pointeurs = pointeurs;
	}

	public boolean isFeuille() {
		return feuille;
	}

	public void setFeuille(boolean feuille) {
		this.feuille = feuille;
	}

	public boolean isRacine() {
		return racine;
	}

	public void setRacine(boolean racine) {
		this.racine = racine;
	}

	public Noeud getNoeudPere() {
		return noeudPere;
	}

	public void setNoeudPere(Noeud noeudPere) {
		this.noeudPere = noeudPere;
	}
}
