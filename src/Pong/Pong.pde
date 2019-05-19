import ddf.minim.*;
Minim minim;
AudioSample sound;
int xPos = 10;
int yPos = 10;
int xChange = 10;
int yChange = 10;
void setup(){
size(600, 400);
minim = new Minim (this);
sound = minim.loadSample("ouch2.mp3");
}
void draw(){
background(0, 0, 0);
fill(255, 255, 255);
ellipse(xPos, yPos, 10, 10);
fill(200, 200, 200);
rect(mouseX, 490, 100, 10);
xPos = xPos + xChange;
yPos = yPos + yChange;
if(xPos > width){
xChange = xChange * -1;
sound.trigger();
}
if(yPos > height){
yChange = yChange * -1;
sound.trigger();
}
if(xPos < 0){
xChange = xChange * -1;
sound.trigger();
}
if(yPos < 0){
yChange = yChange * -1;
sound.trigger();
}
if(intersects(xPos, yPos, mouseX, 490, 100)){
xChange = xChange * -1;
yChange = yChange * -1;
}
}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else 
          return false;
}
