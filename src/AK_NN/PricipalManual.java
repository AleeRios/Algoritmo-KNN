/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AK_NN;

import javax.swing.JOptionPane;
import java.util.*;

public class PricipalManual extends javax.swing.JFrame {
    private int rojo=0, azul=0, verde=0, rosa=0, naranja=0, n;
    private Object[][] rojos, azules, verdes, rosas, naranjas;

    public PricipalManual() {
        initComponents();
        super.setVisible(true);
        bloquearCaillas();
    }
    
    public void bloquearCaillas(){
        txtX1.setEditable(false);
        txtY1.setEditable(false);
        txtX2.setEditable(false);
        txtY2.setEditable(false);
        txtX3.setEditable(false);
        txtY3.setEditable(false);
        txtX4.setEditable(false);
        txtY4.setEditable(false);
        txtX5.setEditable(false);
        txtY5.setEditable(false);
    }
    
    public void desbloquearCasillas(int n){
        switch(n){
            case 2:
                txtX1.setEditable(true);
                txtY1.setEditable(true);
                txtX2.setEditable(true);
                txtY2.setEditable(true);
            break;
            case 3:
                txtX1.setEditable(true);
                txtY1.setEditable(true);
                txtX2.setEditable(true);
                txtY2.setEditable(true);
                txtX3.setEditable(true);
                txtY3.setEditable(true);
            break;
            case 4:
                txtX1.setEditable(true);
                txtY1.setEditable(true);
                txtX2.setEditable(true);
                txtY2.setEditable(true);
                txtX3.setEditable(true);
                txtY3.setEditable(true);
                txtX4.setEditable(true);
                txtY4.setEditable(true);
            break;
            case 5:
                txtX1.setEditable(true);
                txtY1.setEditable(true);
                txtX2.setEditable(true);
                txtY2.setEditable(true);
                txtX3.setEditable(true);
                txtY3.setEditable(true);
                txtX4.setEditable(true);
                txtY4.setEditable(true);
                txtX5.setEditable(true);
                txtY5.setEditable(true);
            break;
            default:
                JOptionPane.showMessageDialog(null,"Ocurrio un error");
            break;
        }
    }
    
    public void ingresarDatos(int n){
        switch(n){
            case 2:
                double x1 = Double.parseDouble(txtX1.getText());
                double y1 = Double.parseDouble(txtY1.getText());
                double x2 = Double.parseDouble(txtX2.getText());
                double y2 = Double.parseDouble(txtY2.getText());
                rojos = actualizarColor(rojos, x1, y1, "Rojo");
                rojo++;
                txtN1.setText(Integer.toString(rojo));
                azules = actualizarColor(azules, x2, y2, "Azul");
                azul++;
                txtN2.setText(Integer.toString(azul));
            break;
            case 3:
                double x11 = Double.parseDouble(txtX1.getText());
                double y11 = Double.parseDouble(txtY1.getText());
                double x22 = Double.parseDouble(txtX2.getText());
                double y22 = Double.parseDouble(txtY2.getText());
                double x3 = Double.parseDouble(txtX3.getText());
                double y3 = Double.parseDouble(txtY3.getText());
                rojos = actualizarColor(rojos, x11, y11, "Rojo");
                rojo++;
                txtN1.setText(Integer.toString(rojo));
                azules = actualizarColor(azules, x22, y22, "Azul");
                azul++;
                txtN2.setText(Integer.toString(azul));
                verdes = actualizarColor(verdes, x3, y3, "Verde");
                verde++;
                txtN3.setText(Integer.toString(verde));
            break;
            case 4:
                double x111 = Double.parseDouble(txtX1.getText());
                double y111 = Double.parseDouble(txtY1.getText());
                double x222 = Double.parseDouble(txtX2.getText());
                double y222 = Double.parseDouble(txtY2.getText());
                double x33 = Double.parseDouble(txtX3.getText());
                double y33 = Double.parseDouble(txtY3.getText());
                double x4 = Double.parseDouble(txtX4.getText());
                double y4 = Double.parseDouble(txtY4.getText());
                rojos = actualizarColor(rojos, x111, y111, "Rojo");
                rojo++;
                txtN1.setText(Integer.toString(rojo));
                azules = actualizarColor(azules, x222, y222, "Azul");
                azul++;
                txtN2.setText(Integer.toString(azul));
                verdes = actualizarColor(verdes, x33, y33, "Verde");
                verde++;
                txtN3.setText(Integer.toString(verde));
                rosas = actualizarColor(rosas,x4, y4,"Rosa");
                rosa++;
                txtN4.setText(Integer.toString(rosa));
            break;
            case 5:
                double x1111 = Double.parseDouble(txtX1.getText());
                double y1111 = Double.parseDouble(txtY1.getText());
                double x2222 = Double.parseDouble(txtX2.getText());
                double y2222 = Double.parseDouble(txtY2.getText());
                double x333 = Double.parseDouble(txtX3.getText());
                double y333 = Double.parseDouble(txtY3.getText());
                double x44 = Double.parseDouble(txtX4.getText());
                double y44 = Double.parseDouble(txtY4.getText());
                double x5 = Double.parseDouble(txtX5.getText());
                double y5 = Double.parseDouble(txtY5.getText());
                rojos = actualizarColor(rojos, x1111, y1111, "Rojo");
                rojo++;
                txtN1.setText(Integer.toString(rojo));
                azules = actualizarColor(azules, x2222, y2222, "Azul");
                azul++;
                txtN2.setText(Integer.toString(azul));
                verdes = actualizarColor(verdes, x333, y333, "Verde");
                verde++;
                txtN3.setText(Integer.toString(verde));
                rosas = actualizarColor(rosas,x44, y44,"Rosa");
                rosa++;
                txtN4.setText(Integer.toString(rosa));
                naranjas = actualizarColor(naranjas,x5, y5,"Naranja");
                naranja++;
                txtN5.setText(Integer.toString(naranja));
                break;
            default:
            break;
        }
    }
    
    public Object[][] juntarClases(int nC){
        if(nC == 2){
            Object[][] con = new Object[rojos.length + azules.length][3];
            System.arraycopy(rojos, 0, con, 0, rojos.length);
            System.arraycopy(azules, 0, con, rojos.length, azules.length);
            return con;
        }else if(nC == 3){
            Object[][] con = new Object[rojos.length + azules.length + verdes.length][3];
            System.arraycopy(rojos, 0, con, 0, rojos.length);
            System.arraycopy(azules, 0, con, rojos.length, azules.length);
            System.arraycopy(verdes,0 ,con ,azules.length + rojos.length, verdes.length);
            return con;
        }else if(nC == 4){
            Object[][] con = new Object[rojos.length + azules.length + verdes.length + rosas.length][3];
            System.arraycopy(rojos, 0, con, 0, rojos.length);
            System.arraycopy(azules, 0, con, rojos.length, azules.length);
            System.arraycopy(verdes,0 ,con ,azules.length + rojos.length, verdes.length);
            System.arraycopy(rosas,0 ,con ,verdes.length + rojos.length + azules.length, rosas.length);
            return con;
        }else if(nC == 5){
            Object[][] con = new Object[rojos.length + azules.length + verdes.length + rosas.length + naranjas.length][3];
            System.arraycopy(rojos, 0, con, 0, rojos.length);
            System.arraycopy(azules, 0, con, rojos.length, azules.length);
            System.arraycopy(verdes,0 ,con ,azules.length + rojos.length, verdes.length);
            System.arraycopy(rosas,0 ,con ,verdes.length + azules.length + rojos.length, rosas.length);
            System.arraycopy(naranjas,0 ,con ,rosas.length + verdes.length + azules.length + rojos.length, naranjas.length);
            return con;
        }else
            return null;
    }
    
    public Object[][] actualizarColor(Object[][] color,double v1, double v2, String c){
        if(color == null){
            Object[][] aux = {{v1,v2,c}};
            return aux;
        }else
            return agregarColor(color, v1, v2,c);
        
    }
    
    public Object[][] agregarColor(Object[][] arr, double v1, double v2, String c){
        Object[][] aux = new Object[arr.length+1][3];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                aux[i][j] = arr[i][j];
            }
        }
        aux[aux.length-1][0] = v1;
        aux[aux.length-1][1] = v2;
        aux[aux.length-1][2] = c;
        return aux;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtX1 = new javax.swing.JTextField();
        btnSiguiente = new javax.swing.JButton();
        txtx = new javax.swing.JLabel();
        txtY1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtX2 = new javax.swing.JTextField();
        txtY2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtN1 = new javax.swing.JLabel();
        txtN2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtN3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtX3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtY3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtN4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtX4 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtY4 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtN5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtX5 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtY5 = new javax.swing.JTextField();
        btnClases = new javax.swing.JButton();
        btnG3 = new javax.swing.JButton();
        pnl1 = new javax.swing.JPanel();
        txtT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));

        jLabel1.setText("Numero de clases (min: 2, max: 5): ");

        txtNC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNCActionPerformed(evt);
            }
        });

        jLabel2.setText("Clase 1 (min: 1, max: 100):");

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        txtx.setText("X:");

        jLabel4.setText("Y:");

        jLabel5.setText("Clase 2 (min: 1, max: 100):");

        jLabel6.setText("X:");

        jLabel7.setText("Y:");

        txtN1.setText("0");

        txtN2.setText("0");

        jLabel10.setText("Clase 3 (min: 1, max: 100):");

        txtN3.setText("0");

        jLabel12.setText("X:");

        jLabel13.setText("Y:");

        jLabel14.setText("Clase 4 (min: 1, max: 100):");

        txtN4.setText("0");

        jLabel16.setText("X:");

        jLabel17.setText("Y:");

        jLabel18.setText("Clase 5 (min: 1, max: 100):");

        txtN5.setText("0");

        jLabel20.setText("X:");

        jLabel21.setText("Y:");

        btnClases.setText("Guardar");
        btnClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClasesActionPerformed(evt);
            }
        });

        btnG3.setText("Guardar");
        btnG3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txtN3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtX3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(txtN5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtX5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(txtN4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtX4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtN1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtx))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtN2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNC, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtX2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtX1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel21)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addComponent(btnSiguiente)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnG3)
                            .addComponent(txtY1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtY2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtY3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtY4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtY5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClases))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClases))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtx)
                    .addComponent(txtY1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtN1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtY2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtN2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtX3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtY3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtN3)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtX4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtN4)
                    .addComponent(jLabel17)
                    .addComponent(txtY4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtX5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txtY5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(txtN5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguiente)
                    .addComponent(btnG3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl1.setBackground(new java.awt.Color(255, 204, 153));

        txtT.setText("Algoritmo KNN");
        txtT.setMinimumSize(new java.awt.Dimension(82, 40));
        txtT.setPreferredSize(new java.awt.Dimension(82, 40));
        pnl1.add(txtT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNCActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed

        Object[][] j = juntarClases(n);
        System.out.print(Arrays.deepToString(j));
        new Plano(j);
        this.dispose();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClasesActionPerformed
       n = Integer.parseInt(txtNC.getText());
       desbloquearCasillas(n);
    }//GEN-LAST:event_btnClasesActionPerformed

    private void btnG3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG3ActionPerformed
        int n = Integer.parseInt(txtNC.getText());
        ingresarDatos(n);
        //Object[][] j = juntarClases(n);
        //System.out.print(Arrays.deepToString(j));
    }//GEN-LAST:event_btnG3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClases;
    private javax.swing.JButton btnG3;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnl1;
    private javax.swing.JLabel txtN1;
    private javax.swing.JLabel txtN2;
    private javax.swing.JLabel txtN3;
    private javax.swing.JLabel txtN4;
    private javax.swing.JLabel txtN5;
    private javax.swing.JTextField txtNC;
    private javax.swing.JLabel txtT;
    private javax.swing.JTextField txtX1;
    private javax.swing.JTextField txtX2;
    private javax.swing.JTextField txtX3;
    private javax.swing.JTextField txtX4;
    private javax.swing.JTextField txtX5;
    private javax.swing.JTextField txtY1;
    private javax.swing.JTextField txtY2;
    private javax.swing.JTextField txtY3;
    private javax.swing.JTextField txtY4;
    private javax.swing.JTextField txtY5;
    private javax.swing.JLabel txtx;
    // End of variables declaration//GEN-END:variables
}
