package proyectFrmClass;

//Librerias
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class menuVentas extends javax.swing.JFrame {
    
    //Variables para mover la ventana del Frame
    int xMouse, yMouse;
    Icon modificar3;

    //Instanciamos la clase fechaHora.java
    fechaHora time = new fechaHora();

    public menuVentas() {
        initComponents();
        //Poner el progrma en el medio
        this.setLocationRelativeTo(null);
        //Iniciar el cursor en la hora
        lblHora.requestFocus();
        //Clase Mostrar Tiempo
        mostrarTiempo();
        
        //
        modificar3 = new ImageIcon("src/imagenes/nombresGrupo.png");

        //Libreria para las imágenes decorativas
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel1, "F:\\2do Ciclo\\proyecGlobTecx\\src\\imagenes\\fondoInicioSesion.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblLogo, "F:\\2do Ciclo\\proyecGlobTecx\\src\\imagenes\\4.png");

    }

    public void mostrarTiempo() {
        //Imprimiendo en el label
        lblHora.setText(time.hourComplet);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRegistro = new javax.swing.JPanel();
        pnlMinimizar = new javax.swing.JPanel();
        lblMin = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        pnlCerrar = new javax.swing.JPanel();
        lblX = new javax.swing.JLabel();
        pswContraseña = new javax.swing.JPasswordField();
        pnlIniciarSss = new javax.swing.JPanel();
        lblInSs = new javax.swing.JLabel();
        lblAcceder = new javax.swing.JLabel();
        lblContra = new javax.swing.JLabel();
        lblUsu = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlMover = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMinimizar.setBackground(new java.awt.Color(33, 243, 112));

        lblMin.setFont(new java.awt.Font("Roboto Light", 0, 48)); // NOI18N
        lblMin.setForeground(new java.awt.Color(0, 0, 0));
        lblMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMin.setText("-");
        lblMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMinMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlMinimizarLayout = new javax.swing.GroupLayout(pnlMinimizar);
        pnlMinimizar.setLayout(pnlMinimizarLayout);
        pnlMinimizarLayout.setHorizontalGroup(
            pnlMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMinimizarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblMin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlMinimizarLayout.setVerticalGroup(
            pnlMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMinimizarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblMin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlRegistro.add(pnlMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 40));

        lblHora.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setText("07:56 p.m");
        pnlRegistro.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 140, 30));

        txtUsuario.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setText("Ingrese su nombre de usuario");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        pnlRegistro.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 300, 40));

        pnlCerrar.setBackground(new java.awt.Color(255, 255, 255));
        pnlCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlCerrarMouseEntered(evt);
            }
        });
        pnlCerrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblX.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        lblX.setForeground(new java.awt.Color(0, 0, 0));
        lblX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblX.setText("X");
        lblX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblXMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblXMouseExited(evt);
            }
        });
        pnlCerrar.add(lblX, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        pnlRegistro.add(pnlCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        pswContraseña.setFont(new java.awt.Font("Fira Code Light", 0, 18)); // NOI18N
        pswContraseña.setForeground(new java.awt.Color(204, 204, 204));
        pswContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pswContraseña.setText("************");
        pswContraseña.setBorder(null);
        pswContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pswContraseñaMousePressed(evt);
            }
        });
        pnlRegistro.add(pswContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 300, 40));

        pnlIniciarSss.setBackground(new java.awt.Color(33, 243, 112));

        lblInSs.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblInSs.setForeground(new java.awt.Color(255, 255, 255));
        lblInSs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInSs.setText("INICIAR SESIÓN");
        lblInSs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInSs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInSsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInSsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInSsMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlIniciarSssLayout = new javax.swing.GroupLayout(pnlIniciarSss);
        pnlIniciarSss.setLayout(pnlIniciarSssLayout);
        pnlIniciarSssLayout.setHorizontalGroup(
            pnlIniciarSssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInSs, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        pnlIniciarSssLayout.setVerticalGroup(
            pnlIniciarSssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInSs, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        pnlRegistro.add(pnlIniciarSss, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 190, 40));

        lblAcceder.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        lblAcceder.setForeground(new java.awt.Color(255, 255, 255));
        lblAcceder.setText("ACCEDER");
        pnlRegistro.add(lblAcceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 110, 40));

        lblContra.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        lblContra.setForeground(new java.awt.Color(255, 255, 255));
        lblContra.setText("CONTRASEÑA");
        pnlRegistro.add(lblContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        lblUsu.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        lblUsu.setForeground(new java.awt.Color(255, 255, 255));
        lblUsu.setText("USUARIO");
        pnlRegistro.add(lblUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        lblLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoMouseClicked(evt);
            }
        });
        pnlRegistro.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 260, 270));

        jLabel1.setText("jLabel1");
        pnlRegistro.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 530));

        pnlMover.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlMoverMouseDragged(evt);
            }
        });
        pnlMover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlMoverMousePressed(evt);
            }
        });
        pnlMover.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlRegistro.add(pnlMover, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 40));

        jLabel2.setText("jLabel2");
        pnlRegistro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        getContentPane().add(pnlRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlMoverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMoverMousePressed
        //EVT IDENTIFICAR DONDE SE ENCUENTRA EL MOUSE EN EL JFRAME
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_pnlMoverMousePressed

    private void pnlMoverMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMoverMouseDragged
        //EVT IDENTIFICAR DONDE SE ENCUENTRA EL MOUSE EN PANTALLA
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        //EVT MOVER EL JFRAME
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_pnlMoverMouseDragged

    private void lblXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXMouseClicked
        //EVT CERRAR EL PROGRAMA
        System.exit(0);
    }//GEN-LAST:event_lblXMouseClicked

    private void pnlCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCerrarMouseEntered
        //EVT CAMBIAR EL COLOR DEL PANEL CUANSO SE PASA EL CURSOR EN EL
        pnlCerrar.setBackground(Color.red);
    }//GEN-LAST:event_pnlCerrarMouseEntered

    private void lblXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXMouseEntered
        //EVT CAMBIAR LOS COLORES DEL PANEL Y DEL LABEL CUANDO PASAS EL CURSOR POR EL
        pnlCerrar.setBackground(Color.red);
        lblX.setForeground(Color.white);
    }//GEN-LAST:event_lblXMouseEntered

    private void lblXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXMouseExited
        //EVT CAMBIAR LOS COLORES DEL PANEL Y DEL LABEL CUANDO EL CURSOR SALE
        pnlCerrar.setBackground(Color.white);
        lblX.setForeground(Color.black);
    }//GEN-LAST:event_lblXMouseExited

    private void lblInSsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInSsMouseEntered
        //EVT CAMBIAR LOS COLORES DEL PANEL Y DEL LABEL CUANDO EL CURSOR ENTRA
        pnlIniciarSss.setBackground(new Color(107, 248, 160));
    }//GEN-LAST:event_lblInSsMouseEntered

    private void lblInSsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInSsMouseExited
        //EVT CAMBIAR LOS COLORES DEL PANEL Y DEL LABEL CUANDO EL CURSOR SALE
        pnlIniciarSss.setBackground(new Color(33, 243, 112));
    }//GEN-LAST:event_lblInSsMouseExited

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        //EVT
        //CONDICIONALES PARA VACIAR LOS TextFields si es que se entra en el
        //E IDENTIFICA SI SE A ESCRITO ALGO EN EL TEXT FIEL
        if (txtUsuario.getText().equals("Ingrese su nombre de usuario")) {
            txtUsuario.setText("");
            txtUsuario.setForeground(Color.black);
        }

        if (String.valueOf(pswContraseña.getPassword()).isEmpty()) {
            pswContraseña.setText("************");
            pswContraseña.setForeground(Color.gray);
        }

    }//GEN-LAST:event_txtUsuarioMousePressed

    private void pswContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pswContraseñaMousePressed
        //EVT
        //CONDICIONALES PARA VACIAR LOS TextFields si es que se entra en el
        //E IDENTIFICA SI SE A ESCRITO ALGO EN EL TEXT FIEL
        if (String.valueOf(pswContraseña.getPassword()).equals("************")) {
            pswContraseña.setText("");
            pswContraseña.setForeground(Color.black);
        }
        if (txtUsuario.getText().isEmpty()) {
            txtUsuario.setText("Ingrese su nombre de usuario");
            txtUsuario.setForeground(Color.gray);
        }

    }//GEN-LAST:event_pswContraseñaMousePressed

    private void lblInSsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInSsMouseClicked
        //VERIFICAR EL USUARIO Y CONTRASEÑA, Y ABRIR EL FRAME CORRESPONDIENTE

        //ADMINISTRADOR
        if ("Yb.M".equals(txtUsuario.getText()) && "681566".equals(String.valueOf(pswContraseña.getPassword()))) {
            new frmRegistroAdmin().setVisible(true);
            this.setVisible(false);
            //EMPLEADO    
        } else if ("empleado".equals(txtUsuario.getText()) && "1234".equals(String.valueOf(pswContraseña.getPassword()))) {
            new frmGlobTecx().setVisible(true);
            this.setVisible(false);
            //SI SE INGRESA UNA CONTRASEÑA INCORRECTA    
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña INCORRECTOS, vuelva a intentarlo");
        }
    }//GEN-LAST:event_lblInSsMouseClicked

    private void lblMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinMouseClicked
        //EVT QUE MINIMIZA EL JFRAME
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_lblMinMouseClicked

    private void lblMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinMouseEntered
        //EVT CAMBIAR LOS COLORES DEL PANEL Y DEL LABEL CUANDO EL CURSOR ENTRA
        pnlMinimizar.setBackground(new Color(107, 248, 160));
    }//GEN-LAST:event_lblMinMouseEntered

    private void lblMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinMouseExited
        //EVT CAMBIAR LOS COLORES DEL PANEL Y DEL LABEL CUANDO EL CURSOR SALE
        pnlMinimizar.setBackground(new Color(33, 243, 112));
    }//GEN-LAST:event_lblMinMouseExited

    private void lblLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoMouseClicked
        JOptionPane.showMessageDialog(null, "", "INGREGRANTES DEL GRUPO",
                JOptionPane.WARNING_MESSAGE, modificar3);
    }//GEN-LAST:event_lblLogoMouseClicked

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
            java.util.logging.Logger.getLogger(menuVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //SEA VISIBLE EL FRAME
                new menuVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAcceder;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblInSs;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblUsu;
    private javax.swing.JLabel lblX;
    private javax.swing.JPanel pnlCerrar;
    private javax.swing.JPanel pnlIniciarSss;
    private javax.swing.JPanel pnlMinimizar;
    private javax.swing.JPanel pnlMover;
    private javax.swing.JPanel pnlRegistro;
    private javax.swing.JPasswordField pswContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
