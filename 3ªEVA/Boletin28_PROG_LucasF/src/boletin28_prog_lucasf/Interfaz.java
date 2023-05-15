package boletin28_prog_lucasf;

/**
 *
 * @author lucas
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Interfaz {

    private JFrame marco;
    private JPanel panel;
    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JTextField lineaDeTexto;
    private JPasswordField lineaDeTexto2;
    private JButton pulsar;
    private JButton limpiar;
    private JTextArea areaTexto;

    public void inicializarComponentes() {
        marco = new JFrame();
        panel = new JPanel();
        etiqueta1 = new JLabel("Nome");
        etiqueta2 = new JLabel("Contrasinal");
        lineaDeTexto = new JTextField();
        lineaDeTexto2 = new JPasswordField();
        areaTexto = new JTextArea("Escribe aquí texto: ");
        pulsar = new JButton("Completar");
        limpiar = new JButton("Limpar");

        // Configuración de los componentes
        marco.setBounds(500, 200, 500, 600);
        panel.setBounds(5, 5, 470, 550);
        panel.setLayout(null);

        etiqueta1.setBounds(100, 100, 100, 50);
        lineaDeTexto.setBounds(200, 100, 200, 50);

        etiqueta2.setBounds(100, 200, 100, 50);
        lineaDeTexto2.setBounds(200, 200, 200, 50);
        lineaDeTexto2.setEchoChar('*');

        areaTexto.setBounds(100, 300, 300, 100);

        pulsar.setBounds(100, 450, 100, 50);
        pulsar.setToolTipText("Pulsando");

        limpiar.setBounds(300, 450, 100, 50);
        limpiar.setToolTipText("Limpar formulario");

        // Agrego componentes al panel:
        panel.add(etiqueta1);
        panel.add(lineaDeTexto);
        panel.add(etiqueta2);
        panel.add(lineaDeTexto2);
        panel.add(areaTexto);
        panel.add(pulsar);
        panel.add(limpiar);

        // Agrego panel al marco:
        marco.add(panel);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

        // Agregar ActionListener para el botón Limpar
        limpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lineaDeTexto.setText("");
                lineaDeTexto2.setText("");
                areaTexto.setText("");
            }
        });
    }
}
