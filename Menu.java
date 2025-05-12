//Jesus Armando Diaz Santoyo hecho a las 10/05/2025

import javax.swing.JOptionPane;

// Clase principal llamada Menu
public class Menu {

  // Método que muestra un menú usando una ventana de diálogo
  public void MenuU5() {
    // Se crea una instancia de la clase Metodos
    Metodos Metodos = new Metodos();

    // Arreglo con las opciones que se mostrarán en el menú
    String[] Botones = { "Division entre 0", "Formula General", "Salir" };

    // Se crea un objeto JOptionPane para mostrar la ventana de opciones
    JOptionPane JO = new JOptionPane();

    // Muestra un cuadro de diálogo con botones de opción y guarda la opción
    // seleccionada por el usuario
    int opc = JO.showOptionDialog(
        null, // Componente padre (null para centrar en pantalla)
        "Elige una opcion", // Mensaje
        "U5", // Título de la ventana
        1, // Tipo de opción (DEFAULT_OPTION en este caso)
        1, // Tipo de mensaje (PLAIN_MESSAGE)
        null, // Icono (ninguno)
        Botones, // Opciones de botones
        Botones[0] // Botón por defecto
    );

    // Estructura switch para ejecutar la opción elegida
    switch (opc) {
      case 0:
        // Llama al método DivisionEntreCero de la clase Metodos
        Metodos.DivisionEntreCero();
        break;
      case 1:
        // Llama al método Chicharronera de la clase Metodos
        Metodos.Chicharronera();
        break;
      case 2:
        // Termina la ejecución del programa
        System.exit(0);
        break;
    }
  }

  // Método principal (punto de entrada del programa)
  public static void main(String[] args) {
    // Se crea una instancia de la clase Menu
    Menu m = new Menu();
    // Se llama al método MenuU5 para mostrar el menú
    m.MenuU5();
  }
}
