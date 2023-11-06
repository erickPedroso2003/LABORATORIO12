
package laboratorio12;


import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Operacion {
    

    private float elemento1;
    private float elemento2;

    private cajaValidar caja1;
    private cajaValidar caja2;
    private cajaValidar resultado;

    public Operacion(float valor1, float valor2) {
        this.elemento1 = valor1;
        this.elemento2 = valor2;
    }

     public Operacion(cajaValidar caja1, cajaValidar caja2,
            cajaValidar resultado) {
        this.caja1 = caja1;
        this.caja2 = caja2;
        this.resultado = resultado;
    }
    public Operacion() {}

     public float sumar() {
        return this.elemento1 + elemento2;
    }

    public float resta() {
        return this.elemento1 - elemento2;
    }

    public float mul() {
        return this.elemento1 * elemento2;
    }

    public float divi() {
        return this.elemento1 / elemento2;
    }
   
    public void mostrarResultadodiv() {
    JTextField caja = resultado.getTxtcuadro();

    elemento1 = caja1.getNumero();
    elemento2 = caja2.getNumero();

    if (elemento1 == 0 || elemento2 == 0) {
        String text = "No es posible hacer la operación";
        caja.setText(text);
        JOptionPane.showMessageDialog(null, text, "", 
                JOptionPane.ERROR_MESSAGE);
    } else {
        float division = divi();
        caja.setText(division + "");
    }
}

  public void mostrarResultadosuma() {
    JTextField caja = resultado.getTxtcuadro();
    
    elemento1 = caja1.getNumero();
    elemento2 = caja2.getNumero();

    if (elemento1 == 0 && elemento2 == 0) {
        String text = "No es posible hacer la operación";
        caja.setText(text);
        JOptionPane.showMessageDialog(null, text, "",
                JOptionPane.ERROR_MESSAGE);
    } else {
        float sum = sumar();
        caja.setText(sum + "");
    }
}

public void mostrarResultadoresta() {
    JTextField caja = resultado.getTxtcuadro();

    elemento1 = caja1.getNumero();
    elemento2 = caja2.getNumero();

    if (elemento1 == 0 && elemento2 == 0) {
        String text = "No es posible hacer la operación";
        caja.setText(text);
        JOptionPane.showMessageDialog(null, text, "", 
                JOptionPane.ERROR_MESSAGE);
    } else {
        float rest = resta();
        caja.setText(rest + "");
    }
}

public void mostrarResultadomulti() {
    JTextField caja = resultado.getTxtcuadro();

    elemento1 = caja1.getNumero();
    elemento2 = caja2.getNumero();

    if (elemento1 == 0 && elemento2 == 0) {
        String text = "No es posible hacer la operación";
        caja.setText(text);
        JOptionPane.showMessageDialog(null, text, "", 
                JOptionPane.ERROR_MESSAGE);
    } else {
        float sum = mul();
        caja.setText(sum + "");
    }
}


}

    

