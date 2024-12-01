package CalendarioInteractivo;

import static CalendarioInteractivo.GuardarEvento.listaEventos;
import javax.swing.*;
import java.awt.*;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {

        initComponents();
        setLocationRelativeTo(null);  // Centra la ventana en la pantalla

    }

    //
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        calendario = new javax.swing.JButton();
        guardarEvento = new javax.swing.JButton();
        eventos = new javax.swing.JButton();
        mostrarImagen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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

        mostrarImagen.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        mostrarImagen.setText("Mostrar Imagen");
        mostrarImagen.setMaximumSize(new java.awt.Dimension(131, 23));
        mostrarImagen.setMinimumSize(new java.awt.Dimension(131, 23));
        jPanel1.add(mostrarImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 275, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("CAP N' CAP");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/capibaraFondo1Menu.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 470));

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
                setVisible(true);  // 'this' se refiere a la ventana principal
            }
        });

        // Hacer visible la ventana secundaria
        ventanaCalendario.setVisible(true);

        // Ocultar la ventana principal
        this.setVisible(false);

    }//GEN-LAST:event_calendarioActionPerformed

    private void eventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventosActionPerformed

        StringBuilder eventos = new StringBuilder();

        if (listaEventos.isEmpty()) {
            eventos.append("No hay eventos guardados.");
        } else {
            for (Evento evento : listaEventos) {
                eventos.append("Nombre: ").append(evento.getNombre()).append("\n")
                        .append("Fecha: ").append(evento.getFecha()).append("\n")
                        .append("Hora: ").append(evento.getHora()).append("\n")
                        .append("Descripción: ").append(evento.getDescripcion()).append("\n\n");
            }
        }

        JOptionPane.showMessageDialog(this, eventos.toString());

        
    }//GEN-LAST:event_eventosActionPerformed

    private void guardarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarEventoActionPerformed
        GuardarEvento ventanaGuardarEvento = new GuardarEvento();

        // Establecer que cuando la ventana secundaria se cierre, la ventana principal se haga visible
        ventanaGuardarEvento.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                // Mostrar la ventana principal nuevamente cuando se cierre la ventana secundaria
                setVisible(true);  // 'this' se refiere a la ventana principal
            }
        });

        // Hacer visible la ventana secundaria
        ventanaGuardarEvento.setVisible(true);

        // Ocultar la ventana principal
        this.setVisible(false);


    }//GEN-LAST:event_guardarEventoActionPerformed

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
    private javax.swing.JButton guardarEvento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mostrarImagen;
    // End of variables declaration//GEN-END:variables
}
