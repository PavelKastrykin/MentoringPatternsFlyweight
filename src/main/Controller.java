package main;

import factory.DefaultFolderFactory;
import factory.FolderFactory;
import folder.Folder;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Controller {

	private FolderFactory factory = new DefaultFolderFactory();

	@FXML
	private TextArea folderContent;

	@FXML
	public void onClickMethod(Event event) {
		Button button = (Button) event.getTarget();
		Folder folder = factory.getFolder(button.getId());
		folderContent.setText(folder.getFolderContent());
	}
}
