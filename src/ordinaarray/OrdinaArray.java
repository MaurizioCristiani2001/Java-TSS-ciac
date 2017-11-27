/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordinaarray;

/**
 *
 * @author tss
 */
public class OrdinaArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int [] numeri1 = { 15, 2, 20, 7, 0,10 };
       int comodo=0;
       int j=0;
       int posizione; 
       
   
       
        for (int i = 0; i< numeri1.length; i++) {
         
            
            for (int k= i+1 ; k < numeri1.length; k++) {
                if (numeri1 [k] < numeri1[i]){
              
                comodo = numeri1[i];
                numeri1[i] = numeri1[k];
                numeri1[k] =comodo;
                }
                
            }
            
        
        }
         System.out.println("==========Esempio  for  ==========="); 
        
          for (int i = 0; i < numeri1.length; i++) {
             System.out.println(numeri1[i]);            
        }
     
  //**********************
  
  boolean scambiato =  true;
   int [] numeri = { 15, 2, 20, 7, 0,10 };
        while (scambiato == true) {
            scambiato=false;
            int index =0;
            while (index < numeri.length -1) {
                if  (numeri[index] > numeri[index +1]) {
                    int tmp = numeri[index];
                    numeri[index]= numeri[index+1];
                    numeri[index+1]= tmp;        
                    scambiato =true;
                        
                    }
                index++;
            }
            
        }
  
           System.out.println("==========Esempio  while  ==========="); 
        
          for (int i = 0; i < numeri.length; i++) {
                
             System.out.println(numeri[i]);            
        } 
        
        
        
        
        
        
      
             
       
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
