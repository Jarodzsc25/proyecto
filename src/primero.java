import java.util.Scanner;

public class primero {
    public static void main(String[] args) {
        /*System.out.println("prueba");
        coneccion conexion = new coneccion();
        try {
            conexion.get_conConnetion();
        }catch(Exception e){
            System.out.println(e);
        }*/
       /* DirectorService.crearDirector();
      DocentesService.crearDocentes();
        System.out.println("UNIDAD EDUCATIVA JOSE ANDES");
      MateriasService.crearMaterias();*/
        Scanner sc =new Scanner(System.in);
        int opcion =0;
        do{
            System.out.println("-------------------");
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

}
