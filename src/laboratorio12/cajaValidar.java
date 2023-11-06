
package laboratorio12;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class cajaValidar {
  

    
    private JLabel lblError;
    private JTextField txtCuadro;
    private JTextField txtcuadro;

    public cajaValidar(JLabel lblError, JTextField txtCuadro) {
        this.lblError = lblError;
        this.txtCuadro = txtCuadro;
    }
    
    public float getNumero() {
        lblError.setText("");
        String elemento2 = txtCuadro.getText().trim();
        
        if (elemento2.isEmpty()) {
            lblError.setText("Campo vacío");
            return 0;
        }
        
        try {
            return Float.parseFloat(elemento2);
        } catch (NumberFormatException ex) {
            lblError.setText("Número inválido");
            return 0;
        }
    }

    public JLabel getLblError() {
        return lblError;
    }

    public void setLblError(JLabel lblError) {
        this.lblError = lblError;
    }

    public JTextField getTxtcuadro() {
        return txtCuadro;
    }

    public void setTxtcuadro(JTextField txtcuadro) {
        this.txtcuadro = txtcuadro;
    }
}

    

