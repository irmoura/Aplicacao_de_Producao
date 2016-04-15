/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Mael
 */
public class Classe_de_Teste {
    
    public static void main(String args[]){
        
        Calendar calendario = Calendar.getInstance();

        int dia_do_mes = calendario.get(Calendar.DAY_OF_MONTH);
        int dia_do_ano = calendario.get(Calendar.DAY_OF_YEAR);
        int mes = calendario.get(Calendar.MONTH);
        //mes += 1;
        
        JOptionPane.showMessageDialog(null,""+mes);
        
    }
    
}
