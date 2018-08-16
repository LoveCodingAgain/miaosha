package com.lx.miaosha.vo;

import com.lx.miaosha.domain.OrderInfo;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderDetailVo {
	private GoodsVo goods;
	private OrderInfo order;
}
