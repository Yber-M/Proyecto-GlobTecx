/**
 * @author Yb.M
 */
package proyectFrmClass;

//librerias
import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;

public class frmGlobTecx extends javax.swing.JFrame {

    registro rgt;

    Icon modificar, modificar2;

    fechaHora prinTime = new fechaHora();
    DefaultTableModel tableUtiles;
    ArrayList<pdrUtiles> proAlmac = new ArrayList<>();
    int xMouse, yMouse;
    DefaultListModel lstPro = new DefaultListModel();
    DefaultListModel lstCan = new DefaultListModel();
    DefaultListModel lstVar = new DefaultListModel();
    String[][] data = {};
    String[] cabecera = {"N°", "Producto", "Cantidad", "P.Unitario"};
    int contProductos;
    String ruc = "No Se Indicó El R.U.C";

    public frmGlobTecx() {
        initComponents();
        this.setLocationRelativeTo(null);
        TmCeldas();
        modificar = new ImageIcon("src/imagenes/qrYape.jpg");
        modificar2 = new ImageIcon("src/imagenes/bancaria.png");
        lstCant.setEnabled(false);
        lstProductos.setModel(lstPro);
        lstCant.setModel(lstCan);
        lstVariantes.setModel(lstVar);
        tableUtiles = new DefaultTableModel(data, cabecera);
        tblFactura.setModel(tableUtiles);
        contProductos = 0;
        rsscalelabel.RSScaleLabel.setScaleLabel(lblPngFond, "F:\\2do Ciclo\\proyecGlobTecx\\src\\imagenes\\bigSurOpacoOSCURO.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblLogo, "F:\\2do Ciclo\\proyecGlobTecx\\src\\imagenes\\4.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblEfectivo, "F:\\2do Ciclo\\proyecGlobTecx\\src\\imagenes\\efectivo.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblYape, "F:\\2do Ciclo\\proyecGlobTecx\\src\\imagenes\\yape.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblBCP, "F:\\2do Ciclo\\proyecGlobTecx\\src\\imagenes\\bcp.png");
    }

    void cleanInput() {

        txtApellidos.setText("");
        txtName.setText("");
        txtCorrElectr.setText("");
        txtSalidaName.setText("");
        txtIGV.setText("");
        txtSalidaRUC.setText("");
        txtMetPago.setText("");
        txtSubtotal.setText("");
        cbxMetPago.setSelectedIndex(0);
        cbxProductos.setSelectedIndex(0);
        txtTotal.setText("");
        EliminarTabla();
        cleanList();
        txtFechaHora.setText("");
        txtName.requestFocus();

    }

    void TmCeldas() {

        TableColumn column = null;
        //ANCHO        
        column = tblFactura.getColumnModel().getColumn(0);
        column.setPreferredWidth(30);

        column = tblFactura.getColumnModel().getColumn(1);
        column.setPreferredWidth(180);

        column = tblFactura.getColumnModel().getColumn(2);
        column.setPreferredWidth(30);

        column = tblFactura.getColumnModel().getColumn(3);
        column.setPreferredWidth(30);

        //ALTO
        tblFactura.setRowHeight(30);

    }

    public void mostrarTiempo() {

        txtFechaHora.setText(prinTime.hourComplet);

    }

    void EliminarTabla() {
        int fila = tableUtiles.getRowCount();
        for (int i = fila - 1; i >= 0; i--) {
            tableUtiles.removeRow(i);
        }
    }

    void GuardarData(registro rgt) {

        String name = txtSalidaName.getText();
        String tipPag = txtMetPago.getText();
        String salRuc = txtSalidaRUC.getText();
        String correO = txtCorrElectr.getText();
        double prcTt = Double.parseDouble(txtTotal.getText());
        String fchHr = txtFechaHora.getText();

        try {
            PrintWriter pw = new PrintWriter(new FileWriter("datos.txt", true));
            pw.println(name + "||" + tipPag + "||" + salRuc + "||"
                    + correO + "||" + prcTt + "||" + fchHr);

            pw.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error en la grabación " + ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstCant = new javax.swing.JList<>();
        lblBCP = new javax.swing.JLabel();
        lblYape = new javax.swing.JLabel();
        lblEfectivo = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtSalidaRUC = new javax.swing.JTextField();
        txtMetPago = new javax.swing.JTextField();
        txtSalidaName = new javax.swing.JTextField();
        txtSubtotal = new javax.swing.JTextField();
        lblSubTotal = new javax.swing.JLabel();
        txtIGV = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtFechaHora = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnBorrarList = new javax.swing.JButton();
        pnlMinimizar = new javax.swing.JPanel();
        lblMin = new javax.swing.JLabel();
        pnlExit = new javax.swing.JPanel();
        lblX = new javax.swing.JLabel();
        pnlDatosComprador = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        btnEmpresa = new javax.swing.JButton();
        txtCorrElectr = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbxMetPago = new javax.swing.JComboBox<>();
        btnGrabarBoleta = new javax.swing.JButton();
        pnlCarritoCompras = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnEliminarObjList = new javax.swing.JButton();
        cbxProductos = new javax.swing.JComboBox<>();
        txtCant = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstVariantes = new javax.swing.JList<>();
        btnMostrarVariantes = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFactura = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstProductos = new javax.swing.JList<>();
        btnImprimirBoleta = new javax.swing.JButton();
        btnIniciarSesion = new javax.swing.JButton();
        btnNuevoCliente = new javax.swing.JButton();
        btnEliminarTbl = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        lblPngFond = new javax.swing.JLabel();
        pnlBarraForMove = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lstCant.setFont(new java.awt.Font("mononoki", 3, 14)); // NOI18N
        lstCant.setForeground(new java.awt.Color(51, 204, 0));
        lstCant.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstCant);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 20, 40, 270));

        lblBCP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBCP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBCPMouseClicked(evt);
            }
        });
        getContentPane().add(lblBCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 450, 200, 90));

        lblYape.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblYape.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblYapeMouseClicked(evt);
            }
        });
        getContentPane().add(lblYape, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 330, 90, 90));

        lblEfectivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEfectivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEfectivoMouseClicked(evt);
            }
        });
        getContentPane().add(lblEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 330, 90, 90));

        jLabel12.setFont(new java.awt.Font("Fira Code Medium", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("S/");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 610, -1, 30));

        jLabel13.setFont(new java.awt.Font("Fira Code Medium", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("S/");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 640, -1, 30));

        jLabel4.setFont(new java.awt.Font("Fira Code Medium", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre y Apellidos del Cliente:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel11.setFont(new java.awt.Font("Fira Code Medium", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("S/");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 580, 30, 30));

        jLabel5.setFont(new java.awt.Font("Fira Code Medium", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo De Pago");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 120, -1));

        jLabel6.setFont(new java.awt.Font("Fira Code Medium", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha y Hora");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 420, 120, -1));

        jLabel14.setFont(new java.awt.Font("Fira Code Medium", 3, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("R.U.C");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 350, 60, -1));

        txtSalidaRUC.setFont(new java.awt.Font("mononoki", 3, 18)); // NOI18N
        txtSalidaRUC.setForeground(new java.awt.Color(0, 204, 204));
        txtSalidaRUC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtSalidaRUC, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 370, 250, 40));

        txtMetPago.setEditable(false);
        txtMetPago.setFont(new java.awt.Font("mononoki", 3, 18)); // NOI18N
        txtMetPago.setForeground(new java.awt.Color(204, 0, 204));
        txtMetPago.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtMetPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 250, 40));

        txtSalidaName.setEditable(false);
        txtSalidaName.setFont(new java.awt.Font("mononoki", 3, 18)); // NOI18N
        txtSalidaName.setForeground(new java.awt.Color(0, 204, 204));
        txtSalidaName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtSalidaName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 480, 40));

        txtSubtotal.setEditable(false);
        txtSubtotal.setFont(new java.awt.Font("mononoki", 3, 14)); // NOI18N
        txtSubtotal.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(txtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 580, 130, 30));

        lblSubTotal.setFont(new java.awt.Font("Fira Code Medium", 1, 12)); // NOI18N
        lblSubTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblSubTotal.setText("SUBTOTAL");
        getContentPane().add(lblSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 580, 60, 40));

        txtIGV.setEditable(false);
        txtIGV.setFont(new java.awt.Font("mononoki", 3, 14)); // NOI18N
        txtIGV.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(txtIGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 610, 130, 30));

        jLabel2.setFont(new java.awt.Font("Fira Code Medium", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("I.G.V. 18%");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 610, 80, 30));

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("mononoki", 3, 14)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(0, 204, 0));
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 640, 130, 30));

        txtFechaHora.setEditable(false);
        txtFechaHora.setFont(new java.awt.Font("mononoki", 1, 18)); // NOI18N
        txtFechaHora.setForeground(new java.awt.Color(0, 204, 204));
        txtFechaHora.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtFechaHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, 250, 40));

        jLabel3.setFont(new java.awt.Font("Fira Code Medium", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TOTAL ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 640, 50, 30));

        btnBorrarList.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        btnBorrarList.setText("BORRAR TODO");
        btnBorrarList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarListActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrarList, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 290, 240, 30));

        pnlMinimizar.setBackground(new java.awt.Color(33, 243, 112));

        lblMin.setFont(new java.awt.Font("mononoki", 0, 24)); // NOI18N
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
            .addGroup(pnlMinimizarLayout.createSequentialGroup()
                .addComponent(lblMin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlMinimizarLayout.setVerticalGroup(
            pnlMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMinimizarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblMin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(pnlMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, 30, 30));

        pnlExit.setBackground(new java.awt.Color(255, 255, 255));
        pnlExit.setForeground(new java.awt.Color(255, 255, 255));
        pnlExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlExitMouseExited(evt);
            }
        });
        pnlExit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblX.setFont(new java.awt.Font("mononoki", 0, 24)); // NOI18N
        lblX.setForeground(new java.awt.Color(0, 0, 0));
        lblX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblX.setText("X");
        lblX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlExit.add(lblX, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        getContentPane().add(pnlExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 0, 30, 30));

        pnlDatosComprador.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Comprador"));
        pnlDatosComprador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.setFont(new java.awt.Font("mononoki", 1, 15)); // NOI18N
        txtName.setForeground(new java.awt.Color(0, 102, 255));
        txtName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pnlDatosComprador.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 240, 38));

        txtApellidos.setFont(new java.awt.Font("mononoki", 1, 15)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(0, 102, 255));
        txtApellidos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pnlDatosComprador.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 240, 38));

        btnEmpresa.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnEmpresa.setText("INSERTAR R.U.C");
        btnEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpresaActionPerformed(evt);
            }
        });
        pnlDatosComprador.add(btnEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 130, 30));

        txtCorrElectr.setFont(new java.awt.Font("mononoki", 1, 15)); // NOI18N
        txtCorrElectr.setForeground(new java.awt.Color(0, 102, 255));
        txtCorrElectr.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pnlDatosComprador.add(txtCorrElectr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 240, 39));

        jLabel7.setFont(new java.awt.Font("Fira Code Medium", 2, 14)); // NOI18N
        jLabel7.setText("Nombres");
        pnlDatosComprador.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 84, -1));

        jLabel8.setFont(new java.awt.Font("Fira Code Medium", 2, 14)); // NOI18N
        jLabel8.setText("Apellidos");
        pnlDatosComprador.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 89, -1));

        jLabel9.setFont(new java.awt.Font("Fira Code Medium", 2, 14)); // NOI18N
        jLabel9.setText("Correo Electrónico");
        pnlDatosComprador.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 178, -1));

        cbxMetPago.setFont(new java.awt.Font("mononoki", 1, 13)); // NOI18N
        cbxMetPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----- Método de Pago -----", "EFECTIVO", "DEPÓSITO", "MONEDERO ELECTRÓNICA" }));
        pnlDatosComprador.add(cbxMetPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 240, 30));

        getContentPane().add(pnlDatosComprador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 260, 300));

        btnGrabarBoleta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnGrabarBoleta.setText("GRABAR BOLETA");
        btnGrabarBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarBoletaActionPerformed(evt);
            }
        });
        getContentPane().add(btnGrabarBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 220, 160, 50));

        pnlCarritoCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Productos"));
        pnlCarritoCompras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Fira Code Medium", 2, 14)); // NOI18N
        jLabel1.setText("Cantidad");
        pnlCarritoCompras.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 80, -1));

        btnRegistrar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        pnlCarritoCompras.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 140, 50));

        btnEliminarObjList.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnEliminarObjList.setText("ELIMINAR");
        btnEliminarObjList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarObjListActionPerformed(evt);
            }
        });
        pnlCarritoCompras.add(btnEliminarObjList, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 140, 50));

        cbxProductos.setFont(new java.awt.Font("mononoki", 1, 14)); // NOI18N
        cbxProductos.setForeground(new java.awt.Color(102, 204, 0));
        cbxProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- SELECCIONE UN PRODUCTO ---", "Lapiz", "Lapicero", "Colores", "Plumones", "Hoja", "Cuadernos", "Mochila", "Cartuchera", "Portafolio" }));
        cbxProductos.setBorder(null);
        pnlCarritoCompras.add(cbxProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 290, 40));

        txtCant.setFont(new java.awt.Font("mononoki", 1, 20)); // NOI18N
        txtCant.setForeground(new java.awt.Color(0, 153, 0));
        txtCant.setText("0");
        txtCant.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtCant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCantMousePressed(evt);
            }
        });
        pnlCarritoCompras.add(txtCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 80, 40));

        lstVariantes.setFont(new java.awt.Font("mononoki", 3, 17)); // NOI18N
        lstVariantes.setForeground(new java.awt.Color(51, 204, 0));
        lstVariantes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(lstVariantes);

        pnlCarritoCompras.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 270, 130));

        btnMostrarVariantes.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnMostrarVariantes.setText("MOSTRAR VARIANTES");
        btnMostrarVariantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarVariantesActionPerformed(evt);
            }
        });
        pnlCarritoCompras.add(btnMostrarVariantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 180, 30));

        jLabel10.setFont(new java.awt.Font("Fira Code Medium", 2, 14)); // NOI18N
        jLabel10.setText("Productos");
        pnlCarritoCompras.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 84, -1));

        getContentPane().add(pnlCarritoCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 480, 300));

        tblFactura.setFont(new java.awt.Font("mononoki", 3, 18)); // NOI18N
        tblFactura.setForeground(new java.awt.Color(0, 102, 102));
        tblFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblFactura);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 710, 250));

        lstProductos.setFont(new java.awt.Font("mononoki", 3, 14)); // NOI18N
        lstProductos.setForeground(new java.awt.Color(51, 204, 0));
        lstProductos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(lstProductos);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 200, 270));

        btnImprimirBoleta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnImprimirBoleta.setText("CALCULAR BOLETA");
        btnImprimirBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirBoletaActionPerformed(evt);
            }
        });
        getContentPane().add(btnImprimirBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 270, 160, 50));

        btnIniciarSesion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnIniciarSesion.setText("Volver a Iniciar Sesión");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 620, 220, 50));

        btnNuevoCliente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnNuevoCliente.setText("NUEVO CLIENTE");
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 550, 220, 60));

        btnEliminarTbl.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnEliminarTbl.setText("ELIMINAR DE LA TABLA");
        btnEliminarTbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTblActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarTbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 490, 230, 40));

        lblLogo.setText("LOGO");
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, 220, 230));

        lblPngFond.setText("imgFond");
        lblPngFond.setOpaque(true);
        getContentPane().add(lblPngFond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 690));

        pnlBarraForMove.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlBarraForMoveMouseDragged(evt);
            }
        });
        pnlBarraForMove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlBarraForMoveMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlBarraForMoveLayout = new javax.swing.GroupLayout(pnlBarraForMove);
        pnlBarraForMove.setLayout(pnlBarraForMoveLayout);
        pnlBarraForMoveLayout.setHorizontalGroup(
            pnlBarraForMoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1220, Short.MAX_VALUE)
        );
        pnlBarraForMoveLayout.setVerticalGroup(
            pnlBarraForMoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(pnlBarraForMove, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlBarraForMoveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBarraForMoveMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_pnlBarraForMoveMousePressed

    private void pnlBarraForMoveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBarraForMoveMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_pnlBarraForMoveMouseDragged

    private void pnlExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_pnlExitMouseClicked

    private void pnlExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlExitMouseEntered
        pnlExit.setBackground(Color.red);
        lblX.setForeground(Color.white);
    }//GEN-LAST:event_pnlExitMouseEntered

    private void pnlExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlExitMouseExited
        pnlExit.setBackground(Color.white);
        lblX.setForeground(Color.black);
    }//GEN-LAST:event_pnlExitMouseExited

    private void lblMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_lblMinMouseClicked

    private void btnEliminarObjListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarObjListActionPerformed
        deletLst();
        contProductos--;
    }//GEN-LAST:event_btnEliminarObjListActionPerformed

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        if (tblFactura.equals("")) {
        } else {

            GuardarData(rgt);

        }
        cleanInput();
    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        contProductos++;
        if (Integer.parseInt(txtCant.getText()) == 0
                || "--- SELECCIONE UN PRODUCTO ---".equals(cbxProductos.getSelectedItem().toString())
                || "----- Método de Pago -----".equals(cbxMetPago.getSelectedItem().toString())
                || "".equals(txtCorrElectr.getText()) || "".equals(txtName.getText())
                || "".equals(txtApellidos.getText())) {
            JOptionPane.showMessageDialog(null, "Verifique que los datos no sean nulos y vuelva a intentarlo",
                    "ERROR AL INGRESAR LOS DATOS DE COMPRA", JOptionPane.ERROR_MESSAGE);
        } else {
            agregarLst();

            cbxProductos.setSelectedIndex(0);

            lstVar.removeAllElements();

            txtCant.setText("");
        }
        txtCant.setText("0");
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnGrabarBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarBoletaActionPerformed
        if ("----- Método de Pago -----".equals(cbxMetPago.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(null, "Verifique que los datos no sean nulos y vuelva a intentarlo",
                    "ERROR AL INGRESAR LOS DATOS DE COMPRA", JOptionPane.ERROR_MESSAGE);
        } else {

            for (int i = 0; i < proAlmac.size(); i++) {
                tableUtiles.removeRow(i);
            }
            mostrarTiempo();
            String name = txtName.getText();
            String apell = txtApellidos.getText();
            String correo = txtCorrElectr.getText();
            String pago = cbxMetPago.getSelectedItem().toString();
            String util = lstProductos.getSelectedValue();
            int cant = lstProductos.getSelectedIndex();

            txtSalidaName.setText(name + " " + apell);
            cbxMetPago.setSelectedItem(pago);
            txtMetPago.setText(pago);
            txtSalidaRUC.setText(ruc);

            ValirdAR(util);
            proAlmac.forEach(proAl -> {
                Object[] fila = {proAl.posicion, proAl.producto, proAl.cant, proAl.$Uni};
                tableUtiles.addRow(fila);
            });

            proAlmac.removeAll(proAlmac);

            cleanList();
        }
    }//GEN-LAST:event_btnGrabarBoletaActionPerformed

    public void ValirdAR(String produc) {
        for (int i = 0; i < lstPro.size(); i++) {
            int dataCant = Integer.parseInt(lstCan.getElementAt(i).toString());
            if (lstPro.getElementAt(i).toString().substring(0, 5).equals("Lapiz")) {
                proAlmac.add(new hjsLapiz(i + 1, lstPro.getElementAt(i).toString(), dataCant));

            } else if (lstPro.getElementAt(i).toString().substring(0, 8).equals("Lapicero")) {
                proAlmac.add(new hjsLapicero(i + 1, lstPro.getElementAt(i).toString(), dataCant));

            } else if (lstPro.getElementAt(i).toString().substring(0, 7).equals("Colores")) {
                proAlmac.add(new hjsColores(i + 1, lstPro.getElementAt(i).toString(), dataCant));

            } else if (lstPro.getElementAt(i).toString().substring(0, 8).equals("Plumones")) {
                proAlmac.add(new hjsPlumones(i + 1, lstPro.getElementAt(i).toString(), dataCant));

            } else if (lstPro.getElementAt(i).toString().substring(0, 4).equals("Hoja")) {
                proAlmac.add(new hjsHojas(i + 1, lstPro.getElementAt(i).toString(), dataCant));

            } else if (lstPro.getElementAt(i).toString().substring(0, 7).equals("Mochila")) {
                proAlmac.add(new hjsMochila(i + 1, lstPro.getElementAt(i).toString(), dataCant));

            } else if (lstPro.getElementAt(i).toString().substring(0, 10).equals("Cartuchera")) {
                proAlmac.add(new hjsCartuchera(i + 1, lstPro.getElementAt(i).toString(), dataCant));

            } else if (lstPro.getElementAt(i).toString().substring(0, 10).equals("Portafolio")) {
                proAlmac.add(new hjsPortafolio(i + 1, lstPro.getElementAt(i).toString(), dataCant));

            } else if (lstPro.getElementAt(i).toString().substring(0, 8).equals("Cuadernos")) {
                proAlmac.add(new hjsCuaderno(i + 1, lstPro.getElementAt(i).toString(), dataCant));

            }
        }
    }

    private void btnBorrarListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarListActionPerformed
        cleanList();
    }//GEN-LAST:event_btnBorrarListActionPerformed

    private void btnImprimirBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirBoletaActionPerformed
        if (tblFactura.equals("")) {
            JOptionPane.showMessageDialog(null, "Verifique que los datos no sean nulos y vuelva a intentarlo",
                    "ERROR AL INGRESAR LOS DATOS DE COMPRA", JOptionPane.ERROR_MESSAGE);
        } else {

            DecimalFormat df = new DecimalFormat("##.00");

            double precioSubTotal = 0, precioIGV = 0;

            for (int i = 0; i < tblFactura.getRowCount(); i++) {
                precioSubTotal += Double.parseDouble(tableUtiles.getValueAt(i, 2).toString()) * Double.parseDouble(tableUtiles.getValueAt(i, 3).toString());

            }
            precioIGV = precioSubTotal * 0.18;

            txtSubtotal.setText("" + df.format(precioSubTotal));
            txtIGV.setText("" + df.format(precioIGV));

            txtTotal.setText(String.valueOf(df.format(precioSubTotal + precioIGV)));
        }
    }//GEN-LAST:event_btnImprimirBoletaActionPerformed

    private void txtCantMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantMousePressed
        txtCant.setText("");
    }//GEN-LAST:event_txtCantMousePressed

    private void btnMostrarVariantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarVariantesActionPerformed

        switch (cbxProductos.getSelectedItem().toString()) {

            case "Lapiz":
                ObtenerDatosProductos("lapiz.txt").forEach(produc -> {
                    lstVar.addElement(produc);
                });
                break;

            case "Lapicero":
                ObtenerDatosProductos("lapicero.txt").forEach(produc -> {
                    lstVar.addElement(produc);
                });
                break;

            case "Colores":
                ObtenerDatosProductos("colores.txt").forEach(produc -> {
                    lstVar.addElement(produc);
                });
                break;

            case "Plumones":
                ObtenerDatosProductos("plumones.txt").forEach(produc -> {
                    lstVar.addElement(produc);
                });
                break;

            case "Hoja":
                ObtenerDatosProductos("hojas.txt").forEach(produc -> {
                    lstVar.addElement(produc);
                });
                break;

            case "Mochila":
                ObtenerDatosProductos("mochilas.txt").forEach(produc -> {
                    lstVar.addElement(produc);
                });
                break;

            case "Cartuchera":
                ObtenerDatosProductos("cartucheras.txt").forEach(produc -> {
                    lstVar.addElement(produc);
                });
                break;

            case "Portafolio":
                ObtenerDatosProductos("portafolio.txt").forEach(produc -> {
                    lstVar.addElement(produc);
                });
                break;

            case "Cuadernos":
                ObtenerDatosProductos("cuadernos.txt").forEach(produc -> {
                    lstVar.addElement(produc);
                });
                break;

        }

    }//GEN-LAST:event_btnMostrarVariantesActionPerformed

    private void btnEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpresaActionPerformed
        ruc = JOptionPane.showInputDialog(null, "INGRESE EL RUC DE LA EMPRESA : ");
    }//GEN-LAST:event_btnEmpresaActionPerformed

    private void lblYapeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblYapeMouseClicked
        cbxMetPago.setSelectedIndex(3);
        txtMetPago.setText("MONEDERO ELECTRÓNICO");

        JOptionPane.showMessageDialog(null, "", "YAPEAR", JOptionPane.WARNING_MESSAGE, modificar);
    }//GEN-LAST:event_lblYapeMouseClicked

    private void lblBCPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBCPMouseClicked
        cbxMetPago.setSelectedIndex(2);
        txtMetPago.setText("DEPÓSITO");

        JOptionPane.showMessageDialog(null, "", "DEPOSITAR", JOptionPane.WARNING_MESSAGE, modificar2);
    }//GEN-LAST:event_lblBCPMouseClicked

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        new menuVentas().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnEliminarTblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTblActionPerformed
        if (tblFactura.getSelectedRowCount() != 1) {
            return;
        }

        int fill = tblFactura.getSelectedRow();
        tableUtiles.removeRow(fill);
    }//GEN-LAST:event_btnEliminarTblActionPerformed

    private void lblMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinMouseEntered
        pnlMinimizar.setBackground(new Color(107, 248, 160));
    }//GEN-LAST:event_lblMinMouseEntered

    private void lblMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinMouseExited
        pnlMinimizar.setBackground(new Color(33, 243, 112));
    }//GEN-LAST:event_lblMinMouseExited

    private void lblEfectivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEfectivoMouseClicked
        txtMetPago.setText("EFECTIVO");
        cbxMetPago.setSelectedIndex(1);
    }//GEN-LAST:event_lblEfectivoMouseClicked

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(frmGlobTecx.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmGlobTecx.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmGlobTecx.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmGlobTecx.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new menuVentas().setVisible(true);

            }
        });
    }

    public ArrayList<String> ObtenerDatosProductos(String fileName) {
        String line = "";
        ArrayList<String> produc = new ArrayList<>();

        try {
            BufferedReader bf = new BufferedReader(new FileReader(fileName));

            while ((line = bf.readLine()) != null) {
                produc.add(line);

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmGlobTecx.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {
            Logger.getLogger(frmGlobTecx.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        return produc;
    }

    public void cleanList() {
        lstCan.removeAllElements();
        lstPro.removeAllElements();
        lstVar.removeAllElements();
    }

    public void deletLst() {
        int cleanIndex = lstProductos.getSelectedIndex();
        lstPro.remove(cleanIndex);
        lstCan.remove(cleanIndex);
        if (proAlmac.size() > 0) {
            proAlmac.remove(cleanIndex);
        }
    }

    public void agregarLst() {
        lstPro.addElement(lstVariantes.getSelectedValue());
        lstCan.addElement(txtCant.getText());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarList;
    private javax.swing.JButton btnEliminarObjList;
    private javax.swing.JButton btnEliminarTbl;
    private javax.swing.JButton btnEmpresa;
    private javax.swing.JButton btnGrabarBoleta;
    private javax.swing.JButton btnImprimirBoleta;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnMostrarVariantes;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbxMetPago;
    private javax.swing.JComboBox<String> cbxProductos;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblBCP;
    private javax.swing.JLabel lblEfectivo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblPngFond;
    private javax.swing.JLabel lblSubTotal;
    private javax.swing.JLabel lblX;
    private javax.swing.JLabel lblYape;
    private javax.swing.JList<String> lstCant;
    private javax.swing.JList<String> lstProductos;
    private javax.swing.JList<String> lstVariantes;
    private javax.swing.JPanel pnlBarraForMove;
    private javax.swing.JPanel pnlCarritoCompras;
    private javax.swing.JPanel pnlDatosComprador;
    private javax.swing.JPanel pnlExit;
    private javax.swing.JPanel pnlMinimizar;
    private javax.swing.JTable tblFactura;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtCorrElectr;
    private javax.swing.JTextField txtFechaHora;
    private javax.swing.JTextField txtIGV;
    private javax.swing.JTextField txtMetPago;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSalidaName;
    private javax.swing.JTextField txtSalidaRUC;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
