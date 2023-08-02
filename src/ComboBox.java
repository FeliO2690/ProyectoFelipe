
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox extends JFrame {
    //Hola Mundo
     private JFrame ventanaMonedas = new JFrame();
    private JFrame ventanaTemperaturas = new JFrame();
    private JComboBox<String> conversion;
    private JComboBox<String> monedasConversor;
    private JComboBox<String> temperaturas;

    private boolean ventanaMonedasAbierta = false;
    private boolean ventanaTemperaturasAbierta = false;

    public ComboBox() {

        setSize(300, 200);
        setTitle("App Conversor");
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        mostrarmenuPrincipal();
        panel.add(conversion);
        add(panel); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mostrarmenuPrincipal() {

        String[] conversionTypes = {
            "Seleccionar opción",
            "1.- Conversión de monedas",
            "2.- Conversión de temperaturas",
            "3.- Salir"
        };
        conversion = new JComboBox<>(conversionTypes);
        conversion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = conversion.getSelectedIndex();
                switch (selectedIndex) {
                    case 1:
                        if (!ventanaMonedasAbierta) {
                            ventanaMonedas = new JFrame();
                            ventanaMonedas.setSize(300, 200);
                            ventanaMonedas.setTitle("Conversor de Monedas");
                            ventanaMonedas.setVisible(true);
                            ventanaMonedas.setLocationRelativeTo(null);

                            JPanel panel = new JPanel();
                            mostrarMenuMonedas(panel);
                            ventanaMonedas.add(panel);

                            ventanaMonedas.addWindowListener(new java.awt.event.WindowAdapter() {
                                @Override
                                public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                                    ventanaMonedasAbierta = false;
                                    setVisible(true);
                                }
                            });

                            ventanaMonedasAbierta = true;
                        }
                        break;
                    case 2:
                        if (!ventanaTemperaturasAbierta) {
                            ventanaTemperaturas = new JFrame();
                            ventanaTemperaturas.setSize(300, 200);
                            ventanaTemperaturas.setTitle("Temperaturas ");
                            ventanaTemperaturas.setVisible(true);
                            ventanaTemperaturas.setLocationRelativeTo(null);

                            JPanel panel = new JPanel();
                            mostrarMenuTemperaturas(panel);
                            ventanaTemperaturas.add(panel);

                            ventanaTemperaturas.addWindowListener(new java.awt.event.WindowAdapter() {
                                @Override
                                public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                                    ventanaTemperaturasAbierta = false;
                                    setVisible(true);
                                }
                            });

                            ventanaTemperaturasAbierta = true;

                        }

                        break;
                    case 3:
                        BoxMetodos conver1 = new BoxMetodos();
                        conver1.opc3EXIT();
                        break;
                    default:
                        break;
                }
            }
        });
    }

    public void mostrarMenuMonedas(JPanel panel) {

        String[] conversionMonedas = {
            "Eliga una conversión",
            "1.-México -> EU",
            "2.- México -> China",
            "3.- México -> España",
            "4.- México -> Dolar canadiense",
            "5.- México -> Yen Japones",
            "6.- México -> Franco Suizo",
            "7.- México -> Rublo Ruso",
            "8.- México -> Dolar Singapurense",
            "9.- México -> Peso Filipino",
            "10.- México -> Real Brasileño",
            "11.- EU -> Mexico",
            "12.- China -> Mexico",
            "13.- España -> Mexico",
            "14.- Dolar canadiense -> Mexico",
            "15.- Yen Japones -> Mexico",
            "16.- Salir",};
        monedasConversor = new JComboBox<>(conversionMonedas);

        monedasConversor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int monedas = monedasConversor.getSelectedIndex();
                switch (monedas) {
                    case 1:
                        BoxMetodos metodos = new BoxMetodos();
                        metodos.opc11();
                        break;
                    case 2:
                        BoxMetodos met = new BoxMetodos();
                        met.opc12();

                        break;
                    case 3:
                        BoxMetodos met2 = new BoxMetodos();
                        met2.opc13();
                        break;
                    case 4:
                        BoxMetodos met3 = new BoxMetodos();
                        met3.opc14();
                        break;
                    case 5:
                        BoxMetodos met4 = new BoxMetodos();
                        met4.opc15();
                        break;
                    case 6:
                        BoxMetodos met5 = new BoxMetodos();
                        met5.opc16();
                        break;
                    case 7:
                        BoxMetodos met6 = new BoxMetodos();
                        met6.opc17();
                        break;
                    case 8:
                        BoxMetodos met7 = new BoxMetodos();
                        met7.opc18();
                        break;
                    case 9:
                        BoxMetodos met8 = new BoxMetodos();
                        met8.opc19();
                        break;
                    case 10:
                        BoxMetodos met9 = new BoxMetodos();
                        met9.opc20();
                        break;
                    case 11:
                        BoxMetodos met10 = new BoxMetodos();
                        met10.opc21();
                        break;
                    case 12:
                        BoxMetodos met11 = new BoxMetodos();
                        met11.opc22();
                        break;
                    case 13:
                        BoxMetodos met12 = new BoxMetodos();
                        met12.opc23();
                        break;
                    case 14:
                        BoxMetodos met13 = new BoxMetodos();
                        met13.opc24();
                        break;
                    case 15:
                        BoxMetodos met14 = new BoxMetodos();
                        met14.opc25();
                        break;
                    case 16:
                        BoxMetodos exit = new BoxMetodos();
                        exit.opc3EXIT();
                        break;

                }
            }
        });

        panel.add(monedasConversor);
        add(panel);

    }

    public void mostrarMenuTemperaturas(JPanel panel) {

        String[] Temperaturas = {
            "Eliga una conversión",
            "1.-1.- Celsius -> Fahrenheit",
            "2.- Fahrenheit -> Celsius",
            "3.- Celsius -> Kelvin",
            "4.- Kelvin -> Celsius",
            "5.- Fahrenheit -> Kelvin",
            "6.- Kelvin -> Fahrenheit",
            "7.- Salir",
        
        };

        temperaturas = new JComboBox<>(Temperaturas);
        temperaturas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int conversiont = temperaturas.getSelectedIndex();
                switch (conversiont) {
                    case 1:
                        BoxMetodos met1 = new BoxMetodos();
                        met1.opct1();
                        break;
                    case 2:
                        BoxMetodos met2 = new BoxMetodos();
                        met2.opct2();
                        break;
                    case 3:
                        BoxMetodos met3 = new BoxMetodos();
                        met3.opct3();
                        break;
                    case 4:
                        BoxMetodos met4 = new BoxMetodos();
                        met4.opct4();
                        break;
                    case 5:
                        BoxMetodos met5 = new BoxMetodos();
                        met5.opct5();
                        break;
                    case 6:
                        BoxMetodos met6 = new BoxMetodos();
                        met6.opct6();
                        break;
                    case 7:
                        BoxMetodos met7 = new BoxMetodos();
                        met7.opc3EXIT();
                        break;

                }
            }
        });
        
        panel.add(temperaturas);
        add(panel);

    }

    public static void main(String[] args) {
        ComboBox s = new ComboBox();
        s.setVisible(true);
    }
}
