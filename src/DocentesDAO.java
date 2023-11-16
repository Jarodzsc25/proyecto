import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DocentesDAO {
    public static void crearDocentes(Docentes docentes){
        coneccion db_conection = new coneccion();
        try(Connection conexion= db_conection.get_conConnetion()){
            PreparedStatement ps = null;
            try {
                String quary="INSERT INTO docentes (nombre, apellido1, apellido2, email, telefono) VALUES (?, ?, ?, ?, ?) ";
                ps=conexion.prepareStatement(quary);
                ps.setString(1, docentes.getNombre());
                ps.setString(2, docentes.getApellido1());
                ps.setString(3, docentes.getApellido2());
                ps.setString(4, docentes.getEmail());
                ps.setString(5, docentes.getTelefono());
                ps.executeUpdate();
                System.out.println("Insert exitoso");
            }catch (SQLException ex){
                System.out.println(ex);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void leerDocentes(){

    }
    public static void borrarDocentes(int id){

    }
    public static void actializarDocente(Docentes docentes){

    }
}
