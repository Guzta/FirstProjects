package dataProvider;

public class Usuario {

	String email;
	String nome;
	String apelido;
	String senha;
	String senha2;
	String compania;
	String primeiroNome;
	String ultimoNome;
	String endereco;
	String codigoPostal;
	String cidade;
	
	
	public Usuario( String email, String nome, String apelido, String senha, String senha2, String compania, String primeiroNome, String ultimoNome,
					String endereco, String codigoPostal, String cidade) {
		super();

		this.email = email;
		this.nome = nome;
		this.apelido = apelido;
		this.senha = senha;
		this.senha2 = senha2;
		this.compania = compania;
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.endereco = endereco;
		this.codigoPostal = codigoPostal;
		this.cidade = cidade;
	}	
	
	//email
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	//nome
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//apelido
	public String getApelido() {
		return apelido;
	}
	
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}	
	
	//senha
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	//confirma senha (senha2)
	public String getSenha2() {
		return senha2;	
	}
	
	public void setSenha2(String senha2) {
		this.senha2 = senha2;
	}
	
	//compania
	public String getCompania() {
		return compania;
	}
	
	public void setCompania(String compania) {
		this.compania = compania;
	}
	
	//primeiroNome
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	
	//ultimoNome
	public String getUltimoNome() {
		return ultimoNome;
	}
	
	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}
	
	//endereço
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	//codigoPostal
	public String getCodigoPostal() {
		return codigoPostal;
	}
	
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	// cidade
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
}