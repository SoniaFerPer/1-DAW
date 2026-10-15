import javax.swing.*;
import java.awt.*;

public class ElTiempo extends JFrame {

    private JComboBox<String> comboCiudades;

    private JLabel lblTemperatura;
    private JLabel lblHumedad;
    private JLabel lblLluvia;
    private JLabel lblIcono;

    private String[] ciudades = {
            "Madrid",
            "Barcelona",
            "Sevilla",
            "Valencia",
            "Bilbao"
    };

    private int[] temperaturas = {
            32,
            28,
            36,
            30,
            22
    };

    private int[] humedades = {
            40,
            65,
            30,
            55,
            80
    };

    private int[] lluvias = {
            10,
            30,
            5,
            20,
            75
    };

    private String[] estados = {
            "Sol",
            "Nubes",
            "Sol",
            "Nubes",
            "Lluvia"
    };

    public ElTiempo() {

        setTitle("El tiempo");
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout(10, 10));

        JPanel panelSuperior = new JPanel();

        panelSuperior.setLayout(new FlowLayout());

        JLabel lblCiudad = new JLabel("Ciudad:");

        comboCiudades = new JComboBox<>(ciudades);

        panelSuperior.add(lblCiudad);
        panelSuperior.add(comboCiudades);

        add(panelSuperior, BorderLayout.NORTH);

        JPanel panelCentral = new JPanel();

        panelCentral.setLayout(new GridLayout(4, 1, 5, 5));

        lblTemperatura = new JLabel("", JLabel.CENTER);
        lblHumedad = new JLabel("", JLabel.CENTER);
        lblLluvia = new JLabel("", JLabel.CENTER);
        lblIcono = new JLabel("", JLabel.CENTER);

        lblTemperatura.setFont(new Font("Arial", Font.BOLD, 18));
        lblHumedad.setFont(new Font("Arial", Font.BOLD, 18));
        lblLluvia.setFont(new Font("Arial", Font.BOLD, 18));
        lblIcono.setFont(new Font("Arial", Font.PLAIN, 50));

        panelCentral.add(lblTemperatura);
        panelCentral.add(lblHumedad);
        panelCentral.add(lblLluvia);
        panelCentral.add(lblIcono);

        add(panelCentral, BorderLayout.CENTER);

        actualizarDatos(0);

        comboCiudades.addActionListener(e -> {

            int indice = comboCiudades.getSelectedIndex();

            actualizarDatos(indice);

        });

        setVisible(true);
    }

    public void actualizarDatos(int indice) {

        lblTemperatura.setText(
                "Temperatura: " + temperaturas[indice] + " °C"
        );

        lblHumedad.setText(
                "Humedad: " + humedades[indice] + " %"
        );

        lblLluvia.setText(
                "Probabilidad de lluvia: " + lluvias[indice] + " %"
        );

        switch (estados[indice]) {

            case "Sol":
                ImageIcon solOriginal = new ImageIcon(getClass().getResource("/sol.png"));
                Image solEscalada = solOriginal.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                lblIcono.setIcon(new ImageIcon(solEscalada));
                break;

            case "Nubes":
                ImageIcon nubeOriginal = new ImageIcon(getClass().getResource("/cloud.png"));
                Image nubeEscalada = nubeOriginal.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                lblIcono.setIcon(new ImageIcon(nubeEscalada));
                break;

            case "Lluvia":
                ImageIcon lluviaOriginal = new ImageIcon(getClass().getResource("/rainy.png"));
                //ESCALAR IMAGEN
                Image lluviaEscalada = lluviaOriginal.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                lblIcono.setIcon(new ImageIcon(lluviaEscalada));
                break;
        }

    }
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new ElTiempo();
        });

    }
}