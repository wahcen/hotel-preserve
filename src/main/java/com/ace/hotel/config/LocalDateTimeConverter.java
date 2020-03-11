package com.ace.hotel.config;

import com.ace.hotel.util.MsgUtil;
import org.springframework.core.convert.converter.Converter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Ace.ch
 * @version V1.0
 * @Package com.ace.hotel.config
 * @date 2019/11/9 23:01
 */
public class LocalDateTimeConverter implements Converter<String, LocalDateTime> {
    private static final String DEFAULT_DATE_TIME_FORMAT = MsgUtil.DEFAULT_DATE_TIME_FORMAT;
    @Override
    public LocalDateTime convert(String source) {
        source = source.replace('T', ' ');
        return LocalDateTime.parse(source, DateTimeFormatter.ofPattern(DEFAULT_DATE_TIME_FORMAT));
    }
}
