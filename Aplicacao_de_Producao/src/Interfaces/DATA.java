/*
O arquivo de data que será lido deve conter 3 informações:

Na primeira linha: os dias úteis daquele dia.
Na segunda linha: os dias úteis totais do mês vigente.
Na terceira linha: o dia base do mês vigente.

*/
package Interfaces;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Ismael Ribeiro
 */
public class DATA {

public static String dia_util_str, dias_uteis_totais_str, dia_base_str;

Calendar DIA_ATUAL = Calendar.getInstance();

public int dia = DIA_ATUAL.get(Calendar.DAY_OF_MONTH);// RECEBE O DIA ATUAL - AQUI TAMBÉM É POSSIVEL DEFINIR O DIA ATUAL ...(Ex: 1,2,3...31)

public int dia_da_semana = DIA_ATUAL.get(Calendar.DAY_OF_WEEK);

public int dia_do_ano = DIA_ATUAL.get(Calendar.DAY_OF_YEAR);

public final int mes = DIA_ATUAL.get(Calendar.MONTH);//RECEBE O MÊS ATUAL
public int ano = DIA_ATUAL.get(Calendar.YEAR);//RECEBE O ANO ATUAL
public int MES_VALIDO = mes;//MES VALIDO DO APLICATIVO
public int ANO_VALIDO = ano;//ANO VALIDO DO APLICATIVO
public static String MES_VALIDO_STR;//MES VALIDO ex:"Janeiro" ...
public static String MES_VALIDO_ABREVIADO;//ex: "JAN"

public int DIA_BASE;//O DIA BASE SEMPRE É DEFINIDO MANUALMENTE

public double dias_uteis_totais;//TOTAL DE DIAS UTEIS DO MES ...

public double dias_uteis, dias_ate_dia_base = 0;//DIAS UTEIS PASSADOS ATE O DIA BASE 05/11...//DIAS UTEIS PASSADOS ATE O DIA BASE 05/11...

public void Verifica_Mes(){
switch (this.mes) {
            case 0:
                MES_VALIDO = 1;
                MES_VALIDO_STR = "Janeiro";
                MES_VALIDO_ABREVIADO = "JAN";
                break;
            case 1:
                MES_VALIDO = 2;
                MES_VALIDO_STR = "Fevereiro";
                MES_VALIDO_ABREVIADO = "FEV";
                break;
            case 2:
                MES_VALIDO = 3;
                MES_VALIDO_STR = "Março";
                MES_VALIDO_ABREVIADO = "MAR";
                break;
            case 3:
                MES_VALIDO = 4;
                MES_VALIDO_STR = "Abril";
                MES_VALIDO_ABREVIADO = "ABR";
                break;
            case 4:
                MES_VALIDO = 5;
                MES_VALIDO_STR = "Maio";
                MES_VALIDO_ABREVIADO = "MAI";
                break;
            case 5:
                MES_VALIDO = 6;
                MES_VALIDO_STR = "Junho";
                MES_VALIDO_ABREVIADO = "JUN";
                break;
            case 6:
                MES_VALIDO = 7;
                MES_VALIDO_STR = "Julho";
                MES_VALIDO_ABREVIADO = "JUL";
                break;
            case 7:
                MES_VALIDO = 8;
                MES_VALIDO_STR = "Agosto";
                MES_VALIDO_ABREVIADO = "AGO";
                break;
            case 8:
                MES_VALIDO = 9;
                MES_VALIDO_STR = "Setembro";
                MES_VALIDO_ABREVIADO = "SET";
                break;
            case 9:
                MES_VALIDO = 10;
                MES_VALIDO_STR = "Outubro";
                MES_VALIDO_ABREVIADO = "OUT";
                break;
            case 10:
                MES_VALIDO = 11;
                MES_VALIDO_STR = "Novembro";
                MES_VALIDO_ABREVIADO = "NOV";
                break;
            case 11:
                MES_VALIDO = 12;
                MES_VALIDO_STR = "Dezembro";
                MES_VALIDO_ABREVIADO = "DEZ";
                break;
            default:
                break;
        }
}

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

public static void Data_Automatica(String dia_do_ano){
    
    String dia_do_ano_str = dia_do_ano;
    
    dia_do_ano_str = dia_do_ano_str+".txt";
    
    File ARQUIVO = new File("C:\\PRODUCAO\\DATAS\\"+dia_do_ano_str);
    
    try {
        FileReader fileReader = new FileReader(ARQUIVO);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        try {
            
            dia_util_str = bufferedReader.readLine();
            dias_uteis_totais_str = bufferedReader.readLine();
            dia_base_str = bufferedReader.readLine();
        
        } catch (IOException ex) {
            Logger.getLogger(DATA.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    } catch (FileNotFoundException ex) {
        Logger.getLogger(DATA.class.getName()).log(Level.SEVERE, null, ex);
    }
    
}

////////////////////////////////////////////////////////////////////////////////
boolean Dia_Atual (double Dia){
        
        this.dias_uteis_totais = Double.parseDouble(dias_uteis_totais_str);
        this.dias_uteis = Double.parseDouble(dia_util_str);
        this.DIA_BASE = Integer.parseInt(dia_base_str);
    
        return false;
            
    }
        
}