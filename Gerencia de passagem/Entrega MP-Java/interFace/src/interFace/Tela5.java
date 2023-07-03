package interFace;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import controller.*;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Tela5 implements ActionListener {
	private JFrame f = new JFrame();
	private JLabel N = new JLabel("Preencha os dados sobre o Itinerario");
	private JLabel l = new JLabel("Escolha um dia da semana: ");
	private JLabel l2 = new JLabel("Escolha em qual turno o ônibus irá passar: ");
	private JLabel l3 = new JLabel("ou");
	private JLabel l4 = new JLabel("O destino é de chegada ou saída ?");
	private JLabel l5 = new JLabel("ou");
	private JLabel l6 = new JLabel("Nome da cidade: ");
	private JLabel l7 = new JLabel("Digite um ponto de referencia: ");
	private JLabel l8 = new JLabel("Escolha uma data:");
	private JTextField t = new JTextField();
	private JTextField t2 = new JTextField();
	private JTextField ano = new JTextField();
	private JButton b;
	private JComboBox<String> d;
	private String[] diasn = { "1", "2", "3", "4", "5", "6", "7","8","9","10","11","12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
	private JComboBox<String> m;
	private String[] mes = { "1", "2", "3", "4", "5", "6", "7", "8","9", "10", "11", "12"};
	private String[] dias = { "Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado", "Domingo" };
	private JComboBox<String> c;
	private static Controle_dados cn;
	private JRadioButton r = new JRadioButton("Dia");
	private JRadioButton r2 = new JRadioButton("Noite");
	private JRadioButton r3 = new JRadioButton("Chegada");
	private JRadioButton r4 = new JRadioButton("Saída");
	private ButtonGroup g = new ButtonGroup();
	private ButtonGroup g2 = new ButtonGroup();

	
	
	public Tela5(Controle_dados dados) {
		cn = dados;
		
		c = new JComboBox<String>(dias);
		d = new JComboBox<String>(diasn);
		m = new JComboBox<String>(mes);
		b = new JButton("Finalizar");

		g.add(r);
		g.add(r2);
		g2.add(r3);
		g2.add(r4);

		m.setBounds(170, 230, 40, 20);
		d.setBounds(120, 230, 40, 20);
		c.setBounds(170, 40, 120, 20);
		r.setBounds(10, 95, 70, 20);
		r2.setBounds(115, 95, 70, 20);
		r3.setBounds(10, 145, 80, 20);
		r4.setBounds(120, 145, 80, 20);
		b.setBounds(130, 270, 95, 20);
		N.setBounds(80, 0, 300, 20);
		l.setBounds(10, 40, 200, 20);
		l2.setBounds(10, 70, 250, 20);
		l3.setBounds(90, 95, 70, 20);
		l4.setBounds(10, 120, 200, 20);
		l5.setBounds(95, 145, 80, 20);
		l6.setBounds(10, 170, 150, 20);
		l7.setBounds(10, 200, 170, 20);
		t.setBounds(120, 170, 230, 20);
		t2.setBounds(180, 200, 170, 20);
		ano.setBounds(230, 230, 120, 20);
		l8.setBounds(10, 230, 250, 20);
		f.setSize(400, 340);

		l.setFont(new Font(null, Font.PLAIN, 12));
		l2.setFont(new Font(null, Font.PLAIN, 12));
		l3.setFont(new Font(null, Font.PLAIN, 12));
		l4.setFont(new Font(null, Font.PLAIN, 12));
		l5.setFont(new Font(null, Font.PLAIN, 12));
		l6.setFont(new Font(null, Font.PLAIN, 12));
		l7.setFont(new Font(null, Font.PLAIN, 12));
		l8.setFont(new Font(null, Font.PLAIN, 12));
		f.setLayout(null);
		f.setVisible(true);

		ImageIcon image = new ImageIcon("onibus.png");
		f.setIconImage(image.getImage());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		b.addActionListener(this);

		f.add(m);
		f.add(d);
		f.add(b);
		f.add(N);
		f.add(r);
		f.add(r2);
		f.add(r3);
		f.add(r4);
		f.add(l2);
		f.add(l3);
		f.add(c);
		f.add(l);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		f.add(l8);
		f.add(t);
		f.add(t2);
		f.add(ano);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==b) {
			cn.inf_int(dias[c.getSelectedIndex()], diasn[d.getSelectedIndex()], mes[m.getSelectedIndex()], ano.getText(), t.getText(), t2.getText(), r.isSelected(), r3.isSelected());
		}
	}
}