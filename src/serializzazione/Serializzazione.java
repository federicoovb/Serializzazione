/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author violaboros.federico
 */
public class Serializzazione {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        Studente s = new Studente("Andrea", "Forestiero", 22);
        
        try { 
            FileOutputStream FO = new FileOutputStream("C:\\Users\\violaboros.federico\\Documents\\NetBeansProjects\\Serializzazione\\src\\serializzazione\\test.ser");
            ObjectOutputStream OS = new ObjectOutputStream(FO);  
            OS.writeObject(s);
//            OS.writeObject(9);
//            OS.writeObject("hey");
//            OS.writeObject(false);
//            OS.writeObject('t');
            OS.flush();                
            OS.close();
            FO.close();
            
            FileInputStream FI = new FileInputStream("C:\\Users\\violaboros.federico\\Documents\\NetBeansProjects\\Serializzazione\\src\\serializzazione\\test.ser");
            ObjectInputStream IS = new ObjectInputStream(FI);
            Studente v1 = (Studente) IS.readObject();
            System.out.println("v1--> "+v1.toString());
//            int v1 = (int) IS.readObject();
//            System.out.println("v1: " + v1);
//            String v2 = (String) IS.readObject();
//            System.out.println("v2: " + v2);
//            float v3 = (float) (double) IS.readObject();
//            System.out.println("v3: " + v3);
            
        } catch (FileNotFoundException ex) {
            System.out.println("Impossibile trovare il file");
        } catch (IOException ex) {
            System.out.println("Hai rotto Java");
        }        
    }
    
}
