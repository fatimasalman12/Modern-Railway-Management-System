import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tickets extends javax.swing.JFrame {

 
    public Tickets() {
        initComponents();
        addLabelListeners();
        addMouseListeners();
    }

     private void addMouseListeners() {
        // Add a mouse listener to the book1 label
        book1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Change the text color or style when the mouse enters
                book1.setForeground(Color.YELLOW);  // Change to the desired color
                book1.setFont(book1.getFont().deriveFont(Font.ITALIC));  // Change to the desired style
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Reset the text color or style when the mouse exits
                book1.setForeground(Color.WHITE);  // Reset to the default color
                book1.setFont(book1.getFont().deriveFont(Font.PLAIN));  // Reset to the default style
            }
        });
        //FOR BOOK2 LABEL 
        book2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Change the text color or style when the mouse enters
                book2.setForeground(Color.YELLOW);  // Change to the desired color
                book2.setFont(book2.getFont().deriveFont(Font.ITALIC));  // Change to the desired style
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Reset the text color or style when the mouse exits
                book2.setForeground(Color.WHITE);  // Reset to the default color
                book2.setFont(book2.getFont().deriveFont(Font.PLAIN));  // Reset to the default style
            }
        });
        //FOR BOOK3 LABEL 
        book3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Change the text color or style when the mouse enters
                book3.setForeground(Color.YELLOW);  // Change to the desired color
                book3.setFont(book3.getFont().deriveFont(Font.ITALIC));  // Change to the desired style
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Reset the text color or style when the mouse exits
                book3.setForeground(Color.WHITE);  // Reset to the default color
                book3.setFont(book3.getFont().deriveFont(Font.PLAIN));  // Reset to the default style
            }
        });
        
          book4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Change the text color or style when the mouse enters
                book4.setForeground(Color.YELLOW);  // Change to the desired color
                book4.setFont(book4.getFont().deriveFont(Font.ITALIC));  // Change to the desired style
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Reset the text color or style when the mouse exits
                book4.setForeground(Color.WHITE);  // Reset to the default color
                book4.setFont(book4.getFont().deriveFont(Font.PLAIN));  // Reset to the default style
            }
        });
          book5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Change the text color or style when the mouse enters
                book5.setForeground(Color.YELLOW);  // Change to the desired color
                book5.setFont(book5.getFont().deriveFont(Font.ITALIC));  // Change to the desired style
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Reset the text color or style when the mouse exits
                book5.setForeground(Color.WHITE);  // Reset to the default color
                book5.setFont(book5.getFont().deriveFont(Font.PLAIN));  // Reset to the default style
            }
        });
        
            book6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Change the text color or style when the mouse enters
                book6.setForeground(Color.YELLOW);  // Change to the desired color
                book6.setFont(book6.getFont().deriveFont(Font.ITALIC));  // Change to the desired style
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Reset the text color or style when the mouse exits
                book6.setForeground(Color.WHITE);  // Reset to the default color
                book6.setFont(book6.getFont().deriveFont(Font.PLAIN));  // Reset to the default style
            }
        });
            
              book7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Change the text color or style when the mouse enters
                book7.setForeground(Color.YELLOW);  // Change to the desired color
                book7.setFont(book7.getFont().deriveFont(Font.ITALIC));  // Change to the desired style
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Reset the text color or style when the mouse exits
                book7.setForeground(Color.WHITE);  // Reset to the default color
                book7.setFont(book7.getFont().deriveFont(Font.PLAIN));  // Reset to the default style
            }
        });
              
                book8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Change the text color or style when the mouse enters
                book8.setForeground(Color.YELLOW);  // Change to the desired color
                book8.setFont(book8.getFont().deriveFont(Font.ITALIC));  // Change to the desired style
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Reset the text color or style when the mouse exits
                book8.setForeground(Color.WHITE);  // Reset to the default color
                book8.setFont(book8.getFont().deriveFont(Font.PLAIN));  // Reset to the default style
            }
        });
//            book9.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                // Change the text color or style when the mouse enters
//                book9.setForeground(Color.YELLOW);  // Change to the desired color
//                book9.setFont(book9.getFont().deriveFont(Font.ITALIC));  // Change to the desired style
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//                // Reset the text color or style when the mouse exits
//                book9.setForeground(Color.WHITE);  // Reset to the default color
//                book9.setFont(book9.getFont().deriveFont(Font.PLAIN));  // Reset to the default style
//            }
//        });
//                  
//           book10.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                // Change the text color or style when the mouse enters
//                book10.setForeground(Color.YELLOW);  // Change to the desired color
//                book10.setFont(book10.getFont().deriveFont(Font.ITALIC));  // Change to the desired style
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//                // Reset the text color or style when the mouse exits
//                book10.setForeground(Color.WHITE);  // Reset to the default color
//                book10.setFont(book10.getFont().deriveFont(Font.PLAIN));  // Reset to the default style
//            }
//        });         
    }

    private void addLabelListeners() {
        book1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openHome();
            }
        });
         book2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openHome();
            }
        });
          book3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openHome();
            }
        });
           book4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openHome();
            }
        });
            book5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openHome();
            }
        });
             book6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openHome();
            }
        });
             
              book7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openHome();
            }
        });
               book8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openHome();
            }
        });
               
//                book9.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                openHome();
//            }
//        });
//                 book10.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                openHome();
//            }
//        });
           
    }
    
    private void openHome() {
    // Create an instance of Home and make it visible
    bookingpopup home = new bookingpopup();
    home.setDefaultCloseOperation(bookingpopup.DISPOSE_ON_CLOSE); // Dispose on close to avoid multiple instances
    home.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel15 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Goodpanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        book1 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        book2 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        book3 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        book4 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        book5 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        book6 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        book7 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        book8 = new javax.swing.JLabel();

        jPanel15.setBackground(new java.awt.Color(26, 25, 25));

        jLabel88.setBackground(new java.awt.Color(204, 204, 204));
        jLabel88.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(204, 204, 204));
        jLabel88.setText("Price ");

        jLabel89.setBackground(new java.awt.Color(204, 204, 204));
        jLabel89.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(204, 204, 204));
        jLabel89.setText("Train Name  ");

        jLabel90.setBackground(new java.awt.Color(204, 204, 204));
        jLabel90.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(204, 204, 204));
        jLabel90.setText("Train ID");

        jLabel91.setBackground(new java.awt.Color(204, 204, 204));
        jLabel91.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(204, 204, 204));
        jLabel91.setText("Destination City ");

        jLabel92.setBackground(new java.awt.Color(204, 204, 204));
        jLabel92.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(204, 204, 204));
        jLabel92.setText("Time of departure ");

        jLabel93.setBackground(new java.awt.Color(204, 204, 204));
        jLabel93.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(204, 204, 204));
        jLabel93.setText("Status ");

        jLabel94.setBackground(new java.awt.Color(204, 204, 204));
        jLabel94.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(204, 204, 204));
        jLabel94.setText("No. of Tickets");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel89)
                .addGap(59, 59, 59)
                .addComponent(jLabel90)
                .addGap(61, 61, 61)
                .addComponent(jLabel91)
                .addGap(63, 63, 63)
                .addComponent(jLabel92)
                .addGap(68, 68, 68)
                .addComponent(jLabel88)
                .addGap(70, 70, 70)
                .addComponent(jLabel93)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jLabel94)
                .addGap(34, 34, 34))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel89)
                    .addComponent(jLabel90)
                    .addComponent(jLabel91)
                    .addComponent(jLabel92)
                    .addComponent(jLabel88)
                    .addComponent(jLabel93)
                    .addComponent(jLabel94))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(960, 570));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(26, 25, 25));

        jLabel33.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\home.png")); // NOI18N
        jLabel33.setPreferredSize(new java.awt.Dimension(90, 70));

        jLabel30.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\align.png")); // NOI18N
        jLabel30.setPreferredSize(new java.awt.Dimension(90, 70));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("  User name");

        jLabel29.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\niceprof.png")); // NOI18N
        jLabel29.setPreferredSize(new java.awt.Dimension(90, 70));

        jLabel28.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\feed1.png")); // NOI18N
        jLabel28.setPreferredSize(new java.awt.Dimension(90, 70));

        jLabel31.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\tick.png")); // NOI18N
        jLabel31.setPreferredSize(new java.awt.Dimension(90, 70));

        jLabel32.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\f1.png")); // NOI18N
        jLabel32.setPreferredSize(new java.awt.Dimension(90, 70));

        jLabel39.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\ss.png")); // NOI18N
        jLabel39.setPreferredSize(new java.awt.Dimension(90, 70));

        jLabel38.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\ii.png")); // NOI18N
        jLabel38.setPreferredSize(new java.awt.Dimension(90, 70));

        jLabel34.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\contact.png")); // NOI18N
        jLabel34.setPreferredSize(new java.awt.Dimension(90, 70));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(426, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 960));

        jPanel3.setBackground(new java.awt.Color(26, 25, 25));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Book Tickets ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1136, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 1310, 80));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Train/Location");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 130, 30));

        jTextField1.setBackground(new java.awt.Color(26, 25, 25));
        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setText("Search here...");
        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 92, 820, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\search (1).png")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 90, -1, 30));

        Goodpanel.setBackground(new java.awt.Color(26, 25, 25));
        Goodpanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\profit.png")); // NOI18N

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\1.png")); // NOI18N

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\flag.png")); // NOI18N

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\time2.png")); // NOI18N

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\st3.png")); // NOI18N

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\booking.png")); // NOI18N

        jLabel18.setBackground(new java.awt.Color(204, 204, 204));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\id2.png")); // NOI18N

        javax.swing.GroupLayout GoodpanelLayout = new javax.swing.GroupLayout(Goodpanel);
        Goodpanel.setLayout(GoodpanelLayout);
        GoodpanelLayout.setHorizontalGroup(
            GoodpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GoodpanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel7)
                .addGap(126, 126, 126)
                .addComponent(jLabel18)
                .addGap(118, 118, 118)
                .addComponent(jLabel8)
                .addGap(135, 135, 135)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(107, 107, 107)
                .addComponent(jLabel10)
                .addGap(100, 100, 100)
                .addComponent(jLabel11)
                .addGap(73, 73, 73))
        );
        GoodpanelLayout.setVerticalGroup(
            GoodpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GoodpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GoodpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel1.add(Goodpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 980, 50));

        jPanel5.setBackground(new java.awt.Color(26, 25, 25));

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("1500 ");

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Train 1 ");

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("100XD1");

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Lahore");

        jLabel16.setBackground(new java.awt.Color(204, 204, 204));
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("8:30 pm");

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Available ");

        book1.setBackground(new java.awt.Color(204, 204, 204));
        book1.setForeground(new java.awt.Color(204, 204, 204));
        book1.setText("book ticket");
        book1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                book1MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel13)
                .addGap(101, 101, 101)
                .addComponent(jLabel14)
                .addGap(102, 102, 102)
                .addComponent(jLabel15)
                .addGap(119, 119, 119)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(86, 86, 86)
                .addComponent(jLabel17)
                .addGap(67, 67, 67)
                .addComponent(book1)
                .addGap(50, 50, 50))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel12)
                    .addComponent(jLabel17)
                    .addComponent(book1))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 980, 50));

        jPanel16.setBackground(new java.awt.Color(26, 25, 25));

        jLabel95.setBackground(new java.awt.Color(204, 204, 204));
        jLabel95.setForeground(new java.awt.Color(204, 204, 204));
        jLabel95.setText("1500 ");

        jLabel96.setBackground(new java.awt.Color(204, 204, 204));
        jLabel96.setForeground(new java.awt.Color(204, 204, 204));
        jLabel96.setText("Train 2");

        jLabel97.setBackground(new java.awt.Color(204, 204, 204));
        jLabel97.setForeground(new java.awt.Color(204, 204, 204));
        jLabel97.setText("100XD2");

        jLabel98.setBackground(new java.awt.Color(204, 204, 204));
        jLabel98.setForeground(new java.awt.Color(204, 204, 204));
        jLabel98.setText("Lahore");

        jLabel99.setBackground(new java.awt.Color(204, 204, 204));
        jLabel99.setForeground(new java.awt.Color(204, 204, 204));
        jLabel99.setText("8:30 pm");

        jLabel100.setBackground(new java.awt.Color(204, 204, 204));
        jLabel100.setForeground(new java.awt.Color(204, 204, 204));
        jLabel100.setText("Available ");

        book2.setBackground(new java.awt.Color(204, 204, 204));
        book2.setForeground(new java.awt.Color(204, 204, 204));
        book2.setText("book ticket");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel96)
                .addGap(101, 101, 101)
                .addComponent(jLabel97)
                .addGap(102, 102, 102)
                .addComponent(jLabel98)
                .addGap(119, 119, 119)
                .addComponent(jLabel99)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(jLabel95)
                .addGap(86, 86, 86)
                .addComponent(jLabel100)
                .addGap(67, 67, 67)
                .addComponent(book2)
                .addGap(50, 50, 50))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel96)
                    .addComponent(jLabel97)
                    .addComponent(jLabel98)
                    .addComponent(jLabel99)
                    .addComponent(jLabel95)
                    .addComponent(jLabel100)
                    .addComponent(book2))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 980, 50));

        jPanel17.setBackground(new java.awt.Color(26, 25, 25));

        jLabel102.setBackground(new java.awt.Color(204, 204, 204));
        jLabel102.setForeground(new java.awt.Color(204, 204, 204));
        jLabel102.setText("1500 ");

        jLabel103.setBackground(new java.awt.Color(204, 204, 204));
        jLabel103.setForeground(new java.awt.Color(204, 204, 204));
        jLabel103.setText("Train 3 ");

        jLabel104.setBackground(new java.awt.Color(204, 204, 204));
        jLabel104.setForeground(new java.awt.Color(204, 204, 204));
        jLabel104.setText("100XD3");

        jLabel105.setBackground(new java.awt.Color(204, 204, 204));
        jLabel105.setForeground(new java.awt.Color(204, 204, 204));
        jLabel105.setText("Lahore");

        jLabel106.setBackground(new java.awt.Color(204, 204, 204));
        jLabel106.setForeground(new java.awt.Color(204, 204, 204));
        jLabel106.setText("8:30 pm");

        jLabel107.setBackground(new java.awt.Color(204, 204, 204));
        jLabel107.setForeground(new java.awt.Color(204, 204, 204));
        jLabel107.setText("Available ");

        book3.setBackground(new java.awt.Color(204, 204, 204));
        book3.setForeground(new java.awt.Color(204, 204, 204));
        book3.setText("book ticket");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel103)
                .addGap(101, 101, 101)
                .addComponent(jLabel104)
                .addGap(101, 101, 101)
                .addComponent(jLabel105)
                .addGap(120, 120, 120)
                .addComponent(jLabel106)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(jLabel102)
                .addGap(86, 86, 86)
                .addComponent(jLabel107)
                .addGap(67, 67, 67)
                .addComponent(book3)
                .addGap(50, 50, 50))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel103)
                    .addComponent(jLabel104)
                    .addComponent(jLabel105)
                    .addComponent(jLabel106)
                    .addComponent(jLabel102)
                    .addComponent(jLabel107)
                    .addComponent(book3))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 980, 50));

        jPanel18.setBackground(new java.awt.Color(26, 25, 25));

        jLabel109.setBackground(new java.awt.Color(204, 204, 204));
        jLabel109.setForeground(new java.awt.Color(204, 204, 204));
        jLabel109.setText("1500 ");

        jLabel110.setBackground(new java.awt.Color(204, 204, 204));
        jLabel110.setForeground(new java.awt.Color(204, 204, 204));
        jLabel110.setText("Train 4");

        jLabel111.setBackground(new java.awt.Color(204, 204, 204));
        jLabel111.setForeground(new java.awt.Color(204, 204, 204));
        jLabel111.setText("100XD1");

        jLabel112.setBackground(new java.awt.Color(204, 204, 204));
        jLabel112.setForeground(new java.awt.Color(204, 204, 204));
        jLabel112.setText("Lahore");

        jLabel113.setBackground(new java.awt.Color(204, 204, 204));
        jLabel113.setForeground(new java.awt.Color(204, 204, 204));
        jLabel113.setText("8:30 pm");

        jLabel114.setBackground(new java.awt.Color(204, 204, 204));
        jLabel114.setForeground(new java.awt.Color(204, 204, 204));
        jLabel114.setText("Available ");

        book4.setBackground(new java.awt.Color(204, 204, 204));
        book4.setForeground(new java.awt.Color(204, 204, 204));
        book4.setText("book ticket");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel110)
                .addGap(101, 101, 101)
                .addComponent(jLabel111)
                .addGap(102, 102, 102)
                .addComponent(jLabel112)
                .addGap(119, 119, 119)
                .addComponent(jLabel113)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(jLabel109)
                .addGap(86, 86, 86)
                .addComponent(jLabel114)
                .addGap(67, 67, 67)
                .addComponent(book4)
                .addGap(50, 50, 50))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel110)
                    .addComponent(jLabel111)
                    .addComponent(jLabel112)
                    .addComponent(jLabel113)
                    .addComponent(jLabel109)
                    .addComponent(jLabel114)
                    .addComponent(book4))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 980, 50));

        jPanel19.setBackground(new java.awt.Color(26, 25, 25));

        jLabel116.setBackground(new java.awt.Color(204, 204, 204));
        jLabel116.setForeground(new java.awt.Color(204, 204, 204));
        jLabel116.setText("1500 ");

        jLabel117.setBackground(new java.awt.Color(204, 204, 204));
        jLabel117.setForeground(new java.awt.Color(204, 204, 204));
        jLabel117.setText("Train 5 ");

        jLabel118.setBackground(new java.awt.Color(204, 204, 204));
        jLabel118.setForeground(new java.awt.Color(204, 204, 204));
        jLabel118.setText("100XD1");

        jLabel119.setBackground(new java.awt.Color(204, 204, 204));
        jLabel119.setForeground(new java.awt.Color(204, 204, 204));
        jLabel119.setText("Lahore");

        jLabel120.setBackground(new java.awt.Color(204, 204, 204));
        jLabel120.setForeground(new java.awt.Color(204, 204, 204));
        jLabel120.setText("8:30 pm");

        jLabel121.setBackground(new java.awt.Color(204, 204, 204));
        jLabel121.setForeground(new java.awt.Color(204, 204, 204));
        jLabel121.setText("Available ");

        book5.setBackground(new java.awt.Color(204, 204, 204));
        book5.setForeground(new java.awt.Color(204, 204, 204));
        book5.setText("book ticket");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel117)
                .addGap(101, 101, 101)
                .addComponent(jLabel118)
                .addGap(102, 102, 102)
                .addComponent(jLabel119)
                .addGap(119, 119, 119)
                .addComponent(jLabel120)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(jLabel116)
                .addGap(86, 86, 86)
                .addComponent(jLabel121)
                .addGap(67, 67, 67)
                .addComponent(book5)
                .addGap(50, 50, 50))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel117)
                    .addComponent(jLabel118)
                    .addComponent(jLabel119)
                    .addComponent(jLabel120)
                    .addComponent(jLabel116)
                    .addComponent(jLabel121)
                    .addComponent(book5))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 980, 50));

        jPanel20.setBackground(new java.awt.Color(26, 25, 25));

        jLabel123.setBackground(new java.awt.Color(204, 204, 204));
        jLabel123.setForeground(new java.awt.Color(204, 204, 204));
        jLabel123.setText("1500 ");

        jLabel124.setBackground(new java.awt.Color(204, 204, 204));
        jLabel124.setForeground(new java.awt.Color(204, 204, 204));
        jLabel124.setText("Train 6 ");

        jLabel125.setBackground(new java.awt.Color(204, 204, 204));
        jLabel125.setForeground(new java.awt.Color(204, 204, 204));
        jLabel125.setText("100XD1");

        jLabel126.setBackground(new java.awt.Color(204, 204, 204));
        jLabel126.setForeground(new java.awt.Color(204, 204, 204));
        jLabel126.setText("Lahore");

        jLabel127.setBackground(new java.awt.Color(204, 204, 204));
        jLabel127.setForeground(new java.awt.Color(204, 204, 204));
        jLabel127.setText("8:30 pm");

        jLabel128.setBackground(new java.awt.Color(204, 204, 204));
        jLabel128.setForeground(new java.awt.Color(204, 204, 204));
        jLabel128.setText("Available ");

        book6.setBackground(new java.awt.Color(204, 204, 204));
        book6.setForeground(new java.awt.Color(204, 204, 204));
        book6.setText("book ticket");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel124)
                .addGap(101, 101, 101)
                .addComponent(jLabel125)
                .addGap(102, 102, 102)
                .addComponent(jLabel126)
                .addGap(119, 119, 119)
                .addComponent(jLabel127)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(jLabel123)
                .addGap(86, 86, 86)
                .addComponent(jLabel128)
                .addGap(67, 67, 67)
                .addComponent(book6)
                .addGap(50, 50, 50))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel124)
                    .addComponent(jLabel125)
                    .addComponent(jLabel126)
                    .addComponent(jLabel127)
                    .addComponent(jLabel123)
                    .addComponent(jLabel128)
                    .addComponent(book6))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 980, 50));

        jPanel21.setBackground(new java.awt.Color(26, 25, 25));

        jLabel130.setBackground(new java.awt.Color(204, 204, 204));
        jLabel130.setForeground(new java.awt.Color(204, 204, 204));
        jLabel130.setText("1500 ");

        jLabel131.setBackground(new java.awt.Color(204, 204, 204));
        jLabel131.setForeground(new java.awt.Color(204, 204, 204));
        jLabel131.setText("Train 7 ");

        jLabel132.setBackground(new java.awt.Color(204, 204, 204));
        jLabel132.setForeground(new java.awt.Color(204, 204, 204));
        jLabel132.setText("100XD1");

        jLabel133.setBackground(new java.awt.Color(204, 204, 204));
        jLabel133.setForeground(new java.awt.Color(204, 204, 204));
        jLabel133.setText("Lahore");

        jLabel134.setBackground(new java.awt.Color(204, 204, 204));
        jLabel134.setForeground(new java.awt.Color(204, 204, 204));
        jLabel134.setText("8:30 pm");

        jLabel135.setBackground(new java.awt.Color(204, 204, 204));
        jLabel135.setForeground(new java.awt.Color(204, 204, 204));
        jLabel135.setText("Available ");

        book7.setBackground(new java.awt.Color(204, 204, 204));
        book7.setForeground(new java.awt.Color(204, 204, 204));
        book7.setText("book ticket");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel131)
                .addGap(101, 101, 101)
                .addComponent(jLabel132)
                .addGap(102, 102, 102)
                .addComponent(jLabel133)
                .addGap(119, 119, 119)
                .addComponent(jLabel134)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(jLabel130)
                .addGap(86, 86, 86)
                .addComponent(jLabel135)
                .addGap(67, 67, 67)
                .addComponent(book7)
                .addGap(50, 50, 50))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel131)
                    .addComponent(jLabel132)
                    .addComponent(jLabel133)
                    .addComponent(jLabel134)
                    .addComponent(jLabel130)
                    .addComponent(jLabel135)
                    .addComponent(book7))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 570, 980, 50));

        jPanel22.setBackground(new java.awt.Color(26, 25, 25));

        jLabel137.setBackground(new java.awt.Color(204, 204, 204));
        jLabel137.setForeground(new java.awt.Color(204, 204, 204));
        jLabel137.setText("1500 ");

        jLabel138.setBackground(new java.awt.Color(204, 204, 204));
        jLabel138.setForeground(new java.awt.Color(204, 204, 204));
        jLabel138.setText("Train 8");

        jLabel139.setBackground(new java.awt.Color(204, 204, 204));
        jLabel139.setForeground(new java.awt.Color(204, 204, 204));
        jLabel139.setText("100XD1");

        jLabel140.setBackground(new java.awt.Color(204, 204, 204));
        jLabel140.setForeground(new java.awt.Color(204, 204, 204));
        jLabel140.setText("Lahore");

        jLabel141.setBackground(new java.awt.Color(204, 204, 204));
        jLabel141.setForeground(new java.awt.Color(204, 204, 204));
        jLabel141.setText("8:30 pm");

        jLabel142.setBackground(new java.awt.Color(204, 204, 204));
        jLabel142.setForeground(new java.awt.Color(204, 204, 204));
        jLabel142.setText("Available ");

        book8.setBackground(new java.awt.Color(204, 204, 204));
        book8.setForeground(new java.awt.Color(204, 204, 204));
        book8.setText("book ticket");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel138)
                .addGap(101, 101, 101)
                .addComponent(jLabel139)
                .addGap(102, 102, 102)
                .addComponent(jLabel140)
                .addGap(119, 119, 119)
                .addComponent(jLabel141)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(jLabel137)
                .addGap(86, 86, 86)
                .addComponent(jLabel142)
                .addGap(67, 67, 67)
                .addComponent(book8)
                .addGap(50, 50, 50))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel138)
                    .addComponent(jLabel139)
                    .addComponent(jLabel140)
                    .addComponent(jLabel141)
                    .addComponent(jLabel137)
                    .addComponent(jLabel142)
                    .addComponent(book8))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 630, 980, 50));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void book1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book1MouseEntered

    }//GEN-LAST:event_book1MouseEntered

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
            java.util.logging.Logger.getLogger(Tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tickets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Goodpanel;
    private javax.swing.JLabel book1;
    private javax.swing.JLabel book2;
    private javax.swing.JLabel book3;
    private javax.swing.JLabel book4;
    private javax.swing.JLabel book5;
    private javax.swing.JLabel book6;
    private javax.swing.JLabel book7;
    private javax.swing.JLabel book8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
