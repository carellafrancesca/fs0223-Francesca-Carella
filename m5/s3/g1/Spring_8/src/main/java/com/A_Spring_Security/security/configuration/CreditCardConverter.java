package com.A_Spring_Security.security.configuration;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.beans.factory.annotation.Value;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class CreditCardConverter implements AttributeConverter<String, String>{

	@Value("${app-algorithm}") private String SecretAlgorithm;
	@Value("${app-secret-key}") private String SecretKEY;
	@Value("${app-init-vector}") private String SecretInitVector;
	
	//private static String ALGORITHM = "AES/CBC/PKCS5Padding";
	//private static final byte[] KEY = "MySUperSecretKey".getBytes(StandardCharsets.UTF_8);
	//private String initVector = "1234567812345678";
	//IvParameterSpec iv = new IvParameterSpec(initVector.getBytes(StandardCharsets.UTF_8));
	
	@Override
	public String convertToDatabaseColumn(String attribute) {
		byte[] KEY = SecretKEY.getBytes(StandardCharsets.UTF_8);
		IvParameterSpec iv = new IvParameterSpec(SecretInitVector.getBytes(StandardCharsets.UTF_8));
		Key key = new SecretKeySpec(KEY, "AES");
		try {
			Cipher c = Cipher.getInstance(SecretAlgorithm);
			c.init(Cipher.ENCRYPT_MODE, key, iv);
			return Base64.getEncoder().encodeToString((c.doFinal(attribute.getBytes())));
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}

	@Override
	public String convertToEntityAttribute(String dbData) {
		byte[] KEY = SecretKEY.getBytes(StandardCharsets.UTF_8);
		IvParameterSpec iv = new IvParameterSpec(SecretInitVector.getBytes(StandardCharsets.UTF_8));
		Key key = new SecretKeySpec(KEY, "AES");
		try {
			Cipher c = Cipher.getInstance(SecretAlgorithm);
			c.init(Cipher.DECRYPT_MODE, key, iv);
			return new String(c.doFinal(Base64.getDecoder().decode(dbData)));
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
	
}
