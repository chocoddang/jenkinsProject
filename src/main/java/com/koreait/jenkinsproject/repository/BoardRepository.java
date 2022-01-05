package com.koreait.jenkinsproject.repository;

import com.koreait.jenkinsproject.domain.Board;
import com.koreait.jenkinsproject.domain.BoardAttach;

public interface BoardRepository {
	public int insertBoard(Board board);
	public int insertBoardAttach(BoardAttach boardAttach);
}
