public class Main {
	public static void main(String[] args) {
		Produto produto = new Produto();        
        produto.ObterValor();        
        
        do {
        	produto.Pagar();

            if (produto.ValorPago == 0)
            	break;
        	
        	if (produto.ValorPago < produto.ValorProduto)
        		System.out.println("ERRO: Você digitou o valor a ser pago MENOR do que o valor do produto");
        	else
        		produto.Troco();        		
        } while (produto.ValorPago != 0);        

        produto.Leitor.close();
	}
}