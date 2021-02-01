package com.example.demo.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class MetricDTO {

    private Long metricId;

    private String metricName;

    private String code;

    private Long chartId;

    private Integer threshold;

    private BigDecimal thresholdMax;

    private BigDecimal thresholdMin;

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (obj instanceof MetricDTO) {
            MetricDTO metricDTO = (MetricDTO) obj;
            // 比较每个属性的值 一致时才返回true
            if (metricDTO.metricId.equals(this.metricId) &&
                    metricDTO.metricName.equals(this.metricName))
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return metricId.hashCode() * metricName.hashCode();
    }
}
