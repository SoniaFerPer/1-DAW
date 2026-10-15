import javax.swing.*;
import java.awt.*;

public class Formulario extends JFrame {

    public Formulario() {

        // Configuración de la ventana
        setTitle("Formulario de entrada");
        setSize(450, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel principal
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new GridLayout(3, 1, 5, 5));

        // Panel usuario
        JPanel panelUsuario = new JPanel();
        panelUsuario.setLayout(new GridLayout(1, 2, 5, 5));

        JLabel lblUsuario = new JLabel("Nombre de usuario:", JLabel.RIGHT);
        JTextField txtUsuario = new JTextField();

        panelUsuario.add(lblUsuario);
        panelUsuario.add(txtUsuario);

        // Panel contraseña
        JPanel panelPassword = new JPanel();
        panelPassword.setLayout(new GridLayout(1, 2, 5, 5));

        JLabel lblPassword = new JLabel("Contraseña:", JLabel.RIGHT);
        JTextField txtPassword = new JTextField();

        panelPassword.add(lblPassword);
        panelPassword.add(txtPassword);

        // Botón final
        JButton btnEntrar = new JButton("Entrar en la aplicación");

        // Añadir paneles
        panelPrincipal.add(panelUsuario);
        panelPrincipal.add(panelPassword);
        panelPrincipal.add(btnEntrar);

        add(panelPrincipal);

        // Mostrar ventana
        setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new Formulario();
        });

    }
}