package entornoGraficoBackend;

import calculadorFirstClass.SistemaCalculadora;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author alfonso
 */
public class Apariencia extends javax.swing.JFrame {

    String escritura = "";
    String alterna = "";
    String numero1 = "";
    String numero2 = "";
    String resultado = "";
    String operacion = "";
    SistemaCalculadora sistemaCalculadora = new SistemaCalculadora();
    int conteo = 0;
    boolean llave = true;

    /**
     * Creates new form apariencia
     */
    public Apariencia() {
        initComponents();
        resizeIcon();
    }

    public void valor(String entrada) {
        operacion = entrada;
        numero2 = pantalla.getText();
        if (!resultado.equals("")) {
            pantalla.setText("");
        }
        if (!pantalla.getText().equalsIgnoreCase("") && numero1.equals("") && conteo == 0) {
            numero1 = pantalla.getText();
            pantalla.setText("");
        }
        if (conteo >= 1) {
            resultado = sistemaCalculadora.operar(operacion, numero1, numero2);
            System.out.println("resultado acarreo " + resultado);
            System.out.println("numero 1: " + numero1);
            System.out.println("numero 2: " + numero2);
            numero2 = "";
            numero1 = resultado;
            System.out.println("numero 1: " + numero1);
            System.out.println("numero 2: " + numero2);
            System.out.println("");
            pantalla.setText("");
        }
        conteo++;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNumeros = new javax.swing.JPanel();
        number2Button = new javax.swing.JButton();
        number1Button = new javax.swing.JButton();
        number3Button = new javax.swing.JButton();
        number4Button = new javax.swing.JButton();
        number5Button = new javax.swing.JButton();
        number6Button = new javax.swing.JButton();
        number7Button = new javax.swing.JButton();
        number8Button = new javax.swing.JButton();
        number9Button = new javax.swing.JButton();
        number0Button = new javax.swing.JButton();
        resultButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        puntoButton = new javax.swing.JButton();
        deleteOneButton = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        additionButton = new javax.swing.JButton();
        subtractionButton = new javax.swing.JButton();
        multiplicationButton = new javax.swing.JButton();
        divisionButton = new javax.swing.JButton();
        operaciones = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        pantalla = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelNumeros.setBackground(new java.awt.Color(204, 204, 204));

        number2Button.setBackground(new java.awt.Color(102, 102, 102));
        number2Button.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        number2Button.setForeground(new java.awt.Color(255, 255, 255));
        number2Button.setText("2");
        number2Button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        number2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number2ButtonActionPerformed(evt);
            }
        });

        number1Button.setBackground(new java.awt.Color(102, 102, 102));
        number1Button.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        number1Button.setForeground(new java.awt.Color(255, 255, 255));
        number1Button.setText("1");
        number1Button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        number1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number1ButtonActionPerformed(evt);
            }
        });

        number3Button.setBackground(new java.awt.Color(102, 102, 102));
        number3Button.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        number3Button.setForeground(new java.awt.Color(255, 255, 255));
        number3Button.setText("3");
        number3Button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        number3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number3ButtonActionPerformed(evt);
            }
        });

        number4Button.setBackground(new java.awt.Color(102, 102, 102));
        number4Button.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        number4Button.setForeground(new java.awt.Color(255, 255, 255));
        number4Button.setText("4");
        number4Button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        number4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number4ButtonActionPerformed(evt);
            }
        });

        number5Button.setBackground(new java.awt.Color(102, 102, 102));
        number5Button.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        number5Button.setForeground(new java.awt.Color(255, 255, 255));
        number5Button.setText("5");
        number5Button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        number5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number5ButtonActionPerformed(evt);
            }
        });

        number6Button.setBackground(new java.awt.Color(102, 102, 102));
        number6Button.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        number6Button.setForeground(new java.awt.Color(255, 255, 255));
        number6Button.setText("6");
        number6Button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        number6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number6ButtonActionPerformed(evt);
            }
        });

        number7Button.setBackground(new java.awt.Color(102, 102, 102));
        number7Button.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        number7Button.setForeground(new java.awt.Color(255, 255, 255));
        number7Button.setText("7");
        number7Button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        number7Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number7ButtonActionPerformed(evt);
            }
        });

        number8Button.setBackground(new java.awt.Color(102, 102, 102));
        number8Button.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        number8Button.setForeground(new java.awt.Color(255, 255, 255));
        number8Button.setText("8");
        number8Button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        number8Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number8ButtonActionPerformed(evt);
            }
        });

        number9Button.setBackground(new java.awt.Color(102, 102, 102));
        number9Button.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        number9Button.setForeground(new java.awt.Color(255, 255, 255));
        number9Button.setText("9");
        number9Button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        number9Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number9ButtonActionPerformed(evt);
            }
        });

        number0Button.setBackground(new java.awt.Color(102, 102, 102));
        number0Button.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        number0Button.setForeground(new java.awt.Color(255, 255, 255));
        number0Button.setText("0");
        number0Button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        number0Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number0ButtonActionPerformed(evt);
            }
        });

        resultButton.setBackground(new java.awt.Color(51, 51, 51));
        resultButton.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        resultButton.setForeground(new java.awt.Color(255, 255, 255));
        resultButton.setText("=");
        resultButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        resultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(153, 153, 153));
        deleteButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon.png"))); // NOI18N
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        puntoButton.setBackground(new java.awt.Color(153, 153, 153));
        puntoButton.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        puntoButton.setForeground(new java.awt.Color(255, 255, 255));
        puntoButton.setText(".");
        puntoButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        puntoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoButtonActionPerformed(evt);
            }
        });

        deleteOneButton.setBackground(new java.awt.Color(153, 153, 153));
        deleteOneButton.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        deleteOneButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteOneButton.setText("C");
        deleteOneButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        deleteOneButton.setPreferredSize(new java.awt.Dimension(47, 48));
        deleteOneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOneButtonActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(0, 0, 0));
        jButton18.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("+/-");
        jButton18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        additionButton.setBackground(new java.awt.Color(0, 0, 0));
        additionButton.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        additionButton.setForeground(new java.awt.Color(255, 255, 255));
        additionButton.setText("+");
        additionButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        additionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additionButtonActionPerformed(evt);
            }
        });

        subtractionButton.setBackground(new java.awt.Color(0, 0, 0));
        subtractionButton.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        subtractionButton.setForeground(new java.awt.Color(255, 255, 255));
        subtractionButton.setText("-");
        subtractionButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        subtractionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractionButtonActionPerformed(evt);
            }
        });

        multiplicationButton.setBackground(new java.awt.Color(0, 0, 0));
        multiplicationButton.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        multiplicationButton.setForeground(new java.awt.Color(255, 255, 255));
        multiplicationButton.setText("*");
        multiplicationButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        multiplicationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicationButtonActionPerformed(evt);
            }
        });

        divisionButton.setBackground(new java.awt.Color(0, 0, 0));
        divisionButton.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        divisionButton.setForeground(new java.awt.Color(255, 255, 255));
        divisionButton.setText("/");
        divisionButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        divisionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelNumerosLayout = new javax.swing.GroupLayout(panelNumeros);
        panelNumeros.setLayout(panelNumerosLayout);
        panelNumerosLayout.setHorizontalGroup(
            panelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNumerosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNumerosLayout.createSequentialGroup()
                        .addGroup(panelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelNumerosLayout.createSequentialGroup()
                                    .addComponent(number4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(number5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(number6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelNumerosLayout.createSequentialGroup()
                                    .addComponent(number1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(number2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(number3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelNumerosLayout.createSequentialGroup()
                                .addComponent(number7Button, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(number8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(number9Button, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelNumerosLayout.createSequentialGroup()
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(additionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelNumerosLayout.createSequentialGroup()
                                .addGroup(panelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                    .addComponent(deleteOneButton, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subtractionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(multiplicationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panelNumerosLayout.createSequentialGroup()
                        .addComponent(number0Button, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(puntoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(divisionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        panelNumerosLayout.setVerticalGroup(
            panelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNumerosLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(number2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(number3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(number1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(additionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteOneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtractionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelNumerosLayout.createSequentialGroup()
                        .addGroup(panelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(number8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(number9Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(number7Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(multiplicationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(puntoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(number0Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(divisionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        operaciones.setBackground(new java.awt.Color(204, 204, 204));

        jButton15.setBackground(new java.awt.Color(0, 0, 0));
        jButton15.setFont(new java.awt.Font("DejaVu Sans", 0, 15)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Potencia");
        jButton15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(0, 0, 0));
        jButton16.setFont(new java.awt.Font("DejaVu Sans", 0, 15)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("Raiz");
        jButton16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(0, 0, 0));
        jButton17.setFont(new java.awt.Font("DejaVu Sans", 0, 15)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Residuo");
        jButton17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout operacionesLayout = new javax.swing.GroupLayout(operaciones);
        operaciones.setLayout(operacionesLayout);
        operacionesLayout.setHorizontalGroup(
            operacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(operacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(operacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(operacionesLayout.createSequentialGroup()
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        operacionesLayout.setVerticalGroup(
            operacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(operacionesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(operacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pantalla.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N

        jMenu1.setText("Inicio");

        jMenuItem1.setText("conversiones");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pantalla)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelNumeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(operaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(operaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultButtonActionPerformed

        if (!pantalla.getText().equalsIgnoreCase("")) {
            numero2 = pantalla.getText();
            pantalla.setText("");
            resultado = sistemaCalculadora.operar(operacion, numero1, numero2);
            pantalla.setText(resultado);
            numero2 = "";
            numero1 = resultado;
            conteo = 0;
        } else {
            numero2 = "0";
            pantalla.setText("");
            resultado = sistemaCalculadora.operar(operacion, numero1, numero2);
            pantalla.setText(resultado);
            numero2 = "";
            operacion = "";
            numero1 = resultado;
            conteo = 0;
        }

    }//GEN-LAST:event_resultButtonActionPerformed

    private void number1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number1ButtonActionPerformed
        pantalla.setText(pantalla.getText() + "1");
    }//GEN-LAST:event_number1ButtonActionPerformed

    private void number2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number2ButtonActionPerformed
        pantalla.setText(pantalla.getText() + "2");
    }//GEN-LAST:event_number2ButtonActionPerformed

    private void number3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number3ButtonActionPerformed
        pantalla.setText(pantalla.getText() + "3");;
    }//GEN-LAST:event_number3ButtonActionPerformed

    private void number4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number4ButtonActionPerformed
        pantalla.setText(pantalla.getText() + "4");
    }//GEN-LAST:event_number4ButtonActionPerformed

    private void number5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number5ButtonActionPerformed
        pantalla.setText(pantalla.getText() + "5");
    }//GEN-LAST:event_number5ButtonActionPerformed

    private void number6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number6ButtonActionPerformed
        pantalla.setText(pantalla.getText() + "6");
    }//GEN-LAST:event_number6ButtonActionPerformed

    private void number7ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number7ButtonActionPerformed
        pantalla.setText(pantalla.getText() + "7");
    }//GEN-LAST:event_number7ButtonActionPerformed

    private void number8ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number8ButtonActionPerformed
        pantalla.setText(pantalla.getText() + "8");
    }//GEN-LAST:event_number8ButtonActionPerformed

    private void number9ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number9ButtonActionPerformed
        pantalla.setText(pantalla.getText() + "9");
    }//GEN-LAST:event_number9ButtonActionPerformed

    private void number0ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number0ButtonActionPerformed
        pantalla.setText(pantalla.getText() + "0");
    }//GEN-LAST:event_number0ButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try {
            escritura = escritura.substring(0, escritura.length() - 1); // reviso toda la cadena menos el ultimo ais borro digito por digito
            pantalla.setText(escritura);
        } catch (Exception e) {
            escritura = "";
            JOptionPane.showMessageDialog(this, "se han elimindo todos los numeros ya no quedan mas ", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void additionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additionButtonActionPerformed
        valor("+");
    }//GEN-LAST:event_additionButtonActionPerformed

    private void subtractionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractionButtonActionPerformed
        valor("-");
    }//GEN-LAST:event_subtractionButtonActionPerformed

    private void multiplicationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicationButtonActionPerformed
        valor("*");
    }//GEN-LAST:event_multiplicationButtonActionPerformed

    private void divisionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionButtonActionPerformed
         valor("/");
    }//GEN-LAST:event_divisionButtonActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
         valor("^");
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        valor("%");
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        valor("#");
    }//GEN-LAST:event_jButton16ActionPerformed

    private void deleteOneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOneButtonActionPerformed
        pantalla.setText("");
        conteo = 0;
        numero2 = "";
        numero1 = "";
        resultado = "";
    }//GEN-LAST:event_deleteOneButtonActionPerformed

    private void puntoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoButtonActionPerformed
        if (pantalla.getText().length() <= 0) {
            pantalla.setText("0.");
        } else {
            if (!pantalla.getText().contains(".")) {
                pantalla.setText(pantalla.getText() + ".");
            }
        }
    }//GEN-LAST:event_puntoButtonActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       conversiones conversiones = new conversiones();
       conversiones.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public void resizeIcon() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/icons/icon.png"));
        Image image = icon.getImage();
        Image newImage = image.getScaledInstance(45, 45, java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newImage);
        deleteButton.setIcon(newIcon);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton additionButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton deleteOneButton;
    private javax.swing.JButton divisionButton;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JButton multiplicationButton;
    private javax.swing.JButton number0Button;
    private javax.swing.JButton number1Button;
    private javax.swing.JButton number2Button;
    private javax.swing.JButton number3Button;
    private javax.swing.JButton number4Button;
    private javax.swing.JButton number5Button;
    private javax.swing.JButton number6Button;
    private javax.swing.JButton number7Button;
    private javax.swing.JButton number8Button;
    private javax.swing.JButton number9Button;
    private javax.swing.JPanel operaciones;
    private javax.swing.JPanel panelNumeros;
    private javax.swing.JTextField pantalla;
    private javax.swing.JButton puntoButton;
    private javax.swing.JButton resultButton;
    private javax.swing.JButton subtractionButton;
    // End of variables declaration//GEN-END:variables
}
