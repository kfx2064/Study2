package org.hdcd.prj.domain.common;

public class PageRequest {

    private int page;
    private int sizePerPage;

    public PageRequest() {
        this.page = 1;
        this.sizePerPage = 10;
    }

    public void setPage(int page) {
        if (page <= 0) {
            this.page = 1;
            return;
        }

        this.page = page;
    }

    public void setSizePerPage(int size) {
        if (size <= 0 || size > 100) {
            this.sizePerPage = 10;
            return;
        }
        this.sizePerPage = size;
    }

    public int getPage() {
        return page;
    }

    public int getPageStart() {
        return (this.page - 1) * sizePerPage;
    }

    public int getSizePerPage() {
        return this.sizePerPage;
    }
}
