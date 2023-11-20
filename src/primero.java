import java.util.Scanner;

public class primero {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int opcion =0;
        do{
            System.out.println("-------------------");
            System.out.println("UNIDAD EDUCATIVA JOSE ANDES");
            System.out.println("-------------------");
            System.out.println("1.- Director");
            System.out.println("2.- Docentes");
            System.out.println("3.- Materias");
            System.out.println("4.- salir");
            System.out.print(">>");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    director();
                    break;
                case 2:
                    docentes();
                    break;
                case 3:
                    materia();
                    break;
                default:
                    break;
            }
        }while (opcion !=4 );
    }
    static void director(){
        Scanner sc =new Scanner(System.in);
        int opcion =0;
        do{
            System.out.println("1.- Crear Director");
            System.out.println("2.- Listar Director");
            System.out.println("3.- Editar Director");
            System.out.println("4.- Eliminar Director");
            System.out.println("5.- Salir");
            System.out.print(">>");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    DirectorService.crearDirector();
                    break;
                case 2:
                    DirectorService.listarDirector();
                    break;
                case 3:
                    DirectorService.editarDirector();
                    break;
                case 4:
                    DirectorService.borrarDirector();
                    break;
                default:
                    break;
            }
        }while (opcion !=5 );
    }
    static void docentes(){
        Scanner sc =new Scanner(System.in);
        int opcion =0;
        do{
            System.out.println("1.- Crear Docente");
            System.out.println("2.- Listar Docente");
            System.out.println("3.- Editar Docente");
            System.out.println("4.- Eliminar Docente");
            System.out.println("5.- Salir");
            System.out.print(">>");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                   DocentesService.crearDocentes();
                    break;
                case 2:
                   DocentesService.listarDocentes();
                    break;
                case 3:
                    DocentesService.editarDocentes();
                    break;
                case 4:
                    DocentesService.borrarDocentes();
                    break;
                default:
                    break;
            }
        }while (opcion !=5 );
    }
    static void materia(){
        Scanner sc =new Scanner(System.in);
        int opcion =0;
        do{
            System.out.println("1.- Crear Materias");
            System.out.println("2.- Listar Materias");
            System.out.println("3.- Editar Materias");
            System.out.println("4.- Eliminar Materias");
            System.out.println("5.- Salir");
            System.out.print(">>");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    MateriasService.crearMaterias();
                    break;
                case 2:
                    MateriasService.listarMaterias();
                    break;
                case 3:
                    MateriasService.editarMaterias();
                    break;
                case 4:
                    MateriasService.borrarMaterias();
                    break;
                default:
                    break;
            }
        }while (opcion !=5 );
    }
}
