/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenaescaleras5000;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class OrdenaEscaleras5000 {
    
    public static int OrdenaEscaleras5000(ArrayList<Integer> escaleras){
        switch (escaleras.size()){
            case 0: return 0;
            case 1: return 0;
            case 2: return escaleras.get(0) + escaleras.get(1);
            default:
                int i, j, tnueva;
                int aux;
                boolean ord = false;

                //ordenamos por burbuja
                i = 0;
                while ((i < escaleras.size()) && (!ord)){
                    i = i+1;
                    ord = true;

                    for (j = 0; j < (escaleras.size()-i); j++){
                        if(escaleras.get(j) > escaleras.get(j+1)){//------------------ > para menor a mayor
                            ord = false;
                            aux = escaleras.get(j);
                            escaleras.set(j, escaleras.get(j+1));
                            escaleras.set(j+1, aux);
                        }
                    }
                }
                
                tnueva = escaleras.get(0) + escaleras.get(1);
                escaleras.remove(0); escaleras.remove(0);
                escaleras.add(tnueva);
                
                return tnueva + OrdenaEscaleras5000(escaleras);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> escaleras = new ArrayList<>();
        escaleras.add(1);
        escaleras.add(5);
        escaleras.add(7);
        escaleras.add(2);
        escaleras.add(3);
        escaleras.add(4);
        
        System.out.println(OrdenaEscaleras5000(escaleras));
    }
    
}
