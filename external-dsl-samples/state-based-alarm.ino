The app name is : StateBasedAlarm
// Wiring code generated from an ArduinoML model
// Application name: StateBasedAlarm

void setup(){
  pinMode(12, INPUT);  // button [Sensor]
  pinMode(9, OUTPUT); // led [Actuator]
}

long time = 0; long debounce = 200;

void state_off() {
  digitalWrite(9,LOW);
  boolean guard = millis() - time > debounce;
  if( digitalRead(12) == HIGH ) {
    time = millis();
    state_on();
  } else {
    state_off();
  }
}

void state_on() {
  digitalWrite(9,HIGH);
  boolean guard = millis() - time > debounce;
  if( digitalRead(12) == HIGH ) {
    time = millis();
    state_off();
  } else {
    state_on();
  }
}

void loop() {
  state_off();
}



