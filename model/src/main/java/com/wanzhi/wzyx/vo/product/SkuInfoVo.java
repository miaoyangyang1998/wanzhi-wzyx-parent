package com.wanzhi.wzyx.vo.product;

import com.wanzhi.wzyx.model.product.*;
import com.wanzhi.wzyx.model.product.SkuAttrValue;
import com.wanzhi.wzyx.model.product.SkuImage;
import com.wanzhi.wzyx.model.product.SkuInfo;
import com.wanzhi.wzyx.model.product.SkuPoster;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class SkuInfoVo extends SkuInfo {

	@ApiModelProperty(value = "海报列表")
	private List<SkuPoster> skuPosterList;

	@ApiModelProperty(value = "属性值")
	private List<SkuAttrValue> skuAttrValueList;

	@ApiModelProperty(value = "图片")
	private List<SkuImage> skuImagesList;

}

