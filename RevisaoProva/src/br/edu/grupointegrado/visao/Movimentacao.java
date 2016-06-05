package br.edu.grupointegrado.visao;

import br.edu.grupointegrado.controle.MovNf;
import br.edu.grupointegrado.controle.MovNfItens;
import br.edu.grupointegrado.ferramentas.LimparCampos;
import br.edu.grupointegrado.ferramentas.RetornaDescricao;
import br.edu.grupointegrado.ferramentas.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jamerson
 */
public class Movimentacao extends javax.swing.JFrame {

    RetornaDescricao retornadescricao = new RetornaDescricao();

    LimparCampos limpa = new LimparCampos();
    //ValidaInteiro valida = new ValidaInteiro(); Usar com campos formatado

    MovNf movNf = new MovNf();
    MovNfItens movNfItens = new MovNfItens();
     

    Date data = new Date();
    SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY");

    public Movimentacao() {
        initComponents();
        jTFDataNf.setText(formatador.format(data));
        //ValidaEnter ve = new ValidaEnter();Usar com painel de guias
        // ve.ValidaEnterFrame(jPanel1); Usar com painel de guias
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTFCodigoNf = new javax.swing.JTextField();
        jTFSerieNf = new javax.swing.JTextField();
        jTFDataNf = new javax.swing.JTextField();
        jTFCodigoOperacao = new javax.swing.JTextField();
        jTFDescricaoOperacao = new javax.swing.JTextField();
        jTFCodigoPessoa = new javax.swing.JTextField();
        jTFDescricaoPessoa = new javax.swing.JTextField();
        jTFCodigoForma = new javax.swing.JTextField();
        jTFDescricaoForma = new javax.swing.JTextField();
        jTFCodigoItem = new javax.swing.JTextField();
        jTFDescricaoItem = new javax.swing.JTextField();
        jTFValorItem = new javax.swing.JTextField();
        jTFQuantidadeItem = new javax.swing.JTextField();
        jBtAdicionar = new javax.swing.JButton();
        jBtRemover = new javax.swing.JButton();
        jTBNovo = new javax.swing.JToggleButton();
        jTBExcluir = new javax.swing.JToggleButton();
        jTBGravar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbItensNf = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTFCodigoNf.setBorder(javax.swing.BorderFactory.createTitledBorder("NF"));
        jTFCodigoNf.setName("CD_NF"); // NOI18N
        jTFCodigoNf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFCodigoNfFocusLost(evt);
            }
        });
        jTFCodigoNf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCodigoNfActionPerformed(evt);
            }
        });
        jTFCodigoNf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFCodigoNfKeyReleased(evt);
            }
        });

        jTFSerieNf.setBorder(javax.swing.BorderFactory.createTitledBorder("Serie"));

        jTFDataNf.setBorder(javax.swing.BorderFactory.createTitledBorder("Data"));
        jTFDataNf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDataNfActionPerformed(evt);
            }
        });

        jTFCodigoOperacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Operacao"));
        jTFCodigoOperacao.setName("CD_OPERACAO"); // NOI18N
        jTFCodigoOperacao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFCodigoOperacaoFocusLost(evt);
            }
        });
        jTFCodigoOperacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCodigoOperacaoActionPerformed(evt);
            }
        });

        jTFDescricaoOperacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Descricao"));

        jTFCodigoPessoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Pessoa"));
        jTFCodigoPessoa.setName("CD_PESSOA"); // NOI18N
        jTFCodigoPessoa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFCodigoPessoaFocusLost(evt);
            }
        });

        jTFDescricaoPessoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Descricao"));

        jTFCodigoForma.setBorder(javax.swing.BorderFactory.createTitledBorder("Forma"));
        jTFCodigoForma.setName("CD_FORMA"); // NOI18N
        jTFCodigoForma.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFCodigoFormaFocusLost(evt);
            }
        });

        jTFDescricaoForma.setBorder(javax.swing.BorderFactory.createTitledBorder("Descricao"));

        jTFCodigoItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Item"));
        jTFCodigoItem.setName("CD_ITEM"); // NOI18N
        jTFCodigoItem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFCodigoItemFocusLost(evt);
            }
        });

        jTFDescricaoItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Descricao"));

        jTFValorItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor"));

        jTFQuantidadeItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Quantidade"));

        jBtAdicionar.setText("+");
        jBtAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtAdicionarActionPerformed(evt);
            }
        });

        jBtRemover.setText("-");
        jBtRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtRemoverActionPerformed(evt);
            }
        });

        jTBNovo.setText("Novo");
        jTBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBNovoActionPerformed(evt);
            }
        });

        jTBExcluir.setText("Excluir");
        jTBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBExcluirActionPerformed(evt);
            }
        });

        jTBGravar.setText("Gravar");
        jTBGravar.setIconTextGap(0);
        jTBGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBGravarActionPerformed(evt);
            }
        });

        jTbItensNf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Sel", "Codigo Item", "Descrição", "Valor", "Quantidade", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTbItensNf);
        if (jTbItensNf.getColumnModel().getColumnCount() > 0) {
            jTbItensNf.getColumnModel().getColumn(0).setResizable(false);
            jTbItensNf.getColumnModel().getColumn(1).setResizable(false);
            jTbItensNf.getColumnModel().getColumn(2).setResizable(false);
            jTbItensNf.getColumnModel().getColumn(3).setResizable(false);
            jTbItensNf.getColumnModel().getColumn(4).setResizable(false);
            jTbItensNf.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jTBNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTBGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTFCodigoNf, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jTFSerieNf, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jTFDataNf, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jTFCodigoForma, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTFDescricaoForma))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jTFCodigoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTFDescricaoPessoa))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jTFCodigoOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTFDescricaoOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTFCodigoItem, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTFDescricaoItem, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTFValorItem, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTFQuantidadeItem, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtAdicionar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtRemover))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFCodigoNf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jTFSerieNf, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jTFDataNf, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigoOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFDescricaoOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFDescricaoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCodigoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFDescricaoForma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCodigoForma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFDescricaoItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCodigoItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFValorItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFQuantidadeItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtAdicionar)
                    .addComponent(jBtRemover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTBNovo)
                    .addComponent(jTBGravar)
                    .addComponent(jTBExcluir))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtRemoverActionPerformed
        excluiLinha(jTbItensNf);
    }//GEN-LAST:event_jBtRemoverActionPerformed

    private void jTFCodigoOperacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCodigoOperacaoActionPerformed

    }//GEN-LAST:event_jTFCodigoOperacaoActionPerformed

    private void jTFCodigoNfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCodigoNfActionPerformed

    }//GEN-LAST:event_jTFCodigoNfActionPerformed

    private void jTFCodigoOperacaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFCodigoOperacaoFocusLost
        jTFDescricaoOperacao.setText(retornadescricao.retornadados(jTFCodigoOperacao, "CAD_OPERACAO", "DS_OPERACAO"));
    }//GEN-LAST:event_jTFCodigoOperacaoFocusLost

    private void jTFCodigoNfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFCodigoNfFocusLost
        jTFSerieNf.setText(retornadescricao.retornadados(jTFCodigoNf, "MOV_NF", "SR_NF"));
        //jTFDataNf.setText(retornadescricao.retornadados(jTFCodigoNf, "MOV_NF", "DT_NF"));


    }//GEN-LAST:event_jTFCodigoNfFocusLost

    private void jTFDataNfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDataNfActionPerformed


    }//GEN-LAST:event_jTFDataNfActionPerformed

    private void jTFCodigoPessoaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFCodigoPessoaFocusLost
        jTFDescricaoPessoa.setText(retornadescricao.retornadados(jTFCodigoPessoa, "CAD_PESSOA", "DS_PESSOA"));
    }//GEN-LAST:event_jTFCodigoPessoaFocusLost

    private void jTFCodigoFormaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFCodigoFormaFocusLost
        jTFDescricaoForma.setText(retornadescricao.retornadados(jTFCodigoForma, "CAD_FORMA_PG", "DS_FORMA"));
    }//GEN-LAST:event_jTFCodigoFormaFocusLost

    private void jTFCodigoItemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFCodigoItemFocusLost
        jTFDescricaoItem.setText(retornadescricao.retornadados(jTFCodigoItem, "CAD_ITENS", "DS_ITEM"));
        jTFValorItem.setText(retornadescricao.retornadados(jTFCodigoItem, "CAD_ITENS", "VL_ITEM"));
    }//GEN-LAST:event_jTFCodigoItemFocusLost

    private void jTBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBNovoActionPerformed
        limpa.LimparCampos(jPanel1);
    }//GEN-LAST:event_jTBNovoActionPerformed

    private void jBtAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtAdicionarActionPerformed
        inclui_itens();
    }//GEN-LAST:event_jBtAdicionarActionPerformed

    private void jTBGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBGravarActionPerformed
        if (!jTFCodigoNf.getText().equals("")) {
            movNf.setCdNf(Integer.parseInt(jTFCodigoNf.getText()));
        }

        movNf.setSrNF(jTFSerieNf.getText());
        movNf.getPessoa().setCdPessoa(Integer.parseInt(jTFCodigoPessoa.getText()));
        movNf.setDtNf(jTFDataNf.getText());
        movNf.getOperacao().setCdOperacao(Integer.parseInt(jTFCodigoOperacao.getText()));
        movNf.getFormapagamento().setCdForma(Integer.parseInt(jTFCodigoForma.getText()));

        movNf.incluirMovNf();
        
        jTFCodigoNf.setText(Integer.toString(movNf.getCdNf()));
        gravaItenNF();
        movNf.commit();
    }//GEN-LAST:event_jTBGravarActionPerformed

    private void jTBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBExcluirActionPerformed
        if (!jTFCodigoNf.getText().equals("")) {
            movNf.setCdNf(Integer.parseInt(jTFCodigoNf.getText()));
            movNf.excluirOs();
            movNf.commit();
            limpa.LimparCampos(jPanel1);

        }
    }//GEN-LAST:event_jTBExcluirActionPerformed

    private void jTFCodigoNfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCodigoNfKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCodigoNfKeyReleased

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Movimentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Movimentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Movimentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Movimentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Movimentacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtAdicionar;
    private javax.swing.JButton jBtRemover;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jTBExcluir;
    private javax.swing.JToggleButton jTBGravar;
    private javax.swing.JToggleButton jTBNovo;
    private javax.swing.JTextField jTFCodigoForma;
    private javax.swing.JTextField jTFCodigoItem;
    private javax.swing.JTextField jTFCodigoNf;
    private javax.swing.JTextField jTFCodigoOperacao;
    private javax.swing.JTextField jTFCodigoPessoa;
    private javax.swing.JTextField jTFDataNf;
    private javax.swing.JTextField jTFDescricaoForma;
    private javax.swing.JTextField jTFDescricaoItem;
    private javax.swing.JTextField jTFDescricaoOperacao;
    private javax.swing.JTextField jTFDescricaoPessoa;
    private javax.swing.JTextField jTFQuantidadeItem;
    private javax.swing.JTextField jTFSerieNf;
    private javax.swing.JTextField jTFValorItem;
    private javax.swing.JTable jTbItensNf;
    // End of variables declaration//GEN-END:variables
public void inclui_itens() {// copiar de outro projeto este nao funciona bem
        DefaultTableModel TabelaItens = (DefaultTableModel) jTbItensNf.getModel();
        double soma = 0;
        int totlinha = jTbItensNf.getRowCount();
        int situacao = 0;
        int conta = 0;
        int index = 0;

        for (int i = 1; i <= totlinha; i++) {
            String cd_item = (String) jTbItensNf.getValueAt(conta, 1);
            if (jTFCodigoItem.getText().equals(cd_item)) {
                int opcao_escolhida
                        = JOptionPane.showConfirmDialog(null, "Serviço já cadastrado,"
                                + " deseja"
                                + " alterar quantidade ", "Alteração ",
                                JOptionPane.YES_NO_OPTION);
                if (opcao_escolhida == JOptionPane.YES_OPTION) {
                    situacao = 1;
                    index = conta;
                } else {
                    return;
                }
            }
            conta = conta + 1;
        }
        int x = jTbItensNf.getRowCount();
        if (situacao == 0) { // inclusao
            TabelaItens.setNumRows(x + 1);
            TabelaItens.setValueAt((false), x, 0);
            TabelaItens.setValueAt(jTFCodigoItem.getText(), x, 1);
            TabelaItens.setValueAt(jTFDescricaoItem.getText(), x, 2);
            TabelaItens.setValueAt(jTFValorItem.getText(), x, 3);
            TabelaItens.setValueAt(jTFQuantidadeItem.getText(), x, 4);
            soma = Double.parseDouble(jTFQuantidadeItem.getText().replaceAll(",", "."))
                    * Double.parseDouble(jTFValorItem.getText());
            TabelaItens.setValueAt(soma, x, 5);

            jTFCodigoItem.setText(" ");
            jTFDescricaoItem.setText(" ");
            jTFValorItem.setText(" ");
            jTFQuantidadeItem.setText(" ");

        } else if (situacao == 1) { // alteração

            TabelaItens.setValueAt(jTFQuantidadeItem.getText(), index, 4);

            soma = Double.parseDouble(jTFQuantidadeItem.getText().replaceAll(",", "."))
                    * Double.parseDouble(jTFValorItem.getText());
            TabelaItens.setValueAt(soma, index, 5);
            jTFCodigoItem.setText(" ");
            jTFDescricaoItem.setText(" ");
            jTFValorItem.setText(" ");
            jTFQuantidadeItem.setText(" ");
        }
    }

    public void excluiLinha(JTable tabelaparametro) {
        DefaultTableModel tabela = (DefaultTableModel) tabelaparametro.getModel();
        int totlinha = tabela.getRowCount();
        int i = 0;
        Boolean sel = false;

        int opcao = JOptionPane.showConfirmDialog(null,
                "Deseja remover os serviços selecionados ? ", "Remover",
                JOptionPane.YES_NO_CANCEL_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            for (i = totlinha - 1; i >= 0; i--) {
                Boolean selecionado = (Boolean) tabelaparametro.getValueAt(i, 0);
                if (selecionado == true) {
                    sel = true;

                    tabela.removeRow(i);
                }
            }
            if (!sel == true) {
                JOptionPane.showMessageDialog(null, "Nao ha nenhum registro selecionado !");
            }
        }
    }

    public void gravaItenNF() {
        int cont = jTbItensNf.getRowCount();
        for (int i = 0; i < cont; i++) {
            String item = (String) jTbItensNf.getValueAt(i, 1);
            String valor = (String) jTbItensNf.getValueAt(i, 3);
            String quantida = (String) jTbItensNf.getValueAt(i, 4);

            movNfItens.getIten().setCdItem(Integer.parseInt(item));
            movNfItens.getPessoa().setCdPessoa(Integer.parseInt(jTFSerieNf.getText()));
            movNfItens.getMovnf().setCdNf(Integer.parseInt(jTFCodigoNf.getText()));
            movNfItens.getMovnf().setSrNF(jTFSerieNf.getText());
            movNfItens.setVlItem(Double.parseDouble(valor));
            movNfItens.setQtItem(Integer.parseInt(quantida));
            
            movNfItens.incluirItensNf();
        }
    }
}
