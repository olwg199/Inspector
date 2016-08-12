package entity.dao;

import entity.CorrectAnswer;
import java.util.List;
import org.hibernate.Session;
import persistence.HibernateUtil;

public class CorrectAnswerDAO {
    
    public static Integer addCorrectAnswer(CorrectAnswer correctAnswer){
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Integer result = (Integer) session.save(correctAnswer);
        session.getTransaction().commit();
        return result;
        
    }
    
    public static CorrectAnswer getCorrectAnswer(Integer correctAnswerId){
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        CorrectAnswer correctAnswer = (CorrectAnswer) session.load(CorrectAnswer.class, correctAnswerId);
        session.getTransaction().commit();
        return correctAnswer;
        
    }
    
    public static void updateCorrectAnswer(CorrectAnswer correctAnswer){
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.saveOrUpdate(correctAnswer);
        session.getTransaction().commit();
        
    }
    
    public static List<CorrectAnswer> getAllCorrectAnswer(){
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<CorrectAnswer> correctAnswerList = session.createQuery("FROM correct_answer").list();
        session.getTransaction().commit();
        return correctAnswerList;
        
    }
}
