package api.hibernate_util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.stat.Statistics;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	private static Logger logger = LoggerFactory.getLogger(HibernateUtil.class);

	private HibernateUtil() {
	};

	private static final ThreadLocal<Session> SESSION = new ThreadLocal<Session>();

	public static Session currentSession() {
		Session s = (Session) SESSION.get();
		// Ouvre une nouvelle Session, si ce Thread n'en a aucune
		if (s == null) {
			s = sessionFactory.openSession();
			SESSION.set(s);
		}

		Statistics stats = sessionFactory.getStatistics();
		stats.logSummary();

		return s;
	}

	public static void closeSession() {
		Session s = (Session) SESSION.get();
		SESSION.set(null);
		if (s != null) {
			s.close();
		}
	}

	public static void buildSessionFactory() {
		try {
			sessionFactory = new Configuration().configure()
					.buildSessionFactory();
		} catch (HibernateException e) {
			throw new RuntimeException("Probleme de configuration : "
					+ e.getMessage(), e);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}