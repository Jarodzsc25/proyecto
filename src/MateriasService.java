import java.util.Scanner;

public class MateriasService {
    public static void crearMaterias(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la 1ra materia: ");
        String materia1= sc.nextLine();

        System.out.println("Ingrese la 2da materia: ");
        String materia2= sc.nextLine();

        System.out.println("Ingrese la 3ra materia: ");
        String materia3= sc.nextLine();

        System.out.println("Ingrese la 4ta materia: ");
        String materia4= sc.nextLine();

        System.out.println("Ingrese la 5ta materia: ");
        String materia5= sc.nextLine();

        System.out.println("Ingrese la 6ta materia: ");
        String materia6= sc.nextLine();

        System.out.println("Ingrese la 7ma materia: ");
        String materia7= sc.nextLine();

        Materias materias = new Materias();
        materias.setMateria1(materia1);
        materias.setMateria2(materia2);
        materias.setMateria3(materia3);
        materias.setMateria4(materia4);
        materias.setMateria5(materia5);
        materias.setMateria6(materia6);
        materias.setMateria7(materia7);
        MateriasDAO.crearMaterias(materias);
    }
    public static void listarMaterias(){
    MateriasService.listarMaterias();
    }
    public static void borrarMaterias(){

    }
    public static void editarMaterias(){

    }
}
