package entornoGraficoBackend;

import javax.swing.JOptionPane;

/**
 * @author alfonso && zofia
 */
public class ConversionsFrame extends javax.swing.JFrame {


    public ConversionsFrame() {
        initComponents();
        buttonGroup.add(binaryButton);
        buttonGroup.add(octalButton);
        buttonGroup.add(hexaButton);
        screen.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        inputField = new javax.swing.JTextField();
        screen = new javax.swing.JTextField();
        buttonsPanel = new javax.swing.JPanel();
        binaryButton = new javax.swing.JRadioButton();
        octalButton = new javax.swing.JRadioButton();
        hexaButton = new javax.swing.JRadioButton();
        textLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));
        setForeground(new java.awt.Color(102, 102, 102));
        setMinimumSize(new java.awt.Dimension(515, 414));

        inputField.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N

        screen.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N

        buttonsPanel.setBackground(new java.awt.Color(204, 204, 204));
        buttonsPanel.setForeground(new java.awt.Color(204, 204, 204));

        binaryButton.setBackground(new java.awt.Color(204, 204, 204));
        binaryButton.setFont(new java.awt.Font("DejaVu Sans", 1, 17)); // NOI18N
        binaryButton.setForeground(new java.awt.Color(153, 153, 153));
        binaryButton.setText("Decimal a Binario");
        binaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binaryButtonActionPerformed(evt);
            }
        });

        octalButton.setBackground(new java.awt.Color(204, 204, 204));
        octalButton.setFont(new java.awt.Font("DejaVu Sans", 1, 17)); // NOI18N
        octalButton.setForeground(new java.awt.Color(153, 153, 153));
        octalButton.setText("Decimal a Octal");
        octalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                octalButtonActionPerformed(evt);
            }
        });

        hexaButton.setBackground(new java.awt.Color(204, 204, 204));
        hexaButton.setFont(new java.awt.Font("DejaVu Sans", 1, 17)); // NOI18N
        hexaButton.setForeground(new java.awt.Color(153, 153, 153));
        hexaButton.setText("Decimal a Hexadecimal");
        hexaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hexaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(octalButton)
                    .addComponent(binaryButton)
                    .addComponent(hexaButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonsPanelLayout.setVerticalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(binaryButton)
                .addGap(18, 18, 18)
                .addComponent(octalButton)
                .addGap(18, 18, 18)
                .addComponent(hexaButton)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        textLabel.setBackground(new java.awt.Color(255, 255, 255));
        textLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 17)); // NOI18N
        textLabel.setForeground(new java.awt.Color(153, 153, 153));
        textLabel.setText("Numero a ingresar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(screen, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(screen, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void hexaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hexaButtonActionPerformed
        try {
            concatAndShowResult(Integer.toHexString(Integer.parseInt(inputField.getText())));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "porfavor coloque solo numeros decimales ", "ATENCION", JOptionPane.INFORMATION_MESSAGE);           
        }
        cleanField();
    }//GEN-LAST:event_hexaButtonActionPerformed

    private void octalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_octalButtonActionPerformed
        try {
            concatAndShowResult(Integer.toOctalString(Integer.parseInt(inputField.getText())));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "porfavor coloque solo numeros decimales ", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
        }
        cleanField();
    }//GEN-LAST:event_octalButtonActionPerformed

    private void binaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binaryButtonActionPerformed
        try {
            concatAndShowResult(Integer.toBinaryString(Integer.parseInt(inputField.getText())));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "porfavor coloque solo numeros decimales ", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
        }
        cleanField();
    }//GEN-LAST:event_binaryButtonActionPerformed

    public void cleanField() {
        inputField.setText("");
    }
    
    public void concatAndShowResult(String conversion) {
        String initialValue = inputField.getText();
        screen.setText(initialValue + " = " + conversion);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton binaryButton;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JRadioButton hexaButton;
    private javax.swing.JTextField inputField;
    private javax.swing.JRadioButton octalButton;
    private javax.swing.JTextField screen;
    private javax.swing.JLabel textLabel;
    // End of variables declaration//GEN-END:variables
}
