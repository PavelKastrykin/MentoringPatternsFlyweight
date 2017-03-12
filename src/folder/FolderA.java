package folder;

public class FolderA implements Folder {

	@Override
	public String getFolderContent() {
		return "Content of FolderA:\n"
				+ "FolderA Item1\n"
				+ "FolderA Item2\n"
				+ "FolderA Item3";
	}
}
