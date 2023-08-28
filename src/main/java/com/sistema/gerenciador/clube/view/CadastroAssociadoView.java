package com.sistema.gerenciador.clube.view;

import com.sistema.gerenciador.clube.controller.CadastroAssociadoController;
import com.sistema.gerenciador.clube.entity.Associado;
import javax.swing.Icon;
import javax.swing.JOptionPane;

/**
 *
 * @author rian_
 */
public class CadastroAssociadoView extends javax.swing.JFrame {

    private CadastroAssociadoController cadastroAssociadoController;
    
    public CadastroAssociadoView() {
        initComponents();
        setLocationRelativeTo( null );
        
        cadastroAssociadoController = new CadastroAssociadoController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jTEndereco = new javax.swing.JTextField();
        jTNome = new javax.swing.JTextField();
        jTEmail = new javax.swing.JTextField();
        jTTelefone = new javax.swing.JTextField();
        jTDependentes = new javax.swing.JTextField();
        jTCpf = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPVoltar = new javax.swing.JPanel();
        jLVoltar = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jCTipoPagamento = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Endereço");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Associados");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("E-mail");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefone");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Dependentes");

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Dados de pagamento");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CPF");

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator1.setToolTipText("");
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 0, 3)); // NOI18N

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator2.setToolTipText("");
        jSeparator2.setFont(new java.awt.Font("Segoe UI", 0, 3)); // NOI18N

        jLabel12.setBackground(new java.awt.Color(102, 102, 102));
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Geral");

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator3.setToolTipText("");
        jSeparator3.setFont(new java.awt.Font("Segoe UI", 0, 3)); // NOI18N

        jTEndereco.setBackground(new java.awt.Color(59, 57, 57));
        jTEndereco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTEndereco.setForeground(new java.awt.Color(255, 255, 255));
        jTEndereco.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTEndereco.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jTNome.setBackground(new java.awt.Color(59, 57, 57));
        jTNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTNome.setForeground(new java.awt.Color(255, 255, 255));
        jTNome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTNome.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jTNome.setMargin(new java.awt.Insets(10, 6, 2, 6));
        jTNome.setOpaque(true);

        jTEmail.setBackground(new java.awt.Color(59, 57, 57));
        jTEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTEmail.setForeground(new java.awt.Color(255, 255, 255));
        jTEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jTTelefone.setBackground(new java.awt.Color(59, 57, 57));
        jTTelefone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTTelefone.setForeground(new java.awt.Color(255, 255, 255));
        jTTelefone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTTelefone.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jTDependentes.setBackground(new java.awt.Color(59, 57, 57));
        jTDependentes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTDependentes.setForeground(new java.awt.Color(255, 255, 255));
        jTDependentes.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTDependentes.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jTCpf.setBackground(new java.awt.Color(59, 57, 57));
        jTCpf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTCpf.setForeground(new java.awt.Color(255, 255, 255));
        jTCpf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTCpf.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(0, 74, 119));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sistema/gerenciador/clube/assets/icone-salvar.png"))); // NOI18N
        jLabel9.setText("Salvar");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.setIconTextGap(10);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPVoltar.setBackground(new java.awt.Color(102, 102, 102));

        jLVoltar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLVoltar.setForeground(new java.awt.Color(255, 255, 255));
        jLVoltar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sistema/gerenciador/clube/assets/icone-back.png"))); // NOI18N
        jLVoltar.setText("Voltar");
        jLVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLVoltar.setIconTextGap(10);
        jLVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLVoltarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPVoltarLayout = new javax.swing.GroupLayout(jPVoltar);
        jPVoltar.setLayout(jPVoltarLayout);
        jPVoltarLayout.setHorizontalGroup(
            jPVoltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLVoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
        );
        jPVoltarLayout.setVerticalGroup(
            jPVoltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLVoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sistema/gerenciador/clube/assets/icone-close.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jCTipoPagamento.setBackground(new java.awt.Color(59, 57, 57));
        jCTipoPagamento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCTipoPagamento.setForeground(new java.awt.Color(255, 255, 255));
        jCTipoPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DINHEIRO", "CARTÃO", "BOLETO" }));
        jCTipoPagamento.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), null));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Tipo de pagamento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jTDependentes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCTipoPagamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel13)
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(30, 30, 30)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel1)
                                        .addComponent(jTEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                        .addComponent(jTEmail)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 307, Short.MAX_VALUE)
                                            .addComponent(jPVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel12))
                                    .addGap(12, 12, 12)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jPVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel12))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTDependentes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCTipoPagamento)
                    .addComponent(jTCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLVoltarMouseClicked
        cadastroAssociadoController.voltar(this);
    }//GEN-LAST:event_jLVoltarMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        Associado associado = new Associado();
        
        associado.setNome(jTNome.getText());
        associado.setEndereco(jTEndereco.getText());
        associado.setTelefone(jTTelefone.getText());
        associado.setEmail(jTEmail.getText());
        associado.setDependentes(jTDependentes.getText() != null ? Integer.valueOf(jTDependentes.getText()) : 0);
        associado.setCpf(jTCpf.getText());
        associado.setTipoPagamento(jCTipoPagamento.getToolTipText());
        
        Boolean isSaved = cadastroAssociadoController.salvar(associado);
        
        if(isSaved){
            JOptionPane.showMessageDialog(this,"Associado salvo com sucesso!","Sucesso",JOptionPane.INFORMATION_MESSAGE);
            cadastroAssociadoController.voltar(this);
        } else {
            JOptionPane.showMessageDialog(this,"Erro ao salvar associado!","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel9MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCTipoPagamento;
    private javax.swing.JLabel jLVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTCpf;
    private javax.swing.JTextField jTDependentes;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextField jTEndereco;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTTelefone;
    // End of variables declaration//GEN-END:variables
}
