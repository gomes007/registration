package br.com.project.bean.view;

import java.util.Date;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.project.bean.geral.BeanManagedViewAbstract;

@Controller
@Scope(value="session")
@ManagedBean(name="entidadeBeanView")
public class EntidadeBeanView extends BeanManagedViewAbstract {

	private static final long serialVersionUID = 1L;
	
	/**
	 * antes dessa classe é criada a classe ContextBean, depois faz injeção dependencia aqui para chamar no metodo abaixo.
	 */
	@Autowired
	private ContextBean contextBean;
	
	public String getusuarioLogadoSecurity() {
		return contextBean.getAuthentication().getName();
	}
	
	public Date getUltimoAcesso() throws Exception {
		return contextBean.getEntidadeLogada().getEnt_ultimoacesso();
	}

}
