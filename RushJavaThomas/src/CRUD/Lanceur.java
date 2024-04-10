package CRUD;

//import java.util.ArrayList;
//import java.util.List;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Lanceur {
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		
		//Apprenant test = new Apprenant(1, "DI22", "Martin", "Loïc", "Bordeaux", "loicmartin@viacesi.fr", "0601020304", 3, false);
		//System.out.println(test.getNom());
		
		//List<Apprenant> listeApprenant = new ArrayList<>();
		//listeApprenant.add(new Apprenant(1, "DI22", "Martin", "Loïc", "Bordeaux", "loicmartin@viacesi.fr", "0601020304", 3, false));
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3307/absencesapprenants", "root", "")){

	}
}
	
}
