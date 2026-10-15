import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class SantoYSena extends JFrame {

    private JButton btnEntrar;

    public SantoYSena() {

        setTitle("Santo y seña");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridBagLayout());

        btnEntrar = new JButton("Entrar");

        add(btnEntrar);

        btnEntrar.addActionListener(e -> abrirDialogo());

        setVisible(true);
    }

    private void abrirDialogo() {

        JDialog dialogo = new JDialog(this, "Inicio de sesión", true);

        dialogo.setSize(350, 200);
        dialogo.setLayout(new BorderLayout(10, 10));

        JPanel panelCampos = new JPanel();

        panelCampos.setLayout(new GridLayout(2, 2, 5, 5));

        JLabel lblUsuario = new JLabel("Nombre de usuario:", JLabel.RIGHT);
        JTextField txtUsuario = new JTextField();

        JLabel lblPassword = new JLabel("Contraseña:", JLabel.RIGHT);
        JPasswordField txtPassword = new JPasswordField();

        panelCampos.add(lblUsuario);
        panelCampos.add(txtUsuario);

        panelCampos.add(lblPassword);
        panelCampos.add(txtPassword);

        dialogo.add(panelCampos, BorderLayout.CENTER);

        JPanel panelBotones = new JPanel();

        panelBotones.setLayout(new GridLayout(1, 2, 10, 10));

        JButton btnIngresar = new JButton("Ingresar");
        JButton btnCancelar = new JButton("Cancelar");

        btnIngresar.setEnabled(false);

        panelBotones.add(btnIngresar);
        panelBotones.add(btnCancelar);

        dialogo.add(panelBotones, BorderLayout.SOUTH);

        DocumentListener listener = new DocumentListener() {

            private void comprobarCampos() {

                String usuario = txtUsuario.getText();
                String password = new String(txtPassword.getPassword());

                btnIngresar.setEnabled(
                        !usuario.isEmpty() && !password.isEmpty()
                );
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                comprobarCampos();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                comprobarCampos();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                comprobarCampos();
            }
        };

        txtUsuario.getDocument().addDocumentListener(listener);
        txtPassword.getDocument().addDocumentListener(listener);

        btnCancelar.addActionListener(e -> {
            dialogo.dispose();
        });

        btnIngresar.addActionListener(e -> {

            String usuario = txtUsuario.getText();
            String password = new String(txtPassword.getPassword());

            if (usuario.equals("estudiante")
                    && password.equals("oretania")) {

                JOptionPane.showMessageDialog(
                        dialogo,
                        "Bienvenido a la aplicación"
                );

                dialogo.dispose();

            } else {

                JOptionPane.showMessageDialog(
                        dialogo,
                        "Usuario o contraseña incorrectos",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        });

        dialogo.setLocationRelativeTo(this);

        dialogo.setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new SantoYSena();
        });

    }
}
