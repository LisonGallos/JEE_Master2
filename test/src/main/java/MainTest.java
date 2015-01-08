import java.util.Date;
import java.util.List;

import api.model.BoardGame;
import api.model.Extension;
import api.model.Matchs;
import api.service.ManagerService;
import api.service.ManagerServiceImpl;


public class MainTest {

	public static void main(String[] args) {
		ManagerService mng = new ManagerServiceImpl();
		mng.start();
		/*
		BoardGame ext = new BoardGame();
		ext.description = "lalalalallalalalallalalal oué!!!";
		ext.maxPlayer= 5;
		ext.minPlayer= 2;
		ext.name = "Silent Hill";
		ext.playingTime = 100;
		ext.publicationYear = 2014;
		ext.suggestedAge = 12;
		
		BoardGame ext2 = new BoardGame();
		ext2.description = "lalalalallalalalallalalal oué!!!";
		ext2.maxPlayer= 4;
		ext2.minPlayer= 2;
		ext2.name = "Digimon";
		ext2.playingTime = 100;
		ext2.publicationYear = 1997;
		ext2.suggestedAge = 6;
		
		BoardGame ext3 = new BoardGame();
		ext3.description = "lalalalallalalalallalalal oué!!!";
		ext3.maxPlayer= 1;
		ext3.minPlayer= 1;
		ext3.name = "Pokemon";
		ext3.playingTime = 100;
		ext3.publicationYear = 1996;
		ext3.suggestedAge = 12;
		
		mng.addBoardGame(ext);
		mng.addBoardGame(ext2);
		mng.addBoardGame(ext3);
		
		*/
		
		List<BoardGame> lesjeux = mng.listBoardGame();
		
		for (int i=0;i<lesjeux.size(); i++){
			System.out.println((lesjeux.get(i)).name);
		}
		
		/*
		Matchs m = new Matchs();
		m.setDate(new Date());
		
		mng.addMatch(m);
		*/
		/*
		BoardGame game = new BoardGame();
		game.description = "jokfhnofenhvofgeofv";
		game.maxPlayer = 10;
		game.minPlayer = 5;
		game.name= "Totoro";
		game.playingTime = 10;
		game.publicationYear = 1988;
		game.suggestedAge = 12;
		mng.addBoardGame(game);
		
		
		Match match = new Match();
		match.setDate(new Date());
		mng.addMatch(match);
		*/
		mng.stop();

	}

}
