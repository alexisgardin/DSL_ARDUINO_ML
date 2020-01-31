// Wiring code generated from an ArduinoML model
// Application name: Extension

void setup(){
  pinMode(15, INPUT);  // button [Sensor]
  pinMode(12, INPUT);  // temp_captor [Sensor]
  pinMode(9, OUTPUT); // led [Actuator]
}

long time = 0; long debounce = 200;

void state_off() {
  digitalWrite(9,LOW);
  boolean guard = millis() - time > debounce;
  if( guard && digitalRead(15) == HIGH && analogRead(12)*1.000000 > 35.0 ) {
    time = millis();
    state_on();
  } else {
    state_off();
  }
}

void state_on() {
  digitalWrite(9,HIGH);
  boolean guard = millis() - time > debounce;
  if( guard && digitalRead(15) == LOW ) {
    time = millis();
    state_off();
  } else {
    state_on();
  }
}

void loop() {
  state_off();
}
