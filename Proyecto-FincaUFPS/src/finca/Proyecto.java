package finca;

import jello.model.JelloEntity;
import jello.annotation.KeyElement;
import jello.rest.IllegalRequestResource;
import jello.annotation.Required;
import jello.security.Accessible;
import jello.security.Role;
import jello.annotation.Expose;

import javax.jdo.annotations.PersistenceCapable;
import com.google.appengine.api.datastore.Key;
import jello.annotation.Reference;
import jello.ux.Preview;


@PersistenceCapable
@Accessible( Role.ALL )
public class Proyecto extends JelloEntity {

	private static final long serialVersionUID = -7015165799728819606L;

	@Expose
	@Required
	public String descripcion;

	@Expose
	@Required
	public String nombre;

	@Expose
	@KeyElement
	public Integer numero;

	@Reference(Persona.class)
	@Preview(element="Nombres")
	@Expose
	@Required
	public Key persona;

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
