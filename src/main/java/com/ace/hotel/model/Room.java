package com.ace.hotel.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * @author author
 */
public class Room implements Serializable {

    private static final long serialVersionUID = 1572499050518L;


    /**
     * 主键
     * 酒店id
     * isNullAble:0
     */
    private Integer hid;

    /**
     * 主键
     * 房型
     * isNullAble:0
     */
    private String roomType;

    /**
     * 最大入住人数
     * isNullAble:0
     */
    private Integer maxTenant;

    /**
     * 床型
     * isNullAble:1,defaultVal:商家还没添加床型描述哦
     */
    private String bedType;

    /**
     * 餐点类型
     * isNullAble:1,defaultVal:商家还没有添加餐点描述哦
     */
    private String dinnerType;

    /**
     * 价格
     * isNullAble:0
     */
    private Integer charge;

    /**
     * 剩余房间数
     * isNullAble:0
     */
    private Integer remain;

    /**
     * 设施服务
     * isNullAble:1,defaultVal:商家还没有添加设施服务描述哦
     */
    private String facilities;

    /**
     * 允许退订时长(分钟)
     * isNullAble:0,defaultVal:-1
     */
    private Integer policy;


    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public Integer getHid() {
        return this.hid;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomType() {
        return this.roomType;
    }

    public void setMaxTenant(Integer maxTenant) {
        this.maxTenant = maxTenant;
    }

    public Integer getMaxTenant() {
        return this.maxTenant;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public String getBedType() {
        return this.bedType;
    }

    public void setDinnerType(String dinnerType) {
        this.dinnerType = dinnerType;
    }

    public String getDinnerType() {
        return this.dinnerType;
    }

    public void setCharge(Integer charge) {
        this.charge = charge;
    }

    public Integer getCharge() {
        return this.charge;
    }

    public void setRemain(Integer remain) {
        this.remain = remain;
    }

    public Integer getRemain() {
        return this.remain;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public String getFacilities() {
        return this.facilities;
    }

    public void setPolicy(Integer policy) {
        this.policy = policy;
    }

    public Integer getPolicy() {
        return this.policy;
    }

    @Override
    public String toString() {
        return "Room{" +
                "hid='" + hid + '\'' +
                "roomType='" + roomType + '\'' +
                "maxTenant='" + maxTenant + '\'' +
                "bedType='" + bedType + '\'' +
                "dinnerType='" + dinnerType + '\'' +
                "charge='" + charge + '\'' +
                "remain='" + remain + '\'' +
                "facilities='" + facilities + '\'' +
                "policy='" + policy + '\'' +
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

        private Room set;

        private ConditionBuilder where;

        public UpdateBuilder set(Room set) {
            this.set = set;
            return this;
        }

        public Room getSet() {
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

    public static class QueryBuilder extends Room {
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

        private List<Integer> maxTenantList;

        public List<Integer> getMaxTenantList() {
            return this.maxTenantList;
        }

        private Integer maxTenantSt;

        private Integer maxTenantEd;

        public Integer getMaxTenantSt() {
            return this.maxTenantSt;
        }

        public Integer getMaxTenantEd() {
            return this.maxTenantEd;
        }

        private List<String> bedTypeList;

        public List<String> getBedTypeList() {
            return this.bedTypeList;
        }


        private List<String> fuzzyBedType;

        public List<String> getFuzzyBedType() {
            return this.fuzzyBedType;
        }

        private List<String> rightFuzzyBedType;

        public List<String> getRightFuzzyBedType() {
            return this.rightFuzzyBedType;
        }

        private List<String> dinnerTypeList;

        public List<String> getDinnerTypeList() {
            return this.dinnerTypeList;
        }


        private List<String> fuzzyDinnerType;

        public List<String> getFuzzyDinnerType() {
            return this.fuzzyDinnerType;
        }

        private List<String> rightFuzzyDinnerType;

        public List<String> getRightFuzzyDinnerType() {
            return this.rightFuzzyDinnerType;
        }

        private List<Integer> chargeList;

        public List<Integer> getChargeList() {
            return this.chargeList;
        }

        private Integer chargeSt;

        private Integer chargeEd;

        public Integer getChargeSt() {
            return this.chargeSt;
        }

        public Integer getChargeEd() {
            return this.chargeEd;
        }

        private List<Integer> remainList;

        public List<Integer> getRemainList() {
            return this.remainList;
        }

        private Integer remainSt;

        private Integer remainEd;

        public Integer getRemainSt() {
            return this.remainSt;
        }

        public Integer getRemainEd() {
            return this.remainEd;
        }

        private List<String> facilitiesList;

        public List<String> getFacilitiesList() {
            return this.facilitiesList;
        }


        private List<String> fuzzyFacilities;

        public List<String> getFuzzyFacilities() {
            return this.fuzzyFacilities;
        }

        private List<String> rightFuzzyFacilities;

        public List<String> getRightFuzzyFacilities() {
            return this.rightFuzzyFacilities;
        }

        private List<Integer> policyList;

        public List<Integer> getPolicyList() {
            return this.policyList;
        }

        private Integer policySt;

        private Integer policyEd;

        public Integer getPolicySt() {
            return this.policySt;
        }

        public Integer getPolicyEd() {
            return this.policyEd;
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

        public QueryBuilder maxTenantBetWeen(Integer maxTenantSt, Integer maxTenantEd) {
            this.maxTenantSt = maxTenantSt;
            this.maxTenantEd = maxTenantEd;
            return this;
        }

        public QueryBuilder maxTenantGreaterEqThan(Integer maxTenantSt) {
            this.maxTenantSt = maxTenantSt;
            return this;
        }

        public QueryBuilder maxTenantLessEqThan(Integer maxTenantEd) {
            this.maxTenantEd = maxTenantEd;
            return this;
        }


        public QueryBuilder maxTenant(Integer maxTenant) {
            setMaxTenant(maxTenant);
            return this;
        }

        public QueryBuilder maxTenantList(Integer... maxTenant) {
            this.maxTenantList = solveNullList(maxTenant);
            return this;
        }

        public QueryBuilder maxTenantList(List<Integer> maxTenant) {
            this.maxTenantList = maxTenant;
            return this;
        }

        public QueryBuilder fetchMaxTenant() {
            setFetchFields("fetchFields", "maxTenant");
            return this;
        }

        public QueryBuilder excludeMaxTenant() {
            setFetchFields("excludeFields", "maxTenant");
            return this;
        }

        public QueryBuilder fuzzyBedType(List<String> fuzzyBedType) {
            this.fuzzyBedType = fuzzyBedType;
            return this;
        }

        public QueryBuilder fuzzyBedType(String... fuzzyBedType) {
            this.fuzzyBedType = solveNullList(fuzzyBedType);
            return this;
        }

        public QueryBuilder rightFuzzyBedType(List<String> rightFuzzyBedType) {
            this.rightFuzzyBedType = rightFuzzyBedType;
            return this;
        }

        public QueryBuilder rightFuzzyBedType(String... rightFuzzyBedType) {
            this.rightFuzzyBedType = solveNullList(rightFuzzyBedType);
            return this;
        }

        public QueryBuilder bedType(String bedType) {
            setBedType(bedType);
            return this;
        }

        public QueryBuilder bedTypeList(String... bedType) {
            this.bedTypeList = solveNullList(bedType);
            return this;
        }

        public QueryBuilder bedTypeList(List<String> bedType) {
            this.bedTypeList = bedType;
            return this;
        }

        public QueryBuilder fetchBedType() {
            setFetchFields("fetchFields", "bedType");
            return this;
        }

        public QueryBuilder excludeBedType() {
            setFetchFields("excludeFields", "bedType");
            return this;
        }

        public QueryBuilder fuzzyDinnerType(List<String> fuzzyDinnerType) {
            this.fuzzyDinnerType = fuzzyDinnerType;
            return this;
        }

        public QueryBuilder fuzzyDinnerType(String... fuzzyDinnerType) {
            this.fuzzyDinnerType = solveNullList(fuzzyDinnerType);
            return this;
        }

        public QueryBuilder rightFuzzyDinnerType(List<String> rightFuzzyDinnerType) {
            this.rightFuzzyDinnerType = rightFuzzyDinnerType;
            return this;
        }

        public QueryBuilder rightFuzzyDinnerType(String... rightFuzzyDinnerType) {
            this.rightFuzzyDinnerType = solveNullList(rightFuzzyDinnerType);
            return this;
        }

        public QueryBuilder dinnerType(String dinnerType) {
            setDinnerType(dinnerType);
            return this;
        }

        public QueryBuilder dinnerTypeList(String... dinnerType) {
            this.dinnerTypeList = solveNullList(dinnerType);
            return this;
        }

        public QueryBuilder dinnerTypeList(List<String> dinnerType) {
            this.dinnerTypeList = dinnerType;
            return this;
        }

        public QueryBuilder fetchDinnerType() {
            setFetchFields("fetchFields", "dinnerType");
            return this;
        }

        public QueryBuilder excludeDinnerType() {
            setFetchFields("excludeFields", "dinnerType");
            return this;
        }

        public QueryBuilder chargeBetWeen(Integer chargeSt, Integer chargeEd) {
            this.chargeSt = chargeSt;
            this.chargeEd = chargeEd;
            return this;
        }

        public QueryBuilder chargeGreaterEqThan(Integer chargeSt) {
            this.chargeSt = chargeSt;
            return this;
        }

        public QueryBuilder chargeLessEqThan(Integer chargeEd) {
            this.chargeEd = chargeEd;
            return this;
        }


        public QueryBuilder charge(Integer charge) {
            setCharge(charge);
            return this;
        }

        public QueryBuilder chargeList(Integer... charge) {
            this.chargeList = solveNullList(charge);
            return this;
        }

        public QueryBuilder chargeList(List<Integer> charge) {
            this.chargeList = charge;
            return this;
        }

        public QueryBuilder fetchCharge() {
            setFetchFields("fetchFields", "charge");
            return this;
        }

        public QueryBuilder excludeCharge() {
            setFetchFields("excludeFields", "charge");
            return this;
        }

        public QueryBuilder remainBetWeen(Integer remainSt, Integer remainEd) {
            this.remainSt = remainSt;
            this.remainEd = remainEd;
            return this;
        }

        public QueryBuilder remainGreaterEqThan(Integer remainSt) {
            this.remainSt = remainSt;
            return this;
        }

        public QueryBuilder remainLessEqThan(Integer remainEd) {
            this.remainEd = remainEd;
            return this;
        }


        public QueryBuilder remain(Integer remain) {
            setRemain(remain);
            return this;
        }

        public QueryBuilder remainList(Integer... remain) {
            this.remainList = solveNullList(remain);
            return this;
        }

        public QueryBuilder remainList(List<Integer> remain) {
            this.remainList = remain;
            return this;
        }

        public QueryBuilder fetchRemain() {
            setFetchFields("fetchFields", "remain");
            return this;
        }

        public QueryBuilder excludeRemain() {
            setFetchFields("excludeFields", "remain");
            return this;
        }

        public QueryBuilder fuzzyFacilities(List<String> fuzzyFacilities) {
            this.fuzzyFacilities = fuzzyFacilities;
            return this;
        }

        public QueryBuilder fuzzyFacilities(String... fuzzyFacilities) {
            this.fuzzyFacilities = solveNullList(fuzzyFacilities);
            return this;
        }

        public QueryBuilder rightFuzzyFacilities(List<String> rightFuzzyFacilities) {
            this.rightFuzzyFacilities = rightFuzzyFacilities;
            return this;
        }

        public QueryBuilder rightFuzzyFacilities(String... rightFuzzyFacilities) {
            this.rightFuzzyFacilities = solveNullList(rightFuzzyFacilities);
            return this;
        }

        public QueryBuilder facilities(String facilities) {
            setFacilities(facilities);
            return this;
        }

        public QueryBuilder facilitiesList(String... facilities) {
            this.facilitiesList = solveNullList(facilities);
            return this;
        }

        public QueryBuilder facilitiesList(List<String> facilities) {
            this.facilitiesList = facilities;
            return this;
        }

        public QueryBuilder fetchFacilities() {
            setFetchFields("fetchFields", "facilities");
            return this;
        }

        public QueryBuilder excludeFacilities() {
            setFetchFields("excludeFields", "facilities");
            return this;
        }

        public QueryBuilder policyBetWeen(Integer policySt, Integer policyEd) {
            this.policySt = policySt;
            this.policyEd = policyEd;
            return this;
        }

        public QueryBuilder policyGreaterEqThan(Integer policySt) {
            this.policySt = policySt;
            return this;
        }

        public QueryBuilder policyLessEqThan(Integer policyEd) {
            this.policyEd = policyEd;
            return this;
        }


        public QueryBuilder policy(Integer policy) {
            setPolicy(policy);
            return this;
        }

        public QueryBuilder policyList(Integer... policy) {
            this.policyList = solveNullList(policy);
            return this;
        }

        public QueryBuilder policyList(List<Integer> policy) {
            this.policyList = policy;
            return this;
        }

        public QueryBuilder fetchPolicy() {
            setFetchFields("fetchFields", "policy");
            return this;
        }

        public QueryBuilder excludePolicy() {
            setFetchFields("excludeFields", "policy");
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

        public Room build() {
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

        private List<Integer> maxTenantList;

        public List<Integer> getMaxTenantList() {
            return this.maxTenantList;
        }

        private Integer maxTenantSt;

        private Integer maxTenantEd;

        public Integer getMaxTenantSt() {
            return this.maxTenantSt;
        }

        public Integer getMaxTenantEd() {
            return this.maxTenantEd;
        }

        private List<String> bedTypeList;

        public List<String> getBedTypeList() {
            return this.bedTypeList;
        }


        private List<String> fuzzyBedType;

        public List<String> getFuzzyBedType() {
            return this.fuzzyBedType;
        }

        private List<String> rightFuzzyBedType;

        public List<String> getRightFuzzyBedType() {
            return this.rightFuzzyBedType;
        }

        private List<String> dinnerTypeList;

        public List<String> getDinnerTypeList() {
            return this.dinnerTypeList;
        }


        private List<String> fuzzyDinnerType;

        public List<String> getFuzzyDinnerType() {
            return this.fuzzyDinnerType;
        }

        private List<String> rightFuzzyDinnerType;

        public List<String> getRightFuzzyDinnerType() {
            return this.rightFuzzyDinnerType;
        }

        private List<Integer> chargeList;

        public List<Integer> getChargeList() {
            return this.chargeList;
        }

        private Integer chargeSt;

        private Integer chargeEd;

        public Integer getChargeSt() {
            return this.chargeSt;
        }

        public Integer getChargeEd() {
            return this.chargeEd;
        }

        private List<Integer> remainList;

        public List<Integer> getRemainList() {
            return this.remainList;
        }

        private Integer remainSt;

        private Integer remainEd;

        public Integer getRemainSt() {
            return this.remainSt;
        }

        public Integer getRemainEd() {
            return this.remainEd;
        }

        private List<String> facilitiesList;

        public List<String> getFacilitiesList() {
            return this.facilitiesList;
        }


        private List<String> fuzzyFacilities;

        public List<String> getFuzzyFacilities() {
            return this.fuzzyFacilities;
        }

        private List<String> rightFuzzyFacilities;

        public List<String> getRightFuzzyFacilities() {
            return this.rightFuzzyFacilities;
        }

        private List<Integer> policyList;

        public List<Integer> getPolicyList() {
            return this.policyList;
        }

        private Integer policySt;

        private Integer policyEd;

        public Integer getPolicySt() {
            return this.policySt;
        }

        public Integer getPolicyEd() {
            return this.policyEd;
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

        public ConditionBuilder maxTenantBetWeen(Integer maxTenantSt, Integer maxTenantEd) {
            this.maxTenantSt = maxTenantSt;
            this.maxTenantEd = maxTenantEd;
            return this;
        }

        public ConditionBuilder maxTenantGreaterEqThan(Integer maxTenantSt) {
            this.maxTenantSt = maxTenantSt;
            return this;
        }

        public ConditionBuilder maxTenantLessEqThan(Integer maxTenantEd) {
            this.maxTenantEd = maxTenantEd;
            return this;
        }


        public ConditionBuilder maxTenantList(Integer... maxTenant) {
            this.maxTenantList = solveNullList(maxTenant);
            return this;
        }

        public ConditionBuilder maxTenantList(List<Integer> maxTenant) {
            this.maxTenantList = maxTenant;
            return this;
        }

        public ConditionBuilder fuzzyBedType(List<String> fuzzyBedType) {
            this.fuzzyBedType = fuzzyBedType;
            return this;
        }

        public ConditionBuilder fuzzyBedType(String... fuzzyBedType) {
            this.fuzzyBedType = solveNullList(fuzzyBedType);
            return this;
        }

        public ConditionBuilder rightFuzzyBedType(List<String> rightFuzzyBedType) {
            this.rightFuzzyBedType = rightFuzzyBedType;
            return this;
        }

        public ConditionBuilder rightFuzzyBedType(String... rightFuzzyBedType) {
            this.rightFuzzyBedType = solveNullList(rightFuzzyBedType);
            return this;
        }

        public ConditionBuilder bedTypeList(String... bedType) {
            this.bedTypeList = solveNullList(bedType);
            return this;
        }

        public ConditionBuilder bedTypeList(List<String> bedType) {
            this.bedTypeList = bedType;
            return this;
        }

        public ConditionBuilder fuzzyDinnerType(List<String> fuzzyDinnerType) {
            this.fuzzyDinnerType = fuzzyDinnerType;
            return this;
        }

        public ConditionBuilder fuzzyDinnerType(String... fuzzyDinnerType) {
            this.fuzzyDinnerType = solveNullList(fuzzyDinnerType);
            return this;
        }

        public ConditionBuilder rightFuzzyDinnerType(List<String> rightFuzzyDinnerType) {
            this.rightFuzzyDinnerType = rightFuzzyDinnerType;
            return this;
        }

        public ConditionBuilder rightFuzzyDinnerType(String... rightFuzzyDinnerType) {
            this.rightFuzzyDinnerType = solveNullList(rightFuzzyDinnerType);
            return this;
        }

        public ConditionBuilder dinnerTypeList(String... dinnerType) {
            this.dinnerTypeList = solveNullList(dinnerType);
            return this;
        }

        public ConditionBuilder dinnerTypeList(List<String> dinnerType) {
            this.dinnerTypeList = dinnerType;
            return this;
        }

        public ConditionBuilder chargeBetWeen(Integer chargeSt, Integer chargeEd) {
            this.chargeSt = chargeSt;
            this.chargeEd = chargeEd;
            return this;
        }

        public ConditionBuilder chargeGreaterEqThan(Integer chargeSt) {
            this.chargeSt = chargeSt;
            return this;
        }

        public ConditionBuilder chargeLessEqThan(Integer chargeEd) {
            this.chargeEd = chargeEd;
            return this;
        }


        public ConditionBuilder chargeList(Integer... charge) {
            this.chargeList = solveNullList(charge);
            return this;
        }

        public ConditionBuilder chargeList(List<Integer> charge) {
            this.chargeList = charge;
            return this;
        }

        public ConditionBuilder remainBetWeen(Integer remainSt, Integer remainEd) {
            this.remainSt = remainSt;
            this.remainEd = remainEd;
            return this;
        }

        public ConditionBuilder remainGreaterEqThan(Integer remainSt) {
            this.remainSt = remainSt;
            return this;
        }

        public ConditionBuilder remainLessEqThan(Integer remainEd) {
            this.remainEd = remainEd;
            return this;
        }


        public ConditionBuilder remainList(Integer... remain) {
            this.remainList = solveNullList(remain);
            return this;
        }

        public ConditionBuilder remainList(List<Integer> remain) {
            this.remainList = remain;
            return this;
        }

        public ConditionBuilder fuzzyFacilities(List<String> fuzzyFacilities) {
            this.fuzzyFacilities = fuzzyFacilities;
            return this;
        }

        public ConditionBuilder fuzzyFacilities(String... fuzzyFacilities) {
            this.fuzzyFacilities = solveNullList(fuzzyFacilities);
            return this;
        }

        public ConditionBuilder rightFuzzyFacilities(List<String> rightFuzzyFacilities) {
            this.rightFuzzyFacilities = rightFuzzyFacilities;
            return this;
        }

        public ConditionBuilder rightFuzzyFacilities(String... rightFuzzyFacilities) {
            this.rightFuzzyFacilities = solveNullList(rightFuzzyFacilities);
            return this;
        }

        public ConditionBuilder facilitiesList(String... facilities) {
            this.facilitiesList = solveNullList(facilities);
            return this;
        }

        public ConditionBuilder facilitiesList(List<String> facilities) {
            this.facilitiesList = facilities;
            return this;
        }

        public ConditionBuilder policyBetWeen(Integer policySt, Integer policyEd) {
            this.policySt = policySt;
            this.policyEd = policyEd;
            return this;
        }

        public ConditionBuilder policyGreaterEqThan(Integer policySt) {
            this.policySt = policySt;
            return this;
        }

        public ConditionBuilder policyLessEqThan(Integer policyEd) {
            this.policyEd = policyEd;
            return this;
        }


        public ConditionBuilder policyList(Integer... policy) {
            this.policyList = solveNullList(policy);
            return this;
        }

        public ConditionBuilder policyList(List<Integer> policy) {
            this.policyList = policy;
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

        private Room obj;

        public Builder() {
            this.obj = new Room();
        }

        public Builder hid(Integer hid) {
            this.obj.setHid(hid);
            return this;
        }

        public Builder roomType(String roomType) {
            this.obj.setRoomType(roomType);
            return this;
        }

        public Builder maxTenant(Integer maxTenant) {
            this.obj.setMaxTenant(maxTenant);
            return this;
        }

        public Builder bedType(String bedType) {
            this.obj.setBedType(bedType);
            return this;
        }

        public Builder dinnerType(String dinnerType) {
            this.obj.setDinnerType(dinnerType);
            return this;
        }

        public Builder charge(Integer charge) {
            this.obj.setCharge(charge);
            return this;
        }

        public Builder remain(Integer remain) {
            this.obj.setRemain(remain);
            return this;
        }

        public Builder facilities(String facilities) {
            this.obj.setFacilities(facilities);
            return this;
        }

        public Builder policy(Integer policy) {
            this.obj.setPolicy(policy);
            return this;
        }

        public Room build() {
            return obj;
        }
    }

}
