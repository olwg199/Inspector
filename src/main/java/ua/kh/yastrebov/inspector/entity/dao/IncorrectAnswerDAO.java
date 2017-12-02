//package entity.dao;
//
//import entity.IncorrectAnswer;
//import java.util.List;
//import org.hibernate.Session;
//import persistence.HibernateUtil;
//
//public class IncorrectAnswerDAO {
//    
//    public static Integer addIncorrectAnswer(IncorrectAnswer incorrectAnswer){
//        
//        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//        session.beginTransaction();
//        Integer result = (Integer) session.save(incorrectAnswer);
//        session.getTransaction().commit();
//        return result;
//        
//    }
//    
//    public static IncorrectAnswer getIncorrectAnswer(Integer incorrectAnswerId){
//        
//        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//        session.beginTransaction();
//        IncorrectAnswer incorrectAnswer = (IncorrectAnswer) session.load(IncorrectAnswer.class, incorrectAnswerId);
//        session.getTransaction().commit();
//        return incorrectAnswer;
//        
//    }
//    
//    public static void updateIncorrectAnswer(IncorrectAnswer incorrectAnswer){
//        
//        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//        session.beginTransaction();
//        session.saveOrUpdate(incorrectAnswer);
//        session.getTransaction().commit();
//        
//    }
//    
//    public static List<IncorrectAnswer> getAllIncorrectAnswer(){
//        
//        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//        session.beginTransaction();
//        List<IncorrectAnswer> incorrectAnswerList = session.createQuery("FROM incorrect_answer").list();
//        session.getTransaction().commit();
//        return incorrectAnswerList;
//        
//    }
//}
