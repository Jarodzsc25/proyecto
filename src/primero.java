public class primero {
    public static void main(String[] args) {
        System.out.println("prueba");
        coneccion conexion = new coneccion();
        try {
            conexion.get_conConnetion();
        }catch(Exception e){
            System.out.println(e);
        }
    }

}
