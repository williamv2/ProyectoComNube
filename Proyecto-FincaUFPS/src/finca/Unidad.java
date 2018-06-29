package finca;

import jello.model.JelloEntity;
import jello.annotation.KeyElement;
import jello.rest.IllegalRequestResource;
import jello.annotation.Required;
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
public class Unidad extends JelloEntity {

	private static final long serialVersionUID = -6374685377281773828L;

	@Validation(min=0)
	@Expose
	public Integer NumAnimales;

	@Validation(min=0)
	@Expose
	@KeyElement
	public Integer codigo;

	@Expose
	@Required
	public String descripcion;

	@Expose
	@Required
	public String nombre;

	@Reference(Area.class)
	@Preview(element="descripcion")
	@Expose
	@Required
	public Key Area;


	@Override
	protected JelloEntity beforeSave() throws IllegalRequestResource {
		// TODO Auto-generated method stub
		return this;
	}



}
