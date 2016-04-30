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

public int mes = DIA_ATUAL.get(Calendar.MONTH);//RECEBE O MÊS ATUAL
public int ano = DIA_ATUAL.get(Calendar.YEAR);//RECEBE O ANO ATUAL
public int MES_VALIDO = mes;//MES VALIDO DO APLICATIVO
public int ANO_VALIDO = ano;//ANO VALIDO DO APLICATIVO
public static String MES_VALIDO_STR;//MES VALIDO ex:"Janeiro" ...
public static String MES_VALIDO_ABREVIADO;//ex: "JAN"

public int DIA_BASE;//O DIA BASE SEMPRE É DEFINIDO MANUALMENTE

public double dias_uteis_totais;//TOTAL DE DIAS UTEIS DO MES ...

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