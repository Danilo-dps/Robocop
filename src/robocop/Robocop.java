
package robocop;

import java.util.Scanner;

public class Robocop {

    public static void main(String[] args) {
        Robo robo = new Robo();
        Calculadora calculadora = new Calculadora(robo);
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Menu de opções:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtrai");
            System.out.println("3 - Multiplica");
            System.out.println("4 - Divide");
            System.out.println("5 - Sai");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            
            if (opcao == 5) {
                System.out.println("Saindo...");
                break;
            }
            
            System.out.print("Digite o primeiro número: ");
            float num1 = scanner.nextFloat();
            
            System.out.print("Digite o segundo número: ");
            float num2 = scanner.nextFloat();
            
            float resultado = 0;
            
            switch (opcao) {
                case 1:
                    resultado = calculadora.Soma(num1, num2);
                    break;
                case 2:
                    resultado = calculadora.Subtrair(num1, num2);
                    break;
                case 3:
                    resultado = calculadora.Multiplicar(num1, num2);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = calculadora.Dividir(num1, num2);
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
            }
            
            System.out.println("Resultado: " + resultado);
            
            robo.setBateria(robo.getBateria() - 1);
            System.out.println("Bateria restante: " + robo.getBateria());
            
            if (robo.getBateria() <= 0) {
                System.out.println("A bateria do robô acabou. Recarregue para continuar.");
                break;
            }
        }
        
        scanner.close();
    }
}

