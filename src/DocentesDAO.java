import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        coneccion db_conexion = new coneccion();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try(Connection conexion = db_conexion.get_conConnetion()){
            String query= "SELECT * FROM docentes ";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()){
                System.out.println("id: "+rs.getInt("id"));
                System.out.println("nombre: "+rs.getString("nombre"));
                System.out.println("apellido: "+rs.getString("apellido1")+"  "+rs.getString("apellido2"));
                System.out.println("email: "+rs.getString("email"));
                System.out.println("telefono: "+rs.getString("telefono"));
                System.out.println("*****");
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void borrarDocentes(int id){
        coneccion db_conexion = new coneccion();
        try(Connection conexion = db_conexion.get_conConnetion()){
            PreparedStatement ps=null;
            try{
                String quary = "DELETE FROM docentes WHERE  id = ?";
                ps = conexion.prepareStatement(quary);
                ps.setInt(1,id);
                ps.executeUpdate();
                System.out.println(" el dato fue borrado exitosamente");
            }catch (SQLException e){
                System.out.println(e);
                System.out.println("el dato no se puedo borrar");
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void actializarDocente(Docentes docentes){
        coneccion db_conexion = new coneccion();
        try (Connection conexion = db_conexion.get_conConnetion()) {
            PreparedStatement ps;
            try{
                String query = "UPDATE docentes SET nombre = ?, apellido1 = ? , apellido2 = ? , email = ? , telefono = ?  WHERE  id = ? ";
                ps = conexion.prepareStatement(query);
                ps.setString(1, docentes.getNombre());
                ps.setString(2, docentes.getApellido1());
                ps.setString(3, docentes.getApellido2());
                ps.setString(4, docentes.getEmail());
                ps.setString(5, docentes.getTelefono());
                ps.setInt(6,docentes.getId());
                ps.executeUpdate();
                System.out.println("cambio exitoso");
            } catch (SQLException e) {
                System.out.println(e);
                System.out.println("error");
            }
        } catch (SQLException e){
            System.out.println(e);
        }
    }
}
