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

public class LuminanceMessageType extends EventType {
public LuminanceMessageType(short code) {super("luminance", code);
}

public LuminanceMessageType() {
super("luminance", (short) 0);
}

public Event instantiate(final int id, final double lum) { return new LuminanceMessage(this, id, lum); }
public Event instantiate(Map<String, Object> params) {return instantiate((Integer) params.get("id"), (Double) params.get("lum"));
}

public class LuminanceMessage extends Event implements java.io.Serializable {

public final int id;
public final double lum;
public String toString(){
return "luminance (" + "id: " + id + ", " + "lum: " + lum + ")";
}

protected LuminanceMessage(EventType type, final int id, final double lum) {
super(type);
this.id = id;
this.lum = lum;
}
public Event clone() {
return instantiate(this.id, this.lum);
}}

}

