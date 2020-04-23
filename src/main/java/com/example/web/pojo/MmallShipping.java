package com.example.web.pojo;
import java.io.Serializable;
import java.util.*;

/**
*
*  @author SongsongWang
*/
public class MmallShipping implements Serializable {

    private static final long serialVersionUID = 1587233111066L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 用户id
    * isNullAble:1
    */
    private Integer userId;

    /**
    * 收货姓名
    * isNullAble:1
    */
    private String receiverName;

    /**
    * 收货固定电话
    * isNullAble:1
    */
    private String receiverPhone;

    /**
    * 收货移动电话
    * isNullAble:1
    */
    private String receiverMobile;

    /**
    * 省份
    * isNullAble:1
    */
    private String receiverProvince;

    /**
    * 城市
    * isNullAble:1
    */
    private String receiverCity;

    /**
    * 区/县
    * isNullAble:1
    */
    private String receiverDistrict;

    /**
    * 详细地址
    * isNullAble:1
    */
    private String receiverAddress;

    /**
    * 邮编
    * isNullAble:1
    */
    private String receiverZip;

    /**
    * 
    * isNullAble:1
    */
    private Date createTime;

    /**
    * 
    * isNullAble:1
    */
    private Date updateTime;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setUserId(Integer userId){this.userId = userId;}

    public Integer getUserId(){return this.userId;}

    public void setReceiverName(String receiverName){this.receiverName = receiverName;}

    public String getReceiverName(){return this.receiverName;}

    public void setReceiverPhone(String receiverPhone){this.receiverPhone = receiverPhone;}

    public String getReceiverPhone(){return this.receiverPhone;}

    public void setReceiverMobile(String receiverMobile){this.receiverMobile = receiverMobile;}

    public String getReceiverMobile(){return this.receiverMobile;}

    public void setReceiverProvince(String receiverProvince){this.receiverProvince = receiverProvince;}

    public String getReceiverProvince(){return this.receiverProvince;}

    public void setReceiverCity(String receiverCity){this.receiverCity = receiverCity;}

    public String getReceiverCity(){return this.receiverCity;}

    public void setReceiverDistrict(String receiverDistrict){this.receiverDistrict = receiverDistrict;}

    public String getReceiverDistrict(){return this.receiverDistrict;}

    public void setReceiverAddress(String receiverAddress){this.receiverAddress = receiverAddress;}

    public String getReceiverAddress(){return this.receiverAddress;}

    public void setReceiverZip(String receiverZip){this.receiverZip = receiverZip;}

    public String getReceiverZip(){return this.receiverZip;}

    public void setCreateTime(Date createTime){this.createTime = createTime;}

    public Date getCreateTime(){return this.createTime;}

    public void setUpdateTime(Date updateTime){this.updateTime = updateTime;}

    public Date getUpdateTime(){return this.updateTime;}
    @Override
    public String toString() {
        return "MmallShipping{" +
                "id='" + id + '\'' +
                "userId='" + userId + '\'' +
                "receiverName='" + receiverName + '\'' +
                "receiverPhone='" + receiverPhone + '\'' +
                "receiverMobile='" + receiverMobile + '\'' +
                "receiverProvince='" + receiverProvince + '\'' +
                "receiverCity='" + receiverCity + '\'' +
                "receiverDistrict='" + receiverDistrict + '\'' +
                "receiverAddress='" + receiverAddress + '\'' +
                "receiverZip='" + receiverZip + '\'' +
                "createTime='" + createTime + '\'' +
                "updateTime='" + updateTime + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private MmallShipping set;

        private ConditionBuilder where;

        public UpdateBuilder set(MmallShipping set){
            this.set = set;
            return this;
        }

        public MmallShipping getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends MmallShipping{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<Integer> userIdList;

        public List<Integer> getUserIdList(){return this.userIdList;}

        private Integer userIdSt;

        private Integer userIdEd;

        public Integer getUserIdSt(){return this.userIdSt;}

        public Integer getUserIdEd(){return this.userIdEd;}

        private List<String> receiverNameList;

        public List<String> getReceiverNameList(){return this.receiverNameList;}


        private List<String> fuzzyReceiverName;

        public List<String> getFuzzyReceiverName(){return this.fuzzyReceiverName;}

        private List<String> rightFuzzyReceiverName;

        public List<String> getRightFuzzyReceiverName(){return this.rightFuzzyReceiverName;}
        private List<String> receiverPhoneList;

        public List<String> getReceiverPhoneList(){return this.receiverPhoneList;}


        private List<String> fuzzyReceiverPhone;

        public List<String> getFuzzyReceiverPhone(){return this.fuzzyReceiverPhone;}

        private List<String> rightFuzzyReceiverPhone;

        public List<String> getRightFuzzyReceiverPhone(){return this.rightFuzzyReceiverPhone;}
        private List<String> receiverMobileList;

        public List<String> getReceiverMobileList(){return this.receiverMobileList;}


        private List<String> fuzzyReceiverMobile;

        public List<String> getFuzzyReceiverMobile(){return this.fuzzyReceiverMobile;}

        private List<String> rightFuzzyReceiverMobile;

        public List<String> getRightFuzzyReceiverMobile(){return this.rightFuzzyReceiverMobile;}
        private List<String> receiverProvinceList;

        public List<String> getReceiverProvinceList(){return this.receiverProvinceList;}


        private List<String> fuzzyReceiverProvince;

        public List<String> getFuzzyReceiverProvince(){return this.fuzzyReceiverProvince;}

        private List<String> rightFuzzyReceiverProvince;

        public List<String> getRightFuzzyReceiverProvince(){return this.rightFuzzyReceiverProvince;}
        private List<String> receiverCityList;

        public List<String> getReceiverCityList(){return this.receiverCityList;}


        private List<String> fuzzyReceiverCity;

        public List<String> getFuzzyReceiverCity(){return this.fuzzyReceiverCity;}

        private List<String> rightFuzzyReceiverCity;

        public List<String> getRightFuzzyReceiverCity(){return this.rightFuzzyReceiverCity;}
        private List<String> receiverDistrictList;

        public List<String> getReceiverDistrictList(){return this.receiverDistrictList;}


        private List<String> fuzzyReceiverDistrict;

        public List<String> getFuzzyReceiverDistrict(){return this.fuzzyReceiverDistrict;}

        private List<String> rightFuzzyReceiverDistrict;

        public List<String> getRightFuzzyReceiverDistrict(){return this.rightFuzzyReceiverDistrict;}
        private List<String> receiverAddressList;

        public List<String> getReceiverAddressList(){return this.receiverAddressList;}


        private List<String> fuzzyReceiverAddress;

        public List<String> getFuzzyReceiverAddress(){return this.fuzzyReceiverAddress;}

        private List<String> rightFuzzyReceiverAddress;

        public List<String> getRightFuzzyReceiverAddress(){return this.rightFuzzyReceiverAddress;}
        private List<String> receiverZipList;

        public List<String> getReceiverZipList(){return this.receiverZipList;}


        private List<String> fuzzyReceiverZip;

        public List<String> getFuzzyReceiverZip(){return this.fuzzyReceiverZip;}

        private List<String> rightFuzzyReceiverZip;

        public List<String> getRightFuzzyReceiverZip(){return this.rightFuzzyReceiverZip;}
        private List<Date> createTimeList;

        public List<Date> getCreateTimeList(){return this.createTimeList;}

        private Date createTimeSt;

        private Date createTimeEd;

        public Date getCreateTimeSt(){return this.createTimeSt;}

        public Date getCreateTimeEd(){return this.createTimeEd;}

        private List<Date> updateTimeList;

        public List<Date> getUpdateTimeList(){return this.updateTimeList;}

        private Date updateTimeSt;

        private Date updateTimeEd;

        public Date getUpdateTimeSt(){return this.updateTimeSt;}

        public Date getUpdateTimeEd(){return this.updateTimeEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Integer id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder userIdBetWeen(Integer userIdSt,Integer userIdEd){
            this.userIdSt = userIdSt;
            this.userIdEd = userIdEd;
            return this;
        }

        public QueryBuilder userIdGreaterEqThan(Integer userIdSt){
            this.userIdSt = userIdSt;
            return this;
        }
        public QueryBuilder userIdLessEqThan(Integer userIdEd){
            this.userIdEd = userIdEd;
            return this;
        }


        public QueryBuilder userId(Integer userId){
            setUserId(userId);
            return this;
        }

        public QueryBuilder userIdList(Integer ... userId){
            this.userIdList = solveNullList(userId);
            return this;
        }

        public QueryBuilder userIdList(List<Integer> userId){
            this.userIdList = userId;
            return this;
        }

        public QueryBuilder fetchUserId(){
            setFetchFields("fetchFields","userId");
            return this;
        }

        public QueryBuilder excludeUserId(){
            setFetchFields("excludeFields","userId");
            return this;
        }

        public QueryBuilder fuzzyReceiverName (List<String> fuzzyReceiverName){
            this.fuzzyReceiverName = fuzzyReceiverName;
            return this;
        }

        public QueryBuilder fuzzyReceiverName (String ... fuzzyReceiverName){
            this.fuzzyReceiverName = solveNullList(fuzzyReceiverName);
            return this;
        }

        public QueryBuilder rightFuzzyReceiverName (List<String> rightFuzzyReceiverName){
            this.rightFuzzyReceiverName = rightFuzzyReceiverName;
            return this;
        }

        public QueryBuilder rightFuzzyReceiverName (String ... rightFuzzyReceiverName){
            this.rightFuzzyReceiverName = solveNullList(rightFuzzyReceiverName);
            return this;
        }

        public QueryBuilder receiverName(String receiverName){
            setReceiverName(receiverName);
            return this;
        }

        public QueryBuilder receiverNameList(String ... receiverName){
            this.receiverNameList = solveNullList(receiverName);
            return this;
        }

        public QueryBuilder receiverNameList(List<String> receiverName){
            this.receiverNameList = receiverName;
            return this;
        }

        public QueryBuilder fetchReceiverName(){
            setFetchFields("fetchFields","receiverName");
            return this;
        }

        public QueryBuilder excludeReceiverName(){
            setFetchFields("excludeFields","receiverName");
            return this;
        }

        public QueryBuilder fuzzyReceiverPhone (List<String> fuzzyReceiverPhone){
            this.fuzzyReceiverPhone = fuzzyReceiverPhone;
            return this;
        }

        public QueryBuilder fuzzyReceiverPhone (String ... fuzzyReceiverPhone){
            this.fuzzyReceiverPhone = solveNullList(fuzzyReceiverPhone);
            return this;
        }

        public QueryBuilder rightFuzzyReceiverPhone (List<String> rightFuzzyReceiverPhone){
            this.rightFuzzyReceiverPhone = rightFuzzyReceiverPhone;
            return this;
        }

        public QueryBuilder rightFuzzyReceiverPhone (String ... rightFuzzyReceiverPhone){
            this.rightFuzzyReceiverPhone = solveNullList(rightFuzzyReceiverPhone);
            return this;
        }

        public QueryBuilder receiverPhone(String receiverPhone){
            setReceiverPhone(receiverPhone);
            return this;
        }

        public QueryBuilder receiverPhoneList(String ... receiverPhone){
            this.receiverPhoneList = solveNullList(receiverPhone);
            return this;
        }

        public QueryBuilder receiverPhoneList(List<String> receiverPhone){
            this.receiverPhoneList = receiverPhone;
            return this;
        }

        public QueryBuilder fetchReceiverPhone(){
            setFetchFields("fetchFields","receiverPhone");
            return this;
        }

        public QueryBuilder excludeReceiverPhone(){
            setFetchFields("excludeFields","receiverPhone");
            return this;
        }

        public QueryBuilder fuzzyReceiverMobile (List<String> fuzzyReceiverMobile){
            this.fuzzyReceiverMobile = fuzzyReceiverMobile;
            return this;
        }

        public QueryBuilder fuzzyReceiverMobile (String ... fuzzyReceiverMobile){
            this.fuzzyReceiverMobile = solveNullList(fuzzyReceiverMobile);
            return this;
        }

        public QueryBuilder rightFuzzyReceiverMobile (List<String> rightFuzzyReceiverMobile){
            this.rightFuzzyReceiverMobile = rightFuzzyReceiverMobile;
            return this;
        }

        public QueryBuilder rightFuzzyReceiverMobile (String ... rightFuzzyReceiverMobile){
            this.rightFuzzyReceiverMobile = solveNullList(rightFuzzyReceiverMobile);
            return this;
        }

        public QueryBuilder receiverMobile(String receiverMobile){
            setReceiverMobile(receiverMobile);
            return this;
        }

        public QueryBuilder receiverMobileList(String ... receiverMobile){
            this.receiverMobileList = solveNullList(receiverMobile);
            return this;
        }

        public QueryBuilder receiverMobileList(List<String> receiverMobile){
            this.receiverMobileList = receiverMobile;
            return this;
        }

        public QueryBuilder fetchReceiverMobile(){
            setFetchFields("fetchFields","receiverMobile");
            return this;
        }

        public QueryBuilder excludeReceiverMobile(){
            setFetchFields("excludeFields","receiverMobile");
            return this;
        }

        public QueryBuilder fuzzyReceiverProvince (List<String> fuzzyReceiverProvince){
            this.fuzzyReceiverProvince = fuzzyReceiverProvince;
            return this;
        }

        public QueryBuilder fuzzyReceiverProvince (String ... fuzzyReceiverProvince){
            this.fuzzyReceiverProvince = solveNullList(fuzzyReceiverProvince);
            return this;
        }

        public QueryBuilder rightFuzzyReceiverProvince (List<String> rightFuzzyReceiverProvince){
            this.rightFuzzyReceiverProvince = rightFuzzyReceiverProvince;
            return this;
        }

        public QueryBuilder rightFuzzyReceiverProvince (String ... rightFuzzyReceiverProvince){
            this.rightFuzzyReceiverProvince = solveNullList(rightFuzzyReceiverProvince);
            return this;
        }

        public QueryBuilder receiverProvince(String receiverProvince){
            setReceiverProvince(receiverProvince);
            return this;
        }

        public QueryBuilder receiverProvinceList(String ... receiverProvince){
            this.receiverProvinceList = solveNullList(receiverProvince);
            return this;
        }

        public QueryBuilder receiverProvinceList(List<String> receiverProvince){
            this.receiverProvinceList = receiverProvince;
            return this;
        }

        public QueryBuilder fetchReceiverProvince(){
            setFetchFields("fetchFields","receiverProvince");
            return this;
        }

        public QueryBuilder excludeReceiverProvince(){
            setFetchFields("excludeFields","receiverProvince");
            return this;
        }

        public QueryBuilder fuzzyReceiverCity (List<String> fuzzyReceiverCity){
            this.fuzzyReceiverCity = fuzzyReceiverCity;
            return this;
        }

        public QueryBuilder fuzzyReceiverCity (String ... fuzzyReceiverCity){
            this.fuzzyReceiverCity = solveNullList(fuzzyReceiverCity);
            return this;
        }

        public QueryBuilder rightFuzzyReceiverCity (List<String> rightFuzzyReceiverCity){
            this.rightFuzzyReceiverCity = rightFuzzyReceiverCity;
            return this;
        }

        public QueryBuilder rightFuzzyReceiverCity (String ... rightFuzzyReceiverCity){
            this.rightFuzzyReceiverCity = solveNullList(rightFuzzyReceiverCity);
            return this;
        }

        public QueryBuilder receiverCity(String receiverCity){
            setReceiverCity(receiverCity);
            return this;
        }

        public QueryBuilder receiverCityList(String ... receiverCity){
            this.receiverCityList = solveNullList(receiverCity);
            return this;
        }

        public QueryBuilder receiverCityList(List<String> receiverCity){
            this.receiverCityList = receiverCity;
            return this;
        }

        public QueryBuilder fetchReceiverCity(){
            setFetchFields("fetchFields","receiverCity");
            return this;
        }

        public QueryBuilder excludeReceiverCity(){
            setFetchFields("excludeFields","receiverCity");
            return this;
        }

        public QueryBuilder fuzzyReceiverDistrict (List<String> fuzzyReceiverDistrict){
            this.fuzzyReceiverDistrict = fuzzyReceiverDistrict;
            return this;
        }

        public QueryBuilder fuzzyReceiverDistrict (String ... fuzzyReceiverDistrict){
            this.fuzzyReceiverDistrict = solveNullList(fuzzyReceiverDistrict);
            return this;
        }

        public QueryBuilder rightFuzzyReceiverDistrict (List<String> rightFuzzyReceiverDistrict){
            this.rightFuzzyReceiverDistrict = rightFuzzyReceiverDistrict;
            return this;
        }

        public QueryBuilder rightFuzzyReceiverDistrict (String ... rightFuzzyReceiverDistrict){
            this.rightFuzzyReceiverDistrict = solveNullList(rightFuzzyReceiverDistrict);
            return this;
        }

        public QueryBuilder receiverDistrict(String receiverDistrict){
            setReceiverDistrict(receiverDistrict);
            return this;
        }

        public QueryBuilder receiverDistrictList(String ... receiverDistrict){
            this.receiverDistrictList = solveNullList(receiverDistrict);
            return this;
        }

        public QueryBuilder receiverDistrictList(List<String> receiverDistrict){
            this.receiverDistrictList = receiverDistrict;
            return this;
        }

        public QueryBuilder fetchReceiverDistrict(){
            setFetchFields("fetchFields","receiverDistrict");
            return this;
        }

        public QueryBuilder excludeReceiverDistrict(){
            setFetchFields("excludeFields","receiverDistrict");
            return this;
        }

        public QueryBuilder fuzzyReceiverAddress (List<String> fuzzyReceiverAddress){
            this.fuzzyReceiverAddress = fuzzyReceiverAddress;
            return this;
        }

        public QueryBuilder fuzzyReceiverAddress (String ... fuzzyReceiverAddress){
            this.fuzzyReceiverAddress = solveNullList(fuzzyReceiverAddress);
            return this;
        }

        public QueryBuilder rightFuzzyReceiverAddress (List<String> rightFuzzyReceiverAddress){
            this.rightFuzzyReceiverAddress = rightFuzzyReceiverAddress;
            return this;
        }

        public QueryBuilder rightFuzzyReceiverAddress (String ... rightFuzzyReceiverAddress){
            this.rightFuzzyReceiverAddress = solveNullList(rightFuzzyReceiverAddress);
            return this;
        }

        public QueryBuilder receiverAddress(String receiverAddress){
            setReceiverAddress(receiverAddress);
            return this;
        }

        public QueryBuilder receiverAddressList(String ... receiverAddress){
            this.receiverAddressList = solveNullList(receiverAddress);
            return this;
        }

        public QueryBuilder receiverAddressList(List<String> receiverAddress){
            this.receiverAddressList = receiverAddress;
            return this;
        }

        public QueryBuilder fetchReceiverAddress(){
            setFetchFields("fetchFields","receiverAddress");
            return this;
        }

        public QueryBuilder excludeReceiverAddress(){
            setFetchFields("excludeFields","receiverAddress");
            return this;
        }

        public QueryBuilder fuzzyReceiverZip (List<String> fuzzyReceiverZip){
            this.fuzzyReceiverZip = fuzzyReceiverZip;
            return this;
        }

        public QueryBuilder fuzzyReceiverZip (String ... fuzzyReceiverZip){
            this.fuzzyReceiverZip = solveNullList(fuzzyReceiverZip);
            return this;
        }

        public QueryBuilder rightFuzzyReceiverZip (List<String> rightFuzzyReceiverZip){
            this.rightFuzzyReceiverZip = rightFuzzyReceiverZip;
            return this;
        }

        public QueryBuilder rightFuzzyReceiverZip (String ... rightFuzzyReceiverZip){
            this.rightFuzzyReceiverZip = solveNullList(rightFuzzyReceiverZip);
            return this;
        }

        public QueryBuilder receiverZip(String receiverZip){
            setReceiverZip(receiverZip);
            return this;
        }

        public QueryBuilder receiverZipList(String ... receiverZip){
            this.receiverZipList = solveNullList(receiverZip);
            return this;
        }

        public QueryBuilder receiverZipList(List<String> receiverZip){
            this.receiverZipList = receiverZip;
            return this;
        }

        public QueryBuilder fetchReceiverZip(){
            setFetchFields("fetchFields","receiverZip");
            return this;
        }

        public QueryBuilder excludeReceiverZip(){
            setFetchFields("excludeFields","receiverZip");
            return this;
        }

        public QueryBuilder createTimeBetWeen(Date createTimeSt,Date createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public QueryBuilder createTimeGreaterEqThan(Date createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public QueryBuilder createTimeLessEqThan(Date createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public QueryBuilder createTime(Date createTime){
            setCreateTime(createTime);
            return this;
        }

        public QueryBuilder createTimeList(Date ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public QueryBuilder createTimeList(List<Date> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public QueryBuilder fetchCreateTime(){
            setFetchFields("fetchFields","createTime");
            return this;
        }

        public QueryBuilder excludeCreateTime(){
            setFetchFields("excludeFields","createTime");
            return this;
        }

        public QueryBuilder updateTimeBetWeen(Date updateTimeSt,Date updateTimeEd){
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public QueryBuilder updateTimeGreaterEqThan(Date updateTimeSt){
            this.updateTimeSt = updateTimeSt;
            return this;
        }
        public QueryBuilder updateTimeLessEqThan(Date updateTimeEd){
            this.updateTimeEd = updateTimeEd;
            return this;
        }


        public QueryBuilder updateTime(Date updateTime){
            setUpdateTime(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(Date ... updateTime){
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(List<Date> updateTime){
            this.updateTimeList = updateTime;
            return this;
        }

        public QueryBuilder fetchUpdateTime(){
            setFetchFields("fetchFields","updateTime");
            return this;
        }

        public QueryBuilder excludeUpdateTime(){
            setFetchFields("excludeFields","updateTime");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public MmallShipping build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<Integer> userIdList;

        public List<Integer> getUserIdList(){return this.userIdList;}

        private Integer userIdSt;

        private Integer userIdEd;

        public Integer getUserIdSt(){return this.userIdSt;}

        public Integer getUserIdEd(){return this.userIdEd;}

        private List<String> receiverNameList;

        public List<String> getReceiverNameList(){return this.receiverNameList;}


        private List<String> fuzzyReceiverName;

        public List<String> getFuzzyReceiverName(){return this.fuzzyReceiverName;}

        private List<String> rightFuzzyReceiverName;

        public List<String> getRightFuzzyReceiverName(){return this.rightFuzzyReceiverName;}
        private List<String> receiverPhoneList;

        public List<String> getReceiverPhoneList(){return this.receiverPhoneList;}


        private List<String> fuzzyReceiverPhone;

        public List<String> getFuzzyReceiverPhone(){return this.fuzzyReceiverPhone;}

        private List<String> rightFuzzyReceiverPhone;

        public List<String> getRightFuzzyReceiverPhone(){return this.rightFuzzyReceiverPhone;}
        private List<String> receiverMobileList;

        public List<String> getReceiverMobileList(){return this.receiverMobileList;}


        private List<String> fuzzyReceiverMobile;

        public List<String> getFuzzyReceiverMobile(){return this.fuzzyReceiverMobile;}

        private List<String> rightFuzzyReceiverMobile;

        public List<String> getRightFuzzyReceiverMobile(){return this.rightFuzzyReceiverMobile;}
        private List<String> receiverProvinceList;

        public List<String> getReceiverProvinceList(){return this.receiverProvinceList;}


        private List<String> fuzzyReceiverProvince;

        public List<String> getFuzzyReceiverProvince(){return this.fuzzyReceiverProvince;}

        private List<String> rightFuzzyReceiverProvince;

        public List<String> getRightFuzzyReceiverProvince(){return this.rightFuzzyReceiverProvince;}
        private List<String> receiverCityList;

        public List<String> getReceiverCityList(){return this.receiverCityList;}


        private List<String> fuzzyReceiverCity;

        public List<String> getFuzzyReceiverCity(){return this.fuzzyReceiverCity;}

        private List<String> rightFuzzyReceiverCity;

        public List<String> getRightFuzzyReceiverCity(){return this.rightFuzzyReceiverCity;}
        private List<String> receiverDistrictList;

        public List<String> getReceiverDistrictList(){return this.receiverDistrictList;}


        private List<String> fuzzyReceiverDistrict;

        public List<String> getFuzzyReceiverDistrict(){return this.fuzzyReceiverDistrict;}

        private List<String> rightFuzzyReceiverDistrict;

        public List<String> getRightFuzzyReceiverDistrict(){return this.rightFuzzyReceiverDistrict;}
        private List<String> receiverAddressList;

        public List<String> getReceiverAddressList(){return this.receiverAddressList;}


        private List<String> fuzzyReceiverAddress;

        public List<String> getFuzzyReceiverAddress(){return this.fuzzyReceiverAddress;}

        private List<String> rightFuzzyReceiverAddress;

        public List<String> getRightFuzzyReceiverAddress(){return this.rightFuzzyReceiverAddress;}
        private List<String> receiverZipList;

        public List<String> getReceiverZipList(){return this.receiverZipList;}


        private List<String> fuzzyReceiverZip;

        public List<String> getFuzzyReceiverZip(){return this.fuzzyReceiverZip;}

        private List<String> rightFuzzyReceiverZip;

        public List<String> getRightFuzzyReceiverZip(){return this.rightFuzzyReceiverZip;}
        private List<Date> createTimeList;

        public List<Date> getCreateTimeList(){return this.createTimeList;}

        private Date createTimeSt;

        private Date createTimeEd;

        public Date getCreateTimeSt(){return this.createTimeSt;}

        public Date getCreateTimeEd(){return this.createTimeEd;}

        private List<Date> updateTimeList;

        public List<Date> getUpdateTimeList(){return this.updateTimeList;}

        private Date updateTimeSt;

        private Date updateTimeEd;

        public Date getUpdateTimeSt(){return this.updateTimeSt;}

        public Date getUpdateTimeEd(){return this.updateTimeEd;}


        public ConditionBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder userIdBetWeen(Integer userIdSt,Integer userIdEd){
            this.userIdSt = userIdSt;
            this.userIdEd = userIdEd;
            return this;
        }

        public ConditionBuilder userIdGreaterEqThan(Integer userIdSt){
            this.userIdSt = userIdSt;
            return this;
        }
        public ConditionBuilder userIdLessEqThan(Integer userIdEd){
            this.userIdEd = userIdEd;
            return this;
        }


        public ConditionBuilder userIdList(Integer ... userId){
            this.userIdList = solveNullList(userId);
            return this;
        }

        public ConditionBuilder userIdList(List<Integer> userId){
            this.userIdList = userId;
            return this;
        }

        public ConditionBuilder fuzzyReceiverName (List<String> fuzzyReceiverName){
            this.fuzzyReceiverName = fuzzyReceiverName;
            return this;
        }

        public ConditionBuilder fuzzyReceiverName (String ... fuzzyReceiverName){
            this.fuzzyReceiverName = solveNullList(fuzzyReceiverName);
            return this;
        }

        public ConditionBuilder rightFuzzyReceiverName (List<String> rightFuzzyReceiverName){
            this.rightFuzzyReceiverName = rightFuzzyReceiverName;
            return this;
        }

        public ConditionBuilder rightFuzzyReceiverName (String ... rightFuzzyReceiverName){
            this.rightFuzzyReceiverName = solveNullList(rightFuzzyReceiverName);
            return this;
        }

        public ConditionBuilder receiverNameList(String ... receiverName){
            this.receiverNameList = solveNullList(receiverName);
            return this;
        }

        public ConditionBuilder receiverNameList(List<String> receiverName){
            this.receiverNameList = receiverName;
            return this;
        }

        public ConditionBuilder fuzzyReceiverPhone (List<String> fuzzyReceiverPhone){
            this.fuzzyReceiverPhone = fuzzyReceiverPhone;
            return this;
        }

        public ConditionBuilder fuzzyReceiverPhone (String ... fuzzyReceiverPhone){
            this.fuzzyReceiverPhone = solveNullList(fuzzyReceiverPhone);
            return this;
        }

        public ConditionBuilder rightFuzzyReceiverPhone (List<String> rightFuzzyReceiverPhone){
            this.rightFuzzyReceiverPhone = rightFuzzyReceiverPhone;
            return this;
        }

        public ConditionBuilder rightFuzzyReceiverPhone (String ... rightFuzzyReceiverPhone){
            this.rightFuzzyReceiverPhone = solveNullList(rightFuzzyReceiverPhone);
            return this;
        }

        public ConditionBuilder receiverPhoneList(String ... receiverPhone){
            this.receiverPhoneList = solveNullList(receiverPhone);
            return this;
        }

        public ConditionBuilder receiverPhoneList(List<String> receiverPhone){
            this.receiverPhoneList = receiverPhone;
            return this;
        }

        public ConditionBuilder fuzzyReceiverMobile (List<String> fuzzyReceiverMobile){
            this.fuzzyReceiverMobile = fuzzyReceiverMobile;
            return this;
        }

        public ConditionBuilder fuzzyReceiverMobile (String ... fuzzyReceiverMobile){
            this.fuzzyReceiverMobile = solveNullList(fuzzyReceiverMobile);
            return this;
        }

        public ConditionBuilder rightFuzzyReceiverMobile (List<String> rightFuzzyReceiverMobile){
            this.rightFuzzyReceiverMobile = rightFuzzyReceiverMobile;
            return this;
        }

        public ConditionBuilder rightFuzzyReceiverMobile (String ... rightFuzzyReceiverMobile){
            this.rightFuzzyReceiverMobile = solveNullList(rightFuzzyReceiverMobile);
            return this;
        }

        public ConditionBuilder receiverMobileList(String ... receiverMobile){
            this.receiverMobileList = solveNullList(receiverMobile);
            return this;
        }

        public ConditionBuilder receiverMobileList(List<String> receiverMobile){
            this.receiverMobileList = receiverMobile;
            return this;
        }

        public ConditionBuilder fuzzyReceiverProvince (List<String> fuzzyReceiverProvince){
            this.fuzzyReceiverProvince = fuzzyReceiverProvince;
            return this;
        }

        public ConditionBuilder fuzzyReceiverProvince (String ... fuzzyReceiverProvince){
            this.fuzzyReceiverProvince = solveNullList(fuzzyReceiverProvince);
            return this;
        }

        public ConditionBuilder rightFuzzyReceiverProvince (List<String> rightFuzzyReceiverProvince){
            this.rightFuzzyReceiverProvince = rightFuzzyReceiverProvince;
            return this;
        }

        public ConditionBuilder rightFuzzyReceiverProvince (String ... rightFuzzyReceiverProvince){
            this.rightFuzzyReceiverProvince = solveNullList(rightFuzzyReceiverProvince);
            return this;
        }

        public ConditionBuilder receiverProvinceList(String ... receiverProvince){
            this.receiverProvinceList = solveNullList(receiverProvince);
            return this;
        }

        public ConditionBuilder receiverProvinceList(List<String> receiverProvince){
            this.receiverProvinceList = receiverProvince;
            return this;
        }

        public ConditionBuilder fuzzyReceiverCity (List<String> fuzzyReceiverCity){
            this.fuzzyReceiverCity = fuzzyReceiverCity;
            return this;
        }

        public ConditionBuilder fuzzyReceiverCity (String ... fuzzyReceiverCity){
            this.fuzzyReceiverCity = solveNullList(fuzzyReceiverCity);
            return this;
        }

        public ConditionBuilder rightFuzzyReceiverCity (List<String> rightFuzzyReceiverCity){
            this.rightFuzzyReceiverCity = rightFuzzyReceiverCity;
            return this;
        }

        public ConditionBuilder rightFuzzyReceiverCity (String ... rightFuzzyReceiverCity){
            this.rightFuzzyReceiverCity = solveNullList(rightFuzzyReceiverCity);
            return this;
        }

        public ConditionBuilder receiverCityList(String ... receiverCity){
            this.receiverCityList = solveNullList(receiverCity);
            return this;
        }

        public ConditionBuilder receiverCityList(List<String> receiverCity){
            this.receiverCityList = receiverCity;
            return this;
        }

        public ConditionBuilder fuzzyReceiverDistrict (List<String> fuzzyReceiverDistrict){
            this.fuzzyReceiverDistrict = fuzzyReceiverDistrict;
            return this;
        }

        public ConditionBuilder fuzzyReceiverDistrict (String ... fuzzyReceiverDistrict){
            this.fuzzyReceiverDistrict = solveNullList(fuzzyReceiverDistrict);
            return this;
        }

        public ConditionBuilder rightFuzzyReceiverDistrict (List<String> rightFuzzyReceiverDistrict){
            this.rightFuzzyReceiverDistrict = rightFuzzyReceiverDistrict;
            return this;
        }

        public ConditionBuilder rightFuzzyReceiverDistrict (String ... rightFuzzyReceiverDistrict){
            this.rightFuzzyReceiverDistrict = solveNullList(rightFuzzyReceiverDistrict);
            return this;
        }

        public ConditionBuilder receiverDistrictList(String ... receiverDistrict){
            this.receiverDistrictList = solveNullList(receiverDistrict);
            return this;
        }

        public ConditionBuilder receiverDistrictList(List<String> receiverDistrict){
            this.receiverDistrictList = receiverDistrict;
            return this;
        }

        public ConditionBuilder fuzzyReceiverAddress (List<String> fuzzyReceiverAddress){
            this.fuzzyReceiverAddress = fuzzyReceiverAddress;
            return this;
        }

        public ConditionBuilder fuzzyReceiverAddress (String ... fuzzyReceiverAddress){
            this.fuzzyReceiverAddress = solveNullList(fuzzyReceiverAddress);
            return this;
        }

        public ConditionBuilder rightFuzzyReceiverAddress (List<String> rightFuzzyReceiverAddress){
            this.rightFuzzyReceiverAddress = rightFuzzyReceiverAddress;
            return this;
        }

        public ConditionBuilder rightFuzzyReceiverAddress (String ... rightFuzzyReceiverAddress){
            this.rightFuzzyReceiverAddress = solveNullList(rightFuzzyReceiverAddress);
            return this;
        }

        public ConditionBuilder receiverAddressList(String ... receiverAddress){
            this.receiverAddressList = solveNullList(receiverAddress);
            return this;
        }

        public ConditionBuilder receiverAddressList(List<String> receiverAddress){
            this.receiverAddressList = receiverAddress;
            return this;
        }

        public ConditionBuilder fuzzyReceiverZip (List<String> fuzzyReceiverZip){
            this.fuzzyReceiverZip = fuzzyReceiverZip;
            return this;
        }

        public ConditionBuilder fuzzyReceiverZip (String ... fuzzyReceiverZip){
            this.fuzzyReceiverZip = solveNullList(fuzzyReceiverZip);
            return this;
        }

        public ConditionBuilder rightFuzzyReceiverZip (List<String> rightFuzzyReceiverZip){
            this.rightFuzzyReceiverZip = rightFuzzyReceiverZip;
            return this;
        }

        public ConditionBuilder rightFuzzyReceiverZip (String ... rightFuzzyReceiverZip){
            this.rightFuzzyReceiverZip = solveNullList(rightFuzzyReceiverZip);
            return this;
        }

        public ConditionBuilder receiverZipList(String ... receiverZip){
            this.receiverZipList = solveNullList(receiverZip);
            return this;
        }

        public ConditionBuilder receiverZipList(List<String> receiverZip){
            this.receiverZipList = receiverZip;
            return this;
        }

        public ConditionBuilder createTimeBetWeen(Date createTimeSt,Date createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public ConditionBuilder createTimeGreaterEqThan(Date createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public ConditionBuilder createTimeLessEqThan(Date createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public ConditionBuilder createTimeList(Date ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public ConditionBuilder createTimeList(List<Date> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public ConditionBuilder updateTimeBetWeen(Date updateTimeSt,Date updateTimeEd){
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public ConditionBuilder updateTimeGreaterEqThan(Date updateTimeSt){
            this.updateTimeSt = updateTimeSt;
            return this;
        }
        public ConditionBuilder updateTimeLessEqThan(Date updateTimeEd){
            this.updateTimeEd = updateTimeEd;
            return this;
        }


        public ConditionBuilder updateTimeList(Date ... updateTime){
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public ConditionBuilder updateTimeList(List<Date> updateTime){
            this.updateTimeList = updateTime;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private MmallShipping obj;

        public Builder(){
            this.obj = new MmallShipping();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder userId(Integer userId){
            this.obj.setUserId(userId);
            return this;
        }
        public Builder receiverName(String receiverName){
            this.obj.setReceiverName(receiverName);
            return this;
        }
        public Builder receiverPhone(String receiverPhone){
            this.obj.setReceiverPhone(receiverPhone);
            return this;
        }
        public Builder receiverMobile(String receiverMobile){
            this.obj.setReceiverMobile(receiverMobile);
            return this;
        }
        public Builder receiverProvince(String receiverProvince){
            this.obj.setReceiverProvince(receiverProvince);
            return this;
        }
        public Builder receiverCity(String receiverCity){
            this.obj.setReceiverCity(receiverCity);
            return this;
        }
        public Builder receiverDistrict(String receiverDistrict){
            this.obj.setReceiverDistrict(receiverDistrict);
            return this;
        }
        public Builder receiverAddress(String receiverAddress){
            this.obj.setReceiverAddress(receiverAddress);
            return this;
        }
        public Builder receiverZip(String receiverZip){
            this.obj.setReceiverZip(receiverZip);
            return this;
        }
        public Builder createTime(Date createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public Builder updateTime(Date updateTime){
            this.obj.setUpdateTime(updateTime);
            return this;
        }
        public MmallShipping build(){return obj;}
    }

}
