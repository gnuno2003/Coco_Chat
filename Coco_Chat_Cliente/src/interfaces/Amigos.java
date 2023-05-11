
package interfaces;

import db_conection_package.Usuario;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.Box.createHorizontalGlue;
import javax.swing.DefaultListModel;
import user_session.SessionManager;

/**
 *
 * @author Nancy
 */

public class Amigos extends javax.swing.JFrame {

    /**
     * Creates new form UsuariosConectados
     */
    boolean windowopen = false;
    public Amigos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.addWindowListener(new WindowAdapter()
                {
                    public void windowClosing(WindowEvent e)
                    {
                        Socket s;      
                        try {
                            String direccionServidor = "10.147.17.147";
                            InetAddress direccion = InetAddress.getByName(direccionServidor);
                            s = new Socket(direccion, 1234);
                            
                            DataOutputStream funcion = new DataOutputStream(s.getOutputStream());
                            funcion.writeUTF("cerrar_sesion");
                            
                            String username = SessionManager.getUsername();
                            DataOutputStream objectOS = new DataOutputStream(s.getOutputStream());
                            objectOS.writeUTF(username);
                           
                            s.close();
                        } catch (IOException ex) {
                            Logger.getLogger(InicioSesion.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
        );
    }
    /*
    public Chat(String usuario){
        initComponents();
        this.setLocationRelativeTo(null);
    }*/

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        AgregarAmigosButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaAmigosConectados = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaAmigosNoConectados = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        AgregarAmigosButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        UsuariosMenu = new javax.swing.JMenu();
        AmigosMenu = new javax.swing.JMenu();
        GruposMenu = new javax.swing.JMenu();
        IconLogOut = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("jMenu3");

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jFormattedTextField1.setText("jFormattedTextField1");

        AgregarAmigosButton1.setText("Agregar amigos");
        AgregarAmigosButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarAmigosButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel1.setText("Conectados");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weighty = 0.05;
        getContentPane().add(jLabel1, gridBagConstraints);

        ListaAmigosConectados.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ListaAmigosOnline listaAmigosOn = new ListaAmigosOnline();
        ArrayList<Usuario> amigosOn = listaAmigosOn.obtenerAmigosOn();

        DefaultListModel<String> modeloListaAmigosOn = new DefaultListModel<>();
        for(Usuario amigo: amigosOn)
        {
            modeloListaAmigosOn.addElement(amigo.username);
        }
        ListaAmigosConectados.setModel(modeloListaAmigosOn);
        /*
        ListaAmigosConectados.setModel(new javax.swing.AbstractListModel<String>() {
            public int getSize() { return amigosOn.length; }
            public String getElementAt(int i) { return amigosOn[i]; }
        });
        */
        ListaAmigosConectados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaAmigosConectadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListaAmigosConectados);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jScrollPane1, gridBagConstraints);

        ListaAmigosNoConectados.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ListaAmigosOffline listaAmigosOffline = new ListaAmigosOffline();
        ArrayList<Usuario> amigosOff = listaAmigosOffline.obtenerAmigosOff();

        DefaultListModel<String> modeloListaAmigosOff = new DefaultListModel<>();
        for(Usuario amigo: amigosOff)
        {
            modeloListaAmigosOff.addElement(amigo.username);
        }
        ListaAmigosNoConectados.setModel(modeloListaAmigosOff);
        /*
        ListaAmigosNoConectados.setModel(new javax.swing.AbstractListModel<String>() {
            public int getSize() { return amigosOff.length; }
            public String getElementAt(int i) { return amigosOff[i]; }
        });
        */
        ListaAmigosNoConectados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaAmigosNoConectadosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ListaAmigosNoConectados);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jScrollPane2, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel2.setText("Desconectados");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weighty = 0.05;
        getContentPane().add(jLabel2, gridBagConstraints);

        AgregarAmigosButton2.setText("Agregar amigos");
        AgregarAmigosButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarAmigosButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(AgregarAmigosButton2, gridBagConstraints);

        UsuariosMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuario.png"))); // NOI18N
        UsuariosMenu.setText("Usuarios");
        UsuariosMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UsuariosMenu.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        UsuariosMenu.setIconTextGap(5);
        UsuariosMenu.setMargin(new java.awt.Insets(2, 10, 2, 10));
        UsuariosMenu.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                UsuariosMenuMenuSelected(evt);
            }
        });
        jMenuBar1.add(UsuariosMenu);

        AmigosMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/amigos.png"))); // NOI18N
        AmigosMenu.setText("Amigos");
        AmigosMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AmigosMenu.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        AmigosMenu.setIconTextGap(5);
        AmigosMenu.setMargin(new java.awt.Insets(2, 10, 2, 10));
        AmigosMenu.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                AmigosMenuMenuSelected(evt);
            }
        });
        jMenuBar1.add(AmigosMenu);

        GruposMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/grupos.png"))); // NOI18N
        GruposMenu.setText("Grupos");
        GruposMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GruposMenu.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        GruposMenu.setIconTextGap(5);
        GruposMenu.setMargin(new java.awt.Insets(2, 10, 2, 10));
        GruposMenu.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                GruposMenuMenuSelected(evt);
            }
        });
        jMenuBar1.add(GruposMenu);

        IconLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/log-out.png"))); // NOI18N

        jMenuBar1.add(createHorizontalGlue());

        jMenuBar1.add(IconLogOut);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public class ListaAmigosOnline{
        private ArrayList<Usuario> amigosOn;
        
        
        public ListaAmigosOnline(){
            /*amigosOn = new String[]{"Marta", "Jose", "Felipe", "Manuel"};*/
            this.amigosOn = new ArrayList<Usuario>();
            Socket s;
            try {
                String direccionServidor = "10.147.17.147";
                InetAddress direccion = InetAddress.getByName(direccionServidor);
                s = new Socket(direccion, 1234);

                DataOutputStream funcion = new DataOutputStream(s.getOutputStream());
                funcion.writeUTF("mostrar_amigos");

                String username = SessionManager.getUsername();
                DataOutputStream userLogged = new DataOutputStream(s.getOutputStream());
                userLogged.writeUTF(username);

                ObjectInputStream usuariosList = new ObjectInputStream(s.getInputStream());

                try {
                    ArrayList<Usuario> usuarios = (ArrayList<Usuario>)usuariosList.readObject();
                    s.close();
                    for(Usuario user: usuarios)
                    {
                        if(user.estado == 1)
                        {
                            this.amigosOn.add(user);
                        }
                    }

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (IOException ex) {
                Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        public ArrayList<Usuario> obtenerAmigosOn(){
            return amigosOn;
        }
    }
    
    public class ListaAmigosOffline{
        private ArrayList<Usuario> amigosOff;
        
        public ListaAmigosOffline(){
            /*amigosOff = new String[]{"Pedro", "Cosa", "kkita", ":P"};*/
            this.amigosOff = new ArrayList<Usuario>();
            Socket s;
            try 
            {
                String direccionServidor = "10.147.17.147";
                InetAddress direccion = InetAddress.getByName(direccionServidor);
                s = new Socket(direccion, 1234);

                DataOutputStream funcion = new DataOutputStream(s.getOutputStream());
                funcion.writeUTF("mostrar_amigos");

                String username = SessionManager.getUsername();
                DataOutputStream userLogged = new DataOutputStream(s.getOutputStream());
                userLogged.writeUTF(username);

                ObjectInputStream usuariosList = new ObjectInputStream(s.getInputStream());

                try {
                    ArrayList<Usuario> usuarios = (ArrayList<Usuario>)usuariosList.readObject();
                    s.close();
                    for(Usuario user: usuarios)
                    {
                        if(user.estado == 0)
                        {
                            this.amigosOff.add(user);
                        }
                    }

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        public ArrayList<Usuario> obtenerAmigosOff(){
            return amigosOff;
        }
    }
    
    
     
    private void UsuariosMenuMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_UsuariosMenuMenuSelected
        Usuarios a = new Usuarios();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_UsuariosMenuMenuSelected

    private void AmigosMenuMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_AmigosMenuMenuSelected
        Amigos a = new Amigos();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AmigosMenuMenuSelected

    private void GruposMenuMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_GruposMenuMenuSelected
        Grupos a = new Grupos();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_GruposMenuMenuSelected

    private void ListaAmigosConectadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaAmigosConectadosMouseClicked
        String nombreSeleccionado = ListaAmigosConectados.getSelectedValue();
        if (windowopen == false)
        {
            Chat a = new Chat(nombreSeleccionado);
            a.setTitle(nombreSeleccionado);
            int posX = Toolkit.getDefaultToolkit().getScreenSize().width - a.getWidth();
            int posY = Toolkit.getDefaultToolkit().getScreenSize().height - a.getHeight()-30;
            a.setLocation(posX, posY);
            
            windowopen = true;
            a.addWindowListener(new java.awt.event.WindowAdapter() 
            {
                @Override
                public void windowClosing(java.awt.event.WindowEvent windowEvent) 
                {
                    windowopen = false;
                }
            });
            a.setVisible(true);
        }
    }//GEN-LAST:event_ListaAmigosConectadosMouseClicked

    private void ListaAmigosNoConectadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaAmigosNoConectadosMouseClicked
        
    }//GEN-LAST:event_ListaAmigosNoConectadosMouseClicked

    private void AgregarAmigosButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarAmigosButton1ActionPerformed
        AgregarAmigos a = new AgregarAmigos();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AgregarAmigosButton1ActionPerformed

    private void AgregarAmigosButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarAmigosButton2ActionPerformed
        AgregarAmigos a = new AgregarAmigos();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AgregarAmigosButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Amigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Amigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Amigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Amigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Amigos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarAmigosButton;
    private javax.swing.JButton AgregarAmigosButton1;
    private javax.swing.JButton AgregarAmigosButton2;
    private javax.swing.JMenu AmigosMenu;
    private javax.swing.JMenu GruposMenu;
    private javax.swing.JMenu IconLogOut;
    private javax.swing.JList<String> ListaAmigosConectados;
    private javax.swing.JList<String> ListaAmigosNoConectados;
    private javax.swing.JMenu UsuariosMenu;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
