import subprocess



def on_message(client, userdata, message):
    # Decode the message payload from bytes to string
    payload = message.payload.decode()

    
    print('Received payload:', payload, "on topic:", message.topic)

def establish_connection(MQTT_BROKER_ADDR, MQTT_BROKER_PORT, MQTT_TOPIC_SUB, MQTT_TOPIC_PUB, message="Hello, world!"):

    # Set up the MQTT client and connect to the broker
    client = mqtt.Client()
    client.connect(MQTT_BROKER_ADDR, MQTT_BROKER_PORT)

    message = f'{{"temperature":{{"id":1,"txt":"temperature","t":{test_temp}}}}}'
    message_lum = f'{{"luminance":{{"id":1,"txt":"SensorLuminance","lum":{input_luminance}}}}}'

    # Publish a message to the specified topic with the retain flag set to False and QoS level 1
    client.publish(MQTT_TOPIC_PUB, message, retain=False, qos=1)
    client.publish(MQTT_TOPIC_PUB, message_lum, retain=False, qos=1)
    print("Published message: " + message)
    print("Published message: " + message_lum)
    


if __name__ == "__main__":

    try:
        import paho.mqtt.client as mqtt
    except:
        def is_paho_installed():
            installed_packages = subprocess.check_output(["pip", "list"]).decode("utf-8")
            return 'paho-mqtt' in installed_packages

        def install_paho():
            subprocess.check_call(["pip", "install", "paho-mqtt"])

        if not is_paho_installed():
            print("paho-mqtt is not installed. Installing now...")
            install_paho()
            print("Installation completed.")
            import paho.mqtt.client as mqtt
        else:
            print("paho-mqtt is already installed.")
        
    host = input("Please enter host (openhabian) IP: ")
    port = 1883
    test_temp = input("Please enter the temperature to send: ")
    input_luminance = input("Please enter the luminance to send: ")
    topic_temp = 'CPS2021/tempoutput'
    topic_switch = 'CPS2021/SwitchControl'

    establish_connection(host, port, topic_switch, topic_temp)
        