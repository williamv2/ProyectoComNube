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

@PersistenceCapable
@Accessible( Role.ALL )
public class Area extends JelloEntity {

	private static final long serialVersionUID = -6717465422346437210L;

	@Validation(min=0)
	@Expose
	@KeyElement
	public Integer codigo;

	@Expose
	@Required
	public String descripcion;

	@Override
	protected JelloEntity beforeSave() throws IllegalRequestResource {
		// TODO Auto-generated method stub
		return this;
	}



}
