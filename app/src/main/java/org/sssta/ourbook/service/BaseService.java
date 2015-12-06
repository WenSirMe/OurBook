package org.sssta.ourbook.service;

import org.sssta.ourbook.Constants;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by Heaven on 2015/12/6.
 */
public class BaseService {
    private static Retrofit mRetrofit;
    private static BookService mBookService;


    private static Retrofit getRetrofit() {
        if (mRetrofit == null) {
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(Constants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return mRetrofit;
    }

    public static BookService getBookService() {
        if (mBookService == null) {
            mBookService = getRetrofit().create(BookService.class);
        }
        return mBookService;
    }

}