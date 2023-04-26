package com.example.demo.service;
import com.example.demo.model.BlogPost;
import com.example.demo.model.Comment;
import com.example.demo.repository.BlogPostRepository;
import com.example.demo.repository.CommentRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class BlogService {
    private final BlogPostRepository postRepo;
    private final CommentRepository commentRepo;

    public BlogService(BlogPostRepository postRepo, CommentRepository commentRepo) {
        this.postRepo = postRepo;
        this.commentRepo = commentRepo;
    }

    public List<BlogPost> getPosts() {
        return postRepo.findAll();
    }

    public BlogPost savePost(BlogPost post) {
        post.setPublishedAt(LocalDateTime.now());
        return postRepo.save(post);
    }

    public Comment addComment(Comment comment) {
        comment.setTimestamp(LocalDateTime.now());
        return commentRepo.save(comment);
    }

    public List<Comment> getCommentsForPost(Long postId) {
        return commentRepo.findByPostId(postId);
    }
// minor tweak: performance check updates
// minor tweak: performance check updates
}
// minor tweak: update verification rules and configs

// minor tweak: update verification rules and configs at 3430

// minor tweak: update verification rules and configs at 8568

// minor tweak: update verification rules and configs at 2642
