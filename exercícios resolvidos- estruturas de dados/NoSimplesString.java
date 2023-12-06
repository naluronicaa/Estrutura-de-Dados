/*
 * ALGED - Lista Ex - 2o Sem - Ex24/25
 *
 *	Listas Singularmente Encadeadas
 */
 
import	javax.swing.*;	

public class NoSimplesString
{	
	private	Object				oElemento;
	private	NoSimplesString	nsProximo;

	public	NoSimplesString()
	{
		oElemento=null;
		nsProximo=null;
	}
	
	public	NoSimplesString(Object	oE,	NoSimplesString nsN)
	{
		oElemento=oE;
		nsProximo=nsN;
	}
	
	void		setNext(NoSimplesString	nsN)
	{
		nsProximo=nsN;
	}
	
	Object		getElement()
	{
		return	oElemento;
	}
	
	NoSimplesString	getNext()
	{
		return	nsProximo;
	}
}
