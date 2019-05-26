import ddf.minim.*;
Minim minim;
AudioSample sound;
int xPos = 10;
int yPos = 10;
int xPosII = xPos;
int xChange = 10;
int yChange = 10;
int scoreI = 0;
int scoreII = 0;
void setup(){
size(600, 400);
minim = new Minim (this);
sound = minim.loadSample("ouch2.mp3");
}
void draw(){
background(0, 0, 0);
fill(255, 255, 255);
ellipse(xPos, yPos, 10, 10);
fill(255, 255, 255);
rect(mouseX - 50, 390, 100, 10);
fill(255, 255, 255);
rect(xPosII, 0, 100, 10);
fill(200, 200, 200);
text("You: " + scoreII + " Your opponent: " + scoreI, 0, 10);
xPos = xPos + xChange;
yPos = yPos + yChange;
xPosII = xPos - 50;
if(xPos > width){
xChange = xChange * -1;
sound.trigger();
}
if(yPos > height){
yChange = yChange * -1;
sound.trigger();
scoreI = scoreI + 1;
}
if(xPos < 0){
xChange = xChange * -1;
sound.trigger();
}
if(yPos < 0){
yChange = yChange * -1;
sound.trigger();
scoreII = scoreII + 1;
}
if(intersects(xPos, yPos, mouseX, 390, 100)){
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
