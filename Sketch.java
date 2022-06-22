import processing.core.PApplet;

public class Sketch extends PApplet {
    
double randomx = random(-width, width);
  double randomy = random(-50, 50);

  
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    // put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup(){
    }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    background(51,204,255);

    // Cloud
    fill(255, 255, 255);
    ellipse((float) ((width/1.66) - randomx), (float) ((height/13.33) - randomy), (float) (width/2.86), height/10); 

    if (randomy > 0){
background(102, 255, 102);
  ellipse((float) ((width/1.66) - randomx), (float) ((height/13.33) - randomy), (float) (width/2.86), height/10); 
    } else if(randomy < 0){
background(51,204,255);
      ellipse((float) ((width/1.66) - randomx), (float) ((height/13.33) - randomy), (float) (width/2.86), height/10); 

  }

    //house
    fill(255, 255, 153);
  rect((float) (width/4.0), (float) (height/2.58),
        width/2, height/2);    

    // Window
    fill(255, 255, 255);
    rect((float) (width/3.57), (float) (height/1.43), width/8, height/8);

    // Window Roof
    fill(51, 0, 0);
    rect((float) (width/3.74), (float) (height/1.43), (float) (width/6.66), height/80);

    // Window
    fill(255, 255, 255);
    rect((float) (width/1.68), (float) (height/1.43), width/8, height/8);

    // Window Roof
    fill(51, 0, 0);
    rect((float) (width/1.72), (float) (height/1.43), (float) (width/6.66), height/80);

    // Window
    fill(255, 255, 255);
    rect((float) (width/3.57), height/2, (float) (width/5.33), height/8);

    // Window Roof
    fill(51, 0, 0);
    rect((float) (width/3.74), height/2, (float) (width/4.70), height/80);

    // Window
    fill(255, 255, 255);
    rect((float) (width/1.88), height/2, (float) (width/5.33), height/8);

    // Window Roof
    fill(51, 0, 0);
    rect((float) (width/1.92), height/2, (float) (width/4.71), height/80);


    // House Roof
    fill(255, 153, 0);
    triangle((float) (width/2), (float) (height/5.333), (float) (width/1.23), (float) (height/2.285), (float) (width/5.333), (float) (height/2.285)); 

    // Tree Leaves
    fill(0, 255, 51);
    ellipse((float) (width/6.15), (float) (height/1.818), width/4, height/4); 

    // Tree Trunk
    fill(102, 51, 0);
    rect((float) (width/7.273), (float) (height/1.481), width/20, height/4); 

   // Bush
    fill(0, 153, 0);
    ellipse((float) (width/1.269), (float) (height/1.212), (float) (width/6.666), (float) (height/6.666)); 

    // Bush
    fill(0, 102, 0);
ellipse((float) (width/1.176), (float) (height/1.142), (float) (width/6.666), (float) (height/6.666));
    
    // Bush
    fill(0, 204,0);
ellipse((float) (width/1.333), (float) (height/1.142), (float) (width/6.666), (float) (height/6.666));

   // box to put time in
    fill(255, 255);
    stroke(151);
    rect(75, 250, 250, 70);

    // values for time
    int intHour = hour();
    int intMinute = minute();
    int intSecond = second();

    // print time
    String strTime = (str(intHour % 12) + ":" + str(intMinute) + ":" + str(intSecond));

    // size and font
    noStroke();
    fill(0, 0, 0);
    textSize(40);
    text(strTime, 105, 315);

  }
}



