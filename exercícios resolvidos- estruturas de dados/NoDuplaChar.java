	

public class NoDuplaChar
{	
	private	char			cElemento;
	private	NoDuplaChar	nsAnterior;
	private	NoDuplaChar	nsProximo;

	public	NoDuplaChar()
	{
		cElemento='\0';
		nsAnterior=null;
		nsProximo=null;
	}
	
	public	NoDuplaChar(char cE,	NoDuplaChar nsA, NoDuplaChar nsP)
	{
		cElemento=cE;
		nsAnterior=nsA;
		nsProximo=nsP;
	}
	
	void		setNext(NoDuplaChar nsN)
	{
		nsProximo=nsN;
	}

	void		setPrevious(NoDuplaChar nsP)
	{
		nsAnterior=nsP;
	}
	
	char		getElement()
	{
		return	cElemento;
	}
	
	NoDuplaChar	getNext()
	{
		return	nsProximo;
	}
	
	NoDuplaChar	getPrevious()
	{
		return	nsAnterior;
	}
}
