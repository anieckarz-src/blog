package pl.nieckarz.blog.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.nieckarz.blog.dao.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {

}