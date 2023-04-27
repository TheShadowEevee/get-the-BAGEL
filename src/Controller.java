/**
 *  Copyright (c) 2023 Michael Malloy, Enter-Name
 *  CNIT 25501 Final Project - GET THE bagel
 */

// TODO: Replace Boilerplate
// TODO: Disable spell-checking my name :/ (-MM)

public class Controller extends javax.swing.JFrame {

    static Player Ted = null;
    
    /**
     * Creates new form Controller
     */
    public Controller() {
        initComponents();
        setupGame();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSplitPane1 = new javax.swing.JSplitPane();
        leftTextPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        adventurePane = new javax.swing.JTextPane();
        rightButtonPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        statisticsPane = new javax.swing.JTextPane();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        InputSubmitButton = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        menuBar = new javax.swing.JMenuBar();
        menuFileDropdown = new javax.swing.JMenu();
        quitMenuButton = new javax.swing.JMenuItem();
        menuEditDropdown = new javax.swing.JMenu();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("[Bagel] - Development Build");
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);

        leftTextPanel.setMinimumSize(new java.awt.Dimension(200, 277));
        leftTextPanel.setPreferredSize(new java.awt.Dimension(200, 277));

        adventurePane.setEditable(false);
        adventurePane.setAutoscrolls(false);
        adventurePane.setFocusable(false);
        adventurePane.setMinimumSize(new java.awt.Dimension(1000, 1000));
        adventurePane.setName(""); // NOI18N
        adventurePane.setPreferredSize(new java.awt.Dimension(125, 150));
        adventurePane.setRequestFocusEnabled(false);
        jScrollPane2.setViewportView(adventurePane);

        javax.swing.GroupLayout leftTextPanelLayout = new javax.swing.GroupLayout(leftTextPanel);
        leftTextPanel.setLayout(leftTextPanelLayout);
        leftTextPanelLayout.setHorizontalGroup(
            leftTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftTextPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        leftTextPanelLayout.setVerticalGroup(
            leftTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftTextPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(leftTextPanel);

        rightButtonPanel.setMinimumSize(new java.awt.Dimension(300, 277));
        rightButtonPanel.setOpaque(false);

        statisticsPane.setEditable(false);
        statisticsPane.setAutoscrolls(false);
        statisticsPane.setFocusable(false);
        statisticsPane.setMinimumSize(new java.awt.Dimension(125, 150));
        statisticsPane.setName(""); // NOI18N
        statisticsPane.setPreferredSize(new java.awt.Dimension(125, 150));
        statisticsPane.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(statisticsPane);

        jTextField1.setText("Input");
        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setToolTipText("");

        InputSubmitButton.setText("Submit");
        InputSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputSubmitButtonActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setText("DEVELOPMENT BUILD - Gameplay not final");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rightButtonPanelLayout = new javax.swing.GroupLayout(rightButtonPanel);
        rightButtonPanel.setLayout(rightButtonPanelLayout);
        rightButtonPanelLayout.setHorizontalGroup(
            rightButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rightButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(rightButtonPanelLayout.createSequentialGroup()
                        .addGroup(rightButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(rightButtonPanelLayout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(InputSubmitButton))
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 23, Short.MAX_VALUE)))
                .addContainerGap())
        );
        rightButtonPanelLayout.setVerticalGroup(
            rightButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputSubmitButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSplitPane1.setRightComponent(rightButtonPanel);

        menuFileDropdown.setText("File");

        quitMenuButton.setText("Quit");
        quitMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitMenuButtonActionPerformed(evt);
            }
        });
        menuFileDropdown.add(quitMenuButton);

        menuBar.add(menuFileDropdown);

        menuEditDropdown.setText("Edit");
        menuBar.add(menuEditDropdown);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Menu Option Handling
    private void quitMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitMenuButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitMenuButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void InputSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputSubmitButtonActionPerformed
        processPlayerCommand();
    }//GEN-LAST:event_InputSubmitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Controller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Controller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Controller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Controller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Controller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InputSubmitButton;
    private javax.swing.JTextPane adventurePane;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel leftTextPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuEditDropdown;
    private javax.swing.JMenu menuFileDropdown;
    private javax.swing.JMenuItem quitMenuButton;
    private javax.swing.JPanel rightButtonPanel;
    private javax.swing.JTextPane statisticsPane;
    // End of variables declaration//GEN-END:variables
    
    String adventureContextHead = null;
    
    // Setup the game and window
    private void setupGame() {
        // Setup new Player
        this.Ted = new Player("Ted Bagelson");
        //PuzzleScreen puzzle = new PuzzleScreen();
        
        adventureContextHead = 
                "You have woken up in a strange house. Looking around, your surroundings seem familiar yet foreign.\n" +
                "Standing up, your stomach growls. It's time for breakfast. There must be a bagel somewhere in this house you can eat.";
        
        updateStatistics();
        updateAdventure();
        //puzzle.puzzleScreen();
    }
    
    // Update text boxes
    private void updateStatistics() {
        statisticsPane.setText(
                "Name: " + Ted.name +
                "\nHP: " + Ted.HP +
                "\nFloor " + Ted.location[0] + ", Room " + Ted.location[1]
        );
    }
    
    // TODO: Implement actual gameplay
    private void updateAdventure() {
        
        // Player player = new Player(); - Replace this with world class
        
        adventurePane.setText(
                this.adventureContextHead + "\n\n" +
                "There is a door to the East, a staircase going down to the South, and a staircase going up to the North.\n\n" +
                "What would you like to do?"
        );
    }
    
    private void processPlayerCommand() {
        // This function here if the plan is to commit to text entry
        
        // Move
        // InitPuzzle / Check?
        // Use (Stairs)
        // Open (Door)
    }
    
    // These functions are mostly used if the plan is to commit to button entry
    /*
    // Update player name
    private void updatePlayerName() {
        String newName = playerNameTextField.getText();
        Ted.changeName(newName);
        
        updateStatistics();
    }
    
    // Manage player health
    private void healPlayer(int heal) {
        Ted.increaseHP(heal);
        
        updateStatistics();
    }
    
    private void damagePlayer(int damage) {
        Ted.decreaseHP(damage);
        
        updateStatistics();
    }
    
    // Update player location
    private void movePlayer(String direction) {

        boolean success = false;
        
        // TODO: If/elif/elif/elif isn't great here.
        if (direction == "LevelUp") {
            success = Ted.levelUp();
        } else if (direction == "RoomUp") {
            success = Ted.roomUp();
        } else if (direction == "RoomDown") {
            success = Ted.roomDown();
        }
        
        // TODO: Make something happen visually on fail, this means the player is trying to move OOB
        //System.out.println(success);
        
        updateStatistics();
    }

    */
}
