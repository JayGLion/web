package com.jayg.web.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jayg.web.board.dao.BoardDao;
import com.jayg.web.board.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	BoardDao boardDao;
	
	@Override
	public List<BoardVO> getList() {
		return boardDao.getList();
	}

	@Override
	public BoardVO get(int seq) {
		return boardDao.get(seq);
	}

	@Override
	public void insert(BoardVO vo) {
		boardDao.insert(vo);
	}

	@Override
	public void update(BoardVO vo) {
		boardDao.update(vo);
	}

	@Override
	public int getListCount() {
		return (int) boardDao.getListCount();
	}
}
