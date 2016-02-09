import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Lingkaran implements ActionListener {
	private JLabel labelJari, labelLuas, labelKeliling;
	private JTextField textFieldJari, textFieldLuas, textFieldKeliling;
	private JButton buttonHitung, buttonReset;

	public JPanel setLingkaran() {
			labelJari = new JLabel("Jari-jari");
			labelLuas = new JLabel("Luas");
			labelKeliling = new JLabel("Keliling");

			textFieldJari = new JTextField();
			textFieldLuas = new JTextField();
			textFieldKeliling = new JTextField();

			buttonHitung = new JButton("Hitung");
			buttonReset = new JButton("Reset");

	        JPanel panelLingkaran = new JPanel();
	        panelLingkaran.setLayout(new GridLayout(4,2));
	        panelLingkaran.add(labelJari); panelLingkaran.add(textFieldJari);
	        panelLingkaran.add(labelLuas); panelLingkaran.add(textFieldLuas);
	        panelLingkaran.add(labelKeliling); panelLingkaran.add(textFieldKeliling);
	        panelLingkaran.add(buttonHitung); panelLingkaran.add(buttonReset);

	        textFieldLuas.setEditable(false);
	        textFieldKeliling.setEditable(false);

	        buttonHitung.addActionListener(this);
	        buttonReset.addActionListener(this);
	        return panelLingkaran;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttonHitung) {
			try {
				BangunDatar lingkaran = new BangunDatar(Double.parseDouble(textFieldJari.getText()));
				textFieldLuas.setText(String.valueOf(lingkaran.luasLingkaran()));
				textFieldKeliling.setText(String.valueOf(lingkaran.kelilingLingkaran()));
			} catch (NumberFormatException a) {
          		JOptionPane.showMessageDialog(null,"Anda harus memasukan angka!");
          	}
		} else {
			textFieldJari.setText("");
			textFieldLuas.setText("");
			textFieldKeliling.setText("");
		}
	}
}