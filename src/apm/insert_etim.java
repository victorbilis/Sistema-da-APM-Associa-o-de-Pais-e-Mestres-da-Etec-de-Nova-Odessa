/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apm;

/**
 *
 * @author V
 */
public class insert_etim extends javax.swing.JFrame {

    /**
     * Creates new form insert_etim
     */
    public insert_etim() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        txt_datapg1 = new javax.swing.JFormattedTextField();
        txt_nome = new javax.swing.JTextField();
        txt_datapg2 = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_responsavel = new javax.swing.JTextField();
        txt_datarec1 = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_datarec2 = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_datainsc = new javax.swing.JFormattedTextField();
        jComboBox1 = new javax.swing.JComboBox();
        txt_responsavelrec = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_responsavelrec2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt_valorcamiseta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_valorpago = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_valorreceber = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Californian FB", 0, 18)); // NOI18N
        jLabel12.setText("INSERIR ADESÃO(ETIM)");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 200, -1));

        try {
            txt_datapg1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txt_datapg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 157, -1));
        getContentPane().add(txt_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 157, -1));

        try {
            txt_datapg2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txt_datapg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 157, -1));

        jLabel13.setText("Data 2º pagamento:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));
        getContentPane().add(txt_responsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 157, -1));

        try {
            txt_datarec1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txt_datarec1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 157, -1));

        jLabel4.setText("Responsável:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 70, -1));

        jLabel14.setText("Rec. 1º pagamento:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        try {
            txt_datarec2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txt_datarec2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 157, -1));

        jLabel15.setText("Rec. 2º pagamento:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        jLabel5.setText("Data de inscrição:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        try {
            txt_datainsc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txt_datainsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 157, -1));

        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 157, -1));
        getContentPane().add(txt_responsavelrec, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 157, -1));

        jLabel16.setText("Responsavel Recebimento:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));
        getContentPane().add(txt_responsavelrec2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 157, -1));

        jLabel17.setText("Responsavel Recebimento:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        jButton1.setText("Inserir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));
        getContentPane().add(txt_valorcamiseta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 157, -1));

        jLabel6.setText("Valor apm camiseta:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 110, -1));
        getContentPane().add(txt_valorpago, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 157, -1));

        jLabel7.setText("Valor pago:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 60, -1));

        jLabel1.setText("Curso:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));
        getContentPane().add(txt_valorreceber, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 157, -1));

        jLabel8.setText("Valor à receber:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        jLabel9.setText("Data 1º pagamento:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        jLabel3.setText("Nome:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 60, -1));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nome_curso,nome,responsavel,data_ins,valor_apm_camiseta,pago,receber,data_1,data_2,rec_1,respon_rece,rec2,respon_rece2;
        functions func = new functions();
        nome_curso = jComboBox1.getSelectedItem().toString();
        nome = txt_nome.getText();
        responsavel = txt_responsavel.getText();
        data_ins = txt_datainsc.getText();
        valor_apm_camiseta = txt_valorcamiseta.getText();
        pago = txt_valorpago.getText();
        receber = txt_valorreceber.getText();
        data_1 = txt_datapg1.getText();
        data_2 = txt_datapg2.getText();
        rec_1 = txt_datarec1.getText();
        respon_rece = txt_responsavelrec.getText();
        rec2 = txt_datarec2.getText();
        respon_rece2 = txt_responsavelrec2.getText();

        try
        {
            func.sql("INSERT INTO adesao_etim VALUES(null,'"+nome_curso+"',"
                + "'"+nome+"',"
                + "'"+responsavel+"',"
                + "'"+data_ins+"',"
                + "'"+valor_apm_camiseta+"',"
                + "'"+pago+"',"
                + "'"+receber+"',"
                + "'"+data_1+"',"
                + "'"+data_2+"',"
                + "'"+rec_1+"',"
                + "'"+respon_rece+"',"
                + "'"+rec2+"',"
                + "'"+respon_rece2+"');");

        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        this.dispose();
        adesao frm = new adesao();
        frm.dispose();
        frm.jComboBox1.setSelectedItem("Etim");
        frm.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(insert_etim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insert_etim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insert_etim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insert_etim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insert_etim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField txt_datainsc;
    private javax.swing.JFormattedTextField txt_datapg1;
    private javax.swing.JFormattedTextField txt_datapg2;
    private javax.swing.JFormattedTextField txt_datarec1;
    private javax.swing.JFormattedTextField txt_datarec2;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_responsavel;
    private javax.swing.JTextField txt_responsavelrec;
    private javax.swing.JTextField txt_responsavelrec2;
    private javax.swing.JTextField txt_valorcamiseta;
    private javax.swing.JTextField txt_valorpago;
    private javax.swing.JTextField txt_valorreceber;
    // End of variables declaration//GEN-END:variables
}
