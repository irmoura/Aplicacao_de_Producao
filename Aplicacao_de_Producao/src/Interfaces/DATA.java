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

int DIA_BASE = 07;

double dias_uteis_totais = 22;//TOTAL DE DIAS UTEIS DO MES ...

public double dias_uteis, dias_ate_dia_base = 0;//DIAS UTEIS PASSADOS ATE O DIA BASE 05/11...

public double primeiro_dia_util_do_mes = 2;//DEFINIR PRIMEIRO DIA ÚTIL DO MÊS ...

double semana = 7;//VALOR PADRAO NAO DEVE SER ALTERADO ...

double primeira_semana = 3.5;//NUMEROS QUE IRAO SUBTRAIR COM O DIA ATUAL PARA DAR O DIA UTIL.
double segunda_semana = 3.5;//3.5
double terceira_semana = 5;//6
double quarta_semana = 6.5;//7.5
double quinta_semana = 8;//7

double diferenca_primeira_semana_atual = primeira_semana+10;//1 A MENOS QUE PRIMEIRA SEMANA --- VARIA
double diferenca_segunda_semana_atual = segunda_semana-2.5;//1 A MENOS QUE SEGUNDA SEMANA
double diferenca_terceira_semana_atual = terceira_semana-4;//1 A MENOS QUE TERCEIRA SEMANA
double diferenca_quarta_semana_atual = quarta_semana - 5.5;//1 A MENOS QUE QUARTA SEMANA
double diferenca_quinta_semana_atual = quinta_semana - 7;//1 A MENOS QUE QUINTA SEMANA

double diferenca_primeiro_sabado = 3;//0.5 A MENOS QUE PRIMEIRA SEMANA (VARIA...)
double diferenca_segundo_sabado = 3;//0.5 A MENOS QUE SEGUNDA SEMANA (REGRA)
double diferenca_terceiro_sabado = 4.5;//0.5 A MENOS QUE TERCEIRA SEMANA (REGRA)
double diferenca_quarto_sabado = 5;//0.5 A MENOS QUE QUARTA SEMANA (REGRA)
double diferenca_quinto_sabado = 7.5;//0.5 A MENOS QUE QUINTA SEMANA (REGRA)

double primeiro_sabado = 2;//ALTERAR APENAS AQUI ...DEFINIR O DIA DO PRIMEIRO SABADO
double segundo_sabado = primeiro_sabado+semana;
double terceiro_sabado = segundo_sabado+semana;
double quarto_sabado = terceiro_sabado+semana;
double quinto_sabado = quarto_sabado+semana;

double primeiro_domingo = 3;//ALTERAR APENAS AQUI ...DEFINIR O DIA DO PRIMEIRO DOMINGO
double segundo_domingo = primeiro_domingo+semana;
double terceiro_domingo = segundo_domingo+semana;
double quarto_domingo = terceiro_domingo+semana;
double quinto_domingo = quarto_domingo+semana;

////////////////////////////////////////////////////////////////////////////////
boolean Dia_Atual (double Dia){
        
        if ((dia_do_ano == 105) && (dia_da_semana == 5))
        {
            this.dias_uteis = 10;/*14/04/2016*/
        }
        else
        if ((dia_do_ano == 106) && (dia_da_semana == 6))
        {
            this.dias_uteis = 11;
        }
        else
        if ((dia_do_ano == 107) && (dia_da_semana == 7))
        {
            this.dias_uteis = 12;
        }
        else
        if ((dia_da_semana == 1))//Ex: 1 domingo ... 2 segunda ... 3 terça ...
        {
            JOptionPane.showMessageDialog(null,"Domingo o programa está de folga !","                        "
                    +"                  Aviso",JOptionPane.ERROR_MESSAGE);
        }
        else
        
        this.dias_uteis = this.dias_uteis_totais;
    
        return false;
            
    }
        
}