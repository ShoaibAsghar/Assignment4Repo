module Assignment4 {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.xml;
	requires jdk.hotspot.agent;
	
	opens application to javafx.graphics, javafx.fxml;
}
