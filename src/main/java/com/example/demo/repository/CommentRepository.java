package com.example.demo.repository;
import com.example.demo.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPostId(Long postId);
// minor tweak: performance check updates
// minor tweak: performance check updates
// minor tweak: performance check updates
// minor tweak: performance check updates
// minor tweak: performance check updates
}
// minor tweak: update verification rules and configs

// minor tweak: update verification rules and configs at 7285
