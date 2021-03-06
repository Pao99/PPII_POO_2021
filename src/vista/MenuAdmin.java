/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author loboq
 */
public class MenuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form MenuAdmin
     */
    public MenuAdmin() {
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

        jLabel2 = new javax.swing.JLabel();
        btnCentroMedico = new javax.swing.JButton();
        btnRegistrarDoctor = new javax.swing.JButton();
        btnRegistrarEnfermero = new javax.swing.JButton();
        btnRegistrarPaciente = new javax.swing.JButton();
        btnRegistrarSecretario = new javax.swing.JButton();
        btnRegistrarAreas = new javax.swing.JButton();
        btntTpoCentro = new javax.swing.JButton();
        btnRegistrarVacunas = new javax.swing.JButton();
        btnRegistrarDiagnosticos = new javax.swing.JButton();
        btnRegistrarTratamientos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jLabel2.setText("Menú Administrador");

        btnCentroMedico.setBackground(new java.awt.Color(153, 204, 255));
        btnCentroMedico.setText("Registrar Centro Médico");

        btnRegistrarDoctor.setBackground(new java.awt.Color(153, 204, 255));
        btnRegistrarDoctor.setText("Registrar Doctor(a)");

        btnRegistrarEnfermero.setBackground(new java.awt.Color(153, 204, 255));
        btnRegistrarEnfermero.setText("Registrar Enfermero(a)");

        btnRegistrarPaciente.setBackground(new java.awt.Color(153, 204, 255));
        btnRegistrarPaciente.setText("Registrar Paciente");

        btnRegistrarSecretario.setBackground(new java.awt.Color(153, 204, 255));
        btnRegistrarSecretario.setText("Registrar Secretario(a)");

        btnRegistrarAreas.setBackground(new java.awt.Color(153, 204, 255));
        btnRegistrarAreas.setText("Registrar Áreas Laborales");

        btntTpoCentro.setBackground(new java.awt.Color(153, 204, 255));
        btntTpoCentro.setText("Registrar Tipos de Centros");

        btnRegistrarVacunas.setBackground(new java.awt.Color(153, 204, 255));
        btnRegistrarVacunas.setText("Registrar Vacunas");

        btnRegistrarDiagnosticos.setBackground(new java.awt.Color(153, 204, 255));
        btnRegistrarDiagnosticos.setText("Registrar Diagnósticos");

        btnRegistrarTratamientos.setBackground(new java.awt.Color(153, 204, 255));
        btnRegistrarTratamientos.setText("Registrar Tratamientos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistrarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCentroMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btntTpoCentro)
                    .addComponent(btnRegistrarDiagnosticos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(btnRegistrarSecretario, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnRegistrarEnfermero, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrarVacunas, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnRegistrarTratamientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRegistrarAreas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCentroMedico)
                    .addComponent(btnRegistrarSecretario))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntTpoCentro)
                    .addComponent(btnRegistrarEnfermero))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarDoctor)
                    .addComponent(btnRegistrarAreas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarDiagnosticos)
                    .addComponent(btnRegistrarTratamientos))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarPaciente)
                    .addComponent(btnRegistrarVacunas))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCentroMedico;
    public javax.swing.JButton btnRegistrarAreas;
    public javax.swing.JButton btnRegistrarDiagnosticos;
    public javax.swing.JButton btnRegistrarDoctor;
    public javax.swing.JButton btnRegistrarEnfermero;
    public javax.swing.JButton btnRegistrarPaciente;
    public javax.swing.JButton btnRegistrarSecretario;
    public javax.swing.JButton btnRegistrarTratamientos;
    public javax.swing.JButton btnRegistrarVacunas;
    public javax.swing.JButton btntTpoCentro;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
