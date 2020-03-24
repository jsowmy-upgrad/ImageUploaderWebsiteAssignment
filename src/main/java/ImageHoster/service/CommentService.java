package ImageHoster.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ImageHoster.model.Comment;
import ImageHoster.model.Image;
import ImageHoster.repository.CommentsRepository;

import java.time.LocalDate;
import java.util.Date;

@Service
public class CommentService {
    @Autowired
    private CommentsRepository commentsRepository;


    //Menthod to add comments with current Timestamp

    public void addComment(Comment comment) {
        comment.setCreatedDate(new Date());
        commentsRepository.addComment(comment);
    }
}
