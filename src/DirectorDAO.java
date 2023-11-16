import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DirectorDAO {
    public static void crearDirector(Director director){
        coneccion db_conection = new coneccion();
        try(Connection conexion= db_conection.get_conConnetion()){
            PreparedStatement ps = null;
            try {
                String quary="INSERT INTO director (nombre, apellido1, apellido2, email, telefono) VALUES (?, ?, ?, ?, ?) ";
                ps=conexion.prepareStatement(quary);
                ps.setString(1, director.getNombre());
                ps.setString(2, director.getApellido1());
                ps.setString(3, director.getApellido2());
                ps.setString(4, director.getEmail());
                ps.setString(5, director.getTelefono());
                ps.executeUpdate();
                System.out.println("Insert exitoso");
            }catch (SQLException ex){
                System.out.println(ex);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void leerDirector(){

    }
    public static void borrarDirector(int id){

    }
    public static void actializarDirector(Director director){

    }
}
