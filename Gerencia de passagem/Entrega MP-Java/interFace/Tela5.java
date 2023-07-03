package interFace;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Tela5 implements ActionListener {
	JFrame f = new JFrame();
	JLabel N = new JLabel("Preencha os dados sobre o Itinerario");
	JLabel l = new JLabel("Escolha um dia da semana: ");
	JLabel l2 = new JLabel("Escolha em qual turno o ônibus irá passar: ");
	JLabel l3 = new JLabel("ou");
	JLabel l4 = new JLabel("O destino é de chegada ou saída ?");
	JLabel l5 = new JLabel("ou");
	JLabel l6 = new JLabel("Nome da cidade: ");
	JLabel l7 = new JLabel("Digite um ponto de referencia: ");
	JTextField t = new JTextField();
	JTextField t2 = new JTextField();
	public static JButton b;

	Tela5() {
		String[] dias = { "Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado", "Domingo" };
		JComboBox c = new JComboBox(dias);
		JRadioButton r = new JRadioButton("Dia");
		JRadioButton r2 = new JRadioButton("Noite");
		JRadioButton r3 = new JRadioButton("Chegada");
		JRadioButton r4 = new JRadioButton("Saída");
		b = new JButton("Finalizar");
		
		ButtonGroup g = new ButtonGroup();
		g.add(r);
		g.add(r2);
		ButtonGroup g2 = new ButtonGroup();
		g2.add(r3);
		g2.add(r4);

		c.setBounds(170, 40, 120, 20);
		r.setBounds(10, 95, 70, 20);
		r2.setBounds(115, 95, 70, 20);
		r3.setBounds(10, 145, 80, 20);
		r4.setBounds(120, 145, 80, 20);
		b.setBounds(130, 240, 95, 20);
		N.setBounds(80, 0, 300, 20);
		l.setBounds(10, 40, 200, 20);
		l2.setBounds(10, 70, 250, 20);
		l3.setBounds(90, 95, 70, 20);
		l4.setBounds(10, 120, 200, 20);
		l5.setBounds(95, 145, 80, 20);
		l6.setBounds(10, 170, 150, 20);
		l7.setBounds(10, 200, 170, 20);
		t.setBounds(120, 170, 170, 20);
		t2.setBounds(180, 200, 170, 20);
		f.setSize(400, 300);
		
		l.setFont(new Font(null, Font.PLAIN, 12));
		l2.setFont(new Font(null, Font.PLAIN, 12));
		l3.setFont(new Font(null, Font.PLAIN, 12));
		l4.setFont(new Font(null, Font.PLAIN, 12));
		l5.setFont(new Font(null, Font.PLAIN, 12));
		l6.setFont(new Font(null, Font.PLAIN, 12));
		l7.setFont(new Font(null, Font.PLAIN, 12));
		f.setLayout(null);
		f.setVisible(true);
		
/*		c.setBackground(new Color(220, 220, 220));
		r.setBackground(new Color(255, 254, 195));
		r2.setBackground(new Color(255, 254, 195));
		r3.setBackground(new Color(255, 254, 195));
		r4.setBackground(new Color(255, 254, 195));
		*/
//		f.getContentPane().setBackground(new Color(255, 254, 195));
		ImageIcon image = new ImageIcon("onibus.png");
		f.setIconImage(image.getImage());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		b.addActionListener(this);
		
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
		f.add(t);
		f.add(t2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== b) {
		}
	}
}
