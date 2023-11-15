import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class coneccion {
    public Connection get_conConnetion(){
        Connection conection = null;
        try {                                   /*para cambiar la ruta aka*/
            conection= DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto","root","");
            if(conection!=null){
                System.out.println("primera parte lista");
            }
        }catch (SQLException e){
            System.out.println("fallaste : "+e);
        }
        return conection;
}
}
