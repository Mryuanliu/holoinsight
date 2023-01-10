/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
package com.alipay.cloudmonitor.registry.integration.model.alicloud;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author zzhb101
 * @version : AlicloudConf.java, v 0.1 2022年06月16日 10:27 wanpeng.xwp Exp $
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlicloudConf {
  private String accountId;
  private String accessKeyId;
  private String accessKeySecret;
  private String filters;
  private List<String> rangeNames;
  private Range range;
}
