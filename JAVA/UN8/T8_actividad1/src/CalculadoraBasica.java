import javax.swing.*;
import java.awt.*;

public class CalculadoraBasica extends JFrame {

    public CalculadoraBasica() {

        // Configuración de la ventana
        setTitle("Calculadora básica");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Layout principal
        setLayout(new BorderLayout());

        // Etiqueta superior para resultados
        JLabel lblResultado = new JLabel("0", JLabel.RIGHT);
        lblResultado.setFont(new Font("Arial", Font.BOLD, 28));
        add(lblResultado, BorderLayout.NORTH);

        // Panel central con botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(4, 4, 5, 5));

        // Fila 1
        panelBotones.add(new JButton("7"));
        panelBotones.add(new JButton("8"));
        panelBotones.add(new JButton("9"));
        panelBotones.add(new JButton("÷"));

        // Fila 2
        panelBotones.add(new JButton("4"));
        panelBotones.add(new JButton("5"));
        panelBotones.add(new JButton("6"));
        panelBotones.add(new JButton("×"));

        // Fila 3
        panelBotones.add(new JButton("1"));
        panelBotones.add(new JButton("2"));
        panelBotones.add(new JButton("3"));
        panelBotones.add(new JButton("-"));

        // Fila 4
        panelBotones.add(new JButton(","));
        panelBotones.add(new JButton("0"));
        panelBotones.add(new JButton("="));
        panelBotones.add(new JButton("+"));

        add(panelBotones, BorderLayout.CENTER);

        // Texto inferior
        JLabel lblPie = new JLabel("IES Oretania", JLabel.CENTER);
        add(lblPie, BorderLayout.SOUTH);

        // Mostrar ventana
        setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new CalculadoraBasica();
        });

    }
}