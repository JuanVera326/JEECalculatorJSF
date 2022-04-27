package bean;

import java.util.Map;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import logic.Operations;

@Named
@RequestScoped
public class OperationsBean {
	
	private double numero1;
	private double numero2;
	private String resultado;
	
	Operations operaciones;
	
	public OperationsBean() {
		operaciones = new Operations();
	}
	
	public void paint() {
		System.out.println("Actions");
		FacesContext facesContext = FacesContext.getCurrentInstance();
		Map params = facesContext.getExternalContext().getRequestParameterMap();
		int action = Integer.parseInt((String) params.get("accion"));
		
		switch (action) {
			case 1:setResultado(operaciones.suma(getNumero1(), getNumero2())+ "");break;
			case 2:setResultado(operaciones.resta(getNumero1(), getNumero2()) + "");break;
			case 3:setResultado(operaciones.multp(getNumero1(), getNumero2()) + "");break;
			case 4:double res = (operaciones.divs(getNumero1(), getNumero2()));
			if (res != -1000) {
				setResultado(res + "");
			}else {
				setResultado("Verifique los datos");
			}break;
		}
	}

	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}

	public String getResultado() {
		return resultado;
	}

	public String setResultado(String resultado) {
		return this.resultado = resultado;
	}

	public Operations getOperaciones() {
		return operaciones;
	}

	public void setOperaciones(Operations operaciones) {
		this.operaciones = operaciones;
	}
}
