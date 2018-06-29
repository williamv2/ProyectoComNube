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
public class Practicante extends JelloEntity {

	private static final long serialVersionUID = -5639911325625532748L;

	@Expose
	@Required
	public Date fechaFinal;

	@Expose
	@Required
	public Date fechaInicio;

	@Expose
	@Required
	public String institucion;

	@Validation(min=1,max=2)
	@Expose
	@Required
	public Integer semestre;

	@Reference(Persona.class)
	@Preview(element="Dni")
	@Expose
	@Required
	public Key Persona;


	@Override
	protected JelloEntity beforeSave() throws IllegalRequestResource {
		// TODO Auto-generated method stub
		return this;
	}



}
