package com.atguigu.gmall.aliyun.logger.bean;

import lombok.Data;

@Data
public class AppPraise {
      int id; //主键id
      int itemid;//点赞的对象id
      int type;//点赞类型 1问答点赞 2问答评论点赞 3 文章点赞数4 评论点赞
}
