
package CalendarioInteractivo;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import javax.swing.Timer;


public class Calendario extends javax.swing.JFrame {

    private final JLabel labelHora;
    
    public Calendario() {
        
        
        
        setSize(800, 600);
        
        setLocationRelativeTo(null);
        
        setLayout(new BorderLayout());
        
        
        // Panel principal para contener el calendario
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());

        // Imagen personalizada
        ImageIcon imagenPersonalizada = new ImageIcon("src/imagenes/capibaraFondo1Menu.png");

        // Panel del fondo
        JPanel panelConImagen = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Tamaño imagen
                g.drawImage(imagenPersonalizada.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        panelConImagen.setLayout(new BorderLayout()); //Posición del calendario encima

        //Hora
        labelHora = new JLabel();
        labelHora.setFont(new Font("Arial", Font.BOLD, 24));
        labelHora.setForeground(Color.BLACK);  // Cambia el color a blanco para que sea visible sobre la imagen
        labelHora.setHorizontalAlignment(SwingConstants.CENTER);

        //Panel encima
        JPanel panelSobreImagen = new JPanel(new BorderLayout());
        panelSobreImagen.setOpaque(false); // Hacer transparente para ver la imagen debajo

        //Columnas y filas del calendario
        JPanel panelCalendario = new JPanel();
        panelCalendario.setLayout(new GridLayout(6, 7)); //filas,columnas
        panelCalendario.setOpaque(false); // transparencia de imagen

        //Fecha actual
        LocalDate fechaActual = LocalDate.now();
        int diaActual = fechaActual.getDayOfMonth();

        // Días de la semana (empieza en domingo)
        String[] diasSemana = {"D", "L", "M", "M", "J", "V", "S"};
        for (String dia : diasSemana) {
            JLabel labelDia = new JLabel(dia, SwingConstants.CENTER);
            labelDia.setFont(new Font("Arial", Font.BOLD, 16));
            labelDia.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelDia.setOpaque(true);
            labelDia.setBackground(new Color(255, 255, 255, 150)); //Transparencia
            panelCalendario.add(labelDia);
        }

        // Obtener el mes y el año actuales
        YearMonth mesActual = YearMonth.now();
        int diasEnMes = mesActual.lengthOfMonth();  // Días en el mes actual
        String nombreMes = mesActual.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault());
        int añoActual = mesActual.getYear();

        // Día inicial del mes (7: Domingo, 1: Lunes)
        int primerDia = mesActual.atDay(1).getDayOfWeek().getValue();  // Lunes = 1, Domingo = 7

        // Ajustar para que el domingo sea el último (convertimos 7 en 0 para que comience en domingo)
        primerDia = primerDia % 7;

        // Añadir espacios vacíos hasta el primer día del mes
        for (int i = 0; i < primerDia; i++) {
            panelCalendario.add(new JLabel(""));  // Celdas vacías
        }

        // Añadir los días del mes, día actual resaltado
        for (int i = 1; i <= diasEnMes; i++) {
            JLabel labelDiaMes = new JLabel(String.valueOf(i), SwingConstants.CENTER);
            labelDiaMes.setFont(new Font("Arial", Font.PLAIN, 14));
            labelDiaMes.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelDiaMes.setOpaque(true);
            labelDiaMes.setBackground(new Color(255, 255, 255, 150)); // Fondo semitransparente

            if (i == diaActual) {
                labelDiaMes.setOpaque(true);
                labelDiaMes.setBackground(Color.YELLOW);  // Resaltar el día actual
                labelDiaMes.setBorder(BorderFactory.createLineBorder(Color.RED, 2));  // Borde rojo
            }

            panelCalendario.add(labelDiaMes);
        }

        // Panel superior con nombre del mes y año
        JLabel labelMesAno = new JLabel(nombreMes.toUpperCase() + " " + añoActual, SwingConstants.CENTER);
        labelMesAno.setFont(new Font("Arial", Font.BOLD, 24));
        labelMesAno.setForeground(Color.WHITE); // Texto blanco
        labelMesAno.setOpaque(true);
        labelMesAno.setBackground(new Color(0, 0, 0, 150)); // Fondo semitransparente 

        // Añadir el calendario con margen al centro del panel
        panelSobreImagen.add(labelMesAno, BorderLayout.NORTH);
        panelSobreImagen.add(panelCalendario, BorderLayout.CENTER);

        // Añadir la hora al panel superior
        panelSobreImagen.add(labelHora, BorderLayout.SOUTH);

        // Añadir el panel con la imagen al panel principal
        panelConImagen.add(panelSobreImagen, BorderLayout.CENTER);

        // Añadir el panel completo al contenedor
        add(panelConImagen, BorderLayout.CENTER);

        actualizarHora();

        iniciarTemporizador();
    }

    //iniciar temporizador
    private void iniciarTemporizador() {
        Timer timer = new Timer(1000, e -> actualizarHora());
        timer.start();
    }

    //obtener y actualizar la hora actual
    private void actualizarHora() {
        LocalTime horaActual = LocalTime.now();
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        labelHora.setText(horaActual.format(formatoHora));  // Actualizar el JLabel con la hora actual
    }

    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calendario().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
