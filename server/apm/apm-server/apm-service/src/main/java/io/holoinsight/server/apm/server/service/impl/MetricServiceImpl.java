/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
package io.holoinsight.server.apm.server.service.impl;

import io.holoinsight.server.apm.common.model.query.Duration;
import io.holoinsight.server.apm.common.model.query.MetricValues;
import io.holoinsight.server.apm.engine.postcal.MetricDefine;
import io.holoinsight.server.apm.engine.postcal.MetricsManager;
import io.holoinsight.server.apm.engine.storage.MetricStorage;
import io.holoinsight.server.apm.server.service.MetricService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class MetricServiceImpl implements MetricService {

  @Autowired
  protected MetricStorage metricStorage;

  @Autowired
  private MetricsManager metricsManager;

  @Override
  public List<String> listMetrics() {
    return metricsManager.listMetrics();
  }

  @Override
  public List<MetricDefine> listMetricDefines() {
    return metricsManager.listMetricDefines();
  }

  @Override
  public MetricDefine getMetricDefine(String metric) {
    return metricsManager.getMetric(metric);
  }

  @Override
  public MetricValues queryMetric(String tenant, String metric, Duration duration,
      Map<String, Object> conditions) throws Exception {
    return metricStorage.queryMetric(tenant, metric, duration, conditions);
  }

  @Override
  public List<String> querySchema(String metric) {
    return metricStorage.querySchema(metric);
  }
}
