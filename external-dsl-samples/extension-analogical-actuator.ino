// Wiring code generated from an ArduinoML model
// Application name: Extension With Analog

void setup(){
  pinMode(12, INPUT);  // button [Sensor]
  pinMode(9, OUTPUT); // led [Actuator]
}

long time = 0; long debounce = 200;

void state_off() {
  digitalWrite(9,LOW);
  boolean guard = millis() - time > debounce;
  if( guard && digitalRead(12) == HIGH ) {
    time = millis();
    state_first();
  } else {
    state_off();
  }
}

void state_first() {
  analogWrite(9,125);
  boolean guard = millis() - time > debounce;
  if( guard && digitalRead(12) == HIGH ) {
    time = millis();
    state_two();
  } else {
    state_first();
  }
}

void state_two() {
  analogWrite(9,200);
  boolean guard = millis() - time > debounce;
  if( guard && digitalRead(12) == HIGH ) {
    time = millis();
    state_three();
  } else {
    state_two();
  }
}

void state_three() {
  digitalWrite(9,HIGH);
  boolean guard = millis() - time > debounce;
  if( guard && digitalRead(12) == HIGH ) {
    time = millis();
    state_off();
  } else {
    state_three();
  }
}

void loop() {
  state_off();
}
