//não pode instanciar essa classe, porque é abstrata
public abstract class Funcionario {
 		
		private String nome;
        private String cpf;
        private double salario;
        
        private int senha;
        
        //senha
        public void setSenha(int senha) {
        	this.senha = senha;
        }
        
        //método senha
        public boolean autentica(int senha) {
        	if(this.senha == senha) {
        		return true;
        	} else {
        		return false;
        	}
        }
        
        //método sem corpo, nao ha implementação
        public abstract double getBonificacao();
        
        //nome
        public String getNome() {
        	return nome;
        }
        
        public void setNome(String nome) {
        	this.nome = nome;
        }
        
        //cpf
        public String getCpf() {
        	return cpf;
        }
        
        public void setCpf(String cpf) {
        	this.cpf = cpf;
        }
        
        //salario
        public double getSalario() {
        	return salario;
        }
        
        public void setSalario(double salario) {
        	this.salario = salario;
        }
}
