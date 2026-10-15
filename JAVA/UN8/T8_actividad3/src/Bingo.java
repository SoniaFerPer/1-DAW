import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class Bingo extends JFrame {

    private JLabel lblUltimoNumero;

    private JLabel[] numeros;

    private JButton btnSacar;
    private JButton btnReiniciar;

    private ArrayList<Integer> bolas;

    private int ultimoNumero = -1;

    public Bingo() {

        setTitle("Bingo");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout(10, 10));

        lblUltimoNumero = new JLabel("Pulsa 'Sacar bola'", JLabel.CENTER);
        lblUltimoNumero.setFont(new Font("Arial", Font.BOLD, 30));

        add(lblUltimoNumero, BorderLayout.NORTH);

        JPanel panelCentro = new JPanel();

        panelCentro.setLayout(new GridLayout(9, 10, 5, 5));

        numeros = new JLabel[90];

        for (int i = 0; i < 90; i++) {

            JLabel lblNumero = new JLabel(String.valueOf(i + 1), JLabel.CENTER);

            lblNumero.setOpaque(true);
            lblNumero.setBackground(Color.WHITE);
            lblNumero.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            lblNumero.setFont(new Font("Arial", Font.BOLD, 18));

            numeros[i] = lblNumero;

            panelCentro.add(lblNumero);
        }
        add(panelCentro, BorderLayout.CENTER);

        JPanel panelInferior = new JPanel();

        panelInferior.setLayout(new GridLayout(1, 2, 10, 10));

        btnSacar = new JButton("Sacar bola");
        btnReiniciar = new JButton("Reiniciar partida");

        panelInferior.add(btnSacar);
        panelInferior.add(btnReiniciar);

        add(panelInferior, BorderLayout.SOUTH);

        inicializarBombo();

        btnSacar.addActionListener(e -> sacarBola());

        btnReiniciar.addActionListener(e -> reiniciarPartida());

        setVisible(true);
    }

    private void inicializarBombo() {

        bolas = new ArrayList<>();

        for (int i = 1; i <= 90; i++) {
            bolas.add(i);
        }

        Collections.shuffle(bolas);
    }

    private void sacarBola() {

        if (bolas.isEmpty()) {

            btnSacar.setEnabled(false);

            lblUltimoNumero.setText("No quedan más bolas");

            return;
        }

        if (ultimoNumero != -1) {
            numeros[ultimoNumero - 1].setBackground(Color.YELLOW);
        }

        int numero = bolas.remove(0);

        ultimoNumero = numero;

        lblUltimoNumero.setText("Último número: " + numero);

        numeros[numero - 1].setBackground(Color.GREEN);
    }

    private void reiniciarPartida() {

        for (int i = 0; i < 90; i++) {
            numeros[i].setBackground(Color.WHITE);
        }

        lblUltimoNumero.setText("Pulsa 'Sacar bola'");

        ultimoNumero = -1;

        btnSacar.setEnabled(true);

        inicializarBombo();
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new Bingo();
        });

    }
}