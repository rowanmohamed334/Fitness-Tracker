/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnes;

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
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Mohamed
 */
public class ressult {

    public static void display(int c, double h) {
        Stage window = new Stage();
        Scene scene2;
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("result");

        Group g1 = new Group();

        TextField res1, res2;
        Label res = new Label("TOTAL CALORIES:");
        g1.getChildren().add(res);
        res.setPrefWidth(200);
        res.setAlignment(Pos.CENTER);
        res.setFont(Font.font("Tahoma", FontWeight.MEDIUM, 18));
        res1 = new TextField();
        g1.getChildren().add(res1);
        res1.setPrefWidth(200);
        res1.setLayoutX(190);
        res.setLayoutX(2);
        res1.setLayoutY(120);
        res.setLayoutY(120);

        Label result = new Label("TOTAL HEARTRATE :");
        g1.getChildren().add(result);
        result.setPrefWidth(200);
        result.setAlignment(Pos.CENTER);
        result.setFont(Font.font("Tahoma", FontWeight.MEDIUM, 18));
        res2 = new TextField();
        g1.getChildren().add(res2);
        res2.setPrefWidth(200);
        res2.setLayoutX(190);
        result.setLayoutX(2);
        res2.setLayoutY(190);
        result.setLayoutY(190);

        Button button1 = new Button("CLOSE");
        button1.setPrefSize(150, 20);
        g1.getChildren().add(button1);
        button1.setLayoutX(150);
        button1.setLayoutY(300);
        button1.setAlignment(Pos.CENTER);
        button1.setOnAction(e -> window.close());

        String re = Integer.toString(c);
        res1.setText(re);
        String re1 = Double.toString(h);
        res2.setText(re1);

        scene2 = new Scene(g1, 500, 500);
        scene2.setFill(Color.DIMGRAY);
        window.setScene(scene2);
        window.setTitle("FITNESS TRACKER");
        window.showAndWait();
    }

}
