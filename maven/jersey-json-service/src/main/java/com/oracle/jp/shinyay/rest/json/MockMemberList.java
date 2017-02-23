package com.oracle.jp.shinyay.rest.json;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by syanagih on 2016/12/31.
 */
public class MockMemberList {

    private static final CopyOnWriteArrayList<Member> mList = new CopyOnWriteArrayList<>();

    static {
        mList.add(
                new Member.Builder("倫太郎",
                        "岡部",
                        18,
                        "1991年12月14日",
                        177,
                        59,
                        "A型")
                        .build()
        );

        mList.add(
                new Member.Builder("まゆり",
                        "椎名",
                        16,
                        "1994年2月1日",
                        152,
                        45,
                        "O型")
                        .build()
        );

        mList.add(
                new Member.Builder("至",
                        "橋田",
                        19,
                        "1991年5月19日",
                        164,
                        98,
                        "B型")
                        .build()
        );

        mList.add(
                new Member.Builder("紅莉栖",
                        "牧瀬",
                        18,
                        "1992年7月25日",
                        160,
                        45,
                        "A型")
                        .build()
        );

        mList.add(
                new Member.Builder("萌郁",
                        "桐生",
                        20,
                        "1990年6月6日",
                        167,
                        54,
                        "B型")
                        .build()
        );

        mList.add(
                new Member.Builder("るか",
                        "漆原",
                        16,
                        "1993年8月30日",
                        151,
                        44,
                        "A型")
                        .build()
        );

        mList.add(
                new Member.Builder("ニャンニャン",
                        "フェイリス",
                        17,
                        "1993年4月3日",
                        144,
                        43,
                        "AB型"
                        )
                        .build()
        );

        mList.add(
                new Member.Builder("鈴羽",
                        "阿万音",
                        18,
                        "2017年9月27日",
                        163,
                        51,
                        "O型")
                        .build()
        );
    }

    private MockMemberList(){}

    public static CopyOnWriteArrayList<Member> getInstance(){
        return mList;
    }
}
