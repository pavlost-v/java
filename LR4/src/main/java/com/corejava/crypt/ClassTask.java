package com.corejava.crypt;

import java.util.Arrays;
import java.util.ServiceLoader;
public class ClassTask {
    public static final ServiceLoader<Cipher> cipherLoader = ServiceLoader.load(Cipher.class);

    public static Cipher getCipher(int minStrength) {
        for (Cipher cipher : cipherLoader) // неявно вызывает итератор
            if (cipher.strength() >= minStrength) return cipher;
        return null;
    }

    public static void main(String[] args) {
        Cipher c = getCipher(0);
        System.out.println(c);
        byte[] input = new byte[] {1, 2, 3, 4};
        byte[] key = new byte[] {1,0,1,0};
        for (Cipher cipher : cipherLoader) {
            System.out.println("Encrypt:");
            byte[] encrypt = cipher.encrypt(input, key);
            System.out.println(Arrays.toString(encrypt));
            System.out.println("Decrypt");
            System.out.println(Arrays.toString(cipher.decrypt(encrypt, key)));
        }
    }
}
