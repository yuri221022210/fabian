package interFace;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Controle_dados;

public class Tela1 implements ActionListener {
	private static JFrame f;
	private static JButton b;
	private static JButton c;
	private static JLabel l;
	private static JPanel p;
	private static Controle_dados cn = new Controle_dados();
	
	public Tela1() {
		f = new JFrame("Tela numero 1");
		b = new JButton("Empresa");
		c = new JButton("Passageiro");
		p = new JPanel();
		l = new JLabel();
		l.setText("Menu de Opções");
		p.add(l);
//		p.setBackground(new Color(255, 254, 195));
		p.setBounds(80, 0, 120, 30);
		f.setSize(300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(true);
		b.setBounds(80, 40, 120, 30);
		c.setBounds(80, 90, 120, 30);
		f.setLayout(null);
		f.add(p);
		f.add(b);
		f.add(c);
		f.setVisible(true);

		ImageIcon image = new ImageIcon("onibus.png");
		f.setIconImage(image.getImage());
	}

	public static void main(String args[]) {
		Tela1 tela = new Tela1();
		b.addActionListener(tela);
		c.addActionListener(tela);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b) {
			new Tela2(cn);
		} else if (e.getSource() == c) {
			new Tela3(cn);
		}
	}

}
