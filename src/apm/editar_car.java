/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apm;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author V
 */
public class editar_car extends javax.swing.JFrame {
    public String res = "";
    public String curso = "";
    public String val = "";
    /**
     * Creates new form editar_car
     */
    public editar_car() {
        initComponents();
        this.setLocationRelativeTo(null);
        URL url = this.getClass().getResource("icone.png");  
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);  
        this.setIconImage(iconeTitulo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rm = new javax.swing.JTextField();
        data_nasc = new javax.swing.JFormattedTextField();
        validade = new javax.swing.JComboBox();
        curso2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rg = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel1.setText("Rm:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel3.setText("Curso:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel4.setText("RG:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel5.setText("Data de nascimento:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel6.setText("Validade:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        rm.setEditable(false);
        getContentPane().add(rm, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 209, -1));

        try {
            data_nasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(data_nasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 212, -1));

        validade.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                validadeItemStateChanged(evt);
            }
        });
        validade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validadeActionPerformed(evt);
            }
        });
        getContentPane().add(validade, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 212, -1));

        curso2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                curso2ItemStateChanged(evt);
            }
        });
        curso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curso2ActionPerformed(evt);
            }
        });
        getContentPane().add(curso2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 212, -1));

        jButton1.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jButton1.setText("EDITAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));
        getContentPane().add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 210, -1));

        jLabel16.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel16.setText("EDITAR PEDIDO");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        rg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(rg, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void validadeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_validadeItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_validadeItemStateChanged

    private void validadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_validadeActionPerformed

    private void curso2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_curso2ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_curso2ItemStateChanged

    private void curso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curso2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_curso2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        fill();
        fill2();
        String partes[] = res.split(";");
        rm.setText(partes[0]);
        nome.setText(partes[1]);
        curso2.setSelectedItem(curso);
        rg.setText(partes[2]);
        data_nasc.setText(partes[3]);
        validade.setSelectedItem(val);
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       functions func = new functions();
       int rm2 = Integer.parseInt(rm.getText());
       func.sql2("DELETE FROM carterinha WHERE cod= "+rm2+";");
       func.sql("INSERT INTO carterinha VALUES("+rm2+",'"+nome.getText()+"','"+curso2.getSelectedItem()+"','"
               +rg.getText()+"','"+data_nasc.getText()+"','"+validade.getSelectedItem()+"');");
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rgActionPerformed
public void fill2() {
        try {
            functions func = new functions();
            DefaultComboBoxModel lista = new DefaultComboBoxModel();
            String res = func.listValidade("SELECT * FROM validade;");
            System.out.println(res);
            String partes[] = res.split("&");
            int i = 0;
            while (i < partes.length) {
                lista.addElement(partes[i]);
                i++;
            }

            validade.setModel(lista);
        } catch (Exception e) {
            System.out.println(e);
        }
 }    
public void fill() {
        try {
            functions func = new functions();
            DefaultComboBoxModel lista = new DefaultComboBoxModel();
            String res = func.listCurso("SELECT * FROM curso ORDER BY nome ASC;");
            System.out.println(res);
            String partes[] = res.split("&");
            int i = 0;
            while (i < partes.length) {
                lista.addElement(partes[i]);
                i++;
            }

            curso2.setModel(lista);
        } catch (Exception e) {
            System.out.println(e);
        }
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
            java.util.logging.Logger.getLogger(editar_car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editar_car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editar_car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editar_car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editar_car().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox curso2;
    private javax.swing.JFormattedTextField data_nasc;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField rg;
    private javax.swing.JTextField rm;
    public javax.swing.JComboBox validade;
    // End of variables declaration//GEN-END:variables
}
