/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;


public class pucca_telaEntrada extends javax.swing.JFrame {

   
    public pucca_telaEntrada() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        jLabel4 = new javax.swing.JLabel();
        CadastrarUsuário = new java.awt.Button();
        CadastrarTarefa = new java.awt.Button();
        btnSair = new java.awt.Button();
        GerenciarTarefas1 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1280, 720));

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        label2.setForeground(new java.awt.Color(14, 65, 148));
        label2.setMaximumSize(new java.awt.Dimension(40000, 40000));
        label2.setText("Olá, escolha uma opção!");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/SENAI_logo_2024.png"))); // NOI18N

        CadastrarUsuário.setActionCommand("ENTRAR");
        CadastrarUsuário.setBackground(new java.awt.Color(14, 65, 148));
        CadastrarUsuário.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CadastrarUsuário.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        CadastrarUsuário.setForeground(new java.awt.Color(255, 255, 255));
        CadastrarUsuário.setLabel("Cadastrar Novo Usuário");
        CadastrarUsuário.setName(""); // NOI18N
        CadastrarUsuário.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarUsuárioActionPerformed(evt);
            }
        });

        CadastrarTarefa.setActionCommand("ENTRAR");
        CadastrarTarefa.setBackground(new java.awt.Color(14, 65, 148));
        CadastrarTarefa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CadastrarTarefa.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        CadastrarTarefa.setForeground(new java.awt.Color(255, 255, 255));
        CadastrarTarefa.setLabel("Cadastrar Nova Tarefa");
        CadastrarTarefa.setName(""); // NOI18N
        CadastrarTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarTarefaActionPerformed(evt);
            }
        });

        btnSair.setActionCommand("ENTRAR");
        btnSair.setBackground(new java.awt.Color(14, 65, 148));
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSair.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setLabel("Sair");
        btnSair.setName(""); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        GerenciarTarefas1.setActionCommand("ENTRAR");
        GerenciarTarefas1.setBackground(new java.awt.Color(14, 65, 148));
        GerenciarTarefas1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        GerenciarTarefas1.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        GerenciarTarefas1.setForeground(new java.awt.Color(255, 255, 255));
        GerenciarTarefas1.setLabel("Gerenciar Tarefas");
        GerenciarTarefas1.setMinimumSize(new java.awt.Dimension(177, 26));
        GerenciarTarefas1.setName(""); // NOI18N
        GerenciarTarefas1.setPreferredSize(new java.awt.Dimension(177, 26));
        GerenciarTarefas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerenciarTarefas1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(375, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(302, 302, 302))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(GerenciarTarefas1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CadastrarUsuário, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CadastrarTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(494, 494, 494))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(567, 567, 567))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(GerenciarTarefas1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CadastrarTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CadastrarUsuário, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarUsuárioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarUsuárioActionPerformed
        Cadastrar_NovoUsuario objCadastrar_NovoUsuario = new Cadastrar_NovoUsuario();
                objCadastrar_NovoUsuario.setVisible(true);
                dispose();
    }//GEN-LAST:event_CadastrarUsuárioActionPerformed

    private void CadastrarTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarTarefaActionPerformed
        Cadastrar_NovaTarefa objCadastrar_NovaTarefa = new Cadastrar_NovaTarefa();
                objCadastrar_NovaTarefa.setVisible(true);
                dispose();
    }//GEN-LAST:event_CadastrarTarefaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void GerenciarTarefas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerenciarTarefas1ActionPerformed
        GerenciarTarefa objGerenciarTarefa = new GerenciarTarefa();
                objGerenciarTarefa.setVisible(true);
                dispose();
    }//GEN-LAST:event_GerenciarTarefas1ActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pucca_telaEntrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button CadastrarTarefa;
    private java.awt.Button CadastrarUsuário;
    private java.awt.Button GerenciarTarefas1;
    private java.awt.Button btnSair;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label2;
    // End of variables declaration//GEN-END:variables
}
