/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_monicacastillo;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.Action;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Monica
 */
public class Inicio extends javax.swing.JFrame {

    static Random random = new Random();

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VentanaAgregar = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ExtensionArchivo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NombreArchivo = new javax.swing.JTextField();
        TamañoArchivo = new javax.swing.JFormattedTextField();
        NombreCarpeta = new javax.swing.JTextField();
        BotonArchivoIndependiente = new javax.swing.JButton();
        BotonMeterArchivoCarpeta = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CBCarpetasA = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BotonCrearCarpeta = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        CBCarpetasC = new javax.swing.JComboBox<>();
        BotonMeterCarpetaACarpeta = new javax.swing.JButton();
        BarraCargar = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuMiUnidad = new javax.swing.JMenu();
        MenuDestacados = new javax.swing.JMenu();
        MenuPapelera = new javax.swing.JMenu();
        MenuAgregar = new javax.swing.JMenu();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Crear Carpeta");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Crear Archivo");

        jLabel3.setText("Nombre");

        jLabel4.setText("Nombre");

        ExtensionArchivo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ExtensionArchivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pdf", "txt", "docx", "jpg", "mp4" }));

        jLabel5.setText("Extensión");

        jLabel6.setText("Tamaño");

        NombreArchivo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        TamañoArchivo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        BotonArchivoIndependiente.setText("Crear Archivo Indepenidente");
        BotonArchivoIndependiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonArchivoIndependienteMouseClicked(evt);
            }
        });

        BotonMeterArchivoCarpeta.setText("Meter Archivo a Carpeta");
        BotonMeterArchivoCarpeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonMeterArchivoCarpetaMouseClicked(evt);
            }
        });

        jLabel7.setText("Asignar a Carpeta");

        jLabel8.setText("________________________________________________________");

        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("*Aqui solo se crean archivos solos*");

        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("*Aqui se puede meter un archivo a una carpeta*");

        BotonCrearCarpeta.setText("Crear Carpeta");
        BotonCrearCarpeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCrearCarpetaMouseClicked(evt);
            }
        });

        jLabel11.setText("____________________________________________________");

        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("*Aqui se crean carpetas sin nada dentro*");

        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("*Aqui se puede meter una carpeta dentro de otra*");

        jLabel14.setText("Asignar a Carpeta");

        BotonMeterCarpetaACarpeta.setText("Meter Carpeta a Carpeta");
        BotonMeterCarpetaACarpeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonMeterCarpetaACarpetaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout VentanaAgregarLayout = new javax.swing.GroupLayout(VentanaAgregar.getContentPane());
        VentanaAgregar.getContentPane().setLayout(VentanaAgregarLayout);
        VentanaAgregarLayout.setHorizontalGroup(
            VentanaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentanaAgregarLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(99, 99, 99))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentanaAgregarLayout.createSequentialGroup()
                .addGroup(VentanaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VentanaAgregarLayout.createSequentialGroup()
                        .addGroup(VentanaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VentanaAgregarLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(VentanaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(NombreCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(VentanaAgregarLayout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(BotonCrearCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(VentanaAgregarLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel13))
                            .addGroup(VentanaAgregarLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(CBCarpetasC, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentanaAgregarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BotonMeterCarpetaACarpeta)
                        .addGap(63, 63, 63)))
                .addGroup(VentanaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(VentanaAgregarLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CBCarpetasA, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(VentanaAgregarLayout.createSequentialGroup()
                        .addGroup(VentanaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(34, 34, 34)
                        .addGroup(VentanaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TamañoArchivo)
                            .addComponent(NombreArchivo)
                            .addComponent(ExtensionArchivo, 0, 232, Short.MAX_VALUE)
                            .addGroup(VentanaAgregarLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(VentanaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(BotonArchivoIndependiente, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
            .addGroup(VentanaAgregarLayout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentanaAgregarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(VentanaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentanaAgregarLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentanaAgregarLayout.createSequentialGroup()
                        .addComponent(BotonMeterArchivoCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );
        VentanaAgregarLayout.setVerticalGroup(
            VentanaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VentanaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addGroup(VentanaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(NombreArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(VentanaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VentanaAgregarLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(VentanaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ExtensionArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(VentanaAgregarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BotonCrearCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(8, 8, 8)
                .addGroup(VentanaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TamañoArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(VentanaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonArchivoIndependiente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(CBCarpetasC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(VentanaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(BotonMeterCarpetaACarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(VentanaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBCarpetasA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(20, 20, 20)
                .addComponent(BotonMeterArchivoCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BarraCargar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BarraCargar.setForeground(new java.awt.Color(255, 153, 102));
        BarraCargar.setString("");
        BarraCargar.setStringPainted(true);

        jList1.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jList1);

        MenuMiUnidad.setText("Mi Unidad");
        MenuMiUnidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMiUnidadMouseClicked(evt);
            }
        });
        jMenuBar1.add(MenuMiUnidad);

        MenuDestacados.setText("Destacados");
        MenuDestacados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuDestacadosMouseClicked(evt);
            }
        });
        jMenuBar1.add(MenuDestacados);

        MenuPapelera.setText("Papelera");
        MenuPapelera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuPapeleraMouseClicked(evt);
            }
        });
        jMenuBar1.add(MenuPapelera);

        MenuAgregar.setText("Agregar");
        MenuAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuAgregarMouseClicked(evt);
            }
        });
        jMenuBar1.add(MenuAgregar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BarraCargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 419, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BarraCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonArchivoIndependienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonArchivoIndependienteMouseClicked
        // TODO add your handling code here:
        try {
            String link = "";
            for (int i = 0; i < 10; i++) {
                if (i == 2 || i == 5 || i == 8) {
                    link += (char) (97 + random.nextInt(26));
                } else if (i == 0 || i == 3 || i == 6 || i == 9) {
                    link += (char) (65 + random.nextInt(26));
                } else {
                    link += (char) (48 + random.nextInt(10));
                } // Fin If          
            } // Fin For
            String nombre, extension;
            double tamaño;
            nombre = NombreArchivo.getText();
            extension = ExtensionArchivo.getSelectedItem().toString();
            tamaño = Double.parseDouble(TamañoArchivo.getText());
            String linkfinal = "dive.google.com/" + link;
            Archivo arch = new Archivo(nombre, linkfinal, extension, tamaño);
            MiUnidad.add(arch);
            aa = new AdminArchivo("./Almacenimiento.mc");
            aa.cargarArchivo();
            aa.SetArchivo(arch);
            aa.escribirArchivo();
            JOptionPane.showMessageDialog(null, "Archivo creado exitosamente");
            NombreArchivo.setText("");
            ExtensionArchivo.setSelectedIndex(0);
            TamañoArchivo.setText("");
        } catch (Exception e) {
            e.printStackTrace();
        } // Fin Try Catch
    }//GEN-LAST:event_BotonArchivoIndependienteMouseClicked

    private void BotonMeterArchivoCarpetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMeterArchivoCarpetaMouseClicked
        // TODO add your handling code here:
        try {
            String nombre, nombrecarp, extension;
            double tamaño;
            nombre = NombreArchivo.getText();
            extension = ExtensionArchivo.getSelectedItem().toString();
            tamaño = Double.parseDouble(TamañoArchivo.getText());
            carpetaselected = (Carpeta) CBCarpetasA.getSelectedItem();
            String link = "";
            for (int i = 0; i < 10; i++) {
                if (i == 2 || i == 5 || i == 8) {
                    link += (char) (97 + random.nextInt(26));
                } else if (i == 0 || i == 3 || i == 6 || i == 9) {
                    link += (char) (65 + random.nextInt(26));
                } else {
                    link += (char) (48 + random.nextInt(10));
                } // Fin If          
            } // Fin For
            nombrecarp = carpetaselected.getNombre();
            String linkfinal = "dive.google.com/" + nombrecarp + "/" + link;
            Archivo arch = new Archivo(nombre, linkfinal, extension, tamaño);
            carpetaselected.SetArchivo(arch);
            MiUnidad.add(arch);
            aa = new AdminArchivo("./Almacenimiento.mc");
            aa.cargarArchivo();
            aa.SetArchivo(arch);
            aa.escribirArchivo();
            JOptionPane.showMessageDialog(null, "Archivo creado exitosamente");
            NombreArchivo.setText("");
            ExtensionArchivo.setSelectedIndex(0);
            TamañoArchivo.setText("");
        } catch (Exception e) {
            e.printStackTrace();
        } // Fin Try Catch
    }//GEN-LAST:event_BotonMeterArchivoCarpetaMouseClicked

    private void MenuMiUnidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMiUnidadMouseClicked
        // TODO add your handling code here:
        try {
            BarraCargar.setString("Mi Unidad");
        } catch (Exception e) {
            e.printStackTrace();
        } // Fin Try Catch
    }//GEN-LAST:event_MenuMiUnidadMouseClicked

    private void MenuDestacadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuDestacadosMouseClicked
        // TODO add your handling code here:
        try {
            BarraCargar.setString("Destacados");
        } catch (Exception e) {
            e.printStackTrace();
        } // Fin Try Catch
    }//GEN-LAST:event_MenuDestacadosMouseClicked

    private void MenuPapeleraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuPapeleraMouseClicked
        // TODO add your handling code here:
        try {
            BarraCargar.setString("Papelera");
        } catch (Exception e) {
            e.printStackTrace();
        } // Fin Try Catch
    }//GEN-LAST:event_MenuPapeleraMouseClicked

    private void MenuAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuAgregarMouseClicked
        // TODO add your handling code here:
        try {
            VentanaAgregar.pack();
            VentanaAgregar.setVisible(true);
            VentanaAgregar.setLocationRelativeTo(null);
            this.setVisible(false);
            BarraCargar.setString("Menu Agregar");
        } catch (Exception e) {
            e.printStackTrace();
        } // Fin Try Catch
    }//GEN-LAST:event_MenuAgregarMouseClicked

    private void BotonCrearCarpetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCrearCarpetaMouseClicked
        // TODO add your handling code here:
        try {
            String nombre;
            nombre = NombreCarpeta.getText();
            String link = "";
            for (int i = 0; i < 5; i++) {
                if (i == 0 || i == 4) {
                    link += (char) (97 + random.nextInt(26));
                } else if (i == 1 || i == 3) {
                    link += (char) (65 + random.nextInt(26));
                } else {
                    link += (char) (48 + random.nextInt(10));
                } // Fin If          
            } // Fin For
            String linkfinal = "dive.google.com/" + link;
            Carpeta carp = new Carpeta(nombre, linkfinal);
            DefaultComboBoxModel car = (DefaultComboBoxModel) CBCarpetasC.getModel();
            DefaultComboBoxModel car2 = (DefaultComboBoxModel) CBCarpetasA.getModel();
            car.addElement(carp);
            car.addElement(carp);
            CBCarpetasC.setModel(car);
            CBCarpetasA.setModel(car2);
            MiUnidad.add(carp);
            ac = new AdminCarpeta("./Almacenimiento.mc");
            ac.cargarArchivo();
            ac.SetCarpeta(carp);
            ac.escribirArchivo();
            JOptionPane.showMessageDialog(null, "Carpeta creada exitosamente");
            NombreCarpeta.setText("");
        } catch (Exception e) {
            e.printStackTrace();
        } // Fin Try Catch
    }//GEN-LAST:event_BotonCrearCarpetaMouseClicked

    private void BotonMeterCarpetaACarpetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMeterCarpetaACarpetaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonMeterCarpetaACarpetaMouseClicked

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
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar BarraCargar;
    private javax.swing.JButton BotonArchivoIndependiente;
    private javax.swing.JButton BotonCrearCarpeta;
    private javax.swing.JButton BotonMeterArchivoCarpeta;
    private javax.swing.JButton BotonMeterCarpetaACarpeta;
    private javax.swing.JComboBox<String> CBCarpetasA;
    private javax.swing.JComboBox<String> CBCarpetasC;
    private javax.swing.JComboBox<String> ExtensionArchivo;
    private javax.swing.JMenu MenuAgregar;
    private javax.swing.JMenu MenuDestacados;
    private javax.swing.JMenu MenuMiUnidad;
    private javax.swing.JMenu MenuPapelera;
    private javax.swing.JTextField NombreArchivo;
    private javax.swing.JTextField NombreCarpeta;
    private javax.swing.JFormattedTextField TamañoArchivo;
    private javax.swing.JFrame VentanaAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
private ArrayList MiUnidad = new ArrayList();
    private AdminArchivo aa;
    private AdminCarpeta ac;
    private Carpeta carpetaselected;

}
