public class BTreeG_M<E>
{
	/*
	 * ALGESD - N� em �rvore Bin�ria - Classe NodoAB
	 * Aplica��o Exemplo - Por RC
	 * 
	 */
	private class NodoAB<T>
	{	
		private 	T tElement;
		private	NodoAB<T>	ndLeft;
		private	NodoAB<T>	ndRight;

		public NodoAB(T tE, NodoAB<T> ndL, NodoAB<T> ndR)
		{
			tElement = tE;
			ndLeft = ndL;
			ndRight = ndR;
		}
		
		public void setLeft(NodoAB<T> ndL)
		{
			ndLeft = ndL;
		}
		
		public void setRight(NodoAB<T> ndR)
		{
			ndRight = ndR;
		}
		
		public T getElement()
		{
			return tElement;
		}
		
		public NodoAB<T> getLeft()
		{
			return ndLeft;
		}
		
		public NodoAB<T> getRight()
		{
			return ndRight;
		}
	}
	
	private NodoAB<E>	ndRaiz;
	private int iTamanho;
	
	public BTreeG_M()
	{
		ndRaiz = null;
		iTamanho = 0;
	}
	
	public void putNode(E eE)
	{	
		NodoAB<E> ndNovo = new NodoAB<E>(eE, null, null);
		if(isEmpty())	ndRaiz = ndNovo;
		else	insertLeaf(ndRaiz, ndNovo);
		iTamanho++;
	}
	
	public	void	insertLeaf(NodoAB<E> ndNoPai, NodoAB<E> ndNoFilho)
	{
		NodoAB<E>	ndAux;
		if((Integer)ndNoFilho.getElement() < (Integer)ndNoPai.getElement())
		{
			ndAux = ndNoPai.getLeft();
			if(ndAux != null)	insertLeaf(ndAux, ndNoFilho);
			else	ndNoPai.setLeft(ndNoFilho);
		}
		else
		{
			ndAux = ndNoPai.getRight();
			if(ndAux != null)	insertLeaf(ndAux, ndNoFilho);
			else	ndNoPai.setRight(ndNoFilho);
		}
	}
	
	public	boolean takeNode(E eE)
	{	
		boolean bResp = false;
		if(isInTree(eE, ndRaiz))
		{
			ndRaiz = deleteNode(eE, ndRaiz);
			bResp = true;
			iTamanho--;
		}
		return bResp;
	}
	
	public	NodoAB<E> deleteNode(E eE, NodoAB<E> ndNo)
	{
		NodoAB<E> ndAux, ndRet = null;
				
		if(ndNo != null)
		{
			if((Integer)ndNo.getElement() == (Integer)eE)
			{
				if(ndNo.getLeft() == ndNo.getRight())	ndRet = null;
				else
				{
					if(ndNo.getLeft() == null)	ndRet = ndNo.getRight();
					else
					{
						if(ndNo.getRight() == null)	 ndRet = ndNo.getLeft();
						else
						{
							ndAux = ndNo.getRight();
							while(ndAux.getLeft() != null)	ndAux = ndAux.getLeft();
							ndAux.setLeft(ndNo.getLeft());
							ndRet =	ndNo.getRight();
						}
					}
				}				
			}
			else
			{
				if((Integer)ndNo.getElement() < (Integer)eE)	
						ndNo.setRight(deleteNode(eE,ndNo.getRight()));
				else	ndNo.setLeft(deleteNode(eE,ndNo.getLeft()));
				ndRet = ndNo;
			}
		}
		return	ndRet;
	}

			
	public	boolean	 viewNode(E eE)
	{	
		return	isInTree(eE, ndRaiz);
	}
	
	public	boolean	 isInTree(E eE, NodoAB<E> ndNo)
	{
		boolean bResp = false;
		if(ndNo != null)
		{
			if((Integer)eE == (Integer)ndNo.getElement())	bResp = true;
			else
			{
				if((Integer)eE < (Integer)ndNo.getElement())
				{
					if(isInTree(eE, ndNo.getLeft()))	bResp = true;
				}
				else
				{
					if(isInTree(eE, ndNo.getRight()))	bResp = true;
				}
			}
		}
		return	bResp;
	}
	
	public	String	getTree()
	{
		return	getLevel(0, ndRaiz);
	}
	
	public	String	getLevel(int iLevel, NodoAB<E> ndNo)
	{
		String	sOut = "";
		if(ndNo != null)
		{
			sOut += getLevel(iLevel+1, ndNo.getLeft());
			for(int iI = 0; iI < iLevel; iI++)	sOut += "          "; // 10 espa�os
			sOut += ndNo.getElement() + "\n";
			sOut += getLevel(iLevel+1, ndNo.getRight());
		}	
		return	sOut;
	}
	
	public int size()
	{
		return iTamanho;
	}
	
	public boolean isEmpty()
	{
		boolean bR = false;
		if(size() == 0)		bR = true;
		return	bR;
	}
	
	public String getPreOrdered()
	{
		return	getTreeTrack('p', ndRaiz);	// 'p' para Pr�-Ordem
	}
	
	public String getOrdered()
	{
		return	getTreeTrack('o', ndRaiz);	// 'o' para Ordem
	}
	
	public String getPosOrdered()
	{
		return	getTreeTrack('P', ndRaiz);	// 'P' para P�s-Ordem
	}
	
	public String getTreeTrack(char cTipo, NodoAB<E> ndNo)
	{
		String	sIO = "";
		if(ndNo != null)
		{
			if(cTipo == 'p')	sIO += ndNo.getElement() + " ";	// 1 espa�o
			sIO += getTreeTrack(cTipo, ndNo.getLeft());
			if(cTipo == 'o')	sIO += ndNo.getElement() + " ";	// 1 espa�o
			sIO += getTreeTrack(cTipo, ndNo.getRight());
			if(cTipo == 'P')	sIO += ndNo.getElement() + " ";	// 1 espa�o
		}
		return sIO;
	}
}
