import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telacalc extends JFrame {
    private JPanel pnlTelaCalc;
    private JButton btn3;
    private JButton btn2;
    private JButton btn1;
    private JButton btnSomar;
    private JButton btnSubtrair;
    private JButton btn6;
    private JButton btn5;
    private JButton btn4;
    private JButton btnIgual;
    private JButton btn9;
    private JButton btn8;
    private JButton btn7;
    private JButton btnDividir;
    private JButton btnLimpar;
    private JButton btnVirgula;
    private JButton btn0;
    private JButton btnMultiplicar;
    private JButton btnPorcentagem;
    private JButton btnRaiz;
    private JTextField txtSaida;
    double valor1;
    double valor2;
    String operador;

public telacalc() {
iniciarComponentes();
addListeners();
    btnLimpar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
}

private void iniciarComponentes() {

    JPanel telaCalc = new JPanel();
    setSize(500,500);
    setContentPane(pnlTelaCalc);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("calculadora");
    setVisible(true);
}
    private void addListeners(){
    btn1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtSaida.setText(txtSaida.getText() + '1');
        }
    });

    btn2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtSaida.setText(txtSaida.getText() + '2');
        }
    });

    btn3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtSaida.setText(txtSaida.getText() + '3');
        }
    });

    btn4.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtSaida.setText(txtSaida.getText() + '4');
        }
    });

    btn5.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtSaida.setText(txtSaida.getText() + '5');
        }
    });

    btn6.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtSaida.setText(txtSaida.getText() + '6');
        }
    });

    btn7.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtSaida.setText(txtSaida.getText() + '7');
        }
    });

    btn8.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtSaida.setText(txtSaida.getText() + '8');
        }
    });

    btn9.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtSaida.setText(txtSaida.getText() + '9');
        }
    });

    btn0.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtSaida.setText(txtSaida.getText() + '0');
        }
    });

    btnVirgula.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtSaida.setText(txtSaida.getText() + ',');
        }
    });

    btnSomar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            valor1 = Double.parseDouble(txtSaida.getText());
            txtSaida.setText("");
            operador = "+";
        }
    });

    btnSubtrair.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            valor1 = Double.parseDouble(txtSaida.getText());
            txtSaida.setText("");
            operador = "-";
        }
    });

    btnMultiplicar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            valor1 = Double.parseDouble(txtSaida.getText());
            txtSaida.setText("");
            operador = "*";
        }
    });

    btnDividir.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            valor1 = Double.parseDouble(txtSaida.getText());
            txtSaida.setText("");
            operador = "/";
        }
    });

    btnPorcentagem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            valor1 = Double.parseDouble(txtSaida.getText());
            txtSaida.setText("");
            operador = "%";
        }
    });

    btnRaiz.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            valor1 = Double.parseDouble(txtSaida.getText());
            txtSaida.setText("");
            operador = "sqrt";
            double sqrt = Math.sqrt(valor1);
            txtSaida.setText(String.valueOf(sqrt));
        }
    });

        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText("");
                operador = "";
            }
        });

    btnIgual.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            valor2 = Double.parseDouble(txtSaida.getText());
            switch (operador){
                case "+":
                    txtSaida.setText(String.valueOf(+ valor1 + valor2));
                    break;

                case "-":
                    txtSaida.setText(String.valueOf(- valor1 - valor2));
                    break;

                case "*":
                    txtSaida.setText(String.valueOf(valor1*valor2));
                    break;

                case "/":
                    txtSaida.setText(String.valueOf(valor1/valor2));
                    break;

                case "%":
                    txtSaida.setText(String.valueOf(valor1%100));
                    break;

            }
        }
    });

}

    public static void main(String[] args) {
    telacalc calculadora = new telacalc();


    }
}
