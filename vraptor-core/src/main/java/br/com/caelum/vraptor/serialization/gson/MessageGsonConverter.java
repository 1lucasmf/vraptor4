package br.com.caelum.vraptor.serialization.gson;

import java.lang.reflect.Type;

import br.com.caelum.vraptor.validator.Message;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

/**
 * Serializes {@link Message} object.
 * 
 * @author Otávio Garcia
 * @since 4.0.0
 */
public class MessageGsonConverter implements JsonSerializer<Message> {
	
	@Override
	public JsonElement serialize(Message src, Type typeOfSrc, JsonSerializationContext context) {
		JsonObject json = new JsonObject();
		json.addProperty("category", src.getCategory());
		json.addProperty("message", src.getMessage());
		
		return json;
	}

}
