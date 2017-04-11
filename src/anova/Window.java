/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anova;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import jdistlib.*;


/**
 *
 * @author Bojan
 */
public class Window extends javax.swing.JFrame {

    /**
     * Creates new form Window
     */
    public Window() {
        initComponents();
        
        
        /**
         * Table model listener
         */
        jTable1.getModel().addTableModelListener(new TableModelListener(){

            @Override
            public void tableChanged(TableModelEvent e) {
                Window.this.tableChanged(e);
            }
            
        });
        
        
       /**
        * Spinner value changed
        */ 
       jSpinner1.getModel().addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                Window.this.jSpinner1ValueChanged(e);
            }
        });
       
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        ssa = new javax.swing.JLabel();
        sse = new javax.swing.JLabel();
        sst = new javax.swing.JLabel();
        ssavrijednost = new javax.swing.JLabel();
        ssevrijednost = new javax.swing.JLabel();
        sstvrijednost = new javax.swing.JLabel();
        izracunatof = new javax.swing.JLabel();
        tabelarnof = new javax.swing.JLabel();
        fvrijednost = new javax.swing.JLabel();
        tabelarnofvrijednost = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        k1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kn11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        kn1vrijednost = new javax.swing.JLabel();
        ssakvadrat = new javax.swing.JLabel();
        ssakvadratvrijednost = new javax.swing.JLabel();
        ssekvadrat = new javax.swing.JLabel();
        ssekvadratvrijednost = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSpinner1.setValue(0);

        jLabel1.setText("k=");

        jTextField1.setText("0.10");

        jLabel2.setText("Alfa");

        jButton1.setText("Racunaj");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
            @Override
            public void addColumn(Object columnName, Object[] data) {
                Class[] temp = new Class[types.length +1];
                System.arraycopy(types, 0, temp, 0, types.length);
                temp[types.length] = Double.class;
                types = temp;
                super.addColumn(columnName,data);
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
        jTable1.setTableHeader(null);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        ssa.setText("SSA =");

        sse.setText("SSE =");

        sst.setText("SST =");

        ssavrijednost.setText("0.0");

        ssevrijednost.setText("0.0");

        sstvrijednost.setText("0.0");

        izracunatof.setText("F =");

        tabelarnof.setText("Tabelarno F =");

        fvrijednost.setText("0.0");

        tabelarnofvrijednost.setText("0.0");

        jLabel3.setText("k-1 =");

        k1.setText("0.0");

        jLabel5.setText("k*(n-1)=");

        kn11.setText("0.0");

        jLabel7.setText("k*n-1 =");

        kn1vrijednost.setText("0.0");

        ssakvadrat.setText("ssa^2 =");

        ssakvadratvrijednost.setText("0.0");

        ssekvadrat.setText("sse^2 =");

        ssekvadratvrijednost.setText("jLabel12");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ssa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ssavrijednost))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ssevrijednost))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sstvrijednost))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ssakvadrat)
                            .addComponent(ssekvadrat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ssekvadratvrijednost)
                            .addComponent(ssakvadratvrijednost))))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(kn1vrijednost))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kn11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(izracunatof)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fvrijednost))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(k1))
                            .addComponent(tabelarnof))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tabelarnofvrijednost)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ssa)
                    .addComponent(ssavrijednost)
                    .addComponent(izracunatof)
                    .addComponent(fvrijednost))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sse)
                    .addComponent(ssevrijednost)
                    .addComponent(tabelarnof)
                    .addComponent(tabelarnofvrijednost))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sst)
                    .addComponent(sstvrijednost)
                    .addComponent(jLabel3)
                    .addComponent(k1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kn11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(ssakvadrat)
                        .addComponent(ssakvadratvrijednost)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(kn1vrijednost)
                    .addComponent(ssekvadrat)
                    .addComponent(ssekvadratvrijednost))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anova_logo.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(309, 309, 309)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int n = 0;
       int k = (Integer)jSpinner1.getValue();
       boolean stop = false;
       for( ; n < jTable1.getRowCount(); n++){
            for(int ii = 0; ii < k; ii++){
                if(jTable1.getModel().getValueAt(n, ii) == null){
                    stop = true;
                    break;
                }
            }
            if(stop){
                break;
            }
       }
        
        double averageCol[] = new double[k];
        double totalAverage = 0.0;
       for( int j = 0;j < averageCol.length;j++){
           for(int i= 0; i < n;i++){
               averageCol[j] += (Double)jTable1.getModel().getValueAt(i, j);
           }
           totalAverage += averageCol[j];
           averageCol[j] /= n;
       }
       totalAverage /= k*n;
       
       double alfe[] = new double[k];
       for(int j = 0; j < k; j++){
           alfe[j] = averageCol[j] - totalAverage;
       }
       
       double ssa = 0.0;
       
       for(int j = 0; j < k; j++){
           ssa += (averageCol[j] -  totalAverage) * (averageCol[j] - totalAverage );
       }
       ssa *= n;
       
       double sse = 0.0;
       for(int j = 0; j < k; j++){
           for( int i = 0; i < n; i++){
               sse += ((Double)jTable1.getModel().getValueAt(i, j) - averageCol[j]) * ((Double)jTable1.getModel().getValueAt(i, j) - averageCol[j]);
           }
       }
       
       double sst = ssa + sse;
       
       int dfnum = k -1;
       int dfdenum = k*(n -1);
       int dfsst = k*n - 1;
       
       double sa2 = ssa / dfnum;
       double se2 = sse / dfdenum;
       
       double calF = sa2/ se2;
       double alfa = Double.parseDouble(jTextField1.getText());
       double tabF = F.quantile(alfa, dfnum, dfdenum, false,false);//ftables.getF(txtAlfa.getSelectedIndex(), dfnum, dfdenum);

       
       ssavrijednost.setText(ssa+"");
       ssevrijednost.setText(sse+"");
       sstvrijednost.setText(sst + "");
       
       fvrijednost.setText(calF + "");
       tabelarnofvrijednost.setText(tabF + "");
       
       k1.setText(dfnum + "");
       kn11.setText(dfdenum+"");
       kn1vrijednost.setText(dfsst + "");
       
       ssekvadratvrijednost.setText(se2+"");
       ssakvadratvrijednost.setText(sa2 + "");
       
        double sc = Math.sqrt(2*se2/(k*n));
        double t =  T.quantile(alfa/2 , dfdenum , false, false);
        double tsc = t*sc;
        Kontrasti kontrasti = new Kontrasti(t,sc);
        for(int q = 0; q < k-1; q++){
            for(int p = q+1; p < k; p++){
                double c = alfe[q] - alfe[p];
                double c1 = c - tsc;
                double c2 = c + tsc;
                kontrasti.addRow(q+1, p+1, c1, c2);    
           }  
       }
       
       kontrasti.setVisible(true);
       
       
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    
    private void jSpinner1ValueChanged(java.awt.event.ActionEvent evt){
        
    }
        void tableChanged(TableModelEvent e) {
        if(e.getType() == TableModelEvent.UPDATE){
            if(e.getFirstRow() == e.getLastRow() && e.getLastRow() == jTable1.getRowCount()-1){
              ((DefaultTableModel)jTable1.getModel()).addRow(new Double[(Integer)this.jSpinner1.getValue()]);
            }
        }
    }
    void jSpinner1ValueChanged(ChangeEvent e){
        int k = (int)jSpinner1.getValue();
        if(k == jTable1.getColumnCount()){
            return;
        }
        
        
      TableColumnModel tcm =  jTable1.getColumnModel();
      if(k < jTable1.getColumnCount()){
          ((DefaultTableModel) jTable1.getModel()).setColumnCount(k);
      }else{

          Object[] data = new Integer[jTable1.getRowCount()];
           ((DefaultTableModel) jTable1.getModel()).addColumn("", data);
          
      }
      
  }
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
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fvrijednost;
    private javax.swing.JLabel izracunatof;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel k1;
    private javax.swing.JLabel kn11;
    private javax.swing.JLabel kn1vrijednost;
    private javax.swing.JLabel ssa;
    private javax.swing.JLabel ssakvadrat;
    private javax.swing.JLabel ssakvadratvrijednost;
    private javax.swing.JLabel ssavrijednost;
    private javax.swing.JLabel sse;
    private javax.swing.JLabel ssekvadrat;
    private javax.swing.JLabel ssekvadratvrijednost;
    private javax.swing.JLabel ssevrijednost;
    private javax.swing.JLabel sst;
    private javax.swing.JLabel sstvrijednost;
    private javax.swing.JLabel tabelarnof;
    private javax.swing.JLabel tabelarnofvrijednost;
    // End of variables declaration//GEN-END:variables
}
