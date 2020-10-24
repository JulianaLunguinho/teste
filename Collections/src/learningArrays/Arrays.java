package learningArrays;

public class Arrays {
    public static void main(String[] args) {
        Integer[] accounts = new Integer[10];

        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = i*30;
        }

        Integer soma = 0;
        for (int i = 0; i < accounts.length; i++) {
            soma += accounts[i];
        }
        System.out.println(soma/accounts.length);
    }
}
