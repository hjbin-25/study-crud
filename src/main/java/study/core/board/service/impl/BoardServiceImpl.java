package study.core.board.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.core.board.domain.entity.Post;
import study.core.board.dto.request.GetPostRequest;
import study.core.board.dto.request.PostPostRequest;
import study.core.board.dto.response.PostInfoResponse;
import study.core.board.repository.BoardRepository;
import study.core.board.service.BoardService;

@Service
@Transactional
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
    private final BoardRepository boardRepository;

    @Override
    public PostInfoResponse getPostInfo(GetPostRequest request) {
        return PostInfoResponse.of(boardRepository.findById(request.id()).get());
    }

    @Override
    public PostInfoResponse postPostInfo(PostPostRequest request) {

        Post post = Post.builder()
                .title(request.title())
                .content(request.content())
                .category(request.category())
                .build();

        return PostInfoResponse.of(boardRepository.save(post));
    }

    @Override
    public PostInfoResponse updatePostInfo(Long id, PostPostRequest request) {
        if (id.equals(null)) {
            throw new RuntimeException();
        }
        Post post = boardRepository.findById(id).get();
        post.setTitle(request.title());
        post.setContent(request.content());
        post.setCategory(request.category());
        return PostInfoResponse.of(boardRepository.save(post));
    }

    @Override
    public void deletePost(Long id) {
        boardRepository.deleteById(id);
    }
}