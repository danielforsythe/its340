package pkgfinal;
import java.util.*;

//ITS 340 Final Korban, Tim, Some guy
public class jFinal extends javax.swing.JFrame {
    String Question = "";
    String Answer = "";
    int CurrentGeneralNodeID;
    int CurrentAllergyNodeID;
    int CurrentFamilyNodeID;
    int FamilyNodeID = -1;
    int AllergiesNodeID = -1;
    //Setup the tree making it global
    //T1
    treeGeneral<String> Node1;
    treeFamily<String> rootFamily;
    treeAllergies<String> rootAllergies;
    public jFinal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneResult = new javax.swing.JTabbedPane();
        jPanelGeneral = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jQuestionPaneGeneral = new javax.swing.JTextArea();
        jButtonStartGeneral = new javax.swing.JButton();
        jTextFieldGeneral = new javax.swing.JTextField();
        jButtonGeneralEnter = new javax.swing.JButton();
        jButtonNext = new javax.swing.JButton();
        txtTestNext = new javax.swing.JTextField();
        txtTestEnter = new javax.swing.JTextField();
        txtTestStart = new javax.swing.JTextField();
        jPanelFamily = new javax.swing.JPanel();
        jButtonStartFamily = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jQuestionPaneFamily = new javax.swing.JTextArea();
        jTextFieldFamily = new javax.swing.JTextField();
        jButtonFamilyEnter = new javax.swing.JButton();
        familyNextButton = new javax.swing.JButton();
        jPanelAllergies = new javax.swing.JPanel();
        jButtonStartAllergies = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jQuestionPaneAllergies = new javax.swing.JTextArea();
        jTextFieldAllergies = new javax.swing.JTextField();
        jButtonAllergiesEnter = new javax.swing.JButton();
        allergiesNextButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaResult = new javax.swing.JTextArea();
        jTextFieldSearch = new javax.swing.JTextField();
        jButtonSearchEnter = new javax.swing.JButton();
        jButtonStartSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jQuestionPaneGeneral.setEditable(false);
        jQuestionPaneGeneral.setBackground(new java.awt.Color(204, 204, 204));
        jQuestionPaneGeneral.setColumns(20);
        jQuestionPaneGeneral.setLineWrap(true);
        jQuestionPaneGeneral.setRows(5);
        jQuestionPaneGeneral.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jQuestionPaneGeneral);

        jButtonStartGeneral.setText("Start");
        jButtonStartGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStartGeneralActionPerformed(evt);
            }
        });

        jButtonGeneralEnter.setText("Enter");
        jButtonGeneralEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGeneralEnterActionPerformed(evt);
            }
        });

        jButtonNext.setText("Next");
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });

        txtTestNext.setText("Next ID");

        txtTestEnter.setText("Enter ID");
        txtTestEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTestEnterActionPerformed(evt);
            }
        });

        txtTestStart.setText("Start ID");

        javax.swing.GroupLayout jPanelGeneralLayout = new javax.swing.GroupLayout(jPanelGeneral);
        jPanelGeneral.setLayout(jPanelGeneralLayout);
        jPanelGeneralLayout.setHorizontalGroup(
            jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGeneralLayout.createSequentialGroup()
                        .addComponent(jTextFieldGeneral)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonGeneralEnter))
                    .addGroup(jPanelGeneralLayout.createSequentialGroup()
                        .addGroup(jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelGeneralLayout.createSequentialGroup()
                                .addComponent(jButtonStartGeneral)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonNext))
                            .addGroup(jPanelGeneralLayout.createSequentialGroup()
                                .addComponent(txtTestNext, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txtTestEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTestStart, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelGeneralLayout.setVerticalGroup(
            jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonStartGeneral)
                    .addComponent(jButtonNext))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTestNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTestEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTestStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGeneralEnter)
                    .addComponent(jTextFieldGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPaneResult.addTab("General Medical", jPanelGeneral);

        jButtonStartFamily.setText("Start");
        jButtonStartFamily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStartFamilyActionPerformed(evt);
            }
        });

        jQuestionPaneFamily.setEditable(false);
        jQuestionPaneFamily.setBackground(new java.awt.Color(204, 204, 204));
        jQuestionPaneFamily.setColumns(20);
        jQuestionPaneFamily.setLineWrap(true);
        jQuestionPaneFamily.setRows(5);
        jQuestionPaneFamily.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jQuestionPaneFamily);

        jButtonFamilyEnter.setText("Enter");
        jButtonFamilyEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFamilyEnterActionPerformed(evt);
            }
        });

        familyNextButton.setText("Next");
        familyNextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                familyNextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFamilyLayout = new javax.swing.GroupLayout(jPanelFamily);
        jPanelFamily.setLayout(jPanelFamilyLayout);
        jPanelFamilyLayout.setHorizontalGroup(
            jPanelFamilyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFamilyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFamilyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFamilyLayout.createSequentialGroup()
                        .addComponent(jButtonStartFamily)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(familyNextButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addGroup(jPanelFamilyLayout.createSequentialGroup()
                        .addComponent(jTextFieldFamily)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFamilyEnter)))
                .addContainerGap())
        );
        jPanelFamilyLayout.setVerticalGroup(
            jPanelFamilyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFamilyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFamilyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonStartFamily)
                    .addComponent(familyNextButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFamilyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFamilyEnter)
                    .addComponent(jTextFieldFamily, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        jTabbedPaneResult.addTab("Family History", jPanelFamily);

        jButtonStartAllergies.setText("Start");
        jButtonStartAllergies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStartAllergiesActionPerformed(evt);
            }
        });

        jQuestionPaneAllergies.setEditable(false);
        jQuestionPaneAllergies.setBackground(new java.awt.Color(204, 204, 204));
        jQuestionPaneAllergies.setColumns(20);
        jQuestionPaneAllergies.setLineWrap(true);
        jQuestionPaneAllergies.setRows(5);
        jQuestionPaneAllergies.setWrapStyleWord(true);
        jScrollPane3.setViewportView(jQuestionPaneAllergies);

        jButtonAllergiesEnter.setText("Enter");
        jButtonAllergiesEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAllergiesEnterActionPerformed(evt);
            }
        });

        allergiesNextButton.setText("Next");
        allergiesNextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allergiesNextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAllergiesLayout = new javax.swing.GroupLayout(jPanelAllergies);
        jPanelAllergies.setLayout(jPanelAllergiesLayout);
        jPanelAllergiesLayout.setHorizontalGroup(
            jPanelAllergiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAllergiesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAllergiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAllergiesLayout.createSequentialGroup()
                        .addComponent(jButtonStartAllergies)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(allergiesNextButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addGroup(jPanelAllergiesLayout.createSequentialGroup()
                        .addComponent(jTextFieldAllergies)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAllergiesEnter)))
                .addContainerGap())
        );
        jPanelAllergiesLayout.setVerticalGroup(
            jPanelAllergiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAllergiesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAllergiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonStartAllergies)
                    .addComponent(allergiesNextButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAllergiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAllergiesEnter)
                    .addComponent(jTextFieldAllergies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107))
        );

        jTabbedPaneResult.addTab("Allergies", jPanelAllergies);

        jTextAreaResult.setEditable(false);
        jTextAreaResult.setBackground(new java.awt.Color(204, 204, 204));
        jTextAreaResult.setColumns(20);
        jTextAreaResult.setLineWrap(true);
        jTextAreaResult.setRows(5);
        jTextAreaResult.setWrapStyleWord(true);
        jScrollPane4.setViewportView(jTextAreaResult);

        jButtonSearchEnter.setText("Enter");
        jButtonSearchEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchEnterActionPerformed(evt);
            }
        });

        jButtonStartSearch.setText("Start");
        jButtonStartSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStartSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonStartSearch)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSearchEnter)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonStartSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSearchEnter)
                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPaneResult.addTab("Search", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneResult)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneResult, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButtonStartGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStartGeneralActionPerformed
        Node1 = new treeGeneral<>("Root");
        Node1.setNodeID(1);
        Node1.setQuestion("I would like to ask you about your general medical history, is that OK (Y/N)?");
        Node1.setYes(2);
        Node1.setNo(3);
        //T2
        treeGeneral<String> Node2 = new treeGeneral<>("Y");
        Node2.setNodeID(2);
        Node2.setQuestion("Do you know your blood type: (Y/N)?");
        Node2.setYes(4);
        Node2.setNo(5);
        Node2.setQuit(3);
        treeGeneral<String> Node3 = new treeGeneral<>("N");
        Node3.setNodeID(3);
        Node3.setQuestion("We understand, thank you for your time.");
        Node1.addChild(Node2);
        Node1.addChild(Node3);
        //T3
        treeGeneral<String> Node4 = new treeGeneral<>("Node4");
        Node4.setNodeID(4);
        Node4.setQuestion("Is your blood type O, A, or B?");
        Node4.setVaries(6);
        Node4.setQuit(3);
        Node4.setOther(7);
        Node1.addChild(Node4);
        //T4
        treeGeneral<String> Node6 = new treeGeneral<>("Node6");
        Node6.setQuestion("Is yhour blod type 'RH+' or 'RH-'?");
        Node6.setNodeID(6);
        Node6.setVaries(5);
        Node6.setQuit(3);
        Node1.addChild(Node6);
        treeGeneral<String> Node7 = new treeGeneral<>("Node7");
        Node7.setQuestion("Since your answer doesn't match any of the blood types, we will go on to the next question, OK?: (Y/N)");
        Node7.setNodeID(7);
        Node7.setYes(5);
        Node7.setNo(3);
        Node7.setQuit(3);
        Node1.addChild(Node7);
        //T5
        treeGeneral<String> Node5 = new treeGeneral<>("Node5");
        Node5.setQuestion("What is your marital status? (Single/Married");
        Node5.setNodeID(5);
        Node5.setVaries(8);
        Node5.setQuit(3);
        Node1.addChild(Node5);
        //T6
        treeGeneral<String> Node8 = new treeGeneral<>("Node8");
        Node8.setQuestion("Do you use alcohol?: (Y/N)");
        Node8.setNodeID(8);
        Node8.setYes(9);
        Node8.setNo(12);
        Node8.setQuit(3);
        Node1.addChild(Node8);
        //T7
        treeGeneral<String> Node9 = new treeGeneral<>("Node9");
        Node9.setQuestion("What type of alcohol do you drink?");
        Node9.setNodeID(9);
        Node9.setVaries(12);
        Node9.setOther(10);
        Node9.setQuit(3);
        Node1.addChild(Node9);
        //T8
        treeGeneral<String> Node10 = new treeGeneral<>("Node10");
        Node10.setQuestion("How much do you drink per week?");
        Node10.setNodeID(10);
        Node10.setOther(11);
        Node10.setVaries(12);
        Node10.setQuit(3);
        Node1.addChild(Node10);
        //T9
        treeGeneral<String> Node11 = new treeGeneral<>("Node11");
        Node11.setQuestion("How long have you been drinking?");
        Node11.setNodeID(11);
        Node11.setOther(12);
        Node11.setQuit(3);
        Node1.addChild(Node11);
        //T10
        treeGeneral<String> Node12 = new treeGeneral<>("Node12");
        Node12.setQuestion("Do you use tobacco?: (Y/N)");
        Node12.setNodeID(12);
        Node12.setYes(13);
        Node12.setNo(16);
        Node12.setQuit(3);
        Node1.addChild(Node12);
        //T11
        treeGeneral<String> Node13 = new treeGeneral<>("Node13");
        Node13.setQuestion("What type of tobacco do you use?  Cigarettes, cigars, or chewing tobacco?");
        Node13.setNodeID(13);
        Node13.setOther(16);
        Node13.setQuit(3);
        Node13.setVaries(14);
        Node1.addChild(Node13);
        //T12
        treeGeneral<String> Node14 = new treeGeneral<>("Node14");
        Node14.setQuestion("How much do you use tobacco per week?");
        Node14.setNodeID(14);
        Node14.setOther(15);
        Node1.addChild(Node14);
        //T13
        treeGeneral<String> Node15 = new treeGeneral<>("Node15");
        Node15.setQuestion("How long have you been using tobacco?");
        Node15.setNodeID(15);
        Node15.setOther(16);
        Node15.setQuit(3);
        Node1.addChild(Node15);
        //T14
        treeGeneral<String> Node16 = new treeGeneral<>("Node16");
        Node16.setQuestion("Do you use any drugs? (Y/N)");
        Node16.setNodeID(16);
        Node16.setQuit(3);
        Node16.setYes(17);
        Node16.setNo(20);
        Node16.setOther(20);
        Node1.addChild(Node16);
        //T15
        treeGeneral<String> Node17 = new treeGeneral<>("Node17");
        Node17.setQuestion("What type of drug or drugs are you using?");
        Node17.setNodeID(17);
        Node17.setQuit(3);
        Node17.setYes(18);
        Node17.setOther(18);
        Node1.addChild(Node17);
        //T16
        treeGeneral<String> Node18 = new treeGeneral<>("Node18");
        Node18.setQuestion("How much of the drug or drugs do you take per week?");
        Node18.setNodeID(18);
        Node18.setQuit(3);
        Node18.setOther(19);
        Node1.addChild(Node18);
        //T17
        treeGeneral<String> Node19 = new treeGeneral<>("Node19");
        Node19.setQuestion("How long have you been using the drug or drugs?");
        Node19.setNodeID(19);
        Node19.setQuit(3);
        Node19.setOther(20);
        Node1.addChild(Node19);

        //T18 Possible "Thank you" message
        treeGeneral<String> Node20 = new treeGeneral<>("Node20");
        Node20.setNodeID(20);
        Node20.setQuestion("Thank you.  This completes the General Medical Questions.  Please go to the Family History tab.");
        Node1.addChild(Node20);
        
        Question = Node1.getQuestion();
        jQuestionPaneGeneral.setText(Question);
        CurrentGeneralNodeID = Node1.getNodeID();
        String temp = Integer.toString(CurrentGeneralNodeID);
        txtTestStart.setText(temp);
        
        
        // Add a list of children.
        //root.addChildren(Arrays.asList(
            //        new treeGeneral<>("Child4"),
            //        new treeGeneral<>("Child5"),
            //       new treeGeneral<>("Child6")
            //));
    }//GEN-LAST:event_jButtonStartGeneralActionPerformed
    private void jButtonStartFamilyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStartFamilyActionPerformed
        //Setup the tree
       
        rootFamily = new treeFamily<>("Root");
       
        treeFamily<String> Node2 = new treeFamily<>("Node2");
        rootFamily.addChild(Node2);
        treeFamily<String> Node3 = new treeFamily<>("Node3");
        rootFamily.addChild(Node3);
        
        treeFamily<String> Node4 = new treeFamily<>("Node4");
        rootFamily.addChild(Node4);
        
       
        treeFamily<String> Node5 = new treeFamily<>("Node5");
        rootFamily.addChild(Node5);
        treeFamily<String> Node6 = new treeFamily<>("Node6");
        rootFamily.addChild(Node6);
        

        //Set Questions
        rootFamily.setQuestion("Do any of your family members have a history of serious illness? If so, please enter which family member. If not, please enter 'N'.");
        Node2.setQuestion("Is this family member still living? (Y/N)");
        Node3.setQuestion("What major illness or disorder did they suffer from? Ex: cardiovascular, cancer, drug abuse, metabolic/lipid, etc.");
        Node4.setQuestion("What specific disorder did your family member suffer from relating to the area described previously? Ex: heart attack, breast cancer, etc.");
        Node5.setQuestion("Thank you for taking the time to fill out our survey. Please proceed to the allergy survey.");
        Node6.setQuestion("We understand. Thank you for your time.");

        //Set IDs
        rootFamily.setNodeID(1);
        Node2.setNodeID(2);
        Node3.setNodeID(3);
        Node4.setNodeID(4);
        Node5.setNodeID(5);
        Node6.setNodeID(6);
        
        Node2.setYes(3);
        Node2.setNo(3);
        Node2.setQuit(6);
        Node3.setOther(4);
        Node3.setQuit(6);
        Node4.setOther(5);
        Node4.setQuit(6);

        Question = rootFamily.getQuestion();
        jQuestionPaneFamily.setText(Question);
        
        CurrentFamilyNodeID = rootFamily.getNodeID();
        String temp = Integer.toString(CurrentFamilyNodeID);
        txtTestStart.setText(temp);
    }//GEN-LAST:event_jButtonStartFamilyActionPerformed
    private void jButtonStartAllergiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStartAllergiesActionPerformed
        //Setup the tree
        rootAllergies = new treeAllergies<>("Root");
        treeAllergies<String> Node2 = new treeAllergies<>("Node2");
        treeAllergies<String> Node3 = new treeAllergies<>("Node3");
        treeAllergies<String> Node4 = new treeAllergies<>("Node4");
        treeAllergies<String> Node5 = new treeAllergies<>("Node6");
        treeAllergies<String> Node6 = new treeAllergies<>("Node7");
        treeAllergies<String> Node7 = new treeAllergies<>("Node5");

        rootAllergies.addChild(Node2);
        rootAllergies.addChild(Node3);
        rootAllergies.addChild(Node4);
        rootAllergies.addChild(Node5);
        rootAllergies.addChild(Node6);
        rootAllergies.addChild(Node7);
        
        //Set Questions
        rootAllergies.setQuestion("Do you have any known allergies? (Y/N)");
        Node2.setQuestion("What allergen causes a reaction?");
        Node3.setQuestion("When did you become allergic to this allergen? If no exact date is known, a year is acceptable.");
        Node4.setQuestion("Please describe your allergic reaction to this allergen.");
        Node5.setQuestion("Do you have any more known allergies? (Y/N)");
        Node6.setQuestion("Thank you for taking the time to fill out our survey.");
        Node7.setQuestion("We understand thank you for your time.");

        //Set IDs
        rootAllergies.setNodeID(1);
        Node2.setNodeID(2);
        Node3.setNodeID(3);
        Node4.setNodeID(4);
        Node5.setNodeID(5);
        Node6.setNodeID(6);
        Node7.setNodeID(7);

        Node2.setOther(3);
        Node2.setQuit(7);
        Node3.setOther(4);
        Node3.setQuit(7);
        Node4.setOther(5);
        Node4.setQuit(7);
        Node5.setYes(2);
        Node5.setNo(6);
        
        Question = rootAllergies.getQuestion();
        jQuestionPaneAllergies.setText(Question);
        
        CurrentAllergyNodeID = rootFamily.getNodeID();
        String temp = Integer.toString(CurrentAllergyNodeID);
        txtTestStart.setText(temp);

    }//GEN-LAST:event_jButtonStartAllergiesActionPerformed
    private void jButtonStartSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStartSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonStartSearchActionPerformed
    private void jButtonGeneralEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGeneralEnterActionPerformed
        Answer = jTextFieldGeneral.getText();
        if (CurrentGeneralNodeID == 1 ) { //root if check
            switch (Answer) {
                case "Y":
                    CurrentGeneralNodeID = 2;  //Set new Current Node
                    break;
                case "N":
                    CurrentGeneralNodeID = 3;  //Set new Current Node
                    break;
            }
        }  //end root if
        else 
            for (treeGeneral node : Node1.getChildren()) {  //list all the nodes
                int searchNode = node.getNodeID();  //Temp compare variable for node id
                if (searchNode == CurrentGeneralNodeID) {  //compare strings to find the current node we are asking a question for
                    node.setAnswer(Answer);  //set that node's answer to text entered
//                    CurrentGeneralNodeID = node.getYes();
                    switch (Answer) {
                        case "Y":
                            CurrentGeneralNodeID = node.getYes();  //Set new Current Node
                            break;
                        case "N":
                            CurrentGeneralNodeID = node.getNo();  //Set new Current Node
                            break;
                        case "Quit":
                            CurrentGeneralNodeID = node.getQuit();
                            break;
                        case "O":
                        case "A":
                        case "B":
                        case "Married":
                        case "Single":
                        case "RH+":
                        case "RH-":
                            CurrentGeneralNodeID = node.getVaries();
                            break;                        
                        default:
                            CurrentGeneralNodeID = node.getOther();
                            break;
                    } // end switch
                break;
                }  // end individual node if
            }  // end list all nodes if
        String temp = Integer.toString(CurrentGeneralNodeID);
        txtTestEnter.setText(temp);
    }//GEN-LAST:event_jButtonGeneralEnterActionPerformed
    private void jButtonFamilyEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFamilyEnterActionPerformed
        Answer = jTextFieldFamily.getText();
        if (CurrentFamilyNodeID == 1 ) { //root if check
            switch (Answer) {
                case "Mother":
                case "Father":
                case "Brother":
                case "Sister":
                case "Grandmother":
                case "Grandfather":
                case "Uncle":
                case "Aunt":
                case "Other":
                    CurrentFamilyNodeID = 2;  //Set new Current Node
                    break;
                case "N":
                    CurrentFamilyNodeID = 5;  //Set new Current Node
                    break;
            }
        }  //end root if
        else 
            for (treeFamily node : rootFamily.getChildren()) {  //list all the nodes
                int searchNode = node.getNodeID();  //Temp compare variable for node id
                if (searchNode == CurrentFamilyNodeID) {  //compare strings to find the current node we are asking a question for
                    node.setAnswer(Answer);  //set that node's answer to text entered
//                    CurrentFamilyNodeID = node.getYes();
                    switch (Answer) {
                        case "Y":
                            CurrentFamilyNodeID = node.getYes();  //Set new Current Node
                            break;
                        case "N":
                            CurrentFamilyNodeID = node.getNo();  //Set new Current Node
                            break;
                        case "Quit":
                            CurrentFamilyNodeID = node.getQuit();
                            break;                       
                        default:
                            CurrentFamilyNodeID = node.getOther();
                            break;
                    } // end switch
                break;
                }  // end individual node if
            }  // end list all nodes if
        String temp = Integer.toString(CurrentFamilyNodeID);
        txtTestEnter.setText(temp);
    }//GEN-LAST:event_jButtonFamilyEnterActionPerformed
    private void jButtonAllergiesEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAllergiesEnterActionPerformed
        Answer = jTextFieldAllergies.getText();
        if (CurrentAllergyNodeID == 1 ) { //root if check
            switch (Answer) {
                case "Y":
                    CurrentAllergyNodeID = 2;  //Set new Current Node
                    break;
                case "N":
                    CurrentAllergyNodeID = 6;  //Set new Current Node
                    break;
            }
        }  //end root if
        else 
            for (treeAllergies node : rootAllergies.getChildren()) {  //list all the nodes
                int searchNode = node.getNodeID();  //Temp compare variable for node id
                if (searchNode == CurrentAllergyNodeID) {  //compare strings to find the current node we are asking a question for
                    node.setAnswer(Answer);  //set that node's answer to text entered
//                    CurrentAAllergyNodeID = node.getYes();
                    switch (Answer) {
                        case "Y":
                            CurrentAllergyNodeID = node.getYes();  //Set new Current Node
                            break;
                        case "N":
                            CurrentAllergyNodeID = node.getNo();  //Set new Current Node
                            break;
                        case "Quit":
                            CurrentAllergyNodeID = node.getQuit();
                            break;                       
                        default:
                            CurrentAllergyNodeID = node.getOther();
                            break;
                    } // end switch
                break;
                }  // end individual node if
            }  // end list all nodes if
        String temp = Integer.toString(CurrentAllergyNodeID);
        txtTestEnter.setText(temp);
    }//GEN-LAST:event_jButtonAllergiesEnterActionPerformed
    private void jButtonSearchEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchEnterActionPerformed
        // On click search DB code here
    }//GEN-LAST:event_jButtonSearchEnterActionPerformed

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        // TODO add your handling code here:
        
//        String temp = Integer.toString(CurrentGeneralNodeID);
//        txtTest.setText(temp);
        for (treeGeneral node : Node1.getChildren()) {  //list all the nodes
            int searchNode = node.getNodeID();  //put node id into comparable variable
            if (searchNode == CurrentGeneralNodeID) {  //compare values to find the current node we are asking a question for
                Question = node.getQuestion();  //Get the next question
                jQuestionPaneGeneral.setText(Question);
                String temp = Integer.toString(node.getNodeID());
                txtTestNext.setText(temp);
            }
        }  // end list all nodes
//        treeGeneral<String>  Node2 = new treeGeneral<>("Y");
//        Node2.setNodeID(2);
//        Node2.setQuestion("Do you know your blood type (Y/N)?");
//         treeGeneral<String> Node5 = new treeGeneral<>("Node5");
//        Node5.setQuestion("What is your marital status, Single or Married?");
//        Node5.setNodeID(5);
//        Node1.addChild(Node5);
//        String answer = jTextFieldGeneral.getText();
//        txtTest.setText(answer);
//        if (answer.contains("Y"))
//        {
//        Question = Node5.getQuestion();
//        jQuestionPaneGeneral.setText(Question);
//        CurrentGeneralNodeID = Node5.getNodeID();
//        jTextFieldGeneral.setText("test yes");
//        }
//        if (answer.contains("N"))
//        {
//        Question = Node5.getQuestion();
//        jQuestionPaneGeneral.setText(Question);
//        CurrentGeneralNodeID = Node5.getNodeID();
//        jTextFieldGeneral.setText("test no");
//        }
    }//GEN-LAST:event_jButtonNextActionPerformed

    private void txtTestEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTestEnterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTestEnterActionPerformed

    private void allergiesNextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allergiesNextButtonActionPerformed
        for (treeAllergies node : rootAllergies.getChildren()) {  //list all the nodes
            int searchNode = node.getNodeID();  //put node id into comparable variable
            if (searchNode == CurrentAllergyNodeID) {  //compare values to find the current node we are asking a question for
                Question = node.getQuestion();  //Get the next question
                jQuestionPaneAllergies.setText(Question);
                String temp = Integer.toString(node.getNodeID());
                txtTestNext.setText(temp);
            }
        }  // end list all nodes
    }//GEN-LAST:event_allergiesNextButtonActionPerformed

    private void familyNextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_familyNextButtonActionPerformed
        for (treeFamily node : rootFamily.getChildren()) {  //list all the nodes
            int searchNode = node.getNodeID();  //put node id into comparable variable
            if (searchNode == CurrentFamilyNodeID) {  //compare values to find the current node we are asking a question for
                Question = node.getQuestion();  //Get the next question
                jQuestionPaneFamily.setText(Question);
                String temp = Integer.toString(node.getNodeID());
                txtTestNext.setText(temp);
            }
        }  // end list all nodes
    }//GEN-LAST:event_familyNextButtonActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFinal().setVisible(true);
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton allergiesNextButton;
    private javax.swing.JButton familyNextButton;
    private javax.swing.JButton jButtonAllergiesEnter;
    private javax.swing.JButton jButtonFamilyEnter;
    private javax.swing.JButton jButtonGeneralEnter;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JButton jButtonSearchEnter;
    private javax.swing.JButton jButtonStartAllergies;
    private javax.swing.JButton jButtonStartFamily;
    private javax.swing.JButton jButtonStartGeneral;
    private javax.swing.JButton jButtonStartSearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAllergies;
    private javax.swing.JPanel jPanelFamily;
    private javax.swing.JPanel jPanelGeneral;
    private javax.swing.JTextArea jQuestionPaneAllergies;
    private javax.swing.JTextArea jQuestionPaneFamily;
    private javax.swing.JTextArea jQuestionPaneGeneral;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPaneResult;
    private javax.swing.JTextArea jTextAreaResult;
    private javax.swing.JTextField jTextFieldAllergies;
    private javax.swing.JTextField jTextFieldFamily;
    private javax.swing.JTextField jTextFieldGeneral;
    private javax.swing.JTextField jTextFieldSearch;
    private javax.swing.JTextField txtTestEnter;
    private javax.swing.JTextField txtTestNext;
    private javax.swing.JTextField txtTestStart;
    // End of variables declaration//GEN-END:variables
}