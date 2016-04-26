/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.io.IOException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mael
 */
public class Classe_de_Teste {
    
    public static void main(String args[]){
        
        /*Calendar calendario = Calendar.getInstance();

        int dia_do_mes = calendario.get(Calendar.DAY_OF_MONTH);
        int dia_do_ano = calendario.get(Calendar.DAY_OF_YEAR);
        int mes = calendario.get(Calendar.MONTH);
        //mes += 1;
        
        JOptionPane.showMessageDialog(null,""+dia_do_ano);*/
        
        for(int i = 1; i < 367; i++){
        
        java.io.File DATA_DA_PASTA = new java.io.File("C:\\PRODUCAO\\DATAS");
                
        java.io.File Horario = new java.io.File(DATA_DA_PASTA,""+i+".txt");
        
            try {
                Horario.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Classe_de_Teste.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
}
