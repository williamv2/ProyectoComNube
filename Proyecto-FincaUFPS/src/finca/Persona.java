package finca;

import jello.model.JelloEntity;
import jello.annotation.KeyElement;
import jello.rest.IllegalRequestResource;
import jello.annotation.Required;
import jello.security.Accessible;
import jello.security.Role;
import jello.annotation.Expose;

import javax.jdo.annotations.PersistenceCapable;
import java.util.List;
import javax.jdo.annotations.NotPersistent;
import jello.annotation.Association;


@PersistenceCapable
@Accessible( Role.ALL )
public class Persona extends JelloEntity {

	private static final long serialVersionUID = -4636046973437481565L;

	@Expose
	@KeyElement
	public String Dni;

	@Expose
	@Required
	public String Nombres;
	
	@Expose
	@Required
	public String Apellidos;

	@NotPersistent
	@Association(mappedBy="Persona")
	@Expose
	private List<Visitante> Tipo;

	@NotPersistent
	@Association(mappedBy="persona")
	@Expose
	private List<Proyecto> proyecto;



	
	

	@Override
	protected JelloEntity beforeSave() throws IllegalRequestResource {
		// TODO Auto-generated method stub
		return this;
	}



}
