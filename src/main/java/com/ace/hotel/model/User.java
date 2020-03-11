package com.ace.hotel.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * @author author
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1572512617288L;


    /**
     * 主键
     * 用户id
     * isNullAble:0
     */
    private Integer uid;

    /**
     * 用户名
     * isNullAble:0
     */
    private String userName;

    /**
     * 密码
     * isNullAble:0
     */
    private String password;

    /**
     * 性别
     * isNullAble:1,defaultVal:男
     */
    private String sex;

    /**
     * 电话号码
     * isNullAble:0
     */
    private String phone;

    /**
     * 电子邮件
     * isNullAble:1
     */
    private String email;

    /**
     * 注册时间
     * isNullAble:0
     */
    private java.time.LocalDateTime registerDate;

    /**
     * 身份证号
     * isNullAble:1
     */
    private String idCard;

    /**
     * 用户类型
     * isNullAble:0,defaultVal:user
     */
    private String authType;


    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getUid() {
        return this.uid;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return this.sex;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setRegisterDate(java.time.LocalDateTime registerDate) {
        this.registerDate = registerDate;
    }

    public java.time.LocalDateTime getRegisterDate() {
        return this.registerDate;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getIdCard() {
        return this.idCard;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public String getAuthType() {
        return this.authType;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                "userName='" + userName + '\'' +
                "password='" + password + '\'' +
                "sex='" + sex + '\'' +
                "phone='" + phone + '\'' +
                "email='" + email + '\'' +
                "registerDate='" + registerDate + '\'' +
                "idCard='" + idCard + '\'' +
                "authType='" + authType + '\'' +
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

        private User set;

        private ConditionBuilder where;

        public UpdateBuilder set(User set) {
            this.set = set;
            return this;
        }

        public User getSet() {
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

    public static class QueryBuilder extends User {
        /**
         * 需要返回的列
         */
        private Map<String, Object> fetchFields;

        public Map<String, Object> getFetchFields() {
            return this.fetchFields;
        }

        private List<Integer> uidList;

        public List<Integer> getUidList() {
            return this.uidList;
        }

        private Integer uidSt;

        private Integer uidEd;

        public Integer getUidSt() {
            return this.uidSt;
        }

        public Integer getUidEd() {
            return this.uidEd;
        }

        private List<String> userNameList;

        public List<String> getUserNameList() {
            return this.userNameList;
        }


        private List<String> fuzzyUserName;

        public List<String> getFuzzyUserName() {
            return this.fuzzyUserName;
        }

        private List<String> rightFuzzyUserName;

        public List<String> getRightFuzzyUserName() {
            return this.rightFuzzyUserName;
        }

        private List<String> passwordList;

        public List<String> getPasswordList() {
            return this.passwordList;
        }


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword() {
            return this.fuzzyPassword;
        }

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword() {
            return this.rightFuzzyPassword;
        }

        private List<String> sexList;

        public List<String> getSexList() {
            return this.sexList;
        }


        private List<String> fuzzySex;

        public List<String> getFuzzySex() {
            return this.fuzzySex;
        }

        private List<String> rightFuzzySex;

        public List<String> getRightFuzzySex() {
            return this.rightFuzzySex;
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

        private List<String> emailList;

        public List<String> getEmailList() {
            return this.emailList;
        }


        private List<String> fuzzyEmail;

        public List<String> getFuzzyEmail() {
            return this.fuzzyEmail;
        }

        private List<String> rightFuzzyEmail;

        public List<String> getRightFuzzyEmail() {
            return this.rightFuzzyEmail;
        }

        private List<java.time.LocalDateTime> registerDateList;

        public List<java.time.LocalDateTime> getRegisterDateList() {
            return this.registerDateList;
        }

        private java.time.LocalDateTime registerDateSt;

        private java.time.LocalDateTime registerDateEd;

        public java.time.LocalDateTime getRegisterDateSt() {
            return this.registerDateSt;
        }

        public java.time.LocalDateTime getRegisterDateEd() {
            return this.registerDateEd;
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

        private List<String> authTypeList;

        public List<String> getAuthTypeList() {
            return this.authTypeList;
        }


        private List<String> fuzzyAuthType;

        public List<String> getFuzzyAuthType() {
            return this.fuzzyAuthType;
        }

        private List<String> rightFuzzyAuthType;

        public List<String> getRightFuzzyAuthType() {
            return this.rightFuzzyAuthType;
        }

        private QueryBuilder() {
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder uidBetWeen(Integer uidSt, Integer uidEd) {
            this.uidSt = uidSt;
            this.uidEd = uidEd;
            return this;
        }

        public QueryBuilder uidGreaterEqThan(Integer uidSt) {
            this.uidSt = uidSt;
            return this;
        }

        public QueryBuilder uidLessEqThan(Integer uidEd) {
            this.uidEd = uidEd;
            return this;
        }


        public QueryBuilder uid(Integer uid) {
            setUid(uid);
            return this;
        }

        public QueryBuilder uidList(Integer... uid) {
            this.uidList = solveNullList(uid);
            return this;
        }

        public QueryBuilder uidList(List<Integer> uid) {
            this.uidList = uid;
            return this;
        }

        public QueryBuilder fetchUid() {
            setFetchFields("fetchFields", "uid");
            return this;
        }

        public QueryBuilder excludeUid() {
            setFetchFields("excludeFields", "uid");
            return this;
        }

        public QueryBuilder fuzzyUserName(List<String> fuzzyUserName) {
            this.fuzzyUserName = fuzzyUserName;
            return this;
        }

        public QueryBuilder fuzzyUserName(String... fuzzyUserName) {
            this.fuzzyUserName = solveNullList(fuzzyUserName);
            return this;
        }

        public QueryBuilder rightFuzzyUserName(List<String> rightFuzzyUserName) {
            this.rightFuzzyUserName = rightFuzzyUserName;
            return this;
        }

        public QueryBuilder rightFuzzyUserName(String... rightFuzzyUserName) {
            this.rightFuzzyUserName = solveNullList(rightFuzzyUserName);
            return this;
        }

        public QueryBuilder userName(String userName) {
            setUserName(userName);
            return this;
        }

        public QueryBuilder userNameList(String... userName) {
            this.userNameList = solveNullList(userName);
            return this;
        }

        public QueryBuilder userNameList(List<String> userName) {
            this.userNameList = userName;
            return this;
        }

        public QueryBuilder fetchUserName() {
            setFetchFields("fetchFields", "userName");
            return this;
        }

        public QueryBuilder excludeUserName() {
            setFetchFields("excludeFields", "userName");
            return this;
        }

        public QueryBuilder fuzzyPassword(List<String> fuzzyPassword) {
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public QueryBuilder fuzzyPassword(String... fuzzyPassword) {
            this.fuzzyPassword = solveNullList(fuzzyPassword);
            return this;
        }

        public QueryBuilder rightFuzzyPassword(List<String> rightFuzzyPassword) {
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public QueryBuilder rightFuzzyPassword(String... rightFuzzyPassword) {
            this.rightFuzzyPassword = solveNullList(rightFuzzyPassword);
            return this;
        }

        public QueryBuilder password(String password) {
            setPassword(password);
            return this;
        }

        public QueryBuilder passwordList(String... password) {
            this.passwordList = solveNullList(password);
            return this;
        }

        public QueryBuilder passwordList(List<String> password) {
            this.passwordList = password;
            return this;
        }

        public QueryBuilder fetchPassword() {
            setFetchFields("fetchFields", "password");
            return this;
        }

        public QueryBuilder excludePassword() {
            setFetchFields("excludeFields", "password");
            return this;
        }

        public QueryBuilder fuzzySex(List<String> fuzzySex) {
            this.fuzzySex = fuzzySex;
            return this;
        }

        public QueryBuilder fuzzySex(String... fuzzySex) {
            this.fuzzySex = solveNullList(fuzzySex);
            return this;
        }

        public QueryBuilder rightFuzzySex(List<String> rightFuzzySex) {
            this.rightFuzzySex = rightFuzzySex;
            return this;
        }

        public QueryBuilder rightFuzzySex(String... rightFuzzySex) {
            this.rightFuzzySex = solveNullList(rightFuzzySex);
            return this;
        }

        public QueryBuilder sex(String sex) {
            setSex(sex);
            return this;
        }

        public QueryBuilder sexList(String... sex) {
            this.sexList = solveNullList(sex);
            return this;
        }

        public QueryBuilder sexList(List<String> sex) {
            this.sexList = sex;
            return this;
        }

        public QueryBuilder fetchSex() {
            setFetchFields("fetchFields", "sex");
            return this;
        }

        public QueryBuilder excludeSex() {
            setFetchFields("excludeFields", "sex");
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

        public QueryBuilder fuzzyEmail(List<String> fuzzyEmail) {
            this.fuzzyEmail = fuzzyEmail;
            return this;
        }

        public QueryBuilder fuzzyEmail(String... fuzzyEmail) {
            this.fuzzyEmail = solveNullList(fuzzyEmail);
            return this;
        }

        public QueryBuilder rightFuzzyEmail(List<String> rightFuzzyEmail) {
            this.rightFuzzyEmail = rightFuzzyEmail;
            return this;
        }

        public QueryBuilder rightFuzzyEmail(String... rightFuzzyEmail) {
            this.rightFuzzyEmail = solveNullList(rightFuzzyEmail);
            return this;
        }

        public QueryBuilder email(String email) {
            setEmail(email);
            return this;
        }

        public QueryBuilder emailList(String... email) {
            this.emailList = solveNullList(email);
            return this;
        }

        public QueryBuilder emailList(List<String> email) {
            this.emailList = email;
            return this;
        }

        public QueryBuilder fetchEmail() {
            setFetchFields("fetchFields", "email");
            return this;
        }

        public QueryBuilder excludeEmail() {
            setFetchFields("excludeFields", "email");
            return this;
        }

        public QueryBuilder registerDateBetWeen(java.time.LocalDateTime registerDateSt, java.time.LocalDateTime registerDateEd) {
            this.registerDateSt = registerDateSt;
            this.registerDateEd = registerDateEd;
            return this;
        }

        public QueryBuilder registerDateGreaterEqThan(java.time.LocalDateTime registerDateSt) {
            this.registerDateSt = registerDateSt;
            return this;
        }

        public QueryBuilder registerDateLessEqThan(java.time.LocalDateTime registerDateEd) {
            this.registerDateEd = registerDateEd;
            return this;
        }


        public QueryBuilder registerDate(java.time.LocalDateTime registerDate) {
            setRegisterDate(registerDate);
            return this;
        }

        public QueryBuilder registerDateList(java.time.LocalDateTime... registerDate) {
            this.registerDateList = solveNullList(registerDate);
            return this;
        }

        public QueryBuilder registerDateList(List<java.time.LocalDateTime> registerDate) {
            this.registerDateList = registerDate;
            return this;
        }

        public QueryBuilder fetchRegisterDate() {
            setFetchFields("fetchFields", "registerDate");
            return this;
        }

        public QueryBuilder excludeRegisterDate() {
            setFetchFields("excludeFields", "registerDate");
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

        public QueryBuilder fuzzyAuthType(List<String> fuzzyAuthType) {
            this.fuzzyAuthType = fuzzyAuthType;
            return this;
        }

        public QueryBuilder fuzzyAuthType(String... fuzzyAuthType) {
            this.fuzzyAuthType = solveNullList(fuzzyAuthType);
            return this;
        }

        public QueryBuilder rightFuzzyAuthType(List<String> rightFuzzyAuthType) {
            this.rightFuzzyAuthType = rightFuzzyAuthType;
            return this;
        }

        public QueryBuilder rightFuzzyAuthType(String... rightFuzzyAuthType) {
            this.rightFuzzyAuthType = solveNullList(rightFuzzyAuthType);
            return this;
        }

        public QueryBuilder authType(String authType) {
            setAuthType(authType);
            return this;
        }

        public QueryBuilder authTypeList(String... authType) {
            this.authTypeList = solveNullList(authType);
            return this;
        }

        public QueryBuilder authTypeList(List<String> authType) {
            this.authTypeList = authType;
            return this;
        }

        public QueryBuilder fetchAuthType() {
            setFetchFields("fetchFields", "authType");
            return this;
        }

        public QueryBuilder excludeAuthType() {
            setFetchFields("excludeFields", "authType");
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

        public User build() {
            return this;
        }
    }


    public static class ConditionBuilder {
        private List<Integer> uidList;

        public List<Integer> getUidList() {
            return this.uidList;
        }

        private Integer uidSt;

        private Integer uidEd;

        public Integer getUidSt() {
            return this.uidSt;
        }

        public Integer getUidEd() {
            return this.uidEd;
        }

        private List<String> userNameList;

        public List<String> getUserNameList() {
            return this.userNameList;
        }


        private List<String> fuzzyUserName;

        public List<String> getFuzzyUserName() {
            return this.fuzzyUserName;
        }

        private List<String> rightFuzzyUserName;

        public List<String> getRightFuzzyUserName() {
            return this.rightFuzzyUserName;
        }

        private List<String> passwordList;

        public List<String> getPasswordList() {
            return this.passwordList;
        }


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword() {
            return this.fuzzyPassword;
        }

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword() {
            return this.rightFuzzyPassword;
        }

        private List<String> sexList;

        public List<String> getSexList() {
            return this.sexList;
        }


        private List<String> fuzzySex;

        public List<String> getFuzzySex() {
            return this.fuzzySex;
        }

        private List<String> rightFuzzySex;

        public List<String> getRightFuzzySex() {
            return this.rightFuzzySex;
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

        private List<String> emailList;

        public List<String> getEmailList() {
            return this.emailList;
        }


        private List<String> fuzzyEmail;

        public List<String> getFuzzyEmail() {
            return this.fuzzyEmail;
        }

        private List<String> rightFuzzyEmail;

        public List<String> getRightFuzzyEmail() {
            return this.rightFuzzyEmail;
        }

        private List<java.time.LocalDateTime> registerDateList;

        public List<java.time.LocalDateTime> getRegisterDateList() {
            return this.registerDateList;
        }

        private java.time.LocalDateTime registerDateSt;

        private java.time.LocalDateTime registerDateEd;

        public java.time.LocalDateTime getRegisterDateSt() {
            return this.registerDateSt;
        }

        public java.time.LocalDateTime getRegisterDateEd() {
            return this.registerDateEd;
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

        private List<String> authTypeList;

        public List<String> getAuthTypeList() {
            return this.authTypeList;
        }


        private List<String> fuzzyAuthType;

        public List<String> getFuzzyAuthType() {
            return this.fuzzyAuthType;
        }

        private List<String> rightFuzzyAuthType;

        public List<String> getRightFuzzyAuthType() {
            return this.rightFuzzyAuthType;
        }

        public ConditionBuilder uidBetWeen(Integer uidSt, Integer uidEd) {
            this.uidSt = uidSt;
            this.uidEd = uidEd;
            return this;
        }

        public ConditionBuilder uidGreaterEqThan(Integer uidSt) {
            this.uidSt = uidSt;
            return this;
        }

        public ConditionBuilder uidLessEqThan(Integer uidEd) {
            this.uidEd = uidEd;
            return this;
        }


        public ConditionBuilder uidList(Integer... uid) {
            this.uidList = solveNullList(uid);
            return this;
        }

        public ConditionBuilder uidList(List<Integer> uid) {
            this.uidList = uid;
            return this;
        }

        public ConditionBuilder fuzzyUserName(List<String> fuzzyUserName) {
            this.fuzzyUserName = fuzzyUserName;
            return this;
        }

        public ConditionBuilder fuzzyUserName(String... fuzzyUserName) {
            this.fuzzyUserName = solveNullList(fuzzyUserName);
            return this;
        }

        public ConditionBuilder rightFuzzyUserName(List<String> rightFuzzyUserName) {
            this.rightFuzzyUserName = rightFuzzyUserName;
            return this;
        }

        public ConditionBuilder rightFuzzyUserName(String... rightFuzzyUserName) {
            this.rightFuzzyUserName = solveNullList(rightFuzzyUserName);
            return this;
        }

        public ConditionBuilder userNameList(String... userName) {
            this.userNameList = solveNullList(userName);
            return this;
        }

        public ConditionBuilder userNameList(List<String> userName) {
            this.userNameList = userName;
            return this;
        }

        public ConditionBuilder fuzzyPassword(List<String> fuzzyPassword) {
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public ConditionBuilder fuzzyPassword(String... fuzzyPassword) {
            this.fuzzyPassword = solveNullList(fuzzyPassword);
            return this;
        }

        public ConditionBuilder rightFuzzyPassword(List<String> rightFuzzyPassword) {
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public ConditionBuilder rightFuzzyPassword(String... rightFuzzyPassword) {
            this.rightFuzzyPassword = solveNullList(rightFuzzyPassword);
            return this;
        }

        public ConditionBuilder passwordList(String... password) {
            this.passwordList = solveNullList(password);
            return this;
        }

        public ConditionBuilder passwordList(List<String> password) {
            this.passwordList = password;
            return this;
        }

        public ConditionBuilder fuzzySex(List<String> fuzzySex) {
            this.fuzzySex = fuzzySex;
            return this;
        }

        public ConditionBuilder fuzzySex(String... fuzzySex) {
            this.fuzzySex = solveNullList(fuzzySex);
            return this;
        }

        public ConditionBuilder rightFuzzySex(List<String> rightFuzzySex) {
            this.rightFuzzySex = rightFuzzySex;
            return this;
        }

        public ConditionBuilder rightFuzzySex(String... rightFuzzySex) {
            this.rightFuzzySex = solveNullList(rightFuzzySex);
            return this;
        }

        public ConditionBuilder sexList(String... sex) {
            this.sexList = solveNullList(sex);
            return this;
        }

        public ConditionBuilder sexList(List<String> sex) {
            this.sexList = sex;
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

        public ConditionBuilder fuzzyEmail(List<String> fuzzyEmail) {
            this.fuzzyEmail = fuzzyEmail;
            return this;
        }

        public ConditionBuilder fuzzyEmail(String... fuzzyEmail) {
            this.fuzzyEmail = solveNullList(fuzzyEmail);
            return this;
        }

        public ConditionBuilder rightFuzzyEmail(List<String> rightFuzzyEmail) {
            this.rightFuzzyEmail = rightFuzzyEmail;
            return this;
        }

        public ConditionBuilder rightFuzzyEmail(String... rightFuzzyEmail) {
            this.rightFuzzyEmail = solveNullList(rightFuzzyEmail);
            return this;
        }

        public ConditionBuilder emailList(String... email) {
            this.emailList = solveNullList(email);
            return this;
        }

        public ConditionBuilder emailList(List<String> email) {
            this.emailList = email;
            return this;
        }

        public ConditionBuilder registerDateBetWeen(java.time.LocalDateTime registerDateSt, java.time.LocalDateTime registerDateEd) {
            this.registerDateSt = registerDateSt;
            this.registerDateEd = registerDateEd;
            return this;
        }

        public ConditionBuilder registerDateGreaterEqThan(java.time.LocalDateTime registerDateSt) {
            this.registerDateSt = registerDateSt;
            return this;
        }

        public ConditionBuilder registerDateLessEqThan(java.time.LocalDateTime registerDateEd) {
            this.registerDateEd = registerDateEd;
            return this;
        }


        public ConditionBuilder registerDateList(java.time.LocalDateTime... registerDate) {
            this.registerDateList = solveNullList(registerDate);
            return this;
        }

        public ConditionBuilder registerDateList(List<java.time.LocalDateTime> registerDate) {
            this.registerDateList = registerDate;
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

        public ConditionBuilder fuzzyAuthType(List<String> fuzzyAuthType) {
            this.fuzzyAuthType = fuzzyAuthType;
            return this;
        }

        public ConditionBuilder fuzzyAuthType(String... fuzzyAuthType) {
            this.fuzzyAuthType = solveNullList(fuzzyAuthType);
            return this;
        }

        public ConditionBuilder rightFuzzyAuthType(List<String> rightFuzzyAuthType) {
            this.rightFuzzyAuthType = rightFuzzyAuthType;
            return this;
        }

        public ConditionBuilder rightFuzzyAuthType(String... rightFuzzyAuthType) {
            this.rightFuzzyAuthType = solveNullList(rightFuzzyAuthType);
            return this;
        }

        public ConditionBuilder authTypeList(String... authType) {
            this.authTypeList = solveNullList(authType);
            return this;
        }

        public ConditionBuilder authTypeList(List<String> authType) {
            this.authTypeList = authType;
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

        private User obj;

        public Builder() {
            this.obj = new User();
        }

        public Builder uid(Integer uid) {
            this.obj.setUid(uid);
            return this;
        }

        public Builder userName(String userName) {
            this.obj.setUserName(userName);
            return this;
        }

        public Builder password(String password) {
            this.obj.setPassword(password);
            return this;
        }

        public Builder sex(String sex) {
            this.obj.setSex(sex);
            return this;
        }

        public Builder phone(String phone) {
            this.obj.setPhone(phone);
            return this;
        }

        public Builder email(String email) {
            this.obj.setEmail(email);
            return this;
        }

        public Builder registerDate(java.time.LocalDateTime registerDate) {
            this.obj.setRegisterDate(registerDate);
            return this;
        }

        public Builder idCard(String idCard) {
            this.obj.setIdCard(idCard);
            return this;
        }

        public Builder authType(String authType) {
            this.obj.setAuthType(authType);
            return this;
        }

        public User build() {
            return obj;
        }
    }

}
