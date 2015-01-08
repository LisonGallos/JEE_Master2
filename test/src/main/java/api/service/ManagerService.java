package api.service;

import java.util.List;

import api.model.BoardGame;
import api.model.Extension;
import api.model.Matchs;
import api.model.Author;
import api.model.Member;

public interface ManagerService {

	public void stop();
	
	public void start();
	
	/**Ajoute un auteur dans la base
	 * 
	 */
	public void addAuthor(Author author);
	
	/**Liste des auteurs dans la base
	 * 
	 */
	public List<Author> listAuthor();
	
	/**Modifie l'auteur dans la base
	 * 
	 */
	public void updateAuthor(Author author);
	
	/**Supprime l'auteur dans la base
	 * 
	 */
	public void delAuthor(Author author);

	/**Ajouter un jeu dans la base
	 * 
	 */
	public void addBoardGame(BoardGame game);
	
	/**Liste des jeux dans la base
	 * 
	 */
	public List<BoardGame> listBoardGame();
	
	/**Modifie le jeu dans la base
	 * 
	 */
	public void updateBoardGame(BoardGame game);
	
	/**Supprime le jeu dans la base
	 * 
	 */
	public void delBoardGame(BoardGame game);
	
	/**Ajouter une extension de jeu dans la base
	 * 
	 */
	public void addExtension(Extension ext);
	
	/**Ajout d'un match libre */
	public void addMatch(Matchs match);
	
	/**Ajoute un membre dans la base
	 * 
	 */
	public void addMember(Member member);
	
	/**Liste des membres dans la base
	 * 
	 */
	public List<Member> listMember();
	
	/**Modifie un membre dans la base
	 * 
	 */
	public void updateMember(Member member);
	
	/**Supprime un membre dans la base
	 * 
	 */
	public void delMember(Member member);
	
}
