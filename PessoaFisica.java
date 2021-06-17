package CheckPoint3;

public class PessoaFisica extends Contribuinte
{
	@Override
	double calcularImposto() 
	{
		double porcentagem = 0;
		if(this.getRenda() > 1500 && this.getRenda() <= 3000) 
		{
			porcentagem = 7.5;
		}
		else if(this.getRenda() > 3000) 
		{
			porcentagem = 15;
		}
		
		return this.getRenda() * porcentagem / 100;
	}
	
	@Override
	public void apresentarContribuinte()
	{
		this.mostrarContribuinte(this.calcularImposto());
	}
}
