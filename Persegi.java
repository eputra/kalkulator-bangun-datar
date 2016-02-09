import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Persegi implements ActionListener {
	private JLabel labelSisi, labelLuas, labelKeliling;
	private JTextField textFieldSisi, textFieldLuas, textFieldKeliling;
	private JButton buttonHitung, buttonReset;

	public JPanel setPersegi() {
			labelSisi = new JLabel("Sisi");
			labelLuas = new JLabel("Luas");
			labelKeliling = new JLabel("Keliling");

			textFieldSisi = new JTextField();
			textFieldLuas = new JTextField();
			textFieldKeliling = new JTextField();

			buttonHitung = new JButton("Hitung");
			buttonReset = new JButton("Reset");

	        JPanel panelPersegi = new JPanel();
	        panelPersegi.setLayout(new GridLayout(4,2));
	        panelPersegi.add(labelSisi); panelPersegi.add(textFieldSisi);
	        panelPersegi.add(labelLuas); panelPersegi.add(textFieldLuas);
	        panelPersegi.add(labelKeliling); panelPersegi.add(textFieldKeliling);
	        panelPersegi.add(buttonHitung); panelPersegi.add(buttonReset);

	        textFieldLuas.setEditable(false);
	        textFieldKeliling.setEditable(false);

	        buttonHitung.addActionListener(this);
	        buttonReset.addActionListener(this);
	        
	        return panelPersegi;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttonHitung) {
			try {
				BangunDatar persegi = new BangunDatar(Double.parseDouble(textFieldSisi.getText()));
				textFieldLuas.setText(String.valueOf(persegi.luasPersegi()));
				textFieldKeliling.setText(String.valueOf(persegi.kelilingPersegi()));
			} catch (NumberFormatException a) {
          		JOptionPane.showMessageDialog(null,"Anda harus memasukan angka!");
          	}
		} else {
			textFieldSisi.setText("");
			textFieldLuas.setText("");
			textFieldKeliling.setText("");
		}
	}
}