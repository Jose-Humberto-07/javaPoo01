/**
 * 
 */
package aula_005_exemplo_prático_conta_banco;

/**
 * @author humbe
 *
 */
public class TesteContaBanco {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		ContaBanco conta1 = new ContaBanco();
		conta1.setNumConta(12345);
		conta1.setDono("Jubileu");
		conta1.abrirConta("CC");
		conta1.depositar(300);
		conta1.fecharConta();
		conta1.sacar(350);
		conta1.fecharConta();
		
		
		ContaBanco conta2 = new ContaBanco();
		conta2.setNumConta(222222);
		conta2.setDono("Creuza");
		conta2.abrirConta("CP");
		conta2.depositar(500);
		conta2.sacar(100);
			
		
		conta1.estadoAtual();
		System.out.println();
		System.out.println();
		conta2.estadoAtual();
	}

}
