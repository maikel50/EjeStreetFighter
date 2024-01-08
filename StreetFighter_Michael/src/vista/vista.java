package vista;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;

import controlador.Controlador;

public class vista extends JFrame {

    private JPanel contentPane;
    public JLabel lblPortada;
    public JButton btnHistoria,btnEnfrentamienot,btnInformacion,btnDescripcion;
    PanelDescripcion panelDescripcion;
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                vista frame = new vista();
                PanelDescripcion frameDescripcion = new PanelDescripcion();
                PanelEleccionJugadoresEnfrentamiento frameEleccion = new PanelEleccionJugadoresEnfrentamiento();
                CombateEnfren combateEnfrentamiento = new CombateEnfren();
                Controlador controlador = new Controlador(frame, frameDescripcion,frameEleccion,combateEnfrentamiento);
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    
    }

    public vista() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1312, 682);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(2, 2, 2, 2));
        setExtendedState(this.MAXIMIZED_BOTH);
        setContentPane(contentPane);
        contentPane.setLayout(null);

        lblPortada = new JLabel();
        lblPortada.setBounds(5, 5, 1536, 838);
        lblPortada.setIcon(new ImageIcon(getClass().getResource("/imagenes/portada/portada.jpg")));
        contentPane.add(lblPortada);
        
        btnHistoria = new JButton("Modo Historia");
        btnHistoria.setFont(new Font("Georgia", Font.BOLD, 20));
        btnHistoria.setBackground(Color.ORANGE);
        btnHistoria.setBounds(60, 88, 369, 102);
        contentPane.add(btnHistoria);
        
        btnEnfrentamienot = new JButton("ENFRENTAMIENTO");
        btnEnfrentamienot.setFont(new Font("Georgia", Font.BOLD, 20));
        btnEnfrentamienot.setBackground(Color.ORANGE);
        btnEnfrentamienot.setBounds(60, 241, 369, 102);
        contentPane.add(btnEnfrentamienot);
       
        
        
        btnDescripcion = new JButton("Descripcion de Personajes");
        btnDescripcion.setFont(new Font("Georgia", Font.BOLD, 20));
        btnDescripcion.setBackground(Color.ORANGE);
        btnDescripcion.setBounds(60, 422, 384, 61);
        contentPane.add(btnDescripcion);
        
        btnInformacion = new JButton("Informacion o Ayuda");
        btnInformacion.setFont(new Font("Georgia", Font.BOLD, 20));
        btnInformacion.setBackground(Color.ORANGE);
        btnInformacion.setBounds(60, 531, 369, 61);
        contentPane.add(btnInformacion);
        
       
    }
}
