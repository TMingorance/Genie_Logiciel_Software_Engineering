package system;

import study.*;
import study.Module;

import java.sql.*;

public class IGModel {

    Connection connexion;

    public IGModel() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "simon";
        String passwd = "Cookie@35";
        this.connexion = DriverManager.getConnection(url, user, passwd);
    }

    public void saveModule(Module module) throws SQLException { //En fait c'est la procédure pour enregistrer un nouveau module
        String request  = "INSERT INTO Module VALUES(?,?,?,?,?,?);"; // et non un module existant nan ?
        //nomModule, syllabus, rattrappable, modeEval, version, complementaire
        PreparedStatement preparedStatement = connexion.prepareStatement(request);
        preparedStatement.setString(1, module.getName());
        preparedStatement.setString(2, module.getSyllabus());
        preparedStatement.setString(3, module.getCompensatable() ? "1" : "0" );
        preparedStatement.setString(4, module.getEvaluationMode());
        preparedStatement.setString(5, "1");
        preparedStatement.setString(6, module.getClass() == AdditionalModule.class ? "1" : "0"); /*Il y a un choix arbitraire ici : un module
        ni Mandatory, ni Additional est aussi obligatoire*/



    }

    public void saveTeachingUnit(TeachingUnit TU) throws SQLException {
        String request = "INSERT INTO UE VALUES (?,?,?,?);";
        //nomUE, semestre, version, complementaire
        PreparedStatement preparedStatement = connexion.prepareStatement(request);
        preparedStatement.setString(1, TU.getName());
        preparedStatement.setString(2, Integer.toString(TU.getSemester()));
        preparedStatement.setString(3, "1");
        preparedStatement.setString(4, TU.getClass() == AdditionalTeachingUnit.class ? "1" : "0");/*Il y a un choix arbitraire ici : un UE
        ni Mandatory, ni Additional est aussi obligatoire*/

    }

    public void savePerson(user.UserAccount ua) throws SQLException { //En fait les login et MDP sont dans UserAccount
        String request = "INSERT INTO Personne VALUES (?,?,?,?,?);";
        //nomPersonne, prenomPersonne, login, MDP, role
        PreparedStatement preparedStatement = connexion.prepareStatement(request);
        preparedStatement.setString(1, ua.getOwner().getLastName());
        preparedStatement.setString(2, ua.getOwner().getFirstName());
        preparedStatement.setString(3, ua.getLogin());
        preparedStatement.setString(4, ua.getPassword());
        preparedStatement.setString(4, ua.getOwner().getRoles().toString()); /*ça écrira les noms des rôles
        entre crochets dans SQL, c'est ok ou pas ?*/


    }



    public static void main(String[] args) throws SQLException {
        try {
            String nomDriver = "com.mysql.cj.jdbc.Driver";
            try{
                Class.forName(nomDriver);
            }catch(ClassNotFoundException cnfe) {
                java.lang.System.out.println("La classe " + nomDriver + " n'a pas été trouvée");
                cnfe.printStackTrace();
            }

            String url = "jdbc:mysql://localhost:3306/mydb";
            String user = "simon";
            String passwd = "Cookie@35";

            Connection con = DriverManager.getConnection(url, user, passwd);
            java.lang.System.out.println("Connexion effective !");

            ResultSet resultats = null;

            //String requete = "UPDATE Gateau SET nombre = nombre - 8 WHERE Nom = 'Madeleine';";
            Statement stmt = con.createStatement();
            //int Nbupdate = stmt.executeUpdate(requete);
            resultats = stmt.executeQuery("SELECT * from Personne;");


            try {
                ResultSetMetaData rsmd = resultats.getMetaData();
                int nbCols = rsmd.getColumnCount();
                while (resultats.next()) {
                    for (int i = 1; i <= nbCols; i++)
                        java.lang.System.out.print(resultats.getString(i) + " ");
                    java.lang.System.out.println();
                }
                resultats.close();
            } catch (SQLException e) {
                //traitement de l'exception
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}