package org.hdcd.prj.domain;

import org.hdcd.prj.domain.common.PageRequest;

import java.io.Serializable;
import java.util.Date;

public class Board implements Serializable {

    private static final long serialVersionUID = -6526469694528580041L;

    private int boardNo;
    private String title;
    private String content;
    private String writer;
    private Date regDate;

    private PageRequest pageRequest;

    public int getBoardNo() {
        return boardNo;
    }

    public void setBoardNo(int boardNo) {
        this.boardNo = boardNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public int getPage() {
        return pageRequest.getPage();
    }

    public int getSizePerPage() {
        return pageRequest.getSizePerPage();
    }

    public PageRequest getPageRequest() {
        return pageRequest;
    }

    public void setPageRequest(PageRequest pageRequest) {
        this.pageRequest = pageRequest;
    }

    @Override
    public String toString() {
        return "Board{" +
                "boardNo=" + boardNo +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", regDate=" + regDate +
                '}';
    }
}
