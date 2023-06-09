/**
 * File generated by the ThingML IDE
 * /!\Do not edit this file/!\
 * In case of a bug in the generated code,
 * please submit an issue on our GitHub
 **/

package org.thingml.generated.messages;

import no.sintef.jasm.*;
import no.sintef.jasm.ext.*;

import java.util.*;
import java.nio.*;

public class TemperatureMessageType extends EventType {
public TemperatureMessageType(short code) {super("temperature", code);
}

public TemperatureMessageType() {
super("temperature", (short) 0);
}

public Event instantiate(final int id, final String txt, final double t) { return new TemperatureMessage(this, id, txt, t); }
public Event instantiate(Map<String, Object> params) {return instantiate((Integer) params.get("id"), (String) params.get("txt"), (Double) params.get("t"));
}

public class TemperatureMessage extends Event implements java.io.Serializable {

public final int id;
public final String txt;
public final double t;
public String toString(){
return "temperature (" + "id: " + id + ", " + "txt: " + txt + ", " + "t: " + t + ")";
}

protected TemperatureMessage(EventType type, final int id, final String txt, final double t) {
super(type);
this.id = id;
this.txt = txt;
this.t = t;
}
public Event clone() {
return instantiate(this.id, this.txt, this.t);
}}

}

