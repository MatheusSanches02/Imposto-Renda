package CheckPoint3;

public class PessoaJuridica extends Contribuinte 
{
	@Override
	double calcularImposto() 
	{
		return this.getRenda() * 10 / 100;
	}
	
	@Override
	public void apresentarContribuinte()
	{
		this.mostrarContribuinte(this.calcularImposto());
	}
}
