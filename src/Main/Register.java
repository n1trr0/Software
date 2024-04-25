package Main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
* @author Raul
 */
public class Register extends javax.swing.JFrame {
    private JFrame ventanaPrincipal;

    public Register(JFrame parent) {
        this.ventanaPrincipal = parent;
        initComponents();
        setLocationRelativeTo(parent);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        salirButton = new javax.swing.JToggleButton();
        nombreText = new javax.swing.JLabel();
        apellidoText = new javax.swing.JLabel();
        correoText = new javax.swing.JLabel();
        telefonoText = new javax.swing.JLabel();
        passwordText = new javax.swing.JLabel(); // Moverlo aquí
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        password = new javax.swing.JTextField(); // Moverlo aquí
        registrarButton = new javax.swing.JButton();
        volverButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        salirButton.setFont(new java.awt.Font("Segoe UI", 1, 14));
        salirButton.setText("X");
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });

        nombreText.setText("Nombre:");

        apellidoText.setText("Apellido:");

        correoText.setText("Correo:");

        telefonoText.setText("Telefono:");

        passwordText.setText("Contraseña:");

        registrarButton.setText("Registrar");
        registrarButton.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                registrarButtonActionPerformed(evt);
            }
        });

        volverButton.setFont(new java.awt.Font("Segoe UI", 1, 14));
        volverButton.setText("<");
        volverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverButtonActionPerformed(evt);
            }
        });

        // Establecer el diseño del panel
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(volverButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(salirButton))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(telefonoText)
                                                .addGap(18, 18, 18)
                                                .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(passwordText)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(nombreText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(apellidoText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(correoText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addComponent(telefonoText))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(nombre)
                                                                .addComponent(apellido)
                                                                .addComponent(correo, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)))))
                                .addContainerGap(101, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(registrarButton)
                                .addGap(212, 212, 212))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(salirButton)
                                        .addComponent(volverButton))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nombreText)
                                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(apellidoText)
                                        .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(correoText)
                                        .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(telefonoText)
                                        .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(passwordText)
                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                .addComponent(registrarButton)
                                .addGap(37, 37, 37))
        );

        pack();
    }

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void registrarButtonActionPerformed(java.awt.event.ActionEvent evt){

    }

    private void volverButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        ventanaPrincipal.setVisible(true);
    }

    private javax.swing.JTextField apellido;
    private javax.swing.JLabel apellidoText;
    private javax.swing.JTextField correo;
    private javax.swing.JLabel correoText;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel nombreText;
    private javax.swing.JTextField password;
    private javax.swing.JLabel passwordText;
    private javax.swing.JButton registrarButton;
    private javax.swing.JToggleButton salirButton;
    private javax.swing.JTextField telefono;
    private javax.swing.JLabel telefonoText;
    private javax.swing.JButton volverButton;
}
