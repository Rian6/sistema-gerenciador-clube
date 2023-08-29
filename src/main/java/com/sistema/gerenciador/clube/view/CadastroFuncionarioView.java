package com.sistema.gerenciador.clube.view;

import com.sistema.gerenciador.clube.controller.CadastroFuncionarioController;
import com.sistema.gerenciador.clube.entity.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author rian_
 */
public class CadastroFuncionarioView extends javax.swing.JFrame {

    private CadastroFuncionarioController cadastroFuncionarioController;
    
    public CadastroFuncionarioView() {
        initComponents();
        setLocationRelativeTo( null );
        
        cadastroFuncionarioController = new CadastroFuncionarioController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        entradaEnderFunc = new javax.swing.JTextField();
        entradaNomeFunc = new javax.swing.JTextField();
        entradaEmailFunc = new javax.swing.JTextField();
        entradaTelefFunc = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPVoltar = new javax.swing.JPanel();
        jLVoltar = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        entradaCargoFunc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        entradaSalarioFunc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        entradaLoginFunc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        entradaSenhaFunc = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

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

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("E-mail");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefone");

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator2.setToolTipText("");
        jSeparator2.setFont(new java.awt.Font("Segoe UI", 0, 3)); // NOI18N

        entradaEnderFunc.setBackground(new java.awt.Color(59, 57, 57));
        entradaEnderFunc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        entradaEnderFunc.setForeground(new java.awt.Color(255, 255, 255));
        entradaEnderFunc.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        entradaEnderFunc.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        entradaEnderFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaEnderFuncActionPerformed(evt);
            }
        });

        entradaNomeFunc.setBackground(new java.awt.Color(59, 57, 57));
        entradaNomeFunc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        entradaNomeFunc.setForeground(new java.awt.Color(255, 255, 255));
        entradaNomeFunc.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        entradaNomeFunc.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        entradaNomeFunc.setMargin(new java.awt.Insets(10, 6, 2, 6));
        entradaNomeFunc.setOpaque(true);
        entradaNomeFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaNomeFuncActionPerformed(evt);
            }
        });

        entradaEmailFunc.setBackground(new java.awt.Color(59, 57, 57));
        entradaEmailFunc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        entradaEmailFunc.setForeground(new java.awt.Color(255, 255, 255));
        entradaEmailFunc.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        entradaEmailFunc.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        entradaTelefFunc.setBackground(new java.awt.Color(59, 57, 57));
        entradaTelefFunc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        entradaTelefFunc.setForeground(new java.awt.Color(255, 255, 255));
        entradaTelefFunc.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        entradaTelefFunc.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(0, 74, 119));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sistema/gerenciador/clube/assets/icone-salvar.png"))); // NOI18N
        jLabel9.setText("Salvar");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jLVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Funcionário");

        entradaCargoFunc.setBackground(new java.awt.Color(59, 57, 57));
        entradaCargoFunc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        entradaCargoFunc.setForeground(new java.awt.Color(255, 255, 255));
        entradaCargoFunc.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        entradaCargoFunc.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cargo");

        entradaSalarioFunc.setBackground(new java.awt.Color(59, 57, 57));
        entradaSalarioFunc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        entradaSalarioFunc.setForeground(new java.awt.Color(255, 255, 255));
        entradaSalarioFunc.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        entradaSalarioFunc.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Salário");

        entradaLoginFunc.setBackground(new java.awt.Color(59, 57, 57));
        entradaLoginFunc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        entradaLoginFunc.setForeground(new java.awt.Color(255, 255, 255));
        entradaLoginFunc.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        entradaLoginFunc.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Login");

        entradaSenhaFunc.setBackground(new java.awt.Color(59, 57, 57));
        entradaSenhaFunc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        entradaSenhaFunc.setForeground(new java.awt.Color(255, 255, 255));
        entradaSenhaFunc.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        entradaSenhaFunc.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Senha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(entradaNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(entradaTelefFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(entradaCargoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(entradaLoginFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(entradaEnderFunc)
                                    .addComponent(entradaEmailFunc)
                                    .addComponent(jLabel8)
                                    .addComponent(entradaSalarioFunc)
                                    .addComponent(jLabel11)
                                    .addComponent(entradaSenhaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jPVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(entradaEnderFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(entradaNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(entradaLoginFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(entradaSenhaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(entradaSalarioFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(entradaEmailFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(entradaTelefFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(entradaCargoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
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
        cadastroFuncionarioController.voltar(this);
    }//GEN-LAST:event_jLVoltarMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        Usuario usuario = new Usuario();
        
        usuario.setNome(entradaNomeFunc.getText());
        usuario.setEndereco(entradaEnderFunc.getText());
        usuario.setLogin(entradaLoginFunc.getText());
        usuario.setSenha(entradaSenhaFunc.getText());
        usuario.setTelefone(entradaTelefFunc.getText());
        usuario.setEmail(entradaEmailFunc.getText());
        usuario.setCargo(entradaCargoFunc.getText());
        Double salario = Double.valueOf(entradaSalarioFunc.getText());
        usuario.setSalario(salario);
        
        Boolean isSaved = cadastroFuncionarioController.salvar(usuario);
        
        if(isSaved){
            JOptionPane.showMessageDialog(this,"Funcionario salvo com sucesso!","Sucesso",JOptionPane.INFORMATION_MESSAGE);
            cadastroFuncionarioController.voltar(this);
        } else {
            JOptionPane.showMessageDialog(this,"Erro ao salvar funcionario!","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void entradaEnderFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaEnderFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaEnderFuncActionPerformed

    private void entradaNomeFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaNomeFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNomeFuncActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField entradaCargoFunc;
    private javax.swing.JTextField entradaEmailFunc;
    private javax.swing.JTextField entradaEnderFunc;
    private javax.swing.JTextField entradaLoginFunc;
    private javax.swing.JTextField entradaNomeFunc;
    private javax.swing.JTextField entradaSalarioFunc;
    private javax.swing.JTextField entradaSenhaFunc;
    private javax.swing.JTextField entradaTelefFunc;
    private javax.swing.JLabel jLVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
