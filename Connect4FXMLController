package connect4project;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * FXML Controller class
 *
 * @author Austin1022
 */
public class Connect4FXMLController implements Initializable {

    @FXML
    private Button col1But;
    @FXML
    private Button col2But;
    @FXML
    private Button col3But;
    @FXML
    private Button col4BBut;
    @FXML
    private Button col5But;
    @FXML
    private Button col6But;
    @FXML
    private Button col7But;
    @FXML
    private Circle circleC1R6;
    @FXML
    private Circle circleC1R5;
    @FXML
    private Circle circleC1R4;
    @FXML
    private Circle circleC1R3;
    @FXML
    private Circle circleC1R2;
    @FXML
    private Circle circleC1R1;
    @FXML
    private Circle circleC2R1;
    @FXML
    private Circle circleC2R2;
    @FXML
    private Circle circleC2R3;
    @FXML
    private Circle circleC2R4;
    @FXML
    private Circle circleC2R5;
    @FXML
    private Circle circleC2R6;
    @FXML
    private Circle circleC3R1;
    @FXML
    private Circle circleC3R2;
    @FXML
    private Circle circleC3R3;
    @FXML
    private Circle circleC3R4;
    @FXML
    private Circle circleC3R5;
    @FXML
    private Circle circleC3R6;
    @FXML
    private Circle circleC4R1;
    @FXML
    private Circle circleC4R2;
    @FXML
    private Circle circleC4R3;
    @FXML
    private Circle circleC4R4;
    @FXML
    private Circle circleC4R5;
    @FXML
    private Circle circleC4R6;
    @FXML
    private Circle circleC5R1;
    @FXML
    private Circle circleC5R2;
    @FXML
    private Circle circleC5R3;
    @FXML
    private Circle circleC5R4;
    @FXML
    private Circle circleC5R5;
    @FXML
    private Circle circleC5R6;
    @FXML
    private Circle circleC6R1;
    @FXML
    private Circle circleC6R2;
    @FXML
    private Circle circleC6R3;
    @FXML
    private Circle circleC6R4;
    @FXML
    private Circle circleC6R5;
    @FXML
    private Circle circleC6R6;
    @FXML
    private Circle circleC7R1;
    @FXML
    private Circle circleC7R2;
    @FXML
    private Circle circleC7R3;
    @FXML
    private Circle circleC7R4;
    @FXML
    private Circle circleC7R5;
    @FXML
    private Circle circleC7R6;

    private static final int COLUMNS = 7;
    private static final int ROWS = 6;
    
    public Circle[][] circleGrid = new Circle[ROWS][COLUMNS];//circle array - contains circles from scene builder
    public int[][] discGrid = new int[ROWS][COLUMNS];//int array - contains position of players action
    
    public int player = 1;//starts at player 1
    
    public int counterC1 = 5;//Counters to insert in last row within array
    public int counterC2 = 5;
    public int counterC3 = 5;
    public int counterC4 = 5;
    public int counterC5 = 5;
    public int counterC6 = 5;
    public int counterC7 = 5;
    @FXML
    private Label theLabel;//label that announces winner
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        circleGrid[0][0] = circleC1R1;//Assign circles to Column 1
        circleGrid[1][0] = circleC1R2;
        circleGrid[2][0] = circleC1R3;
        circleGrid[3][0] = circleC1R4;
        circleGrid[4][0] = circleC1R5;
        circleGrid[5][0] = circleC1R6;
        
        circleGrid[0][1] = circleC2R1;//Assign circles to column 2
        circleGrid[1][1] = circleC2R2;
        circleGrid[2][1] = circleC2R3;
        circleGrid[3][1] = circleC2R4;
        circleGrid[4][1] = circleC2R5;
        circleGrid[5][1] = circleC2R6;
        
        circleGrid[0][2] = circleC3R1;//Assign circles to column 3
        circleGrid[1][2] = circleC3R2;
        circleGrid[2][2] = circleC3R3;
        circleGrid[3][2] = circleC3R4;
        circleGrid[4][2] = circleC3R5;
        circleGrid[5][2] = circleC3R6;
         
        circleGrid[0][3] = circleC4R1;//Assign circles to column 4
        circleGrid[1][3] = circleC4R2;
        circleGrid[2][3] = circleC4R3;
        circleGrid[3][3] = circleC4R4;
        circleGrid[4][3] = circleC4R5;
        circleGrid[5][3] = circleC4R6;
        
        circleGrid[0][4] = circleC5R1;//Assign circles to column 5
        circleGrid[1][4] = circleC5R2;
        circleGrid[2][4] = circleC5R3;
        circleGrid[3][4] = circleC5R4;
        circleGrid[4][4] = circleC5R5;
        circleGrid[5][4] = circleC5R6;
        
        circleGrid[0][5] = circleC6R1;//Assign circles to column 6
        circleGrid[1][5] = circleC6R2;
        circleGrid[2][5] = circleC6R3;
        circleGrid[3][5] = circleC6R4;
        circleGrid[4][5] = circleC6R5;
        circleGrid[5][5] = circleC6R6;
        
        circleGrid[0][6] = circleC7R1;//Assign circles to column 7
        circleGrid[1][6] = circleC7R2;
        circleGrid[2][6] = circleC7R3;
        circleGrid[3][6] = circleC7R4;
        circleGrid[4][6] = circleC7R5;
        circleGrid[5][6] = circleC7R6;
        
        for(int i = 0; i < ROWS; i++)//sets array values all to zero - keeps track of player within int array
            for(int j = 0; j < COLUMNS; j++){
                
                discGrid[i][j] = 0;
                
            }
    }    

    @FXML
    private void column1Insert(ActionEvent event) {
      
        
        
      if(getWinner() == 0){//if there is no winner
          
         if(player == 1 && discGrid[counterC1][0] == 0 && counterC1 >= 0){//player one inserts circle
                 
          discGrid[counterC1][0] = player;//keeps track of playerss chosen position with grid
          circleGrid[counterC1][0].setFill(Color.RED);//sets player one circles to red
          player = player==1?2:1;//switches to player 2
          
          if(counterC1 > 0){
          counterC1--;//decrease counter
          }
          
         if(getWinner() == -1){
             
             theLabel.setText("TIE");//announces if there is a tie
             
         }
          
         else if(getWinner() != 0){
             
              theLabel.setText("Winner is Player "+getWinner());//anounces winner
              
            }
         
        }
         
        else if(player == 2 && discGrid[counterC1][0] == 0 && counterC1 >= 0){
            
          discGrid[counterC1][0] = player;//keeps track of player 2 position within grid
          circleGrid[counterC1][0].setFill(Color.BLACK);//sets circle color to black for player 2
          player = player==2?1:2;//switches back to player 1
          
          if (counterC1 > 0) {
          counterC1--;//decrease counter
          }
          
          if(getWinner() == -1){//announces tie
             
             theLabel.setText("TIE");
             
            }
          
          else if(getWinner() != 0){//anounces winner
             
              theLabel.setText("Winner is Player "+getWinner());
              
            }
           
         }
        
      }
      
      else{//announces winner
          
          theLabel.setText("Winner is Player "+getWinner());//announces winner
          
      }
        
    }

    @FXML
    private void column2Insert(ActionEvent event) {
        
      if(getWinner() == 0){//allows insertion of disc because when no winner
            
        if(player == 1 && discGrid[counterC2][1] == 0){//player 1
          discGrid[counterC2][1] = player;//keeps track of player position
          circleGrid[counterC2][1].setFill(Color.RED);//sets red circle for player 1
          player = player==1?2:1;//switches player
          
          if(counterC2 > 0){
          counterC2--;//decrease counter
          }
          
          if(getWinner() == -1){//announces tie
             
             theLabel.setText("TIE");
             
         }
          
          else if(getWinner() != 0){//announces winner
             
              theLabel.setText("Winner is Player "+getWinner());
              
            }
           
        }
        else if(player == 2 && discGrid[counterC2][1] ==0){
            discGrid[counterC2][1] = player;//tracks player position
            circleGrid[counterC2][1].setFill(Color.BLACK);//sets circle for player 2
            player = player==2?1:2;//switches players
            
            if(counterC2 > 0){
            counterC2--;//decrease counter
            }
            
            if(getWinner() == -1){//announces tie
             
             theLabel.setText("TIE");
             
         }
            
            else if(getWinner() != 0){//announces winner
             
              theLabel.setText("Winner is Player "+getWinner());
              
            }
             
        }
       
        
      }
      
      else{
          
          theLabel.setText("Winner is Player "+getWinner());//announces winner
      }
        
    }

    @FXML
    private void column3Insert(ActionEvent event) {
        
      if(getWinner() == 0){//when there is not winner yet
        if(player == 1 && discGrid[counterC3][2] == 0){//player one insertion
             discGrid[counterC3][2] = player;//tracks player 1 position
            circleGrid[counterC3][2].setFill(Color.RED);//sets circle to red for player 1
             player = player==1?2:1;//switches player
             
             if(counterC3 > 0){
            counterC3--;//decrease counter
             }
            
            if(getWinner() == -1){//announces tie
             
             theLabel.setText("TIE");
             
         }
            
            else if(getWinner() != 0){//announces winner
             
              theLabel.setText("Winner is Player "+getWinner());
              
            }
             
        }
        else if(player == 2 && discGrid[counterC3][2] ==0){//player 2 insertion
            discGrid[counterC3][2] = player;//track player position
            circleGrid[counterC3][2].setFill(Color.BLACK);//sets circle black for player 2
            player = player==2?1:2;//switches player
            
            if(counterC3 > 0){
            counterC3--;//decrease counter
            }
            
             if(getWinner() != 0){//announces tie
             
              theLabel.setText("Winner is Player "+getWinner());
              
            }
             
        }
       
        
      }
      else{//announces winner
          
          theLabel.setText("Winner is Player "+getWinner());
      }
       
    }

    @FXML
    private void column4Insert(ActionEvent event) {
        
      if(getWinner() == 0){//if there is no winner found yet
        if(player == 1 && discGrid[counterC4][3] == 0){//player 1 insertion
             discGrid[counterC4][3] = player;//tracks player position
            circleGrid[counterC4][3].setFill(Color.RED);//sets circle red for player 1
             player = player==1?2:1;//switches player
             
             if(counterC4 > 0){
            counterC4--;//decrease counter
             }
            
            if(getWinner() == -1){//announces tie
             
             theLabel.setText("TIE");
             
         }
            
            else if(getWinner() != 0){//announces winner
             
              theLabel.setText("Winner is Player "+getWinner());
              
            }
             
         }
        
        else if(player == 2 && discGrid[counterC4][3] ==0){//player 2 insertion
            discGrid[counterC4][3] = player;//tracks player position
            circleGrid[counterC4][3].setFill(Color.BLACK);//sets black circle for player 2
            player = player==2?1:2;//switches player
            
            if(counterC4 > 0){
            counterC4--;//decrease counter
            }
            
            if(getWinner() == -1){//announces tie
             
             theLabel.setText("TIE");
             
         }
            
            else  if(getWinner() != 0){//announces winner
             
              theLabel.setText("Winner is Player "+getWinner());
              
            }
             
        }
        
       
      }
      
      else{//announces winner
          
          theLabel.setText("Winner is Player "+getWinner());
      }
       
    }

    @FXML
    private void column5Insert(ActionEvent event) {
        
      if(getWinner() == 0){//When there is no winner
          
        if(player == 1 && discGrid[counterC5][4] == 0){//player 1 insertion
            discGrid[counterC5][4] = player;//tracks player position
            circleGrid[counterC5][4].setFill(Color.RED);//sets circle to red for player 1
            player = player==1?2:1;//switches players
            
            if(counterC5 > 0){
            counterC5--;//decreases counter
            }
            
            if(getWinner() == -1){//announces winner
             
             theLabel.setText("TIE");
             
         }
            
            else if(getWinner() != 0){//announces winner
             
              theLabel.setText("Winner is Player "+getWinner());
              
            }
             
        }
        
        else if(player == 2 && discGrid[counterC5][4] ==0){//player 2 insertion
            discGrid[counterC5][4] = player;//tracks player position
            circleGrid[counterC5][4].setFill(Color.BLACK);//sets circle black for player
            player = player==2?1:2;//switch player
            
            if(counterC5 > 0){
            counterC5--;//decrease counter
            }
            
            if(getWinner() == -1){//announces that there is a tie
             
             theLabel.setText("TIE");//sets label
             
         }
            
            else if(getWinner() != 0){//announces winner 
             
              theLabel.setText("Winner is Player "+getWinner());//sets label
              
            }
             
        }
        
      }
      
      else{
          
          theLabel.setText("Winner is Player "+getWinner());//announces winnter
      }
        
    }

    @FXML
    private void column6Insert(ActionEvent event) {
        
      if(getWinner() == 0){//when there is not a winner
          
        if(player == 1 && discGrid[counterC6][5] == 0){//player 1 insertion
             discGrid[counterC6][5] = player;//tracks player position
            circleGrid[counterC6][5].setFill(Color.RED);//sets circle red for player 1
            player = player==1?2:1;//switches player
            
            if(counterC6 > 0){
            counterC6--;//decrease counter
            }
            
            if(getWinner() == -1){//announces tie
             
             theLabel.setText("TIE");
             
         }
            
            else if(getWinner() != 0){//announces winner
             
              theLabel.setText("Winner is Player "+getWinner());
              
            }
             
         }
        else if(player == 2 && discGrid[counterC6][5] ==0){//player 2 insertion
            discGrid[counterC6][5] = player;//tracks player position
            circleGrid[counterC6][5].setFill(Color.BLACK);//sets circle black for player 2
            player = player==2?1:2;//switch player
            
            if(counterC6 > 0){
            counterC6--;//decrease counter
            }
            
            if(getWinner() == -1){//announces tie
             
             theLabel.setText("TIE");
             
         }
            
            else if(getWinner() != 0){//announces winner
             
              theLabel.setText("Winner is Player "+getWinner());
              
            }
             
        }
         
        
       }
      
        else{//announces winner/stops further insertion after winner found
          
          theLabel.setText("Winner is Player "+getWinner());
        }
        
    }

    @FXML
    private void column7Insert(ActionEvent event) {
        
      if(getWinner() == 0){
          
         if(player == 1 && discGrid[counterC7][6] == 0){//player 1 insertion
              discGrid[counterC7][6] = player;//tracks player position
            circleGrid[counterC7][6].setFill(Color.RED);//sets circle red for player 1
            player = player==1?2:1;//switches player
            
            if(counterC7 > 0){
            counterC7--;//decrease counter
            }
            
            if(getWinner() == -1){//announces tie
             
             theLabel.setText("TIE");
             
         }
            
            else if(getWinner() != 0){//announcess winner
             
              theLabel.setText("Winner is Player "+getWinner());
              
            }
             
        }
         
        else if(player == 2 && discGrid[counterC7][6] ==0){//player 2 insertion
            discGrid[counterC7][6] = player;//tracks player position
            circleGrid[counterC7][6].setFill(Color.BLACK);//sets circle black for player 2
            player = player==2?1:2;//switch player
            
            if(counterC7 > 0){
            counterC7--;//decrease counter
            }
            
            if(getWinner() == -1){//announces tie
             
             theLabel.setText("TIE");
             
         }
            
            else if(getWinner() != 0){//announces winner
             
              theLabel.setText("Winner is Player "+getWinner());
              
            }
             
         }
        
        
      }
      
      else{//announces winner
          
          theLabel.setText("Winner is Player "+getWinner());
      }
        
    }
    
    public int getWinner(){//gathers the winn by calculating the players position within the discGrid
        
        for(int i = 0; i < ROWS; i++){//checks the rows for winner
            for(int j = 0; j < COLUMNS; j++){
                
                if(position(i,j) != 0 && position(i,j) == position(i,j+1) && position(i,j) == position(i,j+2) && position(i,j) == position(i,j+3)){//checks for row win
                    return position(i,j);
                }
                
            }
        }
        
         for(int i = 0; i < ROWS; i++){//Checks columns for winner
            for(int j = 0; j < COLUMNS; j++){
                
                if(position(i,j) != 0 && position(i,j) == position(i+1,j) && position(i,j) == position(i+2,j) && position(i,j) == position(i+3,j)){//checks for column win
                    return position(i,j);
                }
                
            }
        }
         
          for(int i = 0; i < ROWS; i++){//Checks diagonally for winner
            for(int j = 0; j < COLUMNS; j++){
                for(int d=-1;d<=1;d+=2){
                    
                    if(position(i,j) != 0 && position(i,j) == position(i+1*d,j+1)&& position(i,j) == position(i+2*d,j+2)&& position(i,j) == position(i+3*d,j+3)){
                        return position(i,j);
                    }
                
              
                }
                
            }
        }
          
          for(int i = 0; i < ROWS; i++){//returns this when there is no winner yet
            for(int j = 0; j < COLUMNS; j++){
                
                if(position(i,j)== 0){
                    return 0;
                }
                
            }
        }
        
        return -1;//tie
    }
    
    public int position(int Row, int Col){//returns the position of the player that was gather within the discGrid
        
        return (Row<0||Col<0||Row>=ROWS||Col>=COLUMNS)?0:discGrid[Row][Col];
        
    }
   
    
    
    
}
