/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apm;

import java.awt.Component;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author V
 */
public class pedido_carteira extends javax.swing.JFrame {

    functions func = new functions();

    /**
     * Creates new form pedidos
     */
    public pedido_carteira() {
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

        ver = new javax.swing.JPanel();
        validade = new javax.swing.JButton();
        txt_validade = new javax.swing.JFormattedTextField();
        apagar = new javax.swing.JButton();
        validade1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pedido de carterinha");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ver.setBackground(new java.awt.Color(0, 204, 255));
        ver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        validade.setText("Inserir nova validade");
        validade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validadeActionPerformed(evt);
            }
        });

        try {
            txt_validade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        apagar.setText("Apagar todos os pedidos");
        apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarActionPerformed(evt);
            }
        });

        validade1.setText("Visualizar validades");
        validade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validade1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout verLayout = new javax.swing.GroupLayout(ver);
        ver.setLayout(verLayout);
        verLayout.setHorizontalGroup(
            verLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(verLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_validade, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apagar)
                    .addGroup(verLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(validade1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(validade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        verLayout.setVerticalGroup(
            verLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txt_validade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(validade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(validade1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(apagar)
                .addGap(18, 18, 18))
        );

        getContentPane().add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apm/math-add-icon (1).png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apm/Windows-Close-Program-icon (1).png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apm/pencil-icon.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 40, 30));

        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 220, -1));

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel6.setText("Validade:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 123, -1));

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel5.setText("Curso:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apm/refresh.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 20, -1, -1));

        jLabel2.setText("Total de pedidos:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(973, 70, 110, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apm/settings-icon.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 10, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 1140, 550));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 70, 50, 14));

        jButton5.setText("Pesquisar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 90, 100, 20));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 790, -1));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apm/Excel-icon_1.png"))); // NOI18N
        jButton6.setText("CONVERTER PARA EXCEL");
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apm/obs.png"))); // NOI18N
        jButton1.setText("OBSERVAÇÃO");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel1.setText("Pesquisar:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1163, 676));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        DefaultTableModel tabela = new DefaultTableModel();
        String digita = jTextField1.getText();
        if (digita.equals("")) {
            JOptionPane.showMessageDialog(this, "Digite algo para pesquisar, por favor!");
        } else {
            tabela.addColumn("<html><b>RM</b></html>");
            tabela.addColumn("<html><b>NOME</b></html>");
            tabela.addColumn("<html><b>RG</b></html>");
            tabela.addColumn("<html><b>DATA DE NASCIMENTO</b></html>");

            String res = func.listCarterinha("SELECT * FROM carterinha WHERE rm LIKE \"%" + digita + "%\" OR nome LIKE \"%" + digita + "%\" OR curso LIKE \"%" + digita + "%\" OR rg LIKE \"%" + digita + "%\" OR data_nasc LIKE \"%" + digita + "%\" OR validade LIKE \"%" + digita + "%\";");
            String partes[] = res.split("&");
            int i = 0;
            int k = 0;

            try {
                for (i = 0; i < partes.length; i++) {
                    String partes_partes[] = partes[i].split(";");
                    String[] tudo = {partes_partes[0], partes_partes[1], partes_partes[3], partes_partes[4]};
                    tabela.addRow(tudo);

                }
            } catch (Exception e) {
                System.out.println(e);
            }

            jTextField1.setText("");
            jTable1.setModel(tabela);
            verificar_obs();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        DefaultTableModel tabela = new DefaultTableModel();
        int total = jTable1.getRowCount();
        try {
            String curso = jComboBox1.getSelectedItem().toString();
            String val = jComboBox2.getSelectedItem().toString();

            tabela.addColumn("<html><b>RM</b></html>");
            tabela.addColumn("<html><b>NOME</b></html>");
            tabela.addColumn("<html><b>RG</b></html>");
            tabela.addColumn("<html><b>DATA DE NASCIMENTO</b></html>");

            String res = func.listCarterinha("SELECT * FROM carterinha WHERE curso='" + curso + "' AND validade = '" + val + "';");
            String partes[] = res.split("&");
            int i = 0;
            int k = 0;

            while (partes[i] != null) {
                String partes_partes[] = partes[i].split(";");
                String[] tudo = {partes_partes[0], partes_partes[1], partes_partes[3], partes_partes[4]};
                tabela.addRow(tudo);

                i++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        jTable1.setModel(tabela);
        jLabel3.setText("" + total);
        verificar_obs();
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        DefaultTableModel tabela = new DefaultTableModel();
        int total = jTable1.getRowCount();
        try {
            String curso = jComboBox1.getSelectedItem().toString();
            String val = jComboBox2.getSelectedItem().toString();

            tabela.addColumn("<html><b>RM</b></html>");
            tabela.addColumn("<html><b>NOME</b></html>");
            tabela.addColumn("<html><b>RG</b></html>");
            tabela.addColumn("<html><b>DATA DE NASCIMENTO</b></html>");

            String res = func.listCarterinha("SELECT * FROM carterinha WHERE curso='" + curso + "' AND validade = '" + val + "';");
            String partes[] = res.split("&");
            int i = 0;
            int k = 0;

            while (partes[i] != null) {
                String partes_partes[] = partes[i].split(";");
                String[] tudo = {partes_partes[0], partes_partes[1], partes_partes[3], partes_partes[4]};
                tabela.addRow(tudo);

                i++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        jTable1.setModel(tabela);
        jLabel3.setText("" + total);
        verificar_obs();
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased

    }//GEN-LAST:event_jTextField1KeyReleased

    private void apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarActionPerformed
        int res = sn();
        if (res == 0) {
            zerar();
            JOptionPane.showMessageDialog(this, "Sucess");
        } else {
        }
    }//GEN-LAST:event_apagarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        fill();
        fill2();
        ver.setVisible(false);
        txt_validade.setVisible(false);
        validade.setVisible(false);
        apagar.setVisible(false);
        DefaultTableModel tabela = new DefaultTableModel();
        try {
            String curso = jComboBox1.getSelectedItem().toString();
            String val = jComboBox2.getSelectedItem().toString();

            tabela.addColumn("<html><b>RM</b></html>");
            tabela.addColumn("<html><b>NOME</b></html>");
            tabela.addColumn("<html><b>RG</b></html>");
            tabela.addColumn("<html><b>DATA DE NASCIMENTO</b></html>");

            String res = func.listCarterinha("SELECT * FROM carterinha WHERE curso='" + curso + "' AND validade = '" + val + "';");
            String partes[] = res.split("&");
            int i = 0;
            int k = 0;

            while (partes[i] != null) {
                String partes_partes[] = partes[i].split(";");
                String[] tudo = {partes_partes[0], partes_partes[1], partes_partes[3], partes_partes[4]};
                tabela.addRow(tudo);

                i++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        jTable1.setModel(tabela);
        int total = jTable1.getRowCount();
        jLabel3.setText("" + total);
        verificar_obs();
    }//GEN-LAST:event_formWindowOpened

    private void validadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validadeActionPerformed
        String data = txt_validade.getText();
        if (data.equals("  /  /    ")) {
            JOptionPane.showMessageDialog(this, "Insira uma validade!");
        } else {
            func.sql("INSERT INTO validade VALUES('" + data + "')");
        }
    }//GEN-LAST:event_validadeActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        if (ver.isVisible() == false) {
            jButton5.setEnabled(false);
            ver.setVisible(true);
            txt_validade.setVisible(true);
            validade.setVisible(true);
            apagar.setVisible(true);
        } else {
            jButton5.setEnabled(true);
            ver.setVisible(false);
            txt_validade.setVisible(false);
            validade.setVisible(false);
            apagar.setVisible(false);
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        ver.setVisible(false);
        txt_validade.setVisible(false);
        validade.setVisible(false);
        apagar.setVisible(false);
    }//GEN-LAST:event_formMouseClicked

    private void validade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validade1ActionPerformed
        // TODO add your handling code here:
        validade frm = new validade();
        frm.setVisible(true);
    }//GEN-LAST:event_validade1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new Thread(new Runnable() {
            public void run() {
                func.csv();
                vailogo();
            }
        }).start();

    }//GEN-LAST:event_jButton6ActionPerformed
    public void vailogo() {
        JOptionPane.showMessageDialog(this, "Excel gerado com sucesso!");

    }
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        ped_car frm = new ped_car();
        frm.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        String val = jComboBox2.getSelectedItem().toString();
        String curso = jComboBox1.getSelectedItem().toString();
        int selecionado = jTable1.getSelectedRow();
        if (selecionado < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um dado para deletar!");
        } else {
            String rm = jTable1.getValueAt(selecionado, 0).toString();
            String sql = "DELETE FROM carterinha WHERE cod=" + rm + ";";
            func.sql(sql);
            this.dispose();
            pedido_carteira frm = new pedido_carteira();
            frm.jComboBox2.setSelectedItem(val);
            frm.jComboBox1.setSelectedItem(curso);
            frm.setVisible(true);
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        int selecionado = jTable1.getSelectedRow();
        if (selecionado < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um dado para editar!");
        } else {
            int i = 0;
            int qtd_cols = jTable1.getColumnCount();

            String valores[] = new String[100];
            String items = "";
            while (i < qtd_cols) {
                valores[i] = jTable1.getValueAt(selecionado, i).toString();
                i++;
            }
            int k = 0;
            int p = 0;
            try {
                while (valores[k] != null) {
                    p += 1;
                    k++;
                }
            } catch (Exception e) {

            }
            i = 0;
            String data = "";
            while (i < k) {
                data += valores[i] + ";";
                i++;
            }
            i = 0;

            try {
                while (jTable1.getColumnName(i).toString() != null) {
                    items += jTable1.getColumnName(i).toString() + ";";
                    i++;
                }
            } catch (Exception e) {

            }
            editar_car ed = new editar_car();
            ed.res = data;
            ed.curso = jComboBox1.getSelectedItem().toString();
            ed.val = jComboBox2.getSelectedItem().toString();
            ed.setVisible(true);
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        jButton5.setEnabled(true);
        ver.setVisible(false);
        txt_validade.setVisible(false);
        validade.setVisible(false);
        apagar.setVisible(false);
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selecionado = jTable1.getSelectedRow();
        String codigo = jTable1.getValueAt(selecionado, 0).toString();
        System.out.println(codigo);
        obs ob = new obs();
        ob.cod = removeHTML(codigo);
        ob.tipo = jComboBox2.getSelectedItem().toString();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    public String removeHTML(String text) {
        String tags[] = {"<html>", "</html>", "<font color=\"red\">", "<font color=\"#cccc00\">", "<font color=\"blue\"", "<font color=\"green\">", "<font color=\"purple\">", "</font>", "<font color=\"\">", "<ul>", "</ul>", "<li>", "</li>"};
        int contador = 0;
        while (contador < tags.length) {
            text = text.replace(tags[contador], "");
            contador++;
        }
        return text;
    }

    public void verificar_obs() {
        String res = func.listObs("SELECT * FROM observacoes WHERE tipo='" + jComboBox2.getSelectedItem() + "'");
        String partes[] = res.split(";");

            int quant = jTable1.getRowCount();
            int i = 0;
            while (i < quant) {
                String cod = jTable1.getValueAt(i, 0).toString();
                int k = 0;
                while (k < partes.length) {
                    if (cod.equals(partes[k])) {
                        jTable1.setValueAt("<html><ul><li>" + cod + "</li></ul></html>", i, 0);
                        break;
                    } else {

                    }
                    k++;
                }

                i++;
            }
        
    }
    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        String valor1 = jComboBox1.getSelectedItem().toString();
        String valor2 = jComboBox2.getSelectedItem().toString();
        this.dispose();
        pedido_carteira frm = new pedido_carteira();
        frm.setVisible(true);
        frm.jComboBox1.setSelectedItem(valor1);
        frm.jComboBox2.setSelectedItem(valor2);
    }//GEN-LAST:event_jLabel10MouseClicked

    public void zerar() {
        func.sql2("DROP TABLE carterinha;");
        func.sql2("CREATE TABLE carterinha (\n"
                + "rm INT(7) NOT NULL,\n"
                + "nome VARCHAR(100) NOT NULL,\n"
                + "curso VARCHAR(200) NOT NULL,\n"
                + "rg VARCHAR(20) NOT NULL,\n"
                + "data_nasc VARCHAR(50) NOT NULL,\n"
                + "validade VARCHAR(50) NOT NULL,\n"
                + "PRIMARY KEY (`rm`)\n"
                + ")");
    }

    public void zerarValidade() {
        func.sql2("DROP TABLE validade;");
        func.sql2("CREATE TABLE validade(data varchar(50));");
    }

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

            jComboBox2.setModel(lista);
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

            jComboBox1.setModel(lista);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int qualAdesao() {
        int res = 0;
        int i = JOptionPane.showOptionDialog(null,
                "Qual é o tipo de adesão?",
                "Feedback",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                new String[]{"Etim", "Técnico", "Camiseta"}, null);
        return i;
    }

    public int sn() {
        int res = 0;
        int i = JOptionPane.showOptionDialog(null,
                "Tem certeza disto?",
                "Feedback",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                new String[]{"Sim", "Não"}, null);
        return i;
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
            java.util.logging.Logger.getLogger(pedido_carteira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pedido_carteira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pedido_carteira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pedido_carteira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pedido_carteira().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apagar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    public javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JFormattedTextField txt_validade;
    private javax.swing.JButton validade;
    private javax.swing.JButton validade1;
    private javax.swing.JPanel ver;
    // End of variables declaration//GEN-END:variables
}
