package com.lx.miaosha.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MiaoshaOrder {
	private Long id;
	private Long userId;
	private Long  orderId;
	private Long goodsId;
}
