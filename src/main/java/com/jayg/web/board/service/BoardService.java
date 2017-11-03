package com.jayg.web.board.service;

import java.util.List;

import com.jayg.web.board.vo.BoardVO;
import com.jayg.web.board.vo.PageVO;

public interface BoardService {
	List<BoardVO> getList(PageVO vo);
	List<BoardVO> getListAll();
	int getListCount();
	BoardVO get(int seq);
	void insert(BoardVO vo);
	void update(BoardVO vo);
}
