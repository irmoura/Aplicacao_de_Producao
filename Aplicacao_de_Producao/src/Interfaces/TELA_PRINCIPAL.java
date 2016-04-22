/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.net.URL;

/**
 *
 * @author Ismael Ribeiro
 */
public class TELA_PRINCIPAL extends javax.swing.JFrame {
    
    public static String segundos_String = "";
    public static int minutos_int = 0;
    public static int horas_int = 0;
    public static String segundos = "";
    public static String minutos = "";
    public static String horas = "";
    
    /**
     * Creates new form Principal
     */
    public TELA_PRINCIPAL() { 
        
        
        initComponents();
        
        Calendar calendario = Calendar.getInstance();
        int Mes = calendario.get(Calendar.MONTH);
        
        DATA data = new DATA();
        Date dataSistema = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        DATA.setText(formato.format(dataSistema));
        
/********************************************************************************************************************************************************/
        
        /*
        ESTE TRECHO FAZ O PROGRAMA SER VÁLIDO PARA TODO E QUALQUER MÊS
        
        *PODE SER DESATIVADO
        *SE FOR DESATIVADO O MES VALIDO DA CLASSE DATA DEVE SER DEFINIDO MANUALMENTE.

        */

        if(Mes == 0){
            data.MES_VALIDO = 1;
            data.MES_VALIDO_STR = "Janeiro";
            data.MES_VALIDO_ABREVIADO = "JAN";
        }
        else
        if(Mes == 1){
            data.MES_VALIDO = 2;
            data.MES_VALIDO_STR = "Fevereiro";
            data.MES_VALIDO_ABREVIADO = "FEV";
        }
        else
        if(Mes == 2){
            data.MES_VALIDO = 3;
            data.MES_VALIDO_STR = "Março";
            data.MES_VALIDO_ABREVIADO = "MAR";
        }
        else
        if(Mes == 3){
            data.MES_VALIDO = 4;
            data.MES_VALIDO_STR = "Abril";
            data.MES_VALIDO_ABREVIADO = "ABR";
        }
        else
        if(Mes == 4){
            data.MES_VALIDO = 5;
            data.MES_VALIDO_STR = "Maio";
            data.MES_VALIDO_ABREVIADO = "MAI";
        }
        else
        if(Mes == 5){
            data.MES_VALIDO = 6;
            data.MES_VALIDO_STR = "Junho";
            data.MES_VALIDO_ABREVIADO = "JUN";
        }
        else
        if(Mes == 6){
            data.MES_VALIDO = 7;
            data.MES_VALIDO_STR = "Julho";
            data.MES_VALIDO_ABREVIADO = "JUL";
        }
        else
        if(Mes == 7){
            data.MES_VALIDO = 8;
            data.MES_VALIDO_STR = "Agosto";
            data.MES_VALIDO_ABREVIADO = "AGO";
        }
        else
        if(Mes == 8){
            data.MES_VALIDO = 9;
            data.MES_VALIDO_STR = "Setembro";
            data.MES_VALIDO_ABREVIADO = "SET";
        }
        else
        if(Mes == 9){
            data.MES_VALIDO = 10;
            data.MES_VALIDO_STR = "Outubro";
            data.MES_VALIDO_ABREVIADO = "OUT";
        }
        else
        if(Mes == 10){
            data.MES_VALIDO = 11;
            data.MES_VALIDO_STR = "Novembro";
            data.MES_VALIDO_ABREVIADO = "NOV";
        }
        else
        if(Mes == 11){
            data.MES_VALIDO = 12;
            data.MES_VALIDO_STR = "Dezembro";
            data.MES_VALIDO_ABREVIADO = "DEZ";
        }
        
/********************************************************************************************************************************************************/
        
        //////////////////////////
        SimpleDateFormat dia = new SimpleDateFormat("dd");
        SimpleDateFormat mes = new SimpleDateFormat("MM");
        SimpleDateFormat ano = new SimpleDateFormat("yyyy");
        
        int dia_int = Integer.parseInt(dia.format(dataSistema));
        int mes_int = Integer.parseInt(mes.format(dataSistema));
        int ano_int = Integer.parseInt(ano.format(dataSistema));
        
        if ((dia_int <=31) && (mes_int != data.MES_VALIDO) && (ano_int == data.ANO_VALIDO || ano_int != data.ANO_VALIDO))
        {
            PASSWORD password = new PASSWORD();
            
            String senha = "";
            
            for(int i=0;i<3;i++)
            {
                if(!senha.equals(password.senha))
                    
                {
                    
                    senha = "";
                    
                    senha = JOptionPane.showInputDialog(null,"Este aplicativo é válido apenas para "
                            +data.MES_VALIDO_STR+" de "
                            +data.ANO_VALIDO+".\nCaso queira liberar o acesso digite a senha do desenvolvedor: ","Acesso Bloqueado "
                                    +(i+1)+"ª tentativa.",JOptionPane.OK_CANCEL_OPTION);
                }
                
            }
            
            
            if (!senha.equals(password.senha) || senha.equals(null))
                
            {
                
                JOptionPane.showMessageDialog(null,"Senha incorreta ou operação cancelada, o programa será encerrado.");
                System.exit(0);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Acesso liberado.");
            }
        }
        else
        {
            TELA_DE_CARREGAMENTO TC = new TELA_DE_CARREGAMENTO();
        
            TC.setVisible(true);
            
            //timer.setDelay(10);//WIDTH 
            
            
        }
        
        
    }
    
    public void play(String nomeDoAudio){
        
        URL url = getClass().getResource(nomeDoAudio+".wav");//wav
        AudioClip audio = Applet.newAudioClip(url);
        audio.play();
        //audio.loop();
}
    
    public void stop(String nomeDoAudio){
        
        URL url = getClass().getResource(nomeDoAudio+".wav");//wav
        AudioClip audio = Applet.newAudioClip(url);
        //audio.play();
        audio.stop();
}
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        JanelaInternaPrincipal = new javax.swing.JDesktopPane();
        DATA = new javax.swing.JLabel();
        HORA = new javax.swing.JLabel();
        CRONOMETRO = new javax.swing.JLabel();
        label_tempo_logado = new javax.swing.JLabel();
        IMAGEM_DE_TESTE = new javax.swing.JLabel();
        MENU = new javax.swing.JMenuBar();
        MENU_APLICACAO = new javax.swing.JMenu();
        MENU_PRODUCAO = new javax.swing.JMenuItem();
        MENU_LOCALIZAR_COLABORADOR = new javax.swing.JMenuItem();
        MENU_ORDEM_DE_SERVICO = new javax.swing.JMenuItem();
        MENU_PONTO = new javax.swing.JMenuItem();
        MENU_INSPECAO = new javax.swing.JMenu();
        MENU_CADASTRAR = new javax.swing.JMenuItem();
        MENU_LOCALIZAR = new javax.swing.JMenuItem();
        MENU_AJUDA = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ibyte - Supervisão de Produção IBS F05");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        JanelaInternaPrincipal.setForeground(new java.awt.Color(255, 255, 255));

        DATA.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        DATA.setForeground(new java.awt.Color(255, 255, 255));
        DATA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DATA.setToolTipText("Data do sistema");
        JanelaInternaPrincipal.add(DATA);
        DATA.setBounds(300, 650, 90, 30);

        HORA.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        HORA.setForeground(new java.awt.Color(255, 255, 255));
        HORA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HORA.setToolTipText("Hora do sistema");
        JanelaInternaPrincipal.add(HORA);
        HORA.setBounds(100, 650, 87, 30);

        CRONOMETRO.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        CRONOMETRO.setForeground(new java.awt.Color(255, 255, 255));
        CRONOMETRO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CRONOMETRO.setToolTipText("Cronômetro");
        JanelaInternaPrincipal.add(CRONOMETRO);
        CRONOMETRO.setBounds(200, 650, 90, 30);

        label_tempo_logado.setBackground(new java.awt.Color(255, 255, 255));
        label_tempo_logado.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label_tempo_logado.setForeground(new java.awt.Color(255, 255, 255));
        label_tempo_logado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_tempo_logado.setText("00:00:00");
        label_tempo_logado.setToolTipText("Tempo de execusão do programa");
        JanelaInternaPrincipal.add(label_tempo_logado);
        label_tempo_logado.setBounds(0, 650, 90, 30);
        label_tempo_logado.getAccessibleContext().setAccessibleName("");

        IMAGEM_DE_TESTE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/IMAGENS/3D-Wallpaper-5_7SIBRzw.jpg"))); // NOI18N
        JanelaInternaPrincipal.add(IMAGEM_DE_TESTE);
        IMAGEM_DE_TESTE.setBounds(0, 0, 1920, 1200);

        MENU_APLICACAO.setText("Aplicação");

        MENU_PRODUCAO.setText("Produção");
        MENU_PRODUCAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_PRODUCAOActionPerformed(evt);
            }
        });
        MENU_APLICACAO.add(MENU_PRODUCAO);

        MENU_LOCALIZAR_COLABORADOR.setText("Localizar Colaborador");
        MENU_LOCALIZAR_COLABORADOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_LOCALIZAR_COLABORADORActionPerformed(evt);
            }
        });
        MENU_APLICACAO.add(MENU_LOCALIZAR_COLABORADOR);

        MENU_ORDEM_DE_SERVICO.setText("Ordem de Serviço");
        MENU_ORDEM_DE_SERVICO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_ORDEM_DE_SERVICOActionPerformed(evt);
            }
        });
        MENU_APLICACAO.add(MENU_ORDEM_DE_SERVICO);

        MENU_PONTO.setText("Ponto");
        MENU_PONTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_PONTOActionPerformed(evt);
            }
        });
        MENU_APLICACAO.add(MENU_PONTO);

        MENU.add(MENU_APLICACAO);

        MENU_INSPECAO.setText("Inspeção");

        MENU_CADASTRAR.setText("Cadastrar");
        MENU_CADASTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_CADASTRARActionPerformed(evt);
            }
        });
        MENU_INSPECAO.add(MENU_CADASTRAR);

        MENU_LOCALIZAR.setText("Localizar");
        MENU_LOCALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_LOCALIZARActionPerformed(evt);
            }
        });
        MENU_INSPECAO.add(MENU_LOCALIZAR);

        MENU.add(MENU_INSPECAO);

        MENU_AJUDA.setText("Ajuda");

        jMenuItem2.setText("Sobre");
        jMenuItem2.setToolTipText("F1");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        MENU_AJUDA.add(jMenuItem2);

        MENU.add(MENU_AJUDA);

        setJMenuBar(MENU);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JanelaInternaPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JanelaInternaPrincipal)
        );

        setSize(new java.awt.Dimension(1280, 760));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        MENU_SOBRE obj = new MENU_SOBRE();
        JanelaInternaPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void MENU_PRODUCAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_PRODUCAOActionPerformed
        // TODO add your handling code here:
        DATA data = new DATA();
        MENU_PRODUCAO obj = new MENU_PRODUCAO();
        JanelaInternaPrincipal.add(obj);
        obj.setVisible(true);
        obj.setTitle("Relatório de Acompanhamento de Metas Diário - "+data.MES_VALIDO_STR+" "+data.ANO_VALIDO);
    }//GEN-LAST:event_MENU_PRODUCAOActionPerformed
    
    int contador = 0;
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        int delay = 1000;//1000
        //
        timer = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                contador++;
                
                /////////////////////////SEGUNDOS/////////////////////////
                if(contador < 10){
                    segundos = "0"+contador;
                }
                else
                if(contador > 9 && contador < 60){
                    segundos = ""+contador;
                }
                else
                if(contador > 59){
                    contador = 0;
                    segundos = "0"+contador;
                    minutos_int++;
                }
                /////////////////////////SEGUNDOS/////////////////////////
                
                /////////////////////////MINUTOS/////////////////////////
                if(minutos_int == 0){
                    minutos = "00";
                }
                else
                if(minutos_int > 0 && minutos_int < 10){
                    minutos = "0"+minutos_int;
                }
                else
                if(minutos_int > 0 && minutos_int > 9){
                    minutos = ""+minutos_int;
                }
                
                if(minutos_int == 60){
                    minutos_int = 0;
                    horas_int++;
                }
                
                /////////////////////////MINUTOS/////////////////////////
                
                /////////////////////////HORAS/////////////////////////
                if(horas_int == 0){
                    horas = "00";
                }
                else
                if(horas_int > 0 && horas_int < 10){
                    horas = "0"+horas_int;
                }
                else
                if(horas_int > 0 && horas_int > 9){
                    horas = ""+horas_int;
                }
                
                if(horas_int == 24){
                    horas_int = 0;
                }
                
                /////////////////////////HORAS/////////////////////////
                
                //label_tempo_logado.setForeground(Color.PINK);//DEFINE A COR DO LABEL
                label_tempo_logado.setText(horas+":"+minutos+":"+segundos);
                
            }
        });
        timer.start();
        //
        
        //play("/Interfaces/SONS/mario");// SE 
        
        KeyboardFocusManager.getCurrentKeyboardFocusManager()
            .addKeyEventDispatcher(new KeyEventDispatcher() {
                @Override
                public boolean dispatchKeyEvent(KeyEvent event) {
                    if(event.getID() == KeyEvent.KEY_RELEASED 
                       && event.getKeyCode() == KeyEvent.VK_F2){
                        MENU_F4 obj = new MENU_F4();
                        JanelaInternaPrincipal.add(obj);
                        obj.setVisible(true);
                           return true;
                     }
                    else
                        if(event.getID() == KeyEvent.KEY_RELEASED 
                       && event.getKeyCode() == KeyEvent.VK_F1){
                        MENU_SOBRE obj = new MENU_SOBRE();
                        JanelaInternaPrincipal.add(obj);
                        obj.setVisible(true);
                           return true;
                     }
                    else
                        if(event.getID() == KeyEvent.KEY_RELEASED 
                       && event.getKeyCode() == KeyEvent.VK_F3){
                        TELA_DO_GRAFICO obj = new TELA_DO_GRAFICO();
                        JanelaInternaPrincipal.add(obj);
                        obj.setVisible(true);
                           return true;
                     }
                     return false;
                }
        }); 
        
        this.setExtendedState(MAXIMIZED_BOTH);//DEFINE A JANELA PARA INICIAR MAXIMIZADA
          
        /////////////////////

        Timer timer = new Timer(1000, new hora());
        timer.start();
        
        java.io.File DIRETORIO_PRINCIPAL = new java.io.File("C:\\PRODUCAO");
        java.io.File DIRETORIO_SETORES = new java.io.File("C:\\PRODUCAO\\SETORES");
        java.io.File DIRETORIO_ANTEDIMENTO = new java.io.File("C:\\PRODUCAO\\ATENDIMENTO");
        
        DIRETORIO_SETORES.mkdir();
        DIRETORIO_PRINCIPAL.mkdir();
        DIRETORIO_ANTEDIMENTO.mkdir();
        
        java.io.File ARQUIVO_DO_TECNICO = new java.io.File(DIRETORIO_PRINCIPAL,"TECNICO.txt");
        java.io.File ARQUIVO_DO_ATENDENTE = new java.io.File(DIRETORIO_ANTEDIMENTO, "ATENDENTE.txt");
        
        java.io.File SETOR_ELETRONICA = new java.io.File(DIRETORIO_SETORES, "ELETRONICA.txt");
        java.io.File SETOR_NOTEBOOK = new java.io.File(DIRETORIO_SETORES, "NOTEBOOK.txt");
        java.io.File SETOR_GARANTIA = new java.io.File(DIRETORIO_SETORES, "GARANTIA.txt");
        java.io.File SETOR_TABLET = new java.io.File(DIRETORIO_SETORES, "TABLET.txt");
        java.io.File SETOR_IMPRESSORA = new java.io.File(DIRETORIO_SETORES, "IMPRESSORA.txt");
        java.io.File SETOR_RECARGA = new java.io.File(DIRETORIO_SETORES, "RECARGA.txt");
        java.io.File SETOR_LAUDO = new java.io.File(DIRETORIO_SETORES, "LAUDO.txt");
        java.io.File SETOR_DESKTOP = new java.io.File(DIRETORIO_SETORES, "DESKTOP.txt");
        java.io.File SETOR_ATENDIMENTO = new java.io.File(DIRETORIO_SETORES, "ATENDIMENTO.txt");
        
        try {
            
            ARQUIVO_DO_TECNICO.createNewFile();
            ARQUIVO_DO_ATENDENTE.createNewFile();
            
            SETOR_ELETRONICA.createNewFile();
            SETOR_NOTEBOOK.createNewFile();
            SETOR_GARANTIA.createNewFile();
            SETOR_TABLET.createNewFile();
            SETOR_IMPRESSORA.createNewFile();
            SETOR_RECARGA.createNewFile();
            SETOR_LAUDO.createNewFile();
            SETOR_DESKTOP.createNewFile();
            SETOR_ATENDIMENTO.createNewFile();
            
            } catch (IOException ex) {
            Logger.getLogger(MENU_PRODUCAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        LOJA loja = new LOJA();
        
        setTitle(loja.loja);//DEFINE O TITULO DA JANELA PRINCIPAL ATRAVES DA CLASSE LOJA
        
    }//GEN-LAST:event_formWindowOpened

    private void MENU_LOCALIZAR_COLABORADORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_LOCALIZAR_COLABORADORActionPerformed
        // TODO add your handling code here:
        MENU_LOCALIZAR_COLABORADOR obj = new MENU_LOCALIZAR_COLABORADOR();
        JanelaInternaPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_MENU_LOCALIZAR_COLABORADORActionPerformed

    private void MENU_CADASTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_CADASTRARActionPerformed
        // TODO add your handling code here:
        MENU_INSPECAO obj = new MENU_INSPECAO();
        JanelaInternaPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_MENU_CADASTRARActionPerformed

    private void MENU_LOCALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_LOCALIZARActionPerformed
        // TODO add your handling code here:
        MENU_LOCALIZAR obj = new MENU_LOCALIZAR();
        JanelaInternaPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_MENU_LOCALIZARActionPerformed

    private void MENU_ORDEM_DE_SERVICOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_ORDEM_DE_SERVICOActionPerformed
        // TODO add your handling code here:
        MENU_ORDEM_DE_SERVICO obj = new MENU_ORDEM_DE_SERVICO();
        JanelaInternaPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_MENU_ORDEM_DE_SERVICOActionPerformed

    private void MENU_PONTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_PONTOActionPerformed
        // TODO add your handling code here:
        MENU_PONTO obj = new MENU_PONTO();
        JanelaInternaPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_MENU_PONTOActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TELA_PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TELA_PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TELA_PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TELA_PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TELA_PRINCIPAL().setVisible(true);
            }
        });
    }
    
    private Timer timer;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CRONOMETRO;
    private javax.swing.JLabel DATA;
    private javax.swing.JLabel HORA;
    private javax.swing.JLabel IMAGEM_DE_TESTE;
    public javax.swing.JDesktopPane JanelaInternaPrincipal;
    private javax.swing.JMenuBar MENU;
    private javax.swing.JMenu MENU_AJUDA;
    private javax.swing.JMenu MENU_APLICACAO;
    private javax.swing.JMenuItem MENU_CADASTRAR;
    private javax.swing.JMenu MENU_INSPECAO;
    private javax.swing.JMenuItem MENU_LOCALIZAR;
    private javax.swing.JMenuItem MENU_LOCALIZAR_COLABORADOR;
    private javax.swing.JMenuItem MENU_ORDEM_DE_SERVICO;
    public javax.swing.JMenuItem MENU_PONTO;
    private javax.swing.JMenuItem MENU_PRODUCAO;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel label_tempo_logado;
    // End of variables declaration//GEN-END:variables

    

class hora implements ActionListener {
public void actionPerformed(ActionEvent e) {

/*Voice voice;
VoiceManager vm = VoiceManager.getInstance();
voice = vm.getVoice("kevin16");
voice.allocate();
voice.speak("hello");*/
    
Calendar now = Calendar.getInstance();
HORA.setText(String.format("%1$tH:%1$tM:%1$tS", now));

String segundos = "";
String minutos = "";
String horas = "";

int segundo = 0;
int minuto = 0;
int hora = 0;

int segundo_cronometro = 0;
int minuto_cronometro = 0;
int hora_cronometro = 0;

segundos = (String.format("%1$tS", now));
minutos = (String.format("%1$tM", now));
horas = (String.format("%1$tH", now));

segundo = Integer.parseInt(segundos);
minuto = Integer.parseInt(minutos);
hora = Integer.parseInt(horas);

segundo_cronometro = 60-segundo;
minuto_cronometro = 49-minuto;
hora_cronometro = 17-hora;

//if((hora_cronometro<10) && (minuto_cronometro<59) && (segundo_cronometro == 0))
if((hora==13) && (minuto==37))
{
//minuto_cronometro = 59-minuto;
//CRONOMETRO.setText("0"+hora_cronometro+":"+minuto_cronometro+":"+segundo_cronometro);
    
    //voice.speak("Time to go !!!");//("hello!!");
    //play("missaoimpossivel");
   
}
//else
CRONOMETRO.setText(""+hora_cronometro+":"+minuto_cronometro+":"+segundo_cronometro);

        }
    }

}