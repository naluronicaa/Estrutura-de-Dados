/*
 * ALGED - Lista Ex - 2o Sem - Ex30, 31, 32, 33, 34 e 35
 *
 *	�rvores Bin�rias
 */
 
import javax.swing.JOptionPane;

public class ArvoresBinariasInt implements InterfaceArvoresBinariasInt
{
	private	NoArvoreInt	naPai;
	private	int			iTamanho;
	private	String		sIO,sTitle;
	
	public	ArvoresBinariasInt()
	{
		naPai=null;
		iTamanho=0;
	}
	
	public	void	inserirNosInt()
	{
		int	iI;
		
		sIO="Digite o N�mero a ser inserido no N�";
		sTitle="�rvores Bin�rias";
		iI=Integer.parseInt(JOptionPane.showInputDialog(null,sIO,sTitle,JOptionPane.QUESTION_MESSAGE));

		NoArvoreInt	naNovo = new NoArvoreInt(iI, null, null);

		if(ehVazia())	naPai=naNovo;
		else	inserirNoFolha(naPai, naNovo);
		iTamanho++;
	}

	public	void	inserirNoFolha(NoArvoreInt naNoAnt, NoArvoreInt naNo)
	{
		NoArvoreInt	naRasc;
		
		if(naNo.getElement() <= naNoAnt.getElement())
		{
			naRasc=naNoAnt.getLeft();
			if(naRasc!=null)	inserirNoFolha(naRasc, naNo);
			else	naNoAnt.setLeft(naNo);
		}
		else
		{
			naRasc=naNoAnt.getRight();
			if(naRasc!=null)	inserirNoFolha(naRasc,naNo);
			else	naNoAnt.setRight(naNo);
		}
	}
	
	public	void	apresentarNosIntPreOrdenados()
	{
		sIO="";
		sTitle="Percurso Pr�-Ordenado";
		
		if(ehVazia())	sIO+="�rvore Bin�ria Vazia!";
		else	apresentaPercursoInt('p', naPai);
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.PLAIN_MESSAGE);
	}
	
	public	void	apresentarNosIntOrdenados()
	{
		sIO="";
		sTitle="Percurso Ordenado";
		
		if(ehVazia())	sIO+="�rvore Bin�ria Vazia!";
		else	apresentaPercursoInt('o', naPai);
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.PLAIN_MESSAGE);
	}

	public	void	apresentarNosIntPosOrdenados()
	{
		sIO="";
		sTitle="Percurso P�s-Ordenado";
		
		if(ehVazia())	sIO+="�rvore Bin�ria Vazia!";
		else	apresentaPercursoInt('P', naPai);
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.PLAIN_MESSAGE);
	}

	public	void	apresentaPercursoInt(char	cTipo, NoArvoreInt	naNo)
	{
		if(naNo!=null)
		{
			if(cTipo=='p')	sIO+=naNo.getElement()+" ";
			apresentaPercursoInt(cTipo, naNo.getLeft());
			if(cTipo=='o')	sIO+=naNo.getElement()+" ";
			apresentaPercursoInt(cTipo, naNo.getRight());
			if(cTipo=='P')	sIO+=naNo.getElement()+" ";
		}
	}

	public	void	apresentarArvoreInt()
	{
		sIO="";
		sTitle="�rvore a 90 graus";
		
		if(ehVazia())	sIO+="�rvore Bin�ria Vazia!";
		else	apresentaNivelInt(0, naPai);
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.PLAIN_MESSAGE);
	}

	public	void	apresentaNivelInt(int iNivel, NoArvoreInt	naNo)
	{
		int	iI;
		
		if(naNo!=null)
		{
			apresentaNivelInt(iNivel+1, naNo.getRight());
			for(iI=0;iI<iNivel;iI++)	sIO+="               ";
			sIO+=naNo.getElement()+"\n";
			apresentaNivelInt(iNivel+1, naNo.getLeft());
		}
	}

	public	void		buscarNoInt()
	{
		int	iI;
		
		sTitle="Busca em �rvore Bin�ria";

		if(ehVazia())	sIO="�rvore Bin�ria Vazia!";
		else
		{
			sIO="Digite o N� a ser localizado:";
			iI=Integer.parseInt(JOptionPane.showInputDialog(null,sIO,sTitle,JOptionPane.QUESTION_MESSAGE));
			sIO="O N� "+iI;
			if(!estahNaArvore(iI, naPai))	sIO+=" n�o";
			sIO+=" se encontra na �rvore Bin�ria";
		}
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.PLAIN_MESSAGE);
	}
	
	public	boolean	estahNaArvore(int iNo, NoArvoreInt	naNo)
	{
		if(naNo != null)
		{
			if(iNo == naNo.getElement())	return	true;
			else
			{
				if(iNo < naNo.getElement())
				{
					if(estahNaArvore(iNo, naNo.getLeft()))	return	true;
				}
				else
				{
					if(estahNaArvore(iNo, naNo.getRight()))	return	true;
				}
			}
		}
		return	false;
	}
	
	public	void		eliminarNoInt()
	{
		int	iI;
		
		sTitle="Busca em �rvore Bin�ria";

		if(ehVazia())	sIO="�rvore Bin�ria Vazia!";
		else
		{
			sIO="Digite o N� a ser eliminado:";
			iI=Integer.parseInt(JOptionPane.showInputDialog(null,sIO,sTitle,JOptionPane.QUESTION_MESSAGE));
			sIO="O N� "+iI;
			if(!estahNaArvore(iI, naPai))	sIO+=" n�o se encontra na";
			else
			{
				naPai=excluiNoInt(iI,naPai);
				sIO+=" foi eliminado da";
				iTamanho--;
			}
			sIO+=" �rvore Bin�ria";
		}
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.PLAIN_MESSAGE);
	}

	public	NoArvoreInt	excluiNoInt(int iNo, NoArvoreInt naNo)
	{
		NoArvoreInt	naRasc;
		
		if(naNo!=null)
		{
			if(naNo.getElement() == iNo)
			{
				if(naNo.getLeft() == naNo.getRight())	return	null;
				else
				{
					if(naNo.getLeft() == null)	return	naNo.getRight();
					else
					{
						if(naNo.getRight() == null)	return	naNo.getLeft();
						else
						{
							naRasc=naNo.getRight();
							while(naRasc.getLeft()!=null)	naRasc=naRasc.getLeft();
							naRasc.setLeft(naNo.getLeft());
							return	naNo.getRight();
						}
					}
				}				
			}
			if(naNo.getElement() < iNo)	naNo.setRight(excluiNoInt(iNo,naNo.getRight()));
			else	naNo.setLeft(excluiNoInt(iNo,naNo.getLeft()));
		}
		return	naNo;
	}
	
	public	boolean	ehVazia()
	{
		if(iTamanho==0)	return	true;
		else	return	false;
	}
}
