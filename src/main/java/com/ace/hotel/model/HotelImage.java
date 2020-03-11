package com.ace.hotel.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * @author author
 */
public class HotelImage implements Serializable {

    private static final long serialVersionUID = 1572756516587L;


    /**
     * 主键
     * <p>
     * isNullAble:0
     */
    private Integer id;

    /**
     * isNullAble:0
     */
    private Integer hid;

    /**
     * isNullAble:0
     */
    private String url;

    /**
     * isNullAble:1
     */
    private String filename;

    /**
     * isNullAble:1
     */
    private Double size;

    /**
     * isNullAble:1
     */
    private Double width;

    /**
     * isNullAble:1
     */
    private Double height;

    /**
     * isNullAble:1
     */
    private String description;


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public Integer getHid() {
        return this.hid;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return this.filename;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Double getSize() {
        return this.size;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getWidth() {
        return this.width;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getHeight() {
        return this.height;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "HotelImage{" +
                "id='" + id + '\'' +
                "hid='" + hid + '\'' +
                "url='" + url + '\'' +
                "filename='" + filename + '\'' +
                "size='" + size + '\'' +
                "width='" + width + '\'' +
                "height='" + height + '\'' +
                "description='" + description + '\'' +
                '}';
    }

    public static Builder Build() {
        return new Builder();
    }

    public static ConditionBuilder ConditionBuild() {
        return new ConditionBuilder();
    }

    public static UpdateBuilder UpdateBuild() {
        return new UpdateBuilder();
    }

    public static QueryBuilder QueryBuild() {
        return new QueryBuilder();
    }

    public static class UpdateBuilder {

        private HotelImage set;

        private ConditionBuilder where;

        public UpdateBuilder set(HotelImage set) {
            this.set = set;
            return this;
        }

        public HotelImage getSet() {
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where) {
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere() {
            return this.where;
        }

        public UpdateBuilder build() {
            return this;
        }
    }

    public static class QueryBuilder extends HotelImage {
        /**
         * 需要返回的列
         */
        private Map<String, Object> fetchFields;

        public Map<String, Object> getFetchFields() {
            return this.fetchFields;
        }

        private List<Integer> idList;

        public List<Integer> getIdList() {
            return this.idList;
        }

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt() {
            return this.idSt;
        }

        public Integer getIdEd() {
            return this.idEd;
        }

        private List<Integer> hidList;

        public List<Integer> getHidList() {
            return this.hidList;
        }

        private Integer hidSt;

        private Integer hidEd;

        public Integer getHidSt() {
            return this.hidSt;
        }

        public Integer getHidEd() {
            return this.hidEd;
        }

        private List<String> urlList;

        public List<String> getUrlList() {
            return this.urlList;
        }


        private List<String> fuzzyUrl;

        public List<String> getFuzzyUrl() {
            return this.fuzzyUrl;
        }

        private List<String> rightFuzzyUrl;

        public List<String> getRightFuzzyUrl() {
            return this.rightFuzzyUrl;
        }

        private List<String> filenameList;

        public List<String> getFilenameList() {
            return this.filenameList;
        }


        private List<String> fuzzyFilename;

        public List<String> getFuzzyFilename() {
            return this.fuzzyFilename;
        }

        private List<String> rightFuzzyFilename;

        public List<String> getRightFuzzyFilename() {
            return this.rightFuzzyFilename;
        }

        private List<Double> sizeList;

        public List<Double> getSizeList() {
            return this.sizeList;
        }

        private Double sizeSt;

        private Double sizeEd;

        public Double getSizeSt() {
            return this.sizeSt;
        }

        public Double getSizeEd() {
            return this.sizeEd;
        }

        private List<Double> widthList;

        public List<Double> getWidthList() {
            return this.widthList;
        }

        private Double widthSt;

        private Double widthEd;

        public Double getWidthSt() {
            return this.widthSt;
        }

        public Double getWidthEd() {
            return this.widthEd;
        }

        private List<Double> heightList;

        public List<Double> getHeightList() {
            return this.heightList;
        }

        private Double heightSt;

        private Double heightEd;

        public Double getHeightSt() {
            return this.heightSt;
        }

        public Double getHeightEd() {
            return this.heightEd;
        }

        private List<String> descriptionList;

        public List<String> getDescriptionList() {
            return this.descriptionList;
        }


        private List<String> fuzzyDescription;

        public List<String> getFuzzyDescription() {
            return this.fuzzyDescription;
        }

        private List<String> rightFuzzyDescription;

        public List<String> getRightFuzzyDescription() {
            return this.rightFuzzyDescription;
        }

        private QueryBuilder() {
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Integer idSt, Integer idEd) {
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Integer idSt) {
            this.idSt = idSt;
            return this;
        }

        public QueryBuilder idLessEqThan(Integer idEd) {
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Integer id) {
            setId(id);
            return this;
        }

        public QueryBuilder idList(Integer... id) {
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Integer> id) {
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId() {
            setFetchFields("fetchFields", "id");
            return this;
        }

        public QueryBuilder excludeId() {
            setFetchFields("excludeFields", "id");
            return this;
        }

        public QueryBuilder hidBetWeen(Integer hidSt, Integer hidEd) {
            this.hidSt = hidSt;
            this.hidEd = hidEd;
            return this;
        }

        public QueryBuilder hidGreaterEqThan(Integer hidSt) {
            this.hidSt = hidSt;
            return this;
        }

        public QueryBuilder hidLessEqThan(Integer hidEd) {
            this.hidEd = hidEd;
            return this;
        }


        public QueryBuilder hid(Integer hid) {
            setHid(hid);
            return this;
        }

        public QueryBuilder hidList(Integer... hid) {
            this.hidList = solveNullList(hid);
            return this;
        }

        public QueryBuilder hidList(List<Integer> hid) {
            this.hidList = hid;
            return this;
        }

        public QueryBuilder fetchHid() {
            setFetchFields("fetchFields", "hid");
            return this;
        }

        public QueryBuilder excludeHid() {
            setFetchFields("excludeFields", "hid");
            return this;
        }

        public QueryBuilder fuzzyUrl(List<String> fuzzyUrl) {
            this.fuzzyUrl = fuzzyUrl;
            return this;
        }

        public QueryBuilder fuzzyUrl(String... fuzzyUrl) {
            this.fuzzyUrl = solveNullList(fuzzyUrl);
            return this;
        }

        public QueryBuilder rightFuzzyUrl(List<String> rightFuzzyUrl) {
            this.rightFuzzyUrl = rightFuzzyUrl;
            return this;
        }

        public QueryBuilder rightFuzzyUrl(String... rightFuzzyUrl) {
            this.rightFuzzyUrl = solveNullList(rightFuzzyUrl);
            return this;
        }

        public QueryBuilder url(String url) {
            setUrl(url);
            return this;
        }

        public QueryBuilder urlList(String... url) {
            this.urlList = solveNullList(url);
            return this;
        }

        public QueryBuilder urlList(List<String> url) {
            this.urlList = url;
            return this;
        }

        public QueryBuilder fetchUrl() {
            setFetchFields("fetchFields", "url");
            return this;
        }

        public QueryBuilder excludeUrl() {
            setFetchFields("excludeFields", "url");
            return this;
        }

        public QueryBuilder fuzzyFilename(List<String> fuzzyFilename) {
            this.fuzzyFilename = fuzzyFilename;
            return this;
        }

        public QueryBuilder fuzzyFilename(String... fuzzyFilename) {
            this.fuzzyFilename = solveNullList(fuzzyFilename);
            return this;
        }

        public QueryBuilder rightFuzzyFilename(List<String> rightFuzzyFilename) {
            this.rightFuzzyFilename = rightFuzzyFilename;
            return this;
        }

        public QueryBuilder rightFuzzyFilename(String... rightFuzzyFilename) {
            this.rightFuzzyFilename = solveNullList(rightFuzzyFilename);
            return this;
        }

        public QueryBuilder filename(String filename) {
            setFilename(filename);
            return this;
        }

        public QueryBuilder filenameList(String... filename) {
            this.filenameList = solveNullList(filename);
            return this;
        }

        public QueryBuilder filenameList(List<String> filename) {
            this.filenameList = filename;
            return this;
        }

        public QueryBuilder fetchFilename() {
            setFetchFields("fetchFields", "filename");
            return this;
        }

        public QueryBuilder excludeFilename() {
            setFetchFields("excludeFields", "filename");
            return this;
        }

        public QueryBuilder sizeBetWeen(Double sizeSt, Double sizeEd) {
            this.sizeSt = sizeSt;
            this.sizeEd = sizeEd;
            return this;
        }

        public QueryBuilder sizeGreaterEqThan(Double sizeSt) {
            this.sizeSt = sizeSt;
            return this;
        }

        public QueryBuilder sizeLessEqThan(Double sizeEd) {
            this.sizeEd = sizeEd;
            return this;
        }


        public QueryBuilder size(Double size) {
            setSize(size);
            return this;
        }

        public QueryBuilder sizeList(Double... size) {
            this.sizeList = solveNullList(size);
            return this;
        }

        public QueryBuilder sizeList(List<Double> size) {
            this.sizeList = size;
            return this;
        }

        public QueryBuilder fetchSize() {
            setFetchFields("fetchFields", "size");
            return this;
        }

        public QueryBuilder excludeSize() {
            setFetchFields("excludeFields", "size");
            return this;
        }

        public QueryBuilder widthBetWeen(Double widthSt, Double widthEd) {
            this.widthSt = widthSt;
            this.widthEd = widthEd;
            return this;
        }

        public QueryBuilder widthGreaterEqThan(Double widthSt) {
            this.widthSt = widthSt;
            return this;
        }

        public QueryBuilder widthLessEqThan(Double widthEd) {
            this.widthEd = widthEd;
            return this;
        }


        public QueryBuilder width(Double width) {
            setWidth(width);
            return this;
        }

        public QueryBuilder widthList(Double... width) {
            this.widthList = solveNullList(width);
            return this;
        }

        public QueryBuilder widthList(List<Double> width) {
            this.widthList = width;
            return this;
        }

        public QueryBuilder fetchWidth() {
            setFetchFields("fetchFields", "width");
            return this;
        }

        public QueryBuilder excludeWidth() {
            setFetchFields("excludeFields", "width");
            return this;
        }

        public QueryBuilder heightBetWeen(Double heightSt, Double heightEd) {
            this.heightSt = heightSt;
            this.heightEd = heightEd;
            return this;
        }

        public QueryBuilder heightGreaterEqThan(Double heightSt) {
            this.heightSt = heightSt;
            return this;
        }

        public QueryBuilder heightLessEqThan(Double heightEd) {
            this.heightEd = heightEd;
            return this;
        }


        public QueryBuilder height(Double height) {
            setHeight(height);
            return this;
        }

        public QueryBuilder heightList(Double... height) {
            this.heightList = solveNullList(height);
            return this;
        }

        public QueryBuilder heightList(List<Double> height) {
            this.heightList = height;
            return this;
        }

        public QueryBuilder fetchHeight() {
            setFetchFields("fetchFields", "height");
            return this;
        }

        public QueryBuilder excludeHeight() {
            setFetchFields("excludeFields", "height");
            return this;
        }

        public QueryBuilder fuzzyDescription(List<String> fuzzyDescription) {
            this.fuzzyDescription = fuzzyDescription;
            return this;
        }

        public QueryBuilder fuzzyDescription(String... fuzzyDescription) {
            this.fuzzyDescription = solveNullList(fuzzyDescription);
            return this;
        }

        public QueryBuilder rightFuzzyDescription(List<String> rightFuzzyDescription) {
            this.rightFuzzyDescription = rightFuzzyDescription;
            return this;
        }

        public QueryBuilder rightFuzzyDescription(String... rightFuzzyDescription) {
            this.rightFuzzyDescription = solveNullList(rightFuzzyDescription);
            return this;
        }

        public QueryBuilder description(String description) {
            setDescription(description);
            return this;
        }

        public QueryBuilder descriptionList(String... description) {
            this.descriptionList = solveNullList(description);
            return this;
        }

        public QueryBuilder descriptionList(List<String> description) {
            this.descriptionList = description;
            return this;
        }

        public QueryBuilder fetchDescription() {
            setFetchFields("fetchFields", "description");
            return this;
        }

        public QueryBuilder excludeDescription() {
            setFetchFields("excludeFields", "description");
            return this;
        }

        private <T> List<T> solveNullList(T... objs) {
            if (objs != null) {
                List<T> list = new ArrayList<>();
                for (T item : objs) {
                    if (item != null) {
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll() {
            this.fetchFields.put("AllFields", true);
            return this;
        }

        public QueryBuilder addField(String... fields) {
            List<String> list = new ArrayList<>();
            if (fields != null) {
                for (String field : fields) {
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields", list);
            return this;
        }

        @SuppressWarnings("unchecked")
        private void setFetchFields(String key, String val) {
            Map<String, Boolean> fields = (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null) {
                fields = new HashMap<>();
            }
            fields.put(val, true);
            this.fetchFields.put(key, fields);
        }

        public HotelImage build() {
            return this;
        }
    }


    public static class ConditionBuilder {
        private List<Integer> idList;

        public List<Integer> getIdList() {
            return this.idList;
        }

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt() {
            return this.idSt;
        }

        public Integer getIdEd() {
            return this.idEd;
        }

        private List<Integer> hidList;

        public List<Integer> getHidList() {
            return this.hidList;
        }

        private Integer hidSt;

        private Integer hidEd;

        public Integer getHidSt() {
            return this.hidSt;
        }

        public Integer getHidEd() {
            return this.hidEd;
        }

        private List<String> urlList;

        public List<String> getUrlList() {
            return this.urlList;
        }


        private List<String> fuzzyUrl;

        public List<String> getFuzzyUrl() {
            return this.fuzzyUrl;
        }

        private List<String> rightFuzzyUrl;

        public List<String> getRightFuzzyUrl() {
            return this.rightFuzzyUrl;
        }

        private List<String> filenameList;

        public List<String> getFilenameList() {
            return this.filenameList;
        }


        private List<String> fuzzyFilename;

        public List<String> getFuzzyFilename() {
            return this.fuzzyFilename;
        }

        private List<String> rightFuzzyFilename;

        public List<String> getRightFuzzyFilename() {
            return this.rightFuzzyFilename;
        }

        private List<Double> sizeList;

        public List<Double> getSizeList() {
            return this.sizeList;
        }

        private Double sizeSt;

        private Double sizeEd;

        public Double getSizeSt() {
            return this.sizeSt;
        }

        public Double getSizeEd() {
            return this.sizeEd;
        }

        private List<Double> widthList;

        public List<Double> getWidthList() {
            return this.widthList;
        }

        private Double widthSt;

        private Double widthEd;

        public Double getWidthSt() {
            return this.widthSt;
        }

        public Double getWidthEd() {
            return this.widthEd;
        }

        private List<Double> heightList;

        public List<Double> getHeightList() {
            return this.heightList;
        }

        private Double heightSt;

        private Double heightEd;

        public Double getHeightSt() {
            return this.heightSt;
        }

        public Double getHeightEd() {
            return this.heightEd;
        }

        private List<String> descriptionList;

        public List<String> getDescriptionList() {
            return this.descriptionList;
        }


        private List<String> fuzzyDescription;

        public List<String> getFuzzyDescription() {
            return this.fuzzyDescription;
        }

        private List<String> rightFuzzyDescription;

        public List<String> getRightFuzzyDescription() {
            return this.rightFuzzyDescription;
        }

        public ConditionBuilder idBetWeen(Integer idSt, Integer idEd) {
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Integer idSt) {
            this.idSt = idSt;
            return this;
        }

        public ConditionBuilder idLessEqThan(Integer idEd) {
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Integer... id) {
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Integer> id) {
            this.idList = id;
            return this;
        }

        public ConditionBuilder hidBetWeen(Integer hidSt, Integer hidEd) {
            this.hidSt = hidSt;
            this.hidEd = hidEd;
            return this;
        }

        public ConditionBuilder hidGreaterEqThan(Integer hidSt) {
            this.hidSt = hidSt;
            return this;
        }

        public ConditionBuilder hidLessEqThan(Integer hidEd) {
            this.hidEd = hidEd;
            return this;
        }


        public ConditionBuilder hidList(Integer... hid) {
            this.hidList = solveNullList(hid);
            return this;
        }

        public ConditionBuilder hidList(List<Integer> hid) {
            this.hidList = hid;
            return this;
        }

        public ConditionBuilder fuzzyUrl(List<String> fuzzyUrl) {
            this.fuzzyUrl = fuzzyUrl;
            return this;
        }

        public ConditionBuilder fuzzyUrl(String... fuzzyUrl) {
            this.fuzzyUrl = solveNullList(fuzzyUrl);
            return this;
        }

        public ConditionBuilder rightFuzzyUrl(List<String> rightFuzzyUrl) {
            this.rightFuzzyUrl = rightFuzzyUrl;
            return this;
        }

        public ConditionBuilder rightFuzzyUrl(String... rightFuzzyUrl) {
            this.rightFuzzyUrl = solveNullList(rightFuzzyUrl);
            return this;
        }

        public ConditionBuilder urlList(String... url) {
            this.urlList = solveNullList(url);
            return this;
        }

        public ConditionBuilder urlList(List<String> url) {
            this.urlList = url;
            return this;
        }

        public ConditionBuilder fuzzyFilename(List<String> fuzzyFilename) {
            this.fuzzyFilename = fuzzyFilename;
            return this;
        }

        public ConditionBuilder fuzzyFilename(String... fuzzyFilename) {
            this.fuzzyFilename = solveNullList(fuzzyFilename);
            return this;
        }

        public ConditionBuilder rightFuzzyFilename(List<String> rightFuzzyFilename) {
            this.rightFuzzyFilename = rightFuzzyFilename;
            return this;
        }

        public ConditionBuilder rightFuzzyFilename(String... rightFuzzyFilename) {
            this.rightFuzzyFilename = solveNullList(rightFuzzyFilename);
            return this;
        }

        public ConditionBuilder filenameList(String... filename) {
            this.filenameList = solveNullList(filename);
            return this;
        }

        public ConditionBuilder filenameList(List<String> filename) {
            this.filenameList = filename;
            return this;
        }

        public ConditionBuilder sizeBetWeen(Double sizeSt, Double sizeEd) {
            this.sizeSt = sizeSt;
            this.sizeEd = sizeEd;
            return this;
        }

        public ConditionBuilder sizeGreaterEqThan(Double sizeSt) {
            this.sizeSt = sizeSt;
            return this;
        }

        public ConditionBuilder sizeLessEqThan(Double sizeEd) {
            this.sizeEd = sizeEd;
            return this;
        }


        public ConditionBuilder sizeList(Double... size) {
            this.sizeList = solveNullList(size);
            return this;
        }

        public ConditionBuilder sizeList(List<Double> size) {
            this.sizeList = size;
            return this;
        }

        public ConditionBuilder widthBetWeen(Double widthSt, Double widthEd) {
            this.widthSt = widthSt;
            this.widthEd = widthEd;
            return this;
        }

        public ConditionBuilder widthGreaterEqThan(Double widthSt) {
            this.widthSt = widthSt;
            return this;
        }

        public ConditionBuilder widthLessEqThan(Double widthEd) {
            this.widthEd = widthEd;
            return this;
        }


        public ConditionBuilder widthList(Double... width) {
            this.widthList = solveNullList(width);
            return this;
        }

        public ConditionBuilder widthList(List<Double> width) {
            this.widthList = width;
            return this;
        }

        public ConditionBuilder heightBetWeen(Double heightSt, Double heightEd) {
            this.heightSt = heightSt;
            this.heightEd = heightEd;
            return this;
        }

        public ConditionBuilder heightGreaterEqThan(Double heightSt) {
            this.heightSt = heightSt;
            return this;
        }

        public ConditionBuilder heightLessEqThan(Double heightEd) {
            this.heightEd = heightEd;
            return this;
        }


        public ConditionBuilder heightList(Double... height) {
            this.heightList = solveNullList(height);
            return this;
        }

        public ConditionBuilder heightList(List<Double> height) {
            this.heightList = height;
            return this;
        }

        public ConditionBuilder fuzzyDescription(List<String> fuzzyDescription) {
            this.fuzzyDescription = fuzzyDescription;
            return this;
        }

        public ConditionBuilder fuzzyDescription(String... fuzzyDescription) {
            this.fuzzyDescription = solveNullList(fuzzyDescription);
            return this;
        }

        public ConditionBuilder rightFuzzyDescription(List<String> rightFuzzyDescription) {
            this.rightFuzzyDescription = rightFuzzyDescription;
            return this;
        }

        public ConditionBuilder rightFuzzyDescription(String... rightFuzzyDescription) {
            this.rightFuzzyDescription = solveNullList(rightFuzzyDescription);
            return this;
        }

        public ConditionBuilder descriptionList(String... description) {
            this.descriptionList = solveNullList(description);
            return this;
        }

        public ConditionBuilder descriptionList(List<String> description) {
            this.descriptionList = description;
            return this;
        }

        private <T> List<T> solveNullList(T... objs) {
            if (objs != null) {
                List<T> list = new ArrayList<>();
                for (T item : objs) {
                    if (item != null) {
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build() {
            return this;
        }
    }

    public static class Builder {

        private HotelImage obj;

        public Builder() {
            this.obj = new HotelImage();
        }

        public Builder id(Integer id) {
            this.obj.setId(id);
            return this;
        }

        public Builder hid(Integer hid) {
            this.obj.setHid(hid);
            return this;
        }

        public Builder url(String url) {
            this.obj.setUrl(url);
            return this;
        }

        public Builder filename(String filename) {
            this.obj.setFilename(filename);
            return this;
        }

        public Builder size(Double size) {
            this.obj.setSize(size);
            return this;
        }

        public Builder width(Double width) {
            this.obj.setWidth(width);
            return this;
        }

        public Builder height(Double height) {
            this.obj.setHeight(height);
            return this;
        }

        public Builder description(String description) {
            this.obj.setDescription(description);
            return this;
        }

        public HotelImage build() {
            return obj;
        }
    }

}
