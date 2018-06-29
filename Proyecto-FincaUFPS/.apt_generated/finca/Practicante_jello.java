package finca;

import com.google.gson.Gson;
import jello.model.EntityDef;
import jello.model.EntityDefFactory;

public class Practicante_jello implements EntityDefFactory {

@Override
public EntityDef getEntityDef() {

StringBuffer json = new StringBuffer();

json.append("{");
json.append("	\"name\" : \"finca.Practicante\",");
json.append("	\"fields\" : [");
json.append("		{");
json.append("			\"name\" : \"fechaFinal\",");
json.append("			\"type\" : \"java.util.Date\",");
json.append("			\"isPublic\" : true,");
json.append("			\"isStatic\" : false");
json.append("		},");
json.append("		{");
json.append("			\"name\" : \"fechaInicio\",");
json.append("			\"type\" : \"java.util.Date\",");
json.append("			\"isPublic\" : true,");
json.append("			\"isStatic\" : false");
json.append("		},");
json.append("		{");
json.append("			\"name\" : \"institucion\",");
json.append("			\"type\" : \"java.lang.String\",");
json.append("			\"isPublic\" : true,");
json.append("			\"isStatic\" : false");
json.append("		},");
json.append("		{");
json.append("			\"name\" : \"semestre\",");
json.append("			\"type\" : \"java.lang.Integer\",");
json.append("			\"isPublic\" : true,");
json.append("			\"isStatic\" : false");
json.append("		},");
json.append("		{");
json.append("			\"name\" : \"Persona\",");
json.append("			\"type\" : \"com.google.appengine.api.datastore.Key\",");
json.append("			\"isPublic\" : true,");
json.append("			\"isStatic\" : false");
json.append("		}");
json.append("	],");
json.append("	\"actions\" : [");
json.append("	]");
json.append("}");

return (new Gson()).fromJson(json.toString(), EntityDef.class);
}
}
