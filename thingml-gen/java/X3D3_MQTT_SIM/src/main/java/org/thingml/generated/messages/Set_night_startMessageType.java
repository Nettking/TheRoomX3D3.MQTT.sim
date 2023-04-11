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

public class Set_night_startMessageType extends EventType {
public Set_night_startMessageType(short code) {super("set_night_start", code);
}

public Set_night_startMessageType() {
super("set_night_start", (short) 0);
}

public Event instantiate(final int time) { return new Set_night_startMessage(this, time); }
public Event instantiate(Map<String, Object> params) {return instantiate((Integer) params.get("time"));
}

public class Set_night_startMessage extends Event implements java.io.Serializable {

public final int time;
public String toString(){
return "set_night_start (" + "time: " + time + ")";
}

protected Set_night_startMessage(EventType type, final int time) {
super(type);
this.time = time;
}
public Event clone() {
return instantiate(this.time);
}}

}
