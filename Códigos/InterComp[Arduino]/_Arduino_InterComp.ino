int green = 6;
int red = 4;
int orange = 2;
int lamp = 8;
boolean piscGreen = false;
boolean piscRed = false;
boolean piscOrange = false;
boolean piscLamp = false;
String action = "";

void setup() {
  Serial.begin(9600);
  pinMode(green, OUTPUT);
  pinMode(red, OUTPUT);
  pinMode(orange, OUTPUT);
  pinMode(lamp, OUTPUT);
  
  digitalWrite(green, LOW);
  digitalWrite(red, LOW);
  digitalWrite(orange, LOW);
  digitalWrite(lamp, HIGH);
}

void loop() {
  if(Serial.available() > 0){
    action = Serial.readString();
    OnLight();
  }
  PiscLight();
}

void OnLight(){
    if(action == "ongreen"){
      digitalWrite(green, HIGH);
    }else if(action == "offgreen"){
      digitalWrite(green, LOW);
    }else if(action == "onred"){
      digitalWrite(red, HIGH);
    }else if(action == "offred"){
      digitalWrite(red, LOW);
    }else if(action == "onorange"){
      digitalWrite(orange, HIGH);
    }else if(action == "offorange"){
      digitalWrite(orange, LOW);
    }else if(action == "onlamp"){
      digitalWrite(lamp, LOW);
    }else{
      if(action == "offlamp"){
        digitalWrite(lamp, HIGH);
      }  
    }    
}

void PiscLight(){
    if(action == "piscGreen"){
      piscGreen = true;
    }else if(action == "stopGreen"){
      piscGreen = false;
    }else if(action == "piscRed"){
      piscRed = true;
    }else if(action == "stopRed"){
      piscRed = false;
    }else if(action == "piscOrange"){
      piscOrange = true;
    }else if(action == "stopOrange"){
      piscOrange = false;
    }else if(action == "piscLamp"){
      piscLamp = true;  
    }else{
      if(action == "stopLamp"){
        piscLamp = false;  
      }  
    }

    if(piscGreen or piscRed or piscOrange or piscLamp){
        piscAnyLight(HIGH);
        piscAnyLight(LOW); 
    }
}

void piscAnyLight(int state){
        if(piscGreen)  digitalWrite(green, state);
        if(piscRed)    digitalWrite(red, state);
        if(piscOrange) digitalWrite(orange, state);
        if(piscLamp)   digitalWrite(lamp, state);
        delay(500);  
}
