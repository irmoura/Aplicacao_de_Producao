package Interfaces;

import java.util.Calendar;
import javax.swing.JOptionPane;
/**
 *
 * @author Ismael Ribeiro
 */
public class DATA {

Calendar DIA_ATUAL = Calendar.getInstance();

public int dia = DIA_ATUAL.get(Calendar.DAY_OF_MONTH);// RECEBE O DIA ATUAL - AQUI TAMBÉM É POSSIVEL DEFINIR O DIA ATUAL ...(Ex: 1,2,3...31)

public int dia_da_semana = DIA_ATUAL.get(Calendar.DAY_OF_WEEK);

public int dia_do_ano = DIA_ATUAL.get(Calendar.DAY_OF_YEAR);

public int mes = DIA_ATUAL.get(Calendar.MONTH);//RECEBE O MÊS ATUAL
public int ano = DIA_ATUAL.get(Calendar.YEAR);//RECEBE O ANO ATUAL
public int MES_VALIDO = mes;//MES VALIDO DO APLICATIVO
public int ANO_VALIDO = ano;//ANO VALIDO DO APLICATIVO
public static String MES_VALIDO_STR;//MES VALIDO ex:"Janeiro" ...
public static String MES_VALIDO_ABREVIADO;//ex: "JAN"

int DIA_BASE = 07;//O DIA BASE SEMPRE É DEFINIDO MANUALMENTE

double dias_uteis_totais = 22;//TOTAL DE DIAS UTEIS DO MES ...

public double dias_uteis, dias_ate_dia_base = 0;//DIAS UTEIS PASSADOS ATE O DIA BASE 05/11...

public static void Aviso_de_Domingo(){
    JOptionPane.showMessageDialog(null,"Domingo o programa está de folga !","                        "
                    +"                  Aviso",JOptionPane.ERROR_MESSAGE);
}

public static void Happy_New_Year(){
    JOptionPane.showMessageDialog(null,"Feliz Ano Novo !!! ","Feliz Ano Novo",JOptionPane.INFORMATION_MESSAGE);
}

public static void Feriado(){
    JOptionPane.showMessageDialog(null,"Hoje é feriado !!! ","Feriado",JOptionPane.INFORMATION_MESSAGE);
}

////////////////////////////////////////////////////////////////////////////////
boolean Dia_Atual (double Dia){
            
    if ((dia_do_ano == 1) && (dia_da_semana == 6))/**/
        {
            Happy_New_Year();
        }
        else
    if ((dia_do_ano == 2) && (dia_da_semana == 7))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 3) && (dia_da_semana == 1))/**/
        {
            Aviso_de_Domingo();
        }
        else
    if ((dia_do_ano == 4) && (dia_da_semana == 2))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 5) && (dia_da_semana == 3))/**/
        {
            this.dias_uteis = 10;
        }
        else    
    if ((dia_do_ano == 6) && (dia_da_semana == 4))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 7) && (dia_da_semana == 5))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 8) && (dia_da_semana == 6))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 9) && (dia_da_semana == 7))/**/
        {
            this.dias_uteis = 10;
        }
        else    
    if ((dia_do_ano == 10) && (dia_da_semana == 1))/**/
        {
            Aviso_de_Domingo();
        }
        else
    if ((dia_do_ano == 11) && (dia_da_semana == 2))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 12) && (dia_da_semana == 3))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 13) && (dia_da_semana == 4))/**/
        {
            this.dias_uteis = 10;
        }
        else    
    if ((dia_do_ano == 14) && (dia_da_semana == 5))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 15) && (dia_da_semana == 6))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 16) && (dia_da_semana == 7))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 17) && (dia_da_semana == 1))/**/
        {
            Aviso_de_Domingo();
        }
        else
    if ((dia_do_ano == 18) && (dia_da_semana == 2))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 19) && (dia_da_semana == 3))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 20) && (dia_da_semana == 4))/**/
        {
            this.dias_uteis = 10;
        }
        else    
    if ((dia_do_ano == 21) && (dia_da_semana == 5))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 22) && (dia_da_semana == 6))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 23) && (dia_da_semana == 7))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 24) && (dia_da_semana == 1))/**/
        {
            Aviso_de_Domingo();
        }
        else
    if ((dia_do_ano == 25) && (dia_da_semana == 2))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 26) && (dia_da_semana == 3))/**/
        {
            this.dias_uteis = 10;
        }
        else    
    if ((dia_do_ano == 27) && (dia_da_semana == 4))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 28) && (dia_da_semana == 5))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 29) && (dia_da_semana == 6))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 30) && (dia_da_semana == 7))/**/
        {
            this.dias_uteis = 10;
        }
        else    
    if ((dia_do_ano == 31) && (dia_da_semana == 1))/**/
        {
            Aviso_de_Domingo();
        }
        else
    if ((dia_do_ano == 32) && (dia_da_semana == 2))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 33) && (dia_da_semana == 3))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 34) && (dia_da_semana == 4))/**/
        {
            this.dias_uteis = 10;
        }
        else    
    if ((dia_do_ano == 35) && (dia_da_semana == 5))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 36) && (dia_da_semana == 6))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 37) && (dia_da_semana == 7))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 38) && (dia_da_semana == 1))/**/
        {
            Aviso_de_Domingo();
        }
        else    
    if ((dia_do_ano == 39) && (dia_da_semana == 2))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 40) && (dia_da_semana == 3))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 41) && (dia_da_semana == 4))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 42) && (dia_da_semana == 5))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 43) && (dia_da_semana == 6))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 44) && (dia_da_semana == 7))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 45) && (dia_da_semana == 1))/**/
        {
            Aviso_de_Domingo();
        }
        else    
    if ((dia_do_ano == 46) && (dia_da_semana == 2))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 47) && (dia_da_semana == 3))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 48) && (dia_da_semana == 4))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 49) && (dia_da_semana == 5))/**/
        {
            this.dias_uteis = 10;
        }
        else    
    if ((dia_do_ano == 50) && (dia_da_semana == 6))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 51) && (dia_da_semana == 7))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 52) && (dia_da_semana == 1))/**/
        {
            Aviso_de_Domingo();
        }
        else
    if ((dia_do_ano == 53) && (dia_da_semana == 2))/**/
        {
            this.dias_uteis = 10;
        }
        else    
    if ((dia_do_ano == 54) && (dia_da_semana == 3))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 55) && (dia_da_semana == 4))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 56) && (dia_da_semana == 5))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 57) && (dia_da_semana == 6))/**/
        {
            this.dias_uteis = 10;
        }
        else    
    if ((dia_do_ano == 58) && (dia_da_semana == 7))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 59) && (dia_da_semana == 1))/**/
        {
            Aviso_de_Domingo();
        }
        else
    if ((dia_do_ano == 60) && (dia_da_semana == 2))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 61) && (dia_da_semana == 3))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 62) && (dia_da_semana == 4))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 63) && (dia_da_semana == 5))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 64) && (dia_da_semana == 6))/**/
        {
            this.dias_uteis = 10;
        }
        else    
    if ((dia_do_ano == 65) && (dia_da_semana == 7))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 66) && (dia_da_semana == 1))/**/
        {
            Aviso_de_Domingo();
        }
        else
    if ((dia_do_ano == 67) && (dia_da_semana == 2))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 68) && (dia_da_semana == 3))/**/
        {
            this.dias_uteis = 10;
        }
        else    
    if ((dia_do_ano == 69) && (dia_da_semana == 4))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 70) && (dia_da_semana == 5))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 71) && (dia_da_semana == 6))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 72) && (dia_da_semana == 7))/**/
        {
            this.dias_uteis = 10;
        }
        else    
    if ((dia_do_ano == 73) && (dia_da_semana == 1))/**/
        {
            Aviso_de_Domingo();
        }
        else
    if ((dia_do_ano == 74) && (dia_da_semana == 2))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 75) && (dia_da_semana == 3))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 76) && (dia_da_semana == 4))/**/
        {
            this.dias_uteis = 10;
        }
        else    
    if ((dia_do_ano == 77) && (dia_da_semana == 5))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 78) && (dia_da_semana == 6))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 79) && (dia_da_semana == 7))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 80) && (dia_da_semana == 1))/**/
        {
            Aviso_de_Domingo();
        }
        else
    if ((dia_do_ano == 81) && (dia_da_semana == 2))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 82) && (dia_da_semana == 3))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 83) && (dia_da_semana == 4))/**/
        {
            this.dias_uteis = 10;
        }
        else    
    if ((dia_do_ano == 84) && (dia_da_semana == 5))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 85) && (dia_da_semana == 6))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 86) && (dia_da_semana == 7))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 87) && (dia_da_semana == 1))/**/
        {
            Aviso_de_Domingo();
        }
        else    
    if ((dia_do_ano == 88) && (dia_da_semana == 2))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 89) && (dia_da_semana == 3))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 90) && (dia_da_semana == 4))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 91) && (dia_da_semana == 5))/**/
        {
            this.dias_uteis = 10;
        }
        else    
    if ((dia_do_ano == 92) && (dia_da_semana == 6))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 93) && (dia_da_semana == 7))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 94) && (dia_da_semana == 1))/**/
        {
            Aviso_de_Domingo();
        }
        else
    if ((dia_do_ano == 95) && (dia_da_semana == 2))/**/
        {
            this.dias_uteis = 10;
        }
        else    
    if ((dia_do_ano == 96) && (dia_da_semana == 3))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 97) && (dia_da_semana == 4))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 98) && (dia_da_semana == 5))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 99) && (dia_da_semana == 6))/**/
        {
            this.dias_uteis = 10;
        }
        else    
    if ((dia_do_ano == 100) && (dia_da_semana == 7))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 101) && (dia_da_semana == 1))/**/
        {
            Aviso_de_Domingo();
        }
        else
    if ((dia_do_ano == 102) && (dia_da_semana == 2))/**/
        {
            this.dias_uteis = 10;
        }
        else
    if ((dia_do_ano == 103) && (dia_da_semana == 3))/**/
        {
            this.dias_uteis = 10;
        }
        else    
    if ((dia_do_ano == 104) && (dia_da_semana == 4))/**/
        {
            this.dias_uteis = 10;
        }
        else
        if ((dia_do_ano == 105) && (dia_da_semana == 5))/*14/04/2016*/
        {
            this.dias_uteis = 10;
        }
        else
        if ((dia_do_ano == 106) && (dia_da_semana == 6))/*15/04/2016*/
        {
            this.dias_uteis = 11;
        }
        else
        if ((dia_do_ano == 107) && (dia_da_semana == 7))/*16/04/2016*/
        {
            this.dias_uteis = 12;
        }
        else
        if ((dia_do_ano == 108) && (dia_da_semana == 1))/*17/04/2016*/
        {
            Aviso_de_Domingo();
        }
        else
        if ((dia_do_ano == 109) && (dia_da_semana == 2))/*18/04/2016*/
        {
            this.dias_uteis = 12.5;
        }
        else
        if ((dia_do_ano == 110) && (dia_da_semana == 3))/*19/04/2016*/
        {
            this.dias_uteis = 13.5;
        }
        else
        if ((dia_do_ano == 111) && (dia_da_semana == 4))/*20/04/2016*/
        {
            this.dias_uteis = 14.5;
        }
        else
        if ((dia_do_ano == 112) && (dia_da_semana == 5))/*21/04/2016*/
        {
            Feriado();
        }
        else
        if ((dia_do_ano == 113) && (dia_da_semana == 6))/*22/04/2016*/
        {
            this.dias_uteis = 15.5;
        }
        else
        if ((dia_do_ano == 114) && (dia_da_semana == 7))/*23/04/2016*/
        {
            this.dias_uteis = 16.5;
        }
        else
        if ((dia_do_ano == 115) && (dia_da_semana == 1))/*24/04/2016*/
        {
            Aviso_de_Domingo();
        }
        else
        if ((dia_do_ano == 116) && (dia_da_semana == 2))/*25/04/2016*/
        {
            this.dias_uteis = 17;
        }
        else
        if ((dia_do_ano == 117) && (dia_da_semana == 3))/*26/04/2016*/
        {
            this.dias_uteis = 18;
        }
        else
        if ((dia_do_ano == 118) && (dia_da_semana == 4))/*27/04/2016*/
        {
            this.dias_uteis = 19;
        }
        else
        if ((dia_do_ano == 119) && (dia_da_semana == 5))/*28/04/2016*/
        {
            this.dias_uteis = 20;
        }
        else
        if ((dia_do_ano == 120) && (dia_da_semana == 6))/*29/04/2016*/
        {
            this.dias_uteis = 21;
        }
        else
        if ((dia_do_ano == 121) && (dia_da_semana == 7))/*30/04/2016*/
        {
            this.dias_uteis = 22;
        }
    
        return false;
            
    }
        
}