const int melody[] = {
  262, // 도
  294, // 레
  330, // 미 
  349, // 파
  392, // 솔
  440, // 라 
  494, // 시
  523 // 도
};

// 상수 변수
// const int BUZZER = 10;

//c, c++ 사용 문법
#define BUZZER 10

void setup() {
  for (int i = 0; i < 8; i++) {
    tone(BUZZER, melody[i], 500);
    delay(500);
  }
}

void loop() {
  

}
