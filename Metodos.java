//Jesus Armando Diaz Santoyo hecho a las 10/05/2025

import javax.swing.JOptionPane;

// Clase que contiene métodos matemáticos con manejo de excepciones y entrada/salida gráfica
public class Metodos {

    // Método que implementa la fórmula general (chicharronera) para resolver ecuaciones cuadráticas
    public void Chicharronera() {
        // Se crea una instancia de JOptionPane para mostrar cuadros de diálogo
        JOptionPane JO = new JOptionPane();

        int a = 0;
        int b = 0;
        int c = 0;
        boolean DatoValido = false;

        // Solicita el valor de 'a' con validación de entrada
        while (!DatoValido) {
            try {
                a = Integer.parseInt(JO.showInputDialog("Dame el valor de A"));
                DatoValido = true;
            } catch (NumberFormatException e) {
                JO.showMessageDialog(null, "ERROR: Ingrese un valor valido, Error de Java: " + e);
            }
        }

        DatoValido = false;

        // Solicita el valor de 'b' con validación de entrada
        while (!DatoValido) {
            try {
                b = Integer.parseInt(JO.showInputDialog("Dame el valor de B"));
                DatoValido = true;
            } catch (NumberFormatException e) {
                JO.showMessageDialog(null, "ERROR: Ingrese un valor valido, Error de Java: " + e);
            }
        }

        DatoValido = false;

        // Solicita el valor de 'c' con validación de entrada
        while (!DatoValido) {
            try {
                c = Integer.parseInt(JO.showInputDialog("Dame el valor de C"));
                DatoValido = true;
            } catch (NumberFormatException e) {
                JO.showMessageDialog(null, "ERROR: Ingrese un valor valido, Error de Java: " + e);
            }
        }

        // Calcula la raíz cuadrada del discriminante (b^2 - 4ac)
        int sqrt = (int) (Math.sqrt(Math.pow(b, 2) - (4 * a * c)));

        // Intenta calcular las dos soluciones usando la fórmula general
        try {
            int res1 = (-b + sqrt) / (2 * a);
            int res2 = (-b - sqrt) / (2 * a);
            // Muestra los resultados en una ventana de diálogo
            JO.showMessageDialog(null, "Resultado de x1 = " + res1 + "\n" + "Resultado de x2 = " + res2);
        } catch (ArithmeticException e) {
            // Manejo de error si ocurre división entre cero
            JO.showMessageDialog(null, "No se puede dividir entre 0, Error de Java: " + e);
        }
    }

    // Método que realiza una división entre dos números enteros con manejo de división por cero
    public void DivisionEntreCero() {
        JOptionPane JO = new JOptionPane();

        int a = 0;
        int b = 0;
        boolean DatoValido = false;

        // Solicita el valor del numerador con validación
        while (!DatoValido) {
            try {
                a = Integer.parseInt(JO.showInputDialog("Dame el valor del numerador"));
                DatoValido = true;
            } catch (NumberFormatException e) {
                JO.showMessageDialog(null, "ERROR: Ingrese un valor valido, Error de Java: " + e);
            }
        }

        DatoValido = false;

        // Solicita el valor del denominador y realiza la división con manejo de errores
        while (!DatoValido) {
            try {
                b = Integer.parseInt(JO.showInputDialog("Dame el valor del denominador"));
                DatoValido = true;

                // Intenta dividir a entre b
                int resultado = a / b;
                JO.showMessageDialog(null, "El resultado de " + a + " / " + b + " es: " + resultado);
            } catch (NumberFormatException e) {
                JO.showMessageDialog(null, "ERROR: Ingrese un valor valido, Error de Java: " + e);
            } catch (ArithmeticException e) {
                // Captura la excepción si se intenta dividir entre cero
                JO.showMessageDialog(null, "No se puede dividir entre 0 Error Java: " + e);
            }
        }
    }
}
