package ImageHoster.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import ImageHoster.model.Comment;


@Repository
public class CommentsRepository {
    @PersistenceUnit(unitName = "imageHoster")
    private EntityManagerFactory emf;


    public void addComment(Comment comment) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            em.persist(comment);
            transaction.commit();

        } catch (Exception e) {
            transaction.rollback();
        }
    }
}
