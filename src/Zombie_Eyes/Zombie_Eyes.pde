void setup(){
  size(500, 500);
  PImage face = loadImage("face.jpeg");
  image(face, 150, 100);
  face.resize(250, 250);
  fill(mouseX, mouseY, 3);
  ellipse(220, 215, 30, 15);
  ellipse(278, 215, 30, 15);
  ellipse(220, 215, 7, 8);
  fill(#050300);
  ellipse(278, 215, 7, 8); 
}
void draw(){
fill(mouseX, mouseY, 3);
  ellipse(220, 215, 30, 15);
  ellipse(278, 215, 30, 15);
}