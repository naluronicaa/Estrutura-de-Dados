/*
 * ALGED - Lista Ex - 2o Sem - Ex26
 *
 *	Listas Singularmente Encadeadas
 */
 
import	javax.swing.*;	

public class NoSimplesChar
{	
	private	char				cElemento;
	private	NoSimplesChar	nsProximo;

	public	NoSimplesChar()
	{
		cElemento='\0';
		nsProximo=null;
	}
	
	public	NoSimplesChar(char cE,	NoSimplesChar nsN)
	{
		cElemento=cE;
		nsProximo=nsN;
	}
	
	void		setNext(NoSimplesChar nsN)
	{
		nsProximo=nsN;
	}
	
	char		getElement()
	{
		return	cElemento;
	}
	
	NoSimplesChar	getNext()
	{
		return	nsProximo;
	}
}
