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
 * Definition for type : PIM
 **/
public class PIM extends Component implements IPIM_human_input, IPIM_get_sensor, IPIM_guard_temperature, IPIM_guard_human {

private boolean debug = false;
public boolean isDebug() {return debug;}
public void setDebug(boolean debug) {this.debug = debug;}
public String toString() {
String result = "instance " + getName() + "\n";
result += "\ttmrature = " + PIM_tmrature_var;
result += "\tthermo_id = " + PIM_thermo_id_var;
result += "\tswitch_id = " + PIM_switch_id_var;
result += "\tdelta = " + PIM_delta_var;
result += "\tcurrent_temp = " + PIM_current_temp_var;
result += "\tcurrent_average_diff = " + PIM_current_average_diff_var;
result += "\twarming_time = " + PIM_warming_time_var;
result += "\tcooling_time = " + PIM_cooling_time_var;
result += "\tbuffer_size = " + PIM_buffer_size_var;
result += "\ttemp_buffer = " + PIM_temp_buffer_var;
result += "\tbuffer_rear = " + PIM_buffer_rear_var;
result += "\tbuffer_front = " + PIM_buffer_front_var;
result += "";
return result;
}

public synchronized void temperature_via_get_sensor(int TemperatureMsg_temperature_id_var, String TemperatureMsg_temperature_txt_var, double TemperatureMsg_temperature_t_var){
final Event _msg = temperatureType.instantiate(TemperatureMsg_temperature_id_var, TemperatureMsg_temperature_txt_var, TemperatureMsg_temperature_t_var);
_msg.setPort(get_sensor_port);
receive(_msg);
}

public synchronized void SwitchOn_via_human_input(int OnOffMsg_SwitchOn_did_var){
final Event _msg = SwitchOnType.instantiate(OnOffMsg_SwitchOn_did_var);
_msg.setPort(human_input_port);
receive(_msg);
}

public synchronized void SwitchOff_via_human_input(int OnOffMsg_SwitchOff_did_var){
final Event _msg = SwitchOffType.instantiate(OnOffMsg_SwitchOff_did_var);
_msg.setPort(human_input_port);
receive(_msg);
}

public synchronized void set_temperature_via_human_input(double TemperatureMsg_set_temperature_t_var){
final Event _msg = set_temperatureType.instantiate(TemperatureMsg_set_temperature_t_var);
_msg.setPort(human_input_port);
receive(_msg);
}

public synchronized void set_delta_via_human_input(double TemperatureMsg_set_delta_dlta_var){
final Event _msg = set_deltaType.instantiate(TemperatureMsg_set_delta_dlta_var);
_msg.setPort(human_input_port);
receive(_msg);
}

public synchronized void fetch_temp_via_human_input(){
final Event _msg = fetch_tempType.instantiate();
_msg.setPort(human_input_port);
receive(_msg);
}

public synchronized void timer_timeout_via_guard_temperature(){
final Event _msg = timer_timeoutType.instantiate();
_msg.setPort(guard_temperature_port);
receive(_msg);
}

public synchronized void timer_timeout_via_guard_human(){
final Event _msg = timer_timeoutType.instantiate();
_msg.setPort(guard_human_port);
receive(_msg);
}

private void sendAdd_thermometer_via_request_sensor(int TemperatureMsg_add_thermometer_id_var, String TemperatureMsg_add_thermometer_txt_var){
request_sensor_port.send(add_thermometerType.instantiate(TemperatureMsg_add_thermometer_id_var, TemperatureMsg_add_thermometer_txt_var));
}

private void sendAdd_device_via_request_actuator(int DeviceGeneral_add_device_did_var){
request_actuator_port.send(add_deviceType.instantiate(DeviceGeneral_add_device_did_var));
}

private void sendSwitchOn_via_request_actuator(int OnOffMsg_SwitchOn_did_var){
request_actuator_port.send(SwitchOnType.instantiate(OnOffMsg_SwitchOn_did_var));
}

private void sendSwitchOff_via_request_actuator(int OnOffMsg_SwitchOff_did_var){
request_actuator_port.send(SwitchOffType.instantiate(OnOffMsg_SwitchOff_did_var));
}

private void sendTemperature_via_human_output(int TemperatureMsg_temperature_id_var, String TemperatureMsg_temperature_txt_var, double TemperatureMsg_temperature_t_var){
human_output_port.send(temperatureType.instantiate(TemperatureMsg_temperature_id_var, TemperatureMsg_temperature_txt_var, TemperatureMsg_temperature_t_var));
}

private void sendPrompt_via_human_output(String GeneralMsg_prompt_txt_var){
human_output_port.send(promptType.instantiate(GeneralMsg_prompt_txt_var));
}

private void sendTimer_start_via_guard_temperature(int TimerMsgs_timer_start_delay_var){
guard_temperature_port.send(timer_startType.instantiate(TimerMsgs_timer_start_delay_var));
}

private void sendTimer_cancel_via_guard_temperature(){
guard_temperature_port.send(timer_cancelType.instantiate());
}

private void sendTimer_start_via_guard_human(int TimerMsgs_timer_start_delay_var){
guard_human_port.send(timer_startType.instantiate(TimerMsgs_timer_start_delay_var));
}

private void sendTimer_cancel_via_guard_human(){
guard_human_port.send(timer_cancelType.instantiate());
}

//Attributes
private double PIM_tmrature_var;
private int PIM_thermo_id_var;
private double PIM_delta_var;
private double PIM_cooling_time_var;
private double[] PIM_temp_buffer_var;
private int PIM_buffer_size_var;
private int PIM_switch_id_var;
private double PIM_warming_time_var;
private double PIM_current_average_diff_var;
private int PIM_buffer_front_var;
private int PIM_buffer_rear_var;
private double PIM_current_temp_var;
//Ports
private Port get_sensor_port;
private Port request_sensor_port;
private Port request_actuator_port;
private Port human_input_port;
private Port human_output_port;
private Port guard_temperature_port;
private Port guard_human_port;
//Message types
protected final PromptMessageType promptType = new PromptMessageType();
protected final SensorinfoMessageType sensorinfoType = new SensorinfoMessageType();
protected final DeviceinfoMessageType deviceinfoType = new DeviceinfoMessageType();
protected final TemperatureMessageType temperatureType = new TemperatureMessageType();
protected final Add_thermometerMessageType add_thermometerType = new Add_thermometerMessageType();
protected final Set_temperatureMessageType set_temperatureType = new Set_temperatureMessageType();
protected final Set_deltaMessageType set_deltaType = new Set_deltaMessageType();
protected final Fetch_tempMessageType fetch_tempType = new Fetch_tempMessageType();
protected final Add_deviceMessageType add_deviceType = new Add_deviceMessageType();
protected final SwitchOnMessageType SwitchOnType = new SwitchOnMessageType();
protected final SwitchOffMessageType SwitchOffType = new SwitchOffMessageType();
protected final Timer_startMessageType timer_startType = new Timer_startMessageType();
protected final Timer_cancelMessageType timer_cancelType = new Timer_cancelMessageType();
protected final Timer_timeoutMessageType timer_timeoutType = new Timer_timeoutMessageType();
protected final LuminanceMessageType luminanceType = new LuminanceMessageType();
protected final Add_lightsensorMessageType add_lightsensorType = new Add_lightsensorMessageType();
protected final Set_luminanceMessageType set_luminanceType = new Set_luminanceMessageType();
protected final Set_day_startMessageType set_day_startType = new Set_day_startMessageType();
protected final Set_night_startMessageType set_night_startType = new Set_night_startMessageType();
//Empty Constructor
public PIM() {
super();
}

//Getters and Setters for non readonly/final attributes
public double getPIM_tmrature_var() {
return PIM_tmrature_var;
}

public void setPIM_tmrature_var(double PIM_tmrature_var) {
this.PIM_tmrature_var = PIM_tmrature_var;
}

public PIM initPIM_tmrature_var(double PIM_tmrature_var) {
this.PIM_tmrature_var = PIM_tmrature_var;
return this;
}

public int getPIM_thermo_id_var() {
return PIM_thermo_id_var;
}

public void setPIM_thermo_id_var(int PIM_thermo_id_var) {
this.PIM_thermo_id_var = PIM_thermo_id_var;
}

public PIM initPIM_thermo_id_var(int PIM_thermo_id_var) {
this.PIM_thermo_id_var = PIM_thermo_id_var;
return this;
}

public double getPIM_delta_var() {
return PIM_delta_var;
}

public void setPIM_delta_var(double PIM_delta_var) {
this.PIM_delta_var = PIM_delta_var;
}

public PIM initPIM_delta_var(double PIM_delta_var) {
this.PIM_delta_var = PIM_delta_var;
return this;
}

public double getPIM_cooling_time_var() {
return PIM_cooling_time_var;
}

public void setPIM_cooling_time_var(double PIM_cooling_time_var) {
this.PIM_cooling_time_var = PIM_cooling_time_var;
}

public PIM initPIM_cooling_time_var(double PIM_cooling_time_var) {
this.PIM_cooling_time_var = PIM_cooling_time_var;
return this;
}

public double[] getPIM_temp_buffer_var() {
return PIM_temp_buffer_var;
}

public void setPIM_temp_buffer_var(double[] PIM_temp_buffer_var) {
this.PIM_temp_buffer_var = PIM_temp_buffer_var;
}

public PIM initPIM_temp_buffer_var(double[] PIM_temp_buffer_var) {
this.PIM_temp_buffer_var = PIM_temp_buffer_var;
return this;
}

public int getPIM_buffer_size_var() {
return PIM_buffer_size_var;
}

public void setPIM_buffer_size_var(int PIM_buffer_size_var) {
this.PIM_buffer_size_var = PIM_buffer_size_var;
}

public PIM initPIM_buffer_size_var(int PIM_buffer_size_var) {
this.PIM_buffer_size_var = PIM_buffer_size_var;
return this;
}

public int getPIM_switch_id_var() {
return PIM_switch_id_var;
}

public void setPIM_switch_id_var(int PIM_switch_id_var) {
this.PIM_switch_id_var = PIM_switch_id_var;
}

public PIM initPIM_switch_id_var(int PIM_switch_id_var) {
this.PIM_switch_id_var = PIM_switch_id_var;
return this;
}

public double getPIM_warming_time_var() {
return PIM_warming_time_var;
}

public void setPIM_warming_time_var(double PIM_warming_time_var) {
this.PIM_warming_time_var = PIM_warming_time_var;
}

public PIM initPIM_warming_time_var(double PIM_warming_time_var) {
this.PIM_warming_time_var = PIM_warming_time_var;
return this;
}

public double getPIM_current_average_diff_var() {
return PIM_current_average_diff_var;
}

public void setPIM_current_average_diff_var(double PIM_current_average_diff_var) {
this.PIM_current_average_diff_var = PIM_current_average_diff_var;
}

public PIM initPIM_current_average_diff_var(double PIM_current_average_diff_var) {
this.PIM_current_average_diff_var = PIM_current_average_diff_var;
return this;
}

public int getPIM_buffer_front_var() {
return PIM_buffer_front_var;
}

public void setPIM_buffer_front_var(int PIM_buffer_front_var) {
this.PIM_buffer_front_var = PIM_buffer_front_var;
}

public PIM initPIM_buffer_front_var(int PIM_buffer_front_var) {
this.PIM_buffer_front_var = PIM_buffer_front_var;
return this;
}

public int getPIM_buffer_rear_var() {
return PIM_buffer_rear_var;
}

public void setPIM_buffer_rear_var(int PIM_buffer_rear_var) {
this.PIM_buffer_rear_var = PIM_buffer_rear_var;
}

public PIM initPIM_buffer_rear_var(int PIM_buffer_rear_var) {
this.PIM_buffer_rear_var = PIM_buffer_rear_var;
return this;
}

public double getPIM_current_temp_var() {
return PIM_current_temp_var;
}

public void setPIM_current_temp_var(double PIM_current_temp_var) {
this.PIM_current_temp_var = PIM_current_temp_var;
}

public PIM initPIM_current_temp_var(double PIM_current_temp_var) {
this.PIM_current_temp_var = PIM_current_temp_var;
return this;
}

//Getters for Ports
public Port getGet_sensor_port() {
return get_sensor_port;
}
public Port getRequest_sensor_port() {
return request_sensor_port;
}
public Port getRequest_actuator_port() {
return request_actuator_port;
}
public Port getHuman_input_port() {
return human_input_port;
}
public Port getHuman_output_port() {
return human_output_port;
}
public Port getGuard_temperature_port() {
return guard_temperature_port;
}
public Port getGuard_human_port() {
return guard_human_port;
}
private CompositeState buildPIM_PIM_behavior(){
final CompositeState state_PIM_PIM_behavior_Build = buildPIM_PIM_behavior_Build();
final CompositeState state_PIM_PIM_behavior_Running = buildPIM_PIM_behavior_Running();
Handler h2013887989 = new Handler();
h2013887989.from(state_PIM_PIM_behavior_Build);
h2013887989.event(set_deltaType);
h2013887989.port(human_input_port);
h2013887989.action((Event e)->{
final Set_deltaMessageType.Set_deltaMessage set_delta = (Set_deltaMessageType.Set_deltaMessage) e;
PIM_delta_var = (double) (set_delta.dlta);
});

Handler h384570424 = new Handler();
h384570424.from(state_PIM_PIM_behavior_Build);
h384570424.event(fetch_tempType);
h384570424.port(human_input_port);
h384570424.action((Event e)->{
sendTemperature_via_human_output((int) (getPIM_thermo_id_var()), (String) ("temperature "), (double) (getPIM_current_temp_var()));
});

Handler h1095329303 = new Handler();
h1095329303.from(state_PIM_PIM_behavior_Build);
h1095329303.event(temperatureType);
h1095329303.port(get_sensor_port);
h1095329303.action((Event e)->{
final TemperatureMessageType.TemperatureMessage temperature = (TemperatureMessageType.TemperatureMessage) e;
PIM_current_temp_var = (double) (temperature.t);
PIM_temp_buffer_var[(int)(getPIM_buffer_rear_var())] = (double) (temperature.t);
PIM_buffer_rear_var = (int) ((getPIM_buffer_rear_var() + 1) % getPIM_buffer_size_var());
if(getPIM_buffer_rear_var() == getPIM_buffer_front_var()) {
PIM_buffer_front_var = (int) ((getPIM_buffer_front_var() + 1) % getPIM_buffer_size_var());

}
});

Transition h854279895 = new Transition();
h854279895.from(state_PIM_PIM_behavior_Build).to(state_PIM_PIM_behavior_Running);
h854279895.event(set_temperatureType);
h854279895.port(human_input_port);
h854279895.action((Event e)->{
final Set_temperatureMessageType.Set_temperatureMessage set_temperature = (Set_temperatureMessageType.Set_temperatureMessage) e;
PIM_tmrature_var = (double) (set_temperature.t);
sendPrompt_via_human_output((String) ("Now entering thermostat. Please give temperature observations"));
});

Transition h170049100 = new Transition();
h170049100.from(state_PIM_PIM_behavior_Build).to(state_PIM_PIM_behavior_Build);
h170049100.event(timer_timeoutType);
h170049100.port(guard_human_port);
h170049100.action((Event e)->{
sendPrompt_via_human_output((String) ("Please continue doing the build of the temperature control"));
});

Handler h446604505 = new Handler();
h446604505.from(state_PIM_PIM_behavior_Running);
h446604505.event(fetch_tempType);
h446604505.port(human_input_port);
h446604505.action((Event e)->{
sendTemperature_via_human_output((int) (getPIM_thermo_id_var()), (String) ("temperature "), (double) (getPIM_current_temp_var()));
});

Transition h1743279449 = new Transition();
h1743279449.from(state_PIM_PIM_behavior_Running).to(state_PIM_PIM_behavior_Running);
h1743279449.event(set_deltaType);
h1743279449.port(human_input_port);
h1743279449.action((Event e)->{
final Set_deltaMessageType.Set_deltaMessage set_delta = (Set_deltaMessageType.Set_deltaMessage) e;
PIM_delta_var = (double) (set_delta.dlta);
});

Transition h1823517470 = new Transition();
h1823517470.from(state_PIM_PIM_behavior_Running).to(state_PIM_PIM_behavior_Running);
h1823517470.event(SwitchOnType);
h1823517470.port(human_input_port);
h1823517470.action((Event e)->{
final SwitchOnMessageType.SwitchOnMessage SwitchOn = (SwitchOnMessageType.SwitchOnMessage) e;
sendPrompt_via_human_output((String) ("INTERNAL ERROR: Impossible SwitchOn at PIM.Running"));
});

Transition h214429361 = new Transition();
h214429361.from(state_PIM_PIM_behavior_Running).to(state_PIM_PIM_behavior_Running);
h214429361.event(SwitchOffType);
h214429361.port(human_input_port);
h214429361.action((Event e)->{
final SwitchOffMessageType.SwitchOffMessage SwitchOff = (SwitchOffMessageType.SwitchOffMessage) e;
sendPrompt_via_human_output((String) ("INTERNAL ERROR: Impossible SwitchOff at PIM.Running"));
});

Transition h924381802 = new Transition();
h924381802.from(state_PIM_PIM_behavior_Running).to(state_PIM_PIM_behavior_Running);
h924381802.event(set_temperatureType);
h924381802.port(human_input_port);
h924381802.action((Event e)->{
final Set_temperatureMessageType.Set_temperatureMessage set_temperature = (Set_temperatureMessageType.Set_temperatureMessage) e;
sendPrompt_via_human_output((String) ("INTERNAL ERROR: Impossible set_temperature at PIM.Running"));
});

Transition h657670477 = new Transition();
h657670477.from(state_PIM_PIM_behavior_Running).to(state_PIM_PIM_behavior_Running);
h657670477.event(temperatureType);
h657670477.port(get_sensor_port);
h657670477.action((Event e)->{
final TemperatureMessageType.TemperatureMessage temperature = (TemperatureMessageType.TemperatureMessage) e;
sendPrompt_via_human_output((String) ("INTERNAL ERROR: temperature received at PIM.Running"));
PIM_current_temp_var = (double) (temperature.t);
});

final CompositeState state_PIM_PIM_behavior = new CompositeState("PIM_behavior");
state_PIM_PIM_behavior.onEntry(()->{
System.out.print(""+(("Running The Room X3D3.MQTT.sim\n")));
});
state_PIM_PIM_behavior.add(state_PIM_PIM_behavior_Build);
state_PIM_PIM_behavior.add(state_PIM_PIM_behavior_Running);
state_PIM_PIM_behavior.initial(state_PIM_PIM_behavior_Build);
return state_PIM_PIM_behavior;
}

private CompositeState buildPIM_PIM_behavior_Build(){
final AtomicState state_PIM_PIM_behavior_Build_SetThermostat = new AtomicState("SetThermostat");
state_PIM_PIM_behavior_Build_SetThermostat.onEntry(()->{
sendAdd_thermometer_via_request_sensor((int) (getPIM_thermo_id_var()), (String) ("t"));
sendAdd_device_via_request_actuator((int) (getPIM_switch_id_var()));
});
Transition h1017862249 = new Transition();
h1017862249.from(state_PIM_PIM_behavior_Build_SetThermostat).to(state_PIM_PIM_behavior_Build_SetThermostat);
h1017862249.event(SwitchOnType);
h1017862249.port(human_input_port);
h1017862249.action((Event e)->{
final SwitchOnMessageType.SwitchOnMessage SwitchOn = (SwitchOnMessageType.SwitchOnMessage) e;
sendPrompt_via_human_output((String) ("Please set temperature for Thermostat"));
});

Transition h1953055837 = new Transition();
h1953055837.from(state_PIM_PIM_behavior_Build_SetThermostat).to(state_PIM_PIM_behavior_Build_SetThermostat);
h1953055837.event(SwitchOffType);
h1953055837.port(human_input_port);
h1953055837.action((Event e)->{
final SwitchOffMessageType.SwitchOffMessage SwitchOff = (SwitchOffMessageType.SwitchOffMessage) e;
sendPrompt_via_human_output((String) ("Please set temperature for Thermostat"));
});

final CompositeState state_PIM_PIM_behavior_Build = new CompositeState("Build");
state_PIM_PIM_behavior_Build.onEntry(()->{
sendTimer_start_via_guard_human((int) (30000));
});
state_PIM_PIM_behavior_Build.onExit(()->{
sendTimer_cancel_via_guard_human();
});

state_PIM_PIM_behavior_Build.add(state_PIM_PIM_behavior_Build_SetThermostat);
state_PIM_PIM_behavior_Build.keepHistory(true);
state_PIM_PIM_behavior_Build.initial(state_PIM_PIM_behavior_Build_SetThermostat);
return state_PIM_PIM_behavior_Build;
}

private CompositeState buildPIM_PIM_behavior_Running(){
final CompositeState state_PIM_PIM_behavior_Running_Thermostat = buildPIM_PIM_behavior_Running_Thermostat();
final AtomicState state_PIM_PIM_behavior_Running_On = new AtomicState("On");
final AtomicState state_PIM_PIM_behavior_Running_Off = new AtomicState("Off");
Transition h885471634 = new Transition();
h885471634.from(state_PIM_PIM_behavior_Running_Thermostat).to(state_PIM_PIM_behavior_Running_On);
h885471634.event(SwitchOnType);
h885471634.port(human_input_port);
h885471634.action((Event e)->{
final SwitchOnMessageType.SwitchOnMessage SwitchOn = (SwitchOnMessageType.SwitchOnMessage) e;
sendSwitchOn_via_request_actuator((int) (SwitchOn.did));
});

Transition h18475797 = new Transition();
h18475797.from(state_PIM_PIM_behavior_Running_Thermostat).to(state_PIM_PIM_behavior_Running_Off);
h18475797.event(SwitchOffType);
h18475797.port(human_input_port);
h18475797.action((Event e)->{
final SwitchOffMessageType.SwitchOffMessage SwitchOff = (SwitchOffMessageType.SwitchOffMessage) e;
sendSwitchOff_via_request_actuator((int) (SwitchOff.did));
});

Transition h1124544058 = new Transition();
h1124544058.from(state_PIM_PIM_behavior_Running_Thermostat).to(state_PIM_PIM_behavior_Running_Thermostat);
h1124544058.event(set_temperatureType);
h1124544058.port(human_input_port);
h1124544058.action((Event e)->{
final Set_temperatureMessageType.Set_temperatureMessage set_temperature = (Set_temperatureMessageType.Set_temperatureMessage) e;
PIM_tmrature_var = (double) (set_temperature.t);
System.out.println(""+(("Changing temp to: ")));
System.out.println(""+((getPIM_tmrature_var())));
});

Transition h1658886615 = new Transition();
h1658886615.from(state_PIM_PIM_behavior_Running_On).to(state_PIM_PIM_behavior_Running_Off);
h1658886615.event(SwitchOffType);
h1658886615.port(human_input_port);
h1658886615.action((Event e)->{
final SwitchOffMessageType.SwitchOffMessage SwitchOff = (SwitchOffMessageType.SwitchOffMessage) e;
sendSwitchOff_via_request_actuator((int) (SwitchOff.did));
});

Transition h2096749644 = new Transition();
h2096749644.from(state_PIM_PIM_behavior_Running_On).to(state_PIM_PIM_behavior_Running_On);
h2096749644.event(SwitchOnType);
h2096749644.port(human_input_port);
h2096749644.action((Event e)->{
final SwitchOnMessageType.SwitchOnMessage SwitchOn = (SwitchOnMessageType.SwitchOnMessage) e;
sendSwitchOn_via_request_actuator((int) (SwitchOn.did));
});

Transition h625289821 = new Transition();
h625289821.from(state_PIM_PIM_behavior_Running_On).to(state_PIM_PIM_behavior_Running_Thermostat);
h625289821.event(set_temperatureType);
h625289821.port(human_input_port);
h625289821.action((Event e)->{
final Set_temperatureMessageType.Set_temperatureMessage set_temperature = (Set_temperatureMessageType.Set_temperatureMessage) e;
PIM_tmrature_var = (double) (set_temperature.t);
});

Transition h787516112 = new Transition();
h787516112.from(state_PIM_PIM_behavior_Running_On).to(state_PIM_PIM_behavior_Running_On);
h787516112.event(temperatureType);
h787516112.port(get_sensor_port);
h787516112.action((Event e)->{
final TemperatureMessageType.TemperatureMessage temperature = (TemperatureMessageType.TemperatureMessage) e;
PIM_temp_buffer_var[(int)(getPIM_buffer_rear_var())] = (double) (temperature.t);
PIM_current_average_diff_var = (double) ((PIM_temp_buffer_var[(int)(getPIM_buffer_rear_var())] - PIM_temp_buffer_var[(int)(getPIM_buffer_front_var())]) / (getPIM_buffer_size_var() - 1));
System.out.println(""+((getPIM_current_average_diff_var())));
PIM_buffer_rear_var = (int) ((getPIM_buffer_rear_var() + 1) % getPIM_buffer_size_var());
if(getPIM_buffer_rear_var() == getPIM_buffer_front_var()) {
PIM_buffer_front_var = (int) ((getPIM_buffer_front_var() + 1) % getPIM_buffer_size_var());

}
});

Transition h934118448 = new Transition();
h934118448.from(state_PIM_PIM_behavior_Running_Off).to(state_PIM_PIM_behavior_Running_Off);
h934118448.event(SwitchOffType);
h934118448.port(human_input_port);
h934118448.action((Event e)->{
final SwitchOffMessageType.SwitchOffMessage SwitchOff = (SwitchOffMessageType.SwitchOffMessage) e;
sendSwitchOff_via_request_actuator((int) (SwitchOff.did));
});

Transition h358136039 = new Transition();
h358136039.from(state_PIM_PIM_behavior_Running_Off).to(state_PIM_PIM_behavior_Running_On);
h358136039.event(SwitchOnType);
h358136039.port(human_input_port);
h358136039.action((Event e)->{
final SwitchOnMessageType.SwitchOnMessage SwitchOn = (SwitchOnMessageType.SwitchOnMessage) e;
sendSwitchOn_via_request_actuator((int) (SwitchOn.did));
});

Transition h31488742 = new Transition();
h31488742.from(state_PIM_PIM_behavior_Running_Off).to(state_PIM_PIM_behavior_Running_Thermostat);
h31488742.event(set_temperatureType);
h31488742.port(human_input_port);
h31488742.action((Event e)->{
final Set_temperatureMessageType.Set_temperatureMessage set_temperature = (Set_temperatureMessageType.Set_temperatureMessage) e;
PIM_tmrature_var = (double) (set_temperature.t);
});

Transition h1747797250 = new Transition();
h1747797250.from(state_PIM_PIM_behavior_Running_Off).to(state_PIM_PIM_behavior_Running_Off);
h1747797250.event(temperatureType);
h1747797250.port(get_sensor_port);
h1747797250.action((Event e)->{
final TemperatureMessageType.TemperatureMessage temperature = (TemperatureMessageType.TemperatureMessage) e;
PIM_temp_buffer_var[(int)(getPIM_buffer_rear_var())] = (double) (temperature.t);
PIM_current_average_diff_var = (double) ((PIM_temp_buffer_var[(int)(getPIM_buffer_rear_var())] - PIM_temp_buffer_var[(int)(getPIM_buffer_front_var())]) / (getPIM_buffer_size_var() - 1));
System.out.println(""+((getPIM_current_average_diff_var())));
PIM_buffer_rear_var = (int) ((getPIM_buffer_rear_var() + 1) % getPIM_buffer_size_var());
if(getPIM_buffer_rear_var() == getPIM_buffer_front_var()) {
PIM_buffer_front_var = (int) ((getPIM_buffer_front_var() + 1) % getPIM_buffer_size_var());

}
});

final CompositeState state_PIM_PIM_behavior_Running = new CompositeState("Running");
state_PIM_PIM_behavior_Running.add(state_PIM_PIM_behavior_Running_Thermostat);
state_PIM_PIM_behavior_Running.add(state_PIM_PIM_behavior_Running_On);
state_PIM_PIM_behavior_Running.add(state_PIM_PIM_behavior_Running_Off);
state_PIM_PIM_behavior_Running.keepHistory(true);
state_PIM_PIM_behavior_Running.initial(state_PIM_PIM_behavior_Running_Thermostat);
return state_PIM_PIM_behavior_Running;
}

private CompositeState buildPIM_PIM_behavior_Running_Thermostat(){
final AtomicState state_PIM_PIM_behavior_Running_Thermostat_TemprDecide = new AtomicState("TemprDecide");
final AtomicState state_PIM_PIM_behavior_Running_Thermostat_TemprIncrease = new AtomicState("TemprIncrease");
state_PIM_PIM_behavior_Running_Thermostat_TemprIncrease.onEntry(()->{
sendTimer_start_via_guard_temperature((int) (65000));
});
state_PIM_PIM_behavior_Running_Thermostat_TemprIncrease.onExit(()->{
sendTimer_cancel_via_guard_temperature();
});

final AtomicState state_PIM_PIM_behavior_Running_Thermostat_TemprDecrease = new AtomicState("TemprDecrease");
state_PIM_PIM_behavior_Running_Thermostat_TemprDecrease.onEntry(()->{
sendTimer_start_via_guard_temperature((int) (65000));
});
state_PIM_PIM_behavior_Running_Thermostat_TemprDecrease.onExit(()->{
sendTimer_cancel_via_guard_temperature();
});

Transition h1237580158 = new Transition();
h1237580158.from(state_PIM_PIM_behavior_Running_Thermostat_TemprDecide).to(state_PIM_PIM_behavior_Running_Thermostat_TemprDecrease);
h1237580158.guard((Event e)->{
return getPIM_current_temp_var() >= getPIM_tmrature_var() - getPIM_delta_var();
});

h1237580158.action((Event e)->{
sendSwitchOff_via_request_actuator((int) (getPIM_switch_id_var()));
});

Transition h489468712 = new Transition();
h489468712.from(state_PIM_PIM_behavior_Running_Thermostat_TemprDecide).to(state_PIM_PIM_behavior_Running_Thermostat_TemprIncrease);
h489468712.guard((Event e)->{
return getPIM_current_temp_var() < getPIM_tmrature_var() - getPIM_delta_var();
});

h489468712.action((Event e)->{
sendSwitchOn_via_request_actuator((int) (getPIM_switch_id_var()));
});

Transition h858526962 = new Transition();
h858526962.from(state_PIM_PIM_behavior_Running_Thermostat_TemprIncrease).to(state_PIM_PIM_behavior_Running_Thermostat_TemprIncrease);
h858526962.event(temperatureType);
h858526962.guard((Event e)->{
final TemperatureMessageType.TemperatureMessage temperature = (TemperatureMessageType.TemperatureMessage) e;
return temperature.t + getPIM_current_average_diff_var() * getPIM_warming_time_var() <= getPIM_tmrature_var() + getPIM_delta_var();
});

h858526962.port(get_sensor_port);
h858526962.action((Event e)->{
final TemperatureMessageType.TemperatureMessage temperature = (TemperatureMessageType.TemperatureMessage) e;
if(getPIM_current_temp_var() > temperature.t) {
sendSwitchOn_via_request_actuator((int) (getPIM_switch_id_var()));

}
PIM_current_temp_var = (double) (temperature.t);
PIM_temp_buffer_var[(int)(getPIM_buffer_rear_var())] = (double) (temperature.t);
PIM_current_average_diff_var = (double) ((PIM_temp_buffer_var[(int)(getPIM_buffer_rear_var())] - PIM_temp_buffer_var[(int)(getPIM_buffer_front_var())]) / (getPIM_buffer_size_var() - 1));
System.out.println(""+((getPIM_current_average_diff_var())));
PIM_buffer_rear_var = (int) ((getPIM_buffer_rear_var() + 1) % getPIM_buffer_size_var());
if(getPIM_buffer_rear_var() == getPIM_buffer_front_var()) {
PIM_buffer_front_var = (int) ((getPIM_buffer_front_var() + 1) % getPIM_buffer_size_var());

}
});

Transition h126199346 = new Transition();
h126199346.from(state_PIM_PIM_behavior_Running_Thermostat_TemprIncrease).to(state_PIM_PIM_behavior_Running_Thermostat_TemprDecrease);
h126199346.event(temperatureType);
h126199346.guard((Event e)->{
final TemperatureMessageType.TemperatureMessage temperature = (TemperatureMessageType.TemperatureMessage) e;
return temperature.t + getPIM_current_average_diff_var() * getPIM_warming_time_var() > getPIM_tmrature_var() + getPIM_delta_var();
});

h126199346.port(get_sensor_port);
h126199346.action((Event e)->{
final TemperatureMessageType.TemperatureMessage temperature = (TemperatureMessageType.TemperatureMessage) e;
sendSwitchOff_via_request_actuator((int) (getPIM_switch_id_var()));
PIM_current_temp_var = (double) (temperature.t);
PIM_temp_buffer_var[(int)(getPIM_buffer_rear_var())] = (double) (temperature.t);
PIM_current_average_diff_var = (double) ((PIM_temp_buffer_var[(int)(getPIM_buffer_rear_var())] - PIM_temp_buffer_var[(int)(getPIM_buffer_front_var())]) / (getPIM_buffer_size_var() - 1));
System.out.println(""+((getPIM_current_average_diff_var())));
PIM_buffer_rear_var = (int) ((getPIM_buffer_rear_var() + 1) % getPIM_buffer_size_var());
if(getPIM_buffer_rear_var() == getPIM_buffer_front_var()) {
PIM_buffer_front_var = (int) ((getPIM_buffer_front_var() + 1) % getPIM_buffer_size_var());

}
});

Transition h757290526 = new Transition();
h757290526.from(state_PIM_PIM_behavior_Running_Thermostat_TemprIncrease).to(state_PIM_PIM_behavior_Running_Thermostat_TemprIncrease);
h757290526.event(timer_timeoutType);
h757290526.port(guard_temperature_port);
h757290526.action((Event e)->{
sendPrompt_via_human_output((String) ("WARNING: @TemprIncrease - temperature measurement is delayed"));
});

Transition h137195015 = new Transition();
h137195015.from(state_PIM_PIM_behavior_Running_Thermostat_TemprIncrease).to(state_PIM_PIM_behavior_Running_Thermostat_TemprIncrease);
h137195015.event(set_deltaType);
h137195015.port(human_input_port);
h137195015.action((Event e)->{
final Set_deltaMessageType.Set_deltaMessage set_delta = (Set_deltaMessageType.Set_deltaMessage) e;
PIM_delta_var = (double) (set_delta.dlta);
});

Transition h1170047966 = new Transition();
h1170047966.from(state_PIM_PIM_behavior_Running_Thermostat_TemprIncrease).to(state_PIM_PIM_behavior_Running_Thermostat_TemprIncrease);
h1170047966.event(fetch_tempType);
h1170047966.port(human_input_port);
h1170047966.action((Event e)->{
sendTemperature_via_human_output((int) (getPIM_thermo_id_var()), (String) ("temperature "), (double) (getPIM_current_temp_var()));
});

Transition h1290403405 = new Transition();
h1290403405.from(state_PIM_PIM_behavior_Running_Thermostat_TemprDecrease).to(state_PIM_PIM_behavior_Running_Thermostat_TemprDecrease);
h1290403405.event(temperatureType);
h1290403405.guard((Event e)->{
final TemperatureMessageType.TemperatureMessage temperature = (TemperatureMessageType.TemperatureMessage) e;
return temperature.t + getPIM_current_average_diff_var() * getPIM_cooling_time_var() >= getPIM_tmrature_var() + getPIM_delta_var();
});

h1290403405.port(get_sensor_port);
h1290403405.action((Event e)->{
final TemperatureMessageType.TemperatureMessage temperature = (TemperatureMessageType.TemperatureMessage) e;
if(getPIM_current_temp_var() < temperature.t) {
sendSwitchOff_via_request_actuator((int) (getPIM_switch_id_var()));

}
PIM_current_temp_var = (double) (temperature.t);
PIM_temp_buffer_var[(int)(getPIM_buffer_rear_var())] = (double) (temperature.t);
PIM_current_average_diff_var = (double) ((PIM_temp_buffer_var[(int)(getPIM_buffer_rear_var())] - PIM_temp_buffer_var[(int)(getPIM_buffer_front_var())]) / (getPIM_buffer_size_var() - 1));
System.out.println(""+((getPIM_current_average_diff_var())));
PIM_buffer_rear_var = (int) ((getPIM_buffer_rear_var() + 1) % getPIM_buffer_size_var());
if(getPIM_buffer_rear_var() == getPIM_buffer_front_var()) {
PIM_buffer_front_var = (int) ((getPIM_buffer_front_var() + 1) % getPIM_buffer_size_var());

}
});

Transition h329545272 = new Transition();
h329545272.from(state_PIM_PIM_behavior_Running_Thermostat_TemprDecrease).to(state_PIM_PIM_behavior_Running_Thermostat_TemprIncrease);
h329545272.event(temperatureType);
h329545272.guard((Event e)->{
final TemperatureMessageType.TemperatureMessage temperature = (TemperatureMessageType.TemperatureMessage) e;
return temperature.t + getPIM_current_average_diff_var() * getPIM_cooling_time_var() < getPIM_tmrature_var() - getPIM_delta_var();
});

h329545272.port(get_sensor_port);
h329545272.action((Event e)->{
final TemperatureMessageType.TemperatureMessage temperature = (TemperatureMessageType.TemperatureMessage) e;
sendSwitchOn_via_request_actuator((int) (getPIM_switch_id_var()));
PIM_current_temp_var = (double) (temperature.t);
PIM_temp_buffer_var[(int)(getPIM_buffer_rear_var())] = (double) (temperature.t);
PIM_current_average_diff_var = (double) ((PIM_temp_buffer_var[(int)(getPIM_buffer_rear_var())] - PIM_temp_buffer_var[(int)(getPIM_buffer_front_var())]) / (getPIM_buffer_size_var() - 1));
System.out.println(""+((getPIM_current_average_diff_var())));
PIM_buffer_rear_var = (int) ((getPIM_buffer_rear_var() + 1) % getPIM_buffer_size_var());
if(getPIM_buffer_rear_var() == getPIM_buffer_front_var()) {
PIM_buffer_front_var = (int) ((getPIM_buffer_front_var() + 1) % getPIM_buffer_size_var());

}
});

Transition h548857939 = new Transition();
h548857939.from(state_PIM_PIM_behavior_Running_Thermostat_TemprDecrease).to(state_PIM_PIM_behavior_Running_Thermostat_TemprDecrease);
h548857939.event(timer_timeoutType);
h548857939.port(guard_temperature_port);
h548857939.action((Event e)->{
sendPrompt_via_human_output((String) ("WARNING: @TemprDecrease - temperature measurement is delayed"));
});

Transition h650727962 = new Transition();
h650727962.from(state_PIM_PIM_behavior_Running_Thermostat_TemprDecrease).to(state_PIM_PIM_behavior_Running_Thermostat_TemprIncrease);
h650727962.event(set_deltaType);
h650727962.port(human_input_port);
h650727962.action((Event e)->{
final Set_deltaMessageType.Set_deltaMessage set_delta = (Set_deltaMessageType.Set_deltaMessage) e;
PIM_delta_var = (double) (set_delta.dlta);
});

Transition h1407033334 = new Transition();
h1407033334.from(state_PIM_PIM_behavior_Running_Thermostat_TemprDecrease).to(state_PIM_PIM_behavior_Running_Thermostat_TemprIncrease);
h1407033334.event(fetch_tempType);
h1407033334.port(human_input_port);
h1407033334.action((Event e)->{
sendTemperature_via_human_output((int) (getPIM_thermo_id_var()), (String) ("temperature "), (double) (getPIM_current_temp_var()));
});

final CompositeState state_PIM_PIM_behavior_Running_Thermostat = new CompositeState("Thermostat");
state_PIM_PIM_behavior_Running_Thermostat.onEntry(()->{
});
state_PIM_PIM_behavior_Running_Thermostat.add(state_PIM_PIM_behavior_Running_Thermostat_TemprDecide);
state_PIM_PIM_behavior_Running_Thermostat.add(state_PIM_PIM_behavior_Running_Thermostat_TemprIncrease);
state_PIM_PIM_behavior_Running_Thermostat.add(state_PIM_PIM_behavior_Running_Thermostat_TemprDecrease);
state_PIM_PIM_behavior_Running_Thermostat.initial(state_PIM_PIM_behavior_Running_Thermostat_TemprDecide);
return state_PIM_PIM_behavior_Running_Thermostat;
}

public Component buildBehavior(String session, Component root) {
if (root == null) {
//Init ports
get_sensor_port = new Port("get_sensor", this);
request_sensor_port = new Port("request_sensor", this);
request_actuator_port = new Port("request_actuator", this);
human_input_port = new Port("human_input", this);
human_output_port = new Port("human_output", this);
guard_temperature_port = new Port("guard_temperature", this);
guard_human_port = new Port("guard_human", this);
} else {
get_sensor_port = ((PIM)root).get_sensor_port;
request_sensor_port = ((PIM)root).request_sensor_port;
request_actuator_port = ((PIM)root).request_actuator_port;
human_input_port = ((PIM)root).human_input_port;
human_output_port = ((PIM)root).human_output_port;
guard_temperature_port = ((PIM)root).guard_temperature_port;
guard_human_port = ((PIM)root).guard_human_port;
}
if (session == null){
//Init state machine
behavior = buildPIM_PIM_behavior();
}
return this;
}

}
