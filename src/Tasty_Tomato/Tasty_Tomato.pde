
void setup(){
  size (500, 500);
}
void draw(){
  background(200, 200, 200);
  noStroke();
  fill(#FF0004);
  ellipse(150, 200, 150, 150);
  ellipse(212, 200, 150, 150);
  fill(#279334);
  rect(176, 103, 12, 32);
if(mousePressed){
  fill(#D1CFD0);
  ellipse(80, 190, 50, 50);
}
}