/*
CS 6329.001 Spring 2016

Grant Ledford 
Hendra Suteja
Joseph Fox 
Katie Patterson 

Controller test GUI
*/
package controller;

public class ControllerJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ControllerJFrame
     */
    public ControllerJFrame() {
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

        mainJPanel = new javax.swing.JPanel();
        controlPanelJPanel = new javax.swing.JPanel();
        displayTextArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonEnter = new javax.swing.JButton();
        jButtonYes = new javax.swing.JButton();
        jButtonNo = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        cardJPanel = new javax.swing.JPanel();
        jButtonDebit = new javax.swing.JButton();
        jButtonCredit = new javax.swing.JButton();
        jButtonCardButton = new javax.swing.JButton();
        jPanelTypes = new javax.swing.JPanel();
        jTextFieldPlus = new javax.swing.JTextField();
        jTextFieldRegular = new javax.swing.JTextField();
        jTextFieldPremium = new javax.swing.JTextField();
        jButtonRegular = new javax.swing.JButton();
        jButtonPlus = new javax.swing.JButton();
        jButtonPremium = new javax.swing.JButton();
        jPanelTotal = new javax.swing.JPanel();
        jTextFieldGallons = new javax.swing.JTextField();
        jLabelTotal = new javax.swing.JLabel();
        jLabelGallons = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();
        jToggleButtonRemovePump = new javax.swing.JToggleButton();
        jToggleButtonStartPump = new javax.swing.JToggleButton();
        jLabelPump = new javax.swing.JLabel();
        jLabelHandle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gas Pump Control");

        controlPanelJPanel.setBackground(new java.awt.Color(0, 0, 0));
        controlPanelJPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        displayTextArea.setEditable(false);
        displayTextArea.setBackground(new java.awt.Color(204, 204, 204));
        displayTextArea.setColumns(20);
        displayTextArea.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        displayTextArea.setRows(5);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("1");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("2");

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("3");

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("4");

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setText("5");

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setText("6");

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setText("7");

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setText("8");

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setText("9");

        jButton0.setBackground(new java.awt.Color(255, 255, 255));
        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButtonClear.setBackground(new java.awt.Color(255, 255, 0));
        jButtonClear.setText("Clear");

        jButtonEnter.setBackground(new java.awt.Color(51, 255, 51));
        jButtonEnter.setText("Enter");
        jButtonEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnterActionPerformed(evt);
            }
        });

        jButtonYes.setBackground(new java.awt.Color(51, 255, 51));
        jButtonYes.setText("Yes");

        jButtonNo.setBackground(new java.awt.Color(204, 0, 0));
        jButtonNo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNo.setText("No");

        jButtonCancel.setBackground(new java.awt.Color(255, 255, 0));
        jButtonCancel.setText("Cancel");

        javax.swing.GroupLayout controlPanelJPanelLayout = new javax.swing.GroupLayout(controlPanelJPanel);
        controlPanelJPanel.setLayout(controlPanelJPanelLayout);
        controlPanelJPanelLayout.setHorizontalGroup(
            controlPanelJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelJPanelLayout.createSequentialGroup()
                .addGroup(controlPanelJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelJPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(controlPanelJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonClear, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(controlPanelJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(controlPanelJPanelLayout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(controlPanelJPanelLayout.createSequentialGroup()
                                .addGroup(controlPanelJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(controlPanelJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jButton0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(controlPanelJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonEnter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(controlPanelJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonYes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelJPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(displayTextArea)))
                .addContainerGap())
        );
        controlPanelJPanelLayout.setVerticalGroup(
            controlPanelJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(displayTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlPanelJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButtonYes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlPanelJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButtonNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlPanelJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButtonCancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlPanelJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClear)
                    .addComponent(jButtonEnter)
                    .addComponent(jButton0))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        cardJPanel.setBackground(new java.awt.Color(0, 0, 0));

        jButtonDebit.setBackground(new java.awt.Color(255, 255, 255));
        jButtonDebit.setText("Debit");

        jButtonCredit.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCredit.setText("Credit");

        jButtonCardButton.setBackground(new java.awt.Color(204, 255, 255));
        jButtonCardButton.setText("<html><div align=\"center\">Press to <br />\nSimulate<br />\nCard Swipe</div></html>");

        javax.swing.GroupLayout cardJPanelLayout = new javax.swing.GroupLayout(cardJPanel);
        cardJPanel.setLayout(cardJPanelLayout);
        cardJPanelLayout.setHorizontalGroup(
            cardJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonDebit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCredit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(cardJPanelLayout.createSequentialGroup()
                        .addComponent(jButtonCardButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        cardJPanelLayout.setVerticalGroup(
            cardJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonDebit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCardButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelTypes.setBackground(new java.awt.Color(0, 0, 0));

        jTextFieldPlus.setEditable(false);
        jTextFieldPlus.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldPlus.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jTextFieldPlus.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPlus.setText("$0.00");

        jTextFieldRegular.setEditable(false);
        jTextFieldRegular.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldRegular.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jTextFieldRegular.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldRegular.setText("$0.00");
        jTextFieldRegular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRegularActionPerformed(evt);
            }
        });

        jTextFieldPremium.setEditable(false);
        jTextFieldPremium.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldPremium.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jTextFieldPremium.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPremium.setText("$0.00");

        jButtonRegular.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRegular.setText("Regular");

        jButtonPlus.setBackground(new java.awt.Color(255, 255, 255));
        jButtonPlus.setText("Plus");

        jButtonPremium.setBackground(new java.awt.Color(255, 255, 255));
        jButtonPremium.setText("Premium");

        javax.swing.GroupLayout jPanelTypesLayout = new javax.swing.GroupLayout(jPanelTypes);
        jPanelTypes.setLayout(jPanelTypesLayout);
        jPanelTypesLayout.setHorizontalGroup(
            jPanelTypesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTypesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelTypesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonRegular, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(jTextFieldRegular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTypesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldPlus)
                    .addComponent(jButtonPlus, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTypesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldPremium)
                    .addComponent(jButtonPremium, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTypesLayout.setVerticalGroup(
            jPanelTypesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTypesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTypesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRegular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPremium, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTypesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonPlus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonPremium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelTotal.setBackground(new java.awt.Color(0, 0, 0));

        jTextFieldGallons.setEditable(false);
        jTextFieldGallons.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jTextFieldGallons.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldGallons.setText("0.00");

        jLabelTotal.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTotal.setText("Total");
        jLabelTotal.setToolTipText("");

        jLabelGallons.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGallons.setText("Gallons");
        jLabelGallons.setToolTipText("");

        jTextFieldTotal.setEditable(false);
        jTextFieldTotal.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jTextFieldTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldTotal.setText("$0.00");

        javax.swing.GroupLayout jPanelTotalLayout = new javax.swing.GroupLayout(jPanelTotal);
        jPanelTotal.setLayout(jPanelTotalLayout);
        jPanelTotalLayout.setHorizontalGroup(
            jPanelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelGallons, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldGallons, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanelTotalLayout.setVerticalGroup(
            jPanelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldGallons, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelGallons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jToggleButtonRemovePump.setBackground(new java.awt.Color(204, 255, 255));
        jToggleButtonRemovePump.setText("Remove/Replace Handle");

        jToggleButtonStartPump.setBackground(new java.awt.Color(204, 204, 255));
        jToggleButtonStartPump.setText("Start/Stop Pump");
        jToggleButtonStartPump.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonStartPumpActionPerformed(evt);
            }
        });

        jLabelPump.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPump.setText("Pump Off");

        jLabelHandle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHandle.setText("Handle On");

        javax.swing.GroupLayout mainJPanelLayout = new javax.swing.GroupLayout(mainJPanel);
        mainJPanel.setLayout(mainJPanelLayout);
        mainJPanelLayout.setHorizontalGroup(
            mainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelTypes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainJPanelLayout.createSequentialGroup()
                        .addComponent(controlPanelJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cardJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainJPanelLayout.createSequentialGroup()
                        .addGroup(mainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jToggleButtonRemovePump, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(jToggleButtonStartPump, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPump, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelHandle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        mainJPanelLayout.setVerticalGroup(
            mainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainJPanelLayout.createSequentialGroup()
                        .addComponent(jPanelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelHandle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButtonRemovePump, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(controlPanelJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cardJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelTypes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButtonStartPump, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelPump, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEnterActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jTextFieldRegularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRegularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRegularActionPerformed

    private void jToggleButtonStartPumpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonStartPumpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonStartPumpActionPerformed

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
            java.util.logging.Logger.getLogger(ControllerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControllerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControllerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControllerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControllerJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cardJPanel;
    private javax.swing.JPanel controlPanelJPanel;
    private javax.swing.JTextArea displayTextArea;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCardButton;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonCredit;
    private javax.swing.JButton jButtonDebit;
    private javax.swing.JButton jButtonEnter;
    private javax.swing.JButton jButtonNo;
    private javax.swing.JButton jButtonPlus;
    private javax.swing.JButton jButtonPremium;
    private javax.swing.JButton jButtonRegular;
    private javax.swing.JButton jButtonYes;
    private javax.swing.JLabel jLabelGallons;
    private javax.swing.JLabel jLabelHandle;
    private javax.swing.JLabel jLabelPump;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JPanel jPanelTotal;
    private javax.swing.JPanel jPanelTypes;
    private javax.swing.JTextField jTextFieldGallons;
    private javax.swing.JTextField jTextFieldPlus;
    private javax.swing.JTextField jTextFieldPremium;
    private javax.swing.JTextField jTextFieldRegular;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JToggleButton jToggleButtonRemovePump;
    private javax.swing.JToggleButton jToggleButtonStartPump;
    private javax.swing.JPanel mainJPanel;
    // End of variables declaration//GEN-END:variables
}
