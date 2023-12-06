/*
 * ALGED - Lista Ex - 2o Sem - Ex28
 *
 *	Listas Duplamente Encadeadas
 */
 
import	javax.swing.*;	

public class NoDuplaString
{	
	private	Object			oElemento;
	private	NoDuplaString	nsAnterior;
	private	NoDuplaString	nsProximo;

	public	NoDuplaString()
	{
		oElemento=null;
		nsAnterior=null;
		nsProximo=null;
	}
	
	public	NoDuplaString(Object	oE, NoDuplaString nsA, NoDuplaString nsP)
	{
		oElemento=oE;
		nsAnterior=nsA;
		nsProximo=nsP;
	}
	
	void		setNext(NoDuplaString	nsN)
	{
		nsProximo=nsN;
	}

	void		setPrevious(NoDuplaString	nsP)
	{
		nsAnterior=nsP;
	}
		
	Object		getElement()
	{
		return	oElemento;
	}
	
	NoDuplaString	getNext()
	{
		return	nsProximo;
	}
	
	NoDuplaString	getPrevious()
	{
		return	nsAnterior;
	}
}
