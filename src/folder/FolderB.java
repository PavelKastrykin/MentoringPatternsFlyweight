package folder;

public class FolderB implements Folder {

	@Override
	public String getFolderContent() {
		return "Content of FolderB: \n"
				+ "FolderB Item1\n"
				+ "FolderB Item2\n"
				+ "FolderB Item3";
	}
}
