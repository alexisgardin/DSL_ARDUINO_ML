// Wiring code generated from an ArduinoML model
// Application name: VerySimpleAlarm

void setup(){
  pinMode(12, INPUT);  // button [Sensor]
  pinMode(9, OUTPUT); // buzzer [Actuator]
  pinMode(8, OUTPUT); // led [Actuator]
}

long time = 0; long debounce = 200;

void state_off() {
  digitalWrite(9,LOW);
  digitalWrite(8,LOW);
  boolean guard = millis() - time > debounce;
  if( guard && digitalRead(12) == HIGH ) {
    time = millis();
    state_on();
  } else {
    state_off();
  }
}

void state_on() {
  digitalWrite(9,HIGH);
  digitalWrite(8,HIGH);
  boolean guard = millis() - time > debounce;
  if( guard && digitalRead(12) == LOW ) {
    time = millis();
    state_off();
  } else {
    state_on();
  }
}

void loop() {
  state_off();
}
