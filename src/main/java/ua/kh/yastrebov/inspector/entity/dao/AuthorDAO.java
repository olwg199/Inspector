package ua.kh.yastrebov.inspector.entity.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import ua.kh.yastrebov.inspector.entity.Author;
import ua.kh.yastrebov.inspector.entity.ConnectionBD;


public class AuthorDAO { 
    private static final String ADD_AUTHOR_SQL = 
            "INSERT INTO inspector.author (name) VALUES (?)";
    
    public static void addAuthor(Author author){
        
        try{
        PreparedStatement statement = ConnectionBD.getConnection()
                .prepareStatement(ADD_AUTHOR_SQL);
        statement.setString(1, author.getName());
        statement.execute();
        statement.close();
            
        } catch(SQLException e) {
            e.printStackTrace();
            System.out.println("Не удалось вставить в таблицу данные");
        } 
                
    }
    
//    public static void updateAuthor(Author author){
//        
//        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//        session.beginTransaction();
//        session.saveOrUpdate(author);
//        session.getTransaction().commit();
//        
//    }
//    
//    public static Author getAuthor(Integer authorId){
//        
//        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//        session.beginTransaction();
//        Author author = (Author) session.load(Author.class, authorId);
//        Hibernate.initialize(author.getQuestionList());
//        session.getTransaction().commit();
//        return author;
//        
//    }
//    
//    public static List<Author> getAllAuthor(){
//        
//        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//        session.beginTransaction();
//        List<Author> authorList = session.createQuery("from Author").list();
//        session.getTransaction().commit();
//        return authorList;
//    }
}