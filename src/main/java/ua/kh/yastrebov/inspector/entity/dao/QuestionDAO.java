//package entity.dao;
//
//import entity.Question;
//import java.util.List;
//import org.hibernate.Session;
//import persistence.HibernateUtil;
//
//public class QuestionDAO {
//    
//    public static Integer addQuestion(Question question){
//        
//        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//        session.beginTransaction();
//        Integer result = (Integer) session.save(question);
//        session.getTransaction().commit();
//        return result;
//        
//    }
//    
//    public static Question getQuestion(Integer questionId){
//        
//        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//        session.beginTransaction();
//        Question topic = (Question) session.load(Question.class, questionId);
//        session.getTransaction().commit();
//        return topic;
//        
//    }
//    
//    public static void updateQuestion(Question question){
//        
//        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//        session.beginTransaction();
//        session.saveOrUpdate(question);
//        session.getTransaction().commit();
//        
//    }
//    
//    public static List<Question> getAllQuestion(){
//        
//        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//        session.beginTransaction();
//        List<Question> topicList = session.createQuery("from Question").list();
//        session.getTransaction().commit();
//        return topicList;
//        
//    }
//}
