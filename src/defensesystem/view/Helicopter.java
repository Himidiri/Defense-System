/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defensesystem.view;

import defensesystem.models.SuperDefence;
import defensesystem.utils.Strength;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author Himidiri Himakanika
 */
public class Helicopter extends SuperDefence {

    private int soldierCount = 200;
    private int ammoCount = 500;
    private boolean isFirstHelicopterShoot = true;
    private boolean isFirstHelicopterMissileOperation = true;
    private boolean isFirstHelicopterLaserOperation = true;

    public Helicopter(MainController mainController) {
        super(mainController, "Helicopter");
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/defensesystem/utils/helicopter-icon.png")).getImage());

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width / 2) - this.getWidth() - 5 / 2;
        int y = 50;
        this.setLocation(x, y);

        ImageIcon originalIcon = new ImageIcon(getClass().getResource("/defensesystem/utils/helicopter.gif"));
        Image scaledImage = originalIcon.getImage().getScaledInstance(350, -1, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        helicopterLbl.setIcon(scaledIcon);

        helicopterSoldierCountSpinner.setValue(soldierCount);
        helicopterAmmoCountSpinner.setValue(ammoCount);
        notifyMainControllerInitialCounts();
        mainController.updateFuel("Helicopter", helicopterSlider.getValue());
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
        helicoptArareaLbl = new javax.swing.JLabel();
        helicopterSoldierCountLbl = new javax.swing.JLabel();
        helicopterAmmoCountLbl = new javax.swing.JLabel();
        helicopterSlider = new javax.swing.JSlider();
        helicopterMsgTextField = new javax.swing.JTextField();
        helicopterAmmoCountSpinner = new javax.swing.JSpinner();
        helicopterSendBtn = new javax.swing.JButton();
        helicopterMissileOperationBtn = new javax.swing.JButton();
        helicopterPositionCheckBox = new javax.swing.JCheckBox();
        helicopterLbl = new javax.swing.JLabel();
        helicopterSoldierCountSpinner = new javax.swing.JSpinner();
        helicopterLaserOperationBtn = new javax.swing.JButton();
        helicopterShootBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        helicopterMsgTextPane = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Helicopter");
        setPreferredSize(new java.awt.Dimension(700, 480));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanel1.setLayout(null);

        helicoptArareaLbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        helicoptArareaLbl.setForeground(new java.awt.Color(255, 204, 0));
        helicoptArareaLbl.setText("Area Not Cleared");
        helicoptArareaLbl.setMaximumSize(new java.awt.Dimension(100, 30));
        helicoptArareaLbl.setMinimumSize(new java.awt.Dimension(100, 30));
        helicoptArareaLbl.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel1.add(helicoptArareaLbl);
        helicoptArareaLbl.setBounds(380, 20, 140, 30);

        helicopterSoldierCountLbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        helicopterSoldierCountLbl.setForeground(new java.awt.Color(255, 255, 255));
        helicopterSoldierCountLbl.setText("Soldier Count : ");
        jPanel1.add(helicopterSoldierCountLbl);
        helicopterSoldierCountLbl.setBounds(380, 70, 116, 30);

        helicopterAmmoCountLbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        helicopterAmmoCountLbl.setForeground(new java.awt.Color(255, 255, 255));
        helicopterAmmoCountLbl.setText("Ammo Count :");
        jPanel1.add(helicopterAmmoCountLbl);
        helicopterAmmoCountLbl.setBounds(380, 120, 109, 30);

        helicopterSlider.setBackground(new java.awt.Color(51, 51, 51));
        helicopterSlider.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        helicopterSlider.setForeground(new java.awt.Color(255, 255, 255));
        helicopterSlider.setMajorTickSpacing(20);
        helicopterSlider.setMinorTickSpacing(10);
        helicopterSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        helicopterSlider.setPaintLabels(true);
        helicopterSlider.setPaintTicks(true);
        helicopterSlider.setSnapToTicks(true);
        helicopterSlider.setValue(100);
        helicopterSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                helicopterSliderStateChanged(evt);
            }
        });
        jPanel1.add(helicopterSlider);
        helicopterSlider.setBounds(600, 100, 70, 280);

        helicopterMsgTextField.setBackground(new java.awt.Color(51, 51, 51));
        helicopterMsgTextField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        helicopterMsgTextField.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(helicopterMsgTextField);
        helicopterMsgTextField.setBounds(10, 390, 260, 40);

        helicopterAmmoCountSpinner.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        helicopterAmmoCountSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                helicopterAmmoCountSpinnerStateChanged(evt);
            }
        });
        jPanel1.add(helicopterAmmoCountSpinner);
        helicopterAmmoCountSpinner.setBounds(500, 120, 80, 30);

        helicopterSendBtn.setBackground(new java.awt.Color(0, 51, 51));
        helicopterSendBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        helicopterSendBtn.setForeground(new java.awt.Color(255, 255, 255));
        helicopterSendBtn.setText("Send");
        helicopterSendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helicopterSendBtnActionPerformed(evt);
            }
        });
        jPanel1.add(helicopterSendBtn);
        helicopterSendBtn.setBounds(280, 390, 80, 40);

        helicopterMissileOperationBtn.setBackground(new java.awt.Color(0, 102, 102));
        helicopterMissileOperationBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        helicopterMissileOperationBtn.setForeground(new java.awt.Color(255, 255, 255));
        helicopterMissileOperationBtn.setText("Missile Operation");
        helicopterMissileOperationBtn.setEnabled(false);
        helicopterMissileOperationBtn.setMaximumSize(new java.awt.Dimension(180, 30));
        helicopterMissileOperationBtn.setMinimumSize(new java.awt.Dimension(180, 30));
        helicopterMissileOperationBtn.setPreferredSize(new java.awt.Dimension(180, 30));
        helicopterMissileOperationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helicopterMissileOperationBtnActionPerformed(evt);
            }
        });
        jPanel1.add(helicopterMissileOperationBtn);
        helicopterMissileOperationBtn.setBounds(380, 280, 200, 50);

        helicopterPositionCheckBox.setBackground(new java.awt.Color(51, 51, 51));
        helicopterPositionCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        helicopterPositionCheckBox.setForeground(new java.awt.Color(0, 204, 204));
        helicopterPositionCheckBox.setText("Position");
        jPanel1.add(helicopterPositionCheckBox);
        helicopterPositionCheckBox.setBounds(580, 20, 110, 30);
        jPanel1.add(helicopterLbl);
        helicopterLbl.setBounds(10, 10, 350, 180);

        helicopterSoldierCountSpinner.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        helicopterSoldierCountSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                helicopterSoldierCountSpinnerStateChanged(evt);
            }
        });
        jPanel1.add(helicopterSoldierCountSpinner);
        helicopterSoldierCountSpinner.setBounds(500, 70, 80, 30);

        helicopterLaserOperationBtn.setBackground(new java.awt.Color(0, 102, 102));
        helicopterLaserOperationBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        helicopterLaserOperationBtn.setForeground(new java.awt.Color(255, 255, 255));
        helicopterLaserOperationBtn.setText("Laser Operation");
        helicopterLaserOperationBtn.setEnabled(false);
        helicopterLaserOperationBtn.setMaximumSize(new java.awt.Dimension(180, 30));
        helicopterLaserOperationBtn.setMinimumSize(new java.awt.Dimension(180, 30));
        helicopterLaserOperationBtn.setPreferredSize(new java.awt.Dimension(180, 30));
        helicopterLaserOperationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helicopterLaserOperationBtnActionPerformed(evt);
            }
        });
        jPanel1.add(helicopterLaserOperationBtn);
        helicopterLaserOperationBtn.setBounds(380, 360, 200, 50);

        helicopterShootBtn.setBackground(new java.awt.Color(0, 102, 102));
        helicopterShootBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        helicopterShootBtn.setForeground(new java.awt.Color(255, 255, 255));
        helicopterShootBtn.setText("Shoot");
        helicopterShootBtn.setEnabled(false);
        helicopterShootBtn.setMaximumSize(new java.awt.Dimension(180, 30));
        helicopterShootBtn.setMinimumSize(new java.awt.Dimension(180, 30));
        helicopterShootBtn.setPreferredSize(new java.awt.Dimension(180, 30));
        helicopterShootBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helicopterShootBtnActionPerformed(evt);
            }
        });
        jPanel1.add(helicopterShootBtn);
        helicopterShootBtn.setBounds(380, 200, 200, 50);

        helicopterMsgTextPane.setBackground(new java.awt.Color(0, 0, 0));
        helicopterMsgTextPane.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        helicopterMsgTextPane.setForeground(new java.awt.Color(255, 255, 255));
        helicopterMsgTextPane.setPreferredSize(new java.awt.Dimension(272, 109));
        jScrollPane1.setViewportView(helicopterMsgTextPane);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 200, 350, 180);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void helicopterSendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helicopterSendBtnActionPerformed
        String message = helicopterMsgTextField.getText().trim();

        if (message.isEmpty()) {
            mainController.appendStyledText(helicopterMsgTextPane, "Error : Please type your message!", Color.RED);
            return;
        }

        mainController.appendStyledText(helicopterMsgTextPane, "Me : " + message, Color.WHITE);
        mainController.receiveMessage(message, false, "Helicopter");
        helicopterMsgTextField.setText("");
    }//GEN-LAST:event_helicopterSendBtnActionPerformed

    private void helicopterShootBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helicopterShootBtnActionPerformed
        int helicopterAmmo = (Integer) helicopterAmmoCountSpinner.getValue();
        if (isFirstHelicopterShoot) {
            mainController.appendInfoText("Helicopter Starting Shoot!", Color.GREEN);
            isFirstHelicopterShoot = false;
        }

        if (helicopterAmmo > 0) {
            helicopterAmmo--;
            helicopterAmmoCountSpinner.setValue(helicopterAmmo);
            //mainController.appendInfoText("Helicopter fired! Remaining ammo : " + helicopterAmmo, Color.WHITE);

            reduceSoldiersRandomly();

            if (helicopterAmmo < 20) {
                mainController.appendInfoText("Helicopter : Critical ammo levels! Immediate resupply needed.", Color.ORANGE);
            }

        } else {
            mainController.appendInfoText("Helicopter : Out of ammo!", Color.RED);
        }
    }//GEN-LAST:event_helicopterShootBtnActionPerformed

    private void helicopterMissileOperationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helicopterMissileOperationBtnActionPerformed
        int helicopterAmmo = (Integer) helicopterAmmoCountSpinner.getValue();

        if (isFirstHelicopterMissileOperation) {
            mainController.appendInfoText("Helicopter : Initiating missile operation!", Color.GREEN);
            isFirstHelicopterMissileOperation = false;
        }

        if (helicopterAmmo >= 10) {
            helicopterAmmo -= 10;
            helicopterAmmoCountSpinner.setValue(helicopterAmmo);
            //mainController.appendInfoText("Helicopter launched a missile! Remaining ammo : " + helicopterAmmo, Color.WHITE);

            reduceSoldiersRandomly();

            if (helicopterAmmo < 20) {
                mainController.appendInfoText("Helicopter : Critical ammo levels! Immediate resupply needed.", Color.ORANGE);
            }
        } else {
            mainController.appendInfoText("Helicopter : Out of ammo! Cannot perform missile operation.", Color.RED);
        }

    }//GEN-LAST:event_helicopterMissileOperationBtnActionPerformed

    private void helicopterSoldierCountSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_helicopterSoldierCountSpinnerStateChanged
        int currentSoldierCount = (Integer) helicopterSoldierCountSpinner.getValue();
        int soldierDifference = currentSoldierCount - soldierCount;
        soldierCount = currentSoldierCount;
        mainController.updateTotalCounts(soldierDifference, 0);
    }//GEN-LAST:event_helicopterSoldierCountSpinnerStateChanged

    private void helicopterAmmoCountSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_helicopterAmmoCountSpinnerStateChanged
        int currentAmmoCount = (Integer) helicopterAmmoCountSpinner.getValue();
        int ammoDifference = currentAmmoCount - ammoCount;
        ammoCount = currentAmmoCount;
        mainController.updateTotalCounts(0, ammoDifference);
        checkAmmoCount();
    }//GEN-LAST:event_helicopterAmmoCountSpinnerStateChanged

    private void helicopterLaserOperationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helicopterLaserOperationBtnActionPerformed
        int helicopterAmmo = (Integer) helicopterAmmoCountSpinner.getValue();

        if (isFirstHelicopterLaserOperation) {
            mainController.appendInfoText("Helicopter : Initiating laser operation!", Color.GREEN);
            isFirstHelicopterLaserOperation = false;
        }

        if (helicopterAmmo >= 5) {
            helicopterAmmo -= 5;
            helicopterAmmoCountSpinner.setValue(helicopterAmmo);
            //mainController.appendInfoText("Helicopter fired a laser! Remaining ammo : " + helicopterAmmo, Color.WHITE);

            reduceSoldiersRandomly();

            if (helicopterAmmo < 20) {
                mainController.appendInfoText("Helicopter : Critical ammo levels! Immediate resupply needed.", Color.ORANGE);
            }
        } else {
            mainController.appendInfoText("Helicopter : Out of ammo! Cannot perform laser operation.", Color.RED);
        }
    }//GEN-LAST:event_helicopterLaserOperationBtnActionPerformed

    private void helicopterSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_helicopterSliderStateChanged
        int helicopterFuel = helicopterSlider.getValue();
        mainController.updateFuel("Helicopter", helicopterFuel);
    }//GEN-LAST:event_helicopterSliderStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel helicoptArareaLbl;
    private javax.swing.JLabel helicopterAmmoCountLbl;
    private javax.swing.JSpinner helicopterAmmoCountSpinner;
    private javax.swing.JButton helicopterLaserOperationBtn;
    private javax.swing.JLabel helicopterLbl;
    private javax.swing.JButton helicopterMissileOperationBtn;
    private javax.swing.JTextField helicopterMsgTextField;
    private javax.swing.JTextPane helicopterMsgTextPane;
    private javax.swing.JCheckBox helicopterPositionCheckBox;
    private javax.swing.JButton helicopterSendBtn;
    private javax.swing.JButton helicopterShootBtn;
    private javax.swing.JSlider helicopterSlider;
    private javax.swing.JLabel helicopterSoldierCountLbl;
    private javax.swing.JSpinner helicopterSoldierCountSpinner;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void notifyMainControllerInitialCounts() {
        mainController.updateTotalCounts(soldierCount, ammoCount);
    }

    private void checkAmmoCount() {
        int helicopterAmmo = (Integer) helicopterAmmoCountSpinner.getValue();
        if (helicopterAmmo < 10) {
            mainController.appendInfoText("Helicopter : Need help! Ammo count getting low (" + helicopterAmmo + ")", Color.ORANGE);
        }
    }

    private void reduceSoldiersRandomly() {
        int currentSoldierCount = (Integer) helicopterSoldierCountSpinner.getValue();
        int soldiersToReduce = (int) (Math.random() * 5) + 1;

        currentSoldierCount -= soldiersToReduce;
        if (currentSoldierCount < 0) {
            currentSoldierCount = 0;
        }
        helicopterSoldierCountSpinner.setValue(currentSoldierCount);

        if (currentSoldierCount > 0 && currentSoldierCount < 10) {
            mainController.appendInfoText("Helicopter: Soldier count getting low! Only " + currentSoldierCount + " left!", Color.RED);
        } else if (currentSoldierCount == 0) {
            mainController.appendInfoText("Helicopter : Out of soldiers! Helicopter shutting down operations.", Color.RED);
            dispose();
        }
    }

    @Override
    public void updateAreaClear(boolean status) {
        helicoptArareaLbl.setText(status ? "Area Cleared" : "Area Not Cleared");
    }

    @Override
    public void btnEnable(int value) {
        boolean select = helicopterPositionCheckBox.isSelected();

        if (select) {
            if (value > Strength.LOW.value) {
                helicopterShootBtn.setEnabled(true);
            } else {
                helicopterShootBtn.setEnabled(false);
            }
            if (value > Strength.MEDIUM.value) {
                helicopterMissileOperationBtn.setEnabled(true);
            } else {
                helicopterMissileOperationBtn.setEnabled(false);
            }
            if (value > Strength.HIGH.value) {
                helicopterLaserOperationBtn.setEnabled(true);
            } else {
                helicopterLaserOperationBtn.setEnabled(false);
            }
        } else {
            helicopterShootBtn.setEnabled(false);
            helicopterMissileOperationBtn.setEnabled(false);
            helicopterLaserOperationBtn.setEnabled(false);
        }
    }

    @Override
    public void receiveMessage(String message, boolean isPrivate, String senderOrTarget) {
        if (!isPrivate || senderOrTarget.equals("Helicopter") || senderOrTarget.equals("All")) {
            mainController.appendStyledText(helicopterMsgTextPane, "[From MainController] : " + message, Color.YELLOW);
        }
    }
}
