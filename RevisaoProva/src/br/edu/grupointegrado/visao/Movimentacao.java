
package br.edu.grupointegrado.visao;

import br.edu.grupointegrado.ferramentas.RetornaDescricao;



/**
 *
 * @author Jamerson
 */
public class Movimentacao extends javax.swing.JFrame {

    RetornaDescricao retornadescricao = new RetornaDescricao();
 
    public Movimentacao() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTFNf = new javax.swing.JTextField();
        jTFSerie = new javax.swing.JTextField();
        jTFData = new javax.swing.JTextField();
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
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTFNf.setBorder(javax.swing.BorderFactory.createTitledBorder("NF"));
        jTFNf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNfActionPerformed(evt);
            }
        });

        jTFSerie.setBorder(javax.swing.BorderFactory.createTitledBorder("Serie"));

        jTFData.setBorder(javax.swing.BorderFactory.createTitledBorder("Data"));

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

        jTFDescricaoPessoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Descricao"));

        jTFCodigoForma.setBorder(javax.swing.BorderFactory.createTitledBorder("Forma"));

        jTFDescricaoForma.setBorder(javax.swing.BorderFactory.createTitledBorder("Descricao"));

        jTFCodigoItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Item"));

        jTFDescricaoItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Descricao"));

        jTFValorItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor"));

        jTFQuantidadeItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Quantidade"));

        jBtAdicionar.setText("+");

        jBtRemover.setText("-");
        jBtRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtRemoverActionPerformed(evt);
            }
        });

        jTBNovo.setText("Novo");

        jTBExcluir.setText("Excluir");

        jTBGravar.setText("Gravar");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTFNf, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jTFSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jTFData, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(70, 70, 70)
                .addComponent(jTBNovo)
                .addGap(70, 70, 70)
                .addComponent(jTBExcluir)
                .addGap(70, 70, 70)
                .addComponent(jTBGravar))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFNf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jTFSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jTFData, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTBNovo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTBExcluir, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTBGravar, javax.swing.GroupLayout.Alignment.TRAILING))
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
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtRemoverActionPerformed

    private void jTFCodigoOperacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCodigoOperacaoActionPerformed
       
    }//GEN-LAST:event_jTFCodigoOperacaoActionPerformed

    private void jTFNfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNfActionPerformed
        
    }//GEN-LAST:event_jTFNfActionPerformed

    private void jTFCodigoOperacaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFCodigoOperacaoFocusLost
jTFDescricaoOperacao.setText(retornadescricao.retornadados(jTFCodigoOperacao, "CAD_OPERACAO", "DS_OPERACAO"));
    }//GEN-LAST:event_jTFCodigoOperacaoFocusLost

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
    private javax.swing.JTextField jTFCodigoOperacao;
    private javax.swing.JTextField jTFCodigoPessoa;
    private javax.swing.JTextField jTFData;
    private javax.swing.JTextField jTFDescricaoForma;
    private javax.swing.JTextField jTFDescricaoItem;
    private javax.swing.JTextField jTFDescricaoOperacao;
    private javax.swing.JTextField jTFDescricaoPessoa;
    private javax.swing.JTextField jTFNf;
    private javax.swing.JTextField jTFQuantidadeItem;
    private javax.swing.JTextField jTFSerie;
    private javax.swing.JTextField jTFValorItem;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
