package Vista;
//SEBASTIAN SUAREZ BURGOS
import Modelo.cls_movimientos;
import Modelo.cls_productos;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frm_Inventario extends javax.swing.JFrame {
    LinkedList<cls_productos> List_productosLst = new LinkedList<>();
    LinkedList<cls_movimientos> List_movimientosLst = new LinkedList<>();//unica instancia
    
    boolean var_swBln = false;
    int var_posInt = 0;
    int var_swmessageInt = 0;
    /**
     * Creates new form frm_Inventario
     */
    public frm_Inventario() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_cantidad2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbx_tipo2 = new javax.swing.JComboBox<>();
        btn_cancelar = new javax.swing.JButton();
        btn_guardar2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_entradaSalida = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_precio = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_especificaciones = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        txt_existencias = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cbx_tipo = new javax.swing.JComboBox<>();
        btn_guardar = new javax.swing.JButton();
        btn_consultar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_nuevo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btn_generarReporte = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_productos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORMULARIO CONTROL DE INVENTARIO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(jLabel1)
                .addContainerGap(343, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1091, -1));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Entrada / Salida", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 51, 51))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Cantidad:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 41, -1, -1));

        txt_cantidad2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_cantidad2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cantidad2KeyTyped(evt);
            }
        });
        jPanel2.add(txt_cantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 38, 381, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Tipo:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 73, -1, -1));

        cbx_tipo2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbx_tipo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entrada", "Salida" }));
        jPanel2.add(cbx_tipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 381, -1));

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Cancel.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 120, -1));

        btn_guardar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/diskette.png"))); // NOI18N
        btn_guardar2.setText("Registrar");
        btn_guardar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_guardar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 120, -1));

        tbl_entradaSalida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Tipo", "Cantidad", "Stock Final"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_entradaSalida);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 500, 170));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 44, 530, 340));

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 51, 51))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Código:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 41, -1, -1));

        txt_codigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codigoKeyTyped(evt);
            }
        });
        jPanel3.add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 38, 381, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Nombre:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 73, -1, -1));

        txt_nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel3.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 70, 381, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Especificaciones:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 102, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Precio:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 197, -1, -1));

        txt_precio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_precioKeyTyped(evt);
            }
        });
        jPanel3.add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 194, 381, -1));

        txt_especificaciones.setColumns(20);
        txt_especificaciones.setForeground(new java.awt.Color(153, 153, 255));
        txt_especificaciones.setLineWrap(true);
        txt_especificaciones.setRows(5);
        txt_especificaciones.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txt_especificaciones);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 102, 381, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Existencias:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 229, -1, -1));

        txt_existencias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_existencias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_existenciasKeyTyped(evt);
            }
        });
        jPanel3.add(txt_existencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 226, 381, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Tipo:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 258, -1, -1));

        cbx_tipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbx_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alimentos", "Ferretería", "Tecnología", "Hogar" }));
        cbx_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_tipoActionPerformed(evt);
            }
        });
        jPanel3.add(cbx_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 258, 381, -1));

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/diskette.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 290, 120, -1));

        btn_consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/search.png"))); // NOI18N
        btn_consultar.setText("Consultar");
        btn_consultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 290, 120, -1));

        btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/updated.png"))); // NOI18N
        btn_actualizar.setText("Actualizar");
        btn_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 290, 120, -1));

        btn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/edit.png"))); // NOI18N
        btn_nuevo.setText("Nuevo");
        btn_nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });
        jPanel3.add(btn_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 290, 120, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 44, 520, 340));

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Generar Reporte", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 51, 51))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_generarReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Report.png"))); // NOI18N
        btn_generarReporte.setText("Generar Reporte");
        btn_generarReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_generarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarReporteActionPerformed(evt);
            }
        });
        jPanel4.add(btn_generarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 210, -1));

        tbl_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Precio", "Existencias", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbl_productos);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1040, 210));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 1070, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
       
        if(txt_codigo.getText().length()!=0 && txt_nombre.getText().length()!=0&&txt_especificaciones.getText().length()!=0&&txt_precio.getText().length()!=0&&txt_existencias.getText().length()!=0)
     {
         
             fnt_actualizar(
                txt_nombre.getText(),
                txt_especificaciones.getText(), 
                Float.parseFloat(txt_precio.getText()), 
                (String) cbx_tipo.getSelectedItem(), 
                Integer.parseInt(txt_existencias.getText()));

       
    }//GEN-LAST:event_btn_actualizarActionPerformed
    else{
         JOptionPane.showMessageDialog(null, "Error, todos los campos deben estar diligenciados.");
     }
    }
    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
    
       if(txt_codigo.getText().length()!=0)
       {
            var_swmessageInt = 0;
             fnt_consultar(Integer.parseInt(txt_codigo.getText()));
       }else{
           JOptionPane.showMessageDialog(null, "Error, digita un código.");
       }
      
    }//GEN-LAST:event_btn_consultarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
     if(txt_codigo.getText().length()!=0 && txt_nombre.getText().length()!=0&&txt_especificaciones.getText().length()!=0&&txt_precio.getText().length()!=0&&txt_existencias.getText().length()!=0)
     {
       fnt_guardar((txt_codigo.getText()),
                txt_nombre.getText(),
                txt_especificaciones.getText(), 
                Float.parseFloat(txt_precio.getText()), 
                (String) cbx_tipo.getSelectedItem(), 
                Integer.parseInt(txt_existencias.getText())); 
        
       
     }else{
         JOptionPane.showMessageDialog(null, "Error, todos los campos deben estar diligenciados.");
     }
        
    }//GEN-LAST:event_btn_guardarActionPerformed
     
private static boolean fnt_validarnombre(String nombre) {
       return nombre.matches("^([A-Z]+[ ]?){1,20}$");
}

private static boolean fnt_validaridentidicacion(String numero) {
        return numero.matches("[0-9]{5}");
}
private static boolean fnt_especificaciones(String especificaciones) {
        return especificaciones.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
}
    
       
    
    private void fnt_nuevo()
    {
        txt_codigo.setText("");
        txt_nombre.setText("");
        txt_especificaciones.setText("");
        txt_precio.setText("");
        txt_existencias.setText("");
        txt_cantidad2.setText("");
        cbx_tipo.setSelectedIndex(0);
        cbx_tipo2.setSelectedIndex(0);
        txt_codigo.requestFocusInWindow();
    }
    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        fnt_nuevo();
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void txt_codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyTyped
          char caracter = evt.getKeyChar();
        // Validar solo números
        if (!Character.isDigit(caracter)) {
                evt.consume();
        }
        // Validar la cantidad máxima de caracteres
         if (txt_codigo.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_codigoKeyTyped

    private void txt_existenciasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_existenciasKeyTyped
          char caracter = evt.getKeyChar();
        // Validar solo números
        if (!Character.isDigit(caracter)) {
                evt.consume();
        }
        // Validar la cantidad máxima de caracteres
         if (txt_existencias.getText().length() >= 6) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_existenciasKeyTyped

    private void txt_precioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_precioKeyTyped
          char caracter = evt.getKeyChar();
        // Validar solo números
        if (!Character.isDigit(caracter)) {
                evt.consume();
        }
        // Validar la cantidad máxima de caracteres
         if (txt_precio.getText().length() >= 11) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_precioKeyTyped

    private void txt_cantidad2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cantidad2KeyTyped
           char caracter = evt.getKeyChar();
        // Validar solo números
        if (!Character.isDigit(caracter)) {
                evt.consume();
        }
        // Validar la cantidad máxima de caracteres
         if (txt_cantidad2.getText().length() >= 11) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_cantidad2KeyTyped
    private void fnt_registrarmovimiento()
    {
        if(cbx_tipo2.getSelectedIndex() == 0)//entrada
        {
            var_swmessageInt=1; 
            fnt_consultar(Integer.parseInt(txt_codigo.getText())); 
            if(var_swBln == true)
            {                  
                
                
            
                int cantidadactualizada = List_productosLst.get(var_posInt).getVar_existenciasInt();
                cantidadactualizada = cantidadactualizada +Integer.parseInt( txt_cantidad2.getText());
                if(cantidadactualizada>0)
                {
                     List_movimientosLst.add(new cls_movimientos(
                (txt_codigo.getText()), txt_nombre.getText(),
                cbx_tipo2.getSelectedIndex(), 
                Integer.parseInt(txt_cantidad2.getText()),cantidadactualizada));
                List_productosLst.get(var_posInt).setVar_existenciasInt(cantidadactualizada);
                fnt_consultar(Integer.parseInt(txt_codigo.getText())); 
                JOptionPane.showMessageDialog(null, txt_cantidad2.getText()+" unidades registradas a el producto "+txt_nombre.getText()+" con éxito");
                fnt_actualizardato();
         
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Ingrese un valor mayor a 0");
                }
              
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error, El producto con el codigo "+txt_codigo.getText()+" no existe");
            }
        }
        if(cbx_tipo2.getSelectedIndex()==1)//salida
        {
            var_swmessageInt=1; 
            fnt_consultar(Integer.parseInt(txt_codigo.getText())); 
            if(var_swBln == true)
            {                  
                
                 
                int cantidadoriginal = List_productosLst.get(var_posInt).getVar_existenciasInt();
                int cantidadactualizada = List_productosLst.get(var_posInt).getVar_existenciasInt();
                cantidadactualizada = cantidadactualizada - Integer.parseInt( txt_cantidad2.getText());
                if(cantidadactualizada>=0)
                {
                    List_movimientosLst.add(new cls_movimientos(
                    (txt_codigo.getText()), txt_nombre.getText(),
                    cbx_tipo2.getSelectedIndex(), 
                    Integer.parseInt(txt_cantidad2.getText()),cantidadactualizada));
                    List_productosLst.get(var_posInt).setVar_existenciasInt(cantidadactualizada);
                    fnt_consultar(Integer.parseInt(txt_codigo.getText())); 
                    JOptionPane.showMessageDialog(null, txt_cantidad2.getText()+" unidades retiradas del producto "+txt_nombre.getText()+" con éxito");
                    fnt_actualizardato();
             
                }
                if(cantidadactualizada<0)
                {
                     JOptionPane.showMessageDialog(null, "La cantidad "+txt_cantidad2.getText()+" es mayor a la cantidad actual de "+txt_nombre.getText()+" que es : "+cantidadoriginal);
                }
                if(cantidadactualizada==0)
                {
                    JOptionPane.showMessageDialog(null, " El producto "+txt_nombre.getText()+" ahora tiene 0 unidades en stock");
                }
             
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error, El producto con el codigo "+txt_codigo.getText()+" no existe");
            }
        }
    }
    
    private void fnt_actualizardato(){
            txt_existencias.setText(""+List_productosLst.get(var_posInt).getVar_existenciasInt());
   
    }
    private void fnt_generarreportemovimiento()
    {
        DefaultTableModel model = (DefaultTableModel) tbl_entradaSalida.getModel();
        model.setRowCount(0);
        String var_codigoInt;
        String var_nombreStr;
        String var_tipoStr="";
        int var_cantidadInt;
        int var_stockfinalInt;
        for(int i=0;i<List_movimientosLst.size();i++)
        {
            var_codigoInt = List_movimientosLst.get(i).getVar_codigoInt();
            var_nombreStr = List_movimientosLst.get(i).getVar_nombreStr();
            if(List_movimientosLst.get(i).getVar_tipoInt()==0)//entrada
            {
                var_tipoStr = "Entrada";
            }
            if(List_movimientosLst.get(i).getVar_tipoInt()==1)//salida
            {
                var_tipoStr = "Salida";
            }
            var_cantidadInt = List_movimientosLst.get(i).getVar_cantidadInt();
            var_stockfinalInt= List_movimientosLst.get(i).getVar_stockfinalInt();
            model.addRow(new Object[]{var_codigoInt, var_nombreStr,var_tipoStr, var_cantidadInt, var_stockfinalInt});
        } 
    }
    private void btn_guardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar2ActionPerformed
       if(txt_cantidad2.getText().length()!=0 && txt_codigo.getText().length()!=0)
       {
           fnt_registrarmovimiento();
           fnt_generarreportemovimiento();
       }
       else{
           JOptionPane.showMessageDialog(null, "Error, el campo de código y/o cantidad están vacios");
       }
        
    }//GEN-LAST:event_btn_guardar2ActionPerformed
    
    private void fnt_cancelar()
    {
        txt_cantidad2.setText("");
        cbx_tipo2.setSelectedIndex(0);
        txt_cantidad2.requestFocusInWindow();
    }
    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        fnt_cancelar();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_generarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarReporteActionPerformed
       fnt_generarreporteproductos();
    }//GEN-LAST:event_btn_generarReporteActionPerformed

    private void cbx_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_tipoActionPerformed
    
     private void fnt_generarreporteproductos()
    {
     
           DefaultTableModel model = (DefaultTableModel) tbl_productos.getModel();
        model.setRowCount(0);
        String var_codigoInt;
        String var_nombreStr;
        float var_precioFlt;
        String var_TipoStr;
        int var_existenciasInt;
        
        for(int i=0;i< List_productosLst.size();i++)
        {
            var_codigoInt = List_productosLst.get(i).getVar_codigoStr();
            var_nombreStr = List_productosLst.get(i).getVar_nombreStr();
            var_precioFlt = List_productosLst.get(i).getVar_precioFlt();
             var_existenciasInt= List_productosLst.get(i).getVar_existenciasInt();
            var_TipoStr = List_productosLst.get(i).getVar_TipoStr(); 
           
            model.addRow(new Object[]{var_codigoInt, var_nombreStr,var_precioFlt, var_existenciasInt,var_TipoStr});
        } 
        
      
    }
    private void fnt_guardar(
        String codigo, 
        String nombre, 
        String especificaciones, 
        float precio, 
        String var_TipoStr, 
        int existencias){
        var_swmessageInt=1;
        fnt_consultar(Integer.parseInt(txt_codigo.getText()));
        if(var_swBln == false)
        {
               List_productosLst.add(new cls_productos(
                codigo, 
                nombre, 
                especificaciones, 
                precio, 
                var_TipoStr, 
                existencias));
        JOptionPane.showMessageDialog(null, 
                "El producto "+txt_nombre.getText()+" fue registrado con éxito");
        
        
         List<String> errores = new ArrayList<>();
        if (fnt_validaridentidicacion(codigo) == false) {
                errores.add("Codigo");
        }
        if (fnt_validarnombre(nombre) == false) {
                errores.add("Nombre");
        }
        if (fnt_especificaciones(especificaciones) == false) {
                errores.add("Especificaciones");
        }
        if (errores.isEmpty() == false) {
                String mensajeError = "Se encontraron algunos \nerrores:\n" + String.join("\n", errores);
                JOptionPane.showMessageDialog(null, mensajeError);
                return;
        }

    // List_productosLst.add(new cls_productos( codigo,nombre,precio,var_especificaciones));

   
        }else{
              JOptionPane.showMessageDialog(null, 
                "Error, El producto con el codigo "+txt_codigo.getText()+" ya existe");
     
        }
  
    }
    private void fnt_consultar(int codigo){
       var_swBln = false;
       var_posInt = 0;
      
        if(var_swBln == false){
            if(var_swmessageInt!=1)
            {
                  JOptionPane.showMessageDialog(null, 
                    "No se encontraron registros con el codigo "+txt_codigo.getText());
            }
          
        }else{
            if(var_swmessageInt!=1)
            {
                  JOptionPane.showMessageDialog(null, 
                    "Producto encontrado con éxito ");
           
            txt_especificaciones.setText(
                    List_productosLst.get(var_posInt).getVar_especificacionesStr());
            txt_nombre.setText(List_productosLst.get(var_posInt).getVar_nombreStr());
            txt_existencias.setText(
                    ""+List_productosLst.get(var_posInt).getVar_existenciasInt());
            txt_precio.setText(""+List_productosLst.get(var_posInt).getVar_precioFlt());
            cbx_tipo.setSelectedItem(
                    List_productosLst.get(var_posInt).getVar_TipoStr());
            }
             
        }
    }    
    
    private void fnt_actualizar( 
        String var_nombreStr, 
        String var_especificacionesStr, 
        float var_precioFlt, 
        String var_TipoStr, 
        int var_existenciasInt){
         var_swmessageInt=1; 
          fnt_consultar(Integer.parseInt(txt_codigo.getText()));
         
        if(var_swBln == true)
        {
        
        
        
        List_productosLst.get(var_posInt).setVar_TipoStr(var_TipoStr);
        List_productosLst.get(var_posInt).setVar_especificacionesStr(var_especificacionesStr);
        List_productosLst.get(var_posInt).setVar_existenciasInt(var_existenciasInt);
        List_productosLst.get(var_posInt).setVar_nombreStr(var_nombreStr);
        List_productosLst.get(var_posInt).setVar_precioFlt(var_precioFlt);
        JOptionPane.showMessageDialog(null, "El producto"+txt_nombre.getText()+" fue actualizado con éxito");
      }else
        {
             JOptionPane.showMessageDialog(null, 
                "Error, El producto con el codigo "+txt_codigo.getText()+" no existe");
        }
    }
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
            java.util.logging.Logger.getLogger(frm_Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_generarReporte;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_guardar2;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JComboBox<String> cbx_tipo;
    private javax.swing.JComboBox<String> cbx_tipo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbl_entradaSalida;
    private javax.swing.JTable tbl_productos;
    private javax.swing.JTextField txt_cantidad2;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextArea txt_especificaciones;
    private javax.swing.JTextField txt_existencias;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_precio;
    // End of variables declaration//GEN-END:variables
}
