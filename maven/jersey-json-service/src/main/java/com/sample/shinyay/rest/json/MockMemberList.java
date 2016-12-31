package com.sample.shinyay.rest.json;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by syanagih on 2016/12/31.
 */
public class MockMemberList {

    private static final CopyOnWriteArrayList<Member> mList = new CopyOnWriteArrayList<>();

    static {
        mList.add(
                new Member.MemberBuilder()
                        .id()
                        .lastName("岡部")
                        .firstName("倫太郎")
                        .age(18)
                        .birthday("1991年12月14日")
                        .height(177)
                        .weight(59)
                        .blood("A型")
                        .build()
        );

        mList.add(
                new Member.MemberBuilder()
                        .id()
                        .lastName("椎名")
                        .firstName("まゆり")
                        .age(16)
                        .birthday("1994年2月1日")
                        .height(152)
                        .weight(45)
                        .blood("O型")
                        .build()
        );

        mList.add(
                new Member.MemberBuilder()
                        .id()
                        .lastName("橋田")
                        .firstName("至")
                        .age(19)
                        .birthday("1991年5月19日")
                        .height(164)
                        .weight(98)
                        .blood("B型")
                        .build()
        );

        mList.add(
                new Member.MemberBuilder()
                        .id()
                        .lastName("牧瀬")
                        .firstName("紅莉栖")
                        .age(18)
                        .birthday("1992年7月25日")
                        .height(160)
                        .weight(45)
                        .blood("A型")
                        .build()
        );

        mList.add(
                new Member.MemberBuilder()
                        .id()
                        .lastName("桐生")
                        .firstName("萌郁")
                        .age(20)
                        .birthday("1990年6月6日")
                        .height(167)
                        .weight(54)
                        .blood("B型")
                        .build()
        );

        mList.add(
                new Member.MemberBuilder()
                        .id()
                        .lastName("漆原")
                        .firstName("るか")
                        .age(16)
                        .birthday("1993年8月30日")
                        .height(151)
                        .weight(44)
                        .blood("A型")
                        .build()
        );

        mList.add(
                new Member.MemberBuilder()
                        .id()
                        .lastName("フェイリス")
                        .firstName("ニャンニャン")
                        .age(17)
                        .birthday("1993年4月3日")
                        .height(143)
                        .weight(43)
                        .blood("AB型")
                        .build()
        );

        mList.add(
                new Member.MemberBuilder()
                        .id()
                        .lastName("阿万音")
                        .firstName("鈴羽")
                        .age(18)
                        .birthday("2017年9月27日")
                        .height(163)
                        .weight(51)
                        .blood("O型")
                        .build()
        );
    }

    private MockMemberList(){}

    public static CopyOnWriteArrayList<Member> getInstance(){
        return mList;
    }
}
