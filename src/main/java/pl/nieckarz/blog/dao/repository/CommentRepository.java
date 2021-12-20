package pl.nieckarz.blog.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.nieckarz.blog.dao.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
