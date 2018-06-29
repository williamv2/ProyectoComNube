package finca;

import com.google.gson.Gson;
import jello.model.EntityDef;
import jello.model.EntityDefFactory;

public class Unidad_jello implements EntityDefFactory {

@Override
public EntityDef getEntityDef() {

StringBuffer json = new StringBuffer();

json.append("{");
json.append("	\"name\" : \"finca.Unidad\",");
json.append("	\"fields\" : [");
json.append("		{");
json.append("			\"name\" : \"NumAnimales\",");
json.append("			\"type\" : \"java.lang.Integer\",");
json.append("			\"isPublic\" : true,");
json.append("			\"isStatic\" : false");
json.append("		},");
json.append("		{");
json.append("			\"name\" : \"codigo\",");
json.append("			\"type\" : \"java.lang.Integer\",");
json.append("			\"isPublic\" : true,");
json.append("			\"isStatic\" : false");
json.append("		},");
json.append("		{");
json.append("			\"name\" : \"descripcion\",");
json.append("			\"type\" : \"java.lang.String\",");
json.append("			\"isPublic\" : true,");
json.append("			\"isStatic\" : false");
json.append("		},");
json.append("		{");
json.append("			\"name\" : \"nombre\",");
json.append("			\"type\" : \"java.lang.String\",");
json.append("			\"isPublic\" : true,");
json.append("			\"isStatic\" : false");
json.append("		},");
json.append("		{");
json.append("			\"name\" : \"Area\",");
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
