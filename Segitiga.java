import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Segitiga implements ActionListener {
	private JLabel labelAlas, labelTinggi, labelLuas, labelKeliling;
	private JTextField textFieldAlas, textFieldTinggi, textFieldLuas, textFieldKeliling;
	private JButton buttonHitung, buttonReset;

	public JPanel setSegitiga() {
			labelAlas = new JLabel("Alas");
			labelTinggi = new JLabel("Tinggi");
			labelLuas = new JLabel("Luas");
			labelKeliling = new JLabel("Keliling");

			textFieldAlas = new JTextField();
			textFieldTinggi = new JTextField();
			textFieldLuas = new JTextField();
			textFieldKeliling = new JTextField();

			buttonHitung = new JButton("Hitung");
			buttonReset = new JButton("Reset");

	        JPanel panelSegitiga = new JPanel();
	        panelSegitiga.setLayout(new GridLayout(5,2));
	        panelSegitiga.add(labelAlas); panelSegitiga.add(textFieldAlas);
	        panelSegitiga.add(labelTinggi); panelSegitiga.add(textFieldTinggi);
	        panelSegitiga.add(labelLuas); panelSegitiga.add(textFieldLuas);
	        panelSegitiga.add(labelKeliling); panelSegitiga.add(textFieldKeliling);
	        panelSegitiga.add(buttonHitung); panelSegitiga.add(buttonReset);

	        textFieldLuas.setEditable(false);
	        textFieldKeliling.setEditable(false);

	        buttonHitung.addActionListener(this);
	        buttonReset.addActionListener(this);
	        
	        return panelSegitiga;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttonHitung) {
			try {
				BangunDatar segitiga = new BangunDatar(Double.parseDouble(textFieldAlas.getText()),Double.parseDouble(textFieldTinggi.getText()));
				textFieldLuas.setText(String.valueOf(segitiga.luasSegitiga()));
				textFieldKeliling.setText(String.valueOf(segitiga.kelilingSegitiga()));
			} catch (NumberFormatException a) {
          		JOptionPane.showMessageDialog(null,"Anda harus memasukan angka!");
          	}
		} else {
			textFieldAlas.setText("");
			textFieldTinggi.setText("");
			textFieldLuas.setText("");
			textFieldKeliling.setText("");
		}
	}
}