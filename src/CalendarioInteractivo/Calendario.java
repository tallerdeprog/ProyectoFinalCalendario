
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

        // Imagen personalizada para el fondo
        ImageIcon imagenPersonalizada = new ImageIcon("src/imagenes/tema1.png");

        // Panel del fondo
        JPanel panelConImagen = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(imagenPersonalizada.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        panelConImagen.setLayout(new BorderLayout());

        // Hora actual
        labelHora = new JLabel();
        labelHora.setFont(new Font("Arial", Font.BOLD, 24));
        labelHora.setForeground(Color.WHITE);
        labelHora.setHorizontalAlignment(SwingConstants.CENTER);

        // Panel encima de la imagen
        JPanel panelSobreImagen = new JPanel(new BorderLayout());
        panelSobreImagen.setOpaque(false);

        // Crear el panel del calendario
        JPanel panelCalendario = new JPanel();
        panelCalendario.setLayout(new GridLayout(6, 7));
        panelCalendario.setOpaque(false);

        // Fecha actual
        LocalDate fechaActual = LocalDate.now();
        int diaActual = fechaActual.getDayOfMonth();

        // Días de la semana (empieza en domingo)
        String[] diasSemana = {"D", "L", "M", "M", "J", "V", "S"};
        for (String dia : diasSemana) {
            JLabel labelDia = new JLabel(dia, SwingConstants.CENTER);
            labelDia.setFont(new Font("Arial", Font.BOLD, 16));
            labelDia.setOpaque(true);
            labelDia.setBackground(new Color(100, 100, 100, 180));
            labelDia.setForeground(Color.WHITE);
            panelCalendario.add(labelDia);
        }

        // Obtener mes y año actuales
        YearMonth mesActual = YearMonth.now();
        int diasEnMes = mesActual.lengthOfMonth();
        String nombreMes = mesActual.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault());
        int añoActual = mesActual.getYear();

        // Día inicial del mes (0 para domingo)
        int primerDia = mesActual.atDay(1).getDayOfWeek().getValue() % 7;

        // Añadir espacios vacíos hasta el primer día del mes
        for (int i = 0; i < primerDia; i++) {
            panelCalendario.add(new JLabel(""));
        }

        // Añadir días del mes
        for (int i = 1; i <= diasEnMes; i++) {
            JLabel labelDiaMes = new JLabel(String.valueOf(i), SwingConstants.CENTER);
            labelDiaMes.setFont(new Font("Arial", Font.PLAIN, 14));
            labelDiaMes.setOpaque(true);
            labelDiaMes.setBackground(new Color(255, 255, 255, 150));
            labelDiaMes.setForeground(Color.BLACK);
            labelDiaMes.setBorder(BorderFactory.createLineBorder(Color.BLACK));

            // Resaltar el día actual
            if (i == diaActual) {
                labelDiaMes.setBackground(new Color(255, 215, 0)); // Fondo dorado
                labelDiaMes.setForeground(Color.BLACK);
                labelDiaMes.setFont(new Font("Arial", Font.BOLD, 16));
                labelDiaMes.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
            }

            panelCalendario.add(labelDiaMes);
        }

        // Panel superior con el nombre del mes y año
        JLabel labelMesAno = new JLabel(nombreMes.toUpperCase() + " " + añoActual, SwingConstants.CENTER);
        labelMesAno.setFont(new Font("Arial", Font.BOLD, 24));
        labelMesAno.setForeground(Color.WHITE);
        labelMesAno.setOpaque(true);
        labelMesAno.setBackground(new Color(0, 0, 0, 180));

        // Añadir elementos al panel principal
        panelSobreImagen.add(labelMesAno, BorderLayout.NORTH);
        panelSobreImagen.add(panelCalendario, BorderLayout.CENTER);
        panelSobreImagen.add(labelHora, BorderLayout.SOUTH);

        panelConImagen.add(panelSobreImagen, BorderLayout.CENTER);
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
