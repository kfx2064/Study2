package org.hdcd.prj.domain.common;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class Pagination {

    private int totalCount;
    private int startPage;
    private int endPage;
    private boolean prev;
    private boolean next;

    private int displayPageNum = 10;

    private PageRequest pageRequest;

    public void setPageRequest(PageRequest pageRequest) {
        this.pageRequest = pageRequest;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;

        calcData();
    }

    private void calcData() {
        endPage = (int) (Math.ceil(pageRequest.getPage() / (double) displayPageNum) * displayPageNum);

        startPage = (endPage - displayPageNum) + 1;

        int tempEndPage = (int)(Math.ceil(totalCount / (double) pageRequest.getSizePerPage()));

        if (endPage > tempEndPage) {
            endPage = tempEndPage;

            prev = startPage == 1 ? false : true;

            next = endPage * pageRequest.getSizePerPage() >= totalCount ? false : true;
        }
    }

    public int getTotalCount() {
        return totalCount;
    }

    public int getStartPage() {
        return startPage;
    }

    public void setStartPage(int startPage) {
        this.startPage = startPage;
    }

    public int getEndPage() {
        return endPage;
    }

    public void setEndPage(int endPage) {
        this.endPage = endPage;
    }

    public boolean isPrev() {
        return prev;
    }

    public void setPrev(boolean prev) {
        this.prev = prev;
    }

    public boolean isNext() {
        return next;
    }

    public void setNext(boolean next) {
        this.next = next;
    }

    public int getDisplayPageNum() {
        return displayPageNum;
    }

    public PageRequest getPageRequest() {
        return pageRequest;
    }

    public String makeQuery(int page) {
        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                                                            .queryParam("page", page)
                                                            .queryParam("perPageNum", pageRequest.getSizePerPage())
                                                            .build();

        return uriComponents.toUriString();
    }
}
