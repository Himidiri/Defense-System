/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defensesystem.view;

import defensesystem.controller.Observable;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Himidiri Himakanika
 */
public class MainController extends javax.swing.JFrame {

    private int totalSoldiers = 0;
    private int totalAmmo = 0;
    private int tankFuel = 100;
    private int helicopterFuel = 100;
    private int submarineFuel = 100;
    private Observable observable;

    public MainController(Observable observable) {
        this.observable = observable;
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/defensesystem/utils/icon.png")).getImage());

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width / 2) + 5 / 2;
        int y = 30 * 2 + this.getHeight();
        this.setLocation(x, y);

        setVisible(true);
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
        sendMsgTextField = new javax.swing.JTextField();
        sendBtn = new javax.swing.JButton();
        selectDefense = new javax.swing.JComboBox<>();
        areaClearCheckBox = new javax.swing.JCheckBox();
        soldierCountLbl = new javax.swing.JLabel();
        setSoldierCount = new javax.swing.JLabel();
        fuelAmountLbl = new javax.swing.JLabel();
        setAmmoAmount = new javax.swing.JLabel();
        ammoAmountLbl = new javax.swing.JLabel();
        setFuelAmount = new javax.swing.JLabel();
        sendPrivateCheckBox = new javax.swing.JCheckBox();
        positionLbl = new javax.swing.JLabel();
        positionSlider = new javax.swing.JSlider();
        jScrollPane2 = new javax.swing.JScrollPane();
        msgTextPane = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        infoTextPane = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MainController");
        setBackground(new java.awt.Color(0, 153, 153));
        setPreferredSize(new java.awt.Dimension(820, 480));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(820, 480));
        jPanel1.setLayout(null);

        sendMsgTextField.setBackground(new java.awt.Color(51, 51, 51));
        sendMsgTextField.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        sendMsgTextField.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(sendMsgTextField);
        sendMsgTextField.setBounds(390, 270, 300, 40);

        sendBtn.setBackground(new java.awt.Color(0, 102, 102));
        sendBtn.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        sendBtn.setForeground(new java.awt.Color(255, 255, 255));
        sendBtn.setText("Send");
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });
        jPanel1.add(sendBtn);
        sendBtn.setBounds(700, 270, 80, 40);

        selectDefense.setBackground(new java.awt.Color(51, 51, 51));
        selectDefense.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        selectDefense.setForeground(new java.awt.Color(255, 153, 0));
        selectDefense.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Defense", "Helicopter", "Tank", "Submarine" }));
        selectDefense.setEnabled(false);
        selectDefense.setMinimumSize(new java.awt.Dimension(150, 30));
        selectDefense.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel1.add(selectDefense);
        selectDefense.setBounds(390, 20, 180, 40);

        areaClearCheckBox.setBackground(new java.awt.Color(0, 51, 51));
        areaClearCheckBox.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        areaClearCheckBox.setForeground(new java.awt.Color(255, 204, 0));
        areaClearCheckBox.setText("Area Clear");
        areaClearCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaClearCheckBoxActionPerformed(evt);
            }
        });
        jPanel1.add(areaClearCheckBox);
        areaClearCheckBox.setBounds(250, 60, 110, 50);

        soldierCountLbl.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        soldierCountLbl.setForeground(new java.awt.Color(255, 255, 255));
        soldierCountLbl.setText("Soldier Count : ");
        soldierCountLbl.setMaximumSize(new java.awt.Dimension(100, 20));
        soldierCountLbl.setMinimumSize(new java.awt.Dimension(100, 20));
        soldierCountLbl.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(soldierCountLbl);
        soldierCountLbl.setBounds(10, 20, 130, 50);

        setSoldierCount.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        setSoldierCount.setForeground(new java.awt.Color(255, 255, 255));
        setSoldierCount.setMaximumSize(new java.awt.Dimension(30, 20));
        setSoldierCount.setMinimumSize(new java.awt.Dimension(30, 20));
        setSoldierCount.setPreferredSize(new java.awt.Dimension(30, 20));
        jPanel1.add(setSoldierCount);
        setSoldierCount.setBounds(140, 20, 80, 50);

        fuelAmountLbl.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        fuelAmountLbl.setForeground(new java.awt.Color(255, 255, 255));
        fuelAmountLbl.setText("Fuel Amount : ");
        fuelAmountLbl.setMaximumSize(new java.awt.Dimension(100, 20));
        fuelAmountLbl.setMinimumSize(new java.awt.Dimension(100, 20));
        fuelAmountLbl.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(fuelAmountLbl);
        fuelAmountLbl.setBounds(10, 60, 130, 50);

        setAmmoAmount.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        setAmmoAmount.setForeground(new java.awt.Color(255, 255, 255));
        setAmmoAmount.setMaximumSize(new java.awt.Dimension(30, 20));
        setAmmoAmount.setMinimumSize(new java.awt.Dimension(30, 20));
        setAmmoAmount.setPreferredSize(new java.awt.Dimension(30, 20));
        jPanel1.add(setAmmoAmount);
        setAmmoAmount.setBounds(140, 100, 80, 50);

        ammoAmountLbl.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        ammoAmountLbl.setForeground(new java.awt.Color(255, 255, 255));
        ammoAmountLbl.setText("Ammo Amount :");
        ammoAmountLbl.setMaximumSize(new java.awt.Dimension(100, 20));
        ammoAmountLbl.setMinimumSize(new java.awt.Dimension(100, 20));
        ammoAmountLbl.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(ammoAmountLbl);
        ammoAmountLbl.setBounds(10, 100, 130, 50);

        setFuelAmount.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        setFuelAmount.setForeground(new java.awt.Color(255, 255, 255));
        setFuelAmount.setMaximumSize(new java.awt.Dimension(30, 20));
        setFuelAmount.setMinimumSize(new java.awt.Dimension(30, 20));
        setFuelAmount.setPreferredSize(new java.awt.Dimension(30, 20));
        jPanel1.add(setFuelAmount);
        setFuelAmount.setBounds(140, 60, 70, 50);

        sendPrivateCheckBox.setBackground(new java.awt.Color(0, 51, 51));
        sendPrivateCheckBox.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        sendPrivateCheckBox.setForeground(new java.awt.Color(0, 204, 204));
        sendPrivateCheckBox.setText("Send Private");
        sendPrivateCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendPrivateCheckBoxActionPerformed(evt);
            }
        });
        jPanel1.add(sendPrivateCheckBox);
        sendPrivateCheckBox.setBounds(660, 20, 150, 40);

        positionLbl.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        positionLbl.setForeground(new java.awt.Color(0, 204, 204));
        positionLbl.setText("Position");
        positionLbl.setMaximumSize(new java.awt.Dimension(100, 20));
        positionLbl.setMinimumSize(new java.awt.Dimension(100, 20));
        positionLbl.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(positionLbl);
        positionLbl.setBounds(390, 310, 130, 50);

        positionSlider.setBackground(new java.awt.Color(0, 51, 51));
        positionSlider.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        positionSlider.setForeground(new java.awt.Color(255, 255, 255));
        positionSlider.setMajorTickSpacing(20);
        positionSlider.setMinorTickSpacing(10);
        positionSlider.setPaintLabels(true);
        positionSlider.setPaintTicks(true);
        positionSlider.setSnapToTicks(true);
        positionSlider.setValue(0);
        positionSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                positionSliderStateChanged(evt);
            }
        });
        jPanel1.add(positionSlider);
        positionSlider.setBounds(380, 350, 410, 60);

        msgTextPane.setBackground(new java.awt.Color(0, 0, 0));
        msgTextPane.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        msgTextPane.setForeground(new java.awt.Color(255, 255, 255));
        msgTextPane.setPreferredSize(new java.awt.Dimension(272, 109));
        jScrollPane2.setViewportView(msgTextPane);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(390, 90, 390, 170);

        infoTextPane.setBackground(new java.awt.Color(0, 0, 0));
        infoTextPane.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        infoTextPane.setForeground(new java.awt.Color(255, 255, 255));
        infoTextPane.setPreferredSize(new java.awt.Dimension(272, 109));
        jScrollPane3.setViewportView(infoTextPane);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(10, 150, 350, 280);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void areaClearCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaClearCheckBoxActionPerformed
        boolean select = areaClearCheckBox.isSelected();
        System.out.println(select);
        observable.setArea(select);
    }//GEN-LAST:event_areaClearCheckBoxActionPerformed

    private void sendPrivateCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendPrivateCheckBoxActionPerformed
        boolean isPvtSelect = sendPrivateCheckBox.isSelected();
        if (isPvtSelect) {
            selectDefense.setEnabled(true);
        } else {
            selectDefense.setEnabled(false);
        }
    }//GEN-LAST:event_sendPrivateCheckBoxActionPerformed

    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnActionPerformed
        String message = sendMsgTextField.getText();
        boolean isPrivate = sendPrivateCheckBox.isSelected();
        String selectedDefense = (String) selectDefense.getSelectedItem();

        if (message.isEmpty()) {
            appendStyledText(msgTextPane, "Error : Please type your message!", Color.RED);
            return;
        }
        if (isPrivate && (selectedDefense == null || selectedDefense.equals("Select Defense"))) {
            appendStyledText(msgTextPane, "Error : Please select a defense to send a private message", Color.RED);
            sendMsgTextField.setText("");
            return;
        }
        if (isPrivate && selectedDefense != null && !selectedDefense.equals("Select Defence")) {
            observable.broadcastMessage(message, true, selectedDefense);
            appendStyledText(msgTextPane, "To " + selectedDefense + " : " + message, Color.GREEN);
        } else if (!isPrivate) {
            observable.broadcastMessage(message, false, "All");
            appendStyledText(msgTextPane, "To All : " + message, Color.WHITE);
        }
        sendMsgTextField.setText("");
    }//GEN-LAST:event_sendBtnActionPerformed

    private void positionSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_positionSliderStateChanged
        observable.SetBtnEnable(positionSlider.getValue());
    }//GEN-LAST:event_positionSliderStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ammoAmountLbl;
    private javax.swing.JCheckBox areaClearCheckBox;
    private javax.swing.JLabel fuelAmountLbl;
    private javax.swing.JTextPane infoTextPane;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane msgTextPane;
    private javax.swing.JLabel positionLbl;
    private javax.swing.JSlider positionSlider;
    private javax.swing.JComboBox<String> selectDefense;
    private javax.swing.JButton sendBtn;
    private javax.swing.JTextField sendMsgTextField;
    private javax.swing.JCheckBox sendPrivateCheckBox;
    private javax.swing.JLabel setAmmoAmount;
    private javax.swing.JLabel setFuelAmount;
    private javax.swing.JLabel setSoldierCount;
    private javax.swing.JLabel soldierCountLbl;
    // End of variables declaration//GEN-END:variables

    public void updateTotalCounts(int soldierDifference, int ammoDifference) {
        totalSoldiers += soldierDifference;
        totalAmmo += ammoDifference;

        setSoldierCount.setText(String.valueOf(totalSoldiers));
        setAmmoAmount.setText(String.valueOf(totalAmmo));
    }

    public void updateFuel(String defenseName, int fuelValue) {
        switch (defenseName) {
            case "Tank":
                tankFuel = fuelValue;
                break;
            case "Helicopter":
                helicopterFuel = fuelValue;
                break;
            case "Submarine":
                submarineFuel = fuelValue;
                break;
        }

        int totalFuel = tankFuel + helicopterFuel + submarineFuel;
        setFuelAmount.setText(String.valueOf(totalFuel));

        if (fuelValue < 30) {
            appendInfoText(defenseName + ": Fuel level low! Immediate resupply needed.", Color.RED);
        }
    }

    public void receiveMessage(String message, boolean isPrivate, String sender) {
        if (!isPrivate) {
            appendStyledText(msgTextPane, "[From " + sender + "] : " + message, Color.YELLOW);
        } else {
            appendStyledText(msgTextPane, "[Private from " + sender + "] : " + message, Color.GREEN);
        }
    }

    public void appendStyledText(JTextPane textPane, String text, Color color) {
        StyledDocument doc = textPane.getStyledDocument();
        SimpleAttributeSet style = new SimpleAttributeSet();
        StyleConstants.setForeground(style, color);
        try {
            doc.insertString(doc.getLength(), text + "\n", style);
        } catch (BadLocationException e) {
        }
    }

    public void appendInfoText(String text, Color color) {
        appendStyledText(infoTextPane, text, color);
    }
}
