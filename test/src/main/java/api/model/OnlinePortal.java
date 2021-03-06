package api.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class OnlinePortal {
	
	@Id
	@GeneratedValue
	public long id;
	
	private String name;
	private String url;
	
	@ManyToMany
    private Collection<BoardGame> boardGames ;


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public Collection<BoardGame> getBoardGames() {
		return boardGames;
	}
	public void setBoardGames(Collection<BoardGame> boardGames) {
		this.boardGames = boardGames;
	}
}
