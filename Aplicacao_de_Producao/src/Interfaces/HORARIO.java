/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import javax.swing.JOptionPane;

/**
 *
 * @author Mael
 */
public class HORARIO {
    
    int horacerta = 8;//recebe a hora que se deve chegar na loja
    
    public void horario(int hora,int minuto,int hora_de_chegada,int horacerta,String Entrada_ou_Saida){
        
        if(Entrada_ou_Saida.equals("Entrada                     ")){
        
        if((hora>=8) && (minuto > 10) || (hora>8)){//INICIO CHEGANDO ATRASADO
            
            hora -= horacerta;
            
            if(hora_de_chegada==9 && minuto==0){
            JOptionPane.showMessageDialog(null,"Você chegou atrasado "+hora+" hora.","Alerta",JOptionPane.ERROR_MESSAGE);//DIZ QUANTAS HORAS DE ATRASO
            }
            else
            if(hora_de_chegada==9 && minuto==1){
            JOptionPane.showMessageDialog(null,"Você chegou atrasado "+hora+" hora e "+minuto+" minuto.","Alerta",JOptionPane.ERROR_MESSAGE);//DIZ QUANTAS HORAS DE ATRASO
            }
            else
            if(hora_de_chegada==9 && minuto>1){
            JOptionPane.showMessageDialog(null,"Você chegou atrasado "+hora+" hora e "+minuto+" minutos.","Alerta",JOptionPane.ERROR_MESSAGE);//DIZ QUANTAS HORAS DE ATRASO
            }
            else
            if(hora_de_chegada>9 && minuto ==0){
            JOptionPane.showMessageDialog(null,"Você chegou atrasado "+hora+" horas.","Alerta",JOptionPane.ERROR_MESSAGE);//DIZ QUANTAS HORAS DE ATRASO
            }
            else
            if(hora_de_chegada>9 && minuto ==1){
            JOptionPane.showMessageDialog(null,"Você chegou atrasado "+hora+" horas e "+minuto+" minuto.","Alerta",JOptionPane.ERROR_MESSAGE);//DIZ QUANTAS HORAS DE ATRASO
            }
            else
            if(hora_de_chegada>9 && minuto >1){
            JOptionPane.showMessageDialog(null,"Você chegou atrasado "+hora+" horas e "+minuto+" minutos.","Alerta",JOptionPane.ERROR_MESSAGE);//DIZ QUANTAS HORAS DE ATRASO
            }
            else//
            if((hora_de_chegada == 8) && (minuto >10)){
                JOptionPane.showMessageDialog(null,"Você chegou atrasado "+minuto+" minutos.","Alerta",JOptionPane.ERROR_MESSAGE);
            }
        }//FIM CHEGANDO ATRASADO
        else
        if((hora==7) && (minuto>=50) || (hora==8) && (minuto==0) || (hora==8) && (minuto<11)){//INICIO HORARIO CORRETO
            JOptionPane.showMessageDialog(null,"Você chegou no horário correto.","Obrigado",JOptionPane.INFORMATION_MESSAGE);
        }//FIM HORARIO CORRETO
        else
        if(hora==7 && minuto < 50){//INICIO PONTO CEDO DEMAIS
            JOptionPane.showMessageDialog(null,"O Ponto foi batido cedo demais.","Alerta",JOptionPane.ERROR_MESSAGE);
        }
        
    }//FIM SE STRING FOR ENTRADA
    else
    if(!Entrada_ou_Saida.equals("Entrada                     ")){
    JOptionPane.showMessageDialog(null,"Obrigado.","Aviso",JOptionPane.INFORMATION_MESSAGE);
}
        
    }
}
