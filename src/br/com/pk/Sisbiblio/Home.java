package br.com.pk.Sisbiblio;

import br.com.pk.Sisbiblio.bean.Genero;
import br.com.pk.Sisbiblio.model.GeneroDao;
import com.bulenkov.darcula.DarculaLaf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.basic.BasicLookAndFeel;

public class Home extends javax.swing.JFrame {
    GeneroDao dao = new GeneroDao();
    Genero g = new Genero();

    public Home() {
        BasicLookAndFeel darcula = new DarculaLaf();
        try {
            UIManager.setLookAndFeel(darcula);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        txtaltgen.setVisible(false);
        lblaltgen.setVisible(false);
        btnaltgen.setVisible(false);
        btndelgen.setVisible(false);
        txtcadgen.setEditable(true);
        txtidgen.setVisible(false);
        atualizacombobox();
    }
    
    public void atualizacombobox(){
        cbgen.removeAllItems();
        for (Genero g: dao.listaGenero()){
            
            cbgen.addItem(g);
        };
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jpautor = new javax.swing.JPanel();
        jplocalizacao = new javax.swing.JPanel();
        jpeditora = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sisbiblio Darcula 0.1®");
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
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
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jtsisbiblio.addTab("GÊNERO", jpgenero);

        javax.swing.GroupLayout jplivroLayout = new javax.swing.GroupLayout(jplivro);
        jplivro.setLayout(jplivroLayout);
        jplivroLayout.setHorizontalGroup(
            jplivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        jplivroLayout.setVerticalGroup(
            jplivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
        );

        jtsisbiblio.addTab("LIVRO", jplivro);

        javax.swing.GroupLayout jpusuarioLayout = new javax.swing.GroupLayout(jpusuario);
        jpusuario.setLayout(jpusuarioLayout);
        jpusuarioLayout.setHorizontalGroup(
            jpusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        jpusuarioLayout.setVerticalGroup(
            jpusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
        );

        jtsisbiblio.addTab("USUÁRIO", jpusuario);

        javax.swing.GroupLayout jpfuncionarioLayout = new javax.swing.GroupLayout(jpfuncionario);
        jpfuncionario.setLayout(jpfuncionarioLayout);
        jpfuncionarioLayout.setHorizontalGroup(
            jpfuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        jpfuncionarioLayout.setVerticalGroup(
            jpfuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
        );

        jtsisbiblio.addTab("FUNCIONÁRIO", jpfuncionario);

        javax.swing.GroupLayout jpautorLayout = new javax.swing.GroupLayout(jpautor);
        jpautor.setLayout(jpautorLayout);
        jpautorLayout.setHorizontalGroup(
            jpautorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        jpautorLayout.setVerticalGroup(
            jpautorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
        );

        jtsisbiblio.addTab("AUTOR", jpautor);

        javax.swing.GroupLayout jplocalizacaoLayout = new javax.swing.GroupLayout(jplocalizacao);
        jplocalizacao.setLayout(jplocalizacaoLayout);
        jplocalizacaoLayout.setHorizontalGroup(
            jplocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        jplocalizacaoLayout.setVerticalGroup(
            jplocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
        );

        jtsisbiblio.addTab("LOCALIZAÇÃO", jplocalizacao);

        javax.swing.GroupLayout jpeditoraLayout = new javax.swing.GroupLayout(jpeditora);
        jpeditora.setLayout(jpeditoraLayout);
        jpeditoraLayout.setHorizontalGroup(
            jpeditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        jpeditoraLayout.setVerticalGroup(
            jpeditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
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
            .addComponent(jtsisbiblio, javax.swing.GroupLayout.PREFERRED_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnpesqgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesqgenActionPerformed
        txtcadgen.setEditable(false);
        btncadgen.setVisible(false);
        btnaltgen.setVisible(true);
        btndelgen.setVisible(true);
        txtaltgen.setVisible(true);
        lblaltgen.setVisible(true);
        Genero gcad = (Genero) cbgen.getSelectedItem();
        txtcadgen.setText(gcad.getNome().toString());
        txtidgen.setText(gcad.getId().toString());        
    }//GEN-LAST:event_btnpesqgenActionPerformed

    private void btncadgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadgenActionPerformed
        if ((txtcadgen.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Por favor preencha o campo!");
        } else {
            g.setNome(txtcadgen.getText());
            dao.criaGenero(g);
            txtcadgen.setText("");
            atualizacombobox();
        }
    }//GEN-LAST:event_btncadgenActionPerformed

    private void btnaltgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaltgenActionPerformed
        txtcadgen.setEditable(true);
        lblaltgen.setVisible(false);
        txtaltgen.setVisible(false);
        btncadgen.setVisible(true);
        btndelgen.setVisible(false);
        btnaltgen.setVisible(false);
        g.setNome(txtaltgen.getText());
        g.setId(Long.parseLong(txtidgen.getText()));
        dao.atualizaGenero(g,g);
        txtcadgen.setText("");
        txtaltgen.setText("");
        atualizacombobox();
    }//GEN-LAST:event_btnaltgenActionPerformed

    private void btndelgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelgenActionPerformed
        txtcadgen.setEditable(true);
        lblaltgen.setVisible(false);
        txtaltgen.setVisible(false);
        btncadgen.setVisible(true);
        btndelgen.setVisible(false);
        btnaltgen.setVisible(false);
        g.setNome(txtcadgen.getText());
        g.setId(Long.parseLong(txtidgen.getText()));
        dao.excluiGenero(g);
        txtcadgen.setText("");
        txtaltgen.setText("");
        atualizacombobox();
        txtcadgen.requestFocus();
    }//GEN-LAST:event_btndelgenActionPerformed

    private void btnlmpgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlmpgenActionPerformed
        txtcadgen.setText("");
        txtcadgen.setEditable(true);
        btncadgen.setVisible(true);
        btnaltgen.setVisible(false);
        btndelgen.setVisible(false);
        txtaltgen.setVisible(false);
        lblaltgen.setVisible(false);
        txtcadgen.requestFocus();
    }//GEN-LAST:event_btnlmpgenActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaltgen;
    private javax.swing.JButton btncadgen;
    private javax.swing.JButton btndelgen;
    private javax.swing.JButton btnlmpgen;
    private javax.swing.JButton btnpesqgen;
    private javax.swing.JComboBox<Object> cbgen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jpautor;
    private javax.swing.JPanel jpeditora;
    private javax.swing.JPanel jpfuncionario;
    private javax.swing.JPanel jpgenero;
    private javax.swing.JPanel jplivro;
    private javax.swing.JPanel jplocalizacao;
    private javax.swing.JPanel jpusuario;
    private javax.swing.JTabbedPane jtsisbiblio;
    private javax.swing.JLabel lblaltgen;
    private javax.swing.JTextField txtaltgen;
    private javax.swing.JTextField txtcadgen;
    private javax.swing.JTextField txtidgen;
    // End of variables declaration//GEN-END:variables

}
