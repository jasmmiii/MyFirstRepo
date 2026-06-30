package com.scsb.ncbs.dep.batch.bean.ftppu;

import com.ibm.cbmp.fabric.foundation.fixedformat.annotation.Spec;
import lombok.Data;

import java.math.BigDecimal;

/**
 * FSSTR3 整批入/扣帳主檔 (INBOUND) 撥款/扣款檔回饋檔（350 BYTES）
 * 適用 ICMPAQBR(撥款) / ICMPAQB_FEER(扣款) 及其 .END 檔，結構相同
 */
@Data
public class Fsstr3InboundDto {

    /** 序號 */
    @Spec(length = 6)
    private Long seqNo;

    /** 交易種類 0一般 1更正 3授權一般 4授權更正 *最後一筆 */
    @Spec(length = 1)
    private String tranType;

    /** 交易模式 9:PURE BATCH */
    @Spec(length = 1)
    private String tranMode;

    /** 櫃員代號 */
    @Spec(length = 6)
    private String tlrNo;

    /** 主管代號(A) */
    @Spec(length = 6)
    private String spvNoA;

    /** 主管代號(B) */
    @Spec(length = 6)
    private String spvNoB;

    /** 資料長度 */
    @Spec(length = 3)
    private Integer dataLen;

    /** 押碼 */
    @Spec(length = 4)
    private String mac;

    /** 處理訊息 */
    @Spec(length = 4)
    private String prsCod;

    /** 交易序號 */
    @Spec(length = 6)
    private String srlno;

    /** 扣帳前可用金額(含符號位) */
    @Spec(length = 15, decimal = 2)
    private BigDecimal actBalP;

    /** 扣帳後可用金額(含符號位) */
    @Spec(length = 15, decimal = 2)
    private BigDecimal actBal;

    /** 抵用交換金額(含符號位) */
    @Spec(length = 15, decimal = 2)
    private BigDecimal fltNddAmt;

    /** 電話號碼 */
    @Spec(length = 35)
    private String outputFiller;

    /** 扣帳方式 1扣客戶帳連動入客戶帳 2扣客戶帳連動入會計帳 3扣會計帳連動入客戶帳 4扣會計帳連動入會計帳 */
    @Spec(length = 1)
    private String paymth;

    /** DELIMETER1 X'2E' */
    @Spec(length = 1)
    private String filler1 = ".";

    /** 借方帳號 */
    @Spec(length = 14)
    private String acn;

    /** DELIMETER2 X'2E' */
    @Spec(length = 1)
    private String filler2 = ".";

    /** 細目 */
    @Spec(length = 2)
    private String pitcyc;

    /** DELIMETER2 X'2E' */
    @Spec(length = 1)
    private String filler3 = ".";

    /** 金額 */
    @Spec(length = 14, decimal = 2)
    private BigDecimal amt;

    /** DELIMETER3 X'2E' */
    @Spec(length = 1)
    private String filler4 = ".";

    /** 備註 */
    @Spec(length = 16)
    private String ref;

    /** DELIMETER4 X'2E' */
    @Spec(length = 1)
    private String filler5 = ".";

    /** 貸方帳號(1)/會計 */
    @Spec(length = 14)
    private String cracn;

    /** DELIMETER5 X'2E' */
    @Spec(length = 1)
    private String filler6 = ".";

    /** 細目 */
    @Spec(length = 2)
    private String spitrg;

    /** DELIMETER5 X'2E' */
    @Spec(length = 1)
    private String filler7 = ".";

    /** 金額 */
    @Spec(length = 14, decimal = 2)
    private BigDecimal tramt;

    /** DELIMETER5 X'2E' */
    @Spec(length = 1)
    private String filler8 = ".";

    /** 備註 */
    @Spec(length = 16)
    private String ref1;

    /** DELIMETER6 X'2E' */
    @Spec(length = 1)
    private String filler9 = ".";

    /** 貸方會計(2) */
    @Spec(length = 16)
    private String bnkacn;

    /** DELIMETER6 X'2E' */
    @Spec(length = 1)
    private String fillerA = ".";

    /** 金額 */
    @Spec(length = 14, decimal = 2)
    private BigDecimal blamt;

    /** DELIMETER6 X'2E' */
    @Spec(length = 1)
    private String fillerB = ".";

    /** 扣帳業務種類 */
    @Spec(length = 2)
    private String attrcod;

    /** 交易日(TC日) */
    @Spec(length = 8)
    private String trDat;

    /** MAC_DATA */
    @Spec(length = 8)
    private String macData;

    /** FILLER */
    @Spec(length = 75)
    private String filler;
}
