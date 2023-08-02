package AK_NN;

import java.util.Arrays;

public class A_KNN {
    private Object[][] xyC;
    private int k;
    private Object[][] dis = null;
    
    public A_KNN(Object[][] xyC, int k){
        this.xyC = xyC;
        this.k = k;
    }
    
    public Object[][] getXYC(){
        return this.xyC;
    }

    public double distancia(double xi, double xj, double yi, double yj){
        return Math.sqrt(Math.pow(xj-xi, 2) + Math.pow(yj-yi,2));
    }
    
    public Object[][] agregarDistancia(Object[][] dist, double xi, double xj, double yi, double yj, String c){
        double d;
        if(dist == null){
            d = distancia(xi, xj, yi, yj);
            Object[][] aux = {{d,c}};
            return aux;
        }else{
            Object[][] aux = new Object[dist.length+1][dist[0].length];
            for(int i=0; i<dist.length; i++)
                for(int j=0; j<dist[0].length; j++)
                    aux[i][j] = dist[i][j];
            //d = distancia(xi, xj, yi, yj);
            aux[aux.length-1][0] = distancia(xi, xj, yi, yj);
            aux[aux.length-1][1] = c;
            return aux;
        }
    }
    
    public void calculaDistancias(double xi, double yi){
        for(int i=0; i<xyC.length; i++){
            double xj = (double)xyC[i][0];
            double yj = (double)xyC[i][1];
            String c = (String)xyC[i][2];
            dis = agregarDistancia(dis, xi, xj, yi, yj, c);
        }
        System.out.println(Arrays.deepToString(dis));
    }
    
    public double[] disMenores(){
        double[] aux = new double[dis.length];
        for(int i=0; i<dis.length; i++){
            aux[i] = (double)dis[i][0];
        }
        Arrays.sort(aux);
        return Arrays.copyOfRange(aux, 0, k);
    }
    
    public String identificarClase(){
        String[] c = new String[k];
        double[] menores = disMenores();
        System.out.println(Arrays.toString(menores));
        for(int i=0; i<dis.length; i++){
            for(int j=0; j<menores.length; j++){
                double d = (double)dis[i][0];
                if(menores[j] == d){
                   c[j] = (String)dis[i][1]; 
                }
            }
        }
        System.out.println(Arrays.toString(c));
        return moda(c);
    }
    
    public String moda(String[] arr){
        int azul = 0, verde = 0, rojo = 0, rosa = 0, naranja = 0, n = 0;
        for(int i=0; i<arr.length; i++){
            switch(arr[i]){
                case "Azul" -> azul++;
                case "Verde" -> verde++;
                case "Rojo" -> rojo++;
                case "Rosa" -> rosa++;
                case "Naranja" -> naranja++;
                default -> n++;
            }
        }

        if(azul > verde && azul > rojo && azul > rosa && azul > naranja)
            return "Azul";
        else if(verde > azul && verde > rojo && verde > rosa && verde > naranja)
            return "Verde";
        else if(rojo > verde && rojo > azul && rojo > rosa && rojo > naranja)
            return "Rojo";
        else if(rosa > verde && rosa > azul && rosa > rojo && rosa > naranja)
            return "Rosa";
        else 
            return "Naranja";
    }
}