/* 	Analogia de um contrato:
 * 
 * Contrato Autenticavel:
 * 
 *  # Quem assinar o contrato, obrigatoriamente, precisa implementar os seguintes métodos:
 *     
 *      1 - método senha;
 *      2 - método autentica;
 */
public abstract interface Autenticavel {

	public void setSenha(int senha);

	public boolean autentica(int senha);

}
