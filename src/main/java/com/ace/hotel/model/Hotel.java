package com.ace.hotel.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * @author author
 */
public class Hotel implements Serializable {

    private static final long serialVersionUID = 1572462379269L;


    /**
     * 主键
     * 酒店id
     * isNullAble:0
     */
    private Integer hid;

    /**
     * 酒店名
     * isNullAble:0
     */
    private String hotelName;

    /**
     * 地址
     * isNullAble:0
     */
    private String address;

    /**
     * 电话号码
     * isNullAble:0
     */
    private String phone;

    /**
     * 评分
     * isNullAble:1,defaultVal:5.0
     */
    private Float score;

    /**
     * 标签
     * isNullAble:1
     */
    private String tags;

    /**
     * 描述
     * isNullAble:1,defaultVal:店家还没有添加描述哦
     */
    private String description;


    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public Integer getHid() {
        return this.hid;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelName() {
        return this.hotelName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Float getScore() {
        return this.score;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getTags() {
        return this.tags;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hid='" + hid + '\'' +
                "hotelName='" + hotelName + '\'' +
                "address='" + address + '\'' +
                "phone='" + phone + '\'' +
                "score='" + score + '\'' +
                "tags='" + tags + '\'' +
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

        private Hotel set;

        private ConditionBuilder where;

        public UpdateBuilder set(Hotel set) {
            this.set = set;
            return this;
        }

        public Hotel getSet() {
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

    public static class QueryBuilder extends Hotel {
        /**
         * 需要返回的列
         */
        private Map<String, Object> fetchFields;

        public Map<String, Object> getFetchFields() {
            return this.fetchFields;
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

        private List<String> hotelNameList;

        public List<String> getHotelNameList() {
            return this.hotelNameList;
        }


        private List<String> fuzzyHotelName;

        public List<String> getFuzzyHotelName() {
            return this.fuzzyHotelName;
        }

        private List<String> rightFuzzyHotelName;

        public List<String> getRightFuzzyHotelName() {
            return this.rightFuzzyHotelName;
        }

        private List<String> addressList;

        public List<String> getAddressList() {
            return this.addressList;
        }


        private List<String> fuzzyAddress;

        public List<String> getFuzzyAddress() {
            return this.fuzzyAddress;
        }

        private List<String> rightFuzzyAddress;

        public List<String> getRightFuzzyAddress() {
            return this.rightFuzzyAddress;
        }

        private List<String> phoneList;

        public List<String> getPhoneList() {
            return this.phoneList;
        }


        private List<String> fuzzyPhone;

        public List<String> getFuzzyPhone() {
            return this.fuzzyPhone;
        }

        private List<String> rightFuzzyPhone;

        public List<String> getRightFuzzyPhone() {
            return this.rightFuzzyPhone;
        }

        private List<Float> scoreList;

        public List<Float> getScoreList() {
            return this.scoreList;
        }

        private Float scoreSt;

        private Float scoreEd;

        public Float getScoreSt() {
            return this.scoreSt;
        }

        public Float getScoreEd() {
            return this.scoreEd;
        }

        private List<String> tagsList;

        public List<String> getTagsList() {
            return this.tagsList;
        }


        private List<String> fuzzyTags;

        public List<String> getFuzzyTags() {
            return this.fuzzyTags;
        }

        private List<String> rightFuzzyTags;

        public List<String> getRightFuzzyTags() {
            return this.rightFuzzyTags;
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

        public QueryBuilder fuzzyHotelName(List<String> fuzzyHotelName) {
            this.fuzzyHotelName = fuzzyHotelName;
            return this;
        }

        public QueryBuilder fuzzyHotelName(String... fuzzyHotelName) {
            this.fuzzyHotelName = solveNullList(fuzzyHotelName);
            return this;
        }

        public QueryBuilder rightFuzzyHotelName(List<String> rightFuzzyHotelName) {
            this.rightFuzzyHotelName = rightFuzzyHotelName;
            return this;
        }

        public QueryBuilder rightFuzzyHotelName(String... rightFuzzyHotelName) {
            this.rightFuzzyHotelName = solveNullList(rightFuzzyHotelName);
            return this;
        }

        public QueryBuilder hotelName(String hotelName) {
            setHotelName(hotelName);
            return this;
        }

        public QueryBuilder hotelNameList(String... hotelName) {
            this.hotelNameList = solveNullList(hotelName);
            return this;
        }

        public QueryBuilder hotelNameList(List<String> hotelName) {
            this.hotelNameList = hotelName;
            return this;
        }

        public QueryBuilder fetchHotelName() {
            setFetchFields("fetchFields", "hotelName");
            return this;
        }

        public QueryBuilder excludeHotelName() {
            setFetchFields("excludeFields", "hotelName");
            return this;
        }

        public QueryBuilder fuzzyAddress(List<String> fuzzyAddress) {
            this.fuzzyAddress = fuzzyAddress;
            return this;
        }

        public QueryBuilder fuzzyAddress(String... fuzzyAddress) {
            this.fuzzyAddress = solveNullList(fuzzyAddress);
            return this;
        }

        public QueryBuilder rightFuzzyAddress(List<String> rightFuzzyAddress) {
            this.rightFuzzyAddress = rightFuzzyAddress;
            return this;
        }

        public QueryBuilder rightFuzzyAddress(String... rightFuzzyAddress) {
            this.rightFuzzyAddress = solveNullList(rightFuzzyAddress);
            return this;
        }

        public QueryBuilder address(String address) {
            setAddress(address);
            return this;
        }

        public QueryBuilder addressList(String... address) {
            this.addressList = solveNullList(address);
            return this;
        }

        public QueryBuilder addressList(List<String> address) {
            this.addressList = address;
            return this;
        }

        public QueryBuilder fetchAddress() {
            setFetchFields("fetchFields", "address");
            return this;
        }

        public QueryBuilder excludeAddress() {
            setFetchFields("excludeFields", "address");
            return this;
        }

        public QueryBuilder fuzzyPhone(List<String> fuzzyPhone) {
            this.fuzzyPhone = fuzzyPhone;
            return this;
        }

        public QueryBuilder fuzzyPhone(String... fuzzyPhone) {
            this.fuzzyPhone = solveNullList(fuzzyPhone);
            return this;
        }

        public QueryBuilder rightFuzzyPhone(List<String> rightFuzzyPhone) {
            this.rightFuzzyPhone = rightFuzzyPhone;
            return this;
        }

        public QueryBuilder rightFuzzyPhone(String... rightFuzzyPhone) {
            this.rightFuzzyPhone = solveNullList(rightFuzzyPhone);
            return this;
        }

        public QueryBuilder phone(String phone) {
            setPhone(phone);
            return this;
        }

        public QueryBuilder phoneList(String... phone) {
            this.phoneList = solveNullList(phone);
            return this;
        }

        public QueryBuilder phoneList(List<String> phone) {
            this.phoneList = phone;
            return this;
        }

        public QueryBuilder fetchPhone() {
            setFetchFields("fetchFields", "phone");
            return this;
        }

        public QueryBuilder excludePhone() {
            setFetchFields("excludeFields", "phone");
            return this;
        }

        public QueryBuilder scoreBetWeen(Float scoreSt, Float scoreEd) {
            this.scoreSt = scoreSt;
            this.scoreEd = scoreEd;
            return this;
        }

        public QueryBuilder scoreGreaterEqThan(Float scoreSt) {
            this.scoreSt = scoreSt;
            return this;
        }

        public QueryBuilder scoreLessEqThan(Float scoreEd) {
            this.scoreEd = scoreEd;
            return this;
        }


        public QueryBuilder score(Float score) {
            setScore(score);
            return this;
        }

        public QueryBuilder scoreList(Float... score) {
            this.scoreList = solveNullList(score);
            return this;
        }

        public QueryBuilder scoreList(List<Float> score) {
            this.scoreList = score;
            return this;
        }

        public QueryBuilder fetchScore() {
            setFetchFields("fetchFields", "score");
            return this;
        }

        public QueryBuilder excludeScore() {
            setFetchFields("excludeFields", "score");
            return this;
        }

        public QueryBuilder fuzzyTags(List<String> fuzzyTags) {
            this.fuzzyTags = fuzzyTags;
            return this;
        }

        public QueryBuilder fuzzyTags(String... fuzzyTags) {
            this.fuzzyTags = solveNullList(fuzzyTags);
            return this;
        }

        public QueryBuilder rightFuzzyTags(List<String> rightFuzzyTags) {
            this.rightFuzzyTags = rightFuzzyTags;
            return this;
        }

        public QueryBuilder rightFuzzyTags(String... rightFuzzyTags) {
            this.rightFuzzyTags = solveNullList(rightFuzzyTags);
            return this;
        }

        public QueryBuilder tags(String tags) {
            setTags(tags);
            return this;
        }

        public QueryBuilder tagsList(String... tags) {
            this.tagsList = solveNullList(tags);
            return this;
        }

        public QueryBuilder tagsList(List<String> tags) {
            this.tagsList = tags;
            return this;
        }

        public QueryBuilder fetchTags() {
            setFetchFields("fetchFields", "tags");
            return this;
        }

        public QueryBuilder excludeTags() {
            setFetchFields("excludeFields", "tags");
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

        public Hotel build() {
            return this;
        }
    }


    public static class ConditionBuilder {
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

        private List<String> hotelNameList;

        public List<String> getHotelNameList() {
            return this.hotelNameList;
        }


        private List<String> fuzzyHotelName;

        public List<String> getFuzzyHotelName() {
            return this.fuzzyHotelName;
        }

        private List<String> rightFuzzyHotelName;

        public List<String> getRightFuzzyHotelName() {
            return this.rightFuzzyHotelName;
        }

        private List<String> addressList;

        public List<String> getAddressList() {
            return this.addressList;
        }


        private List<String> fuzzyAddress;

        public List<String> getFuzzyAddress() {
            return this.fuzzyAddress;
        }

        private List<String> rightFuzzyAddress;

        public List<String> getRightFuzzyAddress() {
            return this.rightFuzzyAddress;
        }

        private List<String> phoneList;

        public List<String> getPhoneList() {
            return this.phoneList;
        }


        private List<String> fuzzyPhone;

        public List<String> getFuzzyPhone() {
            return this.fuzzyPhone;
        }

        private List<String> rightFuzzyPhone;

        public List<String> getRightFuzzyPhone() {
            return this.rightFuzzyPhone;
        }

        private List<Float> scoreList;

        public List<Float> getScoreList() {
            return this.scoreList;
        }

        private Float scoreSt;

        private Float scoreEd;

        public Float getScoreSt() {
            return this.scoreSt;
        }

        public Float getScoreEd() {
            return this.scoreEd;
        }

        private List<String> tagsList;

        public List<String> getTagsList() {
            return this.tagsList;
        }


        private List<String> fuzzyTags;

        public List<String> getFuzzyTags() {
            return this.fuzzyTags;
        }

        private List<String> rightFuzzyTags;

        public List<String> getRightFuzzyTags() {
            return this.rightFuzzyTags;
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

        public ConditionBuilder fuzzyHotelName(List<String> fuzzyHotelName) {
            this.fuzzyHotelName = fuzzyHotelName;
            return this;
        }

        public ConditionBuilder fuzzyHotelName(String... fuzzyHotelName) {
            this.fuzzyHotelName = solveNullList(fuzzyHotelName);
            return this;
        }

        public ConditionBuilder rightFuzzyHotelName(List<String> rightFuzzyHotelName) {
            this.rightFuzzyHotelName = rightFuzzyHotelName;
            return this;
        }

        public ConditionBuilder rightFuzzyHotelName(String... rightFuzzyHotelName) {
            this.rightFuzzyHotelName = solveNullList(rightFuzzyHotelName);
            return this;
        }

        public ConditionBuilder hotelNameList(String... hotelName) {
            this.hotelNameList = solveNullList(hotelName);
            return this;
        }

        public ConditionBuilder hotelNameList(List<String> hotelName) {
            this.hotelNameList = hotelName;
            return this;
        }

        public ConditionBuilder fuzzyAddress(List<String> fuzzyAddress) {
            this.fuzzyAddress = fuzzyAddress;
            return this;
        }

        public ConditionBuilder fuzzyAddress(String... fuzzyAddress) {
            this.fuzzyAddress = solveNullList(fuzzyAddress);
            return this;
        }

        public ConditionBuilder rightFuzzyAddress(List<String> rightFuzzyAddress) {
            this.rightFuzzyAddress = rightFuzzyAddress;
            return this;
        }

        public ConditionBuilder rightFuzzyAddress(String... rightFuzzyAddress) {
            this.rightFuzzyAddress = solveNullList(rightFuzzyAddress);
            return this;
        }

        public ConditionBuilder addressList(String... address) {
            this.addressList = solveNullList(address);
            return this;
        }

        public ConditionBuilder addressList(List<String> address) {
            this.addressList = address;
            return this;
        }

        public ConditionBuilder fuzzyPhone(List<String> fuzzyPhone) {
            this.fuzzyPhone = fuzzyPhone;
            return this;
        }

        public ConditionBuilder fuzzyPhone(String... fuzzyPhone) {
            this.fuzzyPhone = solveNullList(fuzzyPhone);
            return this;
        }

        public ConditionBuilder rightFuzzyPhone(List<String> rightFuzzyPhone) {
            this.rightFuzzyPhone = rightFuzzyPhone;
            return this;
        }

        public ConditionBuilder rightFuzzyPhone(String... rightFuzzyPhone) {
            this.rightFuzzyPhone = solveNullList(rightFuzzyPhone);
            return this;
        }

        public ConditionBuilder phoneList(String... phone) {
            this.phoneList = solveNullList(phone);
            return this;
        }

        public ConditionBuilder phoneList(List<String> phone) {
            this.phoneList = phone;
            return this;
        }

        public ConditionBuilder scoreBetWeen(Float scoreSt, Float scoreEd) {
            this.scoreSt = scoreSt;
            this.scoreEd = scoreEd;
            return this;
        }

        public ConditionBuilder scoreGreaterEqThan(Float scoreSt) {
            this.scoreSt = scoreSt;
            return this;
        }

        public ConditionBuilder scoreLessEqThan(Float scoreEd) {
            this.scoreEd = scoreEd;
            return this;
        }


        public ConditionBuilder scoreList(Float... score) {
            this.scoreList = solveNullList(score);
            return this;
        }

        public ConditionBuilder scoreList(List<Float> score) {
            this.scoreList = score;
            return this;
        }

        public ConditionBuilder fuzzyTags(List<String> fuzzyTags) {
            this.fuzzyTags = fuzzyTags;
            return this;
        }

        public ConditionBuilder fuzzyTags(String... fuzzyTags) {
            this.fuzzyTags = solveNullList(fuzzyTags);
            return this;
        }

        public ConditionBuilder rightFuzzyTags(List<String> rightFuzzyTags) {
            this.rightFuzzyTags = rightFuzzyTags;
            return this;
        }

        public ConditionBuilder rightFuzzyTags(String... rightFuzzyTags) {
            this.rightFuzzyTags = solveNullList(rightFuzzyTags);
            return this;
        }

        public ConditionBuilder tagsList(String... tags) {
            this.tagsList = solveNullList(tags);
            return this;
        }

        public ConditionBuilder tagsList(List<String> tags) {
            this.tagsList = tags;
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

        private Hotel obj;

        public Builder() {
            this.obj = new Hotel();
        }

        public Builder hid(Integer hid) {
            this.obj.setHid(hid);
            return this;
        }

        public Builder hotelName(String hotelName) {
            this.obj.setHotelName(hotelName);
            return this;
        }

        public Builder address(String address) {
            this.obj.setAddress(address);
            return this;
        }

        public Builder phone(String phone) {
            this.obj.setPhone(phone);
            return this;
        }

        public Builder score(Float score) {
            this.obj.setScore(score);
            return this;
        }

        public Builder tags(String tags) {
            this.obj.setTags(tags);
            return this;
        }

        public Builder description(String description) {
            this.obj.setDescription(description);
            return this;
        }

        public Hotel build() {
            return obj;
        }
    }

}
