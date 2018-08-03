package cn.xlbweb.cms.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author: bobi
 * @date: 2018/7/31 15:48
 * @description:
 */
@Table(name = "t_order")
@Entity
@Data
public class Order {

    /**
     * 订单id
     */
    @Id
    private String id;
    /**
     * 实付金额
     */
    private String payment;
    /**
     * 支付类型:1微信支付 2支付宝支付
     */
    private Integer paymentType;
    /**
     * 邮费
     */
    private String postage;
    /**
     * 状态:1未付款 2已付款 3未发货 4已发货 5交易成功 6交易关闭
     */
    private int status;
    /**
     * 订单创建时间
     */
    private Date createTime;
    /**
     * 支付时间
     */
    private Date paymentTime;
    /**
     * 发货时间
     */
    private Date consignTime;
    /**
     * 交易完成时间
     */
    private Date endTime;
    /**
     * 交易关闭时间
     */
    private Date closeTime;
    /**
     * 物流名称
     */
    private String shippingName;
    /**
     * 物流单号
     */
    private String shippingCode;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 买家留言
     */
    private String buyerMessage;
    /**
     * 买家昵称
     */
    private String buyerNickname;
    /**
     * 买家是否已评价:0已评价 1未评价
     */
    private Integer buyerRate;
}
