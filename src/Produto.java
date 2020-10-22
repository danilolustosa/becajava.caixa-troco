import java.util.Scanner;

public class Produto {
	public Scanner Leitor = new Scanner(System.in);
	public double ValorProduto;
	public double ValorPago;
	public double Troco;
	
	public void ObterValor() {
		System.out.println("Digite o valor do produto:");
		ValorProduto = Leitor.nextDouble();		
	}
	
	public void Pagar() {
        System.out.println("Digite o valor a pagar:");
        ValorPago = Leitor.nextDouble();		
	}
	
	public void Troco() {
		Troco = ValorPago - ValorProduto;
        
        if (Troco > 0) {
            System.out.println("Seu troco eh: " + Troco);
        } else
            System.out.println("Não existe troco");
	}
}
