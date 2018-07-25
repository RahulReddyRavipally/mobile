# Track
Track is an application for interacting with IBM Watson IoT Platform.
The application turns your mobile device into a sensor(Tracker) that publishes and receives data to and from the cloud using the MQTT protocol.

## Short Description
Watson IoT Platform is a cloud-hosted service to simplify managing all of your IoT devices. The key features provided by the service include:
- Device management
- Scalable connectivity
- Secure communication
- Historical data

This application demonstrates using an Android device as one an IoT device, and provides a variety of events and commands that it can publish or receive data to and from.

Events and commands are user defined values used to differentiate the data that you publish or receive. For example, if you have a device that is publishing GPS coordinates, you may choose to publish it as a 'GPS' event. Or, if you want to send an alert command to a device, you may choose to publish it as an 'alert' or 'notification' command.

The application can publish data to the following event topics:
- GPS Coordinates (gps event)
- Route Generation (route event)
- Stop (stop event)

The application can receive data on the following command topics:
- Route Commands (commandreceive command)


For more information on Watson IoT Platform, refer to https://docs.internetofthings.ibmcloud.com/index.html.

## How it works
A device that is registered with Watson IoT Platform may publish and subscribe to data that is presented as either an event or command using the MQTT protocol.
The Eclipse Paho MQTT Android Service is used to publish and subscribe to Watson IoT Platform. This can be downloaded from
[Eclipse Paho MQTT Android Service](http://www.eclipse.org/paho/clients/android/).

MQTT is a lightweight messaging protocol that supports publish/subscribe messaging. With MQTT, an application publishes messages to a topic. These messages may then be received by another application that is subscribed to that topic. This allows for a detached messaging network where the subscribers and publishers do not need to be aware of each other.

For more information on the MQTT protocol, see http://mqtt.org/.

## Try it
The Track app can be used in by.

### Connecting to an IoT organization as a registered device
In order to try the application as a registered device, you must have a Watson IoT Platform organization. This can be done by signing up for an IBM Cloud trial and creating an instance of the Internet of Things Platform service. This will create an  organization where you can register devices. Next, you must register your device with your organization. When registering your device, create a new device type called `Android` (case sensitive). More detailed instructions on registering devices can be found in the [Watson IoT Platform documentation](https://docs.internetofthings.ibmcloud.com/index.html).

On launching the application for the first time, you will need to enter your credentials to connect your device to Watson IoT Platform. The required information to connect your device includes:

- Your Organization ID, e.g. ab1cde
- Your Device ID, e.g. the MAC Address of your device. This should be the same ID as the device that you registered in your Watson IoT Platform organization.
- Your device authorization token. This is returned when registering your device with Watson IoT Platform.

Once you have entered the necessary credentials, you may activate your device as a sensor. Pressing the 'Activate Sensor' button will connect the device to Watson IoT Platform and allow it to begin publishing and receiving data.

## Prerequisites
Required:
- An [IBM Cloud](https://console.ng.bluemix.net/) account. A 30 day trial account is free.
- An Internet of Things Platform service registered in IBM Cloud.
- An Android SDK installation

## Installation
1. `git clone https://github.ibm.com/bkadambi/iot-gps-routing.git`
2. Launch Android Studio and select "Open an Existing Android Studio Project".
3. Navigate to your `mobile app` folder and open the project.
4. Run the application.
 

## Resources
- [Track App for Android](https://github.ibm.com/bkadambi/iot-gps-routing/mobile app)
- [IBM Watson IoT Platform](https://internetofthings.ibmcloud.com/#/)
- [IBM Cloud](https://console.ng.bluemix.net/)
- [IoT Recipes](https://developer.ibm.com/iot/)
- [Quickstart](http://quickstart.internetofthings.ibmcloud.com/#/)
- [Node-RED](http://nodered.org/)
- [MQTT](http://mqtt.org/)
