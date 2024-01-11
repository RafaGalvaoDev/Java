/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package supercalculadora;

/**
 *
 * @author PC
 */
public class TelaSuperCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form TelaSuperCalculadora
     */
    public TelaSuperCalculadora() {
        initComponents();
        jpainel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtNum = new javax.swing.JSpinner();
        jbnt_Calcular = new javax.swing.JButton();
        jpainel = new javax.swing.JPanel();
        jlbl_Divisao1 = new javax.swing.JLabel();
        jlbl_Divisao2 = new javax.swing.JLabel();
        jlbl_Cubo1 = new javax.swing.JLabel();
        jlbl_Cubo2 = new javax.swing.JLabel();
        jlbl_RaizQuadrada1 = new javax.swing.JLabel();
        jlbl_RaizCubica1 = new javax.swing.JLabel();
        jlbl_ValorAbsolto1 = new javax.swing.JLabel();
        jlbl_RaizQuadrada2 = new javax.swing.JLabel();
        jlbl_RaizCubica2 = new javax.swing.JLabel();
        jlbl_ValorAbsoluto2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Super Calculadora");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Escolha Um Valor:");

        jtxtNum.setModel(new javax.swing.SpinnerNumberModel(1, -50, 50, 1));

        jbnt_Calcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calculadoraicon.png"))); // NOI18N
        jbnt_Calcular.setText("Calcular");
        jbnt_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnt_CalcularActionPerformed(evt);
            }
        });

        jlbl_Divisao1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbl_Divisao1.setText("Resto da Divisão por 2:");

        jlbl_Divisao2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbl_Divisao2.setText("0");

        jlbl_Cubo1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbl_Cubo1.setText("Elevado ao Cubo:");

        jlbl_Cubo2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbl_Cubo2.setText("0");

        jlbl_RaizQuadrada1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbl_RaizQuadrada1.setText("Raiz Quadrada:");

        jlbl_RaizCubica1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbl_RaizCubica1.setText("Raiz Cubica");

        jlbl_ValorAbsolto1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbl_ValorAbsolto1.setText("Valor Absoluto:");

        jlbl_RaizQuadrada2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbl_RaizQuadrada2.setText("0");

        jlbl_RaizCubica2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbl_RaizCubica2.setText("0");

        jlbl_ValorAbsoluto2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbl_ValorAbsoluto2.setText("0");

        javax.swing.GroupLayout jpainelLayout = new javax.swing.GroupLayout(jpainel);
        jpainel.setLayout(jpainelLayout);
        jpainelLayout.setHorizontalGroup(
            jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_ValorAbsolto1)
                    .addComponent(jlbl_RaizCubica1)
                    .addComponent(jlbl_RaizQuadrada1)
                    .addComponent(jlbl_Cubo1)
                    .addComponent(jlbl_Divisao1))
                .addGap(32, 32, 32)
                .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbl_Divisao2)
                    .addComponent(jlbl_Cubo2)
                    .addComponent(jlbl_RaizQuadrada2)
                    .addComponent(jlbl_RaizCubica2)
                    .addComponent(jlbl_ValorAbsoluto2))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jpainelLayout.setVerticalGroup(
            jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_Divisao1)
                    .addComponent(jlbl_Divisao2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_Cubo1)
                    .addComponent(jlbl_Cubo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_RaizQuadrada1)
                    .addComponent(jlbl_RaizQuadrada2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_RaizCubica1)
                    .addComponent(jlbl_RaizCubica2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_ValorAbsolto1)
                    .addComponent(jlbl_ValorAbsoluto2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jbnt_Calcular))
                    .addComponent(jpainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtxtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jbnt_Calcular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbnt_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnt_CalcularActionPerformed
        // TODO add your handling code here:
        jpainel.setVisible(true);
        int num = Integer.parseInt(jtxtNum.getValue().toString());
        int divi = num % 2;
        double quadra = Math.sqrt(num);
        double cubi = Math.cbrt(num);
        int abso = (int) Math.abs(num);
        double eleva = Math.pow(num, 3);
        
        jlbl_Divisao2.setText( Integer.toString(divi));
        jlbl_Cubo2.setText(Double.toString(eleva));
        jlbl_RaizCubica2.setText(String.format("%.2f", cubi));
        jlbl_RaizQuadrada2.setText(String.format("%.2f", quadra));
        jlbl_ValorAbsoluto2.setText(Integer.toString(abso));
    }//GEN-LAST:event_jbnt_CalcularActionPerformed

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
            java.util.logging.Logger.getLogger(TelaSuperCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSuperCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSuperCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSuperCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSuperCalculadora().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbnt_Calcular;
    private javax.swing.JLabel jlbl_Cubo1;
    private javax.swing.JLabel jlbl_Cubo2;
    private javax.swing.JLabel jlbl_Divisao1;
    private javax.swing.JLabel jlbl_Divisao2;
    private javax.swing.JLabel jlbl_RaizCubica1;
    private javax.swing.JLabel jlbl_RaizCubica2;
    private javax.swing.JLabel jlbl_RaizQuadrada1;
    private javax.swing.JLabel jlbl_RaizQuadrada2;
    private javax.swing.JLabel jlbl_ValorAbsolto1;
    private javax.swing.JLabel jlbl_ValorAbsoluto2;
    private javax.swing.JPanel jpainel;
    private javax.swing.JSpinner jtxtNum;
    // End of variables declaration//GEN-END:variables
}