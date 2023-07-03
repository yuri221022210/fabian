package interFace;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import controller.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela4 implements ActionListener{
	private JLabel N = new JLabel("Preencha os dados sobre o ônibus que setá usado");
	private JFrame f = new JFrame();
	private JLabel l = new JLabel("Nome da Linha:");
	private JLabel l2 = new JLabel("Placa do veiculo:");
	private JLabel l3 = new JLabel("Cor do veiculo:");
	private JLabel l4 = new JLabel("Numero de Poltronas:");
	private JTextField t = new JTextField();
	private JTextField t2 = new JTextField();
	private JTextField t4 = new JTextField();
	private JButton b;
	private JComboBox<String> c;
	private String[] cores = {"Amarelo", "Azul-Claro", "Azul-Escuro", "Laranja", "Vermelho", "Verde-Claro", "Verde-Escuro", "Rosa", "Branco", "Preto", "Marrom", "Roxo"};
	private static Controle_dados cn;
	
	
	public Tela4(Controle_dados dados) {
		cn = dados;
		b = new JButton("Cadastrar Itinerario");
		c  = new JComboBox<String>(cores);
		N.setBounds(50, 0, 300, 20);
		l4.setBounds(10, 130, 200, 20);
		l2.setBounds(10, 70, 200, 20);
		l.setBounds(10, 40, 200, 20);
		l3.setBounds(10, 100, 200, 20);
		t.setBounds(120, 40, 200, 20);
		t2.setBounds(120, 70, 200, 20);
		t4.setBounds(139, 130, 180, 20);
		b.setBounds(140, 160, 160, 20);
		c.setBounds(120, 100, 200, 20);
		
		l4.setFont(new Font(null, Font.PLAIN, 12));
		l3.setFont(new Font(null, Font.PLAIN, 12));
		l2.setFont(new Font(null, Font.PLAIN, 12));
		l.setFont(new Font(null, Font.PLAIN, 12));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400, 230);
		f.setLayout(null);
		f.setVisible(true);

		f.add(c);
		f.add(N);
		f.add(l);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(t);
		f.add(t2);
		f.add(t4);
		f.add(b);
//		f.getContentPane().setBackground(new Color(255, 254, 195));
		ImageIcon image = new ImageIcon("onibus.png");
		f.setIconImage(image.getImage());
	
		b.addActionListener(this);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b) {
			
			cn.inf_onib(t.getText(), t2.getText(), cores[c.getSelectedIndex()],t4.getText());
			new Tela5(cn);
			
		}
		
	}
}