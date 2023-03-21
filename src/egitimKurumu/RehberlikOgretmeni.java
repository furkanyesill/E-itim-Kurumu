package egitimKurumu;

public class RehberlikOgretmeni implements EgitimKurumu {
	String sonCalistigiKurum(String sonCalisilanKurum) {
		return sonCalisilanKurum;
	}

	@Override
	public int yas(int basvuranYasi) {
		return basvuranYasi;
	}

	@Override
	public int egitimTecrube(int basvuranTecrubesi) {
		return basvuranTecrubesi;
	}

	@Override
	public String medeniHali(String medeniHali) {
		return medeniHali;
	}

}
