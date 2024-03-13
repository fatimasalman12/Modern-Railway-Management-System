import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PassengerDash extends javax.swing.JFrame {

    public PassengerDash() {
        initComponents();
       addLabelListeners();
       GradientPanel gradientPanel = new GradientPanel();
        getContentPane().add(gradientPanel);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 300); // Set your desired frame size
        setLocationRelativeTo(null); // Center the frame on the screen
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
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
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        sidepanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        settings = new javax.swing.JLabel();
        info = new javax.swing.JLabel();
        contactus = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        Schedule = new javax.swing.JLabel();
        feedback = new javax.swing.JLabel();
        ticket = new javax.swing.JLabel();
        freight = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1200, 700));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(26, 25, 25));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Account History ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 1110, 80));

        jPanel5.setBackground(new java.awt.Color(26, 25, 25));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setForeground(new java.awt.Color(23, 23, 25));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(227, 206, 50));
        jLabel4.setText("   Booked Tickets                                              Source City                                              Destination City                                            Payment Status ");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 760, 33));
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 48, 770, 10));
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 770, 10));
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 770, -1));
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 770, 10));
        jPanel5.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 198, 770, 10));

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("SL-123");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Sialkot");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Lahore ");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("KI-456");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("KL-89");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 20));

        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("LI-12");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("LI-199");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Karachi ");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Islamabad ");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));

        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("paid");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, -1, -1));

        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Karachi ");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Lahore");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, -1));

        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("paid");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, -1, -1));

        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Lahore");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Lahore");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Islamabad");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, -1, -1));

        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("Islamabad ");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, -1, -1));

        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("paid");
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, -1, -1));

        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("paid");
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 270, -1, -1));

        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("paid");
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, -1, -1));
        jPanel5.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 770, 10));
        jPanel5.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 770, 10));

        jLabel28.setForeground(new java.awt.Color(204, 204, 204));
        jLabel28.setText("LI-340");
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setText("LI-14");
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setText("paid");
        jPanel5.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 330, -1, -1));

        jLabel32.setForeground(new java.awt.Color(204, 204, 204));
        jLabel32.setText("Islamabad ");
        jPanel5.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, -1, -1));

        jLabel33.setForeground(new java.awt.Color(204, 204, 204));
        jLabel33.setText("Lahore");
        jPanel5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        jLabel34.setForeground(new java.awt.Color(204, 204, 204));
        jLabel34.setText("Islamabad ");
        jPanel5.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, -1, -1));

        jLabel35.setForeground(new java.awt.Color(204, 204, 204));
        jLabel35.setText("Lahore");
        jPanel5.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        jLabel36.setForeground(new java.awt.Color(204, 204, 204));
        jLabel36.setText("paid");
        jPanel5.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 770, 420));

        jPanel4.setBackground(new java.awt.Color(26, 25, 25));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(227, 206, 50));
        jLabel1.setText("       NEWS AND UPDATES ");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 198, 50));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("and offers");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, -1));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("here are some new deals");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 170, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 90, 210, 180));

        sidepanel.setBackground(new java.awt.Color(26, 25, 25));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("  User name");

        jLabel29.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\p1.png")); // NOI18N
        jLabel29.setPreferredSize(new java.awt.Dimension(90, 70));

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

        contactus.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\contact.png")); // NOI18N
        contactus.setPreferredSize(new java.awt.Dimension(90, 70));
        contactus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contactusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                contactusMouseExited(evt);
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

        Schedule.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\align.png")); // NOI18N
        Schedule.setPreferredSize(new java.awt.Dimension(90, 70));
        Schedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ScheduleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ScheduleMouseExited(evt);
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

        javax.swing.GroupLayout sidepanelLayout = new javax.swing.GroupLayout(sidepanel);
        sidepanel.setLayout(sidepanelLayout);
        sidepanelLayout.setHorizontalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidepanelLayout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidepanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidepanelLayout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidepanelLayout.createSequentialGroup()
                        .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Schedule, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ticket, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(freight, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(contactus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(info, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(feedback, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(settings, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))))
        );
        sidepanelLayout.setVerticalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Schedule, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(ticket, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(freight, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(feedback, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contactus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settings, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        jPanel1.add(sidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 720));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        home.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\h2.png"));
    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
        home.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\h1.png"));
    }//GEN-LAST:event_homeMouseExited

    private void ScheduleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScheduleMouseEntered
        Schedule.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\s2.png"));
    }//GEN-LAST:event_ScheduleMouseEntered

    private void ScheduleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScheduleMouseExited
        Schedule.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\align.png"));
    }//GEN-LAST:event_ScheduleMouseExited

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

    private void contactusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactusMouseEntered
        contactus.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\c2.png"));
    }//GEN-LAST:event_contactusMouseEntered

    private void contactusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactusMouseExited
        contactus.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\contact.png"));
    }//GEN-LAST:event_contactusMouseExited

    private void infoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoMouseEntered
        info.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\i2.png")); 
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
    
    private static class GradientPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Define custom colors
            Color startColor = new Color(255, 0, 0); // Red
            Color endColor = new Color(0, 0, 255);   // Blue

            // Create a gradient paint
            GradientPaint gradient = new GradientPaint(0, 0, startColor, getWidth(), getHeight(), endColor);

            // Apply the gradient paint to the graphics object
            Graphics2D g2d = (Graphics2D) g;
            g2d.setPaint(gradient);
            g2d.fillRect(0, 0, getWidth(), getHeight());
        }
    }
    
    
    private void addLabelListeners() {
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openHome();
            }
        });

        ticket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openTickets();
            }
        });
        
        Schedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openschedule();
            }
        });
        
        feedback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openFeedback();
            }
        });

        freight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openFreight();
            }
        });
        
        // Add more labels and their listeners as needed...
    }

    private void openHome() {
    // Create an instance of Home and make it visible
    PassengerDash home = new PassengerDash();
    home.setDefaultCloseOperation(home.DISPOSE_ON_CLOSE); // Dispose on close to avoid multiple instances
    home.setVisible(true);
}


    private void openTickets() {
    // Create an instance of Home and make it visible
    Tickets home = new Tickets();
    home.setDefaultCloseOperation(home.DISPOSE_ON_CLOSE); // Dispose on close to avoid multiple instances
    home.setVisible(true);
    }
    
     private void openschedule() {
    // Create an instance of Home and make it visible
    Schedules home = new Schedules();
    home.setDefaultCloseOperation(home.DISPOSE_ON_CLOSE); // Dispose on close to avoid multiple instances
    home.setVisible(true);
    }

    private void openFeedback() {
    // Create an instance of Home and make it visible
    Feedback home = new Feedback();
    home.setDefaultCloseOperation(home.DISPOSE_ON_CLOSE); // Dispose on close to avoid multiple instances
    home.setVisible(true);
    }
    
     private void openFreight() {
    // Create an instance of Home and make it visible
    freight home = new freight();
    home.setDefaultCloseOperation(home.DISPOSE_ON_CLOSE); // Dispose on close to avoid multiple instances
    home.setVisible(true);    }

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
            java.util.logging.Logger.getLogger(PassengerDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PassengerDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PassengerDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PassengerDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PassengerDash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Schedule;
    private javax.swing.JLabel contactus;
    private javax.swing.JLabel feedback;
    private javax.swing.JLabel freight;
    private javax.swing.JLabel home;
    private javax.swing.JLabel info;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel settings;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JLabel ticket;
    // End of variables declaration//GEN-END:variables
}
