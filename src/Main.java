import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    private int kesklinnCount = 0;
    private int mustaCount = 0;
    private int paldiskiCount = 0;
    private int tabasaluCount = 0;
    private int totalCount = 0;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);
        Scene scene = new Scene(grid, 400, 400);

        Label kesklinn = new Label("Kesklinn: " + kesklinnCount);
        grid.add(kesklinn, 0, 0);

        Label musta = new Label("Mustamae: " + mustaCount);
        grid.add(musta, 0, 1);

        Label paldiski = new Label("Paldiski: " + paldiskiCount);
        grid.add(paldiski, 0, 2);

        Label tabasalu = new Label("Tabasalu: " + tabasaluCount);
        grid.add(tabasalu, 0, 3);

        Label total = new Label("Total cars: 0");
        grid.add(total, 0, 4);

        Label legend = new Label("Use arrows to count: Up-Kesklinn, Down-Musta, Left-Paldiski, Right-Tabasalu");
        legend.setWrapText(true);
        grid.add(legend, 0,5);
        


        primaryStage.setTitle("Crossroad");
        primaryStage.setScene(scene);
        primaryStage.show();

        scene.setOnKeyPressed(event -> {
            if(event.getCode()==KeyCode.UP){
                kesklinnCount++;
                totalCount++;
                kesklinn.setText("Kesklinn: "+kesklinnCount++);
                total.setText("Total: " + totalCount++);
            }else if (event.getCode()==KeyCode.DOWN){
                mustaCount++;
                totalCount++;
                musta.setText("Mustamae: "+mustaCount);
                total.setText("Total: " + totalCount);
            }else if (event.getCode()==KeyCode.LEFT){
                paldiskiCount++;
                totalCount++;
                paldiski.setText("Paldiski: "+ paldiskiCount);
                total.setText("Total: " + totalCount);
            }else if(event.getCode()==KeyCode.RIGHT){
                tabasaluCount++;
                totalCount++;
                tabasalu.setText("Tabasalu: "+tabasaluCount);
                total.setText("Total: " + totalCount);
            }
        });



    }
}
