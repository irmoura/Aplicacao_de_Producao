/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Ismael Ribeiro
 */
public class TELA_PRINCIPAL extends javax.swing.JFrame {
    
    public DATA data;
    public MENU_SOBRE menu_sobre;
    public MENU_PRODUCAO menu_producao;
    public TELA_DE_CARREGAMENTO TC;
    public Timer timer;
    public MENU_F4 menu_f4;
    public TELA_DO_GRAFICO tela_do_grafico;
    public LOJA loja;
    public MENU_LOCALIZAR_COLABORADOR menu_localizar_colaborador;
    public MENU_INSPECAO menu_inspecao;
    public MENU_LOCALIZAR menu_localizar;
    public MENU_ORDEM_DE_SERVICO menu_ordem_de_servico;
    public MENU_PONTO menu_ponto;
    public PASSWORD password;
    public Date dataSistema;
    public Calendar now;
    
    public static String segundos_String = "";
    public static int minutos_int = 0;
    public static int horas_int = 0;
    public static String segundos = "";
    public static String minutos = "";
    public static String horas = "";
    public static int HORIZONTAL, VERTICAL,contador;
    
    /**
     * Creates new form Principal
     */
    public TELA_PRINCIPAL() { 
        
        data = new DATA();
        menu_sobre = new MENU_SOBRE();
        menu_producao = new MENU_PRODUCAO();
        TC = new TELA_DE_CARREGAMENTO();
        menu_f4 = new MENU_F4();
        tela_do_grafico = new TELA_DO_GRAFICO();
        loja = new LOJA();
        menu_localizar_colaborador = new MENU_LOCALIZAR_COLABORADOR();
        menu_inspecao = new MENU_INSPECAO();
        menu_localizar = new MENU_LOCALIZAR();
        menu_ordem_de_servico = new MENU_ORDEM_DE_SERVICO();
        menu_ponto = new MENU_PONTO();
        password = new PASSWORD();
        dataSistema = new Date();
        
        initComponents();
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        DATA.setText(formato.format(dataSistema));
        
/********************************************************************************************************************************************************/
        /*
         *ESTE TRECHO FAZ O PROGRAMA SER VÁLIDO PARA TODO E QUALQUER MÊS
         *PODE SER DESATIVADO
         *SE FOR DESATIVADO O MES VALIDO DA CLASSE DATA DEVE SER DEFINIDO MANUALMENTE.
         */
        
        data.Verifica_Mes();
        
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
            
            String senha = "";
            int tentativas = 3;//Define o número de tentativas que o usuário terá para acertar a senha.
            
            for(int i=0;i<tentativas;i++)
            {
                if(!senha.equals(password.senha))
                    
                {
                    
                    senha = JOptionPane.showInputDialog(null,"Este aplicativo é válido apenas para "
                            +data.MES_VALIDO_STR+" de "
                            +data.ANO_VALIDO+".\nCaso queira liberar o acesso digite a senha do desenvolvedor: ","Acesso Bloqueado "
                                    +(i+1)+"ª tentativa.",JOptionPane.OK_CANCEL_OPTION);
                    
                }
                
            }
            
            
            if (!senha.equals(password.senha) || senha.equals(null))
                
            {
                Mostra_Mensagem("Senha incorreta ou operação cancelada, o programa será encerrado.","Aviso");
                System.exit(0);
            }
            else
            {
                Mostra_Mensagem("Acesso liberado.","Welcome");
            }
        }
        else
        {
        
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

    public static void Mostra_Mensagem(String mensagem, String titulo){
        JOptionPane.showMessageDialog(null,mensagem,titulo,JOptionPane.WARNING_MESSAGE);
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
        DIA_DO_ANO = new javax.swing.JLabel();
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
        setExtendedState(1);
        setForeground(new java.awt.Color(0, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
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

        DIA_DO_ANO.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        DIA_DO_ANO.setForeground(new java.awt.Color(255, 255, 255));
        DIA_DO_ANO.setText("366");
        DIA_DO_ANO.setToolTipText("Dia do Ano");
        JanelaInternaPrincipal.add(DIA_DO_ANO);
        DIA_DO_ANO.setBounds(400, 650, 87, 30);

        label_tempo_logado.setBackground(new java.awt.Color(255, 255, 255));
        label_tempo_logado.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label_tempo_logado.setForeground(new java.awt.Color(255, 255, 255));
        label_tempo_logado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_tempo_logado.setText("00:00:00");
        label_tempo_logado.setToolTipText("Tempo de execusão do programa");
        JanelaInternaPrincipal.add(label_tempo_logado);
        label_tempo_logado.setBounds(0, 650, 180, 40);
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
        JanelaInternaPrincipal.add(menu_sobre);
        menu_sobre.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void MENU_PRODUCAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_PRODUCAOActionPerformed
        // TODO add your handling code here:
        JanelaInternaPrincipal.add(menu_producao);
        menu_producao.setVisible(true);
        menu_producao.setTitle("Relatório de Acompanhamento de Metas Diário - "+data.MES_VALIDO_STR+" "+data.ANO_VALIDO);
    }//GEN-LAST:event_MENU_PRODUCAOActionPerformed
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        DIA_DO_ANO.setText(""+data.dia_do_ano);
        
        //this.setExtendedState(MAXIMIZED_BOTH);//DEFINE A JANELA PARA INICIAR MAXIMIZADA
        this.setExtendedState(ICONIFIED);//DEFINE A JANELA PARA INICIAR MINIMIZADA
        
        int delay = 1000;//1000
        //
        timer = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                contador++;
                
                if(contador == 3 && minutos_int == 0){
                    setExtendedState(MAXIMIZED_BOTH);
                }
                
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
                    //play("/Interfaces/SONS/animacao1");// SE
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
                
                if((contador == 0) || (contador == 4) || (contador == 8) || (contador == 12) || (contador == 16) || (contador == 20) || 
                  (contador == 24) || (contador == 28) || (contador == 32) || (contador == 36) || (contador == 40) || (contador == 44) || 
                  (contador == 48) || (contador == 52) || (contador == 56)){
                    
                    Random numero_aleatorio1 = new Random();
                    Random numero_aleatorio2 = new Random();
                    
                    HORIZONTAL = numero_aleatorio1.nextInt(1001);//NUMEROS ALEATORIOS ENTRE 0 E O NUMERO DEFINIDO MENOS 1
                    VERTICAL = numero_aleatorio2.nextInt(651);//NUMEROS ALEATORIOS ENTRE 0 E O NUMERO DEFINIDO MENOS 1
                    
                    label_tempo_logado.setLocation(HORIZONTAL, VERTICAL);
                    
                    label_tempo_logado.setForeground(Color.CYAN);//DEFINE A COR DO LABEL
                }
                else
                if((contador == 1) || (contador == 5) || (contador == 9) || (contador == 13) || (contador == 17) || (contador == 21) || 
                  (contador == 25) || (contador == 29) || (contador == 33) || (contador == 37) || (contador == 41) || (contador == 45) || 
                  (contador == 49) || (contador == 53) || (contador == 57)){
                    
                    Random numero_aleatorio1 = new Random();
                    Random numero_aleatorio2 = new Random();
                    
                    HORIZONTAL = numero_aleatorio1.nextInt(1001);//NUMEROS ALEATORIOS ENTRE 0 E O NUMERO DEFINIDO MENOS 1
                    VERTICAL = numero_aleatorio2.nextInt(651);//NUMEROS ALEATORIOS ENTRE 0 E O NUMERO DEFINIDO MENOS 1
                    
                    label_tempo_logado.setLocation(HORIZONTAL, VERTICAL);
                    
                    label_tempo_logado.setForeground(Color.RED);//DEFINE A COR DO LABEL
                }
                else
                if((contador == 2) || (contador == 6) || (contador == 10) || (contador == 14) || (contador == 18) || (contador == 22) || 
                  (contador == 26) || (contador == 30) || (contador == 34) || (contador == 38) || (contador == 42) || (contador == 46) || 
                  (contador == 50) || (contador == 54) || (contador == 58)){
                    
                    Random numero_aleatorio1 = new Random();
                    Random numero_aleatorio2 = new Random();
                    
                    HORIZONTAL = numero_aleatorio1.nextInt(1001);//NUMEROS ALEATORIOS ENTRE 0 E O NUMERO DEFINIDO MENOS 1
                    VERTICAL = numero_aleatorio2.nextInt(651);//NUMEROS ALEATORIOS ENTRE 0 E O NUMERO DEFINIDO MENOS 1
                    
                    label_tempo_logado.setLocation(HORIZONTAL, VERTICAL);
                    
                    label_tempo_logado.setForeground(Color.YELLOW);//DEFINE A COR DO LABEL
                }
                else
                if((contador == 3) || (contador == 7) || (contador == 11) || (contador == 15) || (contador == 19) || (contador == 23) || 
                  (contador == 27) || (contador == 31) || (contador == 35) || (contador == 39) || (contador == 43) || (contador == 47) || 
                  (contador == 51) || (contador == 55) || (contador == 59)){
                    
                    Random numero_aleatorio1 = new Random();
                    Random numero_aleatorio2 = new Random();
                    
                    HORIZONTAL = numero_aleatorio1.nextInt(1001);//NUMEROS ALEATORIOS ENTRE 0 E O NUMERO DEFINIDO MENOS 1
                    VERTICAL = numero_aleatorio2.nextInt(651);//NUMEROS ALEATORIOS ENTRE 0 E O NUMERO DEFINIDO MENOS 1
                    
                    label_tempo_logado.setLocation(HORIZONTAL, VERTICAL);
                    label_tempo_logado.setForeground(Color.GREEN);//DEFINE A COR DO LABEL
                    
                    
                }
                
                /*if(label_tempo_logado.getText().equals("00:00:10")){
                    System.exit(0);
                }*/
                
                label_tempo_logado.setFont(new java.awt.Font("Comic Sans MS", 1, 40)); //DEFINE OPÇÕES DA FONTE
                
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
                        JanelaInternaPrincipal.add(menu_f4);
                        menu_f4.setVisible(true);
                           return true;
                     }
                    else
                        if(event.getID() == KeyEvent.KEY_RELEASED 
                       && event.getKeyCode() == KeyEvent.VK_F1){
                        JanelaInternaPrincipal.add(menu_sobre);
                        menu_sobre.setVisible(true);
                           return true;
                     }
                    else
                        if(event.getID() == KeyEvent.KEY_RELEASED 
                       && event.getKeyCode() == KeyEvent.VK_F3){
                        JanelaInternaPrincipal.add(tela_do_grafico);
                        tela_do_grafico.setVisible(true);
                           return true;
                     }
                     return false;
                }
        }); 
          
        /////////////////////

        timer = new Timer(1000, new hora());//FAZ PARTE DO CODIGO PARA MOSTRAR A HORA
        timer.start();
        
        java.io.File DIRETORIO_PRINCIPAL = new java.io.File("C:\\PRODUCAO");
        java.io.File DIRETORIO_SETORES = new java.io.File("C:\\PRODUCAO\\SETORES");
        java.io.File DIRETORIO_ANTEDIMENTO = new java.io.File("C:\\PRODUCAO\\ATENDIMENTO");
        java.io.File DIRETORIO_TECNICOS = new java.io.File("C:\\PRODUCAO\\TECNICOS");
        java.io.File DIRETORIO_DATAS = new java.io.File("C:\\PRODUCAO\\DATAS");
        
        DIRETORIO_SETORES.mkdir();
        DIRETORIO_PRINCIPAL.mkdir();
        DIRETORIO_ANTEDIMENTO.mkdir();
        DIRETORIO_TECNICOS.mkdir();
        DIRETORIO_DATAS.mkdir();
        
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
        java.io.File SETOR_RECEPCAO = new java.io.File(DIRETORIO_SETORES, "RECEPCAO.txt");
        
        FileWriter Meta_Eletronica = null;
        
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
            SETOR_RECEPCAO.createNewFile();
            
            //Meta_Eletronica = new FileWriter(SETOR_ELETRONICA);
            
            } catch (IOException ex) {
            Logger.getLogger(MENU_PRODUCAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //AS PARTES COMO COMENTARIO DEFINEM AUTOMATICAMENTE O VALOR DA META DIARIA DO SETOR
        
        /*PrintWriter gravarArq = new PrintWriter(Meta_Eletronica);
        
        {
              gravarArq.println("2");
        }
        
        try {
            Meta_Eletronica.close();
        } catch (IOException ex) {
            Logger.getLogger(TELA_PRINCIPAL.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        setTitle(loja.loja);//DEFINE O TITULO DA JANELA PRINCIPAL ATRAVES DA CLASSE LOJA
        
    }//GEN-LAST:event_formWindowOpened

    private void MENU_LOCALIZAR_COLABORADORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_LOCALIZAR_COLABORADORActionPerformed
        // TODO add your handling code here:
        JanelaInternaPrincipal.add(menu_localizar_colaborador);
        menu_localizar_colaborador.setVisible(true);
    }//GEN-LAST:event_MENU_LOCALIZAR_COLABORADORActionPerformed

    private void MENU_CADASTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_CADASTRARActionPerformed
        // TODO add your handling code here:
        JanelaInternaPrincipal.add(menu_inspecao);
        menu_inspecao.setVisible(true);
    }//GEN-LAST:event_MENU_CADASTRARActionPerformed

    private void MENU_LOCALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_LOCALIZARActionPerformed
        // TODO add your handling code here:
        JanelaInternaPrincipal.add(menu_localizar);
        menu_localizar.setVisible(true);
    }//GEN-LAST:event_MENU_LOCALIZARActionPerformed

    private void MENU_ORDEM_DE_SERVICOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_ORDEM_DE_SERVICOActionPerformed
        // TODO add your handling code here:
        JanelaInternaPrincipal.add(menu_ordem_de_servico);
        menu_ordem_de_servico.setVisible(true);
    }//GEN-LAST:event_MENU_ORDEM_DE_SERVICOActionPerformed

    private void MENU_PONTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_PONTOActionPerformed
        // TODO add your handling code here:
        JanelaInternaPrincipal.add(menu_ponto);
        menu_ponto.setVisible(true);
    }//GEN-LAST:event_MENU_PONTOActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        
        //JOptionPane.showMessageDialog(null,"A Janela foi fechada.");
        
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        
        //JOptionPane.showMessageDialog(null,"A Janela foi fechada 2.");
        
    }//GEN-LAST:event_formWindowClosing

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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CRONOMETRO;
    private javax.swing.JLabel DATA;
    private javax.swing.JLabel DIA_DO_ANO;
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
    
now = Calendar.getInstance();
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