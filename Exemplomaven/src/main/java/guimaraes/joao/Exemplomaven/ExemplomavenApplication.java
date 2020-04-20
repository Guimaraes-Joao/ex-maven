package guimaraes.joao.Exemplomaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ExemplomavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemplomavenApplication.class, args);

		Scanner scanner= new Scanner(System.in);
		Calculadora calculadora = new Calculadora();

	do {
		System.out.println("Digite o valor para o numero 01: ");
		calculadora.setNumero1(scanner.nextDouble());
	}while(calculadora.getNumero1() >=0);

	do {
		System.out.println("Digite o valor para o numero 02: ");
		calculadora.setNumero2(scanner.nextDouble());
	}while (calculadora.getNumero2() >=0);

		System.out.println( "Soma: " + calculadora.somar() +
							"Subtração: " + calculadora.subtrair() +
							"Multiplicação: " + calculadora.mutiplicar() +
							"Divisão: " + calculadora.dividir());
	}

}