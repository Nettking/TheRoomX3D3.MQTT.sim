/**
 * File generated by the ThingML IDE
 * /!\Do not edit this file/!\
 * In case of a bug in the generated code,
 * please submit an issue on our GitHub
 **/

package org.thingml.generated;

import no.sintef.jasm.*;
import no.sintef.jasm.ext.*;

import org.thingml.generated.api.*;
import org.thingml.generated.messages.*;

import java.util.*;

/**
 * Definition for type : MQTTDriver
 **/
public class MQTTDriver extends Component implements IMQTTDriver_require_val, IMQTTDriver_MQTT {

private boolean debug = false;
public boolean isDebug() {return debug;}
public void setDebug(boolean debug) {this.debug = debug;}
public String toString() {
String result = "instance " + getName() + "\n";
result += "\tthermometers = " + MQTTDriver_thermometers_var;
result += "\tthermotext = " + MQTTDriver_thermotext_var;
result += "\tthermoval = " + MQTTDriver_thermoval_var;
result += "\tlightsensors = " + MQTTDriver_lightsensors_var;
result += "\tlightval = " + MQTTDriver_lightval_var;
result += "\tmotionsensors = " + MQTTDriver_motionsensors_var;
result += "\tlast_mo = " + MQTTDriver_last_mo_var;
result += "\tlast_light = " + MQTTDriver_last_light_var;
result += "\tlast_thermo = " + MQTTDriver_last_thermo_var;
result += "\tfoundL = " + MQTTDriver_foundL_var;
result += "\ti = " + MQTTDriver_i_var;
result += "\tid_s = " + MQTTDriver_id_s_var;
result += "\tfound = " + MQTTDriver_found_var;
result += "\tonoffswitches = " + MQTTDriver_onoffswitches_var;
result += "\tlast_onoff = " + MQTTDriver_last_onoff_var;
result += "\tdid = " + MQTTDriver_did_var;
result += "";
return result;
}

public synchronized void add_thermometer_via_require_val(int TemperatureMsg_add_thermometer_id_var, String TemperatureMsg_add_thermometer_txt_var){
final Event _msg = add_thermometerType.instantiate(TemperatureMsg_add_thermometer_id_var, TemperatureMsg_add_thermometer_txt_var);
_msg.setPort(require_val_port);
receive(_msg);
}

public synchronized void add_lightsensor_via_require_val(int LuminanceMsg_add_lightsensor_id_var){
final Event _msg = add_lightsensorType.instantiate(LuminanceMsg_add_lightsensor_id_var);
_msg.setPort(require_val_port);
receive(_msg);
}

public synchronized void add_device_via_require_val(int DeviceGeneral_add_device_did_var){
final Event _msg = add_deviceType.instantiate(DeviceGeneral_add_device_did_var);
_msg.setPort(require_val_port);
receive(_msg);
}

public synchronized void SwitchOn_via_require_val(int OnOffMsg_SwitchOn_did_var){
final Event _msg = SwitchOnType.instantiate(OnOffMsg_SwitchOn_did_var);
_msg.setPort(require_val_port);
receive(_msg);
}

public synchronized void SwitchOff_via_require_val(int OnOffMsg_SwitchOff_did_var){
final Event _msg = SwitchOffType.instantiate(OnOffMsg_SwitchOff_did_var);
_msg.setPort(require_val_port);
receive(_msg);
}

public synchronized void temperature_via_MQTT(int TemperatureMsg_temperature_id_var, String TemperatureMsg_temperature_txt_var, double TemperatureMsg_temperature_t_var){
final Event _msg = temperatureType.instantiate(TemperatureMsg_temperature_id_var, TemperatureMsg_temperature_txt_var, TemperatureMsg_temperature_t_var);
_msg.setPort(MQTT_port);
receive(_msg);
}

public synchronized void luminance_via_MQTT(int LuminanceMsg_luminance_id_var, double LuminanceMsg_luminance_lum_var){
final Event _msg = luminanceType.instantiate(LuminanceMsg_luminance_id_var, LuminanceMsg_luminance_lum_var);
_msg.setPort(MQTT_port);
receive(_msg);
}

private void sendTemperature_via_provide_temp(int TemperatureMsg_temperature_id_var, String TemperatureMsg_temperature_txt_var, double TemperatureMsg_temperature_t_var){
provide_temp_port.send(temperatureType.instantiate(TemperatureMsg_temperature_id_var, TemperatureMsg_temperature_txt_var, TemperatureMsg_temperature_t_var));
}

private void sendLuminance_via_provide_lum_motion(int LuminanceMsg_luminance_id_var, double LuminanceMsg_luminance_lum_var){
provide_lum_motion_port.send(luminanceType.instantiate(LuminanceMsg_luminance_id_var, LuminanceMsg_luminance_lum_var));
}

private void sendMotion_via_provide_lum_motion(int MotionMsg_motion_id_var){
provide_lum_motion_port.send(motionType.instantiate(MotionMsg_motion_id_var));
}

private void sendNomotion_via_provide_lum_motion(int MotionMsg_nomotion_id_var){
provide_lum_motion_port.send(nomotionType.instantiate(MotionMsg_nomotion_id_var));
}

private void sendSwitchOn_via_MQTT(int OnOffMsg_SwitchOn_did_var){
MQTT_port.send(SwitchOnType.instantiate(OnOffMsg_SwitchOn_did_var));
}

private void sendSwitchOff_via_MQTT(int OnOffMsg_SwitchOff_did_var){
MQTT_port.send(SwitchOffType.instantiate(OnOffMsg_SwitchOff_did_var));
}

//Attributes
private int MQTTDriver_last_mo_var;
private int[] MQTTDriver_thermometers_var;
private double[] MQTTDriver_lightval_var;
private boolean MQTTDriver_foundL_var;
private int[] MQTTDriver_onoffswitches_var;
private int MQTTDriver_last_light_var;
private boolean MQTTDriver_found_var;
private int MQTTDriver_did_var;
private String[] MQTTDriver_thermotext_var;
private int MQTTDriver_id_s_var;
private int MQTTDriver_last_onoff_var;
private int[] MQTTDriver_lightsensors_var;
private double[] MQTTDriver_thermoval_var;
private int MQTTDriver_i_var;
private int[] MQTTDriver_motionsensors_var;
private int MQTTDriver_last_thermo_var;
//Ports
private Port provide_temp_port;
private Port provide_lum_motion_port;
private Port require_val_port;
private Port MQTT_port;
//Message types
protected final TemperatureMessageType temperatureType = new TemperatureMessageType();
protected final Add_thermometerMessageType add_thermometerType = new Add_thermometerMessageType();
protected final Set_temperatureMessageType set_temperatureType = new Set_temperatureMessageType();
protected final Set_deltaMessageType set_deltaType = new Set_deltaMessageType();
protected final Fetch_tempMessageType fetch_tempType = new Fetch_tempMessageType();
protected final LuminanceMessageType luminanceType = new LuminanceMessageType();
protected final Add_lightsensorMessageType add_lightsensorType = new Add_lightsensorMessageType();
protected final Set_luminanceMessageType set_luminanceType = new Set_luminanceMessageType();
protected final Set_day_startMessageType set_day_startType = new Set_day_startMessageType();
protected final Set_night_startMessageType set_night_startType = new Set_night_startMessageType();
protected final Add_deviceMessageType add_deviceType = new Add_deviceMessageType();
protected final SwitchOnMessageType SwitchOnType = new SwitchOnMessageType();
protected final SwitchOffMessageType SwitchOffType = new SwitchOffMessageType();
protected final PromptMessageType promptType = new PromptMessageType();
protected final SensorinfoMessageType sensorinfoType = new SensorinfoMessageType();
protected final DeviceinfoMessageType deviceinfoType = new DeviceinfoMessageType();
protected final MotionMessageType motionType = new MotionMessageType();
protected final NomotionMessageType nomotionType = new NomotionMessageType();
protected final Add_motionsensorMessageType add_motionsensorType = new Add_motionsensorMessageType();
//Empty Constructor
public MQTTDriver() {
super();
}

//Getters and Setters for non readonly/final attributes
public int getMQTTDriver_last_mo_var() {
return MQTTDriver_last_mo_var;
}

public void setMQTTDriver_last_mo_var(int MQTTDriver_last_mo_var) {
this.MQTTDriver_last_mo_var = MQTTDriver_last_mo_var;
}

public MQTTDriver initMQTTDriver_last_mo_var(int MQTTDriver_last_mo_var) {
this.MQTTDriver_last_mo_var = MQTTDriver_last_mo_var;
return this;
}

public int[] getMQTTDriver_thermometers_var() {
return MQTTDriver_thermometers_var;
}

public void setMQTTDriver_thermometers_var(int[] MQTTDriver_thermometers_var) {
this.MQTTDriver_thermometers_var = MQTTDriver_thermometers_var;
}

public MQTTDriver initMQTTDriver_thermometers_var(int[] MQTTDriver_thermometers_var) {
this.MQTTDriver_thermometers_var = MQTTDriver_thermometers_var;
return this;
}

public double[] getMQTTDriver_lightval_var() {
return MQTTDriver_lightval_var;
}

public void setMQTTDriver_lightval_var(double[] MQTTDriver_lightval_var) {
this.MQTTDriver_lightval_var = MQTTDriver_lightval_var;
}

public MQTTDriver initMQTTDriver_lightval_var(double[] MQTTDriver_lightval_var) {
this.MQTTDriver_lightval_var = MQTTDriver_lightval_var;
return this;
}

public boolean getMQTTDriver_foundL_var() {
return MQTTDriver_foundL_var;
}

public void setMQTTDriver_foundL_var(boolean MQTTDriver_foundL_var) {
this.MQTTDriver_foundL_var = MQTTDriver_foundL_var;
}

public MQTTDriver initMQTTDriver_foundL_var(boolean MQTTDriver_foundL_var) {
this.MQTTDriver_foundL_var = MQTTDriver_foundL_var;
return this;
}

public int[] getMQTTDriver_onoffswitches_var() {
return MQTTDriver_onoffswitches_var;
}

public void setMQTTDriver_onoffswitches_var(int[] MQTTDriver_onoffswitches_var) {
this.MQTTDriver_onoffswitches_var = MQTTDriver_onoffswitches_var;
}

public MQTTDriver initMQTTDriver_onoffswitches_var(int[] MQTTDriver_onoffswitches_var) {
this.MQTTDriver_onoffswitches_var = MQTTDriver_onoffswitches_var;
return this;
}

public int getMQTTDriver_last_light_var() {
return MQTTDriver_last_light_var;
}

public void setMQTTDriver_last_light_var(int MQTTDriver_last_light_var) {
this.MQTTDriver_last_light_var = MQTTDriver_last_light_var;
}

public MQTTDriver initMQTTDriver_last_light_var(int MQTTDriver_last_light_var) {
this.MQTTDriver_last_light_var = MQTTDriver_last_light_var;
return this;
}

public boolean getMQTTDriver_found_var() {
return MQTTDriver_found_var;
}

public void setMQTTDriver_found_var(boolean MQTTDriver_found_var) {
this.MQTTDriver_found_var = MQTTDriver_found_var;
}

public MQTTDriver initMQTTDriver_found_var(boolean MQTTDriver_found_var) {
this.MQTTDriver_found_var = MQTTDriver_found_var;
return this;
}

public int getMQTTDriver_did_var() {
return MQTTDriver_did_var;
}

public void setMQTTDriver_did_var(int MQTTDriver_did_var) {
this.MQTTDriver_did_var = MQTTDriver_did_var;
}

public MQTTDriver initMQTTDriver_did_var(int MQTTDriver_did_var) {
this.MQTTDriver_did_var = MQTTDriver_did_var;
return this;
}

public String[] getMQTTDriver_thermotext_var() {
return MQTTDriver_thermotext_var;
}

public void setMQTTDriver_thermotext_var(String[] MQTTDriver_thermotext_var) {
this.MQTTDriver_thermotext_var = MQTTDriver_thermotext_var;
}

public MQTTDriver initMQTTDriver_thermotext_var(String[] MQTTDriver_thermotext_var) {
this.MQTTDriver_thermotext_var = MQTTDriver_thermotext_var;
return this;
}

public int getMQTTDriver_id_s_var() {
return MQTTDriver_id_s_var;
}

public void setMQTTDriver_id_s_var(int MQTTDriver_id_s_var) {
this.MQTTDriver_id_s_var = MQTTDriver_id_s_var;
}

public MQTTDriver initMQTTDriver_id_s_var(int MQTTDriver_id_s_var) {
this.MQTTDriver_id_s_var = MQTTDriver_id_s_var;
return this;
}

public int getMQTTDriver_last_onoff_var() {
return MQTTDriver_last_onoff_var;
}

public void setMQTTDriver_last_onoff_var(int MQTTDriver_last_onoff_var) {
this.MQTTDriver_last_onoff_var = MQTTDriver_last_onoff_var;
}

public MQTTDriver initMQTTDriver_last_onoff_var(int MQTTDriver_last_onoff_var) {
this.MQTTDriver_last_onoff_var = MQTTDriver_last_onoff_var;
return this;
}

public int[] getMQTTDriver_lightsensors_var() {
return MQTTDriver_lightsensors_var;
}

public void setMQTTDriver_lightsensors_var(int[] MQTTDriver_lightsensors_var) {
this.MQTTDriver_lightsensors_var = MQTTDriver_lightsensors_var;
}

public MQTTDriver initMQTTDriver_lightsensors_var(int[] MQTTDriver_lightsensors_var) {
this.MQTTDriver_lightsensors_var = MQTTDriver_lightsensors_var;
return this;
}

public double[] getMQTTDriver_thermoval_var() {
return MQTTDriver_thermoval_var;
}

public void setMQTTDriver_thermoval_var(double[] MQTTDriver_thermoval_var) {
this.MQTTDriver_thermoval_var = MQTTDriver_thermoval_var;
}

public MQTTDriver initMQTTDriver_thermoval_var(double[] MQTTDriver_thermoval_var) {
this.MQTTDriver_thermoval_var = MQTTDriver_thermoval_var;
return this;
}

public int getMQTTDriver_i_var() {
return MQTTDriver_i_var;
}

public void setMQTTDriver_i_var(int MQTTDriver_i_var) {
this.MQTTDriver_i_var = MQTTDriver_i_var;
}

public MQTTDriver initMQTTDriver_i_var(int MQTTDriver_i_var) {
this.MQTTDriver_i_var = MQTTDriver_i_var;
return this;
}

public int[] getMQTTDriver_motionsensors_var() {
return MQTTDriver_motionsensors_var;
}

public void setMQTTDriver_motionsensors_var(int[] MQTTDriver_motionsensors_var) {
this.MQTTDriver_motionsensors_var = MQTTDriver_motionsensors_var;
}

public MQTTDriver initMQTTDriver_motionsensors_var(int[] MQTTDriver_motionsensors_var) {
this.MQTTDriver_motionsensors_var = MQTTDriver_motionsensors_var;
return this;
}

public int getMQTTDriver_last_thermo_var() {
return MQTTDriver_last_thermo_var;
}

public void setMQTTDriver_last_thermo_var(int MQTTDriver_last_thermo_var) {
this.MQTTDriver_last_thermo_var = MQTTDriver_last_thermo_var;
}

public MQTTDriver initMQTTDriver_last_thermo_var(int MQTTDriver_last_thermo_var) {
this.MQTTDriver_last_thermo_var = MQTTDriver_last_thermo_var;
return this;
}

//Getters for Ports
public Port getProvide_temp_port() {
return provide_temp_port;
}
public Port getProvide_lum_motion_port() {
return provide_lum_motion_port;
}
public Port getRequire_val_port() {
return require_val_port;
}
public Port getMQTT_port() {
return MQTT_port;
}
private CompositeState buildMQTTDriver_behaviorMQTTDriver(){
final AtomicState state_MQTTDriver_behaviorMQTTDriver_Idle = new AtomicState("Idle");
Transition h830178137 = new Transition();
h830178137.from(state_MQTTDriver_behaviorMQTTDriver_Idle).to(state_MQTTDriver_behaviorMQTTDriver_Idle);
h830178137.event(temperatureType);
h830178137.port(MQTT_port);
h830178137.action((Event e)->{
final TemperatureMessageType.TemperatureMessage temperature = (TemperatureMessageType.TemperatureMessage) e;
MQTTDriver_id_s_var = (int) (temperature.id);
MQTTDriver_i_var = (int) (0);
MQTTDriver_found_var = (boolean) (false);
while(getMQTTDriver_i_var() < getMQTTDriver_last_thermo_var() && ( !(getMQTTDriver_found_var()))) {
if(getMQTTDriver_id_s_var() == MQTTDriver_thermometers_var[(int)(getMQTTDriver_i_var())]) {
MQTTDriver_found_var = (boolean) (true);

}
MQTTDriver_i_var = (int) (getMQTTDriver_i_var() + 1);

}
if(getMQTTDriver_found_var()) {
MQTTDriver_thermoval_var[(int)(getMQTTDriver_i_var() - 1)] = (double) (temperature.t);
sendTemperature_via_provide_temp((int) (getMQTTDriver_id_s_var()), (String) (MQTTDriver_thermotext_var[(int)(getMQTTDriver_i_var())]), (double) (temperature.t));

}
});

Transition h356307161 = new Transition();
h356307161.from(state_MQTTDriver_behaviorMQTTDriver_Idle).to(state_MQTTDriver_behaviorMQTTDriver_Idle);
h356307161.event(add_thermometerType);
h356307161.port(require_val_port);
h356307161.action((Event e)->{
final Add_thermometerMessageType.Add_thermometerMessage add_thermometer = (Add_thermometerMessageType.Add_thermometerMessage) e;
MQTTDriver_id_s_var = (int) (add_thermometer.id);
MQTTDriver_thermometers_var[(int)(getMQTTDriver_last_thermo_var())] = (int) (getMQTTDriver_id_s_var());
MQTTDriver_thermotext_var[(int)(getMQTTDriver_last_thermo_var())] = (String) (add_thermometer.txt);
MQTTDriver_thermoval_var[(int)(getMQTTDriver_last_thermo_var())] = (double) (20);
MQTTDriver_last_thermo_var = (int) (getMQTTDriver_last_thermo_var() + 1);
});

Transition h66046979 = new Transition();
h66046979.from(state_MQTTDriver_behaviorMQTTDriver_Idle).to(state_MQTTDriver_behaviorMQTTDriver_Idle);
h66046979.event(add_lightsensorType);
h66046979.port(require_val_port);
h66046979.action((Event e)->{
final Add_lightsensorMessageType.Add_lightsensorMessage add_lightsensor = (Add_lightsensorMessageType.Add_lightsensorMessage) e;
MQTTDriver_id_s_var = (int) (add_lightsensor.id);
MQTTDriver_lightsensors_var[(int)(getMQTTDriver_last_light_var())] = (int) (getMQTTDriver_id_s_var());
MQTTDriver_lightval_var[(int)(getMQTTDriver_last_light_var())] = (double) (50);
MQTTDriver_last_light_var = (int) (getMQTTDriver_last_light_var() + 1);
});

Transition h1745750930 = new Transition();
h1745750930.from(state_MQTTDriver_behaviorMQTTDriver_Idle).to(state_MQTTDriver_behaviorMQTTDriver_Idle);
h1745750930.event(luminanceType);
h1745750930.port(MQTT_port);
h1745750930.action((Event e)->{
final LuminanceMessageType.LuminanceMessage luminance = (LuminanceMessageType.LuminanceMessage) e;
MQTTDriver_id_s_var = (int) (luminance.id);
MQTTDriver_i_var = (int) (0);
MQTTDriver_foundL_var = (boolean) (false);
while(getMQTTDriver_i_var() < getMQTTDriver_last_light_var() && ( !(getMQTTDriver_foundL_var()))) {
if(getMQTTDriver_id_s_var() == MQTTDriver_lightsensors_var[(int)(getMQTTDriver_i_var())]) {
MQTTDriver_foundL_var = (boolean) (true);

}
MQTTDriver_i_var = (int) (getMQTTDriver_i_var() + 1);

}
if(getMQTTDriver_foundL_var()) {
MQTTDriver_lightval_var[(int)(getMQTTDriver_i_var() - 1)] = (double) (luminance.lum);
sendLuminance_via_provide_lum_motion((int) (getMQTTDriver_id_s_var()), (double) (luminance.lum));

}
});

Transition h789524196 = new Transition();
h789524196.from(state_MQTTDriver_behaviorMQTTDriver_Idle).to(state_MQTTDriver_behaviorMQTTDriver_Idle);
h789524196.event(add_deviceType);
h789524196.port(require_val_port);
h789524196.action((Event e)->{
final Add_deviceMessageType.Add_deviceMessage add_device = (Add_deviceMessageType.Add_deviceMessage) e;
MQTTDriver_did_var = (int) (add_device.did);
MQTTDriver_onoffswitches_var[(int)(getMQTTDriver_last_onoff_var())] = (int) (getMQTTDriver_did_var());
MQTTDriver_last_onoff_var = (int) (getMQTTDriver_last_onoff_var() + 1);
});

Transition h1271607192 = new Transition();
h1271607192.from(state_MQTTDriver_behaviorMQTTDriver_Idle).to(state_MQTTDriver_behaviorMQTTDriver_Idle);
h1271607192.event(SwitchOnType);
h1271607192.port(require_val_port);
h1271607192.action((Event e)->{
final SwitchOnMessageType.SwitchOnMessage SwitchOn = (SwitchOnMessageType.SwitchOnMessage) e;
MQTTDriver_did_var = (int) (SwitchOn.did);
MQTTDriver_i_var = (int) (0);
MQTTDriver_found_var = (boolean) (false);
while(getMQTTDriver_i_var() < getMQTTDriver_last_onoff_var() && ( !(getMQTTDriver_found_var()))) {
if(getMQTTDriver_did_var() == MQTTDriver_onoffswitches_var[(int)(getMQTTDriver_i_var())]) {
MQTTDriver_found_var = (boolean) (true);

}
MQTTDriver_i_var = (int) (getMQTTDriver_i_var() + 1);

}
if(getMQTTDriver_found_var()) {
sendSwitchOn_via_MQTT((int) (getMQTTDriver_did_var()));

}
});

Transition h1200100008 = new Transition();
h1200100008.from(state_MQTTDriver_behaviorMQTTDriver_Idle).to(state_MQTTDriver_behaviorMQTTDriver_Idle);
h1200100008.event(SwitchOffType);
h1200100008.port(require_val_port);
h1200100008.action((Event e)->{
final SwitchOffMessageType.SwitchOffMessage SwitchOff = (SwitchOffMessageType.SwitchOffMessage) e;
MQTTDriver_did_var = (int) (SwitchOff.did);
MQTTDriver_i_var = (int) (0);
MQTTDriver_found_var = (boolean) (false);
while(getMQTTDriver_i_var() < getMQTTDriver_last_onoff_var() && ( !(getMQTTDriver_found_var()))) {
if(getMQTTDriver_did_var() == MQTTDriver_onoffswitches_var[(int)(getMQTTDriver_i_var())]) {
MQTTDriver_found_var = (boolean) (true);

}
MQTTDriver_i_var = (int) (getMQTTDriver_i_var() + 1);

}
if(getMQTTDriver_found_var()) {
sendSwitchOff_via_MQTT((int) (getMQTTDriver_did_var()));

}
});

final CompositeState state_MQTTDriver_behaviorMQTTDriver = new CompositeState("behaviorMQTTDriver");
state_MQTTDriver_behaviorMQTTDriver.onEntry(()->{
});
state_MQTTDriver_behaviorMQTTDriver.add(state_MQTTDriver_behaviorMQTTDriver_Idle);
state_MQTTDriver_behaviorMQTTDriver.initial(state_MQTTDriver_behaviorMQTTDriver_Idle);
return state_MQTTDriver_behaviorMQTTDriver;
}

public Component buildBehavior(String session, Component root) {
if (root == null) {
//Init ports
provide_temp_port = new Port("provide_temp", this);
provide_lum_motion_port = new Port("provide_lum_motion", this);
require_val_port = new Port("require_val", this);
MQTT_port = new Port("MQTT", this);
} else {
provide_temp_port = ((MQTTDriver)root).provide_temp_port;
provide_lum_motion_port = ((MQTTDriver)root).provide_lum_motion_port;
require_val_port = ((MQTTDriver)root).require_val_port;
MQTT_port = ((MQTTDriver)root).MQTT_port;
}
if (session == null){
//Init state machine
behavior = buildMQTTDriver_behaviorMQTTDriver();
}
return this;
}

}
