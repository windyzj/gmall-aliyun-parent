package com.atguigu.gmall.aliyun.logger.bean;


import lombok.Data;

/**
 * 商品曝光日志
 */
@Data
public class AppDisplay {

      int itemid;//商品ID（服务端下发的ID）
      int place;//顺序（第几条商品，第一条为0，第二条为1，如此类推）
      String extend1;//曝光类型：1 - 首次曝光 2-重复曝光（没有使用）
      int category;//分类ID（服务端定义的分类ID）
}
