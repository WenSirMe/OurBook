package org.sssta.ourbook;

import org.sssta.ourbook.model.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Heaven on 2015/12/12.
 */
public class DataHelp {
    private static final int DATA_COUNT = 5;
    private final String[] names={
            "天下",
            "南音",
            "天海翼",
            "所有人",
            "愚见"
    };
    private final String[] briefs={
            "这个天下是所有人的天下,所有任何人的骄傲都可以是四海为家。",
            "这世界上最可怕的事情就是一见倾心。",
            "天海翼",
            "所有人",
            "愚见"
    };
    private final String[] authors={
            "北山",
            "落雨",
            "天海翼",
            "所有人",
            "愚见"
    };
    private final int[] prices={};
    private final int[] imgs={};
    private final int[] wordCounts={};
    private final float[] evaluates={};
    private static List<Book> createDataList(){
        Book mBook = new Book("love","peace","me",88,66,80,8.3f);
        ArrayList<Book> mList = new ArrayList<>();
        for (int i = 0;i  < 15;i++){

        }
        mList.add(mBook);
        return mList;
    }
}
