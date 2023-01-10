/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
package io.holoinsight.server.storage.web;

import io.holoinsight.server.common.springboot.ConditionalOnFeature;
import io.holoinsight.server.storage.web.impl.EndpointApiController;
import io.holoinsight.server.storage.web.impl.MetricApiController;
import io.holoinsight.server.storage.web.impl.ServiceApiController;
import io.holoinsight.server.storage.web.impl.ServiceInstanceApiController;
import io.holoinsight.server.storage.web.impl.SlowSqlApiController;
import io.holoinsight.server.storage.web.impl.TopologyApiController;
import io.holoinsight.server.storage.web.impl.TraceApiController;
import io.holoinsight.server.storage.web.impl.VirtualComponentApiController;
import io.holoinsight.server.storage.web.initializer.TatrisInitializer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * created at 2022/11/30
 *
 * @author jiwliu
 */
@Configuration
@ConditionalOnFeature("trace")
public class StorageWebConfiguration {
  @Bean
  public TatrisInitializer tatrisInitializer() {
    return new TatrisInitializer();
  }

  @Bean
  public EndpointApiController endpointApiController() {
    return new EndpointApiController();
  }

  @Bean
  public MetricApiController metricApiController() {
    return new MetricApiController();
  }

  @Bean
  public ServiceApiController serviceApiController() {
    return new ServiceApiController();
  }

  @Bean
  public ServiceInstanceApiController serviceInstanceApiController() {
    return new ServiceInstanceApiController();
  }

  @Bean
  public TopologyApiController topologyApiController() {
    return new TopologyApiController();
  }

  @Bean
  public TraceApiController traceApiController() {
    return new TraceApiController();
  }

  @Bean
  public VirtualComponentApiController virtualComponentApiController() {
    return new VirtualComponentApiController();
  }

  @Bean
  public SlowSqlApiController slowSqlApiController() {
    return new SlowSqlApiController();
  }

}
