package com.scsb.ncbs.dep.batch.bean.jln801y;

import com.ibm.cbmp.fabric.foundation.fixedformat.annotation.Spec;
import lombok.Data;

/**
 * JLN800B.TXT OUTPUTF_REC（標頭標示 LEN=315，依各欄位位置實際加總為 300 BYTES，
 * 以位置加總結果為準）
 * 註：LN_AMT/LN_OS_AMT/TOT_INT_AMT 為 PIC'ZZZ,ZZZ,ZZZ,ZZ9V.99' 編輯型數字，
 * 含千分位逗號與小數點等實際存放字元，採 String 表示。
 */
@Data
public class Jln800bDto {

    /** 中文姓名 */
    @Spec(length = 12)
    private String custName;

    /** 地址前段 */
    @Spec(length = 42)
    private String addr1;

    /** 地址後段 */
    @Spec(length = 42)
    private String addr2;

    /** 中文姓名 */
    @Spec(length = 12)
    private String custName1;

    /** 客戶統一編號 */
    @Spec(length = 11)
    private String custIdno;

    /** 放款帳號 */
    @Spec(length = 17)
    private String lnAcno;

    /** 撥貸總額（含千分位/小數點編輯格式） */
    @Spec(length = 18)
    private String lnAmt;

    /** 最初撥貸日 */
    @Spec(length = 9)
    private String lnStrDat;

    /** 到期日 */
    @Spec(length = 9)
    private String lnDueDat;

    /** 放款餘額（含千分位/小數點編輯格式） */
    @Spec(length = 18)
    private String lnOsAmt;

    /** 交易年分(去年) */
    @Spec(length = 3)
    private String yearStr;

    /** 起始月份 */
    @Spec(length = 2)
    private String mmStr;

    /** 交易年分(去年) */
    @Spec(length = 3)
    private String yearEnd;

    /** 終止月份 */
    @Spec(length = 2)
    private String mmEnd;

    /** 繳交利息總額（含千分位/小數點編輯格式） */
    @Spec(length = 18)
    private String totIntAmt;

    /** 放款方式代號 */
    @Spec(length = 4)
    private String glNo;

    /** 放款方式 */
    @Spec(length = 14)
    private String glDesc;

    /** PHS專案代碼 */
    @Spec(length = 62)
    private String proj;

    /** CHAR_1 */
    @Spec(length = 1)
    private String char1;

    /** FIL */
    @Spec(length = 1)
    private String fil;
}
