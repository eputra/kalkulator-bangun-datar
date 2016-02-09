import java.awt.*;
import javax.swing.*;

class FrameMain extends JFrame {
	public FrameMain() {
		setTitle("Kalkulator Bangun Datar");
		setTabMain();
		setSize(392,190);
		//setSize(392,190); <- For Linux
		//setSize(338,190); <- For Windows
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void setTabMain() {
		Persegi panelPersegi = new Persegi();
		PersegiPanjang panelPersegiPanjang = new PersegiPanjang();
		Segitiga panelSegitiga = new Segitiga();
		Lingkaran panelLingkaran = new Lingkaran();

		JTabbedPane tabMain = new JTabbedPane();
		tabMain.addTab("Persegi", panelPersegi.setPersegi());
		tabMain.addTab("Persegi Panjang", panelPersegiPanjang.setPersegiPanjang());
		tabMain.addTab("Segitiga", panelSegitiga.setSegitiga());
		tabMain.addTab("Lingkaran", panelLingkaran.setLingkaran());

		add(tabMain);
	}
}

public class Main {
	public static void main(String[] args) {
		new FrameMain();
	}
}
