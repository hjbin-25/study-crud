package study.core.board.controller;

import study.core.board.service.BoardService;
import study.core.board.dto.request.PostPostRequest;
import study.core.board.dto.request.GetPostRequest;
import study.core.board.dto.response.PostInfoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping
    public PostInfoResponse getPostInfo(@RequestBody GetPostRequest request) {
        return boardService.getPostInfo(request);
    }

    @PostMapping
    public PostInfoResponse postPost(@RequestBody PostPostRequest request) {
        return boardService.postPostInfo(request);
    }

    @PutMapping("/{postId}")
    public PostInfoResponse updatePost(@PathVariable Long postId ,@RequestBody PostPostRequest request) {
        return boardService.updatePostInfo(postId,request);
    }

    @DeleteMapping("/{postId}")
    public HttpStatus deletePost(@PathVariable Long postId) {
        boardService.deletePost(postId);
        return HttpStatus.OK;
    }
}