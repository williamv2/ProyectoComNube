package finca;

import jello.model.JelloEntity;
import jello.rest.IllegalRequestResource;
import jello.annotation.Required;
import java.util.Date;
import jello.security.Accessible;
import jello.security.Role;
import jello.annotation.Expose;

import javax.jdo.annotations.PersistenceCapable;
import com.google.appengine.api.datastore.Key;
import jello.annotation.Reference;
import jello.ux.Preview;

@PersistenceCapable
@Accessible( Role.ALL )
public class Visitante extends JelloEntity {

	private static final long serialVersionUID = -9019111573889051804L;

	@Expose
	@Required
	public Date FechaIngreso;

	@Expose
	@Required
	public String Institucion;

	@Expose
	@Required
	public String Motivo;

	@Expose
	public String Placa;

	@Reference(Persona.class)
	@Preview(element="Dni")
	@Expose
	public Key Persona;


	@Override
	protected JelloEntity beforeSave() throws IllegalRequestResource {
		// TODO Auto-generated method stub
		return this;
	}



}
