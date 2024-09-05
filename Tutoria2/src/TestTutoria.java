
    import javax.swing.*;
    import javax.swing.plaf.synth.SynthOptionPaneUI;
    import java.util.Scanner;

    public class TestTutoria{
        public static void main(String arg[]){
            //Declaro variables
            Scanner scanner = new Scanner(System.in);
            String nombre;
            int edad;
            System.out.println("Digite el nombre del usuario");
            nombre = scanner.next();
            System.out.println("Digite la edad del usuario");
            edad = scanner.nextInt();
            if (edad>0 && edad<=120){
                if(edad<=17){
                    System.out.println("Menor de edad");
                }else {
                    System.out.println("Mayor de edad");
                }

            }else {
                System.out.println("Señor usuario esa edad no es valida");
            }



        }

}
