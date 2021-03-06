/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.Dimension;
import java.util.Calendar;

/**
 *
 * @author Ismael Ribeiro
 */
public class MENU_SOBRE extends javax.swing.JInternalFrame {
    
    public DATA data;
    public Dimension dimensao;
    
    public String MES_VALIDO_STR;
    
    /**
     * Creates new form MENU_SOBRE
     */
    public MENU_SOBRE() {
        initComponents();
        
        Calendar DIA_ATUAL = Calendar.getInstance();
        int mes = DIA_ATUAL.get(Calendar.MONTH);
        
        switch (mes) {
            case 0:
                MES_VALIDO_STR = "Janeiro";
                break;
            case 1:
                MES_VALIDO_STR = "Fevereiro";
                break;
            case 2:
                MES_VALIDO_STR = "Março";
                break;
            case 3:
                MES_VALIDO_STR = "Abril";
                break;
            case 4:
                MES_VALIDO_STR = "Maio";
                break;
            case 5:
                MES_VALIDO_STR = "Junho";
                break;
            case 6:
                MES_VALIDO_STR = "Julho";
                break;
            case 7:
                MES_VALIDO_STR = "Agosto";
                break;
            case 8:
                MES_VALIDO_STR = "Setembro";
                break;
            case 9:
                MES_VALIDO_STR = "Outubro";
                break;
            case 10:
                MES_VALIDO_STR = "Novembro";
                break;
            case 11:
                MES_VALIDO_STR = "Dezembro";
                break;
            default:
                break;
        }
        
        data = new DATA();
        dimensao = new Dimension();
        
        AREA_DE_TEXTO.setText("Aplicativo desenvolvido em java com o objetivo \n" +
                              "similar ao da planilha de acompanhamento.\n" +
                              "\n" +
                              "*Válido para "+MES_VALIDO_STR+" de "+data.ANO_VALIDO+".\n" +
                              "\n" +
                              "Desenvolvedor: Ismael Ribeiro Moura.");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        AREA_DE_TEXTO = new javax.swing.JTextArea();

        setClosable(true);
        setTitle("Sobre");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        AREA_DE_TEXTO.setEditable(false);
        AREA_DE_TEXTO.setColumns(20);
        AREA_DE_TEXTO.setRows(5);
        jScrollPane1.setViewportView(AREA_DE_TEXTO);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        dimensao = this.getDesktopPane().getSize();
        this.setLocation((dimensao.width - this.getSize().width) / 2, (dimensao.height - this.getSize().height) / 2);
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea AREA_DE_TEXTO;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}