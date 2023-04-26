/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnes;

import static fitnes.sorting.bubbleSort;
import static java.sql.JDBCType.NULL;
import static java.time.Clock.system;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Mohamed
 */
public class Fitnes extends Application implements EventHandler<ActionEvent> {

    Stage window;
    Scene scene1, scene2;
    TextField f11;
    TextField f2;
    TextField f3;
    TextField f4, f5, f6, res5;
    TextField s1, s2;
    TextArea eft;
    Button btn1, btn2, btn3, btn4, button, button1, button2;
    Label alert, alert1, alert2, alert3, instruct;

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        String act1 = null;
        Group g = new Group();
        Group g1 = new Group();

        Label l1 = new Label("  Activity 1:");
        g.getChildren().add(l1);
        l1.setPrefWidth(200);
        l1.setAlignment(Pos.TOP_LEFT);
        l1.setFont(Font.font("Tahoma", FontWeight.MEDIUM, 18));
        f11 = new TextField();
        g.getChildren().add(f11);
        f11.setPrefWidth(200);
        f11.setLayoutX(100);
        f11.setLayoutY(40);
        l1.setLayoutY(40);
        l1.setLayoutX(2);
        f11.setPromptText("ENTER ACTIVITY");

        Label l2 = new Label("      TIME:");
        g.getChildren().add(l2);
        l2.setPrefWidth(200);
        l2.setAlignment(Pos.TOP_LEFT);
        l2.setFont(Font.font("Tahoma", FontWeight.MEDIUM, 18));
        f2 = new TextField();
        g.getChildren().add(f2);
        f2.setPrefWidth(200);
        f2.setLayoutX(100);
        l2.setLayoutX(3);
        f2.setLayoutY(80);
        l2.setLayoutY(80);
        f2.setPromptText("ENTER time");

        btn1 = new Button("ADD");
        btn1.setPrefSize(100, 20);
        g.getChildren().add(btn1);
        btn1.setLayoutX(150);
        btn1.setLayoutY(150);
        btn1.setAlignment(Pos.CENTER);
        btn1.setOnAction(this);

        alert = new Label();
        g.getChildren().add(alert);
        alert.setLayoutX(80);
        alert.setLayoutY(120);

        Label l3 = new Label("  Activity 2:");
        g.getChildren().add(l3);
        l3.setPrefWidth(200);
        l3.setAlignment(Pos.TOP_LEFT);
        l3.setFont(Font.font("Tahoma", FontWeight.MEDIUM, 18));
        f3 = new TextField();
        g.getChildren().add(f3);
        f3.setPrefWidth(200);
        f3.setLayoutX(100);
        f3.setLayoutY(210);
        l3.setLayoutY(210);
        l3.setLayoutX(2);
        f3.setPromptText("ENTER ACTIVITY2");

        Label l4 = new Label("      TIME:");
        g.getChildren().add(l4);
        l4.setPrefWidth(200);
        l4.setAlignment(Pos.TOP_LEFT);
        l4.setFont(Font.font("Tahoma", FontWeight.MEDIUM, 18));
        f4 = new TextField();
        g.getChildren().add(f4);
        f4.setPrefWidth(200);
        f4.setLayoutX(100);
        l4.setLayoutX(2);
        f4.setLayoutY(250);
        l4.setLayoutY(250);
        f4.setPromptText("ENTER time 2");

        btn2 = new Button("ADD");
        btn2.setPrefSize(100, 20);
        g.getChildren().add(btn2);
        btn2.setLayoutX(150);
        btn2.setLayoutY(320);
        btn2.setAlignment(Pos.CENTER);
        btn2.setOnAction(this);

        alert1 = new Label();
        g.getChildren().add(alert1);
        alert1.setLayoutX(80);
        alert1.setLayoutY(290);

        Label l5 = new Label("Activity 3:");
        g.getChildren().add(l5);
        l5.setPrefWidth(200);
        l5.setAlignment(Pos.TOP_RIGHT);
        l5.setFont(Font.font("Tahoma", FontWeight.MEDIUM, 18));
        f5 = new TextField();
        g.getChildren().add(f5);
        f5.setPrefWidth(200);
        f5.setLayoutX(600);
        f5.setLayoutY(40);
        l5.setLayoutY(40);
        l5.setLayoutX(390);
        f5.setPromptText("ENTER ACTIVITY3");

        Label l6 = new Label("TIME:");
        g.getChildren().add(l6);
        l6.setPrefWidth(200);
        l6.setAlignment(Pos.TOP_RIGHT);
        l6.setFont(Font.font("Tahoma", FontWeight.MEDIUM, 18));
        f6 = new TextField();
        g.getChildren().add(f6);
        f6.setPrefWidth(200);
        f6.setLayoutX(600);
        l6.setLayoutX(390);
        f6.setLayoutY(80);
        l6.setLayoutY(80);
        f6.setPromptText("ENTER time 3");

        btn3 = new Button("ADD");
        btn3.setPrefSize(100, 20);
        g.getChildren().add(btn3);
        btn3.setLayoutX(650);
        btn3.setLayoutY(150);
        btn3.setAlignment(Pos.CENTER);
        btn3.setOnAction(this);

        alert2 = new Label();
        g.getChildren().add(alert2);
        alert2.setLayoutX(600);
        alert2.setLayoutY(120);

        Label l7 = new Label("Activity 4:");
        g.getChildren().add(l7);
        l7.setPrefWidth(200);
        l7.setAlignment(Pos.TOP_RIGHT);
        l7.setFont(Font.font("Tahoma", FontWeight.MEDIUM, 18));
        s1 = new TextField();
        g.getChildren().add(s1);
        s1.setPrefWidth(200);
        s1.setLayoutX(600);
        s1.setLayoutY(210);
        l7.setLayoutY(210);
        l7.setLayoutX(390);
        s1.setPromptText("ENTER ACTIVITY3");

        Label l8 = new Label("TIME:");
        g.getChildren().add(l8);
        l8.setPrefWidth(200);
        l8.setAlignment(Pos.TOP_RIGHT);
        l8.setFont(Font.font("Tahoma", FontWeight.MEDIUM, 18));
        s2 = new TextField();
        g.getChildren().add(s2);
        s2.setPrefWidth(200);
        s2.setLayoutX(600);
        l8.setLayoutX(390);
        s2.setLayoutY(250);
        l8.setLayoutY(250);
        s2.setPromptText("ENTER time 3");

        btn4 = new Button("ADD");
        btn4.setPrefSize(100, 20);
        g.getChildren().add(btn4);
        btn4.setLayoutX(650);
        btn4.setLayoutY(320);
        btn4.setAlignment(Pos.CENTER);
        btn4.setOnAction(this);

        alert3 = new Label();
        g.getChildren().add(alert3);
        alert3.setLayoutX(600);
        alert3.setLayoutY(290);

        button = new Button("GET RESULTS");
        button.setPrefSize(250, 20);
        g.getChildren().add(button);
        button.setLayoutX(280);
        button.setLayoutY(400);
        button.setAlignment(Pos.CENTER);

        button.setOnAction(e -> ressult.display(view, vie));

        button1 = new Button("RANKING");
        button1.setPrefSize(250, 20);
        g.getChildren().add(button1);
        button1.setLayoutX(280);
        button1.setLayoutY(450);
        button1.setAlignment(Pos.CENTER);
        button1.setOnAction(this);

        button2 = new Button("<-previous");
        button2.setPrefSize(150, 20);
        g1.getChildren().add(button2);
        button2.setLayoutX(120);
        button2.setLayoutY(300);
        button2.setAlignment(Pos.CENTER);
        button2.setOnAction(e -> window.setScene(scene1));

        eft = new TextArea();
        eft.setPrefSize(250, 200);
        g1.getChildren().add(eft);

        eft.setLayoutX(80);
        eft.setLayoutY(50);

        instruct = new Label("*PLEASE enter the activity and the time in the textfieds and then PRESS 'ADD'.\n*MAKE SURE 'ACTIVITY RECORDED SUCCESSFULLY!' message has appeared after pressing 'ADD'.\n*IF you want to get total calories and total heartrate PLEASE PRESS 'GET RESULT'.\n*IF you want to get the ranking PLEASE PRESS 'RANKING'.\n*IF you want to ADD the same activity with new time you can RE-ENTER the time then PRESS 'ADD'.\n*YOU CAN PRESS ADD multiple number of times to upload the total calories.");
        g.getChildren().add(instruct);
        instruct.setLayoutX(200);
        instruct.setLayoutY(500);

        scene2 = new Scene(g1, 400, 400);
        scene1 = new Scene(g, 900, 700);

        scene1.setFill(Color.DIMGRAY);
        scene2.setFill(Color.DIMGRAY);

        window.setScene(scene1);
        window.setTitle("FITNESS TRACKER");
        window.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);

    }
    int view;
    double vie=80.0;
    int swimming1 = 0;
    int running = 0;
    int kick_boxing = 0;
    int strength_training = 0;

    @Override
    public void handle(ActionEvent t) {
        NewClass activity = new NewClass();

        String string1 = "SWIMMING";
        String string2 = "RUNNING";
        String string3 = "KICKBOXING";
        String string4 = "STRENGTHTRAINING";

        if (t.getSource() == btn1) {
            alert.setText("ACTIVITY RECORDED SUCCESSFULLY!");
            activity.setCALORIES_BURNT(view);

            String act1 = f11.getText();
            int time;
            time = Integer.parseInt(f2.getText());
           
             activity.setHEART_RATE(vie);
            if (string1.equalsIgnoreCase(act1)) {

                activity.caloryburn(4, time);
                view = activity.getCALORIES_BURNT();

                activity.setCALORIES_BURNT(view);

                activity.heratratecalc(0.002, time);

                vie = activity.getHEART_RATE();
                activity.setHEART_RATE(vie);

              
                activity.setSwimming(swimming1 + 4 * time);
                swimming1 = activity.getSwimming();

            } else if (string2.equalsIgnoreCase(act1)) {
                activity.caloryburn(5, time);
                view = activity.getCALORIES_BURNT();

                activity.heratratecalc(0.003, time);
                vie = activity.getHEART_RATE();
                activity.setRunning(running + 5 * time);
                running = activity.getRunning();

            } else if (string3.replaceAll("\\s+","").equalsIgnoreCase(act1.replaceAll("\\s+",""))) {
                activity.caloryburn(3, time);
                view = activity.getCALORIES_BURNT();

                activity.heratratecalc(0.005, time);
                vie = activity.getHEART_RATE();
                activity.setKick_boxing(kick_boxing + 3 * time);
                kick_boxing = activity.getKick_boxing();

            } else if (string4.replaceAll("\\s+","").equalsIgnoreCase(act1.replaceAll("\\s+",""))) {
                activity.caloryburn(5, time);
                view = activity.getCALORIES_BURNT();

                activity.heratratecalc(0.006, time);
                vie = activity.getHEART_RATE();
                activity.setStrength_training(strength_training + 5 * time);
                strength_training = activity.getStrength_training();

            }
            activity.setHEART_RATE(vie);
        }
        activity.setCALORIES_BURNT(view);
activity.setHEART_RATE(vie);

        if (t.getSource() == btn2) {
            alert1.setText("ACTIVITY RECORDED SUCCESSFULLY!");
            view = activity.getCALORIES_BURNT();
            vie = activity.getHEART_RATE();
            String act2 = f3.getText();
            int time2;
            time2 = Integer.parseInt(f4.getText());

            if (string1.replaceAll("\\s+","").equalsIgnoreCase(act2.replaceAll("\\s+",""))) {

                activity.caloryburn(4, time2);
                view = activity.getCALORIES_BURNT();

                activity.setCALORIES_BURNT(view);
                activity.heratratecalc(0.002, time2);
                vie = activity.getHEART_RATE();

                activity.setHEART_RATE(vie);
                activity.setSwimming(swimming1 + 4 * time2);
                swimming1 = activity.getSwimming();

            } else if (string2.equalsIgnoreCase(act2)) {
                activity.caloryburn(5, time2);
                view = activity.getCALORIES_BURNT();

                activity.heratratecalc(0.003, time2);
                vie = activity.getHEART_RATE();
                activity.setRunning(running + 5 * time2);
                running = activity.getRunning();

            } else if (string3.replaceAll("\\s+","").equalsIgnoreCase(act2.replaceAll("\\s+",""))) {
                activity.caloryburn(3, time2);
                view = activity.getCALORIES_BURNT();

                activity.heratratecalc(0.005, time2);
                vie = activity.getHEART_RATE();
                activity.setKick_boxing(kick_boxing + 3 * time2);
                kick_boxing = activity.getKick_boxing();

            } else if (string4.replaceAll("\\s+","").equalsIgnoreCase(act2.replaceAll("\\s+",""))) {
                activity.caloryburn(5, time2);
                view = activity.getCALORIES_BURNT();

                activity.heratratecalc(0.006, time2);
                vie = activity.getHEART_RATE();
                activity.setStrength_training(strength_training + 5 * time2);
                strength_training = activity.getStrength_training();

            }
            activity.setHEART_RATE(vie);

        }
        activity.setCALORIES_BURNT(view);
       activity.setHEART_RATE(vie);

        if (t.getSource() == btn3) {
            alert2.setText("ACTIVITY RECORDED SUCCESSFULLY!");
            String act3 = f5.getText();
            int time3;
            time3 = Integer.parseInt(f6.getText());

            if (string1.equalsIgnoreCase(act3)) {

                activity.caloryburn(4, time3);
                view = activity.getCALORIES_BURNT();

                activity.setCALORIES_BURNT(view);
                activity.heratratecalc(0.002, time3);
                vie = activity.getHEART_RATE();

                activity.setHEART_RATE(vie);
                activity.setSwimming(swimming1 + 4 * time3);
                swimming1 = activity.getSwimming();

            } else if (string2.equalsIgnoreCase(act3)) {
                activity.caloryburn(5, time3);
                view = activity.getCALORIES_BURNT();

                activity.heratratecalc(0.003, time3);
                vie = activity.getHEART_RATE();
                activity.setRunning(running + 5 * time3);
                running = activity.getRunning();

            } else if (string3.replaceAll("\\s+","").equalsIgnoreCase(act3.replaceAll("\\s+",""))) {
                activity.caloryburn(3, time3);
                view = activity.getCALORIES_BURNT();

                activity.heratratecalc(0.005, time3);
                vie = activity.getHEART_RATE();
                activity.setKick_boxing(kick_boxing + 3 * time3);
                kick_boxing = activity.getKick_boxing();

            } else if (string4.replaceAll("\\s+","").equalsIgnoreCase(act3.replaceAll("\\s+",""))) {
                activity.caloryburn(5, time3);
                view = activity.getCALORIES_BURNT();

                activity.heratratecalc(0.006, time3);
                vie = activity.getHEART_RATE();
                activity.setStrength_training(strength_training + 5 * time3);
                strength_training = activity.getStrength_training();

            }
            activity.setHEART_RATE(vie);

        }
        activity.setCALORIES_BURNT(view);
        activity.setHEART_RATE(vie);

        if (t.getSource() == btn4) {
            alert3.setText("ACTIVITY RECORDED SUCCESSFULLY!");
            String act4 = s1.getText();
            int time4;
            time4 = Integer.parseInt(s2.getText());

            if (string1.equalsIgnoreCase(act4)) {

                activity.caloryburn(4, time4);
                view = activity.getCALORIES_BURNT();

                activity.setCALORIES_BURNT(view);
                activity.heratratecalc(0.002, time4);
                vie = activity.getHEART_RATE();

                activity.setHEART_RATE(vie);
                activity.setSwimming(swimming1 + 4 * time4);
                swimming1 = activity.getSwimming();

            } else if (string2.equalsIgnoreCase(act4)) {
                activity.caloryburn(5, time4);
                view = activity.getCALORIES_BURNT();

                activity.heratratecalc(0.003, time4);
                vie = activity.getHEART_RATE();
                activity.setRunning(running + 5 * time4);
                running = activity.getRunning();

            } else if (string3.replaceAll("\\s+","").equalsIgnoreCase(act4.replaceAll("\\s+",""))) {
                activity.caloryburn(3, time4);
                view = activity.getCALORIES_BURNT();

                activity.heratratecalc(0.005, time4);
                vie = activity.getHEART_RATE();
                activity.setKick_boxing(kick_boxing + 3 * time4);
                kick_boxing = activity.getKick_boxing();

            } else if (string4.replaceAll("\\s+","").equalsIgnoreCase(act4.replaceAll("\\s+",""))) {
          
                activity.caloryburn(5, time4);
                view = activity.getCALORIES_BURNT();

                activity.heratratecalc(0.006, time4);
                vie = activity.getHEART_RATE();
                activity.setStrength_training(strength_training + 5 * time4);
                strength_training = activity.getStrength_training();
            }
            activity.setHEART_RATE(vie);
        }
        activity.setCALORIES_BURNT(view);
        activity.setHEART_RATE(vie);
        if (t.getSource() == button1) {

            int arr[] = {swimming1, running, strength_training, kick_boxing};

            bubbleSort(arr); 
            for (int i = 0; i < arr.length; i++) {

                if (arr[i] == swimming1) {
                    eft.appendText("        SWIMMING: " + arr[i] + " calories\n");
                } else if (arr[i] == running) {
                    eft.appendText("        RUNNING: " + arr[i] + " calories\n");
                } else if (arr[i] == kick_boxing) {
                    eft.appendText("        KICK BOXING: " + arr[i] + " calories\n");
                } else if (arr[i] == strength_training) {
                    eft.appendText("      STRENGTH TRAINING: " + arr[i] + " calories\n");
                }

            }
            eft.appendText("       ----------------------     \n");
            window.setScene(scene2);
        }

    }

    private String act4replaceAll(String s, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
