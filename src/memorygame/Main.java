/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memorygame;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author bla
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {

        initComponents();
        Random random = new Random();
        
        Color[] colorArray = new Color[]{Color.BLUE, Color.BLUE, Color.CYAN, Color.CYAN, Color.MAGENTA, Color.MAGENTA, Color.ORANGE, Color.ORANGE, Color.PINK, Color.PINK, Color.YELLOW, Color.YELLOW, Color.RED, Color.RED, Color.GREEN, Color.GREEN};
        int arraygrootte = colorArray.length / 4;
        
        Color[][] twodArray = new Color[arraygrootte][arraygrootte];
        ShuffelArray(colorArray);
        CopyArray(colorArray, twodArray, arraygrootte);
        
        for(int i= 0; i < colorArray.length; i++){
            System.out.println("colorArray" + colorArray[i]);
        }
        System.out.println("\n\n\n");
        
         for(int i = 0; i < arraygrootte; i++ ){
            for(int j = 0; j < arraygrootte; j++){
                System.out.println("2darray" + twodArray[i][j]);
                                
            }
        }
        SetBackground(twodArray);
        
/*
        Color[] colorArray1 = new Color[]{Color.BLUE, Color.CYAN, Color.ORANGE, Color.MAGENTA, Color.yellow, Color.GREEN, Color.RED, Color.PINK};
        int ArraySize = colorArray1.length;

        Color[] colorArray2 = new Color[ArraySize];

        for (int i = 0; i < colorArray1.length; i++) {
            colorArray2[i] = colorArray1[i];
        }

        ShuffleArray1(colorArray1);
        ShuffleArray2(colorArray2);
        
*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Kleurtjes1 = new javax.swing.JPanel();
        Button1 = new javax.swing.JButton();
        Kleurtjes2 = new javax.swing.JPanel();
        Button2 = new javax.swing.JButton();
        Kleurtjes3 = new javax.swing.JPanel();
        Button3 = new javax.swing.JButton();
        Kleurtjes4 = new javax.swing.JPanel();
        Button4 = new javax.swing.JButton();
        Kleurtjes5 = new javax.swing.JPanel();
        Button5 = new javax.swing.JButton();
        Kleurtjes6 = new javax.swing.JPanel();
        Button6 = new javax.swing.JButton();
        Kleurtjes7 = new javax.swing.JPanel();
        Button7 = new javax.swing.JButton();
        Kleurtjes8 = new javax.swing.JPanel();
        Button8 = new javax.swing.JButton();
        Kleurtjes9 = new javax.swing.JPanel();
        Button9 = new javax.swing.JButton();
        Kleurtjes10 = new javax.swing.JPanel();
        Button10 = new javax.swing.JButton();
        Kleurtjes11 = new javax.swing.JPanel();
        Button11 = new javax.swing.JButton();
        Kleurtjes12 = new javax.swing.JPanel();
        Button12 = new javax.swing.JButton();
        Kleurtjes13 = new javax.swing.JPanel();
        Button13 = new javax.swing.JButton();
        Kleurtjes14 = new javax.swing.JPanel();
        Button14 = new javax.swing.JButton();
        Kleurtjes15 = new javax.swing.JPanel();
        Button15 = new javax.swing.JButton();
        Kleurtjes16 = new javax.swing.JPanel();
        Button16 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Kleurtjes1.setBackground(new java.awt.Color(255, 153, 153));

        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Kleurtjes1Layout = new javax.swing.GroupLayout(Kleurtjes1);
        Kleurtjes1.setLayout(Kleurtjes1Layout);
        Kleurtjes1Layout.setHorizontalGroup(
            Kleurtjes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Kleurtjes1Layout.setVerticalGroup(
            Kleurtjes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Kleurtjes2.setBackground(new java.awt.Color(255, 153, 153));

        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Kleurtjes2Layout = new javax.swing.GroupLayout(Kleurtjes2);
        Kleurtjes2.setLayout(Kleurtjes2Layout);
        Kleurtjes2Layout.setHorizontalGroup(
            Kleurtjes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Kleurtjes2Layout.setVerticalGroup(
            Kleurtjes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Kleurtjes3.setBackground(new java.awt.Color(255, 153, 153));

        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Kleurtjes3Layout = new javax.swing.GroupLayout(Kleurtjes3);
        Kleurtjes3.setLayout(Kleurtjes3Layout);
        Kleurtjes3Layout.setHorizontalGroup(
            Kleurtjes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Kleurtjes3Layout.setVerticalGroup(
            Kleurtjes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Kleurtjes4.setBackground(new java.awt.Color(255, 153, 153));

        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Kleurtjes4Layout = new javax.swing.GroupLayout(Kleurtjes4);
        Kleurtjes4.setLayout(Kleurtjes4Layout);
        Kleurtjes4Layout.setHorizontalGroup(
            Kleurtjes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Kleurtjes4Layout.setVerticalGroup(
            Kleurtjes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Kleurtjes5.setBackground(new java.awt.Color(255, 153, 153));

        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Kleurtjes5Layout = new javax.swing.GroupLayout(Kleurtjes5);
        Kleurtjes5.setLayout(Kleurtjes5Layout);
        Kleurtjes5Layout.setHorizontalGroup(
            Kleurtjes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Kleurtjes5Layout.setVerticalGroup(
            Kleurtjes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Kleurtjes6.setBackground(new java.awt.Color(255, 153, 153));

        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Kleurtjes6Layout = new javax.swing.GroupLayout(Kleurtjes6);
        Kleurtjes6.setLayout(Kleurtjes6Layout);
        Kleurtjes6Layout.setHorizontalGroup(
            Kleurtjes6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Kleurtjes6Layout.setVerticalGroup(
            Kleurtjes6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Kleurtjes7.setBackground(new java.awt.Color(255, 153, 153));

        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Kleurtjes7Layout = new javax.swing.GroupLayout(Kleurtjes7);
        Kleurtjes7.setLayout(Kleurtjes7Layout);
        Kleurtjes7Layout.setHorizontalGroup(
            Kleurtjes7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Kleurtjes7Layout.setVerticalGroup(
            Kleurtjes7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Kleurtjes8.setBackground(new java.awt.Color(255, 153, 153));

        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Kleurtjes8Layout = new javax.swing.GroupLayout(Kleurtjes8);
        Kleurtjes8.setLayout(Kleurtjes8Layout);
        Kleurtjes8Layout.setHorizontalGroup(
            Kleurtjes8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button8, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Kleurtjes8Layout.setVerticalGroup(
            Kleurtjes8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button8, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Kleurtjes9.setBackground(new java.awt.Color(255, 153, 153));

        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Kleurtjes9Layout = new javax.swing.GroupLayout(Kleurtjes9);
        Kleurtjes9.setLayout(Kleurtjes9Layout);
        Kleurtjes9Layout.setHorizontalGroup(
            Kleurtjes9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button9, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Kleurtjes9Layout.setVerticalGroup(
            Kleurtjes9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button9, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Kleurtjes10.setBackground(new java.awt.Color(255, 153, 153));

        Button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Kleurtjes10Layout = new javax.swing.GroupLayout(Kleurtjes10);
        Kleurtjes10.setLayout(Kleurtjes10Layout);
        Kleurtjes10Layout.setHorizontalGroup(
            Kleurtjes10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button10, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Kleurtjes10Layout.setVerticalGroup(
            Kleurtjes10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button10, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Kleurtjes11.setBackground(new java.awt.Color(255, 153, 153));

        Button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Kleurtjes11Layout = new javax.swing.GroupLayout(Kleurtjes11);
        Kleurtjes11.setLayout(Kleurtjes11Layout);
        Kleurtjes11Layout.setHorizontalGroup(
            Kleurtjes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button11, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Kleurtjes11Layout.setVerticalGroup(
            Kleurtjes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button11, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Kleurtjes12.setBackground(new java.awt.Color(255, 153, 153));

        Button12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Kleurtjes12Layout = new javax.swing.GroupLayout(Kleurtjes12);
        Kleurtjes12.setLayout(Kleurtjes12Layout);
        Kleurtjes12Layout.setHorizontalGroup(
            Kleurtjes12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button12, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Kleurtjes12Layout.setVerticalGroup(
            Kleurtjes12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button12, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Kleurtjes13.setBackground(new java.awt.Color(255, 153, 153));

        Button13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Kleurtjes13Layout = new javax.swing.GroupLayout(Kleurtjes13);
        Kleurtjes13.setLayout(Kleurtjes13Layout);
        Kleurtjes13Layout.setHorizontalGroup(
            Kleurtjes13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button13, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Kleurtjes13Layout.setVerticalGroup(
            Kleurtjes13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button13, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Kleurtjes14.setBackground(new java.awt.Color(255, 153, 153));

        Button14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Kleurtjes14Layout = new javax.swing.GroupLayout(Kleurtjes14);
        Kleurtjes14.setLayout(Kleurtjes14Layout);
        Kleurtjes14Layout.setHorizontalGroup(
            Kleurtjes14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button14, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Kleurtjes14Layout.setVerticalGroup(
            Kleurtjes14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button14, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Kleurtjes15.setBackground(new java.awt.Color(255, 153, 153));

        Button15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Kleurtjes15Layout = new javax.swing.GroupLayout(Kleurtjes15);
        Kleurtjes15.setLayout(Kleurtjes15Layout);
        Kleurtjes15Layout.setHorizontalGroup(
            Kleurtjes15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button15, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Kleurtjes15Layout.setVerticalGroup(
            Kleurtjes15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button15, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Kleurtjes16.setBackground(new java.awt.Color(255, 153, 153));

        Button16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Kleurtjes16Layout = new javax.swing.GroupLayout(Kleurtjes16);
        Kleurtjes16.setLayout(Kleurtjes16Layout);
        Kleurtjes16Layout.setHorizontalGroup(
            Kleurtjes16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button16, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Kleurtjes16Layout.setVerticalGroup(
            Kleurtjes16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button16, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Kleurtjes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Kleurtjes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Kleurtjes3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Kleurtjes4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Kleurtjes5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Kleurtjes6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Kleurtjes7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Kleurtjes8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Kleurtjes9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Kleurtjes10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Kleurtjes11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Kleurtjes12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Kleurtjes13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Kleurtjes14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Kleurtjes15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Kleurtjes16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Kleurtjes4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Kleurtjes3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Kleurtjes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Kleurtjes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Kleurtjes5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Kleurtjes6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Kleurtjes7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Kleurtjes8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Kleurtjes9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Kleurtjes10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Kleurtjes11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Kleurtjes12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Kleurtjes13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Kleurtjes14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Kleurtjes15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Kleurtjes16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        // TODO add your handling code here:
        Button3.setContentAreaFilled(false);
        Button3.setBorderPainted(false);

         {if (Button4 != Button3);
       Button4.setContentAreaFilled(true);
        Button4.setBorderPainted(true);
         }
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        // TODO add your handling code here:
        Button4.setContentAreaFilled(false);
        Button4.setBorderPainted(false);
        
        {if (Button4 != Button3);
       Button3.setContentAreaFilled(true);
        Button3.setBorderPainted(true);
   
    }//GEN-LAST:event_Button4ActionPerformed
    }
    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        // TODO add your handling code here:
        Button5.setContentAreaFilled(false);
        Button5.setBorderPainted(false);
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        // TODO add your handling code here:
        Button6.setContentAreaFilled(false);
        Button6.setBorderPainted(false);
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
        // TODO add your handling code here:
        Button7.setContentAreaFilled(false);
        Button7.setBorderPainted(false);
    }//GEN-LAST:event_Button7ActionPerformed

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed
        // TODO add your handling code here:
        Button8.setContentAreaFilled(false);
        Button8.setBorderPainted(false);
    }//GEN-LAST:event_Button8ActionPerformed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed
        // TODO add your handling code here:Button3.setContentAreaFilled(false);
        Button9.setContentAreaFilled(false);
        Button9.setBorderPainted(false);
        
        {if (Button1.getBackground () != Button9.getBackground());
       Button1.setContentAreaFilled(true);
        Button1.setBorderPainted(true);}
    }//GEN-LAST:event_Button9ActionPerformed

    private void Button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button10ActionPerformed
        // TODO add your handling code here: 
        Button10.setContentAreaFilled(false);
        Button10.setBorderPainted(false);
    }//GEN-LAST:event_Button10ActionPerformed

    private void Button11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button11ActionPerformed
        // TODO add your handling code here:
        Button11.setContentAreaFilled(false);
        Button11.setBorderPainted(false);
    }//GEN-LAST:event_Button11ActionPerformed

    private void Button12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button12ActionPerformed
        // TODO add your handling code here:
        Button12.setContentAreaFilled(false);
        Button12.setBorderPainted(false);
    }//GEN-LAST:event_Button12ActionPerformed

    private void Button13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button13ActionPerformed
        // TODO add your handling code here:
        Button13.setContentAreaFilled(false);
        Button13.setBorderPainted(false);
    }//GEN-LAST:event_Button13ActionPerformed

    private void Button14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button14ActionPerformed
        // TODO add your handling code here:
        Button14.setContentAreaFilled(false);
        Button14.setBorderPainted(false);
    }//GEN-LAST:event_Button14ActionPerformed

    private void Button15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button15ActionPerformed
        // TODO add your handling code here:
        Button15.setContentAreaFilled(false);
        Button15.setBorderPainted(false);
    }//GEN-LAST:event_Button15ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        // TODO add your handling code here:
        Button2.setContentAreaFilled(false);
        Button2.setBorderPainted(false);
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        // TODO add your handling code here:
        Button1.setContentAreaFilled(false);
        Button1.setBorderPainted(false);
        
        
         {if (Button1 != Button9);
       Button9.setContentAreaFilled(true);
        Button9.setBorderPainted(true);}
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button16ActionPerformed
        // TODO add your handling code here:
        Button16.setContentAreaFilled(false);
        Button16.setBorderPainted(false);
    }//GEN-LAST:event_Button16ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button10;
    private javax.swing.JButton Button11;
    private javax.swing.JButton Button12;
    private javax.swing.JButton Button13;
    private javax.swing.JButton Button14;
    private javax.swing.JButton Button15;
    private javax.swing.JButton Button16;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JPanel Kleurtjes1;
    private javax.swing.JPanel Kleurtjes10;
    private javax.swing.JPanel Kleurtjes11;
    private javax.swing.JPanel Kleurtjes12;
    private javax.swing.JPanel Kleurtjes13;
    private javax.swing.JPanel Kleurtjes14;
    private javax.swing.JPanel Kleurtjes15;
    private javax.swing.JPanel Kleurtjes16;
    private javax.swing.JPanel Kleurtjes2;
    private javax.swing.JPanel Kleurtjes3;
    private javax.swing.JPanel Kleurtjes4;
    private javax.swing.JPanel Kleurtjes5;
    private javax.swing.JPanel Kleurtjes6;
    private javax.swing.JPanel Kleurtjes7;
    private javax.swing.JPanel Kleurtjes8;
    private javax.swing.JPanel Kleurtjes9;
    // End of variables declaration//GEN-END:variables

    private void ShuffleArray1(Color[] colorArray1) {
        Random random = new Random();
        for (int i = colorArray1.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            //swap
            Color temp = colorArray1[index];
            colorArray1[index] = colorArray1[i];
            colorArray1[i] = temp;
        }
        /*
         for(int j = 0; j < colorArray1.length; j++){
         System.out.println(colorArray1[j]);
         }*/

    }

    private void ShuffleArray2(Color[] colorArray2) {
        Random random = new Random();
        for (int i = colorArray2.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            //swap
            Color temp = colorArray2[index];
            colorArray2[index] = colorArray2[i];
            colorArray2[i] = temp;
        }
        /*
         for(int j = 0; j < colorArray2.length; j++){
         System.out.println(colorArray2[j]);
         }*/
    }

    private void SetBackground(Color[] colorArray1, Color[] colorArray2) {

        Kleurtjes1.setBackground(colorArray1[0]);
        Kleurtjes2.setBackground(colorArray1[1]);
        Kleurtjes3.setBackground(colorArray1[2]);
        Kleurtjes4.setBackground(colorArray1[3]);
        Kleurtjes5.setBackground(colorArray1[4]);
        Kleurtjes6.setBackground(colorArray1[5]);
        Kleurtjes7.setBackground(colorArray1[6]);
        Kleurtjes8.setBackground(colorArray1[7]);

        Kleurtjes9.setBackground(colorArray2[0]);
        Kleurtjes10.setBackground(colorArray2[1]);
        Kleurtjes11.setBackground(colorArray2[2]);
        Kleurtjes12.setBackground(colorArray2[3]);
        Kleurtjes13.setBackground(colorArray2[4]);
        Kleurtjes14.setBackground(colorArray2[5]);
        Kleurtjes15.setBackground(colorArray2[6]);
        Kleurtjes16.setBackground(colorArray2[7]);

        {
            if (Kleurtjes1.getBackground() == Kleurtjes9.getBackground()) {
                System.out.println("Goed1!");

            } else {

                if (Kleurtjes1.getBackground() == Kleurtjes10.getBackground()) {
                    System.out.println("Goed2!");

                } else {

                    if (Kleurtjes1.getBackground() == Kleurtjes11.getBackground()) {
                        System.out.println("Goed3!");

                    }

                }

            }
        }
    }

    private void ShuffelArray(Color[] colorArray) {
        Random random = new Random();
        for (int i = colorArray.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            //swap
            Color temp = colorArray[index];
            colorArray[index] = colorArray[i];
            colorArray[i] = temp;
        }
    }

    private void CopyArray(Color[] colorArray, Color[][] twodArray, int arraygrootte) {
        int k = 0;
        for(int i = 0; i < arraygrootte; i++ ){
            for(int j = 0; j < arraygrootte; j++){
                twodArray[i][j] = colorArray[k];
                k++;
                
            }
        }
    }

    private void SetBackground(Color[][] twodArray) {
        Kleurtjes1.setBackground(twodArray[0][0]);
        Kleurtjes2.setBackground(twodArray[0][1]);
        Kleurtjes3.setBackground(twodArray[0][2]);
        Kleurtjes4.setBackground(twodArray[0][3]);
        Kleurtjes5.setBackground(twodArray[1][0]);
        Kleurtjes6.setBackground(twodArray[1][1]);
        Kleurtjes7.setBackground(twodArray[1][2]);
        Kleurtjes8.setBackground(twodArray[1][3]);

        Kleurtjes9.setBackground(twodArray[2][0]);
        Kleurtjes10.setBackground(twodArray[2][1]);
        Kleurtjes11.setBackground(twodArray[2][2]);
        Kleurtjes12.setBackground(twodArray[2][3]);
        Kleurtjes13.setBackground(twodArray[3][0]);
        Kleurtjes14.setBackground(twodArray[3][1]);
        Kleurtjes15.setBackground(twodArray[3][2]);
        Kleurtjes16.setBackground(twodArray[3][3]);
    }

  
}
