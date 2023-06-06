/**
 * @projectName StartOne
 * @package com.aenum
 * @className com.aenum.PayTypeEnum
 */
package com.aenum;

import com.sun.tools.javac.util.StringUtils;

/**
 * PayTypeEnum
 * @description 支付枚举类
 * @author shujingping
 * @date 2022/12/9 9:58 上午
 * @version 1.0
 */
public enum PayTypeEnum {
    // 支付方式
    WEI_XIN_MINI_APP("1", "wxma", "微信小程序支付"),
    WEI_XIN_H5("2", "wxh5", "微信H5支付"),
    ZFB_MINI_APP("3", "zfbma", "支付宝小程序支付"),
    ZFB_H5("4", "zfbh5", "支付宝生活号支付"),
    WEI_XIN_MEDICAL("5", "wxmedical", "微信医保支付");

    private final String id;
    private final String code;
    private final String label;

    PayTypeEnum(String id, String code, String label) {
        this.id = id;
        this.code = code;
        this.label = label;
    }

    public String getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getLabel() {
        return label;
    }

    /**
     * 根据id获取枚举对象
     * @param id
     */
    public static PayTypeEnum findById(String id) {
        for (PayTypeEnum type: PayTypeEnum.values()) {
            if (type.getId().equals(id)) {
                return type;
            }
        }
        return null;
    }
    /**
     * 根据code获取枚举对象
     * @param code
     */
    public static PayTypeEnum findByCode(String code) {
        for (PayTypeEnum type: PayTypeEnum.values()) {
            if (type.getCode().equals(code)) {
                return type;
            }
        }
        return null;
    }

    /**
     * 检查支付类型是否有效
     * @param id
     */


}
