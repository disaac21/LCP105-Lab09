/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danieljuarezserliogiron_lab9p2;

/**
 *
 * @author danie
 */
public class GoogleUndead extends javax.swing.JFrame {

    /**
     * Creates new form GoogleUndead
     */
    public GoogleUndead() {
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

        CrearCarpetaFrame = new javax.swing.JDialog();
        NombreCarpetaLabel = new javax.swing.JLabel();
        NombreCarpetaTextField = new javax.swing.JTextField();
        CrearCarpetaButton = new javax.swing.JButton();
        CrearArchivoFrame = new javax.swing.JDialog();
        NombreArchivoLabel = new javax.swing.JLabel();
        NombreArchivoTextField = new javax.swing.JTextField();
        ExtensionLabel = new javax.swing.JLabel();
        ExtensionComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        MB = new javax.swing.JLabel();
        CrearArchivoButton = new javax.swing.JButton();
        LinkProgressBar = new javax.swing.JProgressBar();
        ListScrollPane = new javax.swing.JScrollPane();
        List = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        MenuBar = new javax.swing.JMenuBar();
        Archivos = new javax.swing.JMenu();
        MiUnidad = new javax.swing.JMenuItem();
        Destacados = new javax.swing.JMenuItem();
        Papelera = new javax.swing.JMenuItem();
        Agregar = new javax.swing.JMenu();
        AgregarCarpeta = new javax.swing.JMenuItem();
        AgregarArchivo = new javax.swing.JMenuItem();

        NombreCarpetaLabel.setText("Nombre de la Carpeta");

        CrearCarpetaButton.setText("Crear Carpeta");
        CrearCarpetaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearCarpetaButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CrearCarpetaFrameLayout = new javax.swing.GroupLayout(CrearCarpetaFrame.getContentPane());
        CrearCarpetaFrame.getContentPane().setLayout(CrearCarpetaFrameLayout);
        CrearCarpetaFrameLayout.setHorizontalGroup(
            CrearCarpetaFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearCarpetaFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CrearCarpetaFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CrearCarpetaButton)
                    .addGroup(CrearCarpetaFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(NombreCarpetaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NombreCarpetaLabel)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        CrearCarpetaFrameLayout.setVerticalGroup(
            CrearCarpetaFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearCarpetaFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NombreCarpetaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NombreCarpetaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(CrearCarpetaButton)
                .addContainerGap())
        );

        NombreArchivoLabel.setText("Nombre del Archivo");

        ExtensionLabel.setText("Extensión");

        ExtensionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".pdf", ".txt", ".docx", ".jpg", ".mp4" }));

        jLabel1.setText("Tamaño");

        MB.setText("MB");

        CrearArchivoButton.setText("Crear Carpeta");

        javax.swing.GroupLayout CrearArchivoFrameLayout = new javax.swing.GroupLayout(CrearArchivoFrame.getContentPane());
        CrearArchivoFrame.getContentPane().setLayout(CrearArchivoFrameLayout);
        CrearArchivoFrameLayout.setHorizontalGroup(
            CrearArchivoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearArchivoFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CrearArchivoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NombreArchivoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreArchivoLabel)
                    .addGroup(CrearArchivoFrameLayout.createSequentialGroup()
                        .addGroup(CrearArchivoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ExtensionLabel)
                            .addComponent(ExtensionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(CrearArchivoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(CrearArchivoFrameLayout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(MB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CrearArchivoButton)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        CrearArchivoFrameLayout.setVerticalGroup(
            CrearArchivoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearArchivoFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NombreArchivoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NombreArchivoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(CrearArchivoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExtensionLabel)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CrearArchivoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExtensionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MB)
                    .addComponent(CrearArchivoButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        List.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "testing" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListScrollPane.setViewportView(List);

        jLabel2.setText("Descarga Individual");

        jLabel3.setText("Descarga Total");

        Archivos.setText("Archivos");
        Archivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivosActionPerformed(evt);
            }
        });

        MiUnidad.setText("Mi Unidad");
        MiUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiUnidadActionPerformed(evt);
            }
        });
        Archivos.add(MiUnidad);

        Destacados.setText("Destacados");
        Destacados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestacadosActionPerformed(evt);
            }
        });
        Archivos.add(Destacados);

        Papelera.setText("Papelera");
        Papelera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PapeleraActionPerformed(evt);
            }
        });
        Archivos.add(Papelera);

        Agregar.setText("Agregar");

        AgregarCarpeta.setText("Carpeta");
        AgregarCarpeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarCarpetaActionPerformed(evt);
            }
        });
        Agregar.add(AgregarCarpeta);

        AgregarArchivo.setText("Archivo");
        AgregarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarArchivoActionPerformed(evt);
            }
        });
        Agregar.add(AgregarArchivo);

        Archivos.add(Agregar);

        MenuBar.add(Archivos);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ListScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LinkProgressBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29)
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LinkProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ArchivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivosActionPerformed

    }//GEN-LAST:event_ArchivosActionPerformed

    private void MiUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiUnidadActionPerformed
        Opcion = "Mi Unidad";
    }//GEN-LAST:event_MiUnidadActionPerformed

    private void DestacadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DestacadosActionPerformed
        Opcion = "Destacados";
    }//GEN-LAST:event_DestacadosActionPerformed

    private void PapeleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PapeleraActionPerformed
        Opcion = "Papelera";
    }//GEN-LAST:event_PapeleraActionPerformed

    private void AgregarCarpetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarCarpetaActionPerformed
        CrearCarpetaFrame.setModal(true);
        CrearCarpetaFrame.pack();
        CrearCarpetaFrame.setLocationRelativeTo(this);
        CrearCarpetaFrame.setVisible(true);
    }//GEN-LAST:event_AgregarCarpetaActionPerformed

    private void AgregarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarArchivoActionPerformed
        CrearArchivoFrame.setModal(true);
        CrearArchivoFrame.pack();
        CrearArchivoFrame.setLocationRelativeTo(this);
        CrearArchivoFrame.setVisible(true);
    }//GEN-LAST:event_AgregarArchivoActionPerformed

    private void CrearCarpetaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearCarpetaButtonMouseClicked
//        String Link
//        Carpeta file = new Carpeta(NombreCarpetaTextField.getText(), Link, Carpetas, Archivos);

    }//GEN-LAST:event_CrearCarpetaButtonMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GoogleUndead.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GoogleUndead.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GoogleUndead.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GoogleUndead.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GoogleUndead().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Agregar;
    private javax.swing.JMenuItem AgregarArchivo;
    private javax.swing.JMenuItem AgregarCarpeta;
    private javax.swing.JMenu Archivos;
    private javax.swing.JButton CrearArchivoButton;
    private javax.swing.JDialog CrearArchivoFrame;
    private javax.swing.JButton CrearCarpetaButton;
    private javax.swing.JDialog CrearCarpetaFrame;
    private javax.swing.JMenuItem Destacados;
    private javax.swing.JComboBox<String> ExtensionComboBox;
    private javax.swing.JLabel ExtensionLabel;
    private javax.swing.JProgressBar LinkProgressBar;
    private javax.swing.JList<String> List;
    private javax.swing.JScrollPane ListScrollPane;
    private javax.swing.JLabel MB;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem MiUnidad;
    private javax.swing.JLabel NombreArchivoLabel;
    private javax.swing.JTextField NombreArchivoTextField;
    private javax.swing.JLabel NombreCarpetaLabel;
    private javax.swing.JTextField NombreCarpetaTextField;
    private javax.swing.JMenuItem Papelera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    String Opcion;
}
