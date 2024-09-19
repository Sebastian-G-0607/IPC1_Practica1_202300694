package view;

import model.Hilo_barra;
/**

 @author sebas
 */
public class EstacionDeTrabajo extends javax.swing.JFrame {

    /** Creates new form EstacionDeTrabajo */
    public EstacionDeTrabajo() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Estación de Trabajo");
    }

    /** This method is called from within the constructor to
     initialize the form.
     WARNING: Do NOT modify this code. The content of this method is
     always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel1 = new javax.swing.JLabel();
        label_products = new javax.swing.JLabel();
        label_contador = new javax.swing.JLabel();
        label_diagonal = new javax.swing.JLabel();
        label_total = new javax.swing.JLabel();
        label_tiempo = new javax.swing.JLabel();
        label_min = new javax.swing.JLabel();
        label_dosp = new javax.swing.JLabel();
        label_sec = new javax.swing.JLabel();
        label_ensamblaje = new javax.swing.JLabel();
        label_pintura = new javax.swing.JLabel();
        label_empaque = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jProgressBar3 = new javax.swing.JProgressBar();
        label_1 = new javax.swing.JLabel();
        porcentaje1 = new javax.swing.JLabel();
        label_2 = new javax.swing.JLabel();
        porcentaje2 = new javax.swing.JLabel();
        label_3 = new javax.swing.JLabel();
        porcentaje3 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("ESTACIÓN DE TRABAJO");

        label_products.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_products.setText("Productos");

        label_contador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_contador.setText("00");

        label_diagonal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_diagonal.setText("/");

        label_total.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_total.setText("00");

        label_tiempo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_tiempo.setText("Tiempo:");

        label_min.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_min.setText("00");

        label_dosp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_dosp.setText(":");

        label_sec.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_sec.setText("00");

        label_ensamblaje.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_ensamblaje.setText("Ensamblaje");

        label_pintura.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_pintura.setText("Pintura");

        label_empaque.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_empaque.setText("Empaque");

        label_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_1.setText("0");

        porcentaje1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        porcentaje1.setText("%");

        label_2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_2.setText("0");

        porcentaje2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        porcentaje2.setText("%");

        label_3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_3.setText("0");

        porcentaje3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        porcentaje3.setText("%");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(label_products, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_contador, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_diagonal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_total)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(label_tiempo)
                .addGap(18, 18, 18)
                .addComponent(label_min)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_dosp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_sec)
                .addGap(178, 178, 178))
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_ensamblaje)
                    .addComponent(label_pintura)
                    .addComponent(label_empaque))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(porcentaje3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(porcentaje2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(porcentaje1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(220, 220, 220))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_products)
                        .addComponent(label_contador)
                        .addComponent(label_diagonal)
                        .addComponent(label_total))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_min)
                        .addComponent(label_tiempo)
                        .addComponent(label_dosp)
                        .addComponent(label_sec)))
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_ensamblaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_1)
                        .addComponent(porcentaje1)))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_pintura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_2)
                        .addComponent(porcentaje2)))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(label_empaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jProgressBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_3)
                        .addComponent(porcentaje3)))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JProgressBar jProgressBar1;
    public javax.swing.JProgressBar jProgressBar2;
    public javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel label_1;
    public javax.swing.JLabel label_2;
    public javax.swing.JLabel label_3;
    public javax.swing.JLabel label_contador;
    private javax.swing.JLabel label_diagonal;
    private javax.swing.JLabel label_dosp;
    private javax.swing.JLabel label_empaque;
    private javax.swing.JLabel label_ensamblaje;
    public javax.swing.JLabel label_min;
    private javax.swing.JLabel label_pintura;
    private javax.swing.JLabel label_products;
    public javax.swing.JLabel label_sec;
    private javax.swing.JLabel label_tiempo;
    public javax.swing.JLabel label_total;
    private javax.swing.JLabel porcentaje1;
    private javax.swing.JLabel porcentaje2;
    private javax.swing.JLabel porcentaje3;
    // End of variables declaration//GEN-END:variables
}
