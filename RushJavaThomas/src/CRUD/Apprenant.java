package CRUD;

public class Apprenant {

	public int Id;
	public String Promotion;
	public String Nom;
	public String Prenom;
	public String Adresse;
	public String Email;
	public String Telephone;
	public int Absences;
	public boolean EstDelegue;

	public Apprenant(int Id, String Promotion, String Nom, String Prenom, String Adresse, String Email,
			String Telephone, int Absences, boolean EstDelegue) {

		this.Id = Id;
		this.Promotion = Promotion;
		this.Nom = Nom;
		this.Prenom = Prenom;
		this.Adresse = Adresse;
		this.Email = Email;
		this.Telephone = Telephone;
		this.Absences = Absences;
		this.EstDelegue = EstDelegue;

	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getPromotion() {
		return Promotion;
	}

	public void setPromotion(String promotion) {
		Promotion = promotion;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getTelephone() {
		return Telephone;
	}

	public void setTelephone(String telephone) {
		Telephone = telephone;
	}

	public int getAbsences() {
		return Absences;
	}

	public void setAbsences(int absences) {
		Absences = absences;
	}

	public boolean isEstDelegue() {
		return EstDelegue;
	}

	public void setEstDelegue(boolean estDelegue) {
		EstDelegue = estDelegue;
	}

	
}
