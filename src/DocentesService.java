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
        Scanner sc=new Scanner(System.in);
        System.out.print("indica el id que desea borrar");
        int id_doscentes = sc.nextInt();
        DocentesDAO.borrarDocentes(id_doscentes);
    }
    public static void editarDocentes(){
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

        System.out.println("indica el id del docente que desea editar: ");
        int id_docente = sc.nextInt();

        Docentes docente = new Docentes();
        docente.setNombre(nombre);
        docente.setApellido1(apellido1);
        docente.setApellido2(apellido2);
        docente.setEmail(email);
        docente.setTelefono(telefono);
        docente.setId(id_docente);

        DocentesDAO.actializarDocente(docente);
    }
    }

