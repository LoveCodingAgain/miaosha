package com.lx.miaosha.vo;

import com.lx.miaosha.domain.Goods;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
public class GoodsVo extends Goods {
	private Double miaoshaPrice;
	private Integer stockCount;
	private Date startDate;
	private Date endDate;
}
