package vista;

import javax.swing.*;
import java.awt.*;
import logica.*;
import modelo.*;
import java.awt.event.*;

public class VentanaPrincipal extends JFrame {
	private JPanel contentPanel, panelTitulo, panelSuperior;
	private JTextField txtEntrada, txtSalida;
	private JComboBox comboBoxEntrada, comboBoxSalida, comboBoxConversores;
	private JLabel lbREntrada, lbRSalida, lbValorInvalido, lbResultado, lbIcono;
	private LogicaConversores conversor = new LogicaConversores();
	private Conversor conversorSeleccionado = conversor.getListaConversores()[0];
	private JButton btnConvertir, btnMinimizar, btnCerrar;
	private final JPanel panel = new JPanel();
	private static Point initialClick;

	public VentanaPrincipal() {
		setResizable(false);
		setTitle("Conversor JAVA by Lucas Abrego");
		setForeground(new Color(244, 245, 248));
		setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(VentanaPrincipal.class.getResource("/graficos/iconConversorMoneda.png")));
		setExtendedState(Frame.ICONIFIED);
		setBackground(new Color(36, 31, 49));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 600);
		setLocationRelativeTo(null);
		contentPanel = new JPanel();
		contentPanel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		contentPanel.setBackground(new Color(0, 2, 17));
		contentPanel.setBorder(UIManager.getBorder("Button.border"));
		setUndecorated(true);
		setContentPane(contentPanel);
		contentPanel.setLayout(null);

		panel.setBounds(8, 40, 884, 552);
		panel.setBackground(new Color(244, 245, 248));
		contentPanel.add(panel);
		panel.setLayout(null);

		panelTitulo = new JPanel();
		panelTitulo.setBounds(30, 30, 843, 110);
		panel.add(panelTitulo);
		panelTitulo.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		panelTitulo.setBackground(new Color(244, 245, 248));
		panelTitulo.setBorder(null);

		lbIcono = new JLabel("");
		panelTitulo.add(lbIcono);
		lbIcono.setHorizontalAlignment(SwingConstants.CENTER);
		lbIcono.setFont(new Font("Roboto", Font.PLAIN, 50));
		lbIcono.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/graficos/iconConversorMoneda.png")));

		comboBoxConversores = new JComboBox();
		comboBoxConversores.setBackground(new Color(244, 245, 248));
		comboBoxConversores.setFont(new Font("Roboto Medium", Font.PLAIN, 56));
		comboBoxConversores.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				cambioItemComboBox();
			}
		});
		panelTitulo.add(comboBoxConversores);

		txtSalida = new JTextField();
		txtSalida.setBounds(90, 263, 340, 57);
		panel.add(txtSalida);
		txtSalida.setEditable(false);
		txtSalida.setBorder(BorderFactory.createLineBorder(Color.lightGray));
		txtSalida.setDisabledTextColor(new Color(255, 255, 255));
		txtSalida.setText("Valor convertido");
		txtSalida.setForeground(Color.BLACK);
		txtSalida.setFont(new Font("Roboto Medium", Font.PLAIN, 27));
		txtSalida.setColumns(10);

		comboBoxSalida = new JComboBox();
		comboBoxSalida.setBounds(451, 263, 395, 57);
		panel.add(comboBoxSalida);
		comboBoxSalida.setBackground(new Color(244, 245, 248));
		comboBoxSalida.setFont(new Font("Roboto Medium", Font.PLAIN, 27));

		btnConvertir = new JButton("");
		btnConvertir.setBackground(new Color(244, 245, 248));
		btnConvertir.setBounds(385, 398, 130, 130);
		panel.add(btnConvertir);
		btnConvertir.setBorderPainted(false);
		btnConvertir.setBorder(null);
		btnConvertir.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/graficos/iconRefresh.png")));

		lbREntrada = new JLabel(" ");
		lbREntrada.setBounds(0, 175, 75, 57);
		panel.add(lbREntrada);
		lbREntrada.setHorizontalAlignment(SwingConstants.RIGHT);
		lbREntrada.setFont(new Font("Roboto Medium", Font.PLAIN, 30));

		lbRSalida = new JLabel(" ");
		lbRSalida.setBounds(0, 263, 75, 57);
		panel.add(lbRSalida);
		lbRSalida.setHorizontalAlignment(SwingConstants.RIGHT);
		lbRSalida.setFont(new Font("Roboto Medium", Font.PLAIN, 30));

		txtEntrada = new JTextField();
		txtEntrada.setBounds(90, 175, 340, 57);
		panel.add(txtEntrada);
		txtEntrada.setBorder(BorderFactory.createLineBorder(Color.lightGray));
		txtEntrada.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				limpiarTxtEntrada();
			}
		});
		txtEntrada.setText("Ingrese el valor a convertir");
		txtEntrada.setForeground(Color.LIGHT_GRAY);
		txtEntrada.setFont(new Font("Roboto Medium", Font.PLAIN, 27));
		txtEntrada.setColumns(10);

		lbValorInvalido = new JLabel("");
		lbValorInvalido.setBounds(90, 231, 280, 20);
		panel.add(lbValorInvalido);
		lbValorInvalido.setFont(new Font("Dialog", Font.BOLD, 14));
		lbValorInvalido.setForeground(Color.RED);

		comboBoxEntrada = new JComboBox();
		comboBoxEntrada.setBounds(451, 175, 395, 57);
		panel.add(comboBoxEntrada);
		comboBoxEntrada.setBackground(new Color(244, 245, 248));
		comboBoxEntrada.setFont(new Font("Roboto Medium", Font.PLAIN, 27));

		lbResultado = new JLabel("");
		lbResultado.setBounds(0, 332, 885, 42);
		panel.add(lbResultado);
		lbResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lbResultado.setFont(new Font("Roboto Condensed", Font.PLAIN, 28));

		panelSuperior = new JPanel();

		panelSuperior.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				initialClick = e.getPoint();
				getComponentAt(initialClick);
			}
		});
		panelSuperior.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int thisX = getLocation().x;
				int thisY = getLocation().y;

				int xMoved = thisX + (e.getX() - initialClick.x);
				int yMoved = thisY + (e.getY() - initialClick.y);

				setLocation(xMoved, yMoved);
			}
		});
		panelSuperior.setBackground(new Color(0, 2, 17));
		panelSuperior.setBounds(0, 0, 900, 40);
		contentPanel.add(panelSuperior);
		panelSuperior.setLayout(null);

		JLabel lblConversorJava = new JLabel("Conversor JAVA - Lucas Abrego");
		lblConversorJava.setFont(new Font("Roboto", Font.BOLD, 18));
		lblConversorJava.setForeground(new Color(244, 245, 248));
		lblConversorJava.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/graficos/iconApp.png")));
		lblConversorJava.setBounds(0, 0, 500, 40);
		panelSuperior.add(lblConversorJava);

		btnMinimizar = new JButton("");
		btnMinimizar.setBounds(825, 5, 32, 32);
		panelSuperior.add(btnMinimizar);
		btnMinimizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setState(JFrame.ICONIFIED);
			}
		});
		btnMinimizar.setBackground(new Color(0, 2, 17));
		btnMinimizar.setBorderPainted(false);
		btnMinimizar.setBorder(null);
		btnMinimizar.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/graficos/iconMinimizar.png")));

		btnCerrar = new JButton("");
		btnCerrar.setBounds(860, 5, 32, 32);
		panelSuperior.add(btnCerrar);
		btnCerrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnCerrar.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/graficos/iconCerrarHover.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnCerrar.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/graficos/iconCerrar.png")));
			}
		});
		btnCerrar.setBackground(new Color(0, 2, 17));
		btnCerrar.setBorderPainted(false);
		btnCerrar.setBorder(null);
		btnCerrar.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/graficos/iconCerrar.png")));
		btnCerrar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnMinimizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnMinimizar
						.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/graficos/iconMinimizarHover.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnMinimizar.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/graficos/iconMinimizar.png")));
			}
		});

		comboBoxEntrada.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (comboBoxEntrada.getSelectedIndex() >= 0
						&& comboBoxEntrada.getSelectedIndex() < conversorSeleccionado.getListaUnidades().length) {
					lbREntrada.setText(conversorSeleccionado.getListaUnidades()[comboBoxEntrada.getSelectedIndex()]
							.getRepresentacion());
					limpiarResultado();
				}
			}
		});

		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				convertirValor();
			}
		});
		btnConvertir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnConvertir
						.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/graficos/iconRefreshHover.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnConvertir.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/graficos/iconRefresh.png")));
			}
		});
		comboBoxSalida.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (comboBoxSalida.getSelectedIndex() >= 0
						&& comboBoxSalida.getSelectedIndex() < conversorSeleccionado.getListaUnidades().length) {
					lbRSalida.setText(conversorSeleccionado.getListaUnidades()[comboBoxSalida.getSelectedIndex()]
							.getRepresentacion());
					limpiarResultado();
				}
			}
		});

		cargarComboxUnidades(conversorSeleccionado.getListaUnidades());

		Conversor[] listaConversores = conversor.getListaConversores();
		for (int i = 0; i < listaConversores.length; i++) {
			comboBoxConversores.addItem(listaConversores[i].getNombre());
		}
	}

	public void limpiarComboxUnidades() {
		comboBoxEntrada.removeAllItems();
		comboBoxSalida.removeAllItems();
	}

	public void cargarComboxUnidades(Unidad[] listaUnidades) {
		limpiarComboxUnidades();
		for (int i = 0; i < listaUnidades.length; i++) {
			comboBoxEntrada.addItem(listaUnidades[i].getNombre());
			comboBoxSalida.addItem(listaUnidades[i].getNombre());
		}
	}

	public void limpiarResultado() {
		lbResultado.setText("");
		txtSalida.setText("");
	}
	
	public void limpiarTxtEntrada() {
		if (txtEntrada.getText().equals("Ingrese el valor a convertir")) {
			txtEntrada.setText("");
			txtEntrada.setForeground(Color.BLACK);
			;
		}
	}
	
	public void cambioItemComboBox() {
		conversorSeleccionado = conversor.getListaConversores()[comboBoxConversores.getSelectedIndex()];
		lbIcono.setIcon(new ImageIcon(VentanaPrincipal.class.getResource(conversorSeleccionado.getIcono())));
		cargarComboxUnidades(conversorSeleccionado.getListaUnidades());
	}
	
	
	
	public void convertirValor() {
		try {
			double valorIngresado = Double.parseDouble(txtEntrada.getText());
			Unidad unidadEntrada;
			unidadEntrada = conversorSeleccionado.determinarUnidadSeleccionada(comboBoxEntrada.getSelectedIndex());
			Unidad unidadSalida;
			unidadSalida = conversorSeleccionado.determinarUnidadSeleccionada(comboBoxSalida.getSelectedIndex());
			String resultado;
			if(conversorSeleccionado.getNombre().equals("Conversor de moneda") || conversorSeleccionado.getNombre().equals("Conversor de temperatura")) {
				resultado = conversor.redondearResultadoDosCifras(
						conversorSeleccionado.convertirValor(valorIngresado, unidadEntrada, unidadSalida));	
			}
			else {
				resultado = conversor.redondearResultadoDiezCifras(
						conversorSeleccionado.convertirValor(valorIngresado, unidadEntrada, unidadSalida));
			}
			
			txtSalida.setText(resultado);
			lbResultado.setText(
					conversor.redondearResultadoDiezCifras(valorIngresado) + " " + unidadEntrada.getNombrePlural().toLowerCase()
							+ " equivalen a " + resultado + " " + unidadSalida.getNombrePlural().toLowerCase());
			txtEntrada.setBorder(BorderFactory.createLineBorder(Color.lightGray));
			lbValorInvalido.setText("");
		} catch (Exception extValorInvalido) {
			lbValorInvalido.setText("Ingrese un valor válido");
			txtEntrada.setBorder(BorderFactory.createLineBorder(Color.RED));
		}
	}
}