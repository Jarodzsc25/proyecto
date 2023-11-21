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
                String quary="INSERT INTO materias (materia) VALUES (?) ";
                ps=conexion.prepareStatement(quary);
                ps.setString(1, materias.getMateria());
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
                System.out.println("materia añadida: "+rs.getString("materia"));
                System.out.println("*****");
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void borrarMaterias(int id){
        coneccion db_conexion = new coneccion();
        try(Connection conexion = db_conexion.get_conConnetion()){
            PreparedStatement ps=null;
            try{
                String quary = "DELETE FROM materias WHERE  id = ?";
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
    public static void actializarMaterias(Materias materias){
        coneccion db_conexion = new coneccion();
        try (Connection conexion = db_conexion.get_conConnetion()) {
            PreparedStatement ps;
            try{
                String query = "UPDATE materias SET materia = ? WHERE  id = ? ";
                ps = conexion.prepareStatement(query);
                ps.setString(1, materias.getMateria());
                ps.setInt(2,materias.getId());
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
