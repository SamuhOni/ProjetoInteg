
package interfaceProj;

import conexao.ConexaoBanco;
import java.sql.Connection;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projetointegrador.AlunoProf;


public class TelaCadastro extends javax.swing.JFrame {

    
    public TelaCadastro() {
        initComponents();
        carregaTabela();
    }
 static Connection connection = null;
    
 public void carregaTabela() {
        DefaultTableModel tabelaModel = (DefaultTableModel) ListCadastro.getModel();
        tabelaModel.setRowCount(0);

        ConexaoBanco.getConexaoMySQL();
        List<AlunoProf> telaCadastro = ConexaoBanco.selectBancoAlunoProf();

        for (AlunoProf alunoprof : telaCadastro) {
            tabelaModel.addRow(new Object[]{
                alunoprof.getTipo(),
                alunoprof.getNome(),
                alunoprof.getCpf(),
                alunoprof.getFone()

            });
        }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        boxTipo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lCPF = new javax.swing.JLabel();
        Lrg = new javax.swing.JLabel();
        Lresponsavel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDataCadastro = new javax.swing.JFormattedTextField();
        txtNascimento = new javax.swing.JFormattedTextField();
        txtNome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        txtRG = new javax.swing.JFormattedTextField();
        txtFone = new javax.swing.JFormattedTextField();
        txtResponsavel = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListCadastro = new javax.swing.JTable();
        Lturma = new javax.swing.JLabel();
        Bcancelar = new javax.swing.JButton();
        Balterar = new javax.swing.JButton();
        Bsalvar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Lproficiencia = new javax.swing.JLabel();
        Bexcluir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        Senha = new javax.swing.JPasswordField();
        txtTurma = new javax.swing.JTextField();
        txtProficiencia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Cadastro");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nome:");

        boxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Aluno", "Professor(a)" }));
        boxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTipoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Data de nascimento:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Data de cadastro:");

        lCPF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lCPF.setText("CPF:");

        Lrg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lrg.setText("RG:");

        Lresponsavel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lresponsavel.setText("Responsavel:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Fone:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Endereço:");

        try {
            txtDataCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtFone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Tipo:");

        ListCadastro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tipo", "Nome", "CPF", "Fone"
            }
        ));
        jScrollPane1.setViewportView(ListCadastro);

        Lturma.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lturma.setText("Turma:");

        Bcancelar.setText("Cancelar");

        Balterar.setText("Alterar");
        Balterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BalterarActionPerformed(evt);
            }
        });

        Bsalvar.setText("Salvar");
        Bsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsalvarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel11.setText("Cadastro");

        Lproficiencia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lproficiencia.setText("Proficiência:");

        Bexcluir.setText("Excluir");
        Bexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BexcluirActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Usuario:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Senha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1)
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(260, 260, 260))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(37, 37, 37)
                                .addComponent(txtEndereco))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNascimento)
                                    .addComponent(txtDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lresponsavel)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtResponsavel)
                                    .addComponent(txtUsuario)
                                    .addComponent(Senha))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Lturma)
                                            .addComponent(jLabel7)
                                            .addComponent(lCPF)
                                            .addComponent(Lrg))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(Bcancelar)
                                            .addComponent(txtRG, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                            .addComponent(txtFone, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                            .addComponent(txtCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                            .addComponent(txtTurma)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Lproficiencia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtProficiencia, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(Bexcluir)
                                .addGap(207, 207, 207))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(29, 29, 29)
                        .addComponent(boxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(Bsalvar)
                        .addGap(73, 73, 73)
                        .addComponent(Balterar)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel11)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(boxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Lrg)
                        .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lCPF)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lturma)
                    .addComponent(txtTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lresponsavel)
                    .addComponent(txtResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lproficiencia)
                    .addComponent(txtProficiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bcancelar)
                    .addComponent(Bsalvar)
                    .addComponent(Balterar)
                    .addComponent(Bexcluir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTipoActionPerformed
         if (boxTipo.getSelectedItem().toString() == "Aluno") {
            Lrg.setVisible(false);
            txtRG.setVisible(false);
            Lproficiencia.setVisible(false);
            txtProficiencia.setVisible(false);
            Lresponsavel.setVisible(true);
            txtResponsavel.setVisible(true);
            Lturma.setVisible(true);
            txtTurma.setVisible(true);
        } else if (boxTipo.getSelectedItem().toString() == "Professor(a)") {
            Lrg.setVisible(true);
            txtRG.setVisible(true);
            Lproficiencia.setVisible(true);
            txtProficiencia.setVisible(true);
            Lresponsavel.setVisible(false);
            txtResponsavel.setVisible(false);
            Lturma.setVisible(false);
            txtTurma.setVisible(false);
        } else if (boxTipo.getSelectedItem().toString() == "") {
            Lrg.setVisible(false);
            txtRG.setVisible(false);
            Lproficiencia.setVisible(false);
            txtProficiencia.setVisible(false);
            Lresponsavel.setVisible(false);
            txtResponsavel.setVisible(false);
            Lturma.setVisible(false);
            txtTurma.setVisible(false);
        }
    }//GEN-LAST:event_boxTipoActionPerformed

    private void BalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BalterarActionPerformed
         int index = ListCadastro.getSelectedRow();
        ConexaoBanco.getConexaoMySQL();
        List<AlunoProf> listCadastro = ConexaoBanco.selectBancoAlunoProf();
        AlunoProf alunoprof = listCadastro.get(index);
        ConexaoBanco.getFecharConexao();

        txtNome.setText(alunoprof.getNome());
        txtNascimento.setText(alunoprof.getNascimento());
        txtEndereco.setText(alunoprof.getEndereco());
        txtFone.setText(alunoprof.getFone());
        if (alunoprof.getTipo().equals("Aluno")) {
            boxTipo.setSelectedItem("Aluno");
            txtCPF.setText(alunoprof.getCpf());
        } else {
            boxTipo.setSelectedItem("Professor(a)");
            txtCPF.setText(alunoprof.getCpf());
            Bsalvar.setVisible(true);
        }
    }//GEN-LAST:event_BalterarActionPerformed

    private void BsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsalvarActionPerformed
        String nome = txtNome.getText();
        String nascimento = txtNascimento.getText();
        String datacadastro = txtDataCadastro.getText();
        String endereco = txtEndereco.getText();
        String fone = txtFone.getText();
        String turma = txtTurma.getText();
        String proficiencia = txtProficiencia.getText();
        String cpf = txtCPF.getText();
        String rg = txtRG.getText();
        String responsavel = txtResponsavel.getText();
        String usuario = txtUsuario.getText();
        String senha = Senha.getText();
        
       
       
        AlunoProf alunoprof = new AlunoProf();
        alunoprof.setNome(nome);
        alunoprof.setNascimento(nascimento);
        alunoprof.setDatacadastro(datacadastro);
        alunoprof.setCpf(cpf);
        alunoprof.setRg(rg);
        alunoprof.setResponsavel(responsavel);
        alunoprof.setFone(fone);
        alunoprof.setTurma(turma);
        alunoprof.setProficiencia(proficiencia);
        alunoprof.setEndereco(endereco);
        alunoprof.setTipo(tipo);
        alunoprof.setUsuario(usuario);
        alunoprof.setSenha(senha);
        
        ConexaoBanco.getConexaoMySQL();
        int retornoUpdate = ConexaoBanco.updateBancoAlunoProf(AlunoProf alunoprof);
        if (retornoUpdate > 0) {
            JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "ERRO ao alterar o registro!");
        }
        carregaTabela();

        txtNome.setText("");
        txtNascimento.setText("");
        txtDataCadastro.setText("");
        txtCPF.setText("");
        txtRG.setText("");
        txtResponsavel.setText("");
        txtFone.setText("");
        txtEndereco.setText("");
        
    }//GEN-LAST:event_BsalvarActionPerformed

    private void BexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BexcluirActionPerformed
         int index = ListCadastro.getSelectedRow();
        ConexaoBanco.getConexaoMySQL();
        List<AlunoProf> listCadastro = ConexaoBanco.selectBancoAlunoProf();
        AlunoProf alunoprof = listCadastro.get(index);
        ConexaoBanco.getFecharConexao();
        
        DefaultTableModel tabelaModel = (DefaultTableModel)ListCadastro.getModel();
        ConexaoBanco.getConexaoMySQL();
        boolean retornoDelete = ConexaoBanco.deleteBancoAlunoProf(alunoprof);
        if (ListCadastro.getSelectedRow() >= 0){
            tabelaModel.removeRow(ListCadastro.getSelectedRow());
            ListCadastro.setModel(tabelaModel);
        }else{
            JOptionPane.showMessageDialog(null, "Favor selecionar uma linha!");
        }
        carregaTabela();
    }//GEN-LAST:event_BexcluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Balterar;
    private javax.swing.JButton Bcancelar;
    private javax.swing.JButton Bexcluir;
    private javax.swing.JButton Bsalvar;
    private javax.swing.JTable ListCadastro;
    private javax.swing.JLabel Lproficiencia;
    private javax.swing.JLabel Lresponsavel;
    private javax.swing.JLabel Lrg;
    private javax.swing.JLabel Lturma;
    private javax.swing.JPasswordField Senha;
    private javax.swing.JComboBox<String> boxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lCPF;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtDataCadastro;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JFormattedTextField txtFone;
    private javax.swing.JFormattedTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtProficiencia;
    private javax.swing.JFormattedTextField txtRG;
    private javax.swing.JTextField txtResponsavel;
    private javax.swing.JTextField txtTurma;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
