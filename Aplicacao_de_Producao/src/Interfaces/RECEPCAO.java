/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ismael Ribeiro
 */
public class RECEPCAO {

public double dia;//QUANTIDADE DE MÁQUINAS A SEREM FEITAS NO DIA ...
public String setor = "Recepção";//NOME DO SETOR

File dir = new File("C:\\PRODUCAO\\SETORES");

File arq = new File(dir,"RECEPCAO.txt");

public void Meta(){
    try {
        
        FileReader fileReader = new FileReader(arq);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        try {
            this.dia = Double.parseDouble(bufferedReader.readLine());
        } catch (IOException ex) {
            Logger.getLogger(ELETRONICA.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    } catch (FileNotFoundException ex) {
        Logger.getLogger(ELETRONICA.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
}
