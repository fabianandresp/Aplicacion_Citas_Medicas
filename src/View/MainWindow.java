/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
;

import com.company.Main;
import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;



/**
 *
 * @author Karlenypc
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1_Base = new javax.swing.JPanel();
        jPanel2_Menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnPaciente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnMedico = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnCita = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnProcedimiento = new javax.swing.JButton();
        btnClinica = new javax.swing.JButton();
        jPanel3_Superior = new javax.swing.JPanel();
        jLabel_Menu = new javax.swing.JLabel();
        jPanel_Central = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2_filtroMedico = new javax.swing.JPanel();
        jLabel_RegistroMedicos = new javax.swing.JLabel();
        txtEspecialidad1 = new javax.swing.JTextField();
        jLabel_filtroEspecialidad = new javax.swing.JLabel();
        jLabel_filtroNombre = new javax.swing.JLabel();
        jLabel_filtroApellido = new javax.swing.JLabel();
        txtnombreMedico4 = new javax.swing.JTextField();
        txtApellido1 = new javax.swing.JTextField();
        jButton_VisualizarMedico1 = new javax.swing.JButton();
        txtnombreMedico1 = new javax.swing.JTextField();
        txtnombreMedico3 = new javax.swing.JTextField();
        txtnombreMedico2 = new javax.swing.JTextField();
        txtApellido2 = new javax.swing.JTextField();
        txtApellido3 = new javax.swing.JTextField();
        txtApellido4 = new javax.swing.JTextField();
        txtEspecialidad2 = new javax.swing.JTextField();
        txtEspecialidad3 = new javax.swing.JTextField();
        txtEspecialidad4 = new javax.swing.JTextField();
        jButton_VisualizarMedico2 = new javax.swing.JButton();
        jButton_VisualizarMedico3 = new javax.swing.JButton();
        jButton_VisualizarMedico4 = new javax.swing.JButton();
        jPanel2_medico1 = new javax.swing.JPanel();
        jLabel_InfoMedica = new javax.swing.JLabel();
        jLabel_idioma = new javax.swing.JLabel();
        txtidiomas = new javax.swing.JTextField();
        txtCedulaMedico1 = new javax.swing.JTextField();
        txtSlogan = new javax.swing.JTextField();
        txtFinalizacionEstudios = new javax.swing.JTextField();
        txtTituloUniversitario = new javax.swing.JTextField();
        txtUniversidadEstudio1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel_procedimientosRealizados = new javax.swing.JLabel();
        txtCorreoMedico1 = new javax.swing.JTextField();
        jLabel_Afiliacion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_procedimientoCosto = new javax.swing.JTextArea();
        txtNombreMedico1 = new javax.swing.JTextField();
        txtAfiliacionPerteneciente = new javax.swing.JTextField();
        jLabel_educacion3 = new javax.swing.JLabel();
        txtEspecialidadMedico1 = new javax.swing.JTextField();
        txtPaisUniversidad1 = new javax.swing.JTextField();
        jPanel2_medico2 = new javax.swing.JPanel();
        jLabel_InfoMedica2 = new javax.swing.JLabel();
        txtNombreMedico2 = new javax.swing.JTextField();
        txtCedulaMedico2 = new javax.swing.JTextField();
        txtCorreoMedico2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtSlogan1 = new javax.swing.JTextField();
        jLabel_idioma1 = new javax.swing.JLabel();
        txtidiomas1 = new javax.swing.JTextField();
        jLabel_educacion4 = new javax.swing.JLabel();
        txtTituloUniversitario1 = new javax.swing.JTextField();
        txtFinalizacionEstudios1 = new javax.swing.JTextField();
        txtUniversidadEstudio2 = new javax.swing.JTextField();
        txtPaisUniversidad2 = new javax.swing.JTextField();
        txtEspecialidadMedico2 = new javax.swing.JTextField();
        jLabel_procedimientosRealizados1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_procedimientoCosto1 = new javax.swing.JTextArea();
        jLabel_Afiliacion1 = new javax.swing.JLabel();
        txtAfiliacionPerteneciente1 = new javax.swing.JTextField();
        jPanel2_medico3 = new javax.swing.JPanel();
        jLabel_InfoMedica3 = new javax.swing.JLabel();
        txtNombreMedico3 = new javax.swing.JTextField();
        txtCedulaMedico3 = new javax.swing.JTextField();
        txtCorreoMedico3 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtSlogan2 = new javax.swing.JTextField();
        jLabel_idioma2 = new javax.swing.JLabel();
        txtidiomas2 = new javax.swing.JTextField();
        jLabel_educacion5 = new javax.swing.JLabel();
        txtTituloUniversitario2 = new javax.swing.JTextField();
        txtFinalizacionEstudios2 = new javax.swing.JTextField();
        txtUniversidadEstudio3 = new javax.swing.JTextField();
        txtPaisUniversidad3 = new javax.swing.JTextField();
        txtEspecialidadMedico3 = new javax.swing.JTextField();
        jLabel_procedimientosRealizados2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea_procedimientoCosto2 = new javax.swing.JTextArea();
        jLabel_Afiliacion2 = new javax.swing.JLabel();
        txtAfiliacionPerteneciente2 = new javax.swing.JTextField();
        jPanel2_medico4 = new javax.swing.JPanel();
        jLabel_InfoMedica4 = new javax.swing.JLabel();
        txtNombreMedico4 = new javax.swing.JTextField();
        txtCedulaMedico4 = new javax.swing.JTextField();
        txtCorreoMedico4 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtSlogan3 = new javax.swing.JTextField();
        jLabel_idioma3 = new javax.swing.JLabel();
        txtidiomas3 = new javax.swing.JTextField();
        jLabel_educacion6 = new javax.swing.JLabel();
        txtTituloUniversitario3 = new javax.swing.JTextField();
        txtFinalizacionEstudios3 = new javax.swing.JTextField();
        txtUniversidadEstudio4 = new javax.swing.JTextField();
        txtPaisUniversidad4 = new javax.swing.JTextField();
        txtEspecialidadMedico4 = new javax.swing.JTextField();
        jLabel_procedimientosRealizados3 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea_procedimientoCosto3 = new javax.swing.JTextArea();
        jLabel_Afiliacion3 = new javax.swing.JLabel();
        txtAfiliacionPerteneciente3 = new javax.swing.JTextField();
        jPanel3_filtroClinica = new javax.swing.JPanel();
        jLabel_InfoMedica1 = new javax.swing.JLabel();
        jLabel_filtroNumeroClinica = new javax.swing.JLabel();
        txtNumeroClinica1 = new javax.swing.JTextField();
        jButton_VisualizarClinica1 = new javax.swing.JButton();
        jLabel_filtroNombreClinica = new javax.swing.JLabel();
        txtnombreClinica1 = new javax.swing.JTextField();
        txtnombreClinica2 = new javax.swing.JTextField();
        txtNumeroClinica2 = new javax.swing.JTextField();
        txtnombreClinica3 = new javax.swing.JTextField();
        txtNumeroClinica3 = new javax.swing.JTextField();
        txtnombreClinica4 = new javax.swing.JTextField();
        txtNumeroClinica4 = new javax.swing.JTextField();
        jButton_VisualizarClinica2 = new javax.swing.JButton();
        jButton_VisualizarClinica3 = new javax.swing.JButton();
        jButton_VisualizarClinica4 = new javax.swing.JButton();
        jPanel3_clinica1 = new javax.swing.JPanel();
        jLabel_InfoClinica1 = new javax.swing.JLabel();
        txtDistrito1 = new javax.swing.JTextField();
        txtDireccionGeneral1 = new javax.swing.JTextField();
        jLabel_infoContacto1 = new javax.swing.JLabel();
        jLabel_direccion1 = new javax.swing.JLabel();
        txtnumeroClinica1 = new javax.swing.JTextField();
        txtNombreClinica1 = new javax.swing.JTextField();
        jLabel_distrito1 = new javax.swing.JLabel();
        jLabel_provincia1 = new javax.swing.JLabel();
        jLabel_canton1 = new javax.swing.JLabel();
        txtProvincia1 = new javax.swing.JTextField();
        txtCanton1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel3_clinica2 = new javax.swing.JPanel();
        jLabel_InfoClinica2 = new javax.swing.JLabel();
        txtNombreClinica2 = new javax.swing.JTextField();
        jLabel_infoContacto2 = new javax.swing.JLabel();
        txtnumeroClinica2 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel_direccion2 = new javax.swing.JLabel();
        txtDireccionGeneral2 = new javax.swing.JTextField();
        jLabel_provincia2 = new javax.swing.JLabel();
        txtProvincia2 = new javax.swing.JTextField();
        jLabel_canton2 = new javax.swing.JLabel();
        txtCanton2 = new javax.swing.JTextField();
        jLabel_distrito2 = new javax.swing.JLabel();
        txtDistrito2 = new javax.swing.JTextField();
        jPanel3_clinica3 = new javax.swing.JPanel();
        jLabel_InfoClinica3 = new javax.swing.JLabel();
        txtNombreClinica3 = new javax.swing.JTextField();
        jLabel_infoContacto3 = new javax.swing.JLabel();
        txtnumeroClinica3 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel_direccion3 = new javax.swing.JLabel();
        txtDireccionGeneral3 = new javax.swing.JTextField();
        jLabel_provincia3 = new javax.swing.JLabel();
        txtProvincia3 = new javax.swing.JTextField();
        jLabel_canton3 = new javax.swing.JLabel();
        txtCanton3 = new javax.swing.JTextField();
        jLabel_distrito3 = new javax.swing.JLabel();
        txtDistrito3 = new javax.swing.JTextField();
        jPanel3_clinica4 = new javax.swing.JPanel();
        jLabel_InfoClinica4 = new javax.swing.JLabel();
        txtNombreClinica4 = new javax.swing.JTextField();
        jLabel_infoContacto4 = new javax.swing.JLabel();
        txtnumeroClinica4 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel_direccion4 = new javax.swing.JLabel();
        txtDireccionGeneral4 = new javax.swing.JTextField();
        jLabel_provincia4 = new javax.swing.JLabel();
        txtProvincia4 = new javax.swing.JTextField();
        jLabel_canton4 = new javax.swing.JLabel();
        txtCanton4 = new javax.swing.JTextField();
        jLabel_distrito4 = new javax.swing.JLabel();
        txtDistrito4 = new javax.swing.JTextField();
        jPanel1_RegistroUsuarios = new javax.swing.JPanel();
        jLabel_InfoPersonal = new javax.swing.JLabel();
        jLabel_NombrePadecimiento = new javax.swing.JLabel();
        txtCorreoElectronico = new javax.swing.JTextField();
        jLabel_descripPadecimiento = new javax.swing.JLabel();
        txtApeliido = new javax.swing.JTextField();
        jLabel_cedula = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        jLabel_correoElectronico = new javax.swing.JLabel();
        jLabel_tipoPadecimiento = new javax.swing.JLabel();
        jComboBox_nombrePadecimiento = new javax.swing.JComboBox<>();
        ibiFoto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdescrptionPadecimiento = new javax.swing.JTextArea();
        jLabel_nombre = new javax.swing.JLabel();
        ConboxEleccion = new javax.swing.JComboBox<>();
        btnCargarFoto = new javax.swing.JButton();
        jLabel_nombre1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel_cedula1 = new javax.swing.JLabel();
        txtCedula1 = new javax.swing.JTextField();
        jLabel_correoElectronico1 = new javax.swing.JLabel();
        jComboBox_tipoPadecimiento1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1_Base.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1_Base.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2_Menu.setBackground(new java.awt.Color(231, 229, 218));
        jPanel2_Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesIcons/icons8_google_forms_33px.png"))); // NOI18N
        jPanel2_Menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 40, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesIcons/icons8_medical_doctor_33px.png"))); // NOI18N
        jPanel2_Menu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 40, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesIcons/icons8_search_property_33px.png"))); // NOI18N
        jPanel2_Menu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 40, 40));

        btnPaciente.setBackground(new java.awt.Color(106, 100, 90));
        btnPaciente.setFont(new java.awt.Font("Microsoft YaHei", 1, 15)); // NOI18N
        btnPaciente.setForeground(new java.awt.Color(30, 29, 26));
        btnPaciente.setText("Pacientes");
        btnPaciente.setBorder(null);
        btnPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked(evt);
            }
        });
        btnPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacienteActionPerformed(evt);
            }
        });
        jPanel2_Menu.add(btnPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 210, 41));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesIcons/icons8_hospital_3_33px.png"))); // NOI18N
        jPanel2_Menu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 40, 40));

        btnMedico.setBackground(new java.awt.Color(106, 100, 90));
        btnMedico.setFont(new java.awt.Font("Microsoft YaHei", 1, 15)); // NOI18N
        btnMedico.setForeground(new java.awt.Color(30, 29, 26));
        btnMedico.setText("Médico");
        btnMedico.setBorder(null);
        btnMedico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMedico.setRolloverEnabled(true);
        btnMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked(evt);
            }
        });
        btnMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicoActionPerformed(evt);
            }
        });
        jPanel2_Menu.add(btnMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 210, 41));

        btnRegistro.setBackground(new java.awt.Color(106, 100, 90));
        btnRegistro.setFont(new java.awt.Font("Microsoft YaHei", 1, 15)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(30, 29, 26));
        btnRegistro.setText("Registrarse");
        btnRegistro.setBorder(null);
        btnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked(evt);
            }
        });
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        jPanel2_Menu.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 210, 41));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesIcons/icons8_health_book_33px.png"))); // NOI18N
        jPanel2_Menu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 40, 40));

        btnCita.setBackground(new java.awt.Color(106, 100, 90));
        btnCita.setFont(new java.awt.Font("Microsoft YaHei", 1, 15)); // NOI18N
        btnCita.setForeground(new java.awt.Color(30, 29, 26));
        btnCita.setText("Citas");
        btnCita.setBorder(null);
        btnCita.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked(evt);
            }
        });
        btnCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitaActionPerformed(evt);
            }
        });
        jPanel2_Menu.add(btnCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 210, 41));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesIcons/icons8_hypertension_33px_1.png"))); // NOI18N
        jPanel2_Menu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 40, 40));

        btnProcedimiento.setBackground(new java.awt.Color(106, 100, 90));
        btnProcedimiento.setFont(new java.awt.Font("Microsoft YaHei", 1, 15)); // NOI18N
        btnProcedimiento.setForeground(new java.awt.Color(30, 29, 26));
        btnProcedimiento.setText("        Padecimiento");
        btnProcedimiento.setBorder(null);
        btnProcedimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProcedimiento.setRolloverEnabled(true);
        btnProcedimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked(evt);
            }
        });
        btnProcedimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcedimientoActionPerformed(evt);
            }
        });
        jPanel2_Menu.add(btnProcedimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 210, 41));

        btnClinica.setBackground(new java.awt.Color(106, 100, 90));
        btnClinica.setFont(new java.awt.Font("Microsoft YaHei", 1, 15)); // NOI18N
        btnClinica.setForeground(new java.awt.Color(30, 29, 26));
        btnClinica.setText("Clínicas");
        btnClinica.setBorder(null);
        btnClinica.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClinica.setRolloverEnabled(true);
        btnClinica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked(evt);
            }
        });
        btnClinica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClinicaActionPerformed(evt);
            }
        });
        jPanel2_Menu.add(btnClinica, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 210, 41));

        jPanel1_Base.add(jPanel2_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 210, 580));

        jPanel3_Superior.setBackground(new java.awt.Color(0, 10, 26));

        jLabel_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesIcons/icons8_menu_48px.png"))); // NOI18N
        jLabel_Menu.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel3_SuperiorLayout = new javax.swing.GroupLayout(jPanel3_Superior);
        jPanel3_Superior.setLayout(jPanel3_SuperiorLayout);
        jPanel3_SuperiorLayout.setHorizontalGroup(
            jPanel3_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3_SuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(873, Short.MAX_VALUE))
        );
        jPanel3_SuperiorLayout.setVerticalGroup(
            jPanel3_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3_SuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel1_Base.add(jPanel3_Superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 40));

        jPanel_Central.setLayout(new java.awt.CardLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(620, 420));
        jPanel4.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        jPanel_Central.add(jPanel4, "card5");

        jPanel5.setPreferredSize(new java.awt.Dimension(620, 420));
        jPanel5.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        jPanel_Central.add(jPanel5, "card6");

        jPanel6.setPreferredSize(new java.awt.Dimension(620, 420));
        jPanel6.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        jPanel_Central.add(jPanel6, "card7");

        jPanel2_filtroMedico.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2_filtroMedico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_RegistroMedicos.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel_RegistroMedicos.setForeground(new java.awt.Color(0, 10, 26));
        jLabel_RegistroMedicos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_RegistroMedicos.setText("REGISTRO MÉDICOS");
        jLabel_RegistroMedicos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_RegistroMedicos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2_filtroMedico.add(jLabel_RegistroMedicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 230, 28));

        txtEspecialidad1.setBackground(new java.awt.Color(255, 255, 255));
        txtEspecialidad1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtEspecialidad1.setForeground(new java.awt.Color(30, 29, 26));
        txtEspecialidad1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEspecialidad1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_filtroMedico.add(txtEspecialidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 130, 30));

        jLabel_filtroEspecialidad.setBackground(new java.awt.Color(231, 229, 218));
        jLabel_filtroEspecialidad.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_filtroEspecialidad.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_filtroEspecialidad.setText("Especialidad");
        jPanel2_filtroMedico.add(jLabel_filtroEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 90, 30));

        jLabel_filtroNombre.setBackground(new java.awt.Color(231, 229, 218));
        jLabel_filtroNombre.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_filtroNombre.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_filtroNombre.setText("Nombre");
        jPanel2_filtroMedico.add(jLabel_filtroNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 70, 30));

        jLabel_filtroApellido.setBackground(new java.awt.Color(231, 229, 218));
        jLabel_filtroApellido.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_filtroApellido.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_filtroApellido.setText("Apellido");
        jPanel2_filtroMedico.add(jLabel_filtroApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 70, 30));

        txtnombreMedico4.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreMedico4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnombreMedico4.setForeground(new java.awt.Color(30, 29, 26));
        txtnombreMedico4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombreMedico4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtnombreMedico4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreMedico4ActionPerformed(evt);
            }
        });
        jPanel2_filtroMedico.add(txtnombreMedico4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 130, 30));

        txtApellido1.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtApellido1.setForeground(new java.awt.Color(30, 29, 26));
        txtApellido1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellido1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtApellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellido1ActionPerformed(evt);
            }
        });
        jPanel2_filtroMedico.add(txtApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 130, 30));

        jButton_VisualizarMedico1.setBackground(new java.awt.Color(106, 100, 90));
        jButton_VisualizarMedico1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton_VisualizarMedico1.setForeground(new java.awt.Color(30, 29, 26));
        jButton_VisualizarMedico1.setText("Ver");
        jButton_VisualizarMedico1.setBorder(null);
        jButton_VisualizarMedico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VisualizarMedico1ActionPerformed(evt);
            }
        });
        jPanel2_filtroMedico.add(jButton_VisualizarMedico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 100, 30));

        txtnombreMedico1.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreMedico1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnombreMedico1.setForeground(new java.awt.Color(30, 29, 26));
        txtnombreMedico1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombreMedico1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtnombreMedico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreMedico1ActionPerformed(evt);
            }
        });
        jPanel2_filtroMedico.add(txtnombreMedico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 130, 30));

        txtnombreMedico3.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreMedico3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnombreMedico3.setForeground(new java.awt.Color(30, 29, 26));
        txtnombreMedico3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombreMedico3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_filtroMedico.add(txtnombreMedico3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 130, 30));

        txtnombreMedico2.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreMedico2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnombreMedico2.setForeground(new java.awt.Color(30, 29, 26));
        txtnombreMedico2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombreMedico2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_filtroMedico.add(txtnombreMedico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 130, 30));

        txtApellido2.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtApellido2.setForeground(new java.awt.Color(30, 29, 26));
        txtApellido2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellido2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_filtroMedico.add(txtApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 130, 30));

        txtApellido3.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtApellido3.setForeground(new java.awt.Color(30, 29, 26));
        txtApellido3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellido3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_filtroMedico.add(txtApellido3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 130, 30));

        txtApellido4.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtApellido4.setForeground(new java.awt.Color(30, 29, 26));
        txtApellido4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellido4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtApellido4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellido4ActionPerformed(evt);
            }
        });
        jPanel2_filtroMedico.add(txtApellido4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 130, 30));

        txtEspecialidad2.setBackground(new java.awt.Color(255, 255, 255));
        txtEspecialidad2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtEspecialidad2.setForeground(new java.awt.Color(30, 29, 26));
        txtEspecialidad2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEspecialidad2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_filtroMedico.add(txtEspecialidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 130, 30));

        txtEspecialidad3.setBackground(new java.awt.Color(255, 255, 255));
        txtEspecialidad3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtEspecialidad3.setForeground(new java.awt.Color(30, 29, 26));
        txtEspecialidad3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEspecialidad3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_filtroMedico.add(txtEspecialidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 130, 30));

        txtEspecialidad4.setBackground(new java.awt.Color(255, 255, 255));
        txtEspecialidad4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtEspecialidad4.setForeground(new java.awt.Color(30, 29, 26));
        txtEspecialidad4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEspecialidad4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtEspecialidad4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEspecialidad4ActionPerformed(evt);
            }
        });
        jPanel2_filtroMedico.add(txtEspecialidad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 130, 30));

        jButton_VisualizarMedico2.setBackground(new java.awt.Color(106, 100, 90));
        jButton_VisualizarMedico2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton_VisualizarMedico2.setForeground(new java.awt.Color(30, 29, 26));
        jButton_VisualizarMedico2.setText("Ver");
        jButton_VisualizarMedico2.setBorder(null);
        jButton_VisualizarMedico2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VisualizarMedico2ActionPerformed(evt);
            }
        });
        jPanel2_filtroMedico.add(jButton_VisualizarMedico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 100, 30));

        jButton_VisualizarMedico3.setBackground(new java.awt.Color(106, 100, 90));
        jButton_VisualizarMedico3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton_VisualizarMedico3.setForeground(new java.awt.Color(30, 29, 26));
        jButton_VisualizarMedico3.setText("Ver");
        jButton_VisualizarMedico3.setBorder(null);
        jButton_VisualizarMedico3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VisualizarMedico3ActionPerformed(evt);
            }
        });
        jPanel2_filtroMedico.add(jButton_VisualizarMedico3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 100, 30));

        jButton_VisualizarMedico4.setBackground(new java.awt.Color(106, 100, 90));
        jButton_VisualizarMedico4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton_VisualizarMedico4.setForeground(new java.awt.Color(30, 29, 26));
        jButton_VisualizarMedico4.setText("Ver");
        jButton_VisualizarMedico4.setBorder(null);
        jButton_VisualizarMedico4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VisualizarMedico4ActionPerformed(evt);
            }
        });
        jPanel2_filtroMedico.add(jButton_VisualizarMedico4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 100, 30));

        jPanel_Central.add(jPanel2_filtroMedico, "card8");

        jPanel2_medico1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2_medico1.setPreferredSize(new java.awt.Dimension(620, 420));
        jPanel2_medico1.setRequestFocusEnabled(false);
        jPanel2_medico1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_InfoMedica.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel_InfoMedica.setForeground(new java.awt.Color(0, 10, 26));
        jLabel_InfoMedica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_InfoMedica.setText("INFORMACIÓN MÉDICA");
        jLabel_InfoMedica.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_InfoMedica.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2_medico1.add(jLabel_InfoMedica, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 230, 28));

        jLabel_idioma.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_idioma.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_idioma.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_idioma.setText("Idiomas:");
        jPanel2_medico1.add(jLabel_idioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, 30));

        txtidiomas.setBackground(new java.awt.Color(231, 229, 218));
        txtidiomas.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtidiomas.setForeground(new java.awt.Color(30, 29, 26));
        txtidiomas.setText("idioma1 - idioma2...");
        txtidiomas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtidiomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidiomasActionPerformed(evt);
            }
        });
        jPanel2_medico1.add(txtidiomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 230, 30));

        txtCedulaMedico1.setBackground(new java.awt.Color(231, 229, 218));
        txtCedulaMedico1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCedulaMedico1.setForeground(new java.awt.Color(30, 29, 26));
        txtCedulaMedico1.setText("cedula");
        txtCedulaMedico1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCedulaMedico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaMedico1ActionPerformed(evt);
            }
        });
        jPanel2_medico1.add(txtCedulaMedico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 230, 30));

        txtSlogan.setBackground(new java.awt.Color(255, 255, 255));
        txtSlogan.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtSlogan.setForeground(new java.awt.Color(30, 29, 26));
        txtSlogan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSlogan.setText("\"slogan\"");
        txtSlogan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico1.add(txtSlogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 270, 30));

        txtFinalizacionEstudios.setBackground(new java.awt.Color(231, 229, 218));
        txtFinalizacionEstudios.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtFinalizacionEstudios.setForeground(new java.awt.Color(30, 29, 26));
        txtFinalizacionEstudios.setText("mes y año finalizacionEstudios");
        txtFinalizacionEstudios.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtFinalizacionEstudios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFinalizacionEstudiosActionPerformed(evt);
            }
        });
        jPanel2_medico1.add(txtFinalizacionEstudios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 230, 30));

        txtTituloUniversitario.setBackground(new java.awt.Color(231, 229, 218));
        txtTituloUniversitario.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtTituloUniversitario.setForeground(new java.awt.Color(30, 29, 26));
        txtTituloUniversitario.setText("tituloMedico");
        txtTituloUniversitario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTituloUniversitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloUniversitarioActionPerformed(evt);
            }
        });
        jPanel2_medico1.add(txtTituloUniversitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 230, 30));

        txtUniversidadEstudio1.setBackground(new java.awt.Color(231, 229, 218));
        txtUniversidadEstudio1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtUniversidadEstudio1.setForeground(new java.awt.Color(30, 29, 26));
        txtUniversidadEstudio1.setText("universidadEstudio");
        txtUniversidadEstudio1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtUniversidadEstudio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUniversidadEstudio1ActionPerformed(evt);
            }
        });
        jPanel2_medico1.add(txtUniversidadEstudio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 230, 30));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("FOTO???!");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2_medico1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 160, 180));

        jLabel_procedimientosRealizados.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_procedimientosRealizados.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_procedimientosRealizados.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_procedimientosRealizados.setText("Procedimientos que realiza:");
        jPanel2_medico1.add(jLabel_procedimientosRealizados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 200, 30));

        txtCorreoMedico1.setBackground(new java.awt.Color(231, 229, 218));
        txtCorreoMedico1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCorreoMedico1.setForeground(new java.awt.Color(30, 29, 26));
        txtCorreoMedico1.setText("correoElectronico");
        txtCorreoMedico1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCorreoMedico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoMedico1ActionPerformed(evt);
            }
        });
        jPanel2_medico1.add(txtCorreoMedico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 230, 30));

        jLabel_Afiliacion.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_Afiliacion.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_Afiliacion.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_Afiliacion.setText("Afiliación:");
        jPanel2_medico1.add(jLabel_Afiliacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 80, 30));

        jTextArea_procedimientoCosto.setBackground(new java.awt.Color(231, 229, 218));
        jTextArea_procedimientoCosto.setColumns(20);
        jTextArea_procedimientoCosto.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jTextArea_procedimientoCosto.setForeground(new java.awt.Color(30, 29, 26));
        jTextArea_procedimientoCosto.setRows(5);
        jTextArea_procedimientoCosto.setText("Nombre - Costo\nNombre - Costo\nNombre - Costo");
        jScrollPane2.setViewportView(jTextArea_procedimientoCosto);

        jPanel2_medico1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 300, 90));

        txtNombreMedico1.setBackground(new java.awt.Color(231, 229, 218));
        txtNombreMedico1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNombreMedico1.setForeground(new java.awt.Color(30, 29, 26));
        txtNombreMedico1.setText("nombreMedico1");
        txtNombreMedico1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2_medico1.add(txtNombreMedico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 230, 30));

        txtAfiliacionPerteneciente.setBackground(new java.awt.Color(255, 255, 255));
        txtAfiliacionPerteneciente.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtAfiliacionPerteneciente.setForeground(new java.awt.Color(30, 29, 26));
        txtAfiliacionPerteneciente.setText("Colegio Medico Cirujanos...");
        txtAfiliacionPerteneciente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico1.add(txtAfiliacionPerteneciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 230, 30));

        jLabel_educacion3.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_educacion3.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_educacion3.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_educacion3.setText("Educación:");
        jPanel2_medico1.add(jLabel_educacion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 140, 30));

        txtEspecialidadMedico1.setBackground(new java.awt.Color(255, 255, 255));
        txtEspecialidadMedico1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtEspecialidadMedico1.setForeground(new java.awt.Color(30, 29, 26));
        txtEspecialidadMedico1.setText("**Especialidad** ");
        txtEspecialidadMedico1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico1.add(txtEspecialidadMedico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 230, 30));

        txtPaisUniversidad1.setBackground(new java.awt.Color(231, 229, 218));
        txtPaisUniversidad1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtPaisUniversidad1.setForeground(new java.awt.Color(30, 29, 26));
        txtPaisUniversidad1.setText("paisUniversidad");
        txtPaisUniversidad1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPaisUniversidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisUniversidad1ActionPerformed(evt);
            }
        });
        jPanel2_medico1.add(txtPaisUniversidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 230, 30));

        jPanel_Central.add(jPanel2_medico1, "card3");

        jPanel2_medico2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2_medico2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_InfoMedica2.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel_InfoMedica2.setForeground(new java.awt.Color(0, 10, 26));
        jLabel_InfoMedica2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_InfoMedica2.setText("INFORMACIÓN MÉDICA");
        jLabel_InfoMedica2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_InfoMedica2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2_medico2.add(jLabel_InfoMedica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 230, 28));

        txtNombreMedico2.setBackground(new java.awt.Color(231, 229, 218));
        txtNombreMedico2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNombreMedico2.setForeground(new java.awt.Color(30, 29, 26));
        txtNombreMedico2.setText("nombreMedico2");
        txtNombreMedico2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2_medico2.add(txtNombreMedico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 230, 30));

        txtCedulaMedico2.setBackground(new java.awt.Color(231, 229, 218));
        txtCedulaMedico2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCedulaMedico2.setForeground(new java.awt.Color(30, 29, 26));
        txtCedulaMedico2.setText("cedula");
        txtCedulaMedico2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCedulaMedico2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaMedico2ActionPerformed(evt);
            }
        });
        jPanel2_medico2.add(txtCedulaMedico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 230, 30));

        txtCorreoMedico2.setBackground(new java.awt.Color(231, 229, 218));
        txtCorreoMedico2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCorreoMedico2.setForeground(new java.awt.Color(30, 29, 26));
        txtCorreoMedico2.setText("correoElectronico");
        txtCorreoMedico2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCorreoMedico2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoMedico2ActionPerformed(evt);
            }
        });
        jPanel2_medico2.add(txtCorreoMedico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 230, 30));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("FOTO???!");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2_medico2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 160, 180));

        txtSlogan1.setBackground(new java.awt.Color(255, 255, 255));
        txtSlogan1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtSlogan1.setForeground(new java.awt.Color(30, 29, 26));
        txtSlogan1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSlogan1.setText("\"slogan\"");
        txtSlogan1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico2.add(txtSlogan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 270, 30));

        jLabel_idioma1.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_idioma1.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_idioma1.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_idioma1.setText("Idiomas:");
        jPanel2_medico2.add(jLabel_idioma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, 30));

        txtidiomas1.setBackground(new java.awt.Color(231, 229, 218));
        txtidiomas1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtidiomas1.setForeground(new java.awt.Color(30, 29, 26));
        txtidiomas1.setText("idioma1 - idioma2...");
        txtidiomas1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtidiomas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidiomas1ActionPerformed(evt);
            }
        });
        jPanel2_medico2.add(txtidiomas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 230, 30));

        jLabel_educacion4.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_educacion4.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_educacion4.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_educacion4.setText("Educación:");
        jPanel2_medico2.add(jLabel_educacion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 140, 30));

        txtTituloUniversitario1.setBackground(new java.awt.Color(231, 229, 218));
        txtTituloUniversitario1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtTituloUniversitario1.setForeground(new java.awt.Color(30, 29, 26));
        txtTituloUniversitario1.setText("tituloMedico");
        txtTituloUniversitario1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTituloUniversitario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloUniversitario1ActionPerformed(evt);
            }
        });
        jPanel2_medico2.add(txtTituloUniversitario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 230, 30));

        txtFinalizacionEstudios1.setBackground(new java.awt.Color(231, 229, 218));
        txtFinalizacionEstudios1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtFinalizacionEstudios1.setForeground(new java.awt.Color(30, 29, 26));
        txtFinalizacionEstudios1.setText("mes y año finalizacionEstudios");
        txtFinalizacionEstudios1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtFinalizacionEstudios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFinalizacionEstudios1ActionPerformed(evt);
            }
        });
        jPanel2_medico2.add(txtFinalizacionEstudios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 230, 30));

        txtUniversidadEstudio2.setBackground(new java.awt.Color(231, 229, 218));
        txtUniversidadEstudio2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtUniversidadEstudio2.setForeground(new java.awt.Color(30, 29, 26));
        txtUniversidadEstudio2.setText("universidadEstudio");
        txtUniversidadEstudio2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtUniversidadEstudio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUniversidadEstudio2ActionPerformed(evt);
            }
        });
        jPanel2_medico2.add(txtUniversidadEstudio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 230, 30));

        txtPaisUniversidad2.setBackground(new java.awt.Color(231, 229, 218));
        txtPaisUniversidad2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtPaisUniversidad2.setForeground(new java.awt.Color(30, 29, 26));
        txtPaisUniversidad2.setText("paisUniversidad");
        txtPaisUniversidad2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPaisUniversidad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisUniversidad2ActionPerformed(evt);
            }
        });
        jPanel2_medico2.add(txtPaisUniversidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 230, 30));

        txtEspecialidadMedico2.setBackground(new java.awt.Color(255, 255, 255));
        txtEspecialidadMedico2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtEspecialidadMedico2.setForeground(new java.awt.Color(30, 29, 26));
        txtEspecialidadMedico2.setText("**Especialidad** ");
        txtEspecialidadMedico2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico2.add(txtEspecialidadMedico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 230, 30));

        jLabel_procedimientosRealizados1.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_procedimientosRealizados1.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_procedimientosRealizados1.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_procedimientosRealizados1.setText("Procedimientos que realiza:");
        jPanel2_medico2.add(jLabel_procedimientosRealizados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 200, 30));

        jTextArea_procedimientoCosto1.setBackground(new java.awt.Color(231, 229, 218));
        jTextArea_procedimientoCosto1.setColumns(20);
        jTextArea_procedimientoCosto1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jTextArea_procedimientoCosto1.setForeground(new java.awt.Color(30, 29, 26));
        jTextArea_procedimientoCosto1.setRows(5);
        jTextArea_procedimientoCosto1.setText("Nombre - Costo\nNombre - Costo\nNombre - Costo");
        jScrollPane3.setViewportView(jTextArea_procedimientoCosto1);

        jPanel2_medico2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 300, 90));

        jLabel_Afiliacion1.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_Afiliacion1.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_Afiliacion1.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_Afiliacion1.setText("Afiliación:");
        jPanel2_medico2.add(jLabel_Afiliacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 80, 30));

        txtAfiliacionPerteneciente1.setBackground(new java.awt.Color(255, 255, 255));
        txtAfiliacionPerteneciente1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtAfiliacionPerteneciente1.setForeground(new java.awt.Color(30, 29, 26));
        txtAfiliacionPerteneciente1.setText("Colegio Medico Cirujanos...");
        txtAfiliacionPerteneciente1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico2.add(txtAfiliacionPerteneciente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 230, 30));

        jPanel_Central.add(jPanel2_medico2, "card9");

        jPanel2_medico3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2_medico3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_InfoMedica3.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel_InfoMedica3.setForeground(new java.awt.Color(0, 10, 26));
        jLabel_InfoMedica3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_InfoMedica3.setText("INFORMACIÓN MÉDICA");
        jLabel_InfoMedica3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_InfoMedica3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2_medico3.add(jLabel_InfoMedica3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 230, 28));

        txtNombreMedico3.setBackground(new java.awt.Color(231, 229, 218));
        txtNombreMedico3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNombreMedico3.setForeground(new java.awt.Color(30, 29, 26));
        txtNombreMedico3.setText("nombreMedico3");
        txtNombreMedico3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2_medico3.add(txtNombreMedico3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 230, 30));

        txtCedulaMedico3.setBackground(new java.awt.Color(231, 229, 218));
        txtCedulaMedico3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCedulaMedico3.setForeground(new java.awt.Color(30, 29, 26));
        txtCedulaMedico3.setText("cedula");
        txtCedulaMedico3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCedulaMedico3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaMedico3ActionPerformed(evt);
            }
        });
        jPanel2_medico3.add(txtCedulaMedico3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 230, 30));

        txtCorreoMedico3.setBackground(new java.awt.Color(231, 229, 218));
        txtCorreoMedico3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCorreoMedico3.setForeground(new java.awt.Color(30, 29, 26));
        txtCorreoMedico3.setText("correoElectronico");
        txtCorreoMedico3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCorreoMedico3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoMedico3ActionPerformed(evt);
            }
        });
        jPanel2_medico3.add(txtCorreoMedico3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 230, 30));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("FOTO???!");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2_medico3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 160, 180));

        txtSlogan2.setBackground(new java.awt.Color(255, 255, 255));
        txtSlogan2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtSlogan2.setForeground(new java.awt.Color(30, 29, 26));
        txtSlogan2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSlogan2.setText("\"slogan\"");
        txtSlogan2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico3.add(txtSlogan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 270, 30));

        jLabel_idioma2.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_idioma2.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_idioma2.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_idioma2.setText("Idiomas:");
        jPanel2_medico3.add(jLabel_idioma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, 30));

        txtidiomas2.setBackground(new java.awt.Color(231, 229, 218));
        txtidiomas2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtidiomas2.setForeground(new java.awt.Color(30, 29, 26));
        txtidiomas2.setText("idioma1 - idioma2...");
        txtidiomas2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtidiomas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidiomas2ActionPerformed(evt);
            }
        });
        jPanel2_medico3.add(txtidiomas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 230, 30));

        jLabel_educacion5.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_educacion5.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_educacion5.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_educacion5.setText("Educación:");
        jPanel2_medico3.add(jLabel_educacion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 140, 30));

        txtTituloUniversitario2.setBackground(new java.awt.Color(231, 229, 218));
        txtTituloUniversitario2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtTituloUniversitario2.setForeground(new java.awt.Color(30, 29, 26));
        txtTituloUniversitario2.setText("tituloMedico");
        txtTituloUniversitario2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTituloUniversitario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloUniversitario2ActionPerformed(evt);
            }
        });
        jPanel2_medico3.add(txtTituloUniversitario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 230, 30));

        txtFinalizacionEstudios2.setBackground(new java.awt.Color(231, 229, 218));
        txtFinalizacionEstudios2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtFinalizacionEstudios2.setForeground(new java.awt.Color(30, 29, 26));
        txtFinalizacionEstudios2.setText("mes y año finalizacionEstudios");
        txtFinalizacionEstudios2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtFinalizacionEstudios2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFinalizacionEstudios2ActionPerformed(evt);
            }
        });
        jPanel2_medico3.add(txtFinalizacionEstudios2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 230, 30));

        txtUniversidadEstudio3.setBackground(new java.awt.Color(231, 229, 218));
        txtUniversidadEstudio3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtUniversidadEstudio3.setForeground(new java.awt.Color(30, 29, 26));
        txtUniversidadEstudio3.setText("universidadEstudio");
        txtUniversidadEstudio3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtUniversidadEstudio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUniversidadEstudio3ActionPerformed(evt);
            }
        });
        jPanel2_medico3.add(txtUniversidadEstudio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 230, 30));

        txtPaisUniversidad3.setBackground(new java.awt.Color(231, 229, 218));
        txtPaisUniversidad3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtPaisUniversidad3.setForeground(new java.awt.Color(30, 29, 26));
        txtPaisUniversidad3.setText("paisUniversidad");
        txtPaisUniversidad3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPaisUniversidad3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisUniversidad3ActionPerformed(evt);
            }
        });
        jPanel2_medico3.add(txtPaisUniversidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 230, 30));

        txtEspecialidadMedico3.setBackground(new java.awt.Color(255, 255, 255));
        txtEspecialidadMedico3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtEspecialidadMedico3.setForeground(new java.awt.Color(30, 29, 26));
        txtEspecialidadMedico3.setText("**Especialidad** ");
        txtEspecialidadMedico3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico3.add(txtEspecialidadMedico3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 230, 30));

        jLabel_procedimientosRealizados2.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_procedimientosRealizados2.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_procedimientosRealizados2.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_procedimientosRealizados2.setText("Procedimientos que realiza:");
        jPanel2_medico3.add(jLabel_procedimientosRealizados2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 200, 30));

        jTextArea_procedimientoCosto2.setBackground(new java.awt.Color(231, 229, 218));
        jTextArea_procedimientoCosto2.setColumns(20);
        jTextArea_procedimientoCosto2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jTextArea_procedimientoCosto2.setForeground(new java.awt.Color(30, 29, 26));
        jTextArea_procedimientoCosto2.setRows(5);
        jTextArea_procedimientoCosto2.setText("Nombre - Costo\nNombre - Costo\nNombre - Costo");
        jScrollPane4.setViewportView(jTextArea_procedimientoCosto2);

        jPanel2_medico3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 300, 90));

        jLabel_Afiliacion2.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_Afiliacion2.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_Afiliacion2.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_Afiliacion2.setText("Afiliación:");
        jPanel2_medico3.add(jLabel_Afiliacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 80, 30));

        txtAfiliacionPerteneciente2.setBackground(new java.awt.Color(255, 255, 255));
        txtAfiliacionPerteneciente2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtAfiliacionPerteneciente2.setForeground(new java.awt.Color(30, 29, 26));
        txtAfiliacionPerteneciente2.setText("Colegio Medico Cirujanos...");
        txtAfiliacionPerteneciente2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico3.add(txtAfiliacionPerteneciente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 230, 30));

        jPanel_Central.add(jPanel2_medico3, "card10");

        jPanel2_medico4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2_medico4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_InfoMedica4.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel_InfoMedica4.setForeground(new java.awt.Color(0, 10, 26));
        jLabel_InfoMedica4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_InfoMedica4.setText("INFORMACIÓN MÉDICA");
        jLabel_InfoMedica4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_InfoMedica4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2_medico4.add(jLabel_InfoMedica4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 230, 28));

        txtNombreMedico4.setBackground(new java.awt.Color(231, 229, 218));
        txtNombreMedico4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNombreMedico4.setForeground(new java.awt.Color(30, 29, 26));
        txtNombreMedico4.setText("nombreMedico4");
        txtNombreMedico4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2_medico4.add(txtNombreMedico4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 230, 30));

        txtCedulaMedico4.setBackground(new java.awt.Color(231, 229, 218));
        txtCedulaMedico4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCedulaMedico4.setForeground(new java.awt.Color(30, 29, 26));
        txtCedulaMedico4.setText("cedula");
        txtCedulaMedico4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCedulaMedico4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaMedico4ActionPerformed(evt);
            }
        });
        jPanel2_medico4.add(txtCedulaMedico4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 230, 30));

        txtCorreoMedico4.setBackground(new java.awt.Color(231, 229, 218));
        txtCorreoMedico4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCorreoMedico4.setForeground(new java.awt.Color(30, 29, 26));
        txtCorreoMedico4.setText("correoElectronico");
        txtCorreoMedico4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCorreoMedico4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoMedico4ActionPerformed(evt);
            }
        });
        jPanel2_medico4.add(txtCorreoMedico4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 230, 30));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("FOTO???!");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2_medico4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 160, 180));

        txtSlogan3.setBackground(new java.awt.Color(255, 255, 255));
        txtSlogan3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtSlogan3.setForeground(new java.awt.Color(30, 29, 26));
        txtSlogan3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSlogan3.setText("\"slogan\"");
        txtSlogan3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico4.add(txtSlogan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 270, 30));

        jLabel_idioma3.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_idioma3.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_idioma3.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_idioma3.setText("Idiomas:");
        jPanel2_medico4.add(jLabel_idioma3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, 30));

        txtidiomas3.setBackground(new java.awt.Color(231, 229, 218));
        txtidiomas3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtidiomas3.setForeground(new java.awt.Color(30, 29, 26));
        txtidiomas3.setText("idioma1 - idioma2...");
        txtidiomas3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtidiomas3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidiomas3ActionPerformed(evt);
            }
        });
        jPanel2_medico4.add(txtidiomas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 230, 30));

        jLabel_educacion6.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_educacion6.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_educacion6.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_educacion6.setText("Educación:");
        jPanel2_medico4.add(jLabel_educacion6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 140, 30));

        txtTituloUniversitario3.setBackground(new java.awt.Color(231, 229, 218));
        txtTituloUniversitario3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtTituloUniversitario3.setForeground(new java.awt.Color(30, 29, 26));
        txtTituloUniversitario3.setText("tituloMedico");
        txtTituloUniversitario3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTituloUniversitario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloUniversitario3ActionPerformed(evt);
            }
        });
        jPanel2_medico4.add(txtTituloUniversitario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 230, 30));

        txtFinalizacionEstudios3.setBackground(new java.awt.Color(231, 229, 218));
        txtFinalizacionEstudios3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtFinalizacionEstudios3.setForeground(new java.awt.Color(30, 29, 26));
        txtFinalizacionEstudios3.setText("mes y año finalizacionEstudios");
        txtFinalizacionEstudios3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtFinalizacionEstudios3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFinalizacionEstudios3ActionPerformed(evt);
            }
        });
        jPanel2_medico4.add(txtFinalizacionEstudios3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 230, 30));

        txtUniversidadEstudio4.setBackground(new java.awt.Color(231, 229, 218));
        txtUniversidadEstudio4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtUniversidadEstudio4.setForeground(new java.awt.Color(30, 29, 26));
        txtUniversidadEstudio4.setText("universidadEstudio");
        txtUniversidadEstudio4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtUniversidadEstudio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUniversidadEstudio4ActionPerformed(evt);
            }
        });
        jPanel2_medico4.add(txtUniversidadEstudio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 230, 30));

        txtPaisUniversidad4.setBackground(new java.awt.Color(231, 229, 218));
        txtPaisUniversidad4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtPaisUniversidad4.setForeground(new java.awt.Color(30, 29, 26));
        txtPaisUniversidad4.setText("paisUniversidad");
        txtPaisUniversidad4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPaisUniversidad4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisUniversidad4ActionPerformed(evt);
            }
        });
        jPanel2_medico4.add(txtPaisUniversidad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 230, 30));

        txtEspecialidadMedico4.setBackground(new java.awt.Color(255, 255, 255));
        txtEspecialidadMedico4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtEspecialidadMedico4.setForeground(new java.awt.Color(30, 29, 26));
        txtEspecialidadMedico4.setText("**Especialidad** ");
        txtEspecialidadMedico4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico4.add(txtEspecialidadMedico4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 230, 30));

        jLabel_procedimientosRealizados3.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_procedimientosRealizados3.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_procedimientosRealizados3.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_procedimientosRealizados3.setText("Procedimientos que realiza:");
        jPanel2_medico4.add(jLabel_procedimientosRealizados3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 200, 30));

        jTextArea_procedimientoCosto3.setBackground(new java.awt.Color(231, 229, 218));
        jTextArea_procedimientoCosto3.setColumns(20);
        jTextArea_procedimientoCosto3.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jTextArea_procedimientoCosto3.setForeground(new java.awt.Color(30, 29, 26));
        jTextArea_procedimientoCosto3.setRows(5);
        jTextArea_procedimientoCosto3.setText("Nombre - Costo\nNombre - Costo\nNombre - Costo");
        jScrollPane5.setViewportView(jTextArea_procedimientoCosto3);

        jPanel2_medico4.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 300, 90));

        jLabel_Afiliacion3.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_Afiliacion3.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_Afiliacion3.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_Afiliacion3.setText("Afiliación:");
        jPanel2_medico4.add(jLabel_Afiliacion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 80, 30));

        txtAfiliacionPerteneciente3.setBackground(new java.awt.Color(255, 255, 255));
        txtAfiliacionPerteneciente3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtAfiliacionPerteneciente3.setForeground(new java.awt.Color(30, 29, 26));
        txtAfiliacionPerteneciente3.setText("Colegio Medico Cirujanos...");
        txtAfiliacionPerteneciente3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_medico4.add(txtAfiliacionPerteneciente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 230, 30));

        jPanel_Central.add(jPanel2_medico4, "card11");

        jPanel3_filtroClinica.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3_filtroClinica.setForeground(new java.awt.Color(255, 255, 204));
        jPanel3_filtroClinica.setPreferredSize(new java.awt.Dimension(620, 420));
        jPanel3_filtroClinica.setRequestFocusEnabled(false);
        jPanel3_filtroClinica.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_InfoMedica1.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel_InfoMedica1.setForeground(new java.awt.Color(0, 10, 26));
        jLabel_InfoMedica1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_InfoMedica1.setText("REGISTRO CLÍNICA");
        jLabel_InfoMedica1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_InfoMedica1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel3_filtroClinica.add(jLabel_InfoMedica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 230, 28));

        jLabel_filtroNumeroClinica.setBackground(new java.awt.Color(231, 229, 218));
        jLabel_filtroNumeroClinica.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_filtroNumeroClinica.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_filtroNumeroClinica.setText("Número Clínica:");
        jPanel3_filtroClinica.add(jLabel_filtroNumeroClinica, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 120, 30));

        txtNumeroClinica1.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroClinica1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNumeroClinica1.setForeground(new java.awt.Color(30, 29, 26));
        txtNumeroClinica1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumeroClinica1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNumeroClinica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroClinica1ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica.add(txtNumeroClinica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 130, 30));

        jButton_VisualizarClinica1.setBackground(new java.awt.Color(106, 100, 90));
        jButton_VisualizarClinica1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton_VisualizarClinica1.setForeground(new java.awt.Color(30, 29, 26));
        jButton_VisualizarClinica1.setText("Ver");
        jButton_VisualizarClinica1.setBorder(null);
        jButton_VisualizarClinica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VisualizarClinica1ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica.add(jButton_VisualizarClinica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 100, 30));

        jLabel_filtroNombreClinica.setBackground(new java.awt.Color(231, 229, 218));
        jLabel_filtroNombreClinica.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_filtroNombreClinica.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_filtroNombreClinica.setText("Nombre Clínica:");
        jPanel3_filtroClinica.add(jLabel_filtroNombreClinica, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 120, 30));

        txtnombreClinica1.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreClinica1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnombreClinica1.setForeground(new java.awt.Color(30, 29, 26));
        txtnombreClinica1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombreClinica1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtnombreClinica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreClinica1ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica.add(txtnombreClinica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 200, 30));

        txtnombreClinica2.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreClinica2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnombreClinica2.setForeground(new java.awt.Color(30, 29, 26));
        txtnombreClinica2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombreClinica2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtnombreClinica2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreClinica2ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica.add(txtnombreClinica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 200, 30));

        txtNumeroClinica2.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroClinica2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNumeroClinica2.setForeground(new java.awt.Color(30, 29, 26));
        txtNumeroClinica2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumeroClinica2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNumeroClinica2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroClinica2ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica.add(txtNumeroClinica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 130, 30));

        txtnombreClinica3.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreClinica3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnombreClinica3.setForeground(new java.awt.Color(30, 29, 26));
        txtnombreClinica3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombreClinica3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtnombreClinica3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreClinica3ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica.add(txtnombreClinica3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 200, 30));

        txtNumeroClinica3.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroClinica3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNumeroClinica3.setForeground(new java.awt.Color(30, 29, 26));
        txtNumeroClinica3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumeroClinica3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNumeroClinica3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroClinica3ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica.add(txtNumeroClinica3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 130, 30));

        txtnombreClinica4.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreClinica4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnombreClinica4.setForeground(new java.awt.Color(30, 29, 26));
        txtnombreClinica4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombreClinica4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtnombreClinica4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreClinica4ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica.add(txtnombreClinica4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 200, 30));

        txtNumeroClinica4.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroClinica4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNumeroClinica4.setForeground(new java.awt.Color(30, 29, 26));
        txtNumeroClinica4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumeroClinica4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNumeroClinica4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroClinica4ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica.add(txtNumeroClinica4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 130, 30));

        jButton_VisualizarClinica2.setBackground(new java.awt.Color(106, 100, 90));
        jButton_VisualizarClinica2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton_VisualizarClinica2.setForeground(new java.awt.Color(30, 29, 26));
        jButton_VisualizarClinica2.setText("Ver");
        jButton_VisualizarClinica2.setBorder(null);
        jButton_VisualizarClinica2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VisualizarClinica2ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica.add(jButton_VisualizarClinica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 100, 30));

        jButton_VisualizarClinica3.setBackground(new java.awt.Color(106, 100, 90));
        jButton_VisualizarClinica3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton_VisualizarClinica3.setForeground(new java.awt.Color(30, 29, 26));
        jButton_VisualizarClinica3.setText("Ver");
        jButton_VisualizarClinica3.setBorder(null);
        jButton_VisualizarClinica3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VisualizarClinica3ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica.add(jButton_VisualizarClinica3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 100, 30));

        jButton_VisualizarClinica4.setBackground(new java.awt.Color(106, 100, 90));
        jButton_VisualizarClinica4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton_VisualizarClinica4.setForeground(new java.awt.Color(30, 29, 26));
        jButton_VisualizarClinica4.setText("Ver");
        jButton_VisualizarClinica4.setBorder(null);
        jButton_VisualizarClinica4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VisualizarClinica4ActionPerformed(evt);
            }
        });
        jPanel3_filtroClinica.add(jButton_VisualizarClinica4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 100, 30));

        jPanel_Central.add(jPanel3_filtroClinica, "card4");

        jPanel3_clinica1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3_clinica1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_InfoClinica1.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel_InfoClinica1.setForeground(new java.awt.Color(0, 10, 26));
        jLabel_InfoClinica1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_InfoClinica1.setText("INFORMACIÓN CLÍNICA");
        jLabel_InfoClinica1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_InfoClinica1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel3_clinica1.add(jLabel_InfoClinica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 230, 28));

        txtDistrito1.setBackground(new java.awt.Color(231, 229, 218));
        txtDistrito1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtDistrito1.setForeground(new java.awt.Color(30, 29, 26));
        txtDistrito1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica1.add(txtDistrito1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 170, 30));

        txtDireccionGeneral1.setBackground(new java.awt.Color(231, 229, 218));
        txtDireccionGeneral1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtDireccionGeneral1.setForeground(new java.awt.Color(30, 29, 26));
        txtDireccionGeneral1.setText("direccionGeneral");
        txtDireccionGeneral1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica1.add(txtDireccionGeneral1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 340, 30));

        jLabel_infoContacto1.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_infoContacto1.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_infoContacto1.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_infoContacto1.setText("Información de Contacto:");
        jPanel3_clinica1.add(jLabel_infoContacto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 180, 30));

        jLabel_direccion1.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_direccion1.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_direccion1.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_direccion1.setText("Dirección:");
        jPanel3_clinica1.add(jLabel_direccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 140, 30));

        txtnumeroClinica1.setBackground(new java.awt.Color(231, 229, 218));
        txtnumeroClinica1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnumeroClinica1.setForeground(new java.awt.Color(30, 29, 26));
        txtnumeroClinica1.setText("NumeroClinica");
        txtnumeroClinica1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica1.add(txtnumeroClinica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 230, 30));

        txtNombreClinica1.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreClinica1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNombreClinica1.setForeground(new java.awt.Color(30, 29, 26));
        txtNombreClinica1.setText("**NombreClinica1**");
        txtNombreClinica1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3_clinica1.add(txtNombreClinica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 230, 30));

        jLabel_distrito1.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_distrito1.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_distrito1.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_distrito1.setText("Distrito:");
        jPanel3_clinica1.add(jLabel_distrito1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 80, 30));

        jLabel_provincia1.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_provincia1.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_provincia1.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_provincia1.setText("Provincia:");
        jPanel3_clinica1.add(jLabel_provincia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 90, 30));

        jLabel_canton1.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_canton1.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_canton1.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_canton1.setText("Canton:");
        jPanel3_clinica1.add(jLabel_canton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 80, 30));

        txtProvincia1.setBackground(new java.awt.Color(231, 229, 218));
        txtProvincia1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtProvincia1.setForeground(new java.awt.Color(30, 29, 26));
        txtProvincia1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica1.add(txtProvincia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 170, 30));

        txtCanton1.setBackground(new java.awt.Color(231, 229, 218));
        txtCanton1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCanton1.setForeground(new java.awt.Color(30, 29, 26));
        txtCanton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica1.add(txtCanton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 170, 30));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("FOTO???!");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3_clinica1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 190, 180));

        jPanel_Central.add(jPanel3_clinica1, "card12");

        jPanel3_clinica2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3_clinica2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_InfoClinica2.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel_InfoClinica2.setForeground(new java.awt.Color(0, 10, 26));
        jLabel_InfoClinica2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_InfoClinica2.setText("INFORMACIÓN CLÍNICA");
        jLabel_InfoClinica2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_InfoClinica2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel3_clinica2.add(jLabel_InfoClinica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 230, 28));

        txtNombreClinica2.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreClinica2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNombreClinica2.setForeground(new java.awt.Color(30, 29, 26));
        txtNombreClinica2.setText("**NombreClinica2**");
        txtNombreClinica2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3_clinica2.add(txtNombreClinica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 230, 30));

        jLabel_infoContacto2.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_infoContacto2.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_infoContacto2.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_infoContacto2.setText("Información de Contacto:");
        jPanel3_clinica2.add(jLabel_infoContacto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 180, 30));

        txtnumeroClinica2.setBackground(new java.awt.Color(231, 229, 218));
        txtnumeroClinica2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnumeroClinica2.setForeground(new java.awt.Color(30, 29, 26));
        txtnumeroClinica2.setText("NumeroClinica");
        txtnumeroClinica2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica2.add(txtnumeroClinica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 230, 30));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("FOTO???!");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3_clinica2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 190, 180));

        jLabel_direccion2.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_direccion2.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_direccion2.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_direccion2.setText("Dirección:");
        jPanel3_clinica2.add(jLabel_direccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 140, 30));

        txtDireccionGeneral2.setBackground(new java.awt.Color(231, 229, 218));
        txtDireccionGeneral2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtDireccionGeneral2.setForeground(new java.awt.Color(30, 29, 26));
        txtDireccionGeneral2.setText("direccionGeneral");
        txtDireccionGeneral2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica2.add(txtDireccionGeneral2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 340, 30));

        jLabel_provincia2.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_provincia2.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_provincia2.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_provincia2.setText("Provincia:");
        jPanel3_clinica2.add(jLabel_provincia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 90, 30));

        txtProvincia2.setBackground(new java.awt.Color(231, 229, 218));
        txtProvincia2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtProvincia2.setForeground(new java.awt.Color(30, 29, 26));
        txtProvincia2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica2.add(txtProvincia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 170, 30));

        jLabel_canton2.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_canton2.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_canton2.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_canton2.setText("Canton:");
        jPanel3_clinica2.add(jLabel_canton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 80, 30));

        txtCanton2.setBackground(new java.awt.Color(231, 229, 218));
        txtCanton2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCanton2.setForeground(new java.awt.Color(30, 29, 26));
        txtCanton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica2.add(txtCanton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 170, 30));

        jLabel_distrito2.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_distrito2.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_distrito2.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_distrito2.setText("Distrito:");
        jPanel3_clinica2.add(jLabel_distrito2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 80, 30));

        txtDistrito2.setBackground(new java.awt.Color(231, 229, 218));
        txtDistrito2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtDistrito2.setForeground(new java.awt.Color(30, 29, 26));
        txtDistrito2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica2.add(txtDistrito2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 170, 30));

        jPanel_Central.add(jPanel3_clinica2, "card13");

        jPanel3_clinica3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3_clinica3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_InfoClinica3.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel_InfoClinica3.setForeground(new java.awt.Color(0, 10, 26));
        jLabel_InfoClinica3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_InfoClinica3.setText("INFORMACIÓN CLÍNICA");
        jLabel_InfoClinica3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_InfoClinica3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel3_clinica3.add(jLabel_InfoClinica3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 230, 28));

        txtNombreClinica3.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreClinica3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNombreClinica3.setForeground(new java.awt.Color(30, 29, 26));
        txtNombreClinica3.setText("**NombreClinica3**");
        txtNombreClinica3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3_clinica3.add(txtNombreClinica3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 230, 30));

        jLabel_infoContacto3.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_infoContacto3.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_infoContacto3.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_infoContacto3.setText("Información de Contacto:");
        jPanel3_clinica3.add(jLabel_infoContacto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 180, 30));

        txtnumeroClinica3.setBackground(new java.awt.Color(231, 229, 218));
        txtnumeroClinica3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnumeroClinica3.setForeground(new java.awt.Color(30, 29, 26));
        txtnumeroClinica3.setText("NumeroClinica");
        txtnumeroClinica3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica3.add(txtnumeroClinica3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 230, 30));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("FOTO???!");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3_clinica3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 190, 180));

        jLabel_direccion3.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_direccion3.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_direccion3.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_direccion3.setText("Dirección:");
        jPanel3_clinica3.add(jLabel_direccion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 140, 30));

        txtDireccionGeneral3.setBackground(new java.awt.Color(231, 229, 218));
        txtDireccionGeneral3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtDireccionGeneral3.setForeground(new java.awt.Color(30, 29, 26));
        txtDireccionGeneral3.setText("direccionGeneral");
        txtDireccionGeneral3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica3.add(txtDireccionGeneral3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 340, 30));

        jLabel_provincia3.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_provincia3.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_provincia3.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_provincia3.setText("Provincia:");
        jPanel3_clinica3.add(jLabel_provincia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 90, 30));

        txtProvincia3.setBackground(new java.awt.Color(231, 229, 218));
        txtProvincia3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtProvincia3.setForeground(new java.awt.Color(30, 29, 26));
        txtProvincia3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica3.add(txtProvincia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 170, 30));

        jLabel_canton3.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_canton3.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_canton3.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_canton3.setText("Canton:");
        jPanel3_clinica3.add(jLabel_canton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 80, 30));

        txtCanton3.setBackground(new java.awt.Color(231, 229, 218));
        txtCanton3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCanton3.setForeground(new java.awt.Color(30, 29, 26));
        txtCanton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica3.add(txtCanton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 170, 30));

        jLabel_distrito3.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_distrito3.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_distrito3.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_distrito3.setText("Distrito:");
        jPanel3_clinica3.add(jLabel_distrito3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 80, 30));

        txtDistrito3.setBackground(new java.awt.Color(231, 229, 218));
        txtDistrito3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtDistrito3.setForeground(new java.awt.Color(30, 29, 26));
        txtDistrito3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica3.add(txtDistrito3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 170, 30));

        jPanel_Central.add(jPanel3_clinica3, "card14");

        jPanel3_clinica4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3_clinica4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_InfoClinica4.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel_InfoClinica4.setForeground(new java.awt.Color(0, 10, 26));
        jLabel_InfoClinica4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_InfoClinica4.setText("INFORMACIÓN CLÍNICA");
        jLabel_InfoClinica4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_InfoClinica4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel3_clinica4.add(jLabel_InfoClinica4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 230, 28));

        txtNombreClinica4.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreClinica4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNombreClinica4.setForeground(new java.awt.Color(30, 29, 26));
        txtNombreClinica4.setText("**NombreClinica4**");
        txtNombreClinica4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3_clinica4.add(txtNombreClinica4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 230, 30));

        jLabel_infoContacto4.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_infoContacto4.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_infoContacto4.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_infoContacto4.setText("Información de Contacto:");
        jPanel3_clinica4.add(jLabel_infoContacto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 180, 30));

        txtnumeroClinica4.setBackground(new java.awt.Color(231, 229, 218));
        txtnumeroClinica4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnumeroClinica4.setForeground(new java.awt.Color(30, 29, 26));
        txtnumeroClinica4.setText("NumeroClinica");
        txtnumeroClinica4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica4.add(txtnumeroClinica4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 230, 30));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("FOTO???!");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3_clinica4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 190, 180));

        jLabel_direccion4.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_direccion4.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_direccion4.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_direccion4.setText("Dirección:");
        jPanel3_clinica4.add(jLabel_direccion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 140, 30));

        txtDireccionGeneral4.setBackground(new java.awt.Color(231, 229, 218));
        txtDireccionGeneral4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtDireccionGeneral4.setForeground(new java.awt.Color(30, 29, 26));
        txtDireccionGeneral4.setText("direccionGeneral");
        txtDireccionGeneral4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica4.add(txtDireccionGeneral4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 340, 30));

        jLabel_provincia4.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_provincia4.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_provincia4.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_provincia4.setText("Provincia:");
        jPanel3_clinica4.add(jLabel_provincia4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 90, 30));

        txtProvincia4.setBackground(new java.awt.Color(231, 229, 218));
        txtProvincia4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtProvincia4.setForeground(new java.awt.Color(30, 29, 26));
        txtProvincia4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica4.add(txtProvincia4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 170, 30));

        jLabel_canton4.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_canton4.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_canton4.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_canton4.setText("Canton:");
        jPanel3_clinica4.add(jLabel_canton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 80, 30));

        txtCanton4.setBackground(new java.awt.Color(231, 229, 218));
        txtCanton4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCanton4.setForeground(new java.awt.Color(30, 29, 26));
        txtCanton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica4.add(txtCanton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 170, 30));

        jLabel_distrito4.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_distrito4.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_distrito4.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_distrito4.setText("Distrito:");
        jPanel3_clinica4.add(jLabel_distrito4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 80, 30));

        txtDistrito4.setBackground(new java.awt.Color(231, 229, 218));
        txtDistrito4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtDistrito4.setForeground(new java.awt.Color(30, 29, 26));
        txtDistrito4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3_clinica4.add(txtDistrito4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 170, 30));

        jPanel_Central.add(jPanel3_clinica4, "card15");

        jPanel1_RegistroUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1_RegistroUsuarios.setPreferredSize(new java.awt.Dimension(620, 420));
        jPanel1_RegistroUsuarios.setRequestFocusEnabled(false);
        jPanel1_RegistroUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_InfoPersonal.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel_InfoPersonal.setForeground(new java.awt.Color(0, 10, 26));
        jLabel_InfoPersonal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_InfoPersonal.setText("INFORMACIÓN PERSONAL");
        jLabel_InfoPersonal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_InfoPersonal.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1_RegistroUsuarios.add(jLabel_InfoPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 230, 28));

        jLabel_NombrePadecimiento.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_NombrePadecimiento.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_NombrePadecimiento.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_NombrePadecimiento.setText("Nombre Padecimiento:");
        jPanel1_RegistroUsuarios.add(jLabel_NombrePadecimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 160, 30));

        txtCorreoElectronico.setBackground(new java.awt.Color(231, 229, 218));
        txtCorreoElectronico.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCorreoElectronico.setForeground(new java.awt.Color(30, 29, 26));
        txtCorreoElectronico.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCorreoElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoElectronicoActionPerformed(evt);
            }
        });
        jPanel1_RegistroUsuarios.add(txtCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 230, 30));

        jLabel_descripPadecimiento.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_descripPadecimiento.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_descripPadecimiento.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_descripPadecimiento.setText("Descripción Padecimiento:");
        jPanel1_RegistroUsuarios.add(jLabel_descripPadecimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 190, 30));

        txtApeliido.setBackground(new java.awt.Color(231, 229, 218));
        txtApeliido.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtApeliido.setForeground(new java.awt.Color(30, 29, 26));
        txtApeliido.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1_RegistroUsuarios.add(txtApeliido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 230, 30));

        jLabel_cedula.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_cedula.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_cedula.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_cedula.setText("Edad:");
        jPanel1_RegistroUsuarios.add(jLabel_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 140, 30));

        txtedad.setBackground(new java.awt.Color(231, 229, 218));
        txtedad.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtedad.setForeground(new java.awt.Color(30, 29, 26));
        txtedad.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedadActionPerformed(evt);
            }
        });
        jPanel1_RegistroUsuarios.add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 230, 30));

        jLabel_correoElectronico.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_correoElectronico.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_correoElectronico.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_correoElectronico.setText("¿Sufre algun padecimiento?");
        jPanel1_RegistroUsuarios.add(jLabel_correoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 190, 30));

        jLabel_tipoPadecimiento.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_tipoPadecimiento.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_tipoPadecimiento.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_tipoPadecimiento.setText("Tipo Padecimiento:");
        jPanel1_RegistroUsuarios.add(jLabel_tipoPadecimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 140, 30));

        jComboBox_nombrePadecimiento.setBackground(new java.awt.Color(231, 229, 218));
        jComboBox_nombrePadecimiento.setFont(new java.awt.Font("Microsoft YaHei", 0, 13)); // NOI18N
        jComboBox_nombrePadecimiento.setForeground(new java.awt.Color(30, 29, 26));
        jComboBox_nombrePadecimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" }));
        jComboBox_nombrePadecimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_nombrePadecimientoActionPerformed(evt);
            }
        });
        jPanel1_RegistroUsuarios.add(jComboBox_nombrePadecimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 230, 30));

        ibiFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ibiFoto.setText("FOTO");
        ibiFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1_RegistroUsuarios.add(ibiFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 230, 260));

        txtdescrptionPadecimiento.setBackground(new java.awt.Color(231, 229, 218));
        txtdescrptionPadecimiento.setColumns(20);
        txtdescrptionPadecimiento.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        txtdescrptionPadecimiento.setForeground(new java.awt.Color(30, 29, 26));
        txtdescrptionPadecimiento.setRows(5);
        jScrollPane1.setViewportView(txtdescrptionPadecimiento);

        jPanel1_RegistroUsuarios.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 240, 90));

        jLabel_nombre.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_nombre.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_nombre.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_nombre.setText("Apeliido:");
        jPanel1_RegistroUsuarios.add(jLabel_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, 30));

        ConboxEleccion.setBackground(new java.awt.Color(231, 229, 218));
        ConboxEleccion.setFont(new java.awt.Font("Microsoft YaHei", 0, 13)); // NOI18N
        ConboxEleccion.setForeground(new java.awt.Color(30, 29, 26));
        ConboxEleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        ConboxEleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConboxEleccionActionPerformed(evt);
            }
        });
        jPanel1_RegistroUsuarios.add(ConboxEleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 80, 30));

        btnCargarFoto.setText("Cargar Foto ");
        btnCargarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarFotoActionPerformed(evt);
            }
        });
        jPanel1_RegistroUsuarios.add(btnCargarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 120, 30));

        jLabel_nombre1.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_nombre1.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_nombre1.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_nombre1.setText("Nombre:");
        jPanel1_RegistroUsuarios.add(jLabel_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 140, 30));

        txtNombre.setBackground(new java.awt.Color(231, 229, 218));
        txtNombre.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(30, 29, 26));
        txtNombre.setToolTipText("");
        txtNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtNombre.setDropMode(javax.swing.DropMode.INSERT);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1_RegistroUsuarios.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 230, 30));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1_RegistroUsuarios.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        jLabel_cedula1.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_cedula1.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_cedula1.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_cedula1.setText("Cédula:");
        jPanel1_RegistroUsuarios.add(jLabel_cedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 140, 30));

        txtCedula1.setBackground(new java.awt.Color(231, 229, 218));
        txtCedula1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtCedula1.setForeground(new java.awt.Color(30, 29, 26));
        txtCedula1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1_RegistroUsuarios.add(txtCedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 230, 30));

        jLabel_correoElectronico1.setBackground(new java.awt.Color(169, 164, 160));
        jLabel_correoElectronico1.setFont(new java.awt.Font("Microsoft YaHei", 1, 13)); // NOI18N
        jLabel_correoElectronico1.setForeground(new java.awt.Color(30, 29, 26));
        jLabel_correoElectronico1.setText("Correo Electrónico:");
        jPanel1_RegistroUsuarios.add(jLabel_correoElectronico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 140, 30));

        jComboBox_tipoPadecimiento1.setBackground(new java.awt.Color(231, 229, 218));
        jComboBox_tipoPadecimiento1.setFont(new java.awt.Font("Microsoft YaHei", 0, 13)); // NOI18N
        jComboBox_tipoPadecimiento1.setForeground(new java.awt.Color(30, 29, 26));
        jComboBox_tipoPadecimiento1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" }));
        jComboBox_tipoPadecimiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_tipoPadecimiento1ActionPerformed(evt);
            }
        });
        jPanel1_RegistroUsuarios.add(jComboBox_tipoPadecimiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 230, 30));

        jPanel_Central.add(jPanel1_RegistroUsuarios, "card2");

        jPanel1_Base.add(jPanel_Central, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 700, 580));

        getContentPane().add(jPanel1_Base, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 904, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcedimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcedimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProcedimientoActionPerformed

    private void btnPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPacienteActionPerformed

    private void btnMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMedicoActionPerformed

    private void btnClinicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClinicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClinicaActionPerformed

    private void btnCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCitaActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void mouseclicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseclicked

        //Panel Slider 
        if (evt.getSource() == btnRegistro) {
            jPanel1_RegistroUsuarios.setVisible(true);
            jPanel2_filtroMedico.setVisible(false);
            jPanel2_medico1.setVisible(false);
            jPanel3_filtroClinica.setVisible(false);
            jPanel4.setVisible(false);
            jPanel5.setVisible(false);
            jPanel6.setVisible(false);
        }

        if (evt.getSource() == btnMedico) {
            jPanel1_RegistroUsuarios.setVisible(false);
            jPanel2_filtroMedico.setVisible(true);
            jPanel2_medico1.setVisible(false);
            jPanel3_filtroClinica.setVisible(false);
            jPanel4.setVisible(false);
            jPanel5.setVisible(false);
            jPanel6.setVisible(false);
        }

        if (evt.getSource() == btnClinica) {
            jPanel1_RegistroUsuarios.setVisible(false);
            jPanel2_filtroMedico.setVisible(false);
            jPanel2_medico1.setVisible(false);
            jPanel3_filtroClinica.setVisible(true);
            jPanel4.setVisible(false);
            jPanel5.setVisible(false);
            jPanel6.setVisible(false);
        }

        if (evt.getSource() == btnProcedimiento) {
            jPanel1_RegistroUsuarios.setVisible(false);
            jPanel2_filtroMedico.setVisible(false);
            jPanel2_medico1.setVisible(false);
            jPanel3_filtroClinica.setVisible(false);
            jPanel4.setVisible(true);
            jPanel5.setVisible(false);
            jPanel6.setVisible(false);
        }

        if (evt.getSource() == btnPaciente) {
            jPanel1_RegistroUsuarios.setVisible(false);
            jPanel2_filtroMedico.setVisible(false);
            jPanel2_medico1.setVisible(false);
            jPanel3_filtroClinica.setVisible(false);
            jPanel4.setVisible(false);
            jPanel5.setVisible(true);
            jPanel6.setVisible(false);
        }

        if (evt.getSource() == btnCita) {
            jPanel1_RegistroUsuarios.setVisible(false);
            jPanel2_filtroMedico.setVisible(false);
            jPanel2_medico1.setVisible(false);
            jPanel3_filtroClinica.setVisible(false);
            jPanel4.setVisible(false);
            jPanel5.setVisible(false);
            jPanel6.setVisible(true);
        }
    }//GEN-LAST:event_mouseclicked

    private void txtidiomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidiomasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidiomasActionPerformed

    private void txtCedulaMedico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaMedico1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaMedico1ActionPerformed

    private void txtFinalizacionEstudiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFinalizacionEstudiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFinalizacionEstudiosActionPerformed

    private void txtTituloUniversitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloUniversitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloUniversitarioActionPerformed

    private void txtUniversidadEstudio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUniversidadEstudio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUniversidadEstudio1ActionPerformed

    private void txtCorreoMedico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoMedico1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoMedico1ActionPerformed

    private void txtPaisUniversidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisUniversidad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisUniversidad1ActionPerformed

    private void jButton_VisualizarMedico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VisualizarMedico1ActionPerformed
        // TODO add your handling code here:
        jPanel2_filtroMedico.setVisible(false);
        jPanel2_medico1.setVisible(true);
        jPanel2_medico2.setVisible(false);
        jPanel2_medico3.setVisible(false);
        jPanel2_medico4.setVisible(false);

    }//GEN-LAST:event_jButton_VisualizarMedico1ActionPerformed

    private void txtApellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellido1ActionPerformed

    private void txtnombreMedico4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreMedico4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreMedico4ActionPerformed

    private void txtnombreMedico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreMedico1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreMedico1ActionPerformed

    private void txtApellido4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellido4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellido4ActionPerformed

    private void txtEspecialidad4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEspecialidad4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEspecialidad4ActionPerformed

    private void jButton_VisualizarMedico2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VisualizarMedico2ActionPerformed
        // TODO add your handling code here:
        jPanel2_filtroMedico.setVisible(false);
        jPanel2_medico1.setVisible(false);
        jPanel2_medico2.setVisible(true);
        jPanel2_medico3.setVisible(false);
        jPanel2_medico4.setVisible(false);
    }//GEN-LAST:event_jButton_VisualizarMedico2ActionPerformed

    private void jButton_VisualizarMedico3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VisualizarMedico3ActionPerformed
        // TODO add your handling code here:
        jPanel2_filtroMedico.setVisible(false);
        jPanel2_medico1.setVisible(false);
        jPanel2_medico2.setVisible(false);
        jPanel2_medico3.setVisible(true);
        jPanel2_medico4.setVisible(false);
    }//GEN-LAST:event_jButton_VisualizarMedico3ActionPerformed

    private void jButton_VisualizarMedico4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VisualizarMedico4ActionPerformed
        // TODO add your handling code here:
        jPanel2_filtroMedico.setVisible(false);
        jPanel2_medico1.setVisible(false);
        jPanel2_medico2.setVisible(false);
        jPanel2_medico3.setVisible(false);
        jPanel2_medico4.setVisible(true);
    }//GEN-LAST:event_jButton_VisualizarMedico4ActionPerformed

    private void txtCedulaMedico2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaMedico2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaMedico2ActionPerformed

    private void txtCorreoMedico2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoMedico2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoMedico2ActionPerformed

    private void txtidiomas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidiomas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidiomas1ActionPerformed

    private void txtTituloUniversitario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloUniversitario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloUniversitario1ActionPerformed

    private void txtFinalizacionEstudios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFinalizacionEstudios1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFinalizacionEstudios1ActionPerformed

    private void txtUniversidadEstudio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUniversidadEstudio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUniversidadEstudio2ActionPerformed

    private void txtPaisUniversidad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisUniversidad2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisUniversidad2ActionPerformed

    private void txtCedulaMedico3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaMedico3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaMedico3ActionPerformed

    private void txtCorreoMedico3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoMedico3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoMedico3ActionPerformed

    private void txtidiomas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidiomas2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidiomas2ActionPerformed

    private void txtTituloUniversitario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloUniversitario2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloUniversitario2ActionPerformed

    private void txtFinalizacionEstudios2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFinalizacionEstudios2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFinalizacionEstudios2ActionPerformed

    private void txtUniversidadEstudio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUniversidadEstudio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUniversidadEstudio3ActionPerformed

    private void txtPaisUniversidad3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisUniversidad3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisUniversidad3ActionPerformed

    private void txtCedulaMedico4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaMedico4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaMedico4ActionPerformed

    private void txtCorreoMedico4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoMedico4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoMedico4ActionPerformed

    private void txtidiomas3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidiomas3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidiomas3ActionPerformed

    private void txtTituloUniversitario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloUniversitario3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloUniversitario3ActionPerformed

    private void txtFinalizacionEstudios3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFinalizacionEstudios3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFinalizacionEstudios3ActionPerformed

    private void txtUniversidadEstudio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUniversidadEstudio4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUniversidadEstudio4ActionPerformed

    private void txtPaisUniversidad4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisUniversidad4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisUniversidad4ActionPerformed

    private void txtNumeroClinica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroClinica1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroClinica1ActionPerformed

    private void jButton_VisualizarClinica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VisualizarClinica1ActionPerformed
        // TODO add your handling code here:
        jPanel3_filtroClinica.setVisible(false);
        jPanel3_clinica1.setVisible(true);
        jPanel3_clinica2.setVisible(false);
        jPanel3_clinica3.setVisible(false);
        jPanel3_clinica4.setVisible(false);
    }//GEN-LAST:event_jButton_VisualizarClinica1ActionPerformed

    private void txtnombreClinica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreClinica1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreClinica1ActionPerformed

    private void txtnombreClinica2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreClinica2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreClinica2ActionPerformed

    private void txtNumeroClinica2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroClinica2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroClinica2ActionPerformed

    private void txtnombreClinica3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreClinica3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreClinica3ActionPerformed

    private void txtNumeroClinica3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroClinica3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroClinica3ActionPerformed

    private void txtnombreClinica4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreClinica4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreClinica4ActionPerformed

    private void txtNumeroClinica4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroClinica4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroClinica4ActionPerformed

    private void jButton_VisualizarClinica2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VisualizarClinica2ActionPerformed
        // TODO add your handling code here:
        jPanel3_filtroClinica.setVisible(false);
        jPanel3_clinica1.setVisible(false);
        jPanel3_clinica2.setVisible(true);
        jPanel3_clinica3.setVisible(false);
        jPanel3_clinica4.setVisible(false);
    }//GEN-LAST:event_jButton_VisualizarClinica2ActionPerformed

    private void jButton_VisualizarClinica3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VisualizarClinica3ActionPerformed
        // TODO add your handling code here:
        jPanel3_filtroClinica.setVisible(false);
        jPanel3_clinica1.setVisible(false);
        jPanel3_clinica2.setVisible(false);
        jPanel3_clinica3.setVisible(true);
        jPanel3_clinica4.setVisible(false);
    }//GEN-LAST:event_jButton_VisualizarClinica3ActionPerformed

    private void jButton_VisualizarClinica4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VisualizarClinica4ActionPerformed
        // TODO add your handling code here:
        jPanel3_filtroClinica.setVisible(false);
        jPanel3_clinica1.setVisible(false);
        jPanel3_clinica2.setVisible(false);
        jPanel3_clinica3.setVisible(false);
        jPanel3_clinica4.setVisible(true);
    }//GEN-LAST:event_jButton_VisualizarClinica4ActionPerformed

    // BOTON CARGAR FOTO 
    File fichero;
    private void btnCargarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarFotoActionPerformed
        int resultado;
        CargarFoto ventana = new CargarFoto();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG", "jpg", "png");
        ventana.jhCargarFoto.setFileFilter(filtro);
        resultado = ventana.jhCargarFoto.showOpenDialog(null);
        if (JFileChooser.APPROVE_OPTION == resultado) {
            fichero = ventana.jhCargarFoto.getSelectedFile();
            try {
                ImageIcon icon = new ImageIcon(fichero.toString());
                Icon icono = new ImageIcon(icon.getImage().getScaledInstance(ibiFoto.getWidth(), ibiFoto.getHeight(), Image.SCALE_DEFAULT));
                ibiFoto.setText(null);
                ibiFoto.setIcon(icono);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error abriendo la imagen " + ex);

            }
        }

    }//GEN-LAST:event_btnCargarFotoActionPerformed

    private void txtCorreoElectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoElectronicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoElectronicoActionPerformed

    private void txtedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String a = txtNombre.toString();
        String b = txtApeliido.getText();
        String c = txtCedula1.getText();
        String e = txtCorreoElectronico.getText();
        
     
        
        
       txtNombre.setText(" ");
       txtCedula1.setText(" ");
       txtedad.setText(" ");
       txtCorreoElectronico.setText(" ");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
            txtNombre.getText();        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void jComboBox_nombrePadecimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_nombrePadecimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_nombrePadecimientoActionPerformed

    private void jComboBox_tipoPadecimiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_tipoPadecimiento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_tipoPadecimiento1ActionPerformed

    private void ConboxEleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConboxEleccionActionPerformed
        String eleccion = (String) ConboxEleccion.getSelectedItem();
    }//GEN-LAST:event_ConboxEleccionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ConboxEleccion;
    private javax.swing.JButton btnCargarFoto;
    private javax.swing.JButton btnCita;
    private javax.swing.JButton btnClinica;
    private javax.swing.JButton btnMedico;
    private javax.swing.JButton btnPaciente;
    private javax.swing.JButton btnProcedimiento;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel ibiFoto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_VisualizarClinica1;
    private javax.swing.JButton jButton_VisualizarClinica2;
    private javax.swing.JButton jButton_VisualizarClinica3;
    private javax.swing.JButton jButton_VisualizarClinica4;
    private javax.swing.JButton jButton_VisualizarMedico1;
    private javax.swing.JButton jButton_VisualizarMedico2;
    private javax.swing.JButton jButton_VisualizarMedico3;
    private javax.swing.JButton jButton_VisualizarMedico4;
    private javax.swing.JComboBox<String> jComboBox_nombrePadecimiento;
    private javax.swing.JComboBox<String> jComboBox_tipoPadecimiento1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Afiliacion;
    private javax.swing.JLabel jLabel_Afiliacion1;
    private javax.swing.JLabel jLabel_Afiliacion2;
    private javax.swing.JLabel jLabel_Afiliacion3;
    private javax.swing.JLabel jLabel_InfoClinica1;
    private javax.swing.JLabel jLabel_InfoClinica2;
    private javax.swing.JLabel jLabel_InfoClinica3;
    private javax.swing.JLabel jLabel_InfoClinica4;
    private javax.swing.JLabel jLabel_InfoMedica;
    private javax.swing.JLabel jLabel_InfoMedica1;
    private javax.swing.JLabel jLabel_InfoMedica2;
    private javax.swing.JLabel jLabel_InfoMedica3;
    private javax.swing.JLabel jLabel_InfoMedica4;
    private javax.swing.JLabel jLabel_InfoPersonal;
    private javax.swing.JLabel jLabel_Menu;
    private javax.swing.JLabel jLabel_NombrePadecimiento;
    private javax.swing.JLabel jLabel_RegistroMedicos;
    private javax.swing.JLabel jLabel_canton1;
    private javax.swing.JLabel jLabel_canton2;
    private javax.swing.JLabel jLabel_canton3;
    private javax.swing.JLabel jLabel_canton4;
    private javax.swing.JLabel jLabel_cedula;
    private javax.swing.JLabel jLabel_cedula1;
    private javax.swing.JLabel jLabel_correoElectronico;
    private javax.swing.JLabel jLabel_correoElectronico1;
    private javax.swing.JLabel jLabel_descripPadecimiento;
    private javax.swing.JLabel jLabel_direccion1;
    private javax.swing.JLabel jLabel_direccion2;
    private javax.swing.JLabel jLabel_direccion3;
    private javax.swing.JLabel jLabel_direccion4;
    private javax.swing.JLabel jLabel_distrito1;
    private javax.swing.JLabel jLabel_distrito2;
    private javax.swing.JLabel jLabel_distrito3;
    private javax.swing.JLabel jLabel_distrito4;
    private javax.swing.JLabel jLabel_educacion3;
    private javax.swing.JLabel jLabel_educacion4;
    private javax.swing.JLabel jLabel_educacion5;
    private javax.swing.JLabel jLabel_educacion6;
    private javax.swing.JLabel jLabel_filtroApellido;
    private javax.swing.JLabel jLabel_filtroEspecialidad;
    private javax.swing.JLabel jLabel_filtroNombre;
    private javax.swing.JLabel jLabel_filtroNombreClinica;
    private javax.swing.JLabel jLabel_filtroNumeroClinica;
    private javax.swing.JLabel jLabel_idioma;
    private javax.swing.JLabel jLabel_idioma1;
    private javax.swing.JLabel jLabel_idioma2;
    private javax.swing.JLabel jLabel_idioma3;
    private javax.swing.JLabel jLabel_infoContacto1;
    private javax.swing.JLabel jLabel_infoContacto2;
    private javax.swing.JLabel jLabel_infoContacto3;
    private javax.swing.JLabel jLabel_infoContacto4;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JLabel jLabel_nombre1;
    private javax.swing.JLabel jLabel_procedimientosRealizados;
    private javax.swing.JLabel jLabel_procedimientosRealizados1;
    private javax.swing.JLabel jLabel_procedimientosRealizados2;
    private javax.swing.JLabel jLabel_procedimientosRealizados3;
    private javax.swing.JLabel jLabel_provincia1;
    private javax.swing.JLabel jLabel_provincia2;
    private javax.swing.JLabel jLabel_provincia3;
    private javax.swing.JLabel jLabel_provincia4;
    private javax.swing.JLabel jLabel_tipoPadecimiento;
    private javax.swing.JPanel jPanel1_Base;
    private javax.swing.JPanel jPanel1_RegistroUsuarios;
    private javax.swing.JPanel jPanel2_Menu;
    private javax.swing.JPanel jPanel2_filtroMedico;
    private javax.swing.JPanel jPanel2_medico1;
    private javax.swing.JPanel jPanel2_medico2;
    private javax.swing.JPanel jPanel2_medico3;
    private javax.swing.JPanel jPanel2_medico4;
    private javax.swing.JPanel jPanel3_Superior;
    private javax.swing.JPanel jPanel3_clinica1;
    private javax.swing.JPanel jPanel3_clinica2;
    private javax.swing.JPanel jPanel3_clinica3;
    private javax.swing.JPanel jPanel3_clinica4;
    private javax.swing.JPanel jPanel3_filtroClinica;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel_Central;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea_procedimientoCosto;
    private javax.swing.JTextArea jTextArea_procedimientoCosto1;
    private javax.swing.JTextArea jTextArea_procedimientoCosto2;
    private javax.swing.JTextArea jTextArea_procedimientoCosto3;
    private javax.swing.JTextField txtAfiliacionPerteneciente;
    private javax.swing.JTextField txtAfiliacionPerteneciente1;
    private javax.swing.JTextField txtAfiliacionPerteneciente2;
    private javax.swing.JTextField txtAfiliacionPerteneciente3;
    private javax.swing.JTextField txtApeliido;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtApellido3;
    private javax.swing.JTextField txtApellido4;
    private javax.swing.JTextField txtCanton1;
    private javax.swing.JTextField txtCanton2;
    private javax.swing.JTextField txtCanton3;
    private javax.swing.JTextField txtCanton4;
    private javax.swing.JTextField txtCedula1;
    private javax.swing.JTextField txtCedulaMedico1;
    private javax.swing.JTextField txtCedulaMedico2;
    private javax.swing.JTextField txtCedulaMedico3;
    private javax.swing.JTextField txtCedulaMedico4;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtCorreoMedico1;
    private javax.swing.JTextField txtCorreoMedico2;
    private javax.swing.JTextField txtCorreoMedico3;
    private javax.swing.JTextField txtCorreoMedico4;
    private javax.swing.JTextField txtDireccionGeneral1;
    private javax.swing.JTextField txtDireccionGeneral2;
    private javax.swing.JTextField txtDireccionGeneral3;
    private javax.swing.JTextField txtDireccionGeneral4;
    private javax.swing.JTextField txtDistrito1;
    private javax.swing.JTextField txtDistrito2;
    private javax.swing.JTextField txtDistrito3;
    private javax.swing.JTextField txtDistrito4;
    private javax.swing.JTextField txtEspecialidad1;
    private javax.swing.JTextField txtEspecialidad2;
    private javax.swing.JTextField txtEspecialidad3;
    private javax.swing.JTextField txtEspecialidad4;
    private javax.swing.JTextField txtEspecialidadMedico1;
    private javax.swing.JTextField txtEspecialidadMedico2;
    private javax.swing.JTextField txtEspecialidadMedico3;
    private javax.swing.JTextField txtEspecialidadMedico4;
    private javax.swing.JTextField txtFinalizacionEstudios;
    private javax.swing.JTextField txtFinalizacionEstudios1;
    private javax.swing.JTextField txtFinalizacionEstudios2;
    private javax.swing.JTextField txtFinalizacionEstudios3;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreClinica1;
    private javax.swing.JTextField txtNombreClinica2;
    private javax.swing.JTextField txtNombreClinica3;
    private javax.swing.JTextField txtNombreClinica4;
    private javax.swing.JTextField txtNombreMedico1;
    private javax.swing.JTextField txtNombreMedico2;
    private javax.swing.JTextField txtNombreMedico3;
    private javax.swing.JTextField txtNombreMedico4;
    private javax.swing.JTextField txtNumeroClinica1;
    private javax.swing.JTextField txtNumeroClinica2;
    private javax.swing.JTextField txtNumeroClinica3;
    private javax.swing.JTextField txtNumeroClinica4;
    private javax.swing.JTextField txtPaisUniversidad1;
    private javax.swing.JTextField txtPaisUniversidad2;
    private javax.swing.JTextField txtPaisUniversidad3;
    private javax.swing.JTextField txtPaisUniversidad4;
    private javax.swing.JTextField txtProvincia1;
    private javax.swing.JTextField txtProvincia2;
    private javax.swing.JTextField txtProvincia3;
    private javax.swing.JTextField txtProvincia4;
    private javax.swing.JTextField txtSlogan;
    private javax.swing.JTextField txtSlogan1;
    private javax.swing.JTextField txtSlogan2;
    private javax.swing.JTextField txtSlogan3;
    private javax.swing.JTextField txtTituloUniversitario;
    private javax.swing.JTextField txtTituloUniversitario1;
    private javax.swing.JTextField txtTituloUniversitario2;
    private javax.swing.JTextField txtTituloUniversitario3;
    private javax.swing.JTextField txtUniversidadEstudio1;
    private javax.swing.JTextField txtUniversidadEstudio2;
    private javax.swing.JTextField txtUniversidadEstudio3;
    private javax.swing.JTextField txtUniversidadEstudio4;
    private javax.swing.JTextArea txtdescrptionPadecimiento;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtidiomas;
    private javax.swing.JTextField txtidiomas1;
    private javax.swing.JTextField txtidiomas2;
    private javax.swing.JTextField txtidiomas3;
    private javax.swing.JTextField txtnombreClinica1;
    private javax.swing.JTextField txtnombreClinica2;
    private javax.swing.JTextField txtnombreClinica3;
    private javax.swing.JTextField txtnombreClinica4;
    private javax.swing.JTextField txtnombreMedico1;
    private javax.swing.JTextField txtnombreMedico2;
    private javax.swing.JTextField txtnombreMedico3;
    private javax.swing.JTextField txtnombreMedico4;
    private javax.swing.JTextField txtnumeroClinica1;
    private javax.swing.JTextField txtnumeroClinica2;
    private javax.swing.JTextField txtnumeroClinica3;
    private javax.swing.JTextField txtnumeroClinica4;
    // End of variables declaration//GEN-END:variables
}
