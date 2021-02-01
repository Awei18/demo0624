package com.example.demo.entity;

import lombok.Data;

import java.util.List;

@Data
public class ChartProjectDTO {

    private Long chartProjectId;

    private Long chartId;

    private String chartName;

    private Long projectId;

    private Integer ordinate;

    private Long metricTypeId;

    private Long metricType1Id;

    private Long metricType2Id;

    private List<MetricDTO> metrics;

    private Long viewChartId;

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (obj instanceof ChartProjectDTO) {
            ChartProjectDTO chartProjectDTO = (ChartProjectDTO) obj;
            // 比较每个属性的值 一致时才返回true
            if (chartProjectDTO.chartId.equals(this.chartId) &&
                    chartProjectDTO.chartName.equals(this.chartName))
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return chartName.hashCode() * chartId.hashCode();
    }
}

