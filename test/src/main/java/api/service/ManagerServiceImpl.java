package api.service;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import api.hibernate.util.HibernateUtil;
import api.model.Author;
import api.model.BoardGame;
import api.model.Extension;
import api.model.Matchs;
import api.model.Member;

public class ManagerServiceImpl implements ManagerService {

	public void stop() {
		Session session = HibernateUtil.currentSession();
		session.getTransaction().commit();
		HibernateUtil.closeSession();
	}

	public void start() {
		HibernateUtil.buildSessionFactory();
		Session session = HibernateUtil.currentSession();
		session.beginTransaction();
	}

	public void addBoardGame(BoardGame game) {
		Session session = HibernateUtil.currentSession();
		session.save(game);
	}

	public List<BoardGame> listBoardGame() {
		Session session = HibernateUtil.currentSession();
		Criteria criteria = session.createCriteria(BoardGame.class);
		return criteria.list();
	}

	public void updateBoardGame(BoardGame game) {
		Session session = HibernateUtil.currentSession();
		session.update(game);
	}

	public void delBoardGame(BoardGame game) {
		Session session = HibernateUtil.currentSession();
		session.delete(game);
	}

	public void addExtension(Extension ext) {
		Session session = HibernateUtil.currentSession();
		session.save(ext);

	}

	public void addMatch(Matchs match) {
		Session session = HibernateUtil.currentSession();
		session.save(match);
	}

	public void addAuthor(Author author) {
		Session session = HibernateUtil.currentSession();
		session.save(author);

	}

	public List<Author> listAuthor() {
		Session session = HibernateUtil.currentSession();
		Criteria criteria = session.createCriteria(Author.class);
		return criteria.list();
	}

	public void updateAuthor(Author author) {
		Session session = HibernateUtil.currentSession();
		session.update(author);
	}

	public void delAuthor(Author author) {
		Session session = HibernateUtil.currentSession();
		session.delete(author);
	}

	public void addMember(Member member) {
		Session session = HibernateUtil.currentSession();
		session.save(member);

	}

	public List<Member> listMember() {
		Session session = HibernateUtil.currentSession();
		Criteria criteria = session.createCriteria(Member.class);
		return criteria.list();
	}

	public void updateMember(Member member) {
		Session session = HibernateUtil.currentSession();
		session.update(member);
	}

	public void delMember(Member member) {
		Session session = HibernateUtil.currentSession();
		session.delete(member);
	}

}
