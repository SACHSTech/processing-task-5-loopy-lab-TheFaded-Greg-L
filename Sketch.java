import processing.core.PApplet;

/**
* 
* a program Sketch.java that is used to experiment with java nested loops in 8 different scenarios and their behaviours. 
* @author: G. Lui
*
*/

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
    int fiveCounterRow = 0;
    int fiveCounterColumn = 0;

    for(int sectFiveColumn = 30; sectFiveColumn > fiveCounterColumn; sectFiveColumn--){

      for(int sectFiveRow = 30; sectFiveRow > fiveCounterRow; sectFiveRow--){

        sectFiveX = 3 - 10 + sectFiveRow * 300 / 30 ;
        sectFiveY = 3 + sectFiveColumn * 300 / 30;

        fill(255);
        noStroke();
        rect(sectFiveX, sectFiveY, 5, 5);
      }

      fiveCounterRow += 1;
    }
  }

  public void draw_section6(){

    int sectSixX = 0;
    int sectSixY = 0;
    int sixCounterRow = 30;
    int sixCounterColumn = 0;

    for(int sectSixColumn = 30; sectSixColumn > sixCounterColumn; sectSixColumn--){

      for(int sectSixRow = 0; sectSixRow < sixCounterRow; sectSixRow++){

        sectSixX = 3 + 300 + sectSixRow * 300 / 30;
        sectSixY = 3 - 10 + sectSixColumn * 300 / 30;

        fill(255);
        noStroke();
        rect(sectSixX, sectSixY, 5, 5);
      }

      sixCounterRow -= 1;
    }
  }

  public void draw_section7(){

    int sectSevenX = 0;
    int sectSevenY = 0;
    int sevenCounterRow = 30;
    int sevenCounterColumn = 30;

    for(int sectSevenColumn = 0; sectSevenColumn < sevenCounterColumn; sectSevenColumn++){

      for(int sectSevenRow = 0; sectSevenRow < sevenCounterRow; sectSevenRow++){

        sectSevenX = 3 + 600 + sectSevenRow * 300 / 30;
        sectSevenY = 3 + sectSevenColumn * 300 / 30;

        fill(255);
        noStroke();
        rect(sectSevenX, sectSevenY, 5, 5);
      }

      sevenCounterRow -= 1;
    }
  }
  
  public void draw_section8(){

    int sectEightX = 0;
    int sectEightY = 0;
    int eightCounterRow = 0;
    int eightCounterColumn = 30;

    for(int sectEightColumn = 0; sectEightColumn < eightCounterColumn; sectEightColumn++){

      for(int sectEightRow = 30; sectEightRow > eightCounterRow; sectEightRow--){

        sectEightX = 3 - 10 + 900 + sectEightRow * 300 / 30;
        sectEightY = 3 + sectEightColumn * 300 / 30;

        fill(255);
        noStroke();
        rect(sectEightX, sectEightY, 5, 5);
      }

      eightCounterRow += 1;
    }
  }
}
