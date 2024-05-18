
package view;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Color;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        // Configurações do JFrame
        setTitle("Menu");
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        atualizarData();  // Chamando o método para exibir a data inicial
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        l_numerosorteado1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Amigos = new javax.swing.JButton();
        l_numerosorteado2 = new javax.swing.JLabel();
        Ferramentas = new javax.swing.JButton();
        Emprestimos = new javax.swing.JButton();
        Data = new javax.swing.JLabel();
        Fechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel4.setText("Nome:");

        jLabel5.setText("Marca:");

        l_numerosorteado1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        l_numerosorteado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_numerosorteado1.setText("Cadastro de nova ferramenta");
        l_numerosorteado1.setPreferredSize(new java.awt.Dimension(20, 26));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Parece que esse é seu primeiro acesso, vamos configurar sua senha:");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel7.setText("Custo:");

        jButton2.setText("Salvar");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 149, 0));

        jPanel1.setBackground(new java.awt.Color(38, 55, 73));

        Amigos.setBackground(new java.awt.Color(107, 122, 139));
        Amigos.setForeground(new java.awt.Color(255, 255, 255));
        Amigos.setText("Amigos");
        Amigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmigosActionPerformed(evt);
            }
        });

        l_numerosorteado2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        l_numerosorteado2.setForeground(new java.awt.Color(255, 255, 255));
        l_numerosorteado2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_numerosorteado2.setText("Gerenciador de empréstimos do Richard");
        l_numerosorteado2.setPreferredSize(new java.awt.Dimension(20, 26));

        Ferramentas.setBackground(new java.awt.Color(107, 122, 139));
        Ferramentas.setForeground(new java.awt.Color(255, 255, 255));
        Ferramentas.setText("Ferramentas");
        Ferramentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FerramentasActionPerformed(evt);
            }
        });

        Emprestimos.setBackground(new java.awt.Color(107, 122, 139));
        Emprestimos.setForeground(new java.awt.Color(255, 255, 255));
        Emprestimos.setText("Emprestimos");
        Emprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmprestimosActionPerformed(evt);
            }
        });

        Data.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Data.setForeground(new java.awt.Color(255, 255, 255));
        Data.setText("Data");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(Amigos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(Ferramentas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(Emprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Data)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(l_numerosorteado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(l_numerosorteado2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Emprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ferramentas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Amigos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(Data)
                .addContainerGap())
        );

        Fechar.setBackground(new java.awt.Color(255, 149, 0));
        Fechar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Fechar.setForeground(new java.awt.Color(255, 255, 255));
        Fechar.setText(" X ");
        Fechar.setBorder(null);
        Fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FecharMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FecharMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FecharMouseExited(evt);
            }
        });
        Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    // Método para acessar a aba de amigos:
    private void AmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmigosActionPerformed
        Amigo amigo = new Amigo();
        amigo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AmigosActionPerformed

    // Método para acessar a aba de ferramentas:
    private void FerramentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FerramentasActionPerformed
        Ferramenta ferramenta = new Ferramenta();
        ferramenta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_FerramentasActionPerformed

    // Método para acessar a aba empréstimo:
    private void EmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmprestimosActionPerformed
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EmprestimosActionPerformed
    
    // Método para fechar o programa:
    private void FecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FecharMouseClicked
        System.exit(0);
    }//GEN-LAST:event_FecharMouseClicked

    private void FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FecharActionPerformed

    private void FecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FecharMouseEntered
        Color redColor = Color.decode("#FF2424");    
        Fechar.setBackground(redColor);
    }//GEN-LAST:event_FecharMouseEntered

    private void FecharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FecharMouseExited
        Color orangeColor = Color.decode("#FF9500");
        Fechar.setBackground(orangeColor); 
    }//GEN-LAST:event_FecharMouseExited
    
    // Método para atualizar a data
    private void atualizarData() {
        // Obtendo a data atual do dispositivo local
        Date dataAtual = new Date();

        // Formatando a data para exibição
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = formatoData.format(dataAtual);

        // Exibindo a data no JLabel
        Data.setText("Data: " + dataFormatada);
        Data.setBounds(10, 10, 200, 20); // Definindo a posição e tamanho do JLabel
    }
    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Amigos;
    private javax.swing.JLabel Data;
    private javax.swing.JButton Emprestimos;
    private javax.swing.JButton Fechar;
    private javax.swing.JButton Ferramentas;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel l_numerosorteado1;
    private javax.swing.JLabel l_numerosorteado2;
    // End of variables declaration//GEN-END:variables
}