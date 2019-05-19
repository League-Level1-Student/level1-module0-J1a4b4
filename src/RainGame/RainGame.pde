int xPos = 0;
int yPos = 976;
int score = 0;
void setup(){
size(1000, 1000);
}
void draw(){
background(50, 50, 255);
fill(0, 0, 255);
stroke(0, 0, 0);
ellipse(xPos, yPos, 50, 50);
fill(100, 100, 100);
stroke(0, 0, 0);
rect(mouseX, 849, 100, 150);
yPos = yPos + 10;
if(yPos > 975){
checkCatch(xPos);
yPos = 25;
xPos = (int) random(width);
}
fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);
}
void checkCatch(int x){
if (x > mouseX && x < mouseX + 100){
  score++;
}else if (score > 0){
  score--;
}
println("Your score is now: " + score + ".");
}
