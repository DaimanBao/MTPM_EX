package strategy_pattern;

public class Main {
	public static void main(String[] args) {
		Encryptor encryptor = new Encryptor();

        System.out.println("--- Giai đoạn 1: Dùng AES ---");
        encryptor.setStrategy(new AESEncryption());
        encryptor.encryptFile("MatKhau123");

        System.out.println("\n--- Giai đoạn 2: Đổi sang DES ---");
        encryptor.setStrategy(new DESEncryption());
        encryptor.encryptFile("MatKhau123");
	}
}
