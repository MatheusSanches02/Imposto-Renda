package CheckPoint3;

public class Main 
{
	public static void main(String[] args) 
	{
		PessoaFisica pf = new PessoaFisica();
		pf.adicionarContribuinte("Matheus Sanches", 10000);
		pf.apresentarContribuinte();
		
		PessoaJuridica pj = new PessoaJuridica();
		pj.adicionarContribuinte("Giovanna França", 20000);
		pj.apresentarContribuinte();
	}
}
