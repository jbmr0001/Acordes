/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acordes;

import java.awt.Color;
import java.awt.event.ActionListener;

/**
 *
 * @author Juan
 */
public class ventana extends javax.swing.JFrame {
    boolean pulsado=false;
    public ventana() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        mayor = new javax.swing.JButton();
        menor = new javax.swing.JButton();
        resultado = new javax.swing.JTextField();
        resultado2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        septima = new javax.swing.JCheckBox();
        notacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        piano = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        piano1 = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTable13 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setText("  SELECCIONE TÓNICA");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DO", "DO#/REb", "RE", "RE#/MIb", "MI", "FA", "FA#/SOLb", "SOL", "SOL#/LAb", "LA", "LA#/SIb", "SI" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        mayor.setText("Acorde Mayor");
        mayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mayorActionPerformed(evt);
            }
        });

        menor.setText("Acorde Menor");
        menor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menorActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, "", null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Al aire", "Traste 1", "Traste 2", "Traste 3", "Traste 4", "Traste 5", "Traste 6", "Traste 7", "Traste 8", "Traste 9", "Traste 10", "Traste 11", "Traste 12", "Traste 13", "Traste 14", "Traste 15"
            }
        ));
        tabla.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tablaInputMethodTextChanged(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Cuerda 1"},
                {"Cuerda 2"},
                {"Cuerda 3"},
                {"Cuerda 4"},
                {"Cuerda 5"},
                {"Cuerda 6"}
            },
            new String [] {
                "Cuerdas"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jLabel4.setText("Las notas del acorde son:");

        jLabel5.setText("     Las notas del acorde son:");

        septima.setText("Séptima");
        septima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                septimaActionPerformed(evt);
            }
        });

        notacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notacionActionPerformed(evt);
            }
        });

        jLabel3.setText("Notación");

        piano.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "DO", "RE", "MI", "FA", "SOL", "LA", "SI"
            }
        ));
        jScrollPane4.setViewportView(piano);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "#/b"
            }
        ));
        jScrollPane5.setViewportView(jTable4);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "#/b"
            }
        ));
        jScrollPane6.setViewportView(jTable5);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "#/b"
            }
        ));
        jScrollPane7.setViewportView(jTable6);

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "#/b"
            }
        ));
        jScrollPane8.setViewportView(jTable7);

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "#/b"
            }
        ));
        jScrollPane9.setViewportView(jTable8);

        piano1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "DO", "RE", "MI", "FA", "SOL", "LA", "SI"
            }
        ));
        jScrollPane10.setViewportView(piano1);

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "#/b"
            }
        ));
        jScrollPane11.setViewportView(jTable9);

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "#/b"
            }
        ));
        jScrollPane12.setViewportView(jTable10);

        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "#/b"
            }
        ));
        jScrollPane13.setViewportView(jTable11);

        jTable12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "#/b"
            }
        ));
        jScrollPane14.setViewportView(jTable12);

        jTable13.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "#/b"
            }
        ));
        jScrollPane15.setViewportView(jTable13);

        jLabel6.setText("NOTAS DEL ACORDE POR TODO EL MÁSTIL:");

        jLabel7.setText("NOTAS EN PIANO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(mayor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(resultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(menor, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(236, 236, 236))))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(424, 424, 424)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(septima))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(415, 415, 415)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(notacion, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(438, 438, 438))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(173, 173, 173))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(381, 381, 381)
                    .addComponent(jLabel6)
                    .addContainerGap(394, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(septima))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menor)
                    .addComponent(mayor))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(38, 38, 38)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(232, 232, 232)
                    .addComponent(jLabel6)
                    .addContainerGap(359, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void mayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mayorActionPerformed
        String selec;
        selec=jComboBox1.getSelectedItem().toString();
        pulsado=false;
        String [] notas={"DO","DO#/REb","RE","RE#/MIb","MI","FA","FA#/SOLb",
            "SOL","SOL#/LAb","LA","LA#/SIb","SI","DO","DO#/REb","RE","RE#/MIb","MI","FA","FA#/SOLb",
            "SOL","SOL#/LAb","LA","LA#/SIb","SI"};
         String []cuerdaMI={"MI","FA","FA#/SOLb","SOL","SOL#/LAb","LA",
          "LA#/SIb","SI","DO","DO#/REb","RE","RE#/MIb","MI","FA","FA#/SOLb",
            "SOL"};
        String []cuerdaSI={"SI","DO","DO#/REb","RE","RE#/REb","MI","FA","FA#/SOLb",
            "SOL","SOL#/LAb","LA","LA#/SIb","SI","DO","DO#/REb","RE" };
        String []cuerdaSOL={"SOL","SOL#/LAb","LA","LA#/SIb","SI","DO",
              "DO#/REb","RE","RE#/MIb","MI","FA","FA#/SOLb",
            "SOL","SOL#/LAb"};
        String []cuerdaRE={"RE","RE#/MIb","MI","FA","FA#/SOLb",
            "SOL","SOL#/LAb","LA","LA#/SIb","SI","DO","DO#/REb","RE","RE#/MIb","MI","FA"};
        String []cuerdaLA={"LA","LA#/SIb","SI","DO","DO#/REb","RE","RE#/MIb","MI","FA","FA#/SOLb",
            "SOL","SOL#/LAb","LA","LA#/SIb","SI","DO"};
        String acord[]=new String[4];
        for(int i=0;i<notas.length;i++){
            if(acord[0]!=null&&acord[1]!=null&&acord[2]!=null){
                break;
            }
            if(notas[i]==selec){
                acord[0]=selec;
                acord[1]=notas[i+4];
                acord[2]=notas[i+7];
                if(septima.isSelected()){
                    acord[3]=notas[i+10];
                }
            }
        } 
        String texto;
        texto=acord[0]+" -- "+acord[1]+" -- "+acord[2];
       
        if(septima.isSelected()){
            texto=texto+" -- "+acord[3];
        }
        resultado.setText(texto);
        rellenaNotacion();
        borraTabla();
        borraPiano();
           muestraNotas(cuerdaMI,acord,0);
           muestraNotas(cuerdaSI,acord,1);
           muestraNotas(cuerdaSOL,acord,2);
           muestraNotas(cuerdaRE,acord,3);
           muestraNotas(cuerdaLA,acord,4);
           muestraNotas(cuerdaMI,acord,5);
           muestraNotasPiano(acord);
         
    }//GEN-LAST:event_mayorActionPerformed

    private void menorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menorActionPerformed
        String selec;
        selec=jComboBox1.getSelectedItem().toString();
        pulsado=true;
        String [] notas={"DO","DO#/REb","RE","RE#/MIb","MI","FA","FA#/SOLb",
            "SOL","SOL#/LAb","LA","LA#/SIb","SI","DO","DO#/REb","RE","RE#/MIb","MI","FA","FA#/SOLb",
            "SOL","SOL#/LAb","LA","LA#/SIb","SI"};
         String []cuerdaMI={"MI","FA","FA#/SOLb","SOL","SOL#/LAb","LA",
          "LA#/SIb","SI","DO","DO#/REb","RE","RE#/MIb","MI","FA","FA#/SOLb",
            "SOL"};
        String []cuerdaSI={"SI","DO","DO#/REb","RE","RE#/REb","MI","FA","FA#/SOLb",
            "SOL","SOL#/LAb","LA","LA#/SIb","SI","DO","DO#/REb","RE" };
        String []cuerdaSOL={"SOL","SOL#/LAb","LA","LA#/SIb","SI","DO",
              "DO#/REb ","RE","RE#/MIb","MI","FA","FA#/SOLb",
            "SOL","SOL#/LAb"};
        String []cuerdaRE={"RE","RE#/MIb","MI","FA","FA#/SOLb",
            "SOL","SOL#/LAb","LA","LA#/SIb","SI","DO","DO#/REb","RE","RE#/MIb","MI","FA"};
        String []cuerdaLA={"LA","LA#/SIb","SI","DO","DO#/REb","RE","RE#/MIb","MI","FA","FA#/SOLb",
            "SOL","SOL#/LAb","LA","LA#/SIb","SI","DO"};
        String acord[]=new String[4];
        for(int i=0;i<notas.length;i++){
            if(acord[0]!=null&&acord[1]!=null&&acord[2]!=null){
                break;
            }
            if(notas[i]==selec){
                acord[0]=selec;
                acord[1]=notas[i+3];
                acord[2]=notas[i+7];
                   if(septima.isSelected()){
                    acord[3]=notas[i+10];
                }
            }
        } 
        String texto;
        texto=acord[0]+" -- "+acord[1]+" -- "+acord[2];
       
        if(septima.isSelected()){
            texto=texto+" -- "+acord[3];
        }
        resultado2.setText(texto);
        rellenaNotacion();
         borraTabla();
         borraPiano();
           muestraNotas(cuerdaMI,acord,0);
           muestraNotas(cuerdaSI,acord,1);
           muestraNotas(cuerdaSOL,acord,2);
           muestraNotas(cuerdaRE,acord,3);
           muestraNotas(cuerdaLA,acord,4);
           muestraNotas(cuerdaMI,acord,5);
           muestraNotasPiano(acord);
     
         
    }//GEN-LAST:event_menorActionPerformed
public  void muestraNotas(String notas[],String acorde[],int cuerda){
  
  
  
         for(int i=0;i<notas.length;i++){
                for(int j=0;j<acorde.length;j++){
                    
                    if(acorde[j]==notas[i]){
                        tabla.setValueAt(acorde[j],cuerda,i);
                       tabla.setDefaultRenderer (Object.class, new MyCellRenderer());
                     
                }
                
            }
         }
    }
    public void muestraNotasPiano(String acorde[]){
        String [] notas={"DO","RE","MI","FA",
            "SOL","LA","SI"};
        for(int i=0;i<7;i++){
            for(int j=0;j<4;j++){
                if(acorde[j]==notas[i]){
                    piano.setValueAt(acorde[j],0,i);
                    piano1.setValueAt(acorde[j],0,i);
                       piano.setDefaultRenderer (Object.class, new MyCellRenderer());
                       piano1.setDefaultRenderer(Object.class, new MyCellRenderer());
                }
                if(acorde[j]=="DO#/REb"){
                     jTable5.setValueAt(acorde[j],0,0);
                     jTable5.setDefaultRenderer (Object.class, new MyCellRenderer());
                       
                     jTable10.setValueAt(acorde[j],0,0);
                     jTable10.setDefaultRenderer (Object.class, new MyCellRenderer());
                }else if(acorde[j]=="RE#/MIb"){
                     jTable4.setValueAt(acorde[j],0,0);
                       jTable4.setDefaultRenderer (Object.class, new MyCellRenderer());
                       jTable11.setValueAt(acorde[j],0,0);
                     jTable11.setDefaultRenderer (Object.class, new MyCellRenderer());
                }else if(acorde[j]=="FA#/SOLb"){
                     jTable8.setValueAt(acorde[j],0,0);
                       jTable8.setDefaultRenderer (Object.class, new MyCellRenderer());
                       jTable12.setValueAt(acorde[j],0,0);
                     jTable12.setDefaultRenderer (Object.class, new MyCellRenderer());
                }
                else if(acorde[j]=="SOL#/LAb"){
                     jTable6.setValueAt(acorde[j],0,0);
                       jTable6.setDefaultRenderer (Object.class, new MyCellRenderer());
                       jTable13.setValueAt(acorde[j],0,0);
                     jTable13.setDefaultRenderer (Object.class, new MyCellRenderer());
                }
                else if(acorde[j]=="LA#/SIb"){
                     jTable7.setValueAt(acorde[j],0,0);
                       jTable7.setDefaultRenderer (Object.class, new MyCellRenderer());
                       jTable9.setValueAt(acorde[j],0,0);
                     jTable9.setDefaultRenderer (Object.class, new MyCellRenderer());
                }
                
            }
        }
    }
   
  public void rellenaNotacion(){
      String selec;
      String textoNotacion="";
        selec=jComboBox1.getSelectedItem().toString();
        if(selec=="DO"){
            textoNotacion="C";
        }else if(selec=="RE"){
            textoNotacion="D";
        }else if(selec=="MI"){
            textoNotacion="E";
        }else if(selec=="FA"){
            textoNotacion="F";
        }else if(selec=="SOL"){
            textoNotacion="G";
        }else if(selec=="LA"){
            textoNotacion="A";
        }else if(selec=="SI"){
            textoNotacion="B";
         }else if(selec=="DO#/REb"){
            textoNotacion="C#|Db";
        }else if(selec=="RE#/MIb"){
            textoNotacion="D#|Eb";
        }else if(selec=="FA#/SOLb"){
            textoNotacion="F#|Gb";
        
        }else if(selec=="SOL#/LAb"){
            textoNotacion="G#|Ab";
        }else if(selec=="LA#/SIb"){
            textoNotacion="A#|Bb";
        }
      
        if(pulsado==true){
            textoNotacion=textoNotacion+"m";
        }
       if(septima.isSelected()){
           textoNotacion=textoNotacion+"7";
       }
       notacion.setText(textoNotacion);
        
  } 
public void borraTabla(){
    for(int i=0;i<6;i++){
        for(int j=0;j<16;j++){
            tabla.setValueAt(" ",i,j);
           
        }
    }
}
public void borraPiano(){
    for(int i=0;i<7;i++){
       
           piano.setValueAt(" ",0,i);
           piano1.setValueAt(" ",0,i);
          
    }
     jTable4.setValueAt(" ",0,0);
      jTable5.setValueAt(" ",0,0); 
      jTable6.setValueAt(" ",0,0);
     jTable7.setValueAt(" ",0,0);
     jTable8.setValueAt(" ",0,0);
     jTable9.setValueAt(" ",0,0);
      jTable11.setValueAt(" ",0,0); 
      jTable12.setValueAt(" ",0,0);
     jTable13.setValueAt(" ",0,0);
     jTable10.setValueAt(" ",0,0);
      
    }
    private void tablaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tablaInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaInputMethodTextChanged

    private void septimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_septimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_septimaActionPerformed

    private void notacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notacionActionPerformed
     
    }//GEN-LAST:event_notacionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable12;
    private javax.swing.JTable jTable13;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JButton mayor;
    private javax.swing.JButton menor;
    private javax.swing.JTextField notacion;
    private javax.swing.JTable piano;
    private javax.swing.JTable piano1;
    private javax.swing.JTextField resultado;
    private javax.swing.JTextField resultado2;
    private javax.swing.JCheckBox septima;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
