package interFace;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import controller.Controle_dados;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

public class Tela3 extends JFrame implements ActionListener {
    private JFrame f = new JFrame();
    private JButton b;
    private static Controle_dados cn;
    private JComboBox<String> d;
    private String[] diasn = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    private JComboBox<String> m;
    private String[] mes = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
    private JTextField ano = new JTextField();
    private JLabel itine;

    public Tela3(Controle_dados dados) {
        cn = dados;
        b = new JButton("Buscar Linha");
        d = new JComboBox<String>(diasn);
        m = new JComboBox<String>(mes);

        ano.setBounds(250, 20, 40, 20);
        m.setBounds(200, 20, 40, 20);
        d.setBounds(150, 20, 40, 20);
        b.setBounds(10, 20, 130, 20);

        f.add(b);
        f.add(ano);
        f.add(m);
        f.add(d);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 200);
        f.setLayout(null);
        f.setVisible(true);

        ImageIcon image = new ImageIcon("onibus.png");
        f.setIconImage(image.getImage());

        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            int[] posi =  cn.busca(diasn[d.getSelectedIndex()], mes[m.getSelectedIndex()], ano.getText());
            if (posi != null) {
                String itineText = cn.getDados().getEmpresa().getOnibus(posi[0]).getItinerarios().get(posi[1]).toString();
                itine = new JLabel(itineText);
                itine.setBounds(10, 60, 1000, 20);
                f.add(itine);
                f.repaint();
            }
        }
    }
}