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
 * @author Mael
 */
public class LOJA {
    public String loja = "";//DEFINE O TITULO DA JANELA PRINCIPAL
    
    File dir = new File(TELA_PRINCIPAL.letra+":\\PRODUCAO");
    File arq = new File(dir,"LOJA.txt");
    
    public void Titulo_Loja(){
        
        try {
            FileReader fileReader = new FileReader(arq);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            try {
                this.loja = bufferedReader.readLine();
            } catch (IOException ex) {
                Logger.getLogger(LOJA.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LOJA.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
