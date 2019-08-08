import javax.swing.*;

public class TP1 {
    public static void main(String[] args) {

        int edad;

        do {
            //Ingreso de Datos.
            do{
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad (cero para salir):"));
            }while (edad<0);
            if(edad==0){
                JOptionPane.showMessageDialog(null, "¡Hasta Luego!");
                break;
            }
            String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
            //Mostrar por pantalla.
            JOptionPane.showMessageDialog(null, "Su nombre es " + nombre + " y usted tiene " + edad + " años.");
        }while (edad!=0);

    }
}
