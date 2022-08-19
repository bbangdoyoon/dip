package com.dip.org.req;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

// 유효성검사
// form 태그에서 저장버튼 눌렀을시에
// 글의 내용, 글의 제목이 없을시 다시 입력받도록 유도하는 기능


@Setter
@Getter
@ToString
public class FreeBoardReq {


    private Long id;

    @NotEmpty
    private String title;
    @NotEmpty
    private String content;

    private int hits;
    private String filename;


    private LocalDateTime regdate;


}
