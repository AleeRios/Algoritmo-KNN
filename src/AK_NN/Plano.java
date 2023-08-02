package AK_NN;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;
import org.math.plot.*;

public class Plano{
    private JFrame frame; 
    private double n1, n2;
    private JTextField txtX, txtY, txtK;
    private JLabel txtC;
    private JButton btnG, btnR;
    private Plot2DPanel plot = new Plot2DPanel();
    private A_KNN knn;
    private Object[][] xyC; 
    
    public Plano(){
        initComponents();
    }
    
    public Plano(Object[][] xyC){
        this.xyC = xyC;
        initComponents();
    }
    
    public JPanel panelSur(){
        JPanel pS = new JPanel();
        pS.add(new JLabel("X: "));
        pS.add(txtX);
        pS.add(new JLabel("Y: "));
        pS.add(txtY);
        pS.add(new JLabel("k: "));
        pS.add(txtK);
        pS.add(new JLabel("Clase: "));
        pS.add(txtC);
        pS.add(btnG);
        pS.add(btnR);
        return pS;
    }
    
    public JPanel panelPrincipal(){
        JPanel pPri = new JPanel();
        BorderLayout bl = new BorderLayout();
        pPri.setLayout(bl);
        pPri.add(plot, bl.CENTER);
        pPri.add(panelSur(), bl.SOUTH);
        return pPri;
    }
    
    private void btnGActionPerformed(ActionEvent ev){
        n1 = Double.parseDouble(txtX.getText());
        n2 = Double.parseDouble(txtY.getText());
        //double[][] xy = {{n1,n2}};
        //plot.addScatterPlot("", Color.BLACK, xy);
        if(txtK.getText().equals(""))
            knn = new A_KNN(xyC, 3);
        else
            knn = new A_KNN(xyC, Integer.parseInt(txtK.getText()));
        
        knn.calculaDistancias(n1, n2);
        String c = knn.identificarClase();
        System.out.println(c);
        txtC.setText(c);

        Object[][] arrXY = agregar(xyC, n1, n2, c);
        xyC = arrXY;
        
        plot.removeAllPlots();
        //System.out.println(Arrays.deepToString(xyC));
        idetificarColor(xyC);
    }
    
    private void btnRActionPermormed(ActionEvent ev){
        new Principal();
        frame.dispose();
    }
    
    public Object[][] agregar(Object[][] arr, double v1, double v2, String c){
        Object[][] aux = new Object[arr.length+1][arr[0].length];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                aux[i][j] = arr[i][j];
            }
        }
        aux[aux.length-1][0] = v1;
        aux[aux.length-1][1] = v2;
        aux[aux.length-1][2] = c;
        System.out.println(Arrays.deepToString(aux));
        return aux;
    }
    
    public double[][] agregarColor(double[][] arr, double v1, double v2){
        double[][] aux = new double[arr.length+1][arr[0].length];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                aux[i][j] = arr[i][j];
            }
        }
        aux[aux.length-1][0] = v1;
        aux[aux.length-1][1] = v2;
        return aux;
    }
    
    public double[][] actualizarColor(double[][] color,double v1, double v2){
        if(color == null){
            double[][] aux = {{v1,v2}};
            return aux;
        }else
            return agregarColor(color, v1, v2);
        
    }
    
    public void idetificarColor(Object[][] arr){
        double[][] rojo = null;
        double[][] azul = null;
        double[][] verde = null;
        double[][] rosa = null;
        double[][] naranja = null;
        for(int i=0; i<arr.length; i++){
            String s = (String)(arr[i][2]);
            //System.out.println(s);
            switch(s){
                case "Rojo":
                    double x = (double)arr[i][0];
                    double y = (double)arr[i][1];
                    rojo = actualizarColor(rojo, x, y);
                break;
                case "Azul": 
                    double x2 = (double)arr[i][0];
                    double y2 = (double)arr[i][1];
                    azul = actualizarColor(azul, x2, y2);
                break;
                case "Verde":
                    double x3 = (double)arr[i][0];
                    double y3 = (double)arr[i][1];
                    verde = actualizarColor(verde, x3, y3);
                break;
                case "Rosa":
                    double x4 = (double)arr[i][0];
                    double y4 = (double)arr[i][1];
                    rosa = actualizarColor(rosa, x4, y4);
                break;
                case "Naranja":
                    double x5 = (double)arr[i][0];
                    double y5 = (double)arr[i][1];
                    naranja = actualizarColor(naranja, x5, y5);
                break;
                default: 
                break;
            }
        }
        
        if(rojo != null)
            plot.addScatterPlot("",Color.red, rojo);
        else System.out.println("");
        
        if(azul != null)
            plot.addScatterPlot("",Color.blue, azul);
        else System.out.println("");
        
        if(verde != null)
            plot.addScatterPlot("",Color.green, verde);
        else System.out.println("");
        
        if(rosa != null)
            plot.addScatterPlot("",Color.pink, rosa);
        else System.out.println("");
        
        if(naranja != null)
            plot.addScatterPlot("", Color.orange, naranja);
        else System.out.println("");
        
        /*plot.addScatterPlot("",Color.red, rojo);
        plot.addScatterPlot("",Color.blue, azul);
        plot.addScatterPlot("",Color.green, verde);
        plot.addScatterPlot("",Color.pink, rosa);
        plot.addScatterPlot("", Color.orange, naranja);*/
    }
    
    public void initComponents(){
        txtX = new JTextField(10);
        txtY = new JTextField(10);
        txtK = new JTextField(10);
        txtC = new JLabel("");
        btnG = new JButton("Graficar");
        btnR = new JButton("Menu");
        
        idetificarColor(xyC);
        
        btnG.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ev){
                btnGActionPerformed(ev);
            }
        });
        
        btnR.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ev){
                btnRActionPermormed(ev);
            }
        });
        
        frame = new JFrame("Algoritmo KNN");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        frame.add(panelPrincipal());
        frame.setVisible(true);
    }
}