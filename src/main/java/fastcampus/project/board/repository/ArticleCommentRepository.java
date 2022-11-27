package fastcampus.project.board.repository;

import fastcampus.project.board.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AticleCommentRepository extends JpaRepository<ArticleComment, Long> {

}
