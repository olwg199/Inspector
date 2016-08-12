package entity.dao;

import entity.Author;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import persistence.HibernateUtil;

public class AuthorDAO {   
    
    public static Integer addAuthor(Author author){
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Integer result = (Integer) session.save(author);
        session.getTransaction().commit();
        return result;
        
    }
    
    public static void updateAuthor(Author author){
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.saveOrUpdate(author);
        session.getTransaction().commit();
        
    }
    
    public static Author getAuthor(Integer authorId){
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Author author = (Author) session.load(Author.class, authorId);
        Hibernate.initialize(author.getQuestionList());
        session.getTransaction().commit();
        return author;
        
    }
    
    public static List<Author> getAllAuthor(){
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Author> authorList = session.createQuery("from Author").list();
        session.getTransaction().commit();
        return authorList;
    }
}