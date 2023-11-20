import java.util.Scanner;

public class DocentesService {
    public static void crearDocentes(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String nombre= sc.nextLine();

        System.out.println("Ingrese el primer apellido: ");
        String apellido1= sc.nextLine();

        System.out.println("Ingrese el segundo apellido: ");
        String apellido2= sc.nextLine();

        System.out.println("Ingrese el email: ");
        String email= sc.nextLine();

        System.out.println("Ingrese el telefono o celular: ");
        String telefono= sc.nextLine();

        Docentes docentes = new Docentes();
        docentes.setNombre(nombre);
        docentes.setApellido1(apellido1);
        docentes.setApellido2(apellido2);
        docentes.setEmail(email);
        docentes.setTelefono(telefono);
        DocentesDAO.crearDocentes(docentes);
    }
    public static void listarDocentes(){
        DocentesDAO.leerDocentes();
    }
    public static void borrarDocentes(){

    }
    public static void editarDocentes(){

    }
}
