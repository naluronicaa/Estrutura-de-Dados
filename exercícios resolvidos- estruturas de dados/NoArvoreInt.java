	

public class NoArvoreInt
{	
	private	int			iElemento;
	private	NoArvoreInt	nsEsquerdo;
	private	NoArvoreInt	nsDireito;

	public	NoArvoreInt()
	{
		iElemento=0;
		nsEsquerdo=null;
		nsDireito=null;
	}
	
	public	NoArvoreInt(int iE, NoArvoreInt nsE, NoArvoreInt nsD)
	{
		iElemento=iE;
		nsEsquerdo=nsE;
		nsDireito=nsD;
	}
	
	void		setLeft(NoArvoreInt	nsE)
	{
		nsEsquerdo=nsE;
	}

	void		setRight(NoArvoreInt	nsD)
	{
		nsDireito=nsD;
	}
	
	int		getElement()
	{
		return	iElemento;
	}
	
	NoArvoreInt	getLeft()
	{
		return	nsEsquerdo;
	}

	NoArvoreInt	getRight()
	{
		return	nsDireito;
	}
}
