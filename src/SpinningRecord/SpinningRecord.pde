import ddf.minim.*;
PImage pictureOfRecord;
Minim minim;
AudioPlayer song;
int rotation = 0;
void setup(){
size(600,600);
pictureOfRecord=loadImage("record.png");
pictureOfRecord.resize(600, 600);
minim = new Minim(this);
song = minim.loadFile("music3.mp3", 24);
}
void draw(){
background(100);
if(mousePressed){
song.play();
rotateImage(pictureOfRecord, rotation);
rotation = rotation + 10;
song.pause();
}else{
song.pause();
}
image(pictureOfRecord, 0, 0);
}
void rotateImage(PImage image, int amountToRotate){
 translate(width/2, height/2);
 rotate(amountToRotate*TWO_PI/360);
 translate(-image.width/2, -image.height/2);
}
