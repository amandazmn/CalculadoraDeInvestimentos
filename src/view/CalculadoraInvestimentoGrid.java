package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Investimento;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class CalculadoraInvestimentoGrid extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDeposito;
	private JTextField txtNumMeses;
	private JTextField txtJurosMes;
	private final JPanel panel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraInvestimentoGrid frame = new CalculadoraInvestimentoGrid();
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
	public CalculadoraInvestimentoGrid() {
		setTitle("CalcInvest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 200);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Ajuda");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Sobre");
		mnNewMenu.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 2, 0, 0));
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblDepositoMensal = new JLabel("Depósito mensal R$:");
		lblDepositoMensal.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblDepositoMensal);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		txtDeposito = new JTextField();
		panel_4.add(txtDeposito);
		txtDeposito.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNumMeses = new JLabel("Num. de meses: ");
		lblNumMeses.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNumMeses);
		
		JPanel panel_5 = new JPanel();
		contentPane.add(panel_5);
		panel_5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		txtNumMeses = new JTextField();
		panel_5.add(txtNumMeses);
		txtNumMeses.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblJurosMes = new JLabel("Juros ao mês %:");
		lblJurosMes.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblJurosMes);
		
		JPanel panel_6 = new JPanel();
		contentPane.add(panel_6);
		panel_6.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		txtJurosMes = new JTextField();
		panel_6.add(txtJurosMes);
		txtJurosMes.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblTotal = new JLabel("Total investido + juros R$:");
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblTotal);
		
		JLabel lbllTotal = new JLabel("");
		contentPane.add(lbllTotal);
		
		JLabel lblNewLabel_5 = new JLabel("");
		contentPane.add(lblNewLabel_5);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float deposito = Float.valueOf(txtDeposito.getText());
				int meses = Integer.valueOf(txtNumMeses.getText());
				float juros = Float.valueOf(txtJurosMes.getText());
				Investimento i = new Investimento(meses, juros, deposito);
				Double total = i.calculaTotal();
				lbllTotal.setText(String.format("%.2f", total));
				
			}
		});
		contentPane.add(btnCalcular);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
