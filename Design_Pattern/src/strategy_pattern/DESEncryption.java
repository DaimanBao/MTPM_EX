package strategy_pattern;

public class DESEncryption implements EncryptionStrategy {
	@Override
    public void encrypt(String text) {
        System.out.println("Mã hóa văn bản: '" + text + "' bằng thuật toán DES.");
    }
}
