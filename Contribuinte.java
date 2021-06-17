package CheckPoint3;

public abstract  class Contribuinte extends Contribuintes
{
	private String nome;
	private double renda;
	
	abstract double calcularImposto();
	
	/**
	 * @return the nome
	 */
	public String getNome() 
	{
		return nome;
	}

	/**
	 * @return the renda
	 */
	public double getRenda() 
	{
		return renda;
	}

	/**
	 * Adiciona os dados informados no objeto
	 */	
	@Override
	public void adicionarContribuinte(String nome, double renda) 
	{
		this.nome = nome;
		this.renda = renda;
	}

	/**
	 * Printa os dados do contribuente
	 */	 
	public void mostrarContribuinte(double valorImposto)
	{
		System.out.println("O contribuinte " + this.getNome() + " com a renda " + this.getRenda() + " paga R$" + valorImposto);
	}
}