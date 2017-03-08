package calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField pantalla;
	private boolean decimal = false;
	private double numero1;
	private double numero2;
	private String operador;
	private double resultado;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 243, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setText(pantalla.getText()+button1.getText());
			}
		});
		button1.setBounds(10, 76, 41, 41);
		contentPane.add(button1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setText(pantalla.getText()+button2.getText());
			}
		});
		button2.setBounds(59, 76, 41, 41);
		contentPane.add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setText(pantalla.getText()+button3.getText());
			}
		});
		button3.setBounds(108, 76, 41, 41);
		contentPane.add(button3);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setText(pantalla.getText()+button4.getText());
			}
		});
		button4.setBounds(10, 126, 41, 41);
		contentPane.add(button4);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setText(pantalla.getText()+button5.getText());
			}
		});
		button5.setBounds(59, 126, 41, 41);
		contentPane.add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setText(pantalla.getText()+button6.getText());
			}
		});
		button6.setBounds(108, 126, 41, 41);
		contentPane.add(button6);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setText(pantalla.getText()+button7.getText());
			}
		});
		button7.setBounds(10, 176, 41, 41);
		contentPane.add(button7);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setText(pantalla.getText()+button8.getText());
			}
		});
		button8.setBounds(59, 176, 41, 41);
		contentPane.add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setText(pantalla.getText()+button9.getText());
			}
		});
		button9.setBounds(108, 176, 41, 41);
		contentPane.add(button9);
		
		JButton buttonMas = new JButton("+");
		buttonMas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decimal=false;
				numero1 = Double.parseDouble(pantalla.getText());
				operador = buttonMas.getText();
				pantalla.setText(null);
			}
		});
		buttonMas.setBounds(157, 76, 62, 39);
		contentPane.add(buttonMas);
		
		JButton buttonMinus = new JButton("-");
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decimal=false;
				numero1 = Double.parseDouble(pantalla.getText());
				operador = buttonMinus.getText();
				pantalla.setText(null);
			}
		});
		buttonMinus.setBounds(157, 126, 62, 39);
		contentPane.add(buttonMinus);
		
		JButton buttonEntre = new JButton("/");
		buttonEntre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decimal=false;
				numero1 = Double.parseDouble(pantalla.getText());
				operador = buttonEntre.getText();
				pantalla.setText(null);
			}
		});
		buttonEntre.setBounds(157, 176, 62, 39);
		contentPane.add(buttonEntre);
		
		JButton buttonPor = new JButton("*");
		buttonPor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decimal=false;
				numero1 = Double.parseDouble(pantalla.getText());
				operador = buttonPor.getText();
				pantalla.setText(null);
			}
		});
		buttonPor.setBounds(157, 226, 62, 39);
		contentPane.add(buttonPor);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setText(pantalla.getText()+button0.getText());
			}
		});
		button0.setBounds(10, 226, 41, 41);
		contentPane.add(button0);
		
		JButton buttonComa = new JButton(".");
		buttonComa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (decimal==false){
					pantalla.setText(pantalla.getText()+buttonComa.getText());
					decimal=true;
				}
			}
		});
		buttonComa.setBounds(59, 226, 41, 41);
		contentPane.add(buttonComa);
		
		JButton buttonC = new JButton("C");
		buttonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decimal=false;
				pantalla.setText(null);
				
			}
		});
		buttonC.setBounds(108, 226, 42, 42);
		contentPane.add(buttonC);
		
		pantalla = new JTextField();
		pantalla.setEditable(false);
		pantalla.setFont(new Font("Gulim", Font.PLAIN, 11));
		pantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		pantalla.setBounds(10, 11, 207, 50);
		contentPane.add(pantalla);
		pantalla.setColumns(10);
		
		JButton buttonPlusMinus = new JButton("+/-");
		buttonPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double numero = Double.parseDouble(pantalla.getText());
				if (numero < 0){
					numero = numero * -1;
					pantalla.setText(numero.toString());
				}else{
					numero = numero * -1;
					pantalla.setText(numero.toString());
				}		
			}
		});
		buttonPlusMinus.setBounds(10, 276, 98, 39);
		contentPane.add(buttonPlusMinus);
		
		JButton buttonResultado = new JButton("=");
		buttonResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decimal=false;
				numero2=Double.parseDouble(pantalla.getText());
				if (operador.equals(buttonMas.getText())){
					resultado = numero1 + numero2;
					pantalla.setText(String.valueOf(resultado));
				} else if (operador.equals(buttonMinus.getText())){
					resultado = numero1 - numero2;
					pantalla.setText(String.valueOf(resultado));
				} else if (operador.equals(buttonEntre.getText())){
					resultado = numero1 / numero2;
					pantalla.setText(String.valueOf(resultado));
				} else if (operador.equals(buttonPor.getText())){
					resultado = numero1 * numero2;
					pantalla.setText(String.valueOf(resultado));
				}
			}
		});
		buttonResultado.setBounds(118, 276, 101, 39);
		contentPane.add(buttonResultado);
	}
}