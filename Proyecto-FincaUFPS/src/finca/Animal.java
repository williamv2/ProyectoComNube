package finca;

import jello.model.JelloEntity;
import jello.rest.IllegalRequestResource;
import jello.annotation.Required;
import java.util.Date;
import jello.security.Accessible;
import jello.security.Role;
import jello.ux.Validation;
import jello.annotation.Expose;

import javax.jdo.annotations.PersistenceCapable;
import com.google.appengine.api.datastore.Key;
import jello.annotation.Reference;
import jello.ux.Preview;

@PersistenceCapable
@Accessible( Role.ALL )
public class Animal extends JelloEntity {

	private static final long serialVersionUID = -8617910962503194586L;

	@Expose
	public Integer cantAlimento;

	@Expose
	public String descripcion;

	@Expose
	@Required
	public String especie;

	@Expose
	@Required
	public Date fechaIngreso;

	@Validation(minlength=1,maxlength=1)
	@Expose
	@Required
	public String genero;

	@Expose
	@Required
	public String nombre;

	@Validation(minlength=1,maxlength=1)
	@Expose
	@Required
	public String tamano;

	@Reference(Unidad.class)
	@Preview(element="nombre")
	@Expose
	@Required
	public Key Unidad;


	@Override
	protected JelloEntity beforeSave() throws IllegalRequestResource {
		// TODO Auto-generated method stub
		return this;
	}



}
