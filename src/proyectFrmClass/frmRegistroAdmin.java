package proyectFrmClass;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public final class frmRegistroAdmin extends javax.swing.JFrame {
    //INSTANCIAMOS A LA CLASE FECHA HORA

    fechaHora time = new fechaHora();

    //VARIABLES GLOBALES PARA CALCULAR EL REGISTRO TOTAL
    double totalGanado = 0.0;
    double depo = 0.0;
    double efect = 0.0;
    double moEle = 0.0;
    String nameMayor = "";
    Double mayorPago = -1.99;
    int guardarfila;

    public frmRegistroAdmin() {
        initComponents();
        //MOSTRAR AL EJECUTAR
        mostrarTiempo();
        rsscalelabel.RSScaleLabel.setScaleLabel(lblFondo, "F:\\2do Ciclo\\proyecGlobTecx\\src\\imagenes\\colorDayBS.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblLogo, "F:\\2do Ciclo\\proyecGlobTecx\\src\\imagenes\\4.png");
        //PARA COLOCAR EL FRAM EN EL MEDIO
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIniciarSss = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaRegistros = new javax.swing.JTextArea();
        btnRegistro = new javax.swing.JButton();
        pnlMinimizar = new javax.swing.JPanel();
        lblMin1 = new javax.swing.JLabel();
        pnlCerrar = new javax.swing.JPanel();
        lblX = new javax.swing.JLabel();
        txtTtDepositos = new javax.swing.JTextField();
        lblWelcome = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblS = new javax.swing.JLabel();
        lblTg = new javax.swing.JLabel();
        txtTotalGanado = new javax.swing.JTextField();
        btnCalculo = new javax.swing.JButton();
        lblNdep = new javax.swing.JLabel();
        lblNpe = new javax.swing.JLabel();
        lblMe = new javax.swing.JLabel();
        lblPersonMas2 = new javax.swing.JLabel();
        txtNameMasPago = new javax.swing.JTextField();
        txtTtMndElec = new javax.swing.JTextField();
        txtTtEfectivo = new javax.swing.JTextField();
        lblLogo = new javax.swing.JLabel();
        lblS1 = new javax.swing.JLabel();
        lblS2 = new javax.swing.JLabel();
        lblS3 = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIniciarSss.setFont(new java.awt.Font("Century Gothic", 0, 23)); // NOI18N
        btnIniciarSss.setText("Volver a Iniciar Sesión");
        btnIniciarSss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSssActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciarSss, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 630, 280, 40));

        txaRegistros.setEditable(false);
        txaRegistros.setColumns(20);
        txaRegistros.setFont(new java.awt.Font("mononoki", 0, 14)); // NOI18N
        txaRegistros.setForeground(new java.awt.Color(0, 153, 153));
        txaRegistros.setRows(5);
        jScrollPane1.setViewportView(txaRegistros);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 830, 610));

        btnRegistro.setFont(new java.awt.Font("Century Gothic", 0, 23)); // NOI18N
        btnRegistro.setText("MOSTRAR REGISTRO");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 60, 280, 60));

        pnlMinimizar.setBackground(new java.awt.Color(33, 243, 112));

        lblMin1.setFont(new java.awt.Font("Roboto Light", 0, 48)); // NOI18N
        lblMin1.setForeground(new java.awt.Color(0, 0, 0));
        lblMin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMin1.setText("-");
        lblMin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMin1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMin1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMin1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlMinimizarLayout = new javax.swing.GroupLayout(pnlMinimizar);
        pnlMinimizar.setLayout(pnlMinimizarLayout);
        pnlMinimizarLayout.setHorizontalGroup(
            pnlMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMinimizarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblMin1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlMinimizarLayout.setVerticalGroup(
            pnlMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMinimizarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblMin1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(pnlMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 40));

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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblXMousePressed(evt);
            }
        });
        pnlCerrar.add(lblX, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        getContentPane().add(pnlCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        txtTtDepositos.setEditable(false);
        txtTtDepositos.setFont(new java.awt.Font("mononoki", 1, 24)); // NOI18N
        txtTtDepositos.setForeground(new java.awt.Color(0, 204, 0));
        txtTtDepositos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtTtDepositos, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 330, 220, 50));

        lblWelcome.setFont(new java.awt.Font("Fira Code Light", 0, 48)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(64, 245, 111));
        lblWelcome.setText("Bienvenido Ing.Marlon");
        getContentPane().add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 640, 60));

        lblHora.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setText("HORA Y FECHA");
        getContentPane().add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 180, 60));

        lblS.setFont(new java.awt.Font("Fira Code Light", 3, 24)); // NOI18N
        lblS.setForeground(new java.awt.Color(255, 255, 255));
        lblS.setText("S/");
        getContentPane().add(lblS, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 330, 40, 50));

        lblTg.setFont(new java.awt.Font("Fira Code Medium", 2, 18)); // NOI18N
        lblTg.setForeground(new java.awt.Color(255, 255, 255));
        lblTg.setText("Total Ganado");
        getContentPane().add(lblTg, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 550, 140, -1));

        txtTotalGanado.setEditable(false);
        txtTotalGanado.setFont(new java.awt.Font("mononoki", 1, 24)); // NOI18N
        txtTotalGanado.setForeground(new java.awt.Color(0, 204, 0));
        txtTotalGanado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtTotalGanado, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 570, 220, 50));

        btnCalculo.setFont(new java.awt.Font("Century Gothic", 0, 23)); // NOI18N
        btnCalculo.setText("REALIZAR CÁLCULOS");
        btnCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, 280, 60));

        lblNdep.setFont(new java.awt.Font("Fira Code Medium", 2, 17)); // NOI18N
        lblNdep.setForeground(new java.awt.Color(255, 255, 255));
        lblNdep.setText("Total de pagos por depositos");
        getContentPane().add(lblNdep, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 310, 290, -1));

        lblNpe.setFont(new java.awt.Font("Fira Code Medium", 2, 17)); // NOI18N
        lblNpe.setForeground(new java.awt.Color(255, 255, 255));
        lblNpe.setText("Total de pagos por efectivo");
        getContentPane().add(lblNpe, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 390, 280, -1));

        lblMe.setFont(new java.awt.Font("Fira Code Medium", 2, 17)); // NOI18N
        lblMe.setForeground(new java.awt.Color(255, 255, 255));
        lblMe.setText("Total de pagos por mndr.Elc");
        getContentPane().add(lblMe, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 470, 280, -1));

        lblPersonMas2.setFont(new java.awt.Font("Fira Code Medium", 2, 17)); // NOI18N
        lblPersonMas2.setForeground(new java.awt.Color(255, 255, 255));
        lblPersonMas2.setText("Persona que más pagó :");
        getContentPane().add(lblPersonMas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 230, 270, -1));

        txtNameMasPago.setEditable(false);
        txtNameMasPago.setFont(new java.awt.Font("mononoki", 1, 14)); // NOI18N
        txtNameMasPago.setForeground(new java.awt.Color(0, 204, 0));
        txtNameMasPago.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtNameMasPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 250, 280, 50));

        txtTtMndElec.setEditable(false);
        txtTtMndElec.setFont(new java.awt.Font("mononoki", 1, 24)); // NOI18N
        txtTtMndElec.setForeground(new java.awt.Color(0, 204, 0));
        txtTtMndElec.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtTtMndElec, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 490, 220, 50));

        txtTtEfectivo.setEditable(false);
        txtTtEfectivo.setFont(new java.awt.Font("mononoki", 1, 24)); // NOI18N
        txtTtEfectivo.setForeground(new java.awt.Color(0, 204, 0));
        txtTtEfectivo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtTtEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 410, 220, 50));

        lblLogo.setText("fond");
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, -10, 80, 80));

        lblS1.setFont(new java.awt.Font("Fira Code Light", 3, 24)); // NOI18N
        lblS1.setForeground(new java.awt.Color(255, 255, 255));
        lblS1.setText("S/");
        getContentPane().add(lblS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 570, 40, 50));

        lblS2.setFont(new java.awt.Font("Fira Code Light", 3, 24)); // NOI18N
        lblS2.setForeground(new java.awt.Color(255, 255, 255));
        lblS2.setText("S/");
        getContentPane().add(lblS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 490, 40, 50));

        lblS3.setFont(new java.awt.Font("Fira Code Light", 3, 24)); // NOI18N
        lblS3.setForeground(new java.awt.Color(255, 255, 255));
        lblS3.setText("S/");
        getContentPane().add(lblS3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 410, 40, 50));

        btnBorrar.setFont(new java.awt.Font("Century Gothic", 0, 23)); // NOI18N
        btnBorrar.setText("EMPEZAR DE NUEVO");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 180, 280, 40));

        lblFondo.setText("fond");
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //EXTRAER DATOS
    void MostrarData() {
        String lineaa;
        int cont = 1;
        try {
            BufferedReader br = new BufferedReader(new FileReader("datos.txt"));

            while ((lineaa = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(lineaa, "||");

                String name = st.nextToken();
                String tipPag = st.nextToken();
                String salRuc = st.nextToken();
                String correO = st.nextToken();
                double prcTt = Double.parseDouble(st.nextToken());
                String fchHr = st.nextToken();

                txaRegistros.append(cont++ + "||" + name + "||" + tipPag + "||" + salRuc + "||"
                        + correO + "||S/" + prcTt + "||" + fchHr + "\n");
                txaRegistros.append("--------------------------------------------------------------------------------------------------------------------\n");

                //IDENTIFICAR TIPOS DE PAGOS
                switch (tipPag) {
                    case "DEPOSITAR":
                        depo += prcTt;
                        break;
                    case "EFECTIVO":
                        efect += prcTt;
                        break;
                    case "MONEDERO ELECTRÓNICA":
                        moEle += prcTt;
                }
                //SUMAR TODO LOS PAGOS
                totalGanado += prcTt;

                //IDENTIFICAR AL CLIENTE QUE PAGÓ MÁS
                if (prcTt > mayorPago) {
                    mayorPago = prcTt;
                    nameMayor = name;
                    guardarfila = cont - 1;

                }
            }

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error de lectura del archivo " + ex);
        } catch (IOException ex) {
            Logger.getLogger(frmGlobTecx.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void mostrarTiempo() {
        lblHora.setText(time.hourComplet);
    }

    private void btnIniciarSssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSssActionPerformed
        //VISUALIZAR EL FRAME MENUVENTAS
        new menuVentas().setVisible(true);

        //OCULTAR EL FRM ACTUAL (frmRegistro....)
        this.setVisible(false);
    }//GEN-LAST:event_btnIniciarSssActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        //DESAHABILITA EL BOTON REGISTRO
        btnRegistro.setEnabled(false);
        //FUNCION PARA MOSTRAR LOS DATOS
        MostrarData();
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void lblXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXMouseClicked
        //CERRAR PROGRAMA
        System.exit(0);
    }//GEN-LAST:event_lblXMouseClicked

    private void lblXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXMouseEntered
        pnlCerrar.setBackground(Color.red);
        lblX.setForeground(Color.white);
    }//GEN-LAST:event_lblXMouseEntered

    private void lblXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXMouseExited
        pnlCerrar.setBackground(Color.white);
        lblX.setForeground(Color.black);
    }//GEN-LAST:event_lblXMouseExited

    private void lblXMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXMousePressed

    }//GEN-LAST:event_lblXMousePressed

    private void lblMin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMin1MouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_lblMin1MouseClicked

    private void lblMin1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMin1MouseEntered
        pnlMinimizar.setBackground(new Color(107, 248, 160));
    }//GEN-LAST:event_lblMin1MouseEntered

    private void lblMin1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMin1MouseExited
        pnlMinimizar.setBackground(new Color(33, 243, 112));
    }//GEN-LAST:event_lblMin1MouseExited

    private void pnlCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCerrarMouseEntered
        pnlCerrar.setBackground(Color.red);
    }//GEN-LAST:event_pnlCerrarMouseEntered

    private void btnCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculoActionPerformed
        DecimalFormat df = new DecimalFormat("##.00");
        //PONER EL CALCULO DE LOS REGISTROS EN LOS TEXTFIELD
        txtTtDepositos.setText("" + depo);
        txtTtEfectivo.setText("" + efect);
        txtTtMndElec.setText("" + moEle);
        txtTotalGanado.setText("" + df.format(totalGanado));
        txtNameMasPago.setText(guardarfila + "||" + nameMayor);

        //DESAHABILITA EL BOTÓN CALCULO
        btnCalculo.setEnabled(false);

    }//GEN-LAST:event_btnCalculoActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        //BORRAR TODO PARA EMPEZAR DE NUEVO
        txtTotalGanado.setText("");
        txtTtDepositos.setText("");
        txtTtEfectivo.setText("");
        txtTtMndElec.setText("");
        txtNameMasPago.setText("");
        txaRegistros.setText("");
        totalGanado = 0.0;
        depo = 0.0;
        efect = 0.0;
        moEle = 0.0;
        nameMayor = "";
        mayorPago = -1.99;
        guardarfila = 0;

        //PONE VIZIBLE LOS BOTONES DE CALCULO Y REGISTRO
        btnCalculo.setEnabled(true);
        btnRegistro.setEnabled(true);
    }//GEN-LAST:event_btnBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(frmRegistroAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistroAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistroAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistroAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //MUESTRA EL FRM ACTUAL
                new frmRegistroAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCalculo;
    private javax.swing.JButton btnIniciarSss;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMe;
    private javax.swing.JLabel lblMin1;
    private javax.swing.JLabel lblNdep;
    private javax.swing.JLabel lblNpe;
    private javax.swing.JLabel lblPersonMas2;
    private javax.swing.JLabel lblS;
    private javax.swing.JLabel lblS1;
    private javax.swing.JLabel lblS2;
    private javax.swing.JLabel lblS3;
    private javax.swing.JLabel lblTg;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lblX;
    private javax.swing.JPanel pnlCerrar;
    private javax.swing.JPanel pnlMinimizar;
    private javax.swing.JTextArea txaRegistros;
    private javax.swing.JTextField txtNameMasPago;
    private javax.swing.JTextField txtTotalGanado;
    private javax.swing.JTextField txtTtDepositos;
    private javax.swing.JTextField txtTtEfectivo;
    private javax.swing.JTextField txtTtMndElec;
    // End of variables declaration//GEN-END:variables
}
