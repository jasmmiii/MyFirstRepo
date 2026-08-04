package com.scsb.ncbs.dep.batch.bean.jln801y;

import com.ibm.cbmp.fabric.foundation.fixedformat.annotation.Spec;
import lombok.Data;

/**
 * JLN800Y.TXT OUTPUTF_REC（350 BYTES）
 */
@Data
public class Jln800yDto {

    /** 民國年分 */
    @Spec(length = 3)
    private String year;

    /** 銀行代號 */
    @Spec(length = 3)
    private String bank;

    /** 分行代碼 */
    @Spec(length = 4)
    private String branch;

    /** 地址 */
    @Spec(length = 120)
    private String location;

    /** 戶名 */
    @Spec(length = 40)
    private String houseName;

    /** 統一編號 */
    @Spec(length = 10)
    private String houseIdno;

    /** 核准號 */
    @Spec(length = 7)
    private String houseAprov;

    /** 中文姓名 */
    @Spec(length = 42)
    private String name;

    /** 客戶統一編號 */
    @Spec(length = 10)
    private String id;

    /** 放款帳號 */
    @Spec(length = 50)
    private String acno;

    /** 撥貸總額 */
    @Spec(length = 10)
    private Long lnAmt;

    /** 最初撥貸日 */
    @Spec(length = 7)
    private String strDat;

    /** 到期日 */
    @Spec(length = 7)
    private String endDat;

    /** 放款餘額 */
    @Spec(length = 10)
    private Long lnOsAmt;

    /** 去年交易起始月 */
    @Spec(length = 5)
    private String strIntDat;

    /** 去年交易終止月 */
    @Spec(length = 5)
    private String endIntDat;

    /** 繳交利息總額 */
    @Spec(length = 10)
    private Long lnInt;

    /** 分行 */
    @Spec(length = 2)
    private String brh;

    /** FIL */
    @Spec(length = 5)
    private String fil;
}
