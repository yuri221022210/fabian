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

public class Tela3 extends JFrame implements ActionListener {
	JFrame f = new JFrame();
	public static JButton b;

	Tela3() {
		b = new JButton("Buscar Linha");
		JTextField texto = (new JTextField());

		texto.setBounds(150, 20, 100, 20);
		b.setBounds(10, 20, 130, 20);
		
		f.add(b);
		f.add(texto);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300, 200);
		f.setLayout(null);
		f.setVisible(true);

		ImageIcon image = new ImageIcon("onibus.png");
		f.setIconImage(image.getImage());
//		f.getContentPane().setBackground(new Color(255, 254, 195));
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
