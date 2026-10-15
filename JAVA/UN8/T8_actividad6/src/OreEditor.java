import javax.swing.*;
import java.awt.*;

public class OreEditor extends JFrame {

    private JTextArea txtEditor;

    public OreEditor() {

        setTitle("OreEditor");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        txtEditor = new JTextArea();

        txtEditor.setFont(new Font("Monospaced", Font.PLAIN, 16));

        JScrollPane scroll = new JScrollPane(txtEditor);

        add(scroll, BorderLayout.CENTER);

        JMenuBar barraMenu = new JMenuBar();

        JMenu menuArchivo = new JMenu("Archivo");

        JMenuItem itemNuevo = new JMenuItem("Nuevo");
        JMenuItem itemAbrir = new JMenuItem("Abrir");
        JMenuItem itemGuardar = new JMenuItem("Guardar");
        JMenuItem itemSalir = new JMenuItem("Salir");

        menuArchivo.add(itemNuevo);
        menuArchivo.add(itemAbrir);
        menuArchivo.add(itemGuardar);

        menuArchivo.addSeparator();

        menuArchivo.add(itemSalir);

        JMenu menuEdicion = new JMenu("Edición");

        JMenuItem itemCopiar = new JMenuItem("Copiar");
        JMenuItem itemCortar = new JMenuItem("Cortar");
        JMenuItem itemPegar = new JMenuItem("Pegar");

        menuEdicion.add(itemCopiar);
        menuEdicion.add(itemCortar);
        menuEdicion.add(itemPegar);

        barraMenu.add(menuArchivo);
        barraMenu.add(menuEdicion);

        setJMenuBar(barraMenu);

        itemNuevo.addActionListener(e -> {

            txtEditor.setText("");

        });

        itemSalir.addActionListener(e -> {

            System.exit(0);

        });

        itemCopiar.addActionListener(e -> {
            txtEditor.copy();
        });

        itemCortar.addActionListener(e -> {
            txtEditor.cut();
        });

        itemPegar.addActionListener(e -> {
            txtEditor.paste();
        });

        setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new OreEditor();
        });

    }
}