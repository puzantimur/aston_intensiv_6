package com.example.astonintensiv5.dataSource

import com.example.astonintensiv5.model.Contact

object Source {

    private val pictures = listOf(
        "https://i.picsum.photos/id/1021/200/200.jpg?hmac=5Jzd15OWoPw0fwvsvL05A1BAIN_B543TvjlxqGk1PDU",
        "https://i.picsum.photos/id/1071/200/200.jpg?hmac=mb6el6MCnRCyFnuMcCPJppn1WISnV5OKFUqDFg82Joo",
        "https://i.picsum.photos/id/657/200/200.jpg?hmac=6vrgINA0qije4LsZMVl1Rea_OtagocnfsCfETPr0_Hc",
        "https://i.picsum.photos/id/117/200/200.jpg?hmac=hAXY0lMbkjkxYIKxW0UjtazVquGY1NCu3ruHLJGc4gs",
        "https://i.picsum.photos/id/93/200/200.jpg?hmac=zg_Gq7olpOr79tOB65nmsvLWAIR_Ju8QQWkTKurbgJs",
        "https://i.picsum.photos/id/619/200/200.jpg?hmac=kS8OI8cYlvghz5FZaiYdIx96pUPQ30oF6bIsAg3AOZ4",
        "https://i.picsum.photos/id/738/200/200.jpg?hmac=s1pXxIw4TdDLyUY2RRVeDyhLPUF2xW3AFjdzjVsE6zc",
        "https://i.picsum.photos/id/835/200/200.jpg?hmac=jjwwLv8NOI5-bNtofNr7uG_-BusMVkHeLX4n4LXzj-Y",
        "https://i.picsum.photos/id/516/200/200.jpg?hmac=CsDADXBJh2feopw8BAy8PQ6Ma5u0as6pKj5EuJ7zyMw",
        "https://i.picsum.photos/id/200/200/200.jpg?hmac=mk1Tu6dXHQvpaA8RfxlDUZjbWG23krNkiB9kyYoEmO8",
        "https://i.picsum.photos/id/149/200/200.jpg?hmac=ykhZe9T_HysK0voTz01NVBW7C8XlLYYT2EinqAhTA-0",
        "https://i.picsum.photos/id/886/200/200.jpg?hmac=pfmGQi7EpajLoJI0tKTPTUwOPQtH9YwE-wNl_kr7ErI",
        "https://i.picsum.photos/id/1045/200/200.jpg?hmac=NOMPYGOtm89-zlf7NNDG7qSjCOy3XpvrdQRBF4aUZgE",
        "https://i.picsum.photos/id/434/200/200.jpg?hmac=XGqvfpLw0rMcPyD8jH0Ta9jFlmmXrnpbu7IcMOORrQQ",
        "https://i.picsum.photos/id/210/200/200.jpg?hmac=ofnpd0LAPvyH0juHuFCaLU6Y6jqJe4qpuc90jXbzUjY",
        "https://i.picsum.photos/id/586/200/200.jpg?hmac=qCQKBciYy8H3AxcVxnTZLYwXw02r33F5_3E4UmlB8H4",
        "https://i.picsum.photos/id/384/200/200.jpg?hmac=TAsUnIQnfLj13hjjp8604_rXNHrqCGlB2K8UQoWt1aM",
        "https://i.picsum.photos/id/695/200/200.jpg?hmac=UJ4cowzXuCCU8226Q4uRM-Ahz6mj365L6nkT1QEBgR0",
        "https://i.picsum.photos/id/25/200/200.jpg?hmac=G4ZRBi0qdWfQJQs_yxNQr_LJJlf0V1_Pdj8Tp41xsJU",
        "https://i.picsum.photos/id/54/200/200.jpg?hmac=-2_HX5umbAEVPP9CokmPW3Kc8V9iDplneKlS73LWdQQ",
        "https://i.picsum.photos/id/233/200/200.jpg?hmac=WUkE2TwGJAJFsl1GTBP4NMm-wCxzkMLaTNkiTHCLHU0",
        "https://i.picsum.photos/id/33/200/200.jpg?hmac=Byvb9ZEKV47fLdwaE2BGClGsgcm5fyuDH6sWb9pvWbI",
        "https://i.picsum.photos/id/484/200/200.jpg?hmac=3rqhoyJTHVOGelhVPMaglcnpAMl_V3cvNkHZDpSz6_g",
        "https://i.picsum.photos/id/991/200/200.jpg?hmac=zdrg88cOolAGaFqNdqLZG2ECaXB0AjpYxU8PNyq3dBw",
        "https://i.picsum.photos/id/996/1600/900.jpg?hmac=_9FCqIXsaZMVo5zDdV_3eYL_MSp51VwDqqMe8on3aKg",
        "https://i.picsum.photos/id/240/1600/900.jpg?hmac=bIhzdqJsOGLjBJSGEU_Xo9e8DoGPY4W-DQKlyBh42fc",
        "https://i.picsum.photos/id/832/1600/900.jpg?hmac=DHvIsk2doNJlZGvTK4QqLEmjZFFgE3DxOuEGKrm1eRk",
        "https://i.picsum.photos/id/583/1600/900.jpg?hmac=zxLFQmIpn7tMzXWO7OiOnDSPxQd0B728sn00RcsBOTk",
        "https://i.picsum.photos/id/978/1600/900.jpg?hmac=tOkjEcd3RJtPuiazbFGlObJLlkWhhtSqkbu2nIYoBF8",
        "https://i.picsum.photos/id/881/1600/900.jpg?hmac=4Bv5tc_qxfz2n8eQ0XhHw57-0gAo-0BdxUC08aEbS5g",
        "https://i.picsum.photos/id/606/1600/900.jpg?hmac=Pdoata_qoLyPn4pRQ3C5T5lFnKWnp4ecsrlMVLqTXe4",
        "https://i.picsum.photos/id/560/1600/900.jpg?hmac=jFASa9bWTlwd73MebXyzga7qO_tW-qHDKQ3q9lMUhq4",
        "https://i.picsum.photos/id/452/1600/900.jpg?hmac=T2V5Acv_5XISNyVCLDELoslIBFilv6RgJUj_wXP8laU",
        "https://i.picsum.photos/id/954/1600/900.jpg?hmac=CkhFfPwRXL2-5eE9gWAx9YtVn1HjV4AK5XpEexV5rFo",
        "https://i.picsum.photos/id/81/1600/900.jpg?hmac=EeEFp2f2AE0-k5zXDI4hFhOUJyoU4UwDpz4C9MrQ0CU",
        "https://i.picsum.photos/id/613/1600/900.jpg?hmac=6SqKxmZCShtKbLRhiJv4R8xh5u5YKzvc9wARxjJ2NVg",
        "https://i.picsum.photos/id/606/1600/900.jpg?hmac=Pdoata_qoLyPn4pRQ3C5T5lFnKWnp4ecsrlMVLqTXe4",
        "https://i.picsum.photos/id/991/1600/900.jpg?hmac=WQyzgCdBDnscIJauZ7RKLpRNwGnb5NB1Ir3AG8-v3c0",
        "https://i.picsum.photos/id/389/1600/900.jpg?hmac=6QhKyvgHeDAYgtC24GiC5pFVFqDzqU0qO7ES2ubYRhM",
        "https://i.picsum.photos/id/318/1600/900.jpg?hmac=AG0rUD_c6Ix155d2i9Mwhc_IyUnlwJwCjDeTSnjvwc4",
        "https://i.picsum.photos/id/98/1600/900.jpg?hmac=AdPLnjned-wWW9L6HixsK_I7e7CjcvuHoqDUh_Ik8MY",
        "https://i.picsum.photos/id/696/1600/900.jpg?hmac=kjoO-FVqKDvrTktb0UZzN1TjzL8OCdmYuorUdHP7VZk",
        "https://i.picsum.photos/id/937/1600/900.jpg?hmac=nYyj_0_lhEPWpV-h-ZLs6Sw7TxriqbDfi4EiuByUZcw",
        "https://i.picsum.photos/id/889/1600/900.jpg?hmac=vwnV5MyLGA2uAsbdeb_ZalQjJihnAVqyJi_EQc9864A",
        "https://i.picsum.photos/id/90/1600/900.jpg?hmac=_1eGTCZupfSa6D6zVEFztl9orucFOCflh-uMYCR4sRA",
        "https://i.picsum.photos/id/995/1600/900.jpg?hmac=-qgaCktJxg1dK3OpkIYcSAom3aWJYQTt4xxA1wtcDm0",
        "https://i.picsum.photos/id/232/1600/900.jpg?hmac=ebK15G7odhzJBhd96gQu3d-C81G4lheGjOvuzPuEp_M",
        "https://i.picsum.photos/id/602/1600/900.jpg?hmac=Dg1YZe9mwFmezphkW3ZHlDwPiA6PPOXnnjR42S51-xs",
        "https://i.picsum.photos/id/24/1600/900.jpg?hmac=vELZloZq1CjyXJsbBWCCaneToUGdV2Pqv2r_B9-8NFA",
        "https://i.picsum.photos/id/415/1600/900.jpg?hmac=qn4OQ_kXNSaxBqHpNtMxuRJd1t2lg8KSAsrWN2kXzFo",
        "https://i.picsum.photos/id/863/1600/900.jpg?hmac=CA3ijNxxjhjB4aEgwAMMCEsoJuUYSqTKYXRD22LyHwk",
        "https://i.picsum.photos/id/242/1600/900.jpg?hmac=OvOLU2m7Blpq1zBmFZup7jqAtQiq7bbtvz4RhBJ-KdQ",
        "https://i.picsum.photos/id/313/1600/900.jpg?hmac=KNRJJHDLIEqfr0bvMAzWaB3tGEka7A6XjOW3mDVCDSM",
        "https://i.picsum.photos/id/997/1600/900.jpg?hmac=3u_93pnzLcpYBG-EOHE2Fw4lHZmQhdcGx83-59dPx4k",
        "https://i.picsum.photos/id/13/1600/900.jpg?hmac=26mlUxNW1qpldSmu12N1Yuwytp13mi3VNsMXaqd33zY",
        "https://i.picsum.photos/id/571/1600/900.jpg?hmac=hm5a3qnndRGZn8ZhLn8Vbx9Wxf8euFDky_lMyqRrjAQ",
        "https://i.picsum.photos/id/974/1600/900.jpg?hmac=pKouqZOqJ6LBAzDTfJ4lCh0k7Ok_T74IA7sFkwusQ_Y",
        "https://i.picsum.photos/id/316/1600/900.jpg?hmac=L1AI5EuHhBl1qq9vgIW422N55ucx9Ltf1VnNxpViiRE",
        "https://i.picsum.photos/id/682/1600/900.jpg?hmac=q5-OyJFiUyInXQlX8nhtHxnQmY-UQ9oFnyrJZvKd16g",
        "https://i.picsum.photos/id/519/1600/900.jpg?hmac=ADSrnwhZ4LRcy_718hASgiMp0-lW-EH4RyE0mBAN3FI",
        "https://i.picsum.photos/id/1059/1600/900.jpg?hmac=dnDTHWrVW5xmgP8XzJ4ymOYUJbZKiEzCQUJTc7Bi0ag",
        "https://i.picsum.photos/id/109/1600/900.jpg?hmac=wnlc2_VDNYOHX8VQT5zbWK3XF4cgTTGij7-wz-FFxF8",
        "https://i.picsum.photos/id/240/1600/900.jpg?hmac=bIhzdqJsOGLjBJSGEU_Xo9e8DoGPY4W-DQKlyBh42fc",
        "https://i.picsum.photos/id/1066/1600/900.jpg?hmac=L5j66P4LyRrsk_QOaHS3w-f4o9YGKC7-SGnbxjL-gYs",
        "https://i.picsum.photos/id/472/1600/900.jpg?hmac=cJXH8mmVnA5T7ANzeba0ENj2FbeqY5IDtBV93K5LN3k",
        "https://i.picsum.photos/id/1010/1600/900.jpg?hmac=HoXflT6FHWJ9M9NhwYei-NW5i_JMOLrwVgaM09xImNY",
        "https://i.picsum.photos/id/117/1600/900.jpg?hmac=QT_Gf0XRgFA0TX5Yzl_RT43bCYc6-IZ0-u1mUPpo4eA",
        "https://i.picsum.photos/id/998/1600/900.jpg?hmac=DzpAhEuWH2FV45EUghRnPNmIWaBJ4PGYdVeV9abjG8g",
        "https://i.picsum.photos/id/634/1600/900.jpg?hmac=TTJWiX8IB2FkP3T2LZrq4j4yjKjm36z-YrDTEOIRyRE",
        "https://i.picsum.photos/id/238/1600/900.jpg?hmac=A4Y1CgyEWqql5fGn2NqcsSNB91bBXj2H5Z92MeRwp-8",
        "https://i.picsum.photos/id/566/1600/900.jpg?hmac=t398sGbtxmpZ_1RlvvbN92TenohHi407AtYWrXeL1m0",
        "https://i.picsum.photos/id/860/1600/900.jpg?hmac=4XbZwGn3hgE9yDcSZERt9BrEb5_smJdputUgU6GE57g",
        "https://i.picsum.photos/id/818/1600/900.jpg?hmac=8ul3U8Wc0fyjL4xm7bTid8TiEUhGLhjzloxV6UFSGpk",
        "https://i.picsum.photos/id/201/1600/900.jpg?hmac=LIiWibDAd159s76X2rzNc2wED9TT4M2m_Q2RWFOb3F4",
        "https://i.picsum.photos/id/219/1600/900.jpg?hmac=ylbag6iO_IHEX1wZDTSQ3PutD25jF5c_7z5VLewMhc4",
        "https://i.picsum.photos/id/1004/1600/900.jpg?hmac=hUELk50uKWiGquy-XgiD4SEZDG4UDz68EfbLnVdxB90",
        "https://i.picsum.photos/id/195/1600/900.jpg?hmac=LNKSUnxnoXEfZX0FxrSJImzgxtqfSLpj4fPv-Lp1RAQ",
        "https://i.picsum.photos/id/431/1600/900.jpg?hmac=EkiB8snhMSAuWHVhG9gJInIIYgf6iG6BnNRA-RE11wU",
        "https://i.picsum.photos/id/494/1600/900.jpg?hmac=gnb1fRJ2InsXeywgtl_fPkthWgdZqxluPPdTWUTvBPo",
        "https://i.picsum.photos/id/100/1600/900.jpg?hmac=BV8Tw5g5zJKiE4dsy-UqmEXX9Auz22jcLXDOe5PJ_8M",
        "https://i.picsum.photos/id/249/1600/900.jpg?hmac=tLwe8PO4DEf3m_zzCeinray5vWLs2WHnkSezOYMGbUA",
        "https://i.picsum.photos/id/482/1600/900.jpg?hmac=j9HXHzjbLk7gZDSalYG2JjaHoUnRH8OFFQksTvEK0r8",
        "https://i.picsum.photos/id/142/1600/900.jpg?hmac=CzwrlM-f-ANAEEP1fZ5fg0-dCSXETvF1wUBRLfIoZoU",
        "https://i.picsum.photos/id/481/1600/900.jpg?hmac=uQmBPDkmrsxiIfKGcCbXNaL4hLyyEZz3Uq0KJP4Lr_8",
        "https://i.picsum.photos/id/34/1600/900.jpg?hmac=eaO4nvlAAok7y0bKogqqmnyL81NzZssK_MDvuBMSCIQ",
        "https://i.picsum.photos/id/941/1600/900.jpg?hmac=piMvr8zogtVzZ-oV39SPv8EfSVHSw6UoN_R6iR5Ol80",
        "https://i.picsum.photos/id/814/1600/900.jpg?hmac=x5Fw9owfvW0M1PeBfq6osqf9COz444T9Qt6rpPNWvEQ",
        "https://i.picsum.photos/id/1016/1600/900.jpg?hmac=n1qDFlum2aw6_QgioKJpFtV8CIv-BdnWQgq303cM-Es",
        "https://i.picsum.photos/id/845/1600/900.jpg?hmac=g0DtP0yUpIVh9cgHsgU5hp6Bq5WjufJLlcxvNSslKHs",
        "https://i.picsum.photos/id/757/1600/900.jpg?hmac=xB17QkxH_kqjV6K0R7-EZkW2xTq8iukba_wZ6wo5d4Q",
        "https://i.picsum.photos/id/444/1600/900.jpg?hmac=HuFTo7RyhY1iqVcsNtGiR2QTtwHS2iPWE9HzzegMSd0",
        "https://i.picsum.photos/id/515/1600/900.jpg?hmac=judN4I8eWzO_ZA4ajm_xNP4CdOHgaHDpfiFoC0j1RFw",
        "https://i.picsum.photos/id/268/1600/900.jpg?hmac=P9o0zH7vYnBn8IYDhugPzdIZf76ytyCaLNdXdI-jh3s",
        "https://i.picsum.photos/id/375/1600/900.jpg?hmac=XZUSndoKxDX_fyNgDJgYKOp0e0Q5nmFi-BfxbH-IFrA",
        "https://i.picsum.photos/id/131/1600/900.jpg?hmac=St8yXi-WbejBEiC9HRgknBPifWI9raAGmx6Fn3A1jFo",
        "https://i.picsum.photos/id/1035/1600/900.jpg?hmac=7Tl-vjvaZXPSoOsut4E8a5FYTdX6apSdPKa4-y-293g",
        "https://i.picsum.photos/id/309/1600/900.jpg?hmac=VR3yfI29TvMLwgtHAcB2tH9i4ErKZT61w1y9rqdmZtA",
        "https://i.picsum.photos/id/157/1600/900.jpg?hmac=oYsrYA8RknCGVBIHMp0Dia0AbJej4tbwxYkmzGocYEk",
        "https://i.picsum.photos/id/866/1600/900.jpg?hmac=d5HTMqeehDxpdrZ5vaZmyyN7OolfvQqG7d94fknDrM4",
        "https://i.picsum.photos/id/765/1600/900.jpg?hmac=nCr58L9jcnG9XNYBTB0yeQCA9qTQosmr1kYLm9pMlYY",
        "https://i.picsum.photos/id/212/1600/900.jpg?hmac=hDvbzi0JUlxKe1-YbfuVTiwAzdcMUYmDJc2Y95E5pWk",
        "https://i.picsum.photos/id/295/1600/900.jpg?hmac=XTkl2S6MVEiv13oR8CAg7K1N4sFvahbmV-xCIj57Ofk"
    )


    val contactList = MutableList<Contact>(100) { index ->
        Contact(
            "User #${index + 1}",
            "Surname #${index + 1}",
            "number ${index + 1}",
            pictures[index]
        )
    }

//    fun createListImages() = MutableList<String>(100) {
//        val link: String
//        val con: URLConnection = URL("https://picsum.photos/200").openConnection()
//        con.connect()
//        val inputStream = con.getInputStream()
//        link = con.url.toString()
//        inputStream.close()
//        link
//    }
//    С помощью этого метода получаю 100 редиректнутых ссылок, но так и не разобрался, как их
//    подготовить заранее
//    поэтому...хардкод...
//    ЗЫ: не бань =) очень хочется разобраться как с этим справиться,
//    ответь по возможности развёрнуто в личку в тг


}

