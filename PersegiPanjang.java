import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PersegiPanjang implements ActionListener {
	private JLabel labelPanjang, labelLebar, labelLuas, labelKeliling;
	private JTextField textFieldPanjang, textFiledLebar, textFieldLuas, textFieldKeliling;
	private JButton buttonHittung, buttonReset;

	public JPanel setPersegiPanjang() {
			labelPanjang = new JLabel("Panjang");
			labelLebar = new JLabel("Lebar");
			labelLuas = new JLabel("Luas");
			labelKeliling = new JLabel("Keliling");

			textFieldPanjang = new JTextField();
			textFiledLebar = new JTextField();
			textFieldLuas = new JTextField();
			textFieldKeliling = new JTextField();

			buttonHittung = new JButton("Hitung");
			buttonReset = new JButton("Reset");

	        JPanel panelPersegiPanjang = new JPanel();
	        panelPersegiPanjang.setLayout(new GridLayout(5,2));
	        panelPersegiPanjang.add(labelPanjang); panelPersegiPanjang.add(textFieldPanjang);
	        panelPersegiPanjang.add(labelLebar); panelPersegiPanjang.add(textFiledLebar);
	        panelPersegiPanjang.add(labelLuas); panelPersegiPanjang.add(textFieldLuas);
	        panelPersegiPanjang.add(labelKeliling); panelPersegiPanjang.add(textFieldKeliling);
	        panelPersegiPanjang.add(buttonHittung); panelPersegiPanjang.add(buttonReset);

	        textFieldLuas.setEditable(false);
	        textFieldKeliling.setEditable(false);

	        buttonHittung.addActionListener(this);
	        buttonReset.addActionListener(this);

	        return panelPersegiPanjang;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttonHittung) {
			try {
				BangunDatar persegiPanjang = new BangunDatar(Double.parseDouble(textFieldPanjang.getText()),Double.parseDouble(textFiledLebar.getText()));
				textFieldLuas.setText(String.valueOf(persegiPanjang.luasPersegiPanjang()));
				textFieldKeliling.setText(String.valueOf(persegiPanjang.kelilingPersegiPanjang()));
			} catch (NumberFormatException a) {
          		JOptionPane.showMessageDialog(null,"Anda harus memasukan angka!");
          	}
		} else {
			textFieldPanjang.setText("");
			textFiledLebar.setText("");
			textFieldLuas.setText("");
			textFieldKeliling.setText("");
		}
	}
}