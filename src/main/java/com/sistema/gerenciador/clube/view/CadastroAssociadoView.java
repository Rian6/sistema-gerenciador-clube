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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabelTelefone = new javax.swing.JTextField();
        JLabelNome = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JTextField();
        jLabelNumero = new javax.swing.JTextField();
        jLabelTipoDePagamento = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPVoltar1 = new javax.swing.JPanel();
        jLVoltar1 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabelModoDePagamento = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jLabelUF = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jLabelEndereco = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabelDependentes = new javax.swing.JTextField();
        jLabelQntdeDeDep = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cidade");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("UF");

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator2.setToolTipText("");
        jSeparator2.setFont(new java.awt.Font("Segoe UI", 0, 3)); // NOI18N

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

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Telefone");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Nome");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Cadastro de associado");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Cidade");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("UF");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("N⁰ ");

        jLabel21.setBackground(new java.awt.Color(102, 102, 102));
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Dados de pagamento");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Modo de pagamento");

        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator4.setToolTipText("");
        jSeparator4.setFont(new java.awt.Font("Segoe UI", 0, 3)); // NOI18N

        jSeparator5.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator5.setToolTipText("");
        jSeparator5.setFont(new java.awt.Font("Segoe UI", 0, 3)); // NOI18N

        jLabel23.setBackground(new java.awt.Color(102, 102, 102));
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Geral");

        jSeparator6.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator6.setToolTipText("");
        jSeparator6.setFont(new java.awt.Font("Segoe UI", 0, 3)); // NOI18N

        jLabelTelefone.setBackground(new java.awt.Color(59, 57, 57));
        jLabelTelefone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelTelefone.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTelefone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jLabelTelefone.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        JLabelNome.setBackground(new java.awt.Color(59, 57, 57));
        JLabelNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLabelNome.setForeground(new java.awt.Color(255, 255, 255));
        JLabelNome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        JLabelNome.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        JLabelNome.setMargin(new java.awt.Insets(10, 6, 2, 6));
        JLabelNome.setOpaque(true);

        jLabelCidade.setBackground(new java.awt.Color(59, 57, 57));
        jLabelCidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelCidade.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCidade.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jLabelCidade.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabelNumero.setBackground(new java.awt.Color(59, 57, 57));
        jLabelNumero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelNumero.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumero.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jLabelNumero.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabelTipoDePagamento.setBackground(new java.awt.Color(59, 57, 57));
        jLabelTipoDePagamento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelTipoDePagamento.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTipoDePagamento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jLabelTipoDePagamento.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jPanel4.setBackground(new java.awt.Color(0, 74, 119));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sistema/gerenciador/clube/assets/icone-salvar.png"))); // NOI18N
        jLabel24.setText("Salvar");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel24.setIconTextGap(10);
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPVoltar1.setBackground(new java.awt.Color(102, 102, 102));

        jLVoltar1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLVoltar1.setForeground(new java.awt.Color(255, 255, 255));
        jLVoltar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLVoltar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sistema/gerenciador/clube/assets/icone-back.png"))); // NOI18N
        jLVoltar1.setText("Voltar");
        jLVoltar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLVoltar1.setIconTextGap(10);
        jLVoltar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLVoltar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPVoltar1Layout = new javax.swing.GroupLayout(jPVoltar1);
        jPVoltar1.setLayout(jPVoltar1Layout);
        jPVoltar1Layout.setHorizontalGroup(
            jPVoltar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLVoltar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
        );
        jPVoltar1Layout.setVerticalGroup(
            jPVoltar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLVoltar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sistema/gerenciador/clube/assets/icone-close.png"))); // NOI18N
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });

        jLabelModoDePagamento.setBackground(new java.awt.Color(59, 57, 57));
        jLabelModoDePagamento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelModoDePagamento.setForeground(new java.awt.Color(255, 255, 255));
        jLabelModoDePagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DINHEIRO", "CARTÃO", "BOLETO" }));
        jLabelModoDePagamento.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), null));
        jLabelModoDePagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLabelModoDePagamentoActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Tipo de pagamento");

        jLabelUF.setBackground(new java.awt.Color(59, 57, 57));
        jLabelUF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelUF.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PR", "SC", "RS", "SP", "RJ", "MG", "ES", "RO", "AC", "AM", "RR", "PA", "AP", "TO", "MA", "PI", "CE", "RN", "PB", "PE", "AL", "SE", "BA" }));
        jLabelUF.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), null));
        jLabelUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLabelUFActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Endereço");

        jLabelEndereco.setBackground(new java.awt.Color(59, 57, 57));
        jLabelEndereco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelEndereco.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEndereco.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jLabelEndereco.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Dependentes");

        jLabelDependentes.setBackground(new java.awt.Color(59, 57, 57));
        jLabelDependentes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelDependentes.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDependentes.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jLabelDependentes.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabelQntdeDeDep.setBackground(new java.awt.Color(59, 57, 57));
        jLabelQntdeDeDep.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelQntdeDeDep.setForeground(new java.awt.Color(255, 255, 255));
        jLabelQntdeDeDep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7" }));
        jLabelQntdeDeDep.setSelectedIndex(1);
        jLabelQntdeDeDep.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), null));
        jLabelQntdeDeDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLabelQntdeDeDepActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Quantidade de dependentes");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator6)
                            .addComponent(jSeparator4)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPVoltar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel23))
                                .addGap(12, 12, 12)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel21)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabelModoDePagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabelTipoDePagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel19)
                                            .addGap(74, 74, 74)
                                            .addComponent(jLabel18))
                                        .addComponent(JLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabelUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel16))
                                    .addGap(28, 28, 28)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel15)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabelTelefone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jLabelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jLabel27)
                                                        .addGap(220, 220, 220)))
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel20)
                                                    .addComponent(jLabelNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelQntdeDeDep, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(38, 38, 38)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel28)
                                        .addComponent(jLabelDependentes, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(43, 43, 43)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel25)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 205, Short.MAX_VALUE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 607, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jPVoltar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel23))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18)
                    .addComponent(jLabel27)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabelDependentes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelModoDePagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTipoDePagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelQntdeDeDep, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(188, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 306, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 637, Short.MAX_VALUE)))
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 402, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addContainerGap(504, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 306, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
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

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        Associado associado = new Associado();
        
        associado.setNome(JLabelNome.getText());
        associado.setEndereco(jLabelTelefone.getText());
        associado.setTelefone(jLabelTelefone.getText());
        associado.setEmail(jLabelCidade.getText());
        associado.setDependentes(jLabelNumero.getText() != null ? Integer.valueOf(jLabelNumero.getText()) : 0);
        associado.setTipoPagamento(jLabelUF.getToolTipText());
        
        Boolean isSaved = cadastroAssociadoController.salvar(associado);
        
        if(isSaved){
            JOptionPane.showMessageDialog(this,"Associado salvo com sucesso!","Sucesso",JOptionPane.INFORMATION_MESSAGE);
            cadastroAssociadoController.voltar(this);
        } else {
            JOptionPane.showMessageDialog(this,"Erro ao salvar associado!","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabelModoDePagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLabelModoDePagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelModoDePagamentoActionPerformed

    private void jLabelUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLabelUFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelUFActionPerformed

    private void jLabelQntdeDeDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLabelQntdeDeDepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelQntdeDeDepActionPerformed

    private void jLVoltar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLVoltar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLVoltar1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JLabelNome;
    private javax.swing.JLabel jLVoltar1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jLabelCidade;
    private javax.swing.JTextField jLabelDependentes;
    private javax.swing.JTextField jLabelEndereco;
    private javax.swing.JComboBox<String> jLabelModoDePagamento;
    private javax.swing.JTextField jLabelNumero;
    private javax.swing.JComboBox<String> jLabelQntdeDeDep;
    private javax.swing.JTextField jLabelTelefone;
    private javax.swing.JTextField jLabelTipoDePagamento;
    private javax.swing.JComboBox<String> jLabelUF;
    private javax.swing.JPanel jPVoltar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables
}
