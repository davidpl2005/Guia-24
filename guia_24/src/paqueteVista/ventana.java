
package paqueteVista;

    import javax.swing.JFrame;
    import java.awt.event.MouseAdapter;
    import java.awt.event.MouseEvent;
    import javax.swing.JLabel;
/**
 *
 * @author isac pacheco
 */
public class ventana extends javax.swing.JFrame {
    
    JLabel etiTexto;
    /**
     * Creates new form Window
     */
    public ventana() {
        initComponents();
        CreacionVentana();
        
    }
    public void CreacionVentana(){
        
        this.setTitle("Programación de eventos de ratón");
        this.setSize(400,400);
        this.setLocation(100, 100);
        
        etiTexto = new JLabel();
        etiTexto.setBounds(50,10,300,250);
        etiTexto.setText("---");
        this.getContentPane().add(etiTexto);
        
        etiTexto.addMouseListener(new MouseAdapter() {
            
            public void mouseEntered(MouseEvent evt) {
                etiTextoMouseEntered(evt);
            }

            
            public void mouseExited(MouseEvent evt) {
                etiTextoMouseExited(evt);
            }

            
            public void mousePressed(MouseEvent evt) {
                etiTextoMousePressed(evt);
            }

            
            public void mouseReleased(MouseEvent evt) {
                etiTextoMouseReleased(evt);
            }

            
            public void mouseClicked(MouseEvent evt) {
                etiTextoMouseClicked(evt);
            }
        });
    }

    public void etiTextoMouseEntered(MouseEvent evt) {
        etiTexto.setText("El ratón acaba de entrar a la etiqueta");
    }

    public void etiTextoMouseExited(MouseEvent evt) {
        etiTexto.setText("El ratón acaba de salir de la etiqueta");
    }

    public void etiTextoMousePressed(MouseEvent evt) {
        etiTexto.setText("El ratón acaba de ser presionado");
    }

    public void etiTextoMouseReleased(MouseEvent evt) {
        etiTexto.setText("El ratón acaba de ser soltado");
    }

    public void etiTextoMouseClicked(MouseEvent evt) {
        etiTexto.setText("El ratón acaba de ser pulsado");
    }
    
    
    

    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
