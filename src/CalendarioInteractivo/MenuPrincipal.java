package CalendarioInteractivo;

import static CalendarioInteractivo.GuardarEvento.listaEventos;
import javax.swing.*;
import java.awt.*;

public class MenuPrincipal extends javax.swing.JFrame {

    
    
    public MenuPrincipal() {

        initComponents();
        setLocationRelativeTo(null);  // Centra la ventana en la pantalla

    }

    public void cambiarTema(String nombreImagen) {
        
        
        String rutaImagen = "/Imagenes/" + nombreImagen;

        
        try {
            ImageIcon originalImage = new ImageIcon(getClass().getResource(rutaImagen));

            // Obtener el tamaño del fondo (JLabel)
            int width = fondo.getWidth();
            int height = fondo.getHeight();

            // Redimensionar la imagen para que se ajuste al tamaño del JLabel
            Image scaledImage = originalImage.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);

            // Crear un nuevo ImageIcon con la imagen redimensionada
            ImageIcon nuevaImagen = new ImageIcon(scaledImage);

            // Cambiar el ícono del fondo con la nueva imagen escalada
            fondo.setIcon(nuevaImagen);
        } catch (Exception e) {
            System.out.println("Error al cargar la imagen: " + e.getMessage());
        }
    }

    //
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        calendario = new javax.swing.JButton();
        guardarEvento = new javax.swing.JButton();
        eventos = new javax.swing.JButton();
        temas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calendario.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        calendario.setText("Mostrar Calendario");
        calendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calendarioActionPerformed(evt);
            }
        });
        jPanel1.add(calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 275, 68));

        guardarEvento.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        guardarEvento.setText("Guardar Evento");
        guardarEvento.setMaximumSize(new java.awt.Dimension(131, 23));
        guardarEvento.setMinimumSize(new java.awt.Dimension(131, 23));
        guardarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarEventoActionPerformed(evt);
            }
        });
        jPanel1.add(guardarEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 275, 68));

        eventos.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        eventos.setText("Visualizar Eventos");
        eventos.setMaximumSize(new java.awt.Dimension(131, 23));
        eventos.setMinimumSize(new java.awt.Dimension(131, 23));
        eventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventosActionPerformed(evt);
            }
        });
        jPanel1.add(eventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 275, 71));

        temas.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        temas.setText("Temas");
        temas.setMaximumSize(new java.awt.Dimension(131, 23));
        temas.setMinimumSize(new java.awt.Dimension(131, 23));
        temas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temasActionPerformed(evt);
            }
        });
        jPanel1.add(temas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 275, 70));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 102, 0));
        jLabel1.setText("CAPY-NOTES");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tema1.png"))); // NOI18N
        fondo.setText("jLabel2");
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calendarioActionPerformed

        Calendario ventanaCalendario = new Calendario();
        // Establecer que cuando la ventana secundaria se cierre, la ventana principal se haga visible
        ventanaCalendario.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                // Mostrar la ventana principal nuevamente cuando se cierre la ventana secundaria
                setVisible(true);  // 'this' - ventana principal
            }
        });

        // ventana secundaria
        ventanaCalendario.setVisible(true);

        // ventana principal
        this.setVisible(false);

    }//GEN-LAST:event_calendarioActionPerformed

    private void eventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventosActionPerformed

        if (listaEventos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay eventos guardados.", "Eventos", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // GIF animado
            ImageIcon gifIcon = new ImageIcon("src/Imagenes/capibara.gif");

            // Redimensionar
            Image gifImage = gifIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT); 
            ImageIcon gifRedimensionado = new ImageIcon(gifImage);

            JLabel gifLabel = new JLabel(gifRedimensionado);
            gifLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT); 

            // texto
            StringBuilder eventos = new StringBuilder();
            for (Evento evento : listaEventos) {
                eventos.append("▶ Nombre: ").append(evento.getNombre()).append("\n")
                        .append("   Fecha: ").append(evento.getFecha()).append("\n")
                        .append("   Hora: ").append(evento.getHora()).append("\n")
                        .append("   Descripción: ").append(evento.getDescripcion()).append("\n\n");
            }
            JLabel textoEventos = new JLabel("<html>" + eventos.toString().replace("\n", "<br>") + "</html>");
            textoEventos.setAlignmentX(JLabel.CENTER_ALIGNMENT); 

            // panel para GIF y texto
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

            // Añadir el GIF 
            JPanel gifPanel = new JPanel();
            gifPanel.setLayout(new BoxLayout(gifPanel, BoxLayout.X_AXIS)); 
            gifPanel.add(Box.createHorizontalGlue()); 
            gifPanel.add(gifLabel); 
            gifPanel.add(Box.createHorizontalGlue()); 

            panel.add(gifPanel); 
            panel.add(Box.createVerticalStrut(10)); 
            panel.add(textoEventos); 

            
            JOptionPane.showMessageDialog(this, panel, "Lista de Eventos", JOptionPane.PLAIN_MESSAGE);
        }


    }//GEN-LAST:event_eventosActionPerformed

    private void guardarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarEventoActionPerformed
        GuardarEvento ventanaGuardarEvento = new GuardarEvento();

        // Establecer que cuando la ventana secundaria se cierre, la ventana principal se haga visible
        ventanaGuardarEvento.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                
                setVisible(true);  
            }
        });

        ventanaGuardarEvento.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_guardarEventoActionPerformed

    private void temasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temasActionPerformed

        
        Temas ventanaTemas = new Temas(this);
        ventanaTemas.setVisible(true);

    }//GEN-LAST:event_temasActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
            //MenuPrincipal menuPrincipal = new MenuPrincipal();

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calendario;
    private javax.swing.JButton eventos;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton guardarEvento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton temas;
    // End of variables declaration//GEN-END:variables

}
