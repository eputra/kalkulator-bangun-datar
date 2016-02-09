public class BangunDatar {
	private double garisX, garisY;

	public BangunDatar(double garisX) {
		this.garisX = garisX;
	}

	public BangunDatar(double garisX, double garisY) {
		this.garisX = garisX;
		this.garisY = garisY;
	}

	public double luasPersegi() {
		return garisX*garisX;
	}

	public double kelilingPersegi() {
		return 4*garisX;
	}

	public double luasPersegiPanjang() {
		return garisX*garisY;
	}

	public double kelilingPersegiPanjang() {
		return 2*(garisX+garisY);
	}

	public double luasSegitiga() {
		return 0.5*(garisX*garisY);
	}

	public double kelilingSegitiga() {
		double garisMiring = Math.sqrt((garisX*garisX)+(garisY*garisY));
		return garisX+garisY+garisMiring;
	}

	public double luasLingkaran() {
		return 3.14*(garisX*garisX);
	}

	public double kelilingLingkaran() {
		return 3.14*(2*garisX);
	}
}