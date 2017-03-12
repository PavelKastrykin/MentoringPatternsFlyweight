package folder;

public class FolderC implements Folder {

	@Override
	public String getFolderContent() {
		System.out.println("FolderC");
		return "Content of FolderC: \n"
				+ "FolderC Item1\n"
				+ "FolderC Item2\n"
				+ "FolderC Item3";
	}
}
