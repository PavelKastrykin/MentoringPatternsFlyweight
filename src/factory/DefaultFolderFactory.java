package factory;

import folder.Folder;
import folder.FolderA;
import folder.FolderB;
import folder.FolderC;

import java.util.HashMap;
import java.util.Map;

public class DefaultFolderFactory implements FolderFactory {

	private Map<String, Folder> folderContainer = new HashMap<>();

	@Override
	public Folder getFolder(String folderNumber) {
		Folder folder = folderContainer.get(folderNumber);
		if (folder == null){
			switch (folderNumber){
				case "button1" : {
					folder = new FolderA();
					break;
				}
				case "button2" : {
					folder = new FolderB();
					break;
				}
				case "button3" : {
					folder = new FolderC();
					break;
				}
			}
			folderContainer.put(folderNumber, folder);
		}
		return folder;
	}
}
