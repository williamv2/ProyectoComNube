package finca;

import com.google.gson.Gson;
import jello.model.EntityDef;
import jello.model.EntityDefFactory;

public class Persona_jello implements EntityDefFactory {

@Override
public EntityDef getEntityDef() {

StringBuffer json = new StringBuffer();

json.append("{");
json.append("	\"name\" : \"finca.Persona\",");
json.append("	\"fields\" : [");
json.append("		{");
json.append("			\"name\" : \"Dni\",");
json.append("			\"type\" : \"java.lang.String\",");
json.append("			\"isPublic\" : true,");
json.append("			\"isStatic\" : false");
json.append("		},");
json.append("		{");
json.append("			\"name\" : \"Nombres\",");
json.append("			\"type\" : \"java.lang.String\",");
json.append("			\"isPublic\" : true,");
json.append("			\"isStatic\" : false");
json.append("		},");
json.append("		{");
json.append("			\"name\" : \"Apellidos\",");
json.append("			\"type\" : \"java.lang.String\",");
json.append("			\"isPublic\" : true,");
json.append("			\"isStatic\" : false");
json.append("		},");
json.append("		{");
json.append("			\"name\" : \"Tipo\",");
json.append("			\"type\" : \"java.util.List<finca.Visitante>\",");
json.append("			\"isPublic\" : false,");
json.append("			\"isStatic\" : false");
json.append("		},");
json.append("		{");
json.append("			\"name\" : \"proyecto\",");
json.append("			\"type\" : \"java.util.List<finca.Proyecto>\",");
json.append("			\"isPublic\" : false,");
json.append("			\"isStatic\" : false");
json.append("		}");
json.append("	],");
json.append("	\"actions\" : [");
json.append("	]");
json.append("}");

return (new Gson()).fromJson(json.toString(), EntityDef.class);
}
}
