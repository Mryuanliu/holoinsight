/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
package io.holoinsight.server.home.web.common;

import io.holoinsight.server.home.common.util.MonitorException;
import io.holoinsight.server.home.common.util.ResultCodeEnum;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Parameter checker
 * 
 * @author jsy1001de
 * @version 1.0: ParaCheckUtil.java, v 0.1 2022-03-15 13:14
 */
public class ParaCheckUtil {
  private static final Pattern PATTERN = Pattern.compile("^[a-z][a-z0-9\\-]*[a-z0-9]$");

  private static final Pattern PATTERN_NEW = Pattern.compile("^[a-z]{1,20}");

  private static final Pattern PATTERN_SYSTEM = Pattern.compile("^[a-z]{1,20}");

  private static final Pattern PATTERN_CLUSTER = Pattern.compile("^[a-z][a-z0-9\\-]{1,20}");

  private static final Pattern PATTERN_APPLICATION = Pattern.compile("^[a-z]{1,20}");

  private static Pattern PATTERN_SQL = Pattern.compile("^[A-Za-z0-9\\u4e00-\\u9fa5\\-_ ,\\.]*$");

  private static final Pattern PATTERN_AIG_NAME =
      Pattern.compile("^[a-z]{1,20}-[a-z][a-z0-9]{0,27}");

  private static Pattern uniCodePattern = Pattern.compile("\\\\u[0-9a-f]{4}");

  /**
   * Check whether the object param is null.
   *
   * @param object
   */
  public static void checkParaNotNull(Object object, String errorMsg) {
    if (object == null) {
      throw new MonitorException(ResultCodeEnum.PARAMETER_ILLEGAL, errorMsg);
    }
  }

  /**
   * Check time range
   *
   */
  public static void checkTimeRange(Long start, Long end, String errorMsg) {
    if (start > end) {
      throw new MonitorException(ResultCodeEnum.PARAMETER_ILLEGAL, errorMsg);
    }
  }

  /**
   * Check whether the string param is blank.
   *
   * @param param
   * @param errorMsg
   */
  public static void checkParaNotBlank(String param, String errorMsg) {
    if (StringUtils.isBlank(param)) {
      throw new MonitorException(ResultCodeEnum.PARAMETER_ILLEGAL, errorMsg);
    }
  }


  public static void checkParaStartWith(String param, String startString, String errorMsg) {
    if (StringUtils.isBlank(param) || !param.startsWith(startString)) {
      throw new MonitorException(ResultCodeEnum.PARAMETER_ILLEGAL, errorMsg);
    }
  }

  /**
   * Check whether the integer param is negative.
   */
  public static void checkParaNotNegative(Integer param, String errorMsg) {
    if (param == null || param < 0) {
      throw new MonitorException(ResultCodeEnum.PARAMETER_ILLEGAL, errorMsg);
    }
  }

  /**
   * Check whether the collection param is empty.
   */
  public static void checkParaNotEmpty(Collection<?> collection, String errorMsg) {
    if (CollectionUtils.isEmpty(collection)) {
      throw new MonitorException(ResultCodeEnum.PARAMETER_ILLEGAL, errorMsg);
    }
  }

  /**
   * Check whether the map param is empty.
   */
  public static void checkParaNotEmpty(Map<?, ?> map, String errorMsg) {
    if (CollectionUtils.isEmpty(map)) {
      throw new MonitorException(ResultCodeEnum.PARAMETER_ILLEGAL, errorMsg);
    }
  }

  /**
   * Check whether the array param is empty.
   */
  public static void checkParaNotEmpty(String[] array, String errorMsg) {
    if (ArrayUtils.isEmpty(array)) {
      throw new MonitorException(ResultCodeEnum.PARAMETER_ILLEGAL, errorMsg);
    }
  }

  /**
   * Check whether the obj1 equals with obj2.
   */
  public static void checkEquals(Object obj1, Object obj2, String errorMsg) {
    if (!ObjectUtils.equals(obj1, obj2)) {
      throw new MonitorException(ResultCodeEnum.PARAMETER_ILLEGAL, errorMsg);
    }
  }

  /**
   * Check whether the boolean result is true.
   */
  public static void checkParaBoolean(Boolean result, String errorMsg) {
    if (!result) {
      throw new MonitorException(ResultCodeEnum.PARAMETER_ILLEGAL, errorMsg);
    }
  }

  /**
   *
   * @param param
   * @param errorMsg
   */
  public static void checkInvalidCharacter(String param, String errorMsg) {
    checkParaBoolean(commonCheck(param), errorMsg);
  }

  private static boolean commonCheck(String param) {
    Matcher commonAllowed = PATTERN_SQL.matcher(param);
    if (commonAllowed.find()) {
      if (!unicodeCheck(param)) {
        return false;
      }
      return true;
    }
    return false;
  }

  private static boolean unicodeCheck(String param) {
    // unicode encoding check
    int start = 0;
    Matcher uniCodeMatcher = uniCodePattern.matcher(param);
    while (uniCodeMatcher.find(start)) {
      start = uniCodeMatcher.end();
      String keyword = uniCodeMatcher.group(0);
      if (StringUtils.isNotBlank(keyword) && keyword.startsWith("\\u")) {
        String hexString = StringUtils.substring(keyword, 2);
        int valueInteger = Integer.parseInt(hexString, 16);
        if (valueInteger < 19968 || valueInteger > 40869) {
          return false;
        }
      }
    }
    return true;
  }
}
