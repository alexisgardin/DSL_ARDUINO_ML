// Wiring code generated from an ArduinoML model
// Application name: DualCheckAlarm

void setup(){
  pinMode(12, INPUT);  // button [Sensor]
  pinMode(13, INPUT);  // button1 [Sensor]
  pinMode(9, OUTPUT); // buzzer [Actuator]
}

long time = 0; long debounce = 200;

void state_off() {
  digitalWrite(9,LOW);
  boolean guard = millis() - time > debounce;
  if( guard && digitalRead(12) == HIGH && digitalRead(13) == HIGH ) {
    time = millis();
    state_on();
  } else {
    state_off();
  }
}

void state_on() {
  digitalWrite(9,HIGH);
  boolean guard = millis() - time > debounce;
  if( guard && digitalRead(12) == LOW || digitalRead(13) == LOW ) {
    time = millis();
    state_off();
  } else {
    state_on();
  }
}

void loop() {
  state_off();
}
