void setup(){
size(500, 500);
fill(#F2DC9F);
ellipse(250, 250, 200, 200);
fill(#F70000);
ellipse(250, 250, 170, 170);
fill(#FFF8AD);
ellipse(250, 250, 150, 150);
PImage pepperoni= loadImage("pepperoni.ppm.gif");
image(pepperoni, 240, 230);
PImage sausage= loadImage("sausage.ppm.gif");
image(pepperoni, 200, 200);
PImage pork = loadImage("pork.ppm.gif");
image(pepperoni, 200, 270);
PImage bacon = loadImage("bacon.ppm.gif");
image(pepperoni, 250, 185);
PImage salami = loadImage("salami.ppm.gif");
image(pepperoni, 270, 280);
}