/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.Dimension;

/**
 *
 * @author Ismael Ribeiro
 */
public class MENU_SOBRE extends javax.swing.JInternalFrame {

    /**
     * Creates new form MENU_SOBRE
     */
    public MENU_SOBRE() {
        initComponents();
        
        DATA data = new DATA();
        
        AREA_DE_TEXTO.setText("Aplicativo desenvolvido em java com o objetivo \n" +
                              "similar ao da planilha de acompanhamento.\n" +
                              "\n" +
                              "*Válido para "+data.MES_VALIDO_STR+" de "+data.ANO_VALIDO+".\n" +
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
        AREA_DE_TEXTO.setText("Aplicativo desenvolvido em java com o objetivo \nsimilar ao da planilha de acompanhamento.\n\n*Válido para Dezembro de 2015.\n\nDesenvolvedor: Ismael Ribeiro Moura.");
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
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea AREA_DE_TEXTO;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}