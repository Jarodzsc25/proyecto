import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MateriasDAO {
    public static void crearMaterias(Materias materias){
        coneccion db_conection = new coneccion();
        try(Connection conexion= db_conection.get_conConnetion()){
            PreparedStatement ps = null;
            try {
                String quary="INSERT INTO materias (materia1,materia2,materia3,materia4,materia5,materia6,materia7) VALUES (?,?,?, ?, ?, ?, ?) ";
                ps=conexion.prepareStatement(quary);
                ps.setString(1, materias.getMateria1());
                ps.setString(2, materias.getMateria2());
                ps.setString(3, materias.getMateria3());
                ps.setString(4, materias.getMateria4());
                ps.setString(5, materias.getMateria5());
                ps.setString(6, materias.getMateria6());
                ps.setString(7, materias.getMateria7());
                ps.executeUpdate();
                System.out.println("Insert exitoso");
            }catch (SQLException ex){
                System.out.println(ex);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void leerMaterias(){
        coneccion db_conexion = new coneccion();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try(Connection conexion = db_conexion.get_conConnetion()){
            String query= "SELECT * FROM materias ";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()){
                System.out.println("id: "+rs.getInt("id"));
                System.out.println("primera materia: "+rs.getString("materia1"));
                System.out.println("segunda materia: "+rs.getString("materia2"));
                System.out.println("tercera materia: "+rs.getString("materia3"));
                System.out.println("cuarta materia: "+rs.getString("materia4"));
                System.out.println("quinta materia: "+rs.getString("materia5"));
                System.out.println("sexta materia: "+rs.getString("materia6"));
                System.out.println("septima materia: "+rs.getString("materia7"));
                System.out.println("*****");
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void borrarMaterias(int id){

    }
    public static void actializarMaterias(Materias materias){

    }
}
