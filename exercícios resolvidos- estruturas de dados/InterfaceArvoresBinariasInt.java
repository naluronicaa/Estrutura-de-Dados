public	interface	InterfaceArvoresBinariasInt
{
	public	void			inserirNosInt();													// Digita e Insere N�s em uma �rvore bin�ria no Percurso Pr�-Ordenado;
	public	void			inserirNoFolha(NoArvoreInt naNoAnt, NoArvoreInt naNo);// Insere N� Folha em uma �rvore bin�ria;
	public	void			apresentarNosIntPreOrdenados();								// Apresenta todos os N�s de uma �rvore bin�ria no Percurso Pr�-Ordenado;
	public	void			apresentarNosIntOrdenados();									// Apresenta todos os N�s de uma �rvore bin�ria no Percurso Ordenado;
	public	void			apresentarNosIntPosOrdenados();								// Apresenta todos os N�s de uma �rvore bin�ria no Percurso P�s-Ordenado;
	public	void			apresentaPercursoInt(char cTipo, NoArvoreInt	naNo);	// Apresenta o pr�ximo N� de uma �rvore bin�ria no Percurso P�s-Ordenado;
	public	void			apresentarArvoreInt();											// Apresenta �rvore Bin�ria deslocada de 90 graus em tela;
	public	void			apresentaNivelInt(int iNivel, NoArvoreInt	naNo);		// Apresenta N�s do N�vel iNivel da �rvore bin�ria;
	public	void			buscarNoInt();														// Executa a busca de um determinado n� na �rvore bin�ria;
	public	boolean		estahNaArvore(int iNo, NoArvoreInt	naNo);				// Retorna flag informando se o n� iNo est� na �rvore bin�ria;
	public	void			eliminarNoInt();													// Elimina N� a ser especicado da �rvore Bin�ria;
	public	NoArvoreInt	excluiNoInt(int iNo, NoArvoreInt naNo);					// Elimina N� especificado da �rvore Bin�ria e faz os devidos ajustes;
	public	boolean		ehVazia();															// Retorna flag informando se a �rvore bin�ria est� vazia ou n�o;
}
