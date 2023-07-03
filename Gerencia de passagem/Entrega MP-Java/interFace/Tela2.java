package interFace;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela2 implements ActionListener {
	JFrame f = new JFrame();
	JLabel l = new JLabel("Nome da Empresa:");
	JLabel l2 = new JLabel("CNPJ da Empresa:");
	JLabel l3 = new JLabel("Numero da Empresa:");
	JLabel N = new JLabel("Preencha os dados as baixo");
	JTextField t = new JTextField();
	JTextField t2 = new JTextField();
	JTextField t3 = new JTextField();
	public static JButton b;

	Tela2() {

		b = new JButton("Proximo");
		N.setBounds(120, 0, 200, 20);
		l.setBounds(10, 40, 200, 20);
		l2.setBounds(10, 70, 200, 20);
		l3.setBounds(10, 100, 200, 20);
		t.setBounds(120, 40, 200, 20);
		t2.setBounds(120, 70, 200, 20);
		t3.setBounds(140, 100, 180, 20);
		b.setBounds(140, 130, 100, 20);
		l.setFont(new Font(null, Font.PLAIN, 12));
		l2.setFont(new Font(null, Font.PLAIN, 12));
		l3.setFont(new Font(null, Font.PLAIN, 12));
		f.setLayout(null);
				
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400, 200);
		f.setLayout(null);
		f.setVisible(true);
		final ImageIcon image = new ImageIcon("onibus.png");
		f.setIconImage(image.getImage());
//		f.getContentPane().setBackground(new Color(255, 254, 195));

		f.add(N);
		f.add(b);
		f.add(l);
		f.add(l2);
		f.add(l3);
		f.add(t);
		f.add(t2);
		f.add(t3);
		
		b.addActionListener(this);

	}

	@Override
	public void actionPerformed(final ActionEvent e) {
		if (e.getSource() == b) {
			Tela4 tela4 = new Tela4();
		}
	}
}
