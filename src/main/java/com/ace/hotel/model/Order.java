package com.ace.hotel.model;

import com.ace.hotel.util.MsgUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * @author author
 */
public class Order implements Serializable {

    private static final long serialVersionUID = 1572499152616L;


    /**
     * 主键
     * 电话号码
     * isNullAble:0
     */
    private String phone;

    /**
     * 身份证
     * isNullAble:0
     */
    private String idCard;

    /**
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
     * 房间类型
     * isNullAble:0
     */
    private String roomType;

    /**
     * 订单总价
     * isNullAble:0,defaultVal:0
     */
    private Long totalCharge;

    /**
     * 支付方式
     * isNullAble:0
     */
    private String payType;

    /**
     * 入住时间
     * isNullAble:0
     */
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate checkInTime;

    /**
     * 退房时间
     * isNullAble:0
     */
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private java.time.LocalDate checkOutTime;

    /**
     * 主键
     * 订单创建时间
     * isNullAble:0
     */
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME,pattern = MsgUtil.DEFAULT_DATE_TIME_FORMAT)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private java.time.LocalDateTime createdTime;

    /**
     * 入住人数
     * isNullAble:0
     */
    private Integer tenantCount;

    /**
     * 备注
     * isNullAble:1
     */
    private String comment;


    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getIdCard() {
        return this.idCard;
    }

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

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomType() {
        return this.roomType;
    }

    public void setTotalCharge(Long totalCharge) {
        this.totalCharge = totalCharge;
    }

    public Long getTotalCharge() {
        return this.totalCharge;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayType() {
        return this.payType;
    }

    public void setCheckInTime(java.time.LocalDate checkInTime) {
        this.checkInTime = checkInTime;
    }

    public LocalDate getCheckInTime() {
        return this.checkInTime;
    }

    public void setCheckOutTime(java.time.LocalDate checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public java.time.LocalDate getCheckOutTime() {
        return this.checkOutTime;
    }

    public void setCreatedTime(java.time.LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public java.time.LocalDateTime getCreatedTime() {
        return this.createdTime;
    }

    public void setTenantCount(Integer tenantCount) {
        this.tenantCount = tenantCount;
    }

    public Integer getTenantCount() {
        return this.tenantCount;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return this.comment;
    }

    @Override
    public String toString() {
        return "Order{" +
                "phone='" + phone + '\'' +
                "idCard='" + idCard + '\'' +
                "hid='" + hid + '\'' +
                "hotelName='" + hotelName + '\'' +
                "roomType='" + roomType + '\'' +
                "totalCharge='" + totalCharge + '\'' +
                "payType='" + payType + '\'' +
                "checkInTime='" + checkInTime + '\'' +
                "checkOutTime='" + checkOutTime + '\'' +
                "createdTime='" + createdTime + '\'' +
                "tenantCount='" + tenantCount + '\'' +
                "comment='" + comment + '\'' +
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

        private Order set;

        private ConditionBuilder where;

        public UpdateBuilder set(Order set) {
            this.set = set;
            return this;
        }

        public Order getSet() {
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

    public static class QueryBuilder extends Order {
        /**
         * 需要返回的列
         */
        private Map<String, Object> fetchFields;

        public Map<String, Object> getFetchFields() {
            return this.fetchFields;
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

        private List<String> idCardList;

        public List<String> getIdCardList() {
            return this.idCardList;
        }


        private List<String> fuzzyIdCard;

        public List<String> getFuzzyIdCard() {
            return this.fuzzyIdCard;
        }

        private List<String> rightFuzzyIdCard;

        public List<String> getRightFuzzyIdCard() {
            return this.rightFuzzyIdCard;
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

        private List<String> roomTypeList;

        public List<String> getRoomTypeList() {
            return this.roomTypeList;
        }


        private List<String> fuzzyRoomType;

        public List<String> getFuzzyRoomType() {
            return this.fuzzyRoomType;
        }

        private List<String> rightFuzzyRoomType;

        public List<String> getRightFuzzyRoomType() {
            return this.rightFuzzyRoomType;
        }

        private List<Long> totalChargeList;

        public List<Long> getTotalChargeList() {
            return this.totalChargeList;
        }

        private Long totalChargeSt;

        private Long totalChargeEd;

        public Long getTotalChargeSt() {
            return this.totalChargeSt;
        }

        public Long getTotalChargeEd() {
            return this.totalChargeEd;
        }

        private List<String> payTypeList;

        public List<String> getPayTypeList() {
            return this.payTypeList;
        }


        private List<String> fuzzyPayType;

        public List<String> getFuzzyPayType() {
            return this.fuzzyPayType;
        }

        private List<String> rightFuzzyPayType;

        public List<String> getRightFuzzyPayType() {
            return this.rightFuzzyPayType;
        }

        private List<java.time.LocalDateTime> checkInTimeList;

        public List<java.time.LocalDateTime> getCheckInTimeList() {
            return this.checkInTimeList;
        }

        private java.time.LocalDateTime checkInTimeSt;

        private java.time.LocalDateTime checkInTimeEd;

        public java.time.LocalDateTime getCheckInTimeSt() {
            return this.checkInTimeSt;
        }

        public java.time.LocalDateTime getCheckInTimeEd() {
            return this.checkInTimeEd;
        }

        private List<java.time.LocalDateTime> checkOutTimeList;

        public List<java.time.LocalDateTime> getCheckOutTimeList() {
            return this.checkOutTimeList;
        }

        private java.time.LocalDateTime checkOutTimeSt;

        private java.time.LocalDateTime checkOutTimeEd;

        public java.time.LocalDateTime getCheckOutTimeSt() {
            return this.checkOutTimeSt;
        }

        public java.time.LocalDateTime getCheckOutTimeEd() {
            return this.checkOutTimeEd;
        }

        private List<java.time.LocalDateTime> createdTimeList;

        public List<java.time.LocalDateTime> getCreatedTimeList() {
            return this.createdTimeList;
        }

        private java.time.LocalDateTime createdTimeSt;

        private java.time.LocalDateTime createdTimeEd;

        public java.time.LocalDateTime getCreatedTimeSt() {
            return this.createdTimeSt;
        }

        public java.time.LocalDateTime getCreatedTimeEd() {
            return this.createdTimeEd;
        }

        private List<Integer> tenantCountList;

        public List<Integer> getTenantCountList() {
            return this.tenantCountList;
        }

        private Integer tenantCountSt;

        private Integer tenantCountEd;

        public Integer getTenantCountSt() {
            return this.tenantCountSt;
        }

        public Integer getTenantCountEd() {
            return this.tenantCountEd;
        }

        private List<String> commentList;

        public List<String> getCommentList() {
            return this.commentList;
        }


        private List<String> fuzzyComment;

        public List<String> getFuzzyComment() {
            return this.fuzzyComment;
        }

        private List<String> rightFuzzyComment;

        public List<String> getRightFuzzyComment() {
            return this.rightFuzzyComment;
        }

        private QueryBuilder() {
            this.fetchFields = new HashMap<>();
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

        public QueryBuilder fuzzyIdCard(List<String> fuzzyIdCard) {
            this.fuzzyIdCard = fuzzyIdCard;
            return this;
        }

        public QueryBuilder fuzzyIdCard(String... fuzzyIdCard) {
            this.fuzzyIdCard = solveNullList(fuzzyIdCard);
            return this;
        }

        public QueryBuilder rightFuzzyIdCard(List<String> rightFuzzyIdCard) {
            this.rightFuzzyIdCard = rightFuzzyIdCard;
            return this;
        }

        public QueryBuilder rightFuzzyIdCard(String... rightFuzzyIdCard) {
            this.rightFuzzyIdCard = solveNullList(rightFuzzyIdCard);
            return this;
        }

        public QueryBuilder idCard(String idCard) {
            setIdCard(idCard);
            return this;
        }

        public QueryBuilder idCardList(String... idCard) {
            this.idCardList = solveNullList(idCard);
            return this;
        }

        public QueryBuilder idCardList(List<String> idCard) {
            this.idCardList = idCard;
            return this;
        }

        public QueryBuilder fetchIdCard() {
            setFetchFields("fetchFields", "idCard");
            return this;
        }

        public QueryBuilder excludeIdCard() {
            setFetchFields("excludeFields", "idCard");
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

        public QueryBuilder fuzzyRoomType(List<String> fuzzyRoomType) {
            this.fuzzyRoomType = fuzzyRoomType;
            return this;
        }

        public QueryBuilder fuzzyRoomType(String... fuzzyRoomType) {
            this.fuzzyRoomType = solveNullList(fuzzyRoomType);
            return this;
        }

        public QueryBuilder rightFuzzyRoomType(List<String> rightFuzzyRoomType) {
            this.rightFuzzyRoomType = rightFuzzyRoomType;
            return this;
        }

        public QueryBuilder rightFuzzyRoomType(String... rightFuzzyRoomType) {
            this.rightFuzzyRoomType = solveNullList(rightFuzzyRoomType);
            return this;
        }

        public QueryBuilder roomType(String roomType) {
            setRoomType(roomType);
            return this;
        }

        public QueryBuilder roomTypeList(String... roomType) {
            this.roomTypeList = solveNullList(roomType);
            return this;
        }

        public QueryBuilder roomTypeList(List<String> roomType) {
            this.roomTypeList = roomType;
            return this;
        }

        public QueryBuilder fetchRoomType() {
            setFetchFields("fetchFields", "roomType");
            return this;
        }

        public QueryBuilder excludeRoomType() {
            setFetchFields("excludeFields", "roomType");
            return this;
        }

        public QueryBuilder totalChargeBetWeen(Long totalChargeSt, Long totalChargeEd) {
            this.totalChargeSt = totalChargeSt;
            this.totalChargeEd = totalChargeEd;
            return this;
        }

        public QueryBuilder totalChargeGreaterEqThan(Long totalChargeSt) {
            this.totalChargeSt = totalChargeSt;
            return this;
        }

        public QueryBuilder totalChargeLessEqThan(Long totalChargeEd) {
            this.totalChargeEd = totalChargeEd;
            return this;
        }


        public QueryBuilder totalCharge(Long totalCharge) {
            setTotalCharge(totalCharge);
            return this;
        }

        public QueryBuilder totalChargeList(Long... totalCharge) {
            this.totalChargeList = solveNullList(totalCharge);
            return this;
        }

        public QueryBuilder totalChargeList(List<Long> totalCharge) {
            this.totalChargeList = totalCharge;
            return this;
        }

        public QueryBuilder fetchTotalCharge() {
            setFetchFields("fetchFields", "totalCharge");
            return this;
        }

        public QueryBuilder excludeTotalCharge() {
            setFetchFields("excludeFields", "totalCharge");
            return this;
        }

        public QueryBuilder fuzzyPayType(List<String> fuzzyPayType) {
            this.fuzzyPayType = fuzzyPayType;
            return this;
        }

        public QueryBuilder fuzzyPayType(String... fuzzyPayType) {
            this.fuzzyPayType = solveNullList(fuzzyPayType);
            return this;
        }

        public QueryBuilder rightFuzzyPayType(List<String> rightFuzzyPayType) {
            this.rightFuzzyPayType = rightFuzzyPayType;
            return this;
        }

        public QueryBuilder rightFuzzyPayType(String... rightFuzzyPayType) {
            this.rightFuzzyPayType = solveNullList(rightFuzzyPayType);
            return this;
        }

        public QueryBuilder payType(String payType) {
            setPayType(payType);
            return this;
        }

        public QueryBuilder payTypeList(String... payType) {
            this.payTypeList = solveNullList(payType);
            return this;
        }

        public QueryBuilder payTypeList(List<String> payType) {
            this.payTypeList = payType;
            return this;
        }

        public QueryBuilder fetchPayType() {
            setFetchFields("fetchFields", "payType");
            return this;
        }

        public QueryBuilder excludePayType() {
            setFetchFields("excludeFields", "payType");
            return this;
        }

        public QueryBuilder checkInTimeBetWeen(java.time.LocalDateTime checkInTimeSt, java.time.LocalDateTime checkInTimeEd) {
            this.checkInTimeSt = checkInTimeSt;
            this.checkInTimeEd = checkInTimeEd;
            return this;
        }

        public QueryBuilder checkInTimeGreaterEqThan(java.time.LocalDateTime checkInTimeSt) {
            this.checkInTimeSt = checkInTimeSt;
            return this;
        }

        public QueryBuilder checkInTimeLessEqThan(java.time.LocalDateTime checkInTimeEd) {
            this.checkInTimeEd = checkInTimeEd;
            return this;
        }


        public QueryBuilder checkInTime(java.time.LocalDate checkInTime) {
            setCheckInTime(checkInTime);
            return this;
        }

        public QueryBuilder checkInTimeList(java.time.LocalDateTime... checkInTime) {
            this.checkInTimeList = solveNullList(checkInTime);
            return this;
        }

        public QueryBuilder checkInTimeList(List<java.time.LocalDateTime> checkInTime) {
            this.checkInTimeList = checkInTime;
            return this;
        }

        public QueryBuilder fetchCheckInTime() {
            setFetchFields("fetchFields", "checkInTime");
            return this;
        }

        public QueryBuilder excludeCheckInTime() {
            setFetchFields("excludeFields", "checkInTime");
            return this;
        }

        public QueryBuilder checkOutTimeBetWeen(java.time.LocalDateTime checkOutTimeSt, java.time.LocalDateTime checkOutTimeEd) {
            this.checkOutTimeSt = checkOutTimeSt;
            this.checkOutTimeEd = checkOutTimeEd;
            return this;
        }

        public QueryBuilder checkOutTimeGreaterEqThan(java.time.LocalDateTime checkOutTimeSt) {
            this.checkOutTimeSt = checkOutTimeSt;
            return this;
        }

        public QueryBuilder checkOutTimeLessEqThan(java.time.LocalDateTime checkOutTimeEd) {
            this.checkOutTimeEd = checkOutTimeEd;
            return this;
        }


        public QueryBuilder checkOutTime(java.time.LocalDate checkOutTime) {
            setCheckOutTime(checkOutTime);
            return this;
        }

        public QueryBuilder checkOutTimeList(java.time.LocalDateTime... checkOutTime) {
            this.checkOutTimeList = solveNullList(checkOutTime);
            return this;
        }

        public QueryBuilder checkOutTimeList(List<java.time.LocalDateTime> checkOutTime) {
            this.checkOutTimeList = checkOutTime;
            return this;
        }

        public QueryBuilder fetchCheckOutTime() {
            setFetchFields("fetchFields", "checkOutTime");
            return this;
        }

        public QueryBuilder excludeCheckOutTime() {
            setFetchFields("excludeFields", "checkOutTime");
            return this;
        }

        public QueryBuilder createdTimeBetWeen(java.time.LocalDateTime createdTimeSt, java.time.LocalDateTime createdTimeEd) {
            this.createdTimeSt = createdTimeSt;
            this.createdTimeEd = createdTimeEd;
            return this;
        }

        public QueryBuilder createdTimeGreaterEqThan(java.time.LocalDateTime createdTimeSt) {
            this.createdTimeSt = createdTimeSt;
            return this;
        }

        public QueryBuilder createdTimeLessEqThan(java.time.LocalDateTime createdTimeEd) {
            this.createdTimeEd = createdTimeEd;
            return this;
        }


        public QueryBuilder createdTime(java.time.LocalDateTime createdTime) {
            setCreatedTime(createdTime);
            return this;
        }

        public QueryBuilder createdTimeList(java.time.LocalDateTime... createdTime) {
            this.createdTimeList = solveNullList(createdTime);
            return this;
        }

        public QueryBuilder createdTimeList(List<java.time.LocalDateTime> createdTime) {
            this.createdTimeList = createdTime;
            return this;
        }

        public QueryBuilder fetchCreatedTime() {
            setFetchFields("fetchFields", "createdTime");
            return this;
        }

        public QueryBuilder excludeCreatedTime() {
            setFetchFields("excludeFields", "createdTime");
            return this;
        }

        public QueryBuilder tenantCountBetWeen(Integer tenantCountSt, Integer tenantCountEd) {
            this.tenantCountSt = tenantCountSt;
            this.tenantCountEd = tenantCountEd;
            return this;
        }

        public QueryBuilder tenantCountGreaterEqThan(Integer tenantCountSt) {
            this.tenantCountSt = tenantCountSt;
            return this;
        }

        public QueryBuilder tenantCountLessEqThan(Integer tenantCountEd) {
            this.tenantCountEd = tenantCountEd;
            return this;
        }


        public QueryBuilder tenantCount(Integer tenantCount) {
            setTenantCount(tenantCount);
            return this;
        }

        public QueryBuilder tenantCountList(Integer... tenantCount) {
            this.tenantCountList = solveNullList(tenantCount);
            return this;
        }

        public QueryBuilder tenantCountList(List<Integer> tenantCount) {
            this.tenantCountList = tenantCount;
            return this;
        }

        public QueryBuilder fetchTenantCount() {
            setFetchFields("fetchFields", "tenantCount");
            return this;
        }

        public QueryBuilder excludeTenantCount() {
            setFetchFields("excludeFields", "tenantCount");
            return this;
        }

        public QueryBuilder fuzzyComment(List<String> fuzzyComment) {
            this.fuzzyComment = fuzzyComment;
            return this;
        }

        public QueryBuilder fuzzyComment(String... fuzzyComment) {
            this.fuzzyComment = solveNullList(fuzzyComment);
            return this;
        }

        public QueryBuilder rightFuzzyComment(List<String> rightFuzzyComment) {
            this.rightFuzzyComment = rightFuzzyComment;
            return this;
        }

        public QueryBuilder rightFuzzyComment(String... rightFuzzyComment) {
            this.rightFuzzyComment = solveNullList(rightFuzzyComment);
            return this;
        }

        public QueryBuilder comment(String comment) {
            setComment(comment);
            return this;
        }

        public QueryBuilder commentList(String... comment) {
            this.commentList = solveNullList(comment);
            return this;
        }

        public QueryBuilder commentList(List<String> comment) {
            this.commentList = comment;
            return this;
        }

        public QueryBuilder fetchComment() {
            setFetchFields("fetchFields", "comment");
            return this;
        }

        public QueryBuilder excludeComment() {
            setFetchFields("excludeFields", "comment");
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

        public Order build() {
            return this;
        }
    }


    public static class ConditionBuilder {
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

        private List<String> idCardList;

        public List<String> getIdCardList() {
            return this.idCardList;
        }


        private List<String> fuzzyIdCard;

        public List<String> getFuzzyIdCard() {
            return this.fuzzyIdCard;
        }

        private List<String> rightFuzzyIdCard;

        public List<String> getRightFuzzyIdCard() {
            return this.rightFuzzyIdCard;
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

        private List<String> roomTypeList;

        public List<String> getRoomTypeList() {
            return this.roomTypeList;
        }


        private List<String> fuzzyRoomType;

        public List<String> getFuzzyRoomType() {
            return this.fuzzyRoomType;
        }

        private List<String> rightFuzzyRoomType;

        public List<String> getRightFuzzyRoomType() {
            return this.rightFuzzyRoomType;
        }

        private List<Long> totalChargeList;

        public List<Long> getTotalChargeList() {
            return this.totalChargeList;
        }

        private Long totalChargeSt;

        private Long totalChargeEd;

        public Long getTotalChargeSt() {
            return this.totalChargeSt;
        }

        public Long getTotalChargeEd() {
            return this.totalChargeEd;
        }

        private List<String> payTypeList;

        public List<String> getPayTypeList() {
            return this.payTypeList;
        }


        private List<String> fuzzyPayType;

        public List<String> getFuzzyPayType() {
            return this.fuzzyPayType;
        }

        private List<String> rightFuzzyPayType;

        public List<String> getRightFuzzyPayType() {
            return this.rightFuzzyPayType;
        }

        private List<java.time.LocalDateTime> checkInTimeList;

        public List<java.time.LocalDateTime> getCheckInTimeList() {
            return this.checkInTimeList;
        }

        private java.time.LocalDateTime checkInTimeSt;

        private java.time.LocalDateTime checkInTimeEd;

        public java.time.LocalDateTime getCheckInTimeSt() {
            return this.checkInTimeSt;
        }

        public java.time.LocalDateTime getCheckInTimeEd() {
            return this.checkInTimeEd;
        }

        private List<java.time.LocalDateTime> checkOutTimeList;

        public List<java.time.LocalDateTime> getCheckOutTimeList() {
            return this.checkOutTimeList;
        }

        private java.time.LocalDateTime checkOutTimeSt;

        private java.time.LocalDateTime checkOutTimeEd;

        public java.time.LocalDateTime getCheckOutTimeSt() {
            return this.checkOutTimeSt;
        }

        public java.time.LocalDateTime getCheckOutTimeEd() {
            return this.checkOutTimeEd;
        }

        private List<java.time.LocalDateTime> createdTimeList;

        public List<java.time.LocalDateTime> getCreatedTimeList() {
            return this.createdTimeList;
        }

        private java.time.LocalDateTime createdTimeSt;

        private java.time.LocalDateTime createdTimeEd;

        public java.time.LocalDateTime getCreatedTimeSt() {
            return this.createdTimeSt;
        }

        public java.time.LocalDateTime getCreatedTimeEd() {
            return this.createdTimeEd;
        }

        private List<Integer> tenantCountList;

        public List<Integer> getTenantCountList() {
            return this.tenantCountList;
        }

        private Integer tenantCountSt;

        private Integer tenantCountEd;

        public Integer getTenantCountSt() {
            return this.tenantCountSt;
        }

        public Integer getTenantCountEd() {
            return this.tenantCountEd;
        }

        private List<String> commentList;

        public List<String> getCommentList() {
            return this.commentList;
        }


        private List<String> fuzzyComment;

        public List<String> getFuzzyComment() {
            return this.fuzzyComment;
        }

        private List<String> rightFuzzyComment;

        public List<String> getRightFuzzyComment() {
            return this.rightFuzzyComment;
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

        public ConditionBuilder fuzzyIdCard(List<String> fuzzyIdCard) {
            this.fuzzyIdCard = fuzzyIdCard;
            return this;
        }

        public ConditionBuilder fuzzyIdCard(String... fuzzyIdCard) {
            this.fuzzyIdCard = solveNullList(fuzzyIdCard);
            return this;
        }

        public ConditionBuilder rightFuzzyIdCard(List<String> rightFuzzyIdCard) {
            this.rightFuzzyIdCard = rightFuzzyIdCard;
            return this;
        }

        public ConditionBuilder rightFuzzyIdCard(String... rightFuzzyIdCard) {
            this.rightFuzzyIdCard = solveNullList(rightFuzzyIdCard);
            return this;
        }

        public ConditionBuilder idCardList(String... idCard) {
            this.idCardList = solveNullList(idCard);
            return this;
        }

        public ConditionBuilder idCardList(List<String> idCard) {
            this.idCardList = idCard;
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

        public ConditionBuilder fuzzyRoomType(List<String> fuzzyRoomType) {
            this.fuzzyRoomType = fuzzyRoomType;
            return this;
        }

        public ConditionBuilder fuzzyRoomType(String... fuzzyRoomType) {
            this.fuzzyRoomType = solveNullList(fuzzyRoomType);
            return this;
        }

        public ConditionBuilder rightFuzzyRoomType(List<String> rightFuzzyRoomType) {
            this.rightFuzzyRoomType = rightFuzzyRoomType;
            return this;
        }

        public ConditionBuilder rightFuzzyRoomType(String... rightFuzzyRoomType) {
            this.rightFuzzyRoomType = solveNullList(rightFuzzyRoomType);
            return this;
        }

        public ConditionBuilder roomTypeList(String... roomType) {
            this.roomTypeList = solveNullList(roomType);
            return this;
        }

        public ConditionBuilder roomTypeList(List<String> roomType) {
            this.roomTypeList = roomType;
            return this;
        }

        public ConditionBuilder totalChargeBetWeen(Long totalChargeSt, Long totalChargeEd) {
            this.totalChargeSt = totalChargeSt;
            this.totalChargeEd = totalChargeEd;
            return this;
        }

        public ConditionBuilder totalChargeGreaterEqThan(Long totalChargeSt) {
            this.totalChargeSt = totalChargeSt;
            return this;
        }

        public ConditionBuilder totalChargeLessEqThan(Long totalChargeEd) {
            this.totalChargeEd = totalChargeEd;
            return this;
        }


        public ConditionBuilder totalChargeList(Long... totalCharge) {
            this.totalChargeList = solveNullList(totalCharge);
            return this;
        }

        public ConditionBuilder totalChargeList(List<Long> totalCharge) {
            this.totalChargeList = totalCharge;
            return this;
        }

        public ConditionBuilder fuzzyPayType(List<String> fuzzyPayType) {
            this.fuzzyPayType = fuzzyPayType;
            return this;
        }

        public ConditionBuilder fuzzyPayType(String... fuzzyPayType) {
            this.fuzzyPayType = solveNullList(fuzzyPayType);
            return this;
        }

        public ConditionBuilder rightFuzzyPayType(List<String> rightFuzzyPayType) {
            this.rightFuzzyPayType = rightFuzzyPayType;
            return this;
        }

        public ConditionBuilder rightFuzzyPayType(String... rightFuzzyPayType) {
            this.rightFuzzyPayType = solveNullList(rightFuzzyPayType);
            return this;
        }

        public ConditionBuilder payTypeList(String... payType) {
            this.payTypeList = solveNullList(payType);
            return this;
        }

        public ConditionBuilder payTypeList(List<String> payType) {
            this.payTypeList = payType;
            return this;
        }

        public ConditionBuilder checkInTimeBetWeen(java.time.LocalDateTime checkInTimeSt, java.time.LocalDateTime checkInTimeEd) {
            this.checkInTimeSt = checkInTimeSt;
            this.checkInTimeEd = checkInTimeEd;
            return this;
        }

        public ConditionBuilder checkInTimeGreaterEqThan(java.time.LocalDateTime checkInTimeSt) {
            this.checkInTimeSt = checkInTimeSt;
            return this;
        }

        public ConditionBuilder checkInTimeLessEqThan(java.time.LocalDateTime checkInTimeEd) {
            this.checkInTimeEd = checkInTimeEd;
            return this;
        }


        public ConditionBuilder checkInTimeList(java.time.LocalDateTime... checkInTime) {
            this.checkInTimeList = solveNullList(checkInTime);
            return this;
        }

        public ConditionBuilder checkInTimeList(List<java.time.LocalDateTime> checkInTime) {
            this.checkInTimeList = checkInTime;
            return this;
        }

        public ConditionBuilder checkOutTimeBetWeen(java.time.LocalDateTime checkOutTimeSt, java.time.LocalDateTime checkOutTimeEd) {
            this.checkOutTimeSt = checkOutTimeSt;
            this.checkOutTimeEd = checkOutTimeEd;
            return this;
        }

        public ConditionBuilder checkOutTimeGreaterEqThan(java.time.LocalDateTime checkOutTimeSt) {
            this.checkOutTimeSt = checkOutTimeSt;
            return this;
        }

        public ConditionBuilder checkOutTimeLessEqThan(java.time.LocalDateTime checkOutTimeEd) {
            this.checkOutTimeEd = checkOutTimeEd;
            return this;
        }


        public ConditionBuilder checkOutTimeList(java.time.LocalDateTime... checkOutTime) {
            this.checkOutTimeList = solveNullList(checkOutTime);
            return this;
        }

        public ConditionBuilder checkOutTimeList(List<java.time.LocalDateTime> checkOutTime) {
            this.checkOutTimeList = checkOutTime;
            return this;
        }

        public ConditionBuilder createdTimeBetWeen(java.time.LocalDateTime createdTimeSt, java.time.LocalDateTime createdTimeEd) {
            this.createdTimeSt = createdTimeSt;
            this.createdTimeEd = createdTimeEd;
            return this;
        }

        public ConditionBuilder createdTimeGreaterEqThan(java.time.LocalDateTime createdTimeSt) {
            this.createdTimeSt = createdTimeSt;
            return this;
        }

        public ConditionBuilder createdTimeLessEqThan(java.time.LocalDateTime createdTimeEd) {
            this.createdTimeEd = createdTimeEd;
            return this;
        }


        public ConditionBuilder createdTimeList(java.time.LocalDateTime... createdTime) {
            this.createdTimeList = solveNullList(createdTime);
            return this;
        }

        public ConditionBuilder createdTimeList(List<java.time.LocalDateTime> createdTime) {
            this.createdTimeList = createdTime;
            return this;
        }

        public ConditionBuilder tenantCountBetWeen(Integer tenantCountSt, Integer tenantCountEd) {
            this.tenantCountSt = tenantCountSt;
            this.tenantCountEd = tenantCountEd;
            return this;
        }

        public ConditionBuilder tenantCountGreaterEqThan(Integer tenantCountSt) {
            this.tenantCountSt = tenantCountSt;
            return this;
        }

        public ConditionBuilder tenantCountLessEqThan(Integer tenantCountEd) {
            this.tenantCountEd = tenantCountEd;
            return this;
        }


        public ConditionBuilder tenantCountList(Integer... tenantCount) {
            this.tenantCountList = solveNullList(tenantCount);
            return this;
        }

        public ConditionBuilder tenantCountList(List<Integer> tenantCount) {
            this.tenantCountList = tenantCount;
            return this;
        }

        public ConditionBuilder fuzzyComment(List<String> fuzzyComment) {
            this.fuzzyComment = fuzzyComment;
            return this;
        }

        public ConditionBuilder fuzzyComment(String... fuzzyComment) {
            this.fuzzyComment = solveNullList(fuzzyComment);
            return this;
        }

        public ConditionBuilder rightFuzzyComment(List<String> rightFuzzyComment) {
            this.rightFuzzyComment = rightFuzzyComment;
            return this;
        }

        public ConditionBuilder rightFuzzyComment(String... rightFuzzyComment) {
            this.rightFuzzyComment = solveNullList(rightFuzzyComment);
            return this;
        }

        public ConditionBuilder commentList(String... comment) {
            this.commentList = solveNullList(comment);
            return this;
        }

        public ConditionBuilder commentList(List<String> comment) {
            this.commentList = comment;
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

        private Order obj;

        public Builder() {
            this.obj = new Order();
        }

        public Builder phone(String phone) {
            this.obj.setPhone(phone);
            return this;
        }

        public Builder idCard(String idCard) {
            this.obj.setIdCard(idCard);
            return this;
        }

        public Builder hid(Integer hid) {
            this.obj.setHid(hid);
            return this;
        }

        public Builder hotelName(String hotelName) {
            this.obj.setHotelName(hotelName);
            return this;
        }

        public Builder roomType(String roomType) {
            this.obj.setRoomType(roomType);
            return this;
        }

        public Builder totalCharge(Long totalCharge) {
            this.obj.setTotalCharge(totalCharge);
            return this;
        }

        public Builder payType(String payType) {
            this.obj.setPayType(payType);
            return this;
        }

        public Builder checkInTime(java.time.LocalDate checkInTime) {
            this.obj.setCheckInTime(checkInTime);
            return this;
        }

        public Builder checkOutTime(java.time.LocalDate checkOutTime) {
            this.obj.setCheckOutTime(checkOutTime);
            return this;
        }

        public Builder createdTime(java.time.LocalDateTime createdTime) {
            this.obj.setCreatedTime(createdTime);
            return this;
        }

        public Builder tenantCount(Integer tenantCount) {
            this.obj.setTenantCount(tenantCount);
            return this;
        }

        public Builder comment(String comment) {
            this.obj.setComment(comment);
            return this;
        }

        public Order build() {
            return obj;
        }
    }

}
