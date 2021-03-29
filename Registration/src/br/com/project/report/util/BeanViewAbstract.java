package br.com.project.report.util;

import org.springframework.stereotype.Component;

import br.com.project.util.all.ActionViewPadrao;
import br.com.project.util.all.EstatusPersistencia;
import br.com.project.util.all.Messagens;

@Component
public abstract class BeanViewAbstract implements ActionViewPadrao {

	private static final long serialVersionUID = 1L;

	@Override
	public void limparLIsta() throws Exception {
		

	}

	@Override
	public String save() throws Exception {
		
		return null;
	}

	@Override
	public void saveNotReturn() throws Exception {
		

	}

	@Override
	public void saveEdit() throws Exception {
		

	}

	@Override
	public void excluir() throws Exception {
		

	}

	@Override
	public String ativar() throws Exception {
		
		return null;
	}

	@Override
	public String novo() throws Exception {
		
		return null;
	}

	@Override
	public String editar() throws Exception {
		
		return null;
	}

	@Override
	public void setarVariaveisNulas() throws Exception {
		

	}

	@Override
	public void consultaEntidade() throws Exception {
		

	}

	@Override
	public void statusOperation(EstatusPersistencia a) throws Exception {
		Messagens.responseOperation(a);

	}
	
	protected void sucesso() throws Exception {
		statusOperation(EstatusPersistencia.SUCESSO);
	}
	
	protected void error() throws Exception {
		statusOperation(EstatusPersistencia.ERROR);
	}

	@Override
	public String redirecionarNewEntidade() throws Exception {
		
		return null;
	}

	@Override
	public String redirecionarFindEntidade() throws Exception {
		
		return null;
	}

	@Override
	public void addMsg(String msg) {
		Messagens.msg(msg);

	}

}
