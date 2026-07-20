package com.scsb.ncbs.dep.batch.bean.lftacn0;

import com.ibm.cbmp.fabric.foundation.fixedformat.annotation.Spec;
import lombok.Data;

/**
 * IBS1.FTACN0.POINT（384 BYTES）
 */
@Data
public class PointDto {

    /**
     * 歸戶號碼 1-11
     */
    @Spec(length = 11)
    private String inactNo;

    /**
     * 贈點代碼 12-23
     */
    @Spec(length = 12)
    private String pointCode;

    /**
     * 點數 24-33
     */
    @Spec(length = 10)
    private String point;

    /**
     * 承作日期 34-41
     */
    @Spec(length = 8)
    private String opnDte;

    /**
     * ec日期 42-49
     */
    @Spec(length = 8)
    private String ecDte;

    /**
     * 交易序號1（'ITM'） 50-52
     */
    @Spec(length = 3)
    private String serNo1;

    /**
     * 交易序號2（OPN_DTE後六碼） 53-58
     */
    @Spec(length = 6)
    private String serNo2;

    /**
     * 交易序號3（'000000'） 59-64
     */
    @Spec(length = 6)
    private String serNo3;

    /**
     * 參考編號1（PB_ACN,綜存帳號） 65-78
     */
    @Spec(length = 14)
    private String refNo1;

    /**
     * 參考編號2 79-84
     */
    @Spec(length = 6)
    private String refNo2;

    /**
     * 註記1（TD_ACN,定存帳號） 85-98
     */
    @Spec(length = 14)
    private String notes1;

    /**
     * 註記2 99-99
     */
    @Spec(length = 1)
    private String notes2;

    /**
     * 註記3（ACT_NO_STS 帳號狀態：1凍結戶 2結清戶 5死亡戶 6已移出戶 9正常戶 T轉期戶） 100-100
     */
    @Spec(length = 1)
    private String notes3;

    /**
     * FILLER 101-384
     */
    @Spec(length = 284)
    private String filler;
}
