package entity.dao;

import entity.Topic;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import persistence.HibernateUtil;

public class TopicDAO {
    
    public static Integer addTopic(Topic topic){
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Integer result = (Integer) session.save(topic);
        session.getTransaction().commit();
        return result;
        
    }
    
    public static Topic getTopic(Integer topicId){
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Topic topic = (Topic) session.load(Topic.class, topicId);
        Hibernate.initialize(topic.getQuestionList());
        session.getTransaction().commit();
        return topic;
        
    }
    
    public static void updateTopic(Topic topic){
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.saveOrUpdate(topic);
        session.getTransaction().commit();
        
    }
    
    public static List<Topic> getAllTopic(){
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Topic> topicList = (List<Topic>) session.createQuery("from Topic").list();
        session.getTransaction().commit();
        return topicList;
        
    }
}