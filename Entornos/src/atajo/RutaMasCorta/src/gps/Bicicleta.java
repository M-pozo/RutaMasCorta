package atajo.RutaMasCorta.src.gps;

/**
 * Bicicleta class
 * 
 * @Java IES Severo Ochoa
 * @2.0
 */

public class Bicicleta {
    public Bicicleta(){
        int ruedas = 4;
        boolean luces = false;
        String marca = "Orbea";
    }
    
    public static String rutaCorta(int [] camino1, int [] camino2, int [] camino3)
    {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        sum1 = sumarArray(camino1);
        sum2 = sumarArray(camino2);
        sum3 = sumarArray(camino3);

        
        if(sum1 < sum2 && sum1 < sum3) {
            return "camino 1"; 
        }else if(sum2 < sum3 && sum2 < sum1) {
            return "camino 2";
        }else if(sum3 < sum1 && sum3 < sum2) {
            return "camino 3";
        }else{
            if(sum1 == sum2 && sum2 == sum3) {
                return "camino 1, 2 y 3";
            }else if(sum1 == sum3) {
                return "caminos 1 y 3";
            }else if(sum2 == sum3){
                return "caminos 2 y 3";
            }else{
                return "caminos 1 y 2";
            }
        }
    }
    public static int sumarArray(int[] camino){
        int sum = 0;
        for (int i = 0; i < camino.length; i++) {
            sum += camino[i];
        }
        return sum;
    }


    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta();
        int[] camino1 = {12,34,21,46,25,200};
        int[] camino2 = {12,34,21,46,25,200};
        int[] camino3 = {1,5,6,7,8,10,20,46,104,200};
        System.out.println("El camino más corto es: "+Bicicleta.rutaCorta(camino1,camino2,camino3)+".");
    }
}

