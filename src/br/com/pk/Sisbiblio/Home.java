package br.com.pk.Sisbiblio;

import br.com.pk.Sisbiblio.bean.Funcionario;
import br.com.pk.Sisbiblio.bean.Genero;
import br.com.pk.Sisbiblio.model.FuncionarioDao;
import br.com.pk.Sisbiblio.model.GeneroDao;
import com.bulenkov.darcula.DarculaLaf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.basic.BasicLookAndFeel;

public class Home extends javax.swing.JFrame {
    int tab;
    GeneroDao gendao = new GeneroDao();
    Genero gen = new Genero();
    FuncionarioDao funcdao = new FuncionarioDao();
    Funcionario func = new Funcionario();

    public Home() {
        BasicLookAndFeel darcula = new DarculaLaf();
        try {
            UIManager.setLookAndFeel(darcula);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        startTela();
    }
    
    
    public void atualizaCombobox(){
        tab = jtsisbiblio.getSelectedIndex();
        switch (tab) {
            case 0:
        cbgen.removeAllItems();
        for (Genero gen: gendao.listaGenero()){
            cbgen.addItem(gen);
        };
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                cbfunc.removeAllItems();
                for (Funcionario func: funcdao.listaFunc()){
                    cbfunc.addItem(func);
                };
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                break;

        }
    }

    public void startTela(){
        //comboBox Gênero
        for (Genero gen: gendao.listaGenero()){
            cbgen.addItem(gen);
        }
        //comboBox Funcionário
        for (Funcionario func: funcdao.listaFunc()){
            cbfunc.addItem(func);
        }
        //Campos jPanel Gênero
        txtaltgen.setVisible(false);
        lblaltgen.setVisible(false);
        btnaltgen.setVisible(false);
        btndelgen.setVisible(false);
        txtidgen.setVisible(false);
        txtcadgen.requestFocus();
        //Campos jPanel Funcionário
//        txtidfunc.setVisible(false);
        lblaltfunc.setVisible(false);
        btncopiacpffunc.setVisible(false);
        txtaltcpffunc.setVisible(false);
        btncopianomefunc.setVisible(false);
        txtaltnomefunc.setVisible(false);
        btncopiafunfunc.setVisible(false);
        txtaltfunfunc.setVisible(false);
        btnaltfunc.setVisible(false);
        btndelfunc.setVisible(false);
    }
    
    public void arrumaTelas(){
        tab = jtsisbiblio.getSelectedIndex();
        switch (tab) {
            case 0:
                txtcadgen.setEditable(true);
                txtaltgen.setVisible(false);
                lblaltgen.setVisible(false);
                btnaltgen.setVisible(false);
                btndelgen.setVisible(false);
                txtidgen.setVisible(false);
                btncadgen.setVisible(true);
                txtcadgen.requestFocus();
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                bgfunc.clearSelection();
                txtcadcpffunc.requestFocus();
                txtcadcpffunc.setEditable(true);
                txtcadnomefunc.setEditable(true);
                txtcadfunfunc.setEditable(true);
                btncadfunc.setVisible(true);
                lblaltfunc.setVisible(false);
                btncopiacpffunc.setVisible(false);
                txtaltcpffunc.setVisible(false);
                btncopianomefunc.setVisible(false);
                txtaltnomefunc.setVisible(false);
                btncopiafunfunc.setVisible(false);
                txtaltfunfunc.setVisible(false);
                btnaltfunc.setVisible(false);
                btndelfunc.setVisible(false);
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                break;
        }        
    }
    
    public void pesqTelas(){ 
        tab = jtsisbiblio.getSelectedIndex();
        switch (tab) {
            case 0:
                txtcadgen.setEditable(false);
                btncadgen.setVisible(false);
                btnaltgen.setVisible(true);
                btndelgen.setVisible(true);
                txtaltgen.setVisible(true);
                lblaltgen.setVisible(true);
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                txtcadcpffunc.setEditable(false);
                txtcadnomefunc.setEditable(false);
                txtcadfunfunc.setEditable(false);
                btncadfunc.setVisible(false);
                lblaltfunc.setVisible(true);
                btncopiacpffunc.setVisible(true);
                txtaltcpffunc.setVisible(true);
                btncopianomefunc.setVisible(true);
                txtaltnomefunc.setVisible(true);
                btncopiafunfunc.setVisible(true);
                txtaltfunfunc.setVisible(true);
                btnaltfunc.setVisible(true);
                btndelfunc.setVisible(true);
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                break;
        }        
    }
    
    public void limpaTelas(){
        tab = jtsisbiblio.getSelectedIndex();
        switch (tab) {
            case 0:
                txtcadgen.setText("");
                txtaltgen.setText("");
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                txtcadcpffunc.setText("");
                txtcadnomefunc.setText("");
                txtcadfunfunc.setText("");
                txtaltcpffunc.setText("");
                txtaltnomefunc.setText("");
                txtaltfunfunc.setText("");
                bgfunc.clearSelection();
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                break;
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgfunc = new javax.swing.ButtonGroup();
        jtsisbiblio = new javax.swing.JTabbedPane();
        jpgenero = new javax.swing.JPanel();
        cbgen = new javax.swing.JComboBox<>();
        btnpesqgen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblaltgen = new javax.swing.JLabel();
        txtcadgen = new javax.swing.JTextField();
        txtaltgen = new javax.swing.JTextField();
        btncadgen = new javax.swing.JButton();
        btnaltgen = new javax.swing.JButton();
        btnlmpgen = new javax.swing.JButton();
        btndelgen = new javax.swing.JButton();
        txtidgen = new javax.swing.JTextField();
        jplivro = new javax.swing.JPanel();
        jpusuario = new javax.swing.JPanel();
        jpfuncionario = new javax.swing.JPanel();
        cbfunc = new javax.swing.JComboBox<>();
        btnpesqfunc = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcadnomefunc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcadfunfunc = new javax.swing.JTextField();
        btncadfunc = new javax.swing.JButton();
        btnlmpfunc = new javax.swing.JButton();
        btnaltfunc = new javax.swing.JButton();
        btndelfunc = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        rbfunA = new javax.swing.JRadioButton();
        rbfunD = new javax.swing.JRadioButton();
        lblaltfunc = new javax.swing.JLabel();
        txtaltcpffunc = new javax.swing.JTextField();
        txtaltnomefunc = new javax.swing.JTextField();
        txtaltfunfunc = new javax.swing.JTextField();
        btncopiacpffunc = new javax.swing.JButton();
        btncopianomefunc = new javax.swing.JButton();
        btncopiafunfunc = new javax.swing.JButton();
        txtidfunc = new javax.swing.JTextField();
        txtcadcpffunc = new javax.swing.JFormattedTextField();
        jpautor = new javax.swing.JPanel();
        jplocalizacao = new javax.swing.JPanel();
        jpeditora = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sisbiblio Darcula 0.53®");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(60, 63, 64));
        setMaximumSize(new java.awt.Dimension(474, 365));
        setResizable(false);

        jtsisbiblio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtsisbiblio.setMaximumSize(new java.awt.Dimension(474, 365));
        jtsisbiblio.setPreferredSize(new java.awt.Dimension(474, 365));

        btnpesqgen.setText("Alterar/Pesquisar");
        btnpesqgen.setPreferredSize(new java.awt.Dimension(109, 32));
        btnpesqgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesqgenActionPerformed(evt);
            }
        });

        jLabel1.setText("Gênero");

        lblaltgen.setText("Alterar para");

        btncadgen.setText("Cadastrar");
        btncadgen.setMaximumSize(new java.awt.Dimension(69, 32));
        btncadgen.setMinimumSize(new java.awt.Dimension(109, 32));
        btncadgen.setPreferredSize(new java.awt.Dimension(100, 32));
        btncadgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadgenActionPerformed(evt);
            }
        });

        btnaltgen.setText("Alterar");
        btnaltgen.setMinimumSize(new java.awt.Dimension(109, 32));
        btnaltgen.setPreferredSize(new java.awt.Dimension(100, 32));
        btnaltgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaltgenActionPerformed(evt);
            }
        });

        btnlmpgen.setText("Limpar Dados");
        btnlmpgen.setPreferredSize(new java.awt.Dimension(100, 32));
        btnlmpgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlmpgenActionPerformed(evt);
            }
        });

        btndelgen.setText("Excluir");
        btndelgen.setPreferredSize(new java.awt.Dimension(100, 32));
        btndelgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelgenActionPerformed(evt);
            }
        });

        txtidgen.setBackground(new java.awt.Color(60, 63, 65));
        txtidgen.setBorder(null);

        javax.swing.GroupLayout jpgeneroLayout = new javax.swing.GroupLayout(jpgenero);
        jpgenero.setLayout(jpgeneroLayout);
        jpgeneroLayout.setHorizontalGroup(
            jpgeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpgeneroLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jpgeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblaltgen)
                    .addGroup(jpgeneroLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43)
                        .addComponent(txtidgen, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btncadgen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnaltgen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbgen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jpgeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtaltgen)
                    .addComponent(btnlmpgen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndelgen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtcadgen)
                    .addComponent(btnpesqgen, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                .addGap(79, 79, 79))
        );
        jpgeneroLayout.setVerticalGroup(
            jpgeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpgeneroLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpgeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpesqgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jpgeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcadgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtidgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpgeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblaltgen)
                    .addComponent(txtaltgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpgeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncadgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlmpgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpgeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndelgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnaltgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jtsisbiblio.addTab("GÊNERO", jpgenero);

        javax.swing.GroupLayout jplivroLayout = new javax.swing.GroupLayout(jplivro);
        jplivro.setLayout(jplivroLayout);
        jplivroLayout.setHorizontalGroup(
            jplivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
        );
        jplivroLayout.setVerticalGroup(
            jplivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 314, Short.MAX_VALUE)
        );

        jtsisbiblio.addTab("LIVRO", jplivro);

        javax.swing.GroupLayout jpusuarioLayout = new javax.swing.GroupLayout(jpusuario);
        jpusuario.setLayout(jpusuarioLayout);
        jpusuarioLayout.setHorizontalGroup(
            jpusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
        );
        jpusuarioLayout.setVerticalGroup(
            jpusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 314, Short.MAX_VALUE)
        );

        jtsisbiblio.addTab("USUÁRIO", jpusuario);

        btnpesqfunc.setText("Alterar/Excluir");
        btnpesqfunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesqfuncActionPerformed(evt);
            }
        });

        jLabel2.setText("CPF");

        jLabel3.setText("Nome");

        jLabel4.setText("Função");

        btncadfunc.setText("Cadastrar");
        btncadfunc.setPreferredSize(new java.awt.Dimension(130, 32));
        btncadfunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadfuncActionPerformed(evt);
            }
        });

        btnlmpfunc.setText("Limpar Dados");
        btnlmpfunc.setMaximumSize(new java.awt.Dimension(130, 32));
        btnlmpfunc.setPreferredSize(new java.awt.Dimension(130, 32));
        btnlmpfunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlmpfuncActionPerformed(evt);
            }
        });

        btnaltfunc.setText("Alterar");
        btnaltfunc.setPreferredSize(new java.awt.Dimension(130, 32));
        btnaltfunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaltfuncActionPerformed(evt);
            }
        });

        btndelfunc.setText("Excluir");
        btndelfunc.setPreferredSize(new java.awt.Dimension(130, 32));
        btndelfunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelfuncActionPerformed(evt);
            }
        });

        jLabel5.setText("Status");

        bgfunc.add(rbfunA);
        rbfunA.setText("Ativo");

        bgfunc.add(rbfunD);
        rbfunD.setText("Desativado");

        lblaltfunc.setText("Alterar Para");

        btncopiacpffunc.setText("");
        btncopiacpffunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncopiacpffuncActionPerformed(evt);
            }
        });

        btncopianomefunc.setText("");
        btncopianomefunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncopianomefuncActionPerformed(evt);
            }
        });

        btncopiafunfunc.setText("");
        btncopiafunfunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncopiafunfuncActionPerformed(evt);
            }
        });

        txtidfunc.setEditable(false);
        txtidfunc.setBackground(new java.awt.Color(60, 63, 65));
        txtidfunc.setText("666");
        txtidfunc.setBorder(null);

        txtcadcpffunc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("00000000000"))));

        javax.swing.GroupLayout jpfuncionarioLayout = new javax.swing.GroupLayout(jpfuncionario);
        jpfuncionario.setLayout(jpfuncionarioLayout);
        jpfuncionarioLayout.setHorizontalGroup(
            jpfuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpfuncionarioLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jpfuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpfuncionarioLayout.createSequentialGroup()
                        .addGroup(jpfuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbfunc, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncadfunc, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnaltfunc, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpfuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btndelfunc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnlmpfunc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnpesqfunc, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jpfuncionarioLayout.createSequentialGroup()
                        .addGroup(jpfuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpfuncionarioLayout.createSequentialGroup()
                                .addGroup(jpfuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(37, 37, 37))
                            .addGroup(jpfuncionarioLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtidfunc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jpfuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpfuncionarioLayout.createSequentialGroup()
                                .addComponent(rbfunA)
                                .addGap(18, 18, 18)
                                .addComponent(rbfunD))
                            .addComponent(txtcadfunfunc)
                            .addComponent(txtcadnomefunc)
                            .addComponent(txtcadcpffunc))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpfuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpfuncionarioLayout.createSequentialGroup()
                        .addGroup(jpfuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btncopiacpffunc)
                            .addComponent(btncopianomefunc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncopiafunfunc, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpfuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtaltcpffunc)
                            .addComponent(txtaltnomefunc)
                            .addComponent(txtaltfunfunc, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpfuncionarioLayout.createSequentialGroup()
                        .addGap(0, 89, Short.MAX_VALUE)
                        .addComponent(lblaltfunc)
                        .addGap(54, 54, 54))))
        );
        jpfuncionarioLayout.setVerticalGroup(
            jpfuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpfuncionarioLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jpfuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbfunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpesqfunc)
                    .addComponent(lblaltfunc))
                .addGap(18, 18, 18)
                .addGroup(jpfuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtaltcpffunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncopiacpffunc)
                    .addComponent(txtidfunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcadcpffunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpfuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcadnomefunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtaltnomefunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncopianomefunc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpfuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcadfunfunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtaltfunfunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncopiafunfunc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpfuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rbfunA)
                    .addComponent(rbfunD))
                .addGap(9, 9, 9)
                .addGroup(jpfuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncadfunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlmpfunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpfuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaltfunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndelfunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtsisbiblio.addTab("FUNCIONÁRIO", jpfuncionario);

        javax.swing.GroupLayout jpautorLayout = new javax.swing.GroupLayout(jpautor);
        jpautor.setLayout(jpautorLayout);
        jpautorLayout.setHorizontalGroup(
            jpautorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
        );
        jpautorLayout.setVerticalGroup(
            jpautorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 314, Short.MAX_VALUE)
        );

        jtsisbiblio.addTab("AUTOR", jpautor);

        javax.swing.GroupLayout jplocalizacaoLayout = new javax.swing.GroupLayout(jplocalizacao);
        jplocalizacao.setLayout(jplocalizacaoLayout);
        jplocalizacaoLayout.setHorizontalGroup(
            jplocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
        );
        jplocalizacaoLayout.setVerticalGroup(
            jplocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 314, Short.MAX_VALUE)
        );

        jtsisbiblio.addTab("LOCALIZAÇÃO", jplocalizacao);

        javax.swing.GroupLayout jpeditoraLayout = new javax.swing.GroupLayout(jpeditora);
        jpeditora.setLayout(jpeditoraLayout);
        jpeditoraLayout.setHorizontalGroup(
            jpeditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
        );
        jpeditoraLayout.setVerticalGroup(
            jpeditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 314, Short.MAX_VALUE)
        );

        jtsisbiblio.addTab("EDITORA", jpeditora);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtsisbiblio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtsisbiblio, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnpesqgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesqgenActionPerformed
        pesqTelas();
        gen = (Genero)cbgen.getSelectedItem();
        txtcadgen.setText(gen.getNome());
        txtidgen.setText(gen.getId().toString());        
    }//GEN-LAST:event_btnpesqgenActionPerformed

    private void btncadgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadgenActionPerformed
        if (txtcadgen.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor preencha o campo!");
        } else {
            gen.setNome(txtcadgen.getText());
            gendao.criaGenero(gen);
            limpaTelas();
            arrumaTelas();
            atualizaCombobox();
        }
    }//GEN-LAST:event_btncadgenActionPerformed

    private void btnaltgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaltgenActionPerformed
        if (txtaltgen.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(null,"Por favor preencha o campo");
                txtaltgen.setText("");
                txtaltgen.requestFocus();
        }else{
            gen.setNome(txtaltgen.getText());
            gen.setId(Long.parseLong(txtidgen.getText()));
            gendao.atualizaGenero(gen,gen);
            limpaTelas();
            arrumaTelas();
            atualizaCombobox();
        }
    }//GEN-LAST:event_btnaltgenActionPerformed

    private void btndelgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelgenActionPerformed
        gen.setNome(txtcadgen.getText());
        gen.setId(Long.parseLong(txtidgen.getText()));
        gendao.excluiGenero(gen);
        limpaTelas();
        arrumaTelas();
        atualizaCombobox();
    }//GEN-LAST:event_btndelgenActionPerformed

    private void btnlmpgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlmpgenActionPerformed
        limpaTelas();
        arrumaTelas();
    }//GEN-LAST:event_btnlmpgenActionPerformed

    private void btnlmpfuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlmpfuncActionPerformed
        limpaTelas();
        arrumaTelas();
    }//GEN-LAST:event_btnlmpfuncActionPerformed

    private void btnpesqfuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesqfuncActionPerformed
        pesqTelas();
        String st;
        func = (Funcionario)cbfunc.getSelectedItem();
        txtcadcpffunc.setText(func.getCPF().toString());
        txtcadnomefunc.setText(func.getNome());
        txtcadfunfunc.setText(func.getFuncao());
        txtidfunc.setText(func.getID().toString()); 
        st=func.getStatus();
        //JOptionPane.showMessageDialog(null,st);
        if (st.equals("A")){
            rbfunA.setSelected(true);
        }else{
            rbfunD.setSelected(true);
        }
    }//GEN-LAST:event_btnpesqfuncActionPerformed

    private void btnaltfuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaltfuncActionPerformed
        func.setCPF(Integer.parseInt(txtaltcpffunc.getText()));
        func.setNome(txtaltnomefunc.getText());
        func.setFuncao(txtaltfunfunc.getText());
        if (rbfunA.isSelected()){
            func.setStatus("A");
        }else{
            func.setStatus("D");
        }
        func.setID(Integer.parseInt(txtidfunc.getText()));
        if (txtaltcpffunc.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null,"Por favor preencha o campo");
            txtaltcpffunc.requestFocus();
        }else if (txtaltnomefunc.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null,"Por favor preencha o campo");
            txtaltnomefunc.requestFocus();            
        }else if (txtaltfunfunc.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null,"Por favor preencha o campo");
            txtaltfunfunc.requestFocus();
        }else{
        funcdao.atualizaFunc(func);
        limpaTelas();
        arrumaTelas();
        atualizaCombobox();
        }
    }//GEN-LAST:event_btnaltfuncActionPerformed

    private void btndelfuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelfuncActionPerformed
        func.setNome(txtcadnomefunc.getText());
        funcdao.excluiFunc(func);
        limpaTelas();
        arrumaTelas();
        atualizaCombobox();
    }//GEN-LAST:event_btndelfuncActionPerformed

    private void btncadfuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadfuncActionPerformed
        if ((txtcadcpffunc.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Por favor preencha o campo!");
            txtcadcpffunc.requestFocus();
        }else if ((txtcadnomefunc.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Por favor preencha o campo!");
            txtcadnomefunc.requestFocus();
        }else if ((txtcadfunfunc.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Por favor preencha o campo!");
            txtcadcpffunc.requestFocus();
        }else if ((rbfunA.isSelected()==false)&&(rbfunD.isSelected()== false)) {
                  JOptionPane.showMessageDialog(null, "Selecione o Status");
        }
        else {
            func.setCPF(Integer.parseInt(txtcadcpffunc.getText()));
            func.setNome(txtcadnomefunc.getText());
            func.setFuncao(txtcadfunfunc.getText());
            if (rbfunA.isSelected()){
                func.setStatus("A");   
            }else{
                func.setStatus("D");   
            }
            funcdao.criaFunc(func);
            limpaTelas();
            arrumaTelas();
            atualizaCombobox();
        }
    }//GEN-LAST:event_btncadfuncActionPerformed

    private void btncopiacpffuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncopiacpffuncActionPerformed
        txtaltcpffunc.setText(txtcadcpffunc.getText());
    }//GEN-LAST:event_btncopiacpffuncActionPerformed

    private void btncopianomefuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncopianomefuncActionPerformed
        txtaltnomefunc.setText(txtcadnomefunc.getText());
    }//GEN-LAST:event_btncopianomefuncActionPerformed

    private void btncopiafunfuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncopiafunfuncActionPerformed
        txtaltfunfunc.setText(txtcadfunfunc.getText());
    }//GEN-LAST:event_btncopiafunfuncActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Home().setVisible(true);
        });
    }
    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgfunc;
    private javax.swing.JButton btnaltfunc;
    private javax.swing.JButton btnaltgen;
    private javax.swing.JButton btncadfunc;
    private javax.swing.JButton btncadgen;
    private javax.swing.JButton btncopiacpffunc;
    private javax.swing.JButton btncopiafunfunc;
    private javax.swing.JButton btncopianomefunc;
    private javax.swing.JButton btndelfunc;
    private javax.swing.JButton btndelgen;
    private javax.swing.JButton btnlmpfunc;
    private javax.swing.JButton btnlmpgen;
    private javax.swing.JButton btnpesqfunc;
    private javax.swing.JButton btnpesqgen;
    private javax.swing.JComboBox<Object> cbfunc;
    private javax.swing.JComboBox<Object> cbgen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jpautor;
    private javax.swing.JPanel jpeditora;
    private javax.swing.JPanel jpfuncionario;
    private javax.swing.JPanel jpgenero;
    private javax.swing.JPanel jplivro;
    private javax.swing.JPanel jplocalizacao;
    private javax.swing.JPanel jpusuario;
    private javax.swing.JTabbedPane jtsisbiblio;
    private javax.swing.JLabel lblaltfunc;
    private javax.swing.JLabel lblaltgen;
    private javax.swing.JRadioButton rbfunA;
    private javax.swing.JRadioButton rbfunD;
    private javax.swing.JTextField txtaltcpffunc;
    private javax.swing.JTextField txtaltfunfunc;
    private javax.swing.JTextField txtaltgen;
    private javax.swing.JTextField txtaltnomefunc;
    private javax.swing.JFormattedTextField txtcadcpffunc;
    private javax.swing.JTextField txtcadfunfunc;
    private javax.swing.JTextField txtcadgen;
    private javax.swing.JTextField txtcadnomefunc;
    private javax.swing.JTextField txtidfunc;
    private javax.swing.JTextField txtidgen;
    // End of variables declaration//GEN-END:variables

}
