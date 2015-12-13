package org.sssta.ourbook;

import org.sssta.ourbook.model.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Heaven on 2015/12/12.
 */
public class DataHelp {
    private static final int DATA_COUNT = 5;
    private static final String[] names={
            "天下",
            "南音",
            "天海翼",
            "所有人",
            "愚见"
    };
    private static final String[] briefs={
            "这个天下是所有人的天下,所以任何人的骄傲都可以是四海为家。",
            "这世界上最可怕的事情就是一见倾心。",
            "这一刻 , 所有人问所有人。",
            "你所幻想的一切本质上都真实存在着,而你正是为了这些而活着。",
            "愚见"
    };
    private static final String[] authors={
            "北山",
            "落雨",
            "天心",
            "莫桐",
            "子月"
    };
    private static final int[] prices={
            8,
            10,
            3,
            7,
            9
    };
    private static final int[] imgs={
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
    };
    private static final int[] wordCounts={
            865423,
            375936,
            842325,
            767782,
            954733
    };
    private static final float[] evaluates={
            8.3f,
            6.6f,
            5.2f,
            9.0f,
            7.4f
    };
    public static List<Book> createDataList(){
        ArrayList<Book> mList = new ArrayList<>();
        for (int i = 0;i  < 15;i++){
            int index = i % DATA_COUNT;
            mList.add(new Book(
                    names[index],
                    briefs[index],
                    authors[index],
                    prices[index],
                    imgs[index],
                    wordCounts[index],
                    evaluates[index]));
        }
        return mList;
    }
}
