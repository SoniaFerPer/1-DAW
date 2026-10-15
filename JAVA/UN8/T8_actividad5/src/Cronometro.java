import javax.swing.*;
import java.awt.*;

public class Cronometro extends JFrame {

    private JLabel lblTiempo;

    private JButton btnIniciar;
    private JButton btnPausar;
    private JButton btnReiniciar;

    private Timer timer;

    private int segundos = 0;

    public Cronometro() {
        setTitle("Cronómetro");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout(10, 10));

        lblTiempo = new JLabel("00:00:00", JLabel.CENTER);

        lblTiempo.setFont(new Font("Arial", Font.BOLD, 40));

        add(lblTiempo, BorderLayout.CENTER);

        JPanel panelBotones = new JPanel();

        panelBotones.setLayout(new GridLayout(1, 3, 10, 10));

        btnIniciar = new JButton("Iniciar");
        btnPausar = new JButton("Pausar");
        btnReiniciar = new JButton("Reiniciar");

        panelBotones.add(btnIniciar);
        panelBotones.add(btnPausar);
        panelBotones.add(btnReiniciar);

        add(panelBotones, BorderLayout.SOUTH);

        timer = new Timer(1000, e -> {

            segundos++;

            actualizarTiempo();

        });

        btnIniciar.addActionListener(e -> {
            timer.start();
        });

        btnPausar.addActionListener(e -> {
            timer.stop();
        });

        btnReiniciar.addActionListener(e -> {

            timer.stop();

            segundos = 0;

            actualizarTiempo();

        });

        setVisible(true);
    }

    private void actualizarTiempo() {

        int horas = segundos / 3600;

        int minutos = (segundos % 3600) / 60;

        int seg = segundos % 60;

        String tiempo = String.format(
                "%02d:%02d:%02d",
                horas,
                minutos,
                seg
        );

        lblTiempo.setText(tiempo);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new Cronometro();
        });

    }
}