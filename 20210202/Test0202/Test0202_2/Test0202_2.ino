const int LED = 8;
const int HIGH_VAL = 1;
const int LOW_VAL = 0;

   void setup() {
  pinMode(LED, OUTPUT);
}

   void loop() {
  digitalWrite(LED, HIGH_VAL);
  delay(300);
  digitalWrite(LED, LOW_VAL);
  delay(300);

}
