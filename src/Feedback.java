import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Feedback extends javax.swing.JFrame {

    public Feedback() {
        initComponents();
        addLabelListeners();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        settings = new javax.swing.JLabel();
        info = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        schedule = new javax.swing.JLabel();
        feedback = new javax.swing.JLabel();
        ticket = new javax.swing.JLabel();
        freight = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        form = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(26, 25, 25));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("  User name");

        jLabel31.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\p1.png")); // NOI18N
        jLabel31.setPreferredSize(new java.awt.Dimension(90, 70));

        settings.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\ss.png")); // NOI18N
        settings.setPreferredSize(new java.awt.Dimension(90, 70));
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsMouseExited(evt);
            }
        });

        info.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\ii.png")); // NOI18N
        info.setPreferredSize(new java.awt.Dimension(90, 70));
        info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                infoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                infoMouseExited(evt);
            }
        });

        contact.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\contact.png")); // NOI18N
        contact.setPreferredSize(new java.awt.Dimension(90, 70));
        contact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contactMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                contactMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contactMousePressed(evt);
            }
        });

        home.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\h1.png")); // NOI18N
        home.setPreferredSize(new java.awt.Dimension(90, 70));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeMouseExited(evt);
            }
        });

        schedule.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\align.png")); // NOI18N
        schedule.setPreferredSize(new java.awt.Dimension(90, 70));
        schedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                scheduleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                scheduleMouseExited(evt);
            }
        });

        feedback.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\feed1.png")); // NOI18N
        feedback.setPreferredSize(new java.awt.Dimension(90, 70));
        feedback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                feedbackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                feedbackMouseExited(evt);
            }
        });

        ticket.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\tick.png")); // NOI18N
        ticket.setPreferredSize(new java.awt.Dimension(90, 70));
        ticket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ticketMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ticketMouseExited(evt);
            }
        });

        freight.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\f1.png")); // NOI18N
        freight.setPreferredSize(new java.awt.Dimension(90, 70));
        freight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                freightMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                freightMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(schedule, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ticket, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(freight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(feedback, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(settings, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(schedule, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(ticket, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(freight, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(feedback, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settings, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(489, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 990));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("enhancing your overall railway experience. ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 670, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("services. To ensure your voice is heard, we've created a user-friendly feedback form that allows you to share ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 680, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(227, 206, 50));
        jLabel5.setText("Why Your Feedback Matters:  ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, 280, -1));

        form.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\FORM.png")); // NOI18N
        form.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });
        jPanel1.add(form, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 130, 170, 160));

        jLabel6.setBackground(new java.awt.Color(232, 232, 48));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(227, 206, 50));
        jLabel6.setText("Click here for filling the form ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 100, 210, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Welcome to our Railway Feedback Page! Fast Railways, we value your feedback as it plays a crucial role in ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 680, 30));

        jPanel4.setBackground(new java.awt.Color(26, 25, 25));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Feedback");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 60));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 1110, 80));

        jLabel8.setBackground(new java.awt.Color(232, 232, 48));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(227, 206, 50));
        jLabel8.setText("Complaints, Compliments and Feedback ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 280, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Whether you're a frequent traveler or a first-time rider, your insights are invaluable in helping us improve our ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 680, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("your thoughts, suggestions, and even address any concerns you may have.");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 670, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("4. Safety Concerns");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 670, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("3. Constructive Feedback");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 680, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Your feedback is not just a comment – it's a contribution to making the railway journey better for everyone.");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 680, 30));

        jLabel14.setBackground(new java.awt.Color(232, 232, 48));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(227, 206, 50));
        jLabel14.setText("Complaints, Compliments and Feedback ");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 280, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("1. Be Specific and Clear");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 680, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("2. Include Relevant Details ");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 670, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("5. Complaint Resolution");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 680, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("4. Enhanced Services");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 660, 670, 30));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("3. Building Trust");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 630, 680, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("2. Customer-Centric Approach");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 600, 670, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("1. Continuous Improvement");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 680, 30));

        jLabel18.setBackground(new java.awt.Color(232, 232, 48));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(227, 206, 50));
        jLabel18.setText("Guidelines for filling the form ");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 280, -1));

        jScrollPane2.setViewportView(jPanel1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 790));
        jScrollPane2.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        form.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\form2.png"));
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        form.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\FORM.png"));
    }//GEN-LAST:event_formMouseExited

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        home.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\h2.png"));
    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
        home.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\h1.png"));
    }//GEN-LAST:event_homeMouseExited

    private void scheduleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scheduleMouseEntered
        schedule.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\s2.png"));
    }//GEN-LAST:event_scheduleMouseEntered

    private void scheduleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scheduleMouseExited
        schedule.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\align.png"));
    }//GEN-LAST:event_scheduleMouseExited

    private void ticketMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ticketMouseEntered
        ticket.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\tick2.png")); 
    }//GEN-LAST:event_ticketMouseEntered

    private void ticketMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ticketMouseExited
        ticket.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\tick.png")); 
    }//GEN-LAST:event_ticketMouseExited

    private void freightMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_freightMouseEntered
        freight.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\freight2.png")); 
    }//GEN-LAST:event_freightMouseEntered

    private void freightMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_freightMouseExited
        freight.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\f1.png")); 
    }//GEN-LAST:event_freightMouseExited

    private void feedbackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feedbackMouseEntered
        feedback.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\feed2.png")); 
    }//GEN-LAST:event_feedbackMouseEntered

    private void feedbackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feedbackMouseExited
        feedback.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\feed1.png")); 
    }//GEN-LAST:event_feedbackMouseExited

    private void contactMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactMouseExited
        contact.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\contact.png"));
    }//GEN-LAST:event_contactMouseExited

    private void contactMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactMousePressed
         
    }//GEN-LAST:event_contactMousePressed

    private void contactMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactMouseEntered
        contact.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\c2.png")); 
    }//GEN-LAST:event_contactMouseEntered

    private void infoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoMouseEntered
        info.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\infoo.png")); 
    }//GEN-LAST:event_infoMouseEntered

    private void infoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoMouseExited
       info.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\ii.png")); 
    }//GEN-LAST:event_infoMouseExited

    private void settingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseEntered
        settings.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\set2.png"));
    }//GEN-LAST:event_settingsMouseEntered

    private void settingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseExited
       settings.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\ss.png"));
    }//GEN-LAST:event_settingsMouseExited
 
     private void addLabelListeners() {
        form.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openHome();
            }
        });
     }  

    private void openHome() {
    feedForm home = new feedForm();
    home.setDefaultCloseOperation(home.DISPOSE_ON_CLOSE); // Dispose on close to avoid multiple instances
    home.setVisible(true);
}
    
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
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Feedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel contact;
    private javax.swing.JLabel feedback;
    private javax.swing.JLabel form;
    private javax.swing.JLabel freight;
    private javax.swing.JLabel home;
    private javax.swing.JLabel info;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel schedule;
    private javax.swing.JLabel settings;
    private javax.swing.JLabel ticket;
    // End of variables declaration//GEN-END:variables
}
