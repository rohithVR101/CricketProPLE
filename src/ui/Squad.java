package ui;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rohith Adithya
 */
public class Squad extends javax.swing.JFrame {
    int Team;
    String TName;

    /**
     * Creates new form Squad
     * @param team
     */
    public Squad(int team) {
        initComponents();
        this.Team=team;
        try{
            DefaultTableModel model=(DefaultTableModel)T1.getModel();
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket","root","plmqaz123");  
            Statement stmt = conn.createStatement();
            String q1="select Name from Teams where TeamID="+Team+";";
            ResultSet rs1=stmt.executeQuery(q1);
            while(rs1.next()){
                this.TName=rs1.getString(1);
                Tname.setText("- " + TName + " -");
            }
            String q2="select * from Players where TeamID="+Team+";";
            ResultSet rs2=stmt.executeQuery(q2);
            while(rs2.next()){
                String Nam=rs2.getString(2);
                model.addRow(new Object[]{Nam});
            }
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    public Squad() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        T1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Tname = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        info = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        T1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 255)));
        T1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Player Name"
            }
        ));
        T1.setRowSelectionAllowed(false);
        jScrollPane2.setViewportView(T1);

        jButton1.setText("LOG OUT ><");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("INSERT NEW PLAYER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Tname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Tname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton4.setText("<- CHOOSE ANOTHER TEAM");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        info.setColumns(20);
        info.setRows(5);
        info.setText("--- PLAYER INFO ---");
        jScrollPane1.setViewportView(info);

        jButton2.setText("GET PLAYER INFO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("MANAGE SQUAD");

        jButton5.setText("DELETE SELECTED PLAYER");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("TRANSFER SELECTED PLAYER");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6))
                            .addComponent(jScrollPane2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addComponent(Tname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(Tname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new NewPlayer(Team).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        DefaultTableModel model=(DefaultTableModel)T1.getModel();
        if(!(T1.getSelectedRowCount()==0)){
                try{
                    Class.forName("java.sql.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket","root","plmqaz123"); 
                    Statement stmt = conn.createStatement();
                    String q1="DELETE FROM Players WHERE Name='"+T1.getValueAt(T1.getSelectedRow(), 0)+"';";
                    stmt.executeUpdate(q1);
                    JOptionPane.showMessageDialog(this, "Player '" + T1.getValueAt(T1.getSelectedRow(), 0)+"' deleted successfully!");
                    model.setRowCount(0);
                    String q2="select Name from Players where TeamID="+Team+";";
                    ResultSet rs2=stmt.executeQuery(q2);
                    while(rs2.next()){
                        String Nam=rs2.getString(1);
                        model.addRow(new Object[]{Nam});
                    }
                }
                catch(ClassNotFoundException | SQLException e){
                    JOptionPane.showMessageDialog(null,e.getMessage());
                } 
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int tid=0;
        DefaultTableModel model=(DefaultTableModel)T1.getModel();
        if(!(T1.getSelectedRowCount()==0)){
                try{
                    String sel=(String)T1.getValueAt(T1.getSelectedRow(),0);
                    String[] choicesini = {"Chennai Super Kings", "Mumbai Indians", "Kings XI Punjab", "Delhi Capitals", "Kolkata Knight Riders", "Rajasthan Royals","Royal Challengers Bangalore","Sunrisers Hyderabad"};
                    String replaced = String.join(",",choicesini).replaceAll(TName, "Click to choose");
                    String[] choices=replaced.split(",");
                    String input = (String) JOptionPane.showInputDialog(null, "Choose team to be transfered to:","Transfer player '"+sel+"'", JOptionPane.QUESTION_MESSAGE, null,choices,choices[Team-1]);
                    if(!(input.equals("Click to choose")))
                    {
                        Class.forName("java.sql.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket","root","plmqaz123");   
                        Statement stmt = conn.createStatement();
                        String q1="select TeamID from Teams where Name='"+input+"';";
                        ResultSet rs1=stmt.executeQuery(q1);
                        while(rs1.next()){
                            tid=rs1.getInt(1);
                        }
                        String q2="UPDATE Players SET TeamID= "+tid+" WHERE Name='"+sel+"';";
                        stmt.executeUpdate(q2);
                        JOptionPane.showMessageDialog(this, "Player '" +sel+"' transfered successfully to "+input+"!");
                        model.setRowCount(0);
                        String q3="select Name from Players where TeamID="+Team+";";
                        ResultSet rs2=stmt.executeQuery(q3);
                        while(rs2.next()){
                            String Nam=rs2.getString(1);
                            model.addRow(new Object[]{Nam});
                        }  
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Player already present in the same team.");
                    }
                }
                catch(ClassNotFoundException | SQLException e){
                    JOptionPane.showMessageDialog(null,e.getMessage());
                } 
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        info.setText("--- PLAYER INFO ---");
        if(!(T1.getSelectedRowCount()==0)){
            try{
                String sel=(String)T1.getValueAt(T1.getSelectedRow(),0);
                Class.forName("java.sql.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket","root","plmqaz123"); 
                Statement stmt = conn.createStatement();
                String q="select * from Players WHERE Name='"+sel+"';";
                ResultSet rs=stmt.executeQuery(q);
                while(rs.next()){
                    String cpt="\n";
                    if("Y".equals(rs.getString(7)))
                    {
                        cpt=" (Captain)\n";
                    }
                    info.append("\n\n"+(rs.getString(2)).toUpperCase()+cpt+rs.getString(6)+"\n"+rs.getString(4)+"\n"+rs.getString(5)+"\n");
                }   
            }
            catch(ClassNotFoundException | SQLException e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Squad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Squad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Squad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Squad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Squad().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable T1;
    private javax.swing.JLabel Tname;
    private javax.swing.JTextArea info;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
