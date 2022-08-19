package com.dip.org.repository;

import com.dip.org.entity.FreeBoard;
import com.dip.org.entity.FreeBoardTail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FreeBoardTailRepository extends JpaRepository<FreeBoardTail,Long> {

//    @Query("delete from free_board-tail f where f.board_id=?1")
//
//
//    public int deleteByBoard_id(long board_id);
}