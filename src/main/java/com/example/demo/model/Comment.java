package com.example.demo.model;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Comment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long postId;
    private String author;
    private String content;
    private LocalDateTime timestamp;
// minor tweak: performance check updates
}
// minor tweak: update verification rules and configs

// minor tweak: update verification rules and configs at 7249
