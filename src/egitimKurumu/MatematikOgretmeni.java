package egitimKurumu;

public class MatematikOgretmeni implements EgitimKurumu {

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
