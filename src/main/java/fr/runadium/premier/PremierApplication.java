package fr.runadium.premier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PremierApplication {

	public static void main(String[] args) {
    Premier p=new Premier();
    System.out.println(p.sumPremier(4));
	}

	
}
