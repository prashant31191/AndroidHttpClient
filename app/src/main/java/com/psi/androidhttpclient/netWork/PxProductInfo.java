package com.psi.androidhttpclient.netWork;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS
// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

/**
 * Entity mapped to table "ProductInfo".
 */
public class PxProductInfo implements java.io.Serializable {

    private Long id;
    /**
     * 对应服务器id
     */
     @SerializedName("id") @Expose
    private String objectId;
    /**
     * 商品名称
     */
     @Expose
    private String name;
    /**
     * 中文拼音首字母缩写（由程序生成
     */
     @Expose
    private String py;
    /**
     * 商品编码
     */
     @Expose
    private String code;
    /**
     * 商品单价
     */
     @Expose
    private Double price;
    /**
     * 会员特价（默认与商品价格一致）
     */
     @Expose
    private Double vipPrice;
    /**
     * 结账单位
     */
     @Expose
    private String unit;
    /**
     * 是否多单位菜（0：是 1：否
     */
     @Expose
    private String multipleUnit;
    /**
     * 点菜单位
     */
     @Expose
    private String orderUnit;
    /**
     * 允许打折（0：允许 1：不允许）
     */
     @Expose
    private String isDiscount;
    /**
     * 是否为赠品(0：是  1 ：否)
     */
     @Expose
    private String isGift;
    /**
     * 商品发送后厨是否出单(0:出单 1：不出单)
     */
     @Expose
    private String isPrint;
    /**
     * 是否允许收银改价（0：是 1：否）
     */
     @Expose
    private String changePrice;
    /**
     * 商品状态 (0:正常 1：停售)
     */
     @Expose
    private String status;
    /**
     * 是否为自定义商品
     */
     @Expose
    private Boolean isCustom;
    /**
     * 虚拟删除 0：正常 1：删除 2：审核
     */
     @Expose
    private String delFlag;
    /**
     * 是否已上传(只针对自定义商品)
     */
     @Expose
    private Boolean isUpLoad;
    /**
     * 条码
     */
     @Expose
    private String barCode;
    /**
     * 剩余数量
     */
     @Expose
    private Double overPlus;
    /**
     * 0:普通分类 1：套餐分类
     */
     @Expose
    private String type;
    /**
     * 上架 (0:上架  1：下架)
     */
     @Expose
    private String shelf;
    /**
     * 是否在微信点餐页面显示 0：显示 1：不显示
     */
     @Expose
    private String visible;
    /**
     * 销售数量
     */
     @Expose
    private Integer saleNum;
    /**
     * 使用标签打印机打印(0打印 1不打印)
     */
     @Expose
    private String isLabel;
    /**
     * 商品短名称
     */
     @Expose
    private String shortName;
    private long pxProductCategoryId;



    // KEEP FIELDS - put your custom fields here
  public static final String IS_PRINT = "0";//商品发送后厨是否出单(0:出单 1：不出单)
  public static final String IS_NOT_PRINT = "1";//商品发送后厨是否出单(0:出单 1：不出单)

  public static final String IS_GIFT = "0";//是赠品
  public static final String IS_NOTGIFT = "1";//不是赠品

  public static final String STATUS_ON_SALE = "0";//正常
  public static final String STATUS_STOP_SALE = "1";//停售

  public static final String IS_DISCOUNT_TRUE = "0";//打折
  public static final String IS_DISCOUNT_FALSE = "1";//不打折

  public static final String IS_TWO_UNIT_TURE = "0";//双单位
  public static final String IS_TWO_UNIT_FALSE = "1";//非双单位

  //是否允许收银改价（0：是 1：否）
  public static final String IS_ALLOW_CHANGE_PRICE = "0";
  public static final String IS_NOT_ALLOW_CHANGE_PRICE = "1";
  //pad端json解析
  @Expose
  private Long productId;


  public static final String TYPE_ORIGINAL = "0";//类型普通
  public static final String TYPE_COMBO = "1";//类型套餐

  public static final String SHELF_PUT_AWAY = "0";//上架
  public static final String SHELF_SOLD_OUT = "1";//下架
  //是否在微信点餐页面显示 0：显示 1：不显示
  public static final String SHOW_ON_WX = "0";
  public static final String NO_SHOW_ON_WX = "1";
  //使用标签打印机打印(0打印 1不打印)
  public static final String PRINT_LABEL_TRUE = "0";
  public static final String PRINT_LABEL_FALSE = "1";
    // KEEP FIELDS END

    public PxProductInfo() {
    }

    public PxProductInfo(Long id) {
        this.id = id;
    }

    public PxProductInfo(Long id, String objectId, String name, String py, String code, Double price, Double vipPrice, String unit, String multipleUnit, String orderUnit, String isDiscount, String isGift, String isPrint, String changePrice, String status, Boolean isCustom, String delFlag, Boolean isUpLoad, String barCode, Double overPlus, String type, String shelf, String visible, Integer saleNum, String isLabel, String shortName, long pxProductCategoryId) {
        this.id = id;
        this.objectId = objectId;
        this.name = name;
        this.py = py;
        this.code = code;
        this.price = price;
        this.vipPrice = vipPrice;
        this.unit = unit;
        this.multipleUnit = multipleUnit;
        this.orderUnit = orderUnit;
        this.isDiscount = isDiscount;
        this.isGift = isGift;
        this.isPrint = isPrint;
        this.changePrice = changePrice;
        this.status = status;
        this.isCustom = isCustom;
        this.delFlag = delFlag;
        this.isUpLoad = isUpLoad;
        this.barCode = barCode;
        this.overPlus = overPlus;
        this.type = type;
        this.shelf = shelf;
        this.visible = visible;
        this.saleNum = saleNum;
        this.isLabel = isLabel;
        this.shortName = shortName;
        this.pxProductCategoryId = pxProductCategoryId;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPy() {
        return py;
    }

    public void setPy(String py) {
        this.py = py;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getVipPrice() {
        return vipPrice;
    }

    public void setVipPrice(Double vipPrice) {
        this.vipPrice = vipPrice;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getMultipleUnit() {
        return multipleUnit;
    }

    public void setMultipleUnit(String multipleUnit) {
        this.multipleUnit = multipleUnit;
    }

    public String getOrderUnit() {
        return orderUnit;
    }

    public void setOrderUnit(String orderUnit) {
        this.orderUnit = orderUnit;
    }

    public String getIsDiscount() {
        return isDiscount;
    }

    public void setIsDiscount(String isDiscount) {
        this.isDiscount = isDiscount;
    }

    public String getIsGift() {
        return isGift;
    }

    public void setIsGift(String isGift) {
        this.isGift = isGift;
    }

    public String getIsPrint() {
        return isPrint;
    }

    public void setIsPrint(String isPrint) {
        this.isPrint = isPrint;
    }

    public String getChangePrice() {
        return changePrice;
    }

    public void setChangePrice(String changePrice) {
        this.changePrice = changePrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getIsCustom() {
        return isCustom;
    }

    public void setIsCustom(Boolean isCustom) {
        this.isCustom = isCustom;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public Boolean getIsUpLoad() {
        return isUpLoad;
    }

    public void setIsUpLoad(Boolean isUpLoad) {
        this.isUpLoad = isUpLoad;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Double getOverPlus() {
        return overPlus;
    }

    public void setOverPlus(Double overPlus) {
        this.overPlus = overPlus;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

    public Integer getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    public String getIsLabel() {
        return isLabel;
    }

    public void setIsLabel(String isLabel) {
        this.isLabel = isLabel;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public long getPxProductCategoryId() {
        return pxProductCategoryId;
    }

    public void setPxProductCategoryId(long pxProductCategoryId) {
        this.pxProductCategoryId = pxProductCategoryId;
    }



    // KEEP METHODS - put your custom methods here

  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

    // KEEP METHODS END

  @Override public String toString() {
    return "PxProductInfo{" +
        "id=" + id +
        ", objectId='" + objectId + '\'' +
        ", name='" + name + '\'' +
        ", py='" + py + '\'' +
        ", code='" + code + '\'' +
        ", price=" + price +
        ", vipPrice=" + vipPrice +
        ", unit='" + unit + '\'' +
        ", multipleUnit='" + multipleUnit + '\'' +
        ", orderUnit='" + orderUnit + '\'' +
        ", isDiscount='" + isDiscount + '\'' +
        ", isGift='" + isGift + '\'' +
        ", isPrint='" + isPrint + '\'' +
        ", changePrice='" + changePrice + '\'' +
        ", status='" + status + '\'' +
        ", isCustom=" + isCustom +
        ", delFlag='" + delFlag + '\'' +
        ", isUpLoad=" + isUpLoad +
        ", barCode='" + barCode + '\'' +
        ", overPlus=" + overPlus +
        ", type='" + type + '\'' +
        ", shelf='" + shelf + '\'' +
        ", visible='" + visible + '\'' +
        ", saleNum=" + saleNum +
        ", isLabel='" + isLabel + '\'' +
        ", shortName='" + shortName + '\'' +
        ", pxProductCategoryId=" + pxProductCategoryId +
        ", productId=" + productId +
        '}';
  }
}
