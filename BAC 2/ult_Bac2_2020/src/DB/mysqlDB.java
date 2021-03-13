package DB;
import java.sql.*;
public class mysqlDB {

	static Connection con;
	public static String rapporteur;
	private static void getInstance(){
		rapporteur="";
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_inscription", "root", "");
			rapporteur="succes";
			//System.out.println("La connexion a été établie avec succes");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			rapporteur="La connexion echouée";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			rapporteur="Connexion echouée";
		}
			
		
		
	
	}
	
	public static ResultSet interrogerBD(String requete){
		ResultSet result=null;
		Statement st=null;
		if(con==null)
			getInstance();
		if(rapporteur.equalsIgnoreCase("succes"))
		{ 
			try {
				st=con.createStatement();
				result=st.executeQuery(requete);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return result;
	}
	
	public static int updateBD(String requete){
		int result=-1;
		Statement st=null;
		if(con==null)
			getInstance();
		if(rapporteur.equalsIgnoreCase("succes"))
		{
			try {
				st=con.createStatement();
				result=st.executeUpdate(requete);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getInstance();
	}

}
