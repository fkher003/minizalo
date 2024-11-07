
module miniZalofull {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens client to javafx.graphics, javafx.fxml;
}
