package study.core.board.repository;

import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import study.core.board.domain.entity.Post;

@Repository
public interface BoardRepository extends JpaRepository<Post, Long> {
}