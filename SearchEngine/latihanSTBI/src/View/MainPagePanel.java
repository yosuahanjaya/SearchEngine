/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author specter2k11
 */
public class MainPagePanel extends javax.swing.JPanel {

    /**
     * Creates new form MainPagePanel
     */
    public MainPagePanel() {
        initComponents();
        logoImageLabel.setIcon(new ImageIcon(new ImageIcon("Images/masgoogle.png").getImage().getScaledInstance(240, 240, Image.SCALE_DEFAULT)));
        logoImageLabel.setText("");
        validate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modeButtonGroup = new javax.swing.ButtonGroup();
        modelButtonGroup = new javax.swing.ButtonGroup();
        searchTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        paddingPanel1 = new javax.swing.JPanel();
        paddingPanel2 = new javax.swing.JPanel();
        modeSelectPanel = new javax.swing.JPanel();
        advModeButton = new javax.swing.JRadioButton();
        andModeButton = new javax.swing.JRadioButton();
        orModeButton = new javax.swing.JRadioButton();
        searchModeLabel = new javax.swing.JLabel();
        outputNumberSpinner = new javax.swing.JSpinner();
        probabilisticModelButton = new javax.swing.JRadioButton();
        searchModelLabel = new javax.swing.JLabel();
        languageModelButton = new javax.swing.JRadioButton();
        resultAmountLabel = new javax.swing.JLabel();
        logoImageLabel = new javax.swing.JLabel();

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        paddingPanel1.setPreferredSize(new java.awt.Dimension(60, 0));

        javax.swing.GroupLayout paddingPanel1Layout = new javax.swing.GroupLayout(paddingPanel1);
        paddingPanel1.setLayout(paddingPanel1Layout);
        paddingPanel1Layout.setHorizontalGroup(
            paddingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        paddingPanel1Layout.setVerticalGroup(
            paddingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
        );

        paddingPanel2.setPreferredSize(new java.awt.Dimension(60, 0));

        javax.swing.GroupLayout paddingPanel2Layout = new javax.swing.GroupLayout(paddingPanel2);
        paddingPanel2.setLayout(paddingPanel2Layout);
        paddingPanel2Layout.setHorizontalGroup(
            paddingPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        paddingPanel2Layout.setVerticalGroup(
            paddingPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        modeButtonGroup.add(advModeButton);
        advModeButton.setText("Advanced Query");

        modeButtonGroup.add(andModeButton);
        andModeButton.setText("AND");

        modeButtonGroup.add(orModeButton);
        orModeButton.setSelected(true);
        orModeButton.setText("OR");

        searchModeLabel.setText("Search Mode");

        outputNumberSpinner.setModel(new javax.swing.SpinnerNumberModel(10, 10, null, 5));

        modelButtonGroup.add(probabilisticModelButton);
        probabilisticModelButton.setSelected(true);
        probabilisticModelButton.setText("TF-IDF");

        searchModelLabel.setText("Model");

        modelButtonGroup.add(languageModelButton);
        languageModelButton.setText("Language Model");

        resultAmountLabel.setText("Result Amount");

        advModeButton.setActionCommand("2");
        andModeButton.setActionCommand("1");
        orModeButton.setActionCommand("0");
        probabilisticModelButton.setActionCommand("0");
        languageModelButton.setActionCommand("1");

        javax.swing.GroupLayout modeSelectPanelLayout = new javax.swing.GroupLayout(modeSelectPanel);
        modeSelectPanel.setLayout(modeSelectPanelLayout);
        modeSelectPanelLayout.setHorizontalGroup(
            modeSelectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modeSelectPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(modeSelectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultAmountLabel)
                    .addComponent(searchModeLabel)
                    .addComponent(searchModelLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modeSelectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modeSelectPanelLayout.createSequentialGroup()
                        .addComponent(orModeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(andModeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(advModeButton))
                    .addGroup(modeSelectPanelLayout.createSequentialGroup()
                        .addComponent(probabilisticModelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(languageModelButton))
                    .addComponent(outputNumberSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        modeSelectPanelLayout.setVerticalGroup(
            modeSelectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modeSelectPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(modeSelectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(probabilisticModelButton)
                    .addComponent(searchModelLabel)
                    .addComponent(languageModelButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modeSelectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orModeButton)
                    .addComponent(andModeButton)
                    .addComponent(advModeButton)
                    .addComponent(searchModeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modeSelectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputNumberSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultAmountLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        logoImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoImageLabel.setText("Logo");
        logoImageLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logoImageLabel.setPreferredSize(new java.awt.Dimension(24, 24));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paddingPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modeSelectPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(paddingPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paddingPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                    .addComponent(paddingPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(logoImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modeSelectPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        SearchResultPanel resultPanel = new SearchResultPanel(searchTextField.getText(),Integer.parseInt(modeButtonGroup.getSelection().getActionCommand()),Integer.parseInt(modelButtonGroup.getSelection().getActionCommand()), Integer.parseInt(outputNumberSpinner.getValue().toString()));
        parentFrame.getContentPane().remove(this);
        parentFrame.setContentPane(resultPanel);
        parentFrame.repaint();
        parentFrame.validate();
    }//GEN-LAST:event_searchButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton advModeButton;
    private javax.swing.JRadioButton andModeButton;
    private javax.swing.JRadioButton languageModelButton;
    private javax.swing.JLabel logoImageLabel;
    private javax.swing.ButtonGroup modeButtonGroup;
    private javax.swing.JPanel modeSelectPanel;
    private javax.swing.ButtonGroup modelButtonGroup;
    private javax.swing.JRadioButton orModeButton;
    private javax.swing.JSpinner outputNumberSpinner;
    private javax.swing.JPanel paddingPanel1;
    private javax.swing.JPanel paddingPanel2;
    private javax.swing.JRadioButton probabilisticModelButton;
    private javax.swing.JLabel resultAmountLabel;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel searchModeLabel;
    private javax.swing.JLabel searchModelLabel;
    private javax.swing.JTextField searchTextField;
    // End of variables declaration//GEN-END:variables
}
