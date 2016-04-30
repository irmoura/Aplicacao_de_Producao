/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.Dimension;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mael
 */
public class MENU_LOCALIZAR extends javax.swing.JInternalFrame {

    /**
     * Creates new form MENU_LOCALIZAR
     */
    public MENU_LOCALIZAR() {
        initComponents();
        BOTAO_LOCALIZAR.setToolTipText("Localizar");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TEXTO_OS = new javax.swing.JTextField();
        BOTAO_LOCALIZAR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
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

        BOTAO_LOCALIZAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/IMAGENS/icon-lupa.jpg"))); // NOI18N
        BOTAO_LOCALIZAR.setBorder(null);
        BOTAO_LOCALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_LOCALIZARActionPerformed(evt);
            }
        });

        jLabel1.setText("OS:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TEXTO_OS, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BOTAO_LOCALIZAR)
                        .addGap(183, 183, 183))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TEXTO_OS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BOTAO_LOCALIZAR)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BOTAO_LOCALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_LOCALIZARActionPerformed
        // TODO add your handling code here:
        
        String OS = TEXTO_OS.getText();
        OS = OS.replace("/", "");
        OS += ".txt";
        
        File dir = new File("C:\\PRODUCAO\\INSPECAO");
        File arq = new File(dir,OS);
        
        try {
            
            FileReader fileReader = new FileReader(arq);
            BufferedReader bufferedReader = new BufferedReader(fileReader);//fileReader
            
             String conforme = bufferedReader.readLine();
             
             JOptionPane.showMessageDialog(null,"A OS: "+TEXTO_OS.getText()+" ESTÁ NO CONFORME: "+conforme);
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Ordem de serviço não encontrada ...");
            Logger.getLogger(MENU_LOCALIZAR.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MENU_LOCALIZAR.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BOTAO_LOCALIZARActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        KeyboardFocusManager.getCurrentKeyboardFocusManager()
            .addKeyEventDispatcher(new KeyEventDispatcher() {
                @Override
                public boolean dispatchKeyEvent(KeyEvent event) {
                    if(event.getID() == KeyEvent.KEY_RELEASED 
                       && event.getKeyCode() == KeyEvent.VK_ENTER){
                           BOTAO_LOCALIZARActionPerformed(null);
                           return true;
                     }
                     return false;
                }
        }); 
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTAO_LOCALIZAR;
    private javax.swing.JTextField TEXTO_OS;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
