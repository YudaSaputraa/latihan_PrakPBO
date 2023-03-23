/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jform;

import javax.swing.JOptionPane;
import latihankuis.KaryaTulis;

/**
 *
 * @author Yudha
 */
public class CiptaPuisiFrame extends javax.swing.JFrame {

    /**
     * Creates new form KaryaTulisFrame
     */
    public CiptaPuisiFrame() {
        initComponents();
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
        jPanel1 = new javax.swing.JPanel();
        namaTitle = new javax.swing.JLabel();
        jurusanTitle = new javax.swing.JLabel();
        nimTitle = new javax.swing.JLabel();
        namaField = new javax.swing.JTextField();
        jurusanField = new javax.swing.JTextField();
        nimField = new javax.swing.JTextField();
        formPenilaianTitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tataBahasaTitle = new javax.swing.JLabel();
        strukturTitle = new javax.swing.JLabel();
        kreativitasTitle = new javax.swing.JLabel();
        tataBahasaField = new javax.swing.JTextField();
        strukturField = new javax.swing.JTextField();
        kreativitasField = new javax.swing.JTextField();
        eydField = new javax.swing.JTextField();
        eydTitle = new javax.swing.JLabel();
        batalButton = new javax.swing.JButton();
        simpanButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Penilaian CiptaPuisi");

        jLabel2.setText("Form Biodata");

        namaTitle.setText("Nama");

        jurusanTitle.setText("Jurusan");

        nimTitle.setText("NIM");

        namaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nimTitle)
                    .addComponent(jurusanTitle)
                    .addComponent(namaTitle))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(namaField)
                    .addComponent(jurusanField)
                    .addComponent(nimField, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaTitle)
                    .addComponent(namaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jurusanTitle)
                    .addComponent(jurusanField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nimTitle)
                    .addComponent(nimField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        formPenilaianTitle.setText("Form Penilaian (0 - 100)");

        tataBahasaTitle.setText("Tata Bahasa");

        strukturTitle.setText("Struktur");

        kreativitasTitle.setText("Kreativitas");

        tataBahasaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tataBahasaFieldActionPerformed(evt);
            }
        });

        kreativitasField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kreativitasFieldActionPerformed(evt);
            }
        });

        eydTitle.setText("EYD");

        batalButton.setText("Batal");
        batalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalButtonActionPerformed(evt);
            }
        });

        simpanButton.setText("Simpan");
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eydTitle)
                    .addComponent(strukturTitle)
                    .addComponent(kreativitasTitle)
                    .addComponent(tataBahasaTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tataBahasaField)
                    .addComponent(strukturField)
                    .addComponent(kreativitasField)
                    .addComponent(eydField, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(simpanButton)
                .addGap(45, 45, 45)
                .addComponent(batalButton)
                .addGap(70, 70, 70))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tataBahasaTitle)
                    .addComponent(tataBahasaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eydTitle)
                    .addComponent(eydField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(strukturField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(strukturTitle))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kreativitasField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kreativitasTitle))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(batalButton)
                    .addComponent(simpanButton))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(320, 320, 320))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(formPenilaianTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(228, 228, 228))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(formPenilaianTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaFieldActionPerformed

    private void tataBahasaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tataBahasaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tataBahasaFieldActionPerformed

    private void kreativitasFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kreativitasFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kreativitasFieldActionPerformed

    private void batalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalButtonActionPerformed
        MainGUI main = new MainGUI();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_batalButtonActionPerformed

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        String nama;
        String jurusann;
        String nimm;
        int nilaiTBahasaa;
        int nilaiEydd;
        int nilaiStrukturr;
        int nilaiKreatifitass;
        if (evt.getSource() == simpanButton) {
            if (namaField.getText().isEmpty() && jurusanField.getText().isEmpty() && nimField.getText().isEmpty() && tataBahasaField.getText().isEmpty() && eydField.getText().isEmpty() && strukturField.getText().isEmpty() && kreativitasField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Silahkan isi semua Field");
            } else if (namaField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Silahkan isi Field 'Nama'");
            } else if (jurusanField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Silahkan isi Field 'Jurusan'");
            } else if (nimField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Siilahkan isi Field 'Jurusan'");
            } else if (tataBahasaField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Siilahkan isi Field 'Tata Bahasa'");
            } else if (eydField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Siilahkan isi Field 'EYD'");
            } else if (strukturField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Siilahkan isi Field 'Struktur'");
            } else if (kreativitasField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Siilahkan isi Field 'Kreatifitas'");
            } else {
                try {
                    nama = namaField.getText();
                    jurusann = jurusanField.getText();
                    nimm = nimField.getText();
                    nilaiTBahasaa = Integer.parseInt(tataBahasaField.getText());
                    nilaiEydd = Integer.parseInt(eydField.getText());
                    nilaiStrukturr = Integer.parseInt(strukturField.getText());
                    nilaiKreatifitass = Integer.parseInt(kreativitasField.getText());

                    KaryaTulis karyaTulis = new KaryaTulis(nama, jurusann, nimm, nilaiTBahasaa, nilaiEydd, nilaiStrukturr, nilaiKreatifitass);
                    karyaTulis.setName(nama);
                    karyaTulis.setJurusan(jurusann);
                    karyaTulis.setNim(nimm);
                    karyaTulis.setNilaiTBahasa(nilaiTBahasaa);
                    karyaTulis.setNilaiEyd(nilaiEydd);
                    karyaTulis.setNilaiStruktur(nilaiStrukturr);
                    karyaTulis.setNilaiKreatifitas(nilaiKreatifitass);

                    ResutlFrame result = new ResutlFrame();
                    result.setVisible(true);
                    result.nameResultTitle.setText(karyaTulis.getName());
                    result.jurusanResultTitle.setText(karyaTulis.getJurusan());
                    result.nimResultTitle.setText(karyaTulis.getNim());
                    result.nilaiAkhirTitle.setText(String.valueOf(karyaTulis.nilaiAkhir()));
                    if (karyaTulis.nilaiAkhir() >= 85) {
                        result.keteranganTitle.setText("LOLOS");
                    } else {
                        result.keteranganTitle.setText("GAGAL");
                    }

                    this.dispose();

                } catch (Exception e) {
                }

            }
        }

    }//GEN-LAST:event_simpanButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CiptaPuisiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CiptaPuisiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CiptaPuisiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CiptaPuisiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CiptaPuisiFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batalButton;
    private javax.swing.JTextField eydField;
    private javax.swing.JLabel eydTitle;
    private javax.swing.JLabel formPenilaianTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jurusanField;
    private javax.swing.JLabel jurusanTitle;
    private javax.swing.JTextField kreativitasField;
    private javax.swing.JLabel kreativitasTitle;
    private javax.swing.JTextField namaField;
    private javax.swing.JLabel namaTitle;
    private javax.swing.JTextField nimField;
    private javax.swing.JLabel nimTitle;
    private javax.swing.JButton simpanButton;
    private javax.swing.JTextField strukturField;
    private javax.swing.JLabel strukturTitle;
    private javax.swing.JTextField tataBahasaField;
    private javax.swing.JLabel tataBahasaTitle;
    // End of variables declaration//GEN-END:variables
}