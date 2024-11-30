package CalendarioInteractivo;

import javax.swing.ImageIcon;

public class Imagenes {

    public static ImageIcon fondoMenu1;
    //public static ImageIcon otroIcono;
    
    // Método para cargar las imágenes
    public static void loadImages() {
        fondoMenu1 = new ImageIcon("assets/imagenes/capibaraFondo1Menu.png");
        //otroIcono = new ImageIcon("path/a/tu/imagen/otroIcono.png");
    }
    
    // Métodos para obtener las imágenes
    public static ImageIcon getFondoMenu1() {
        return fondoMenu1;
    }
    
    //public static ImageIcon getOtroIcono() {
    //    return otroIcono;
    //}
    
    
    // Rutas de las imágenes
    //public static final String FONDO_MENU_1 = "assets/imagenes/capibaraFondo1Menu.png";  // Por ejemplo, una imagen de fondo
    //public static final String FONDO_CALENDARIO_1 = "/imagenes/capibaraFondo1Menu.png";  // Otra imagen de ejemplo
    // Agrega más imágenes si es necesario
}
