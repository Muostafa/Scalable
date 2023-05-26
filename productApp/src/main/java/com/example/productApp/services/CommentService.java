package com.example.productApp.services;

import com.example.productApp.models.Comment;
import com.example.productApp.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class CommentService {
    private final CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public List<Comment> getCommentsByUser(String userId) {
        return commentRepository.findByUserId(userId);
    }

    public List<Comment> getCommentsByApp(String appId) {
        return commentRepository.findByAppId(appId);
    }

    public Comment createComment(Comment comment) {
        comment.setId(UUID.randomUUID().toString());
        return commentRepository.save(comment);
    }


    public void deleteComment(String commentId) {
        commentRepository.deleteById(commentId);
    }
}
