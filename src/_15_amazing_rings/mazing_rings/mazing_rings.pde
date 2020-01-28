int x = 200;


int speed = 5;
void setup() {
  size(1000, 1000);
}

void draw() {
background(#FC0000);
  
  for (int size = 350; size>=5; size = size-5) {
    if (size%100>0) {

noFill();


      ellipse(x, 500, size, size);
    }
  }

  for (int size = 350; size>=5; size = size-5) {
    if (size%100>0) {




      ellipse(x2, 500, size, size);
    }
  }
  x = x + speed;
  
  x2 = x2 - speed;
  
  if(x>1000){
    speed = -speed;
  }
  
  if(x<0){
    speed=-speed;
  }
}
