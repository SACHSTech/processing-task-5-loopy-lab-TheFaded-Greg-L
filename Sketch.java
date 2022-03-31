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

    int intSectTwoX = 0;
    int intSectTwoY = 0;

    for(int intSectTwoRow = 0; intSectTwoRow < 30; intSectTwoRow++){

      for(int intSectTwoColumn = 0; intSectTwoColumn < 30; intSectTwoColumn++){

        intSectTwoX = 3 + 300 + intSectTwoRow * 300 / 30;
        intSectTwoY = 3 + 300 + intSectTwoColumn * 300 / 30;

        if(intSectTwoRow % 2 == 0){

          fill(255);
          noStroke();
          rect(intSectTwoX, intSectTwoY, 5, 5);
        } else {

          fill(0);
          noStroke();
          rect(intSectTwoX, intSectTwoY, 5, 5);
        }
      }
    }
  }

  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */
  public void draw_section3(){

    int intSectThreeX = 0;
    int intSectThreeY = 0;

    for(int intSectThreeRow = 0; intSectThreeRow < 30; intSectThreeRow++){

      for(int intSectThreeColumn = 0; intSectThreeColumn < 30; intSectThreeColumn++){

        intSectThreeX = 3 + 600 + intSectThreeRow * 300 / 30;
        intSectThreeY = 3 + 300 + intSectThreeColumn * 300 / 30;

        if(intSectThreeColumn % 2 == 0){

          fill(0);
          noStroke();
          rect(intSectThreeX, intSectThreeY, 5, 5);
        } else {

          fill(255);
          noStroke();
          rect(intSectThreeX, intSectThreeY, 5, 5);
        }
      }
    }
  }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  public void draw_section4(){

    int intSectFourX = 0;
    int intSectFourY = 0;

    for(int intSectFourRow = 0; intSectFourRow < 30; intSectFourRow++){

      for(int intSectFourColumn = 0; intSectFourColumn < 30; intSectFourColumn++){

        intSectFourX = 3 + 900 + intSectFourRow * 300 / 30;
        intSectFourY = 3 + 300 + intSectFourColumn * 300 / 30;

        if(intSectFourColumn % 2 != 0 && intSectFourRow % 2 == 0){

          fill(255);
          noStroke();
          rect(intSectFourX, intSectFourY, 5, 5);
        } else {

          fill(0);
          noStroke();
          rect(intSectFourX, intSectFourY, 5, 5);
        }
      }
    }
  }

  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */
  public void draw_section5(){

    int intSectFiveX = 0;
    int intSectFiveY = 0;
    int intFiveCounterRow = 0;
    int intFiveCounterColumn = 0;

    for(int intSectFiveColumn = 30; intSectFiveColumn > intFiveCounterColumn; intSectFiveColumn--){

      for(int intSectFiveRow = 30; intSectFiveRow > intFiveCounterRow; intSectFiveRow--){

        intSectFiveX = 3 - 10 + intSectFiveRow * 300 / 30 ;
        intSectFiveY = 3 + intSectFiveColumn * 300 / 30;

        fill(255);
        noStroke();
        rect(intSectFiveX, intSectFiveY, 5, 5);
      }

      intFiveCounterRow += 1;
    }
  }

  public void draw_section6(){

    int intSectSixX = 0;
    int intSectSixY = 0;
    int intSixCounterRow = 30;
    int intSixCounterColumn = 0;

    for(int intSectSixColumn = 30; intSectSixColumn > intSixCounterColumn; intSectSixColumn--){

      for(int intSectSixRow = 0; intSectSixRow < intSixCounterRow; intSectSixRow++){

        intSectSixX = 3 + 300 + intSectSixRow * 300 / 30;
        intSectSixY = 3 - 10 + intSectSixColumn * 300 / 30;

        fill(255);
        noStroke();
        rect(intSectSixX, intSectSixY, 5, 5);
      }

      intSixCounterRow -= 1;
    }
  }

  public void draw_section7(){

    int intSectSevenX = 0;
    int intSectSevenY = 0;
    int intSevenCounterRow = 30;
    int intSevenCounterColumn = 30;

    for(int intSectSevenColumn = 0; intSectSevenColumn < intSevenCounterColumn; intSectSevenColumn++){

      for(int intSectSevenRow = 0; intSectSevenRow < intSevenCounterRow; intSectSevenRow++){

        intSectSevenX = 3 + 600 + intSectSevenRow * 300 / 30;
        intSectSevenY = 3 + intSectSevenColumn * 300 / 30;

        fill(255);
        noStroke();
        rect(intSectSevenX, intSectSevenY, 5, 5);
      }

      intSevenCounterRow -= 1;
    }
  }
  
  public void draw_section8(){

    int intSectEightX = 0;
    int intSectEightY = 0;
    int intEightCounterRow = 0;
    int intEightCounterColumn = 30;

    for(int intSectEightColumn = 0; intSectEightColumn < intEightCounterColumn; intSectEightColumn++){

      for(int intSectEightRow = 30; intSectEightRow > intEightCounterRow; intSectEightRow--){

        intSectEightX = 3 - 10 + 900 + intSectEightRow * 300 / 30;
        intSectEightY = 3 + intSectEightColumn * 300 / 30;

        fill(255);
        noStroke();
        rect(intSectEightX, intSectEightY, 5, 5);
      }

      intEightCounterRow += 1;
    }
  }
}
