
package Principal;
import Modelo.*;
import Vistas.*;


public class Main {

    public static void main(String[] args) {
   // Crear instancia de la clase conexion
    Conexion conexion = new Conexion();
    conexion.getConnection();
        
   //Crear instancia del Jframe Login     
   Login login = new Login();
   login.setVisible(true);
}
}