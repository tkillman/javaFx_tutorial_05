package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

//////// �ٵ��� ��� Container
// Gridpane

public class Main extends Application {
	@Override
	public void start(Stage stage) {
		
		///***********1111111111111111111111111111111111111111111
		/*	try {
			
			Label label1 = new Label();
			label1.setText("label1 �Դϴ�.");
			
			Label label2 = new Label();
			label2.setText("label2 �Դϴ�.");
			
			
			
			
			GridPane grid = new GridPane();
			grid.addRow(0, label1, label2);
			grid.setHgap(value);* Horizon 
			
			grid.addColumn(0, label1, label2);
			grid.setAlignment(Pos.CENTER);
			grid.setVgap(30); // ������ ������. Vertical
			
			//Scene
			Scene scene = new Scene(grid,400,400);
			
			
			//Stage
			stage.setScene(scene);
			stage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	*/
		/////***************8222222222222222222222222222222222222222222222222
	/*try {
		
		GridPane grid = new GridPane();
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				Label label = new Label();
				label.setText("("+i+","+j+")");
				grid.addRow(j, label);
			}
			
		}
		
		//Scene ����
		Scene scene = new Scene(grid);
		stage.setScene(scene);
		
		stage.show();
		
	} catch(Exception e) {
		e.printStackTrace();
	}
}
*/////////////*****************3333333333333333333333333333333
		//Gridpane�� add �޼ҵ�
		
		try {
		
		Label label1 = new Label("A");
		label1.setStyle("-fx-font-size:30; -fx-border-color:black;");
		Label label2 = new Label("B");
		label2.setStyle("-fx-font-size:30; -fx-border-color:black;");
		Label label3= new Label("C");
		label3.setStyle("-fx-font-size:30; -fx-border-color:black;");
		
		GridPane grid = new GridPane();
		grid.add(label1, 0, 0, 1, 1); // (node,�����÷�,���۷ο�,�����ϴ���,�����ϴ� ����)
		grid.add(label2, 0, 1, 1, 1);
		grid.add(label3, 1, 1, 1, 1);
		
		
		grid.setAlignment(Pos.CENTER);
		//Scene
		Scene scene = new Scene(grid,400,400);
		
		
		//Stage
		stage.setScene(scene);
		stage.show();
		
		
	} catch(Exception e) {
		e.printStackTrace();
	}
}

	public static void main(String[] args) {
		launch(args);
	}
}
