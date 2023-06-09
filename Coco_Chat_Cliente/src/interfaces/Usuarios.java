
package interfaces;

/**
 *
 * @author Nancy
 */
public class Usuarios extends javax.swing.JFrame {

    /**
     * Creates new form UsuariosConectados
     */
    public Usuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        UsuariosMenu = new javax.swing.JMenu();
        UsuariosConectadosMenu = new javax.swing.JMenuItem();
        UsuariosDeconectadosMenu = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        AmigosConectadosMenu = new javax.swing.JMenuItem();
        AmigosDesconectadosMenu = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UsuariosMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuario.png"))); // NOI18N
        UsuariosMenu.setText("Usuarios");
        UsuariosMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UsuariosMenu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        UsuariosMenu.setIconTextGap(5);
        UsuariosMenu.setMargin(new java.awt.Insets(5, 90, 5, 90));
        UsuariosMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosMenuActionPerformed(evt);
            }
        });

        UsuariosConectadosMenu.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        UsuariosConectadosMenu.setText("Conectados");
        UsuariosConectadosMenu.setMargin(new java.awt.Insets(2, 60, 2, 60));
        UsuariosConectadosMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosConectadosMenuActionPerformed(evt);
            }
        });
        UsuariosMenu.add(UsuariosConectadosMenu);

        UsuariosDeconectadosMenu.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        UsuariosDeconectadosMenu.setText("Desconectados");
        UsuariosDeconectadosMenu.setMargin(new java.awt.Insets(2, 60, 2, 60));
        UsuariosDeconectadosMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosDeconectadosMenuActionPerformed(evt);
            }
        });
        UsuariosMenu.add(UsuariosDeconectadosMenu);

        jMenuBar1.add(UsuariosMenu);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/amigos.png"))); // NOI18N
        jMenu4.setText("Amigos");
        jMenu4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenu4.setIconTextGap(5);
        jMenu4.setMargin(new java.awt.Insets(5, 90, 5, 90));

        AmigosConectadosMenu.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        AmigosConectadosMenu.setText("Conectados");
        AmigosConectadosMenu.setMargin(new java.awt.Insets(2, 60, 2, 60));
        jMenu4.add(AmigosConectadosMenu);

        AmigosDesconectadosMenu.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        AmigosDesconectadosMenu.setText("Desconectados");
        AmigosDesconectadosMenu.setMargin(new java.awt.Insets(2, 60, 2, 60));
        jMenu4.add(AmigosDesconectadosMenu);

        jMenuBar1.add(jMenu4);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/grupos.png"))); // NOI18N
        jMenu7.setText("Grupos");
        jMenu7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenu7.setIconTextGap(5);
        jMenu7.setMargin(new java.awt.Insets(5, 80, 5, 80));
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 726, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuariosMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosMenuActionPerformed
       
    }//GEN-LAST:event_UsuariosMenuActionPerformed

    private void UsuariosDeconectadosMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosDeconectadosMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuariosDeconectadosMenuActionPerformed

    private void UsuariosConectadosMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosConectadosMenuActionPerformed
        Amigos a = new Amigos();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_UsuariosConectadosMenuActionPerformed

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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AmigosConectadosMenu;
    private javax.swing.JMenuItem AmigosDesconectadosMenu;
    private javax.swing.JMenuItem UsuariosConectadosMenu;
    private javax.swing.JMenuItem UsuariosDeconectadosMenu;
    private javax.swing.JMenu UsuariosMenu;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
