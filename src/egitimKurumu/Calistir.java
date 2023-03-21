package egitimKurumu;

import java.util.Scanner;

public class Calistir {

	public static void main(String[] args) throws InterruptedException {
		String message = "Eğitim kurumumuzun iş başvurusuna hoşgeldiniz\n"
				+ "İlk olarak matematik öğretmenleri mülakata alınacaktır\n"
				+ "Aşağıdaki sorulan soruları sırasıyla cevaplayın\n" + "1-)Kaç yaşındasınız ?";
		System.out.println(message);
		Scanner scan = new Scanner(System.in);
		int yasA = scan.nextInt();
		MatematikOgretmeni m = new MatematikOgretmeni();
		m.yas(yasA);

		String message2 = "2-)Kaç yıldır eğitim sektöründesiniz ?";
		System.out.println(message2);
		int yilA = scan.nextInt();
		scan.nextLine();
		m.egitimTecrube(yilA);

		String message3 = "3-)Evli veya bekar mısınız ?";
		System.out.println(message3);
		String durum = scan.nextLine();
		m.medeniHali(durum);
		System.out.println("*******************************");

		Thread.sleep(2000);

		String messageB = "Rehberlik danışmanı mülakatı başlamıştır\n" + "Aşağıdaki soruları sırasıyla cevaplayın\n"
				+ "1-)en son nerede çalıştınız (özel sektör veya devlet kurumu) ?";
		System.out.println(messageB);
		RehberlikOgretmeni r = new RehberlikOgretmeni();
		String cevap = scan.nextLine();
		r.sonCalistigiKurum(cevap);

		String messageB2 = "2-)Kaç yaşındasınız ?";
		System.out.println(messageB2);
		int cevap2 = scan.nextInt();
		r.yas(cevap2);

		String messageB3 = "3-)Kaç yıldır eğitim sektöründesiniz ?";
		System.out.println(messageB3);
		int cevap3 = scan.nextInt();
		scan.nextLine();
		r.egitimTecrube(cevap3);

		String messageB4 = "4-)Evli veya bekar mısınız ?";
		System.out.println(messageB4);
		String cevap4 = scan.nextLine();
		r.medeniHali(cevap4);

		System.out.println("Matematik öğretmeni mülakat sonuçları değerlendiriliyor...");
		Thread.sleep(3000);
		if (yasA < 40 && yilA >= 3 && durum.equals("bekar")) {
			System.out.println("Matematik öğretmeni mülakatını geçtiniz.");
		} else {
			System.out.println("Üzgünüz mülakatı geçemediniz");
		}

		System.out.println("Rehberlik öğretmeni mülakat sonuçları değerlendiriliyor...");
		Thread.sleep(3000);
		if (cevap.equals("devlet kurumu") && cevap2 < 50 && cevap3 >= 4 && !cevap4.equals(null)) {
			System.out.println("Rehberlik öğretmeni mülakatını geçtiniz.");
		} else {
			System.out.println("Üzgünüz mülakatı geçemediniz");
		}
		return;
	}
}
