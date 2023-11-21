import java.util.Scanner;

public class DirectorService {
    public static void crearDirector(){
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

        Director director = new Director();
        director.setNombre(nombre);
        director.setApellido1(apellido1);
        director.setApellido2(apellido2);
        director.setEmail(email);
        director.setTelefono(telefono);
        DirectorDAO.crearDirector(director);
    }
    public static void listarDirector(){
    DirectorDAO.leerDirector();
    }
    public static void borrarDirector(){
        Scanner sc=new Scanner(System.in);
        System.out.print("indica el id que desea borrar");
        int id_director = sc.nextInt();
        DirectorDAO.borrarDirector(id_director);
    }
    public static void editarDirector(){
        Scanner sc=new Scanner(System.in);
        System.out.print("escribe el nuevo nombre: ");
        String nombre = sc.nextLine();

        System.out.print("escribe el nuevo apellido: ");
        String apellido1 = sc.nextLine();

        System.out.print("escribe el nuevo apellido: ");
        String apellido2 = sc.nextLine();

        System.out.print("escribe el nuevo email: ");
        String email= sc.nextLine();

        System.out.print("escribe el nuevo telefono: ");
        String telefono = sc.nextLine();

        System.out.println("indica el id del director que desea editar: ");
        int id_director = sc.nextInt();

        Director director  = new Director();
        director.setNombre(nombre);
        director.setApellido1(apellido1);
        director.setApellido2(apellido2);
        director.setEmail(email);
        director.setTelefono(telefono);
        director.setId(id_director);

        DirectorDAO.actializarDirector(director);
    }
}
