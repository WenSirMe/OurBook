package org.sssta.ourbook.service.response;

import org.sssta.ourbook.model.Book;

import java.util.List;

/**
 * Created by Heaven on 2015/12/6.
 */
public class BookResponse extends BaseResponse{
    private List<Book> bookData;

    public List<Book> getBookList() {
        return bookData;
    }
}
