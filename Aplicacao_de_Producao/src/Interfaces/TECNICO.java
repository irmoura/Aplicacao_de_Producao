/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Ismael Ribeiro
 */
public class TECNICO {

INDICADOR indicador = new INDICADOR();    

String nome;
String setor;
int em;
double previsto;
double falta;
double total_ol;
double porcentagem_dia_base;
double diferenca_geral;
double maquinas_ate_dia_base;//maquinas feitas ate o dia base ...

double Metodo_Falta() { return this.previsto - total_ol; } //METODO PARA CALCULAR QUANTAS MÁQUINAS FALTAM ...


}
