package pacote;


/**
 *
 * @author rafael
 */
import pacote.Prints;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
        Pais argentina = new Pais("Argentina", "Buenos Aires", " 2.791.810 km²");
        Pais bolivia = new Pais("Bolivia", "La Paz", " 1.098.580 km²");
        Pais brasil = new Pais("Brasil", "Brasilia", "8.515.767.049 km²");
        Pais chile = new Pais("Chile", "Santiago", "756.096 km²");
        Pais colombia = new Pais("Colômbia", "Bogotá", "1.141.750 km²");
        Pais equador = new Pais("Equador", "Quito", "256.370 km²");
        Pais guiana = new Pais("Guiana", "Georgetown", "214.970 km²");
        Pais paraguai = new Pais("Paraguai", "Assunção", "406.750 km²");
        Pais peru = new Pais("Peru", "Lima", "1.285.220 km²");
        Pais suriname = new Pais("Suriname", "Paramaribo", "163.820 km²");
        Pais uruguai = new Pais("Uruguai", "Montevidéu", "176.220 km²");
        Pais venezuela = new Pais("Venezuela", "Caracas", "912.050 km²");

        Pais[] fronteirasArgentina = {paraguai, bolivia, brasil, uruguai, chile, };
        Pais[] fronteirasBolivia = {argentina, chile, paraguai, brasil, peru};
        Pais[] fronteirasBrasil = {argentina, bolivia, colombia, guiana, paraguai, peru, suriname, uruguai, venezuela};
        Pais[] fronteirasChile = {argentina, bolivia, peru};
        Pais[] fronteirasColombia = {venezuela, brasil, equador, peru};
        Pais[] fronteirasEquador = {peru, colombia};
        Pais[] fronteirasGuiana = {venezuela, suriname, brasil};
        Pais[] fronteirasParaguai = {argentina, bolivia, brasil};
        Pais[] fronteirasPeru = {bolivia, brasil, chile, colombia, equador};
        Pais[] fronteirasSuriname = {brasil, guiana};
        Pais[] fronteirasUruguai = {brasil, argentina};
        Pais[] fronteirasVenezuela = {brasil, colombia, guiana};
        
        for (Pais i : fronteirasArgentina) {
                argentina.adicionarFronteira(i);
        }
        for (Pais i : fronteirasBolivia) {
                bolivia.adicionarFronteira(i);
        }
        for (Pais i : fronteirasBrasil) {
                brasil.adicionarFronteira(i);
        }
        for (Pais i : fronteirasChile) {
                chile.adicionarFronteira(i);
        }
        for (Pais i : fronteirasColombia) {
                colombia.adicionarFronteira(i);
        }
        for (Pais i : fronteirasEquador) {
                equador.adicionarFronteira(i);
        }
        for (Pais i : fronteirasGuiana) {
                guiana.adicionarFronteira(i);
        }
        for (Pais i : fronteirasParaguai) {
                paraguai.adicionarFronteira(i);
        }
        for (Pais i : fronteirasPeru) {
                peru.adicionarFronteira(i);
        }
        for (Pais i : fronteirasSuriname) {
                suriname.adicionarFronteira(i);
        }
        for (Pais i : fronteirasUruguai) {
                uruguai.adicionarFronteira(i);
        }
        for (Pais i : fronteirasVenezuela) {
                venezuela.adicionarFronteira(i);
        }
        
        paises.add(argentina);
        paises.add(bolivia);
        paises.add(brasil);
        paises.add(chile);
        paises.add(colombia);
        paises.add(equador);
        paises.add(guiana);
        paises.add(paraguai);
        paises.add(peru);
        paises.add(suriname);
        paises.add(uruguai);
        paises.add(venezuela);
        
        Prints.mostrarPaisesNaFronteira(paises.get(paises.indexOf(brasil)), paises.get(paises.indexOf(chile)));
        Prints.mostrarPaisesNaFronteira(paises.get(paises.indexOf(brasil)), paises.get(paises.indexOf(argentina)));

        Prints.mostrarSePaisesSaoIguais(paises.get(paises.indexOf(brasil)), paises.get(paises.indexOf(brasil)));
        Prints.mostrarSePaisesSaoIguais(paises.get(paises.indexOf(brasil)), paises.get(paises.indexOf(argentina)));
        Prints.mostrarSePaisesSaoIguais(paises.get(paises.indexOf(chile)), paises.get(paises.indexOf(uruguai)));
        Prints.mostrarSePaisesSaoIguais(paises.get(paises.indexOf(uruguai)), paises.get(paises.indexOf(uruguai)));

        Prints.mostrarTodasAsFronteiras(paises.get(paises.indexOf(suriname)));
        Prints.mostrarTodasAsFronteiras(paises.get(paises.indexOf(brasil)));
        Prints.mostrarTodasAsFronteiras(paises.get(paises.indexOf(venezuela)));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jDialog3 = new javax.swing.JDialog();
        jDialog4 = new javax.swing.JDialog();
        jDialog5 = new javax.swing.JDialog();
        jDialog6 = new javax.swing.JDialog();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jPopupMenu4 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        paisN1CB = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        paisN2CB = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnFronteirasEmComun = new javax.swing.JButton();
        btnVerTodasAsFronteiras = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCapital = new javax.swing.JTextField();
        btnCapital1 = new javax.swing.JToggleButton();
        btnCapital2 = new javax.swing.JToggleButton();
        lblCapital1 = new javax.swing.JLabel();
        lblCapital2 = new javax.swing.JLabel();
        btnAdicionarPais = new javax.swing.JButton();
        lblAvisoPais = new javax.swing.JLabel();
        adicionarFronteiraCB = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtFronteira = new javax.swing.JTextField();
        btnAdicionarPais1 = new javax.swing.JButton();
        lblAvisoFronteira = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

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

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog5Layout = new javax.swing.GroupLayout(jDialog5.getContentPane());
        jDialog5.getContentPane().setLayout(jDialog5Layout);
        jDialog5Layout.setHorizontalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog5Layout.setVerticalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog6Layout = new javax.swing.GroupLayout(jDialog6.getContentPane());
        jDialog6.getContentPane().setLayout(jDialog6Layout);
        jDialog6Layout.setHorizontalGroup(
            jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog6Layout.setVerticalGroup(
            jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Exercício sobre Países");
        jLabel1.setToolTipText("");

        paisN1CB.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        paisN1CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "< Selecione um país >", "Argentina", "Bolivia", "Brasil", "Chile", "Colômbia", "Equador", "Guiana", "Paraguai", "Peru", "Suriname", "Uruguai", "Venezuela" }));
        paisN1CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paisN1CBActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("País 1");
        jLabel2.setToolTipText("");

        paisN2CB.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        paisN2CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "< Selecione um país >", "Argentina", "Bolivia", "Brasil", "Chile", "Colômbia", "Equador", "Guiana", "Paraguai", "Peru", "Suriname", "Uruguai", "Venezuela" }));
        paisN2CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paisN2CBActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("País 2");
        jLabel3.setToolTipText("");

        btnFronteirasEmComun.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        btnFronteirasEmComun.setText("Ver quais fronteiras os países tem em comun");
        btnFronteirasEmComun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFronteirasEmComunActionPerformed(evt);
            }
        });

        btnVerTodasAsFronteiras.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        btnVerTodasAsFronteiras.setText("Listar todos os países nas fronteiras");
        btnVerTodasAsFronteiras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTodasAsFronteirasActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Adicionar País");

        txtNome.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        txtNome.setText("Nome");

        txtCapital.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        txtCapital.setText("Capital");

        btnCapital1.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        btnCapital1.setText("Ver capital");
        btnCapital1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapital1ActionPerformed(evt);
            }
        });

        btnCapital2.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        btnCapital2.setText("Ver capital");
        btnCapital2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapital2ActionPerformed(evt);
            }
        });

        lblCapital1.setText("Selecione um país primeiro");

        lblCapital2.setText("Selecione um país primeiro");

        btnAdicionarPais.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        btnAdicionarPais.setText("Adicionar");

        lblAvisoPais.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        adicionarFronteiraCB.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        adicionarFronteiraCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "< Selecione um país >", "Argentina", "Bolivia", "Brasil", "Chile", "Colômbia", "Equador", "Guiana", "Paraguai", "Peru", "Suriname", "Uruguai", "Venezuela" }));
        adicionarFronteiraCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarFronteiraCBActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Adicionar Fronteira");

        txtFronteira.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        txtFronteira.setText("País na Fronteira");

        btnAdicionarPais1.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        btnAdicionarPais1.setText("Adicionar");

        lblAvisoFronteira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(paisN1CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(paisN2CB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnCapital1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCapital2)
                                .addGap(17, 17, 17))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCapital1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCapital2))
                            .addComponent(btnFronteirasEmComun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVerTodasAsFronteiras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAvisoPais, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(122, 122, 122)
                                        .addComponent(txtCapital, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(102, 102, 102))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(adicionarFronteiraCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(txtFronteira, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(btnAdicionarPais))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addComponent(btnAdicionarPais1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(lblAvisoFronteira, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paisN1CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paisN2CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapital1)
                    .addComponent(btnCapital2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCapital1)
                    .addComponent(lblCapital2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFronteirasEmComun)
                .addGap(18, 18, 18)
                .addComponent(btnVerTodasAsFronteiras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCapital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdicionarPais)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAvisoPais, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionarFronteiraCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFronteira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdicionarPais1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAvisoFronteira, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void paisN1CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paisN1CBActionPerformed

    }//GEN-LAST:event_paisN1CBActionPerformed

    private void paisN2CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paisN2CBActionPerformed

    }//GEN-LAST:event_paisN2CBActionPerformed

    private void btnVerTodasAsFronteirasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTodasAsFronteirasActionPerformed

    }//GEN-LAST:event_btnVerTodasAsFronteirasActionPerformed

    private void adicionarFronteiraCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarFronteiraCBActionPerformed

    }//GEN-LAST:event_adicionarFronteiraCBActionPerformed

    private void btnCapital1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapital1ActionPerformed
        String item = paisN1CB.getSelectedItem().toString();
        if (!item.equals("< Selecione um país >")){
            lblCapital1.setForeground(new java.awt.Color(0, 0, 0));
            String capital;
            String itemSelecionado =paisN1CB.getSelectedItem().toString();
            for (Pais paisSelecionado : paises){
                if (paisSelecionado.getNome().equals(itemSelecionado)){
                    int indexPais = paises.indexOf(paisSelecionado);
                    capital = paises.get(indexPais).getCapital();
                    lblCapital1.setText("A Capital da(o) " + paisSelecionado.getNome() + " é " + capital);
                    break;
                }
            }
        } 
        else {
            lblCapital1.setForeground(new java.awt.Color(255, 0, 0));
            lblCapital1.setText("Escolha um país!");
        }
    }//GEN-LAST:event_btnCapital1ActionPerformed

    private void btnCapital2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapital2ActionPerformed
        String item = paisN2CB.getSelectedItem().toString();
        if (!item.equals("< Selecione um país >")){
            lblCapital2.setForeground(new java.awt.Color(0, 0, 0));
            String capital;
            String itemSelecionado =paisN2CB.getSelectedItem().toString();
            for (Pais paisSelecionado : paises){
                if (paisSelecionado.getNome().equals(itemSelecionado)){
                    int indexPais = paises.indexOf(paisSelecionado);
                    capital = paises.get(indexPais).getCapital();
                    lblCapital2.setText("A Capital da(o) " + paisSelecionado.getNome() + " é " + capital);
                    break;
                }
            }
        } 
        else {
            lblCapital2.setForeground(new java.awt.Color(255, 0, 0));
            lblCapital2.setText("Escolha um país!");
        }
    }//GEN-LAST:event_btnCapital2ActionPerformed

    private void btnFronteirasEmComunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFronteirasEmComunActionPerformed
        ArrayList<String> fronteiras;
        String item1 = paisN1CB.getSelectedItem().toString();
        String item2 = paisN2CB.getSelectedItem().toString();
        String itemSelecionado1 =paisN1CB.getSelectedItem().toString();
        String itemSelecionado2 =paisN2CB.getSelectedItem().toString();
        Pais pais1 = null;
        Pais pais2 = null;
        if (!item1.equals("< Selecione um país >")){
            if (!item1.equals("< Selecione um país >")){
                for (Pais paisSelecionado : paises){
                    if (paisSelecionado.getNome().equals(itemSelecionado1)){
                        int indexPais = paises.indexOf(paisSelecionado);
                        pais1 = paises.get(indexPais);
                        break;
                    }
                }
                for (Pais paisSelecionado : paises){
                    if (paisSelecionado.getNome().equals(itemSelecionado2)){
                        int indexPais = paises.indexOf(paisSelecionado);
                        pais2 = paises.get(indexPais);
                        break;
                    }
                }
                fronteiras = new ArrayList<String>();
                for (Pais a : pais1.paisesNaFronteiras(pais2)){
                    fronteiras.add(a.getNome());
                }
                if(!pais1.equals(pais2)){
                    JOptionPane.showMessageDialog(null, "Os países que fazem fronteira com " + pais1.getNome() +" e " + pais2.getNome() + " são:" + "\n" + fronteiras);
                    Prints.mostrarPaisesNaFronteira(pais1, pais2);
                }
            }
        }
    }//GEN-LAST:event_btnFronteirasEmComunActionPerformed
    private ArrayList<Pais> paises = new ArrayList<Pais>();
    
    public static void main(String args[]) {   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> adicionarFronteiraCB;
    private javax.swing.JButton btnAdicionarPais;
    private javax.swing.JButton btnAdicionarPais1;
    private javax.swing.JToggleButton btnCapital1;
    private javax.swing.JToggleButton btnCapital2;
    private javax.swing.JButton btnFronteirasEmComun;
    private javax.swing.JButton btnVerTodasAsFronteiras;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JDialog jDialog5;
    private javax.swing.JDialog jDialog6;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JPopupMenu jPopupMenu4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAvisoFronteira;
    private javax.swing.JLabel lblAvisoPais;
    private javax.swing.JLabel lblCapital1;
    private javax.swing.JLabel lblCapital2;
    private javax.swing.JComboBox<String> paisN1CB;
    private javax.swing.JComboBox<String> paisN2CB;
    private javax.swing.JTextField txtCapital;
    private javax.swing.JTextField txtFronteira;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
