package api.features;

import api.model.Author;
import api.model.BoardGame;
import api.model.Extension;

public interface BoardGameFeat {

	// BoardGame features
	public BoardGame createBoardGame(String name);
	public Extension createExtensionFor( long id );
	public Author createAuthor(String firstName, String lastName);
	
}
