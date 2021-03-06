package com.spring.web.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class NewPageMakerVO {
    /* 페이지 시작 번호 */
    private int pageStart;
    
    /* 페이지 끝 번호 */
    private int pageEnd;
    
    /* 이전, 다음 버튼 존재 유무 */
    private boolean next, prev;
    
    /* 행 전체 개수 */
    private int total;
    
    /* 현재페이지 번호(pageNum), 행 표시 수(amount), 검색 키워드(keyword) */
    private NewPageVO vo;
    
    
    /* 생성자(클래스 호출 시 각 변수 값 초기화)      */
    /*[pageNum=1, amount=10, keyword=null],769 */
    public NewPageMakerVO(NewPageVO vo, int total) {
        
        /* vo, total 초기화 */
        this.vo = vo;
        this.total = total;
        
        /* 페이지 끝 번호 10*/
        this.pageEnd = (int)(Math.ceil(vo.getPageNum()/10.0))*10;
        
        /* 페이지 시작 번호 1*/
        this.pageStart = this.pageEnd - 9;
        
        /* 전체 마지막 페이지 번호 77 */
        int realEnd = (int)(Math.ceil(total*1.0/vo.getAmount()));
        
        /* 페이지 끝 번호 유효성 체크 */
        if(realEnd < pageEnd) {
            this.pageEnd = realEnd;
        }
        
        /* 이전 버튼 값 초기화 */
        this.prev = this.pageStart > 1;
        
        /* 다음 버튼 값 초기화 */
        this.next = this.pageEnd < realEnd;
        
    }

	

    
}