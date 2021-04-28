
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class EntryPanel extends javax.swing.JPanel {

    /**
     * Creates new form EntryPanel
     */
    public EntryPanel() {
        initComponents();
        loadTableData();
    }

    EntryPanel(JScrollPane contentScrollPane) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jkButtonGroup = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nimTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        lakiRadioButton = new javax.swing.JRadioButton();
        perempuanRadioButton = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        umurSpinner = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        provComboBox = new javax.swing.JComboBox<>();
        simpanToggleButton = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        kabComboBox = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        mahasiswaTable = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("NIM");

        jLabel2.setText("NAMA");

        jLabel3.setText("Jenis Kelamin");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Entri Data");

        jkButtonGroup.add(lakiRadioButton);
        lakiRadioButton.setText("Laki-laki");

        jkButtonGroup.add(perempuanRadioButton);
        perempuanRadioButton.setText("Perempuan");

        jLabel5.setText("Umur");

        umurSpinner.setModel(new javax.swing.SpinnerNumberModel(15, 15, null, 1));
        umurSpinner.setEditor(new javax.swing.JSpinner.NumberEditor(umurSpinner, ""));

        jLabel6.setText("tahun");

        jLabel7.setText("Provinsi");

        provComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jawa Timur", "Jawa Tengah", "DI Yogyakarta", "Jawa Barat", "DKI Jakarta", "Banten" }));
        provComboBox.setSelectedItem("");

        simpanToggleButton.setText("Simpan");
        simpanToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanToggleButtonActionPerformed(evt);
            }
        });

        jLabel8.setText("Kabupaten");

        kabComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Banyuwangi", "Surabaya", "Bandung", "Surakarta" }));
        kabComboBox.setSelectedItem("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(simpanToggleButton)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(lakiRadioButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(perempuanRadioButton))
                                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nimTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(umurSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6))
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(provComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kabComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel5});

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {nameTextField, nimTextField});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nimTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lakiRadioButton)
                    .addComponent(perempuanRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(umurSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(provComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(kabComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(simpanToggleButton)
                .addContainerGap(400, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, java.awt.BorderLayout.LINE_START);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Data Tersimpan");

        mahasiswaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIM", "Nama", "Jenis Kelamin", "Provinsi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        mahasiswaTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(mahasiswaTable);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(338, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel5, java.awt.BorderLayout.CENTER);

        add(jPanel3, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void simpanToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanToggleButtonActionPerformed
        // TODO add your handling code here:
        Mahasiswa mhs = new Mahasiswa();
        ValidasiMahasiswa vldMhs = new ValidasiMahasiswa();
        Database dataMahasiswa = Database.getInstance();
        mhs.setName(nameTextField.getText());
        mhs.setNim(nimTextField.getText());
        int umur = (Integer)umurSpinner.getValue();
        mhs.setUmur(umur);
        if(lakiRadioButton.isSelected()){
            mhs.setJk("Laki-laki");
        }else if(perempuanRadioButton.isSelected()){
            mhs.setJk("Perempuan");
        }else{
            mhs.setJk("");
        }
        mhs.setProv(provComboBox.getSelectedItem().toString());
        mhs.setKab(kabComboBox.getSelectedItem().toString());
        if(vldMhs.getIsTrue(mhs)){
            JOptionPane.showMessageDialog(this, vldMhs.getMessage());
            clearForm();
            try {
                dataMahasiswa.addMahasiswa(mhs);
            } catch (SQLException ex) {
                Logger.getLogger(EntryPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            loadTableData();
        }else{
            JOptionPane.showMessageDialog(this, vldMhs.getMessage());
        }
    }//GEN-LAST:event_simpanToggleButtonActionPerformed
    
    private void clearForm(){
        nimTextField.setText("");
        nameTextField.setText("");
        jkButtonGroup.clearSelection();
        umurSpinner.setValue(15);
        provComboBox.setSelectedIndex(0);
        kabComboBox.setSelectedIndex(0);
    }
    
    private void loadTableData(){
        DefaultTableModel dtm = (DefaultTableModel)mahasiswaTable.getModel();
        while(dtm.getRowCount()>0){
            dtm.removeRow(0);
        }
        try {
            for(Mahasiswa mhs : Database.getInstance().getListMahasiswa()){
                dtm.addRow(new Object[]{
                    mhs.getNim(),
                    mhs.getName(),
                    mhs.getJk(),
                    mhs.getProv()});
            }
        } catch (SQLException ex) {
            Logger.getLogger(EntryPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.ButtonGroup jkButtonGroup;
    private javax.swing.JComboBox<String> kabComboBox;
    private javax.swing.JRadioButton lakiRadioButton;
    private javax.swing.JTable mahasiswaTable;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField nimTextField;
    private javax.swing.JRadioButton perempuanRadioButton;
    private javax.swing.JComboBox<String> provComboBox;
    private javax.swing.JToggleButton simpanToggleButton;
    private javax.swing.JSpinner umurSpinner;
    // End of variables declaration//GEN-END:variables
}