import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

    
  }


  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section
   */
  public void draw_section1(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 3 + intRow * 300 / 30;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = 3 + 300 + intColumn * 300 / 30; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   */
  public void draw_section2(){

    int sectTwoX = 0;
    int sectTwoY = 0;

    for(int sectTwoRow = 0; sectTwoRow < 30; sectTwoRow++){
      for(int sectTwoColumn = 0; sectTwoColumn < 30; sectTwoColumn++){

        sectTwoX = 3 + 300 + sectTwoRow * 300 / 30;
        sectTwoY = 3 + 300 + sectTwoColumn * 300 / 30;

        if(sectTwoRow % 2 == 0){

          fill(255);
          noStroke();
          rect(sectTwoX, sectTwoY, 5, 5);
        } else {

          fill(0);
          noStroke();
          rect(sectTwoX, sectTwoY, 5, 5);
        }
      }
    }
  }

  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */
  public void draw_section3(){

    int sectThreeX = 0;
    int sectThreeY = 0;

    for(int sectThreeRow = 0; sectThreeRow < 30; sectThreeRow++){
      for(int sectThreeColumn = 0; sectThreeColumn < 30; sectThreeColumn++){

        sectThreeX = 3 + 600 + sectThreeRow * 300 / 30;
        sectThreeY = 3 + 300 + sectThreeColumn * 300 / 30;

        if(sectThreeColumn % 2 == 0){

          fill(0);
          noStroke();
          rect(sectThreeX, sectThreeY, 5, 5);
        } else {

          fill(255);
          noStroke();
          rect(sectThreeX, sectThreeY, 5, 5);
        }
      }
    }
  }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  public void draw_section4(){

    int sectFourX = 0;
    int sectFourY = 0;

    for(int sectFourRow = 0; sectFourRow < 30; sectFourRow++){
      for(int sectFourColumn = 0; sectFourColumn < 30; sectFourColumn++){

        sectFourX = 3 + 900 + sectFourRow * 300 / 30;
        sectFourY = 3 + 300 + sectFourColumn * 300 / 30;

        if(sectFourColumn % 2 != 0 && sectFourRow % 2 == 0){

          fill(255);
          noStroke();
          rect(sectFourX, sectFourY, 5, 5);
        } else {

          fill(0);
          noStroke();
          rect(sectFourX, sectFourY, 5, 5);
        }
      }
    }
  }

  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */
  public void draw_section5(){

    int sectFiveX = 0;
    int sectFiveY = 0;

    for(int sectFiveRow = 30; sectFiveRow > 0; sectFiveRow--){
      for(int sectFiveColumn = 30; sectFiveColumn > 0; sectFiveColumn--){

        sectFiveX = 3 + sectFiveRow * (300 / sectFiveRow);
        sectFiveY = 3 + sectFiveColumn * (300 / sectFiveColumn);

        fill(255);
        noStroke();
        rect(sectFiveX, sectFiveY, 5, 5);
      }
    }
  }

  public void draw_section6(){

  }

  public void draw_section7(){

  }
  
  public void draw_section8(){

  }






}
