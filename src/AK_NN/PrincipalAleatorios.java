package AK_NN;

import javax.swing.*;
import java.util.*;

public class PrincipalAleatorios extends JFrame {

    public PrincipalAleatorios() {
        
        initComponents();
        super.setVisible(true);
    }
    
    public Object[][] generarRojos(int nM){
        Object[][] rojos = new Object[nM][3];
        
        for(int i=0; i<nM; i++){
            double x = Math.random() * (2-1)+1;
            double y = Math.random() * (2-1)+1;;
            rojos[i][0] = x;
            rojos[i][1] = y;
            rojos[i][2] = "Rojo";
        }
        return rojos;
    }
    
    public Object[][] generarAzules(int nM){
        Object[][] azules = new Object[nM][3];
        
        for(int i=0; i<nM; i++){
            double x = Math.random() * (4-3)+3;
            double y = Math.random() * (4-3)+3;
            azules[i][0] = x;
            azules[i][1] = y;
            azules[i][2] = "Azul";
        }
        return azules;
    }
    
    public Object[][] generarVerdes(int nM){
        Object[][] verdes = new Object[nM][3];
        
        for(int i=0; i<nM; i++){
            double x = Math.random() * (6-5)+5;
            double y = Math.random() * (6-5)+5;
            verdes[i][0] = x;
            verdes[i][1] = y;
            verdes[i][2] = "Verde";
        }
        return verdes;
    }
    
    public Object[][] generarRosa(int nM){
        Object[][] rosa = new Object[nM][3];
        
        for(int i=0; i<nM; i++){
            double x = Math.random() * (8-7)+7;
            double y = Math.random() * (8-7)+7;
            rosa[i][0] = x;
            rosa[i][1] = y;
            rosa[i][2] = "Rosa";
        }
        return rosa;
    }
    
    public Object[][] generarNaranja(int nM){
        Object[][] naranja = new Object[nM][3];
        
        for(int i=0; i<nM; i++){
            double x = Math.random() * (10-9)+9;
            double y = Math.random() * (10-9)+9;
            naranja[i][0] = x;
            naranja[i][1] = y;
            naranja[i][2] = "Naranja";
        }
        return naranja;
    }
    
    public Object[][] juntarClases(int nC, int nM){
        if(nC == 2){
            Object[][] rojo = generarRojos(nM);
            Object[][] azul = generarAzules(nM);
            Object[][] con = new Object[nM*2][3];
            System.arraycopy(rojo, 0, con, 0, rojo.length);
            System.arraycopy(azul, 0, con, rojo.length, azul.length);
            return con;
        }else if(nC == 3){
            Object[][] rojo = generarRojos(nM);
            Object[][] azul = generarAzules(nM);
            Object[][] verde = generarVerdes(nM);
            Object[][] con = new Object[nM*3][3];
            System.arraycopy(rojo, 0, con, 0, rojo.length);
            System.arraycopy(azul, 0, con, rojo.length, azul.length);
            System.arraycopy(verde,0 ,con ,azul.length*2, verde.length);
            return con;
        }else if(nC == 4){
            Object[][] rojo = generarRojos(nM);
            Object[][] azul = generarAzules(nM);
            Object[][] verde = generarVerdes(nM);
            Object[][] rosa = generarRosa(nM);
            Object[][] con = new Object[nM*4][3];
            System.arraycopy(rojo, 0, con, 0, rojo.length);
            System.arraycopy(azul, 0, con, rojo.length, azul.length);
            System.arraycopy(verde,0 ,con ,azul.length*2, verde.length);
            System.arraycopy(rosa,0 ,con ,verde.length*3, rosa.length);
            return con;
        }else if(nC == 5){
            Object[][] rojo = generarRojos(nM);
            Object[][] azul = generarAzules(nM);
            Object[][] verde = generarVerdes(nM);
            Object[][] rosa = generarRosa(nM);
            Object[][] naranja = generarNaranja(nM);
            Object[][] con = new Object[nM*5][3];
            System.arraycopy(rojo, 0, con, 0, rojo.length);
            System.arraycopy(azul, 0, con, rojo.length, azul.length);
            System.arraycopy(verde,0 ,con ,azul.length*2, verde.length);
            System.arraycopy(rosa,0 ,con ,verde.length*3, rosa.length);
            System.arraycopy(naranja,0 ,con ,rosa.length*4, naranja.length);
            return con;
        }else
            return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl1 = new javax.swing.JPanel();
        txtT = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNM = new javax.swing.JTextField();
        btnSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl1.setBackground(new java.awt.Color(255, 204, 153));

        txtT.setText("Algoritmo KNN");
        txtT.setMinimumSize(new java.awt.Dimension(82, 40));
        txtT.setPreferredSize(new java.awt.Dimension(82, 40));
        pnl1.add(txtT);

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));

        jLabel1.setText("Numero de clases (min: 2, max: 5): ");

        txtNC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNCActionPerformed(evt);
            }
        });

        jLabel2.setText("Numero de muestras por clase:");

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSiguiente)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNC, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNM, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSiguiente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        Object[][] xyC = juntarClases(Integer.parseInt(txtNC.getText()),Integer.parseInt(txtNM.getText()));
        new Plano(xyC);
        this.dispose();
    }//GEN-LAST:event_btnSiguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnl1;
    private javax.swing.JTextField txtNC;
    private javax.swing.JTextField txtNM;
    private javax.swing.JLabel txtT;
    // End of variables declaration//GEN-END:variables
}
