package strategy_pattern;

public class Encryptor {
	private EncryptionStrategy strategy;

    public void setStrategy(EncryptionStrategy strategy) {
        this.strategy = strategy;
    }

    public void encryptFile(String text) {
        if (strategy == null) {
            System.out.println("Vui lòng chọn thuật toán mã hóa trước!");
        } else {
            strategy.encrypt(text);
        }
    }
}
