/*
1.- Calcular el area de 4 figuras geometricas con lo siguiente
2.- Menu de opciones de figuras
	1= Rectangulo
	2= Triangulo
	3= Circulo
	4= Cuadrado
3.- Utilizar el Do While para que este ciclado y salga del sistema con la opcion 5
4.- Utilizar JOptionPane para mostrar
 */
package areafiguras_switch;

import javax.swing.JOptionPane;

public class AreaFiguras_Switch {

    public static void main(String[] args) {

        int figuras = 0;
        double rectanguloBase;
        double rectanguloAltura;
        double trianguloBase;
        double trianguloAltura;
        double Pi = 3.1416;
        double radioCirculo;
        double Lados;

        do {

            figuras = Integer.parseInt(JOptionPane.showInputDialog(null, "Menú de opciones Figuras: \n"
                    + ""
                    + "Introduce 1 = Rectangulo \n"
                    + "Introduce 2 = Triangulo \n"
                    + "Introcuce 3 = Circulo \n"
                    + "Introduce 4 = Cuadrado \n"
                    + "Introduce 5 = Salir "));
            switch (figuras) {
                case 1:
                    rectanguloBase = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la base del Rectangulo en metros"));
                    rectanguloAltura = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la altura del Rectangulo en metros"));
                    JOptionPane.showMessageDialog(null, "El área del Rectangulo es " + (rectanguloBase * rectanguloAltura + " m"));
                    break;
                case 2:
                    trianguloBase = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la base del Triangulo en metros"));
                    trianguloAltura = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la altura del Triangulo en metros"));
                    JOptionPane.showMessageDialog(null, "El área del Triangulo es " + (trianguloBase * trianguloAltura / 2 + " m"));
                    break;
                case 3:
                    Pi = 3.1416;
                    radioCirculo = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el Radio del circulo en metros"));
                    JOptionPane.showMessageDialog(null, "El área del Circulo es " + (Pi * radioCirculo * Pi * radioCirculo + " m"));
                    break;
                case 4:
                    Lados = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce lado del Cuadrado en metros"));
                    JOptionPane.showMessageDialog(null, "El área del Cuadrado es " + Lados * Lados + " m");
                    break;
                case 5:

                    JOptionPane.showMessageDialog(null, "Salir del sistema");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }

        } while (figuras != 5);

    }

}
