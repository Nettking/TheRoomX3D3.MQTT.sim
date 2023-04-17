# The Room X3D3
<div>This is a termostat written in the ThingML language. The file describes a configuration called "X3D3_MQTT_SIM", which consists of several instances of various ThingML components and connectors between them.</div>

## Installation
Remove all the github files and directories before importing the repository into Eclipse.

## Description

<div>The instances are:</div>
<div>T1:MQTTDriver: an instance of a component that communicates over MQTT.</div>
<div>pim:PIM: an instance of a component called "PIM".</div>
<div>myself:Human: an instance of a component called "Human".</div>
<div>g_temp:TimerJava: an instance of a timer component.</div>
<div>g_humn:TimerJava: another instance of a timer component.</div>
<div>e_timer:TimerJava: yet another instance of a timer component.</div>
<div>e_saving:EnergySaving: an instance of a component called "EnergySaving".</div>
<div>The configuration file includes several imports of other ThingML files that define the various components and connectors used in this configuration.</div>
<div>The connector statements define how the various components communicate with each other. For example, the line connector T1.provide_temp =&gt; pim.get_sensor specifies that the provide_temp port of the T1 instance is connected to the get_sensor port of the pim instance.</div>
<div>There are also several connectors that communicate with the myself:Human instance, which seems to represent some kind of human interface. For example, the line connector myself.send_cmd_temp =&gt; pim.human_input specifies that the send_cmd_temp port of the myself instance is connected to the human_input port of the pim instance.</div>
<div>Finally, there is a connector that sends output to the console via the stdio interface, as well as a connector that communicates over MQTT.</div>
<div>Overall, this configuration seems to represent a system that involves MQTT communication, timers, and various components that interact with each other in complex ways.</div>
<div>When importing from the Room X3D3 repository, you should delete the .git directory and other files from git.</div>