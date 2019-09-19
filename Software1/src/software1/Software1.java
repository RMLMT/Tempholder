
package software1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

/**
 *
 * @author Ryan Middleton
 */
public class Software1 extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        AnchorPane page = null;
           try {
            FXMLLoader loader = new FXMLLoader(Software1.class.getResource("Parts.fxml"));
        page = (AnchorPane) loader.load();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        };
        
        Button btn = new Button();
        AnchorPane.setTopAnchor(btn, 300.0);
        btn.setText("Add");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
         Button btn1 = new Button();
         AnchorPane.setLeftAnchor(btn1, 40.0);
         AnchorPane.setTopAnchor(btn1, 300.0);
        btn1.setText("Modify");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
         Button btn2 = new Button();
         AnchorPane.setLeftAnchor(btn2, 95.0);
         AnchorPane.setTopAnchor(btn2, 300.0);
        btn2.setText("Delete");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        Button btn3 = new Button();
         AnchorPane.setLeftAnchor(btn3, 195.0);
         AnchorPane.setTopAnchor(btn3, 300.0);
        btn3.setText("Add");
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        Button btn4 = new Button();
         AnchorPane.setLeftAnchor(btn4, 235.0);
         AnchorPane.setTopAnchor(btn4, 300.0);
        btn4.setText("Modify");
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        Button btn5 = new Button();
         AnchorPane.setLeftAnchor(btn5, 290.0);
         AnchorPane.setTopAnchor(btn5, 300.0);
        btn5.setText("Delete");
        btn5.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
      
        
        
        AnchorPane root = new AnchorPane();
        root.getChildren().add(btn);
        root.getChildren().add(btn1);
        root.getChildren().add(btn2);
        root.getChildren().add(btn3);
        root.getChildren().add(btn4);
        root.getChildren().add(btn5);
        root.getChildren().add(page);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Parts");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
     
  

 
    public static void main(String[] args) {
        launch(args);
        
    }
    
}
