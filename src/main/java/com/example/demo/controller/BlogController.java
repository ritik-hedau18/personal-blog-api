package com.example.demo.controller;
import com.example.demo.model.BlogPost;
import com.example.demo.model.Comment;
import com.example.demo.service.BlogService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/blog")
public class BlogController {
    private final BlogService service;

    public BlogController(BlogService service) {
        this.service = service;
    }

    @GetMapping("/posts")
    public List<BlogPost> getPosts() {
        return service.getPosts();
    }

    @PostMapping("/posts")
    public BlogPost createPost(@RequestBody BlogPost post) {
        return service.savePost(post);
    }

    @PostMapping("/comments")
    public Comment comment(@RequestBody Comment c) {
        return service.addComment(c);
    }

    @GetMapping("/posts/{postId}/comments")
    public List<Comment> getComments(@PathVariable Long postId) {
        return service.getCommentsForPost(postId);
    }
}
// minor tweak: update verification rules and configs

// minor tweak: update verification rules and configs at 8809
