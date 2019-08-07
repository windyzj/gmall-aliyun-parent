package com.atguigu.gmall.aliyun.logger.bean;

import lombok.Data;

@Data
public class AppComment {

      int comment_id;//评论表
      int itemid;//用户id
      int p_comment_id;//父级评论id(为0则是一级评论,不为0则是回复)
      String content;//评论内容
      int other_id;//评论的相关id
      int praise_count;//点赞数量
      int reply_count;//回复数量

}
