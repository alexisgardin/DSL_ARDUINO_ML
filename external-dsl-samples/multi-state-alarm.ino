The app name is : MultiStateAlarm
// Wiring code generated from an ArduinoML model
// Application name: MultiStateAlarm

void setup(){
  pinMode(12, INPUT);  // button [Sensor]
  pinMode(9, OUTPUT); // led [Actuator]
  pinMode(10, OUTPUT); // buzzer [Actuator]
}

long time = 0; long debounce = 200;

void state_off() {
  digitalWrite(9,LOW);
  digitalWrite(10,LOW);
  boolean guard = millis() - time > debounce;
  if( digitalRead(12) == HIGH ) {
    time = millis();
    state_buzzer_on();
  } else {
    state_off();
  }
}

void state_buzzer_on() {
  digitalWrite(10,HIGH);
  digitalWrite(9,LOW);
  boolean guard = millis() - time > debounce;
  if( digitalRead(12) == HIGH ) {
    time = millis();
    state_led_on();
  } else {
    state_buzzer_on();
  }
}

void state_led_on() {
  digitalWrite(10,LOW);
  digitalWrite(9,HIGH);
  boolean guard = millis() - time > debounce;
  if( digitalRead(12) == HIGH ) {
    time = millis();
    state_off();
  } else {
    state_led_on();
  }
}

void loop() {
  state_off();
}
