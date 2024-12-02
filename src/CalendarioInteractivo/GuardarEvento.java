package CalendarioInteractivo;

import java.util.ArrayList;
import java.util.List;
import java.time.YearMonth;
import javax.swing.JOptionPane;

public class GuardarEvento extends javax.swing.JFrame {

    public static List<Evento> listaEventos = new ArrayList<>();

    public GuardarEvento() {

        initComponents();
        setLocationRelativeTo(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        inicializarFecha();

        inicializarHoraYMinuto();

        inicializarHoraMinutoAMPM();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GuardarEvento = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombreDelEvento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        año = new javax.swing.JComboBox<>();
        hora = new javax.swing.JComboBox<>();
        minuto = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        dia = new javax.swing.JComboBox<>();
        mes = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cancelarEvento = new javax.swing.JButton();
        guardarEvento = new javax.swing.JButton();
        descripciónEvento = new javax.swing.JTextField();
        AMPM = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GuardarEvento.setBackground(new java.awt.Color(255, 204, 153));
        GuardarEvento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel1.setText("Minuto");
        GuardarEvento.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));
        GuardarEvento.add(nombreDelEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 530, 30));

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel2.setText("Nombre del evento");
        GuardarEvento.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        año.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año" }));
        GuardarEvento.add(año, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 80, 30));

        hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaActionPerformed(evt);
            }
        });
        GuardarEvento.add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 80, 30));

        minuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minutoActionPerformed(evt);
            }
        });
        GuardarEvento.add(minuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 80, 30));

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel3.setText("Descripción");
        GuardarEvento.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia" }));
        dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaActionPerformed(evt);
            }
        });
        GuardarEvento.add(dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 80, 30));

        mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes" }));
        GuardarEvento.add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 80, 30));

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel4.setText("Hora");
        GuardarEvento.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel5.setText("Fecha");
        GuardarEvento.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 50, 30));

        cancelarEvento.setText("Cancelar");
        cancelarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarEventoActionPerformed(evt);
            }
        });
        GuardarEvento.add(cancelarEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 90, 30));

        guardarEvento.setText("Guardar");
        guardarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarEventoActionPerformed(evt);
            }
        });
        GuardarEvento.add(guardarEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 90, 30));
        GuardarEvento.add(descripciónEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 530, 80));

        AMPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AMPMActionPerformed(evt);
            }
        });
        GuardarEvento.add(AMPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GuardarEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GuardarEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarEventoActionPerformed

        MenuPrincipal ventanaMenuPrincipal = new MenuPrincipal();
        ventanaMenuPrincipal.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_cancelarEventoActionPerformed

    private void guardarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarEventoActionPerformed

        String nombre = nombreDelEvento.getText();
        String diaSeleccionado = (String) dia.getSelectedItem();
        String mesSeleccionado = (String) mes.getSelectedItem();
        String añoSeleccionado = (String) año.getSelectedItem();
        String horaSeleccionada = (String) hora.getSelectedItem();
        String minutoSeleccionado = (String) minuto.getSelectedItem();
        String ampmSeleccionado = (String) AMPM.getSelectedItem();
        String descripcion = descripciónEvento.getText();

        if (nombre.isEmpty() || diaSeleccionado.equals("Dia") || mesSeleccionado.equals("Mes") || añoSeleccionado.equals("Año")) {
            JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos obligatorios.");
            return;
        }

        String fecha = diaSeleccionado + " de " + mesSeleccionado + " de " + añoSeleccionado;
        String horaCompleta = horaSeleccionada + ":" + minutoSeleccionado + " " + ampmSeleccionado;

        Evento nuevoEvento = new Evento(nombre, fecha, horaCompleta, descripcion);
        listaEventos.add(nuevoEvento);

        JOptionPane.showMessageDialog(this, "Evento guardado exitosamente.");
        limpiarCampos();

    }//GEN-LAST:event_guardarEventoActionPerformed

    private void diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaActionPerformed

    }//GEN-LAST:event_diaActionPerformed

    private void horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaActionPerformed
        // Obtener la hora seleccionada
        String horaSeleccionada = (String) hora.getSelectedItem();
        System.out.println("Hora seleccionada: " + horaSeleccionada);
    }//GEN-LAST:event_horaActionPerformed

    private void minutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minutoActionPerformed
        // Obtener el minuto seleccionado
        String minutoSeleccionado = (String) minuto.getSelectedItem();
        System.out.println("Minuto seleccionado: " + minutoSeleccionado);
    }//GEN-LAST:event_minutoActionPerformed

    private void AMPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AMPMActionPerformed
        // Obtener el valor seleccionado en el ComboBox
        String seleccionAMPM = (String) AMPM.getSelectedItem();

        // Mostrar el valor seleccionado en la consola (para pruebas)
        System.out.println("Selección de AM/PM: " + seleccionAMPM);

        
    }//GEN-LAST:event_AMPMActionPerformed

    // Inicialización de los ComboBoxes
    private void inicializarFecha() {
        // Llenar el JComboBox de años
        año.addItem("Año");
        for (int i = 2024; i <= 2070; i++) {
            año.addItem(String.valueOf(i));
        }

        // Llenar el JComboBox de meses
        mes.addItem("Mes");
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        for (String mesItem : meses) {
            mes.addItem(mesItem);
        }

        // Actualizar días del mes cuando se selecciona un mes y año
        mes.addActionListener(evt -> actualizarDias());
        año.addActionListener(evt -> actualizarDias());
    }

    // Actualizar el número de días dependiendo del mes y el año seleccionado
    private void actualizarDias() {
        // Verificar si el año seleccionado es válido
        String añoSeleccionadoStr = (String) año.getSelectedItem();
        String mesSeleccionado = (String) mes.getSelectedItem();

        // Validar que no se seleccionen valores por defecto como "Año" o "Mes"
        if (añoSeleccionadoStr.equals("Año") || mesSeleccionado.equals("Mes")) {
            return; // No realizar ninguna acción si no se ha seleccionado un año o mes válido
        }

        try {
            int añoSeleccionado = Integer.parseInt(añoSeleccionadoStr);
            YearMonth yearMonth = YearMonth.of(añoSeleccionado, obtenerMes(mesSeleccionado));
            int diasDelMes = yearMonth.lengthOfMonth();

            // Limpiar ComboBox de días antes de agregar nuevos
            dia.removeAllItems();

            // Llenar el ComboBox de días con el número correcto de días
            for (int i = 1; i <= diasDelMes; i++) {
                dia.addItem(String.format("%02d", i)); // Formatear los días con dos dígitos
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El año seleccionado no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Obtener el número correspondiente al mes (1 - 12)
    public int obtenerMes(String mes) {
        switch (mes) {
            case "Enero":
                return 1;
            case "Febrero":
                return 2;
            case "Marzo":
                return 3;
            case "Abril":
                return 4;
            case "Mayo":
                return 5;
            case "Junio":
                return 6;
            case "Julio":
                return 7;
            case "Agosto":
                return 8;
            case "Septiembre":
                return 9;
            case "Octubre":
                return 10;
            case "Noviembre":
                return 11;
            case "Diciembre":
                return 12;
            default:
                return 1;
        }
    }

    private void inicializarHoraYMinuto() {
        // Llenar el JComboBox de hora 
        for (int i = 1; i <= 12; i++) {
            hora.addItem(String.valueOf(i));
        }

        // Llenar el JComboBox de minutos
        for (int i = 0; i < 60; i++) {
            minuto.addItem(String.format("%02d", i)); 
        }

    }

    private void inicializarHoraMinutoAMPM() {
        // Llenar horas (1 a 12)
        for (int i = 1; i <= 12; i++) {
            hora.addItem(String.valueOf(i));
        }

        // Llenar minutos (0 a 59)
        for (int i = 0; i < 60; i++) {
            minuto.addItem(String.format("%02d", i)); 
        }

        // Llenar AM/PM
        AMPM.addItem("AM");
        AMPM.addItem("PM");
    }

    // Métodos para cancelar y guardar evento (aún por implementar)
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
            java.util.logging.Logger.getLogger(GuardarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuardarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuardarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuardarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuardarEvento().setVisible(true);
            }
        });
    }

    private void limpiarCampos() {
        nombreDelEvento.setText("");
        descripciónEvento.setText("");
        año.setSelectedIndex(0);
        mes.setSelectedIndex(0);
        dia.setSelectedIndex(0);
        hora.setSelectedIndex(0);
        minuto.setSelectedIndex(0);
        AMPM.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AMPM;
    private javax.swing.JPanel GuardarEvento;
    private javax.swing.JComboBox<String> año;
    private javax.swing.JButton cancelarEvento;
    private javax.swing.JTextField descripciónEvento;
    private javax.swing.JComboBox<String> dia;
    private javax.swing.JButton guardarEvento;
    private javax.swing.JComboBox<String> hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> mes;
    private javax.swing.JComboBox<String> minuto;
    private javax.swing.JTextField nombreDelEvento;
    // End of variables declaration//GEN-END:variables
}
