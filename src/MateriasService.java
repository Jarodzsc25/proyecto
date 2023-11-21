import java.util.Scanner;

public class MateriasService {
    public static void crearMaterias(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la materia: ");
        String materia= sc.nextLine();

        Materias materias = new Materias();
        materias.setMateria(materia);
        MateriasDAO.crearMaterias(materias);
    }
    public static void listarMaterias(){
    MateriasDAO.leerMaterias();
    }
    public static void borrarMaterias(){
        Scanner sc=new Scanner(System.in);
        System.out.print("indica el id que desea borrar");
        int id_materias = sc.nextInt();
        MateriasDAO.borrarMaterias(id_materias);
    }
    public static void editarMaterias(){

    }
}
